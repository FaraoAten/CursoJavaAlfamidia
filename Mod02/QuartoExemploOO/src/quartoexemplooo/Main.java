package quartoexemplooo;

public class Main {
    public static void main(String[] args) {
        //Obtém os dados que o usuário informa
        int inicio = Tela.retornaInt("Informe um número inteiro:");
        int fim = Tela.retornaInt("Informe outro número inteiro:");
        
        //Cria o objeto para processamento
        Pares pares = new Pares();
        String resultado = pares.retornaNumeros(inicio, fim);
        
        //Saída com o Resultado
        Tela.mostraTexto(resultado);
    }    
}
