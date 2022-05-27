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
    
    /**
     * Método para realizar o calculo do salário de um funcionário integral
     * @return double
     */
    @Override
    public double calcularSalario(){
        double salarioFinal = this.salario * this.TAXA;
        return salarioFinal;
    }
}
