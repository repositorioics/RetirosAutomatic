package ni.com.sts.retirosCSSFV.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ICS on 26/05/2022.
 */
public class UtilDate {

    public static String DateToString(Date fecha, String formato){

        SimpleDateFormat sfd = new SimpleDateFormat(formato);
        return sfd.format(fecha);
    }

    public static Date StringToDate(String fecha, String formato)throws ParseException{
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formato);
        return simpleDateFormat.parse(fecha);
    }
}
