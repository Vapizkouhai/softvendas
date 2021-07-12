package softvendas;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Clientela extends GrupoDeObjetos implements ControleDeDados{
    private Cliente[] clientesCadastrados;
    private final java.io.File arquivoClientes = new java.io.File("clientes.txt");
    
    @Override
    public void atualizarArquivo(){
        
    }
    
    @Override
    public void atualizarSistema(){
        if (arquivoClientes.canRead()){
            java.util.Scanner scannerReadInfo;
            try {
                clientesCadastrados = new Cliente[numItensNoArquivo() - 1];
                scannerReadInfo = new java.util.Scanner(arquivoClientes);
                scannerReadInfo.nextLine();
                int itemAtual = 0;
                while(scannerReadInfo.hasNext()){
                    clientesCadastrados[itemAtual] = new Cliente(scannerReadInfo.nextLine());
                }    
            } catch (FileNotFoundException ex) {
                Logger.getLogger(RelatorioDeVendas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public String[] idsDeCliente(){
        String[] todosOsIds = new String[clientesCadastrados.length - 1];
        for (int i = 0; i <= todosOsIds.length - 1; ++i){
            todosOsIds[i] = clientesCadastrados[i].getIdentificacao();
        }
        return todosOsIds;
    }
}
