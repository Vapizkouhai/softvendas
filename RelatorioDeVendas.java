package softvendas;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RelatorioDeVendas extends GrupoDeObjetos implements ControleDeDados{
    private Venda[] vendasRealizadas;
    private final java.io.File arquivoVendas = new java.io.File("vendas.txt"); 
    
    @Override
    public void atualizarArquivo(){
        
    }
    
    @Override
    public void atualizarSistema(){
        if (arquivoVendas.canRead()){
            java.util.Scanner scannerReadInfo;
            try {
                vendasRealizadas = new Venda[numItensNoArquivo() - 1];
                scannerReadInfo = new java.util.Scanner(arquivoVendas);
                scannerReadInfo.nextLine();
                int itemAtual = 0;
                while(scannerReadInfo.hasNext()){
                    vendasRealizadas[itemAtual] = new Venda(scannerReadInfo.nextLine());
                }    
            } catch (FileNotFoundException ex) {
                Logger.getLogger(RelatorioDeVendas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
