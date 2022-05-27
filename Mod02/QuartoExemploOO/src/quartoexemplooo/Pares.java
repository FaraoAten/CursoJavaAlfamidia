package quartoexemplooo;

public class Pares {
    public String retornaNumeros(int inicio, int fim){
        if(inicio > fim){
            int aux = inicio;
            inicio = fim;
            fim = aux;
        }
        
        String numeros = "";
        for(int i = inicio; i <= fim; i++){
            if(i % 2 == 0){
                numeros += i + " - ";
            }
        }
        return numeros.substring(0, numeros.length()-2);
    }
}
