package nonoexemplooo3;

import nonoexemplooo.EntradaSaida;

public class CalculadoraMain {
    public static void main(String[] args) {
        double n1 = EntradaSaida.receberDouble("Digite um número:"); 
        double n2 = EntradaSaida.receberDouble("Digite outro número:");
        String op = EntradaSaida.receberString("Digite o operador:");
        double res;
        
        try{
            res = Calculadora.executar(n1, n2, op);
        }catch(MinhaExcessao e){//É possível criamos nossa própria excessão.
            EntradaSaida.mostrarMensagem(e.getBug());
            res = 0;
        }
        
        EntradaSaida.mostrarMensagem("Resultado: "+res);
    }    
}
