package testes;

import java.util.ArrayList;
import java.util.List;
import model.Aluno;

public class TesteArrayList {
    public static void arrayPadrao(){
        System.out.println("O Array padrão tem um número limitado de espaços.");
        Aluno[] array = new Aluno[3];
        System.out.println("\nTamanho do Array criado: "+array.length);
        array[0] = new Aluno("Fulano", "fulano@aluno.com", 21);
        array[1] = new Aluno("Beltrano", "bel@aluno.com", 19);
        array[2] = new Aluno("Outro", "outro@aluno.com", 35);
        System.out.println("\nSegundo aluno cadastrado no Array: "+array[1].getNome());
    }
    
    public static void arraylist(){
        System.out.println("No ArrayList podemos incluir quantos objetos precisarmos, além de nos proporcionar outras diversas facilidades.");
        Aluno a1 = new Aluno("Flávio", "flavio@aluno.com", 21);
        Aluno a2 = new Aluno("Beatriz", "bea@aluno.com", 19);
        Aluno a3 = new Aluno("Otávio", "otto@aluno.com", 35);
        
        List<Aluno> arraylist = new ArrayList<>();
        System.out.println("\nTamanho do ArrayList criado: "+arraylist.size());
        arraylist.add(a1);
        System.out.println("\nTamanho do ArrayList criado, após uma inserção: "+arraylist.size());
        arraylist.add(a2);
        arraylist.add(a3);
        System.out.println("\nTamanho do ArrayList criado, após mais duas inserções: "+arraylist.size());
        
        System.out.println("\nSegundo aluno cadastrado no ArrayList: "+arraylist.get(1).getNome());
        System.out.println("\nTodos os Alunos cadastrados: ");
        imprimirAlunos(arraylist);
    }
    
    private static void imprimirAlunos(List<Aluno> arraylist){
        arraylist.forEach(aluno -> System.out.println(aluno.getNome()));
    }
}
