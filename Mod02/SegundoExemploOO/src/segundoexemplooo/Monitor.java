package segundoexemplooo;

/*
Limitadores de acesso:
- public: qualquer um pode acessar diretamente.
- protected: apenas a classe e suas herdeiras podem acessar diretamente.
- private: apenas a classe pode acessar diretamente.
*/

public class Monitor {
    //Atributos do monitor.
    private int resolucao;
    private String tipo, simbolo;
    
    //Construtor - usado para inicializar os dados de um objeto.
    public Monitor(){
        ajustarResolucao(1024);
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
        System.out.println("\n"+this.simbolo);
        System.out.println("Resolução Atual: "+this.resolucao);
        System.out.println(mensagem);
        System.out.println(this.simbolo+"\n");
    }
    
    //Métodos auxiliares para ajustar os atributos.
    public void ajustarResolucao(int resolucao){
        if(resolucao!=1280 && resolucao!=1600){
            this.resolucao = 1024;
        }else{
            this.resolucao = resolucao;
        }
        representarResolucao();
    }
    
    //Método para ajustar o símbolo que representa a resolução
    private void representarResolucao(){
        String simbolo = "";
        int qnt = (int) (this.resolucao/100);
        
        for(int i=0; i<qnt; i++){
           simbolo += "-"; 
        }
        this.simbolo = simbolo;        
    }
}
