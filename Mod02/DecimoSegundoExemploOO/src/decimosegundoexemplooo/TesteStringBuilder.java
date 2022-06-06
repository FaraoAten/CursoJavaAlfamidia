package decimosegundoexemplooo;

public class TesteStringBuilder {
    public static void concatString(){
        //concatenando Strings = Java cria objetos separados.
        String txt1 = "Texto um";
        String txt2 = "outro texto.";
        String res = txt1 + ", " + txt2;
        System.out.println(res);
    }
    
    public static void stringBuilder(){
        //usando StringBuilder
        //concatena sem ficar criando diversos objetos, o que auxilia no desempenho.
        StringBuilder sb = new StringBuilder("Um texto de teste");
        sb.append(", ");
        sb.append("outro texto de teste.");
        String res = sb.toString();
        System.out.println(res);
    }
}
