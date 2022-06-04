package excecoes;

public class MinhaExcecao extends Exception {//Para criar uma Exceção ela deve herdar de um classe de exceção.
   //construtor
   public MinhaExcecao(){
       super("Bug da minha exceção");
   }
   
   //Método que retona algum texto de Bug.
   public String getBug(){
       return this.getMessage();
   }
}
