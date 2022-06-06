package decimosegundoexemplooo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TesteDataHora2 {
    Calendar cal = new GregorianCalendar();
    DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    
    public TesteDataHora2(){
        cal.set(Calendar.DAY_OF_MONTH, 31);
        cal.set(Calendar.MONTH, 11);
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 30);
        cal.set(Calendar.SECOND, 0);
    }
    
    public void calendarioFormat(){
        System.out.println(fmt.format(cal.getTime()));
    }
    
    public void calendarioAdd(){
        cal.add(Calendar.DAY_OF_MONTH, 1);
        System.out.println(fmt.format(cal.getTime()));
    }
    
    public void calendarioSub(){
        cal.add(Calendar.MONTH, -1);
        System.out.println(fmt.format(cal.getTime()));
    }
    
    public void calendarioRoll(){
        cal.roll(Calendar.DAY_OF_MONTH, 5);//adiciona a quantia passada sem mudar outros campos, caso ultrapasse o limite que pode adicionar sem alterar outros campos ele volta ao primeiro.
        System.out.println(fmt.format(cal.getTime()));
    }
}
