package terceiroexemplooo;

import javax.swing.JOptionPane;

public class TesteRepeticao2 {
    //Recebe um conjunto de dados (nome e idade) de várias pessoas
    //Retorna os dados da pessoa mais jovem.
    private String nome,sidade,resposta,nomeNovo;
    private int idade,idadeNovo,idadeTotal,numeroPessoas;
    private double media;
    
    public TesteRepeticao2(){
        resposta = "sim";
        nomeNovo = "";
        idadeNovo = 1000;
        idadeTotal = 0;
        numeroPessoas = 0;
        media = 0;
    }
    
    public void demonstrarMetodos(){
        while(resposta.equalsIgnoreCase("sim")){
            nome = JOptionPane.showInputDialog("Digite seu nome:");
            sidade = JOptionPane.showInputDialog("Digite sua idade:");
            idade = Integer.parseInt(sidade);
            
            if(idade < idadeNovo){
                idadeNovo = idade;//idade do mais novo
                nomeNovo = nome;//nome do mais novo
            }
            
            idadeTotal += idade;//somador das idades
            numeroPessoas ++;//contador de pessoas
            
            resposta = JOptionPane.showInputDialog("Há mais participantes?");
        }
        
        media = idadeTotal/numeroPessoas;
        JOptionPane.showMessageDialog(null, "Participante mais novo: "+nomeNovo+" - "+idadeNovo+" anos.");
        JOptionPane.showMessageDialog(null, "Media de idade dos participantes: "+media);
    }
}
