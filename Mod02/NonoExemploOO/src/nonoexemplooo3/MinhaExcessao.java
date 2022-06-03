package nonoexemplooo3;

public class MinhaExcessao extends Exception {//Para criar uma Excessão ela deve herdar de um classe de excessão.
   //construtor
   public MinhaExcessao(){
       super("Bug da minha excessão");
   }
   
   //Método que retona algum texto de Bug.
   public String getBug(){
       return this.getMessage();
   }
}
