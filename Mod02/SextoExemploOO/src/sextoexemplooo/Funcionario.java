package sextoexemplooo;
/**
 * Classe Abstrata para servir de modelo para classes que a herdem 
 * e para criação de instâncias tipo Funcionario
 * Classe Pai
 * @author Aten
 */
public abstract class Funcionario { //Apenas classes abstratas podem ter métodos abstratos
    private String nome, email;
    protected final double TAXA = 0.9;
    
    /**
     * Construtor para objetos da Classe Funcionário.
     * @param nome
     * @param email 
     */
    public Funcionario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    
    /**
     * Método abstrato, modelo, para todas as classes herdadas de Funcionario 
     * criarem um método que calcule o salário, obrigatoriamente. 
     * @return double
     */
    public abstract double calcularSalario();
    
    /**
     * Método que retorna o nome do funcionário.
     * @return String
     */
    public String getNome() {
        return nome;
    }
    
    /**
     * Método que altera o nome do funcionário pelo parâmetro recebido.
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método que retorna o email do funcionário.
     * @return String
     */
    public String getEmail() {
        return email;
    }

    /**
     * Método que altera o email do funcionário pelo parâmetro recebido.
     * @param email 
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
