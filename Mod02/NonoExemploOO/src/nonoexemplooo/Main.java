package nonoexemplooo;

public class Main {
    public static void main(String[] args) {
        int n1 = EntradaSaida.receberInt("Digite um número:");
        int n2 = EntradaSaida.receberInt("Digite outro número:");
        double resultado = 0;
        
        try{ //Tenta executar o programa
            resultado = n1 / n2;
        }catch(Exception e){ //Se houver algum erro de execução o catch captura e faz algo, a ideia é tratar o erro e seguir o programa. Pode haver mais de um catch em sequência, pois o intuito é usar Exceptions específicas em cada um.
            EntradaSaida.mostrarMensagem("Divisão por 0.");
            EntradaSaida.mostrarMensagem(e.getMessage()); //Retorna a mensagem dizendo o que gerou a excessão.
        }
        
        EntradaSaida.mostrarMensagem("Resultado: "+resultado);
    }
}
