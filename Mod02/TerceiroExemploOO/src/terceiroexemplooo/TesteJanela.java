package terceiroexemplooo;

import javax.swing.JOptionPane;

public class TesteJanela {
    private String sidade, msg;
    private int idade;
    
    public void demonstrarMetodos(){
        sidade = JOptionPane.showInputDialog("Digite sua idade:");
        //Sempre virá uma String
        //mas basta fazer a conversão.
        idade = Integer.parseInt(sidade);
        
        if(idade >= 18){
            msg = "Pode beber.";
        }else{
            msg = "Saia do bar.";
        }
        
        //Mostra uma mensagem na janela de diálogo.
        JOptionPane.showMessageDialog(null, msg);
    }    
}
