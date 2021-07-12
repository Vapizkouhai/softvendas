package softvendas;

public class Venda extends ElementoDeTransacaoRegistravel implements Printavel{
    private Cliente comprador;
    private Produto[] listaDeCompras;
    private float valorAPagar;
    private String dataEHoraDaTransacao;
    
    public Venda(String info){
        
    }
}
