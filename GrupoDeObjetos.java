package softvendas;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GrupoDeObjetos implements ControleDeDados, Listavel{
    protected ElementoDeTransacaoRegistravel[] objetos;
    protected java.io.File arquivo;
    
    @Override
    public void atualizarArquivo(){
        
    }
    
    @Override
    public void atualizarSistema(){
        
    }
    
    @Override
    public String listar(){
        return "superclasse";
    }
    
    public int numItensNoArquivo(){
        int numeroItens = 0;
        if (arquivo.canRead()){
            java.util.Scanner scannerNumItens;
            try {
                scannerNumItens = new java.util.Scanner(arquivo);
                while(scannerNumItens.hasNext()){
                    ++numeroItens;
                    scannerNumItens.nextLine();
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(GrupoDeObjetos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return numeroItens;
    }
    
    
}
