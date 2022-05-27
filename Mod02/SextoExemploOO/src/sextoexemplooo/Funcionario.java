package sextoexemplooo;
/**
 * Classe para criação de instâncias tipo Funcionario
 * Classe Pai
 * @author Aten
 */
public class Funcionario {
    private String nome, email;
    
    /**
     * Construtor para objetos da Classe Funcionário.
     * @param nome
     * @param email 
     */
    public Funcionario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    
    public double calcularSalario(){
        return 0.0;
    }
    
    /**
     * Método que retorna o nome do funcionário.
     * @return String
     */
    public String getNome() {
        return nome;
    }
}
