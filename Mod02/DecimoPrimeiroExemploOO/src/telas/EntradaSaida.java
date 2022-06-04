package telas;

import javax.swing.JOptionPane;

public class EntradaSaida {
    
    public static int receberInt(String msg){
        int valor;
        try{
           valor = Integer.parseInt(receberString(msg));            
        }catch(Exception e){
            mostrarMensagem("Digite apenas números inteiros!");
            valor = 0;
        } 
        return valor;
    }
    
    public static double receberDouble(String msg){
        double valor;
        try{
           valor = Double.parseDouble(receberString(msg));            
        }catch(Exception e){
            mostrarMensagem("Digite apenas números!");
            valor = 0;
        } 
        return valor;
    }
    
    public static String receberString(String msg){
        return JOptionPane.showInputDialog(msg);
    }
    
    public static void mostrarMensagem(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
}
