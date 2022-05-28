package setimoexemplooo;

import javax.swing.JOptionPane;

public class EntradaSaida {
    
    public static int receberInt(String msg){
        int valor = Integer.parseInt(receberString(msg));
        return valor;
    }
    
    public static String receberString(String msg){
        return JOptionPane.showInputDialog(msg);
    }
    
    public static void mostrarMensagem(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
}
