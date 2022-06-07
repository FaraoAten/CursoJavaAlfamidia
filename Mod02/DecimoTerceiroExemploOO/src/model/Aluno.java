package model;

public class Aluno {
    private String nome, email;
    private Integer idade;
    
    public Aluno(){
        this.nome = "Aluno";
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
}
