package nonoexemplooo3;

public class Calculadora {
    
    public static double executar(double n1, double n2, String op) throws MinhaExcessao{//Para o Java acionar a excessão que criamos temos de dizer os métodos que podem acioná-la.
        double resultado = 0;
        
        if(n2 == 7){
            throw new MinhaExcessao();//E dentro do método criar a condição de acionamento.
        }
        
        switch(op){
            case "+":
                resultado = n1+n2;
                break;
            case "-":
                resultado = n1-n2;
                break;
            case "*":
                resultado = n1*n2;
                break;
            default:
                resultado = n1/n2;
        }
        
        return resultado;
    }
}
