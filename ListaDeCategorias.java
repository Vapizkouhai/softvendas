package softvendas;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListaDeCategorias extends GrupoDeObjetos implements ControleDeDados{
    private Categoria[] categorias;
    private final java.io.File arquivoCategorias = new java.io.File("categorias.txt");
    
    @Override
    public void atualizarArquivo(){
        
    }
    
    @Override
    public void atualizarSistema(){
        if (arquivoCategorias.canRead()){
            java.util.Scanner scannerReadInfo;
            try {
                categorias = new Categoria[numItensNoArquivo() - 1];
                scannerReadInfo = new java.util.Scanner(arquivoCategorias);
                scannerReadInfo.nextLine();
                int itemAtual = 0;
                while(scannerReadInfo.hasNext()){
                    categorias[itemAtual] = new Categoria(scannerReadInfo.nextLine());
                }    
            } catch (FileNotFoundException ex) {
                Logger.getLogger(RelatorioDeVendas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
