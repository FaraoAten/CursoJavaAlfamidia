package sextoexemplooo;
/**
 * Classe para criação de instâncias tipo FuncionarioIntegral
 * Herda de Funcionario
 * @author Aten
 */
public class FuncionarioIntegral extends Funcionario{
    private double salario;
    
    /**
     * Construtor para objetos da Classe FuncionárioIntegral.
     * @param nome
     * @param email 
     * @param salario
     */
    public FuncionarioIntegral(String nome, String email, double salario) {
        super(nome, email);
        this.salario = salario;
    }
    
    @Override
    public double calcularSalario(){
        return 0.0;
    }
}
