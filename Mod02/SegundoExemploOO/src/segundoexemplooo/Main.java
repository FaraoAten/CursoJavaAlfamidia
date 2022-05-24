package segundoexemplooo;

public class Main {
    public static void main(String[] args) {
       Monitor monitor = new Monitor();//Criação do objeto
       
       //Utilização dos métodos existentes.
       monitor.ligar();
       
       monitor.exibirMensagem("Computador iniciado com sucesso.");
       
       monitor.ajustarResolucao(1280);
       
       monitor.exibirMensagem("Resolução ajustada.");
       
       monitor.ajustarResolucao(1600);
       
       monitor.exibirMensagem("Resolução ajustada.");
       
       monitor.desligar();
    }
}
