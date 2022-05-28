package setimoexemplooo;

public class ClienteVIP extends Cliente{
    private double limite;
    
    public ClienteVIP(String nome, String email, int idade) {
        super(nome, email, idade);
        this.limite = 3000.0;
    }
    
    public void ajustarLimite(){
        limite += 1000;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
