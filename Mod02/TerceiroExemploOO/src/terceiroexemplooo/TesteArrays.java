package terceiroexemplooo;

import java.util.ArrayList;

public class TesteArrays {
    //Podemos declarar variáveis para comportar mais de um valor (Array).
    private String[] nomes = {"Aten", "João", "Lucas"};//Vetor pré-inicializado
    
    private int[] idades = new int[3];//Vetor vazio.
    
    //Um poucos sobre ArrayList, a evolução do array tradicional
    private ArrayList<String> arraylist = new ArrayList<>();
    
    public void demonstrarMetodos(){
        idades[0] = 20;//Inserindo valores no Array vazio
        idades[1] = 21;
        idades[2] = 22;
        
        System.out.println(nomes[1] + " com idade " + idades[1]);
        
        System.out.println("\n=================================\n");
        
        arraylist.add("Teste");//Adicionando valor no ArrayList (infinito);
        
        System.out.println(arraylist.size());//Retorna a quantia de elementos.
        System.out.println("\n=================================\n");
        System.out.println(arraylist.get(0));//Retorna o elemento presente naquela posição.
        System.out.println("\n=================================\n");
    }
}
