package terceiroexemplooo;

public class TesteNumeros {
    //No Java temos classes que representam tipos
    //para fazermos conversões etc...
    String snro = "1234";
    int inro = Integer.parseInt(snro);
    float fnro = Float.parseFloat(snro);
    double dnro = Double.parseDouble(snro);
    long lnro = Long.parseLong(snro);
    
    //Também é possível realizar a conversão oposta
    int ival = 9876;
    String sval = Integer.toString(ival);
    String sval2 = String.valueOf(ival);
    
    //E temos a classe Math para outras funções aritiméticas
    public void demonstrarMetodos(){
        System.out.println(Math.pow(2, 3));//Potência, primeiro parametro elevado pelo segundo
        System.out.println("\n=================================\n");
        System.out.println(Math.sqrt(25));//Raiz quadrada
        System.out.println("\n=================================\n");
        System.out.println(Math.sin(90));//Seno
        System.out.println("\n=================================\n");
        System.out.println(Math.E);//Constante de Euler
        System.out.println("\n=================================\n");
        System.out.println(Math.PI);//PI (constante)
        System.out.println("\n=================================\n");
    }
}
