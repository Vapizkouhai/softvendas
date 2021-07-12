package softvendas;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Estoque extends GrupoDeObjetos implements ControleDeDados{
    private Produto[] produtosEmEstoque;
    private final java.io.File arquivoProdutos = new java.io.File("produtos.txt");
    
    @Override
    public void atualizarArquivo(){
        
    }
    
    @Override
    public void atualizarSistema(){
        if (arquivoProdutos.canRead()){
            java.util.Scanner scannerReadInfo;
            try {
                produtosEmEstoque = new Produto[numItensNoArquivo() - 1];
                scannerReadInfo = new java.util.Scanner(arquivoProdutos);
                scannerReadInfo.nextLine();
                int itemAtual = 0;
                while(scannerReadInfo.hasNext()){
                    produtosEmEstoque[itemAtual] = new Produto(scannerReadInfo.nextLine());
                }    
            } catch (FileNotFoundException ex) {
                Logger.getLogger(RelatorioDeVendas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
