package softvendas;

public class Produto extends ElementoDeTransacaoRegistravel implements Printavel{
    private String codigo;
    private String descricao;
    private Categoria categoriaDoProduto;
    private int quantidade;
    private float valor;
    private boolean disponivel;
    
    public Produto(String info){
        
    }
}
