
package sextoexemplooo;
/**
 * Classe que inicializa o sistema.
 * @author Aten
 */
public class Main {
    /**
     * Método Principal
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario func = null;
        
        String nome = Tela.retornaString("Nome:");
        String email = Tela.retornaString("E-mail:");
        String tipo = Tela.retornaString("H - Horista | I - Integral:");
        
        if(tipo.equalsIgnoreCase("H")){
            int qtdHoras = Tela.retornaInt("Quantidade de Horas:");
            double valorHora = Tela.retornaDouble("Valor da Hora:");
            func = new FuncionarioHorista(nome, email, qtdHoras, valorHora);
        }else if(tipo.equalsIgnoreCase("I")){
            double salario = Tela.retornaDouble("Salário Base:");
            func = new FuncionarioIntegral(nome, email, salario);
        }else{
            System.out.println("Tipo Inválido.");
        }
        
        double salario = func.calcularSalario();
        nome = func.getNome();
        Tela.mostraResultado(nome + " seu salário será R$" + salario);
    }    
}
