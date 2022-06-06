package decimosegundoexemplooo;

public class Main {
    public static void main(String[] args) {
        TesteStringBuilder.concatString();
        System.out.println("\n-----------------------\n");
        TesteStringBuilder.stringBuilder();
        System.out.println("\n-----------------------\n");
        TesteDataHora1.dataSemFormat();
        System.out.println("\n-----------------------\n");
        TesteDataHora1.dataComFormat();
        System.out.println("\n-----------------------\n");
        TesteDataHora1.textoEmData();
        System.out.println("\n-----------------------\n");
        TesteDataHora2 tdh2 = new TesteDataHora2();
        tdh2.calendarioFormat();
        System.out.println("\n-----------------------\n");
        tdh2.calendarioAdd();
        System.out.println("\n-----------------------\n");
        tdh2.calendarioSub();
        System.out.println("\n-----------------------\n");
        tdh2.calendarioRoll();
    }    
}
