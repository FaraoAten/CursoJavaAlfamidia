package exemplooo;

public class Caneta {

    //Classe para representar um objeto caneta e suas funcionalidades.
    
    //Características da caneta.
    //Representadas por variáveis.
    private String cor;
    private int tamanhoPonta;

    //Funcionalidades da caneta.
    //Representadas por métodos.
    //Método que faz a Caneta escrever.
    public void escrever(String texto) {
        System.out.println("Em "+this.cor+" com ponta tamanho "+this.tamanhoPonta+": "+texto);
    }
    
    //Método que ajusta a cor de tinta da Caneta.
    public void ajustaCor(String cor){
        this.cor = cor;
    }
    
    //Método que ajusta o tamanho da ponta da Caneta.
    public void ajustaTamanhoPonta(int tamanhoPonta){
        this.tamanhoPonta = tamanhoPonta;
    }
}
