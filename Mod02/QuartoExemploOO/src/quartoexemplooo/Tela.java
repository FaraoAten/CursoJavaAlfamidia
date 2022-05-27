package quartoexemplooo;

import javax.swing.JOptionPane;

public class Tela {
    //static permite acessar o método pelo nome da classe.
    public static int retornaInt(String msg){
        int inteiro = Integer.parseInt(JOptionPane.showInputDialog(msg));
        return inteiro;
    }
    
    public static void mostraTexto(String resultado){
        JOptionPane.showMessageDialog(null, resultado);
    }
}
