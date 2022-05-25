package terceiroexemplooo;

import javax.swing.JOptionPane;

public class TesteSelecao {
    //Recebe a idade de um atela e informa a categoria
    private String sidade, msg;
    private int idade;
    
    public void demonstrarMetodos(){
        sidade = JOptionPane.showInputDialog("Digite sua idade:");
        idade = Integer.parseInt(sidade);
        
        if(idade < 5 || idade > 70){
            msg = "Parcipação não permitida.";
        }else if(idade >= 5 && idade <= 12){
            msg = "Categoria Infantil.";
        }else if(idade >= 13 && idade <= 20){
            msg = "Categoria Juvenil.";
        }else if(idade >= 21 && idade <= 45){
            msg = "Categoria Adulta.";
        }else{
            msg = "Categoria Master.";
        }
        
        JOptionPane.showMessageDialog(null, msg);
    }
}
