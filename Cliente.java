package softvendas;

public class Cliente extends ElementoDeTransacaoRegistravel implements Printavel{
    private String tipoDeDado;
    private String identificacao;
    private String nome;
    private boolean ativo;
    private int quantidadeDeCompras;
    private int quantidadeItensComprados;
    private float valorCompradoTotal;
    
    public Cliente(String info){
        
    }
    
    public String getIdentificacao(){
        return identificacao;
    }
}
