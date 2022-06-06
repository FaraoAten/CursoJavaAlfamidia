package decimosegundoexemplooo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteDataHora1 {

    public static void dataSemFormat() {
        Date hoje = new Date();
        System.out.println(hoje);
    }

    public static void dataComFormat() {
        Date hoje = new Date();
        DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(fmt.format(hoje));
    }

    public static void textoEmData() {
        try {
            String entrada = "25/05/1998";
            DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
            Date aniver = fmt.parse(entrada);
            System.out.println(fmt.format(aniver));
        } catch (Exception e) {
            System.out.println("Formato de data inválido.");
        }
    }
}
