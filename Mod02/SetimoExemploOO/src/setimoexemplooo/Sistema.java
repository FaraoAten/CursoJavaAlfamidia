package setimoexemplooo;

import java.util.ArrayList;

public class Sistema {
    private static ArrayList<Cliente> dados = new ArrayList<>();
    
    public static void cadastrarCliente(){
        String nome, email, tipo;
        int idade;
        
        nome = EntradaSaida.receberString("Nome:");
        email = EntradaSaida.receberString("E-mail");
        idade = EntradaSaida.receberInt("Idade:");
        tipo = EntradaSaida.receberString("Comum ou VIP? ( C | V )");
        
        Cliente cliente;
        if(tipo.equalsIgnoreCase("C")){
            cliente = new ClienteComum(nome, email, idade);
        }else{
            cliente = new ClienteVIP(nome, email, idade);
        }
        dados.add(cliente);
    }
    
    public static void pesquisarCliente(){
        String pesquisa = EntradaSaida.receberString("Nome do cliente:");
        Cliente cliente = retornarCliente(pesquisa);
        String saida;
        
        if(cliente != null){
            saida = cliente.getNome() + "\n" 
                    + cliente.getEmail() + "\n" 
                    + cliente.getIdade();
        }else{
            saida = "Nenhum resultado encontrado.";
        }
        EntradaSaida.mostrarMensagem(saida);
    }
    
    private static Cliente retornarCliente(String pesquisa){
        for(Cliente cliente : dados){
            if(cliente.getNome().equalsIgnoreCase(pesquisa)){
                return cliente;
            }
        }
        return null;
    }
    
    public static void aumentarLimite(){
        String pesquisa = EntradaSaida.receberString("Nome do cliente:");
        Cliente cliente = retornarCliente(pesquisa);
        
        if(cliente == null){
            EntradaSaida.mostrarMensagem("Cliente Inexistênte.");
        }else if(cliente instanceof ClienteVIP){ //instanceof verifica se um objeto é instância de uma classe e retorna um boolean.
            ClienteVIP clienteVip = (ClienteVIP) cliente; //Forçar o tipo (type casting), para poder acessar os métodos exclusivos de uma classe herdada.
            clienteVip.ajustarLimite();
            EntradaSaida.mostrarMensagem("Novo limite: " + clienteVip.getLimite());
        }else{
            EntradaSaida.mostrarMensagem("Cliente comum...");
        }
    }
}
