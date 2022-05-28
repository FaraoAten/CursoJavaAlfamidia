package OutroExemplo;

import javax.swing.*;

public class TesteJanela {
    public static void main(String[] args){
        TesteInterface janela = new TesteInterface("Minha Janela");
        
        janela.pack();
        
        janela.setVisible(true);
    }
}
