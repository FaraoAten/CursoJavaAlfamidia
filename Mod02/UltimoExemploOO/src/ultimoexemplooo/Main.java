package ultimoexemplooo;

import dados.Aluno;
import dados.SimulaçãoDeBancoDeDados;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        //buscar os dados dos Alunos
        Set<Aluno> dados = SimulaçãoDeBancoDeDados.selectAlnunos();
        
        //faz um sorteio e pega o nome de algum aluno (nesse caso fixo)
        Aluno sorteado = new Aluno("Carlos");
        
        //contains se utiliza do equals para realizar as comparações, então se não tivessemos sobreescrito o equals ele iria comparar o objeto inteiro e nunca iria dar certo. (nesse caso que foi feito só para exemplificar o uso da sobreescrita do equals)
        if(dados.contains(sorteado)){
            System.out.println("Parabéns "+sorteado.getNome()+", você ganhou!!!");
        }else{ 
            System.out.println("Não foi dessa vez.");
        }
    }    
}
