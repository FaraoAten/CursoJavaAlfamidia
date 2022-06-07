package dados;

import java.util.Objects;

public class Aluno {
    private String nome, email;
    private Integer idade;
    
    public Aluno(){
        this.nome = "Aluno";
        this.email = "aluno@aluno.com";
        this.idade = 0;
    }
    
    public Aluno(String nome){
        this.nome = nome;
        this.email = "aluno@aluno.com";
        this.idade = 0;
    }

    public Aluno(String nome, String email, Integer idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    
    //Serve para fazer uma pesquisa mais elaborada em relação as consultas em hashs.
    //Aqui por exemplo está sendo criado um HashCode baseado no nome, que será associado ao objeto e tornará mais fácil, rápido e efetivo (performático) o processo de busca por um elemento do conjunto, principalmente em grandes bases de dados.
    //Ideal basear no atributo chave.
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    //Ao sobreescrever o equals podemos definir como que objetos dessa classe serão comparados entre si.
    //Nesse caso serão comparados somente pelo nome.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
    
    
}
