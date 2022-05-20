package segundoexemplooo;

public class Monitor {
    //Atributos do monitor.
    private int resolucao;
    private String tipo;
    
    //Construtor - usado para inicializar os dados de um objeto.
    public Monitor(){
        this.resolucao = 1024;
        this.tipo = "LED";
    }
    
    //Métodos gerais
    //Exibe mensagem na tela quando o computador é ligado.
    public void ligar(){
        System.out.println("Iniciando... ok");
    }
    
    //Exibe mensagem na tela quando o computador é desligado.
    public void desligar(){
        System.out.println("Desligando...");
    }
    
    public void exibirMensagem(String mensagem){
        System.out.println("Resolução Atual: "+this.resolucao);
        System.out.println(mensagem);
    }
    
    //Métodos auxiliares para ajustar os atributos.
    public void ajustarResolucao(int resolucao){
        if(resolucao!=1280 && resolucao!=1600){
            this.resolucao = 1024;
        }else{
            this.resolucao = resolucao;
        }
    }
}
