package terceiroexemplooo;

import javax.swing.JOptionPane;

public class TesteRepeticao {

    //Recebe dois valores (inicial e final)
    //Retorna os pares, quantia de pares e soma deles.
    private String sinicial, sfinal, resultado;
    private int inicio, fim, soma, qtd;
    
    public TesteRepeticao(){
        resultado = "";
        soma = 0;
        qtd = 0;
    }
    
    public void demonstrarMetodos() {
        sinicial = JOptionPane.showInputDialog("Digite o valor inicial:");
        sfinal = JOptionPane.showInputDialog("Digite o valor final:");
        inicio = Integer.parseInt(sinicial);
        fim = Integer.parseInt(sfinal);

        for (int i = inicio; i <= fim; i++) {
            if (i % 2 == 0) {
                if(i >= fim){
                    resultado += i;
                }else{
                    resultado += i + " - ";
                }
                qtd++;
                soma += i;
            }
        }
        JOptionPane.showMessageDialog(null, "Pares: " + resultado);
        JOptionPane.showMessageDialog(null, "Quantidade de pares: " + qtd);
        JOptionPane.showMessageDialog(null, "Soma dos pares: " + soma);
    }
}
