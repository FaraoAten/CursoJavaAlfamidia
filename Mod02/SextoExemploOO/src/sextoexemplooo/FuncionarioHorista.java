package sextoexemplooo;
/**
 * Classe para criação de instâncias tipo FuncionarioHorista
 * Herda de Funcionario
 * @author Aten
 */
public class FuncionarioHorista extends Funcionario{
    private int qtdHoras;
    private double valorHora;

    /**
     * Construtor para objetos da Classe FuncionárioHorista.
     * @param nome
     * @param email
     * @param qtdHoras
     * @param valorHora 
     */
    public FuncionarioHorista(String nome, String email, int qtdHoras, double valorHora) {
        super(nome, email);
        this.qtdHoras = qtdHoras;
        this.valorHora = valorHora;
    }
    
    @Override
    public double calcularSalario(){
        return 0.0;
    }
}
