package quintoexemplooo;
/**
 * Classe auxiliar para exibição de janelas de diálogo.
 * @author Aten
 */

import javax.swing.JOptionPane;

public class Tela {
    /**
     * Método que abre uma janela de diálogo para receber uma String e converter em double.
     * @param msg
     * @return double
     */
    public static double retornaDouble(String msg){
        double valor = Double.parseDouble(retornaString(msg));
        return valor;
    } 
    
    /**
     * Método que abre uma janela de diálogo para receber uma String.
     * @param msg
     * @return String
     */
    public static String retornaString(String msg){
        return JOptionPane.showInputDialog(msg);
    }
    
    /**
     * Método que abre uma janela de diálogo para exibir uma String informada por parâmetro.
     * @param msg
     */
    public static void mostraResultado(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
}
