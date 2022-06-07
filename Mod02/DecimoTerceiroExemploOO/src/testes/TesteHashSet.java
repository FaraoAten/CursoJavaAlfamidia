package testes;

import java.util.HashSet;
import java.util.Set;
import model.Aluno;

public class TesteHashSet {
    public static void hashset(){
        System.out.println("No HashSet podemos incluir quantos objetos precisarmos, além de nos proporcionar outras diversas facilidades.");
        System.out.println("\nNo entanto, ele não permite a adição de elementos repetidos.");
        Aluno a1 = new Aluno("Carlos", "carlos@aluno.com", 27);
        Aluno a2 = new Aluno("Gabriel", "gabriel@aluno.com", 24);
        Aluno a3 = new Aluno("Pablo", "pablo@aluno.com", 17);
        
        //Set é a interface, HashSet é a classe que implementa.
        Set<Aluno> hashset = new HashSet<>();
        System.out.println("\nTamanho do HashSet criado: "+hashset.size());
        hashset.add(a1);
        System.out.println("\nTamanho do HashSet criado, após uma inserção: "+hashset.size());
        hashset.add(a2);
        hashset.add(a3);
        System.out.println("\nTamanho do HashSet criado, após mais duas inserções: "+hashset.size());
        hashset.add(a3);
        System.out.println("\nTamanho do HashSet criado, após tentar inserir o terceiro elemento novamente: "+hashset.size());
        
        //Não mantém uma ordem de elementos salvos.
        System.out.println("\nTodos os Alunos cadastrados: ");
        imprimirAlunos(hashset);
    }
    
    private static void imprimirAlunos(Set<Aluno> hashset){
        hashset.forEach(aluno -> System.out.println(aluno.getNome()));
    }
}
