package quintoexemplooo;
/**
 * Sistema que faz uma operação aritmética simples.
 * - Recebe dois números e um operador e retorna o resultado.
 * @author Aten
 */
public class Main {
    /**
     * Método principal
     * @param args 
     */
    public static void main(String[] args) {
        double n1 = Tela.retornaDouble("Informe um valor:");
        double n2 = Tela.retornaDouble("Informe outro valor:");
        String operacao = Tela.retornaString("Informe a operação (+, -, *, /):");
        
        double resultado = Calculadora.exe(n1, n2, operacao);
        
        Tela.mostraResultado("Resultado: " + resultado);
    }    
}
