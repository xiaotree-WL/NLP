package com.wl.time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonDateUtil {

    private static String defaultDatePattern = "yyyy-MM-dd";

    public static String formatDate(Date date, String format) {
        if (date == null)
            date = new Date();
        if (format == null)
            format = getDatePattern();
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        return formatter.format(date);
    }

    public static String getDatePattern() {
        return defaultDatePattern;
    }
}
