package quintoexemplooo;
/**
 * Classe que representa o processamento aritimético para operações simples.
 * @author Aten
 */

public class Calculadora {
    /**
     * Método que recebe dois valores e um símbolo operacional aritimético 
     * e realiza a devida operação aritimética com os dois valores com base no símbolo recebido.
     * @param n1
     * @param n2
     * @param operacao
     * @return double
     */
    public static double exe(double n1, double n2, String operacao){
        double resultado;
        switch(operacao){
            case "+":
                resultado = n1 + n2;
                break;
            case "-":
                resultado = n1 - n2;
                break;
            case "*":
                resultado = n1 * n2;
                break;
            case "/":
                resultado = n1 / n2;
                break;
            default:
                resultado = 0;
                break;
        }
        
        return resultado;
    }
}
