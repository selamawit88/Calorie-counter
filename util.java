package Util;

import java.text.DecimalFormat;

public class util {

    public static String formatNumber(int value) {
        DecimalFormat formatter = new DecimalFormat("#,###,###");
        String formatted = formatter.format(value);

        return formatted;
    }
}
