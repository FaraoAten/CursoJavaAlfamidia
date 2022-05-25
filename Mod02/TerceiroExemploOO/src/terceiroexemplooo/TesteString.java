package terceiroexemplooo;

public class TesteString {
    //String é uma classe do Java
    //portanto as variáveis são "objetos"...
    
    private String texto1 = "Teste Um";
    private String texto2 = new String("Teste 2");
    
    public void demonstrarMetodos(){
        System.out.println("toUpperCase(): "+texto1.toUpperCase()); //Torna todos caractéres da sentença maiúculos.
        System.out.println("\n=================================\n");
        System.out.println("substring(2, 4): "+texto2.substring(2, 4)); //Gera um recorte da String, com ponto inicial e final - 1 definidos por nós.
        System.out.println("\n=================================\n");
        System.out.println("equals('anfknsa'): "+texto1.equals("anfknsa")); //Faz uma comparação do parametro passado com o conteúdo do objeto que invocou o método retornando um boolean, por String ser um objeto não pode comparar com =, deve usar equals. Existe o equalsIgnoreCase() que não é Case Sensitive.
        System.out.println("\n=================================\n");
        System.out.println("charAt(3): "+texto2.charAt(3)); //Retorna o caracter presente na posição indicada.
        System.out.println("\n=================================\n");
        
        //Declaramos um vetor (array) usando colchetes
        //no Java temos vetores com tipos definidos.
        String[] vetor = texto1.split(" "); //split gera um array da String que o invocou, separando-a com base no parametro passado.
        System.out.println("split(' ') e vetor[0]: "+vetor[0]);
        System.out.println("\n=================================\n");
    }
}
