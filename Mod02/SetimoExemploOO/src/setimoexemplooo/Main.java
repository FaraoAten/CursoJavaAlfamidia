package setimoexemplooo;

public class Main {
    public static void main(String[] args) {
       String resposta = "sim";
       int opcao = 0;
       
       while(resposta.equalsIgnoreCase("sim")){
           opcao = EntradaSaida.receberInt("1 - Cadastro | 2 - Pesquisa | 3 - Limite :");
           switch(opcao){
               case 1:
                   Sistema.cadastrarCliente();
                   break;
               case 2:
                   Sistema.pesquisarCliente();
                   break;
               case 3:
                   Sistema.aumentarLimite();
               default:
                   EntradaSaida.mostrarMensagem("Opção Inválida.");
           }
           resposta = EntradaSaida.receberString("Deseja Continuar? (sim | não)");
       }
    }    
}
