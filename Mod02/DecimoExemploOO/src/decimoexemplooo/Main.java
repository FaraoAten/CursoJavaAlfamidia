package decimoexemplooo;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("E-mail: " + cliente.getEmail());
        System.out.println("Telefone: " + cliente.getTelefone());
        
        System.out.println("======================================");
        
        cliente.setNome("Aten");
        cliente.setEmail("atenfernandes@gmail.com");
        cliente.setTelefone(985902361);
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("E-mail: " + cliente.getEmail());
        System.out.println("Telefone: " + cliente.getTelefone());
    }
}
