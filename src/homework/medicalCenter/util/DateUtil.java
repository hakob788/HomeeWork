package homework.medicalCenter.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static final SimpleDateFormat SDF = new SimpleDateFormat("dd-MM-yyyy");
    public static final SimpleDateFormat SDTM = new SimpleDateFormat("dd-MM-yyyy HH:mm");

    public static String dateTimeToString(Date dateTime) {
        return SDTM.format(dateTime);
    }

    public static Date stringToDateTime(String dataStr) throws ParseException {
        return SDTM.parse(dataStr);
    }

    public static boolean isSameDay(Date day1, Date day2) {
        return SDF.format(day1)
                .equals(SDF.format(day2));
    }

    public static String dateToString(Date date) {
        if (date == null) {
            return null;
        }
        return SDF.format(date);
    }

    public static Date stringToDate(String dateStr) throws ParseException {
        if (dateStr == null) {
            return null;
        }
        return SDF.parse(dateStr);
    }
}
