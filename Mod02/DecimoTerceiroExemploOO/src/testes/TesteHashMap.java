package testes;

import java.util.HashMap;
import java.util.Map;
import model.Aluno;

public class TesteHashMap {
    
    public static void hashmap(){
        System.out.println("No HashSet podemos incluir quantos objetos precisarmos, além de nos proporcionar outras diversas facilidades.");
        System.out.println("\nNo entanto, caso tente adicionar um elemento com uma chave já existente, ele vai sobrescrever aquele elemento.");
        System.out.println("\nNo HashMap os elementos são guardados em ordem e são associados a uma chave, um valor com tipo e conteúdo definido por nós na hora da inserção.");
        
        Aluno a1 = new Aluno("Sérgio", "sergio@aluno.com", 42);
        Aluno a2 = new Aluno("Roberta", "ro@aluno.com", 25);
        Aluno a3 = new Aluno("Felipe", "felipe@aluno.com", 30);
        
        //Map é a interface, HashMap é a classe que implementa.
        Map<String, Aluno> hashmap = new HashMap<>();
        System.out.println("\nTamanho do HashSet criado: "+hashmap.size());
        hashmap.put("a1", a1);
        System.out.println("\nTamanho do HashSet criado, após uma inserção: "+hashmap.size());
        hashmap.put("a2", a2);
        hashmap.put("a3", a3);
        System.out.println("\nTamanho do HashSet criado, após mais duas inserções: "+hashmap.size());
        hashmap.put("a3", a3);
        System.out.println("\nTamanho do HashSet criado, após tentar inserir o terceiro elemento novamente com a mesma chave: "+hashmap.size());
        
        //Não mantém uma ordem de elementos salvos.
        System.out.println("\nTodos os Alunos cadastrados: ");
        imprimirAlunos(hashmap);
        
        System.out.println("\nPara pegar uma valor no HashMap procuramos pela chave.");
        System.out.println("\nAluno da chave a2: "+hashmap.get("a2").getNome());
    }
    
    private static void imprimirAlunos(Map<String, Aluno> hashmap){
        //pegando a lista só de valores para iterar.
        for(Aluno aluno: hashmap.values()){
            System.out.println(aluno.getNome());
        }
    }
}
