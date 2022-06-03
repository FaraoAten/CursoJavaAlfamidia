package nonoexemplooo2;

import nonoexemplooo.EntradaSaida;

public class FinallyMain {
    public static void main(String[] args) {
        String sn1, sn2;
        String txt;
        String vet[];
        int i1, i2;
        double res;
        
        try{
            sn1 = EntradaSaida.receberString("Digite um número:");
            sn2 = EntradaSaida.receberString("Digite outro número:");
            txt = EntradaSaida.receberString("Digite um texto com espaços");
            vet = txt.split(" ");
            i1 = Integer.parseInt(sn1);
            i2 = Integer.parseInt(sn2);
            res = i1/i2;
            EntradaSaida.mostrarMensagem(vet[4]+": "+res);
        }catch(ArithmeticException e){
            EntradaSaida.mostrarMensagem(e.getMessage());
        }catch(NumberFormatException e){
            EntradaSaida.mostrarMensagem(e.getMessage());
        }catch(IndexOutOfBoundsException e){
            EntradaSaida.mostrarMensagem(e.getMessage());
        }catch(Exception e){
            EntradaSaida.mostrarMensagem("Bug!");
        }finally{ //É uma função opcional do try catch, ele sempre deve ser o último na corrente e sempre executa. Usado para coisas que devem obrigatóriamente ocorrer, como fechar a conexão com o BD.
            EntradaSaida.mostrarMensagem("Sempre passa aqui.");
        }
    }    
}
