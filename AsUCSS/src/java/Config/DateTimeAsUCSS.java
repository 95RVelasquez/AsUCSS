package Config;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author Rony VC
 */
public class DateTimeAsUCSS {
   public static String getDateTimeUCSS()
   {
       //Objeto de la clase Date
       Date d=new Date();
       SimpleDateFormat formato=new SimpleDateFormat("yyyyy.MMMMM.dd GGG hh:mm aaa");
       return formato.format(d);
   }
}
