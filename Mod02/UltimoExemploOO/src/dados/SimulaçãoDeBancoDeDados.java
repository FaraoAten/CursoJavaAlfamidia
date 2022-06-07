package dados;

import java.util.HashSet;
import java.util.Set;

public class SimulaçãoDeBancoDeDados {

    public static Set<Aluno> selectAlnunos() {
        //criando ao invés de pegar em um bd.
        Aluno a1 = new Aluno("Carlos", "carlos@aluno.com", 27);
        Aluno a2 = new Aluno("Gabriel", "gabriel@aluno.com", 24);
        Aluno a3 = new Aluno("Pablo", "pablo@aluno.com", 17);
        Aluno a4 = new Aluno("Juan", "juan@aluno.com", 46);
        Aluno a5 = new Aluno("Rodrigo", "rodrigol@aluno.com", 35);
        
        Set<Aluno> setAluno = new HashSet<>();
        setAluno.add(a1);
        setAluno.add(a2);
        setAluno.add(a3);
        setAluno.add(a4);
        setAluno.add(a5);
        
        return setAluno;
    }
}
