package g6;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public abstract class b {
    public static final DecimalFormat a;
    public static final DecimalFormat b;

    static {
        Locale locale0 = Locale.ROOT;
        b.a = new DecimalFormat(".000000", DecimalFormatSymbols.getInstance(locale0));
        DecimalFormat decimalFormat0 = new DecimalFormat(".##", DecimalFormatSymbols.getInstance(locale0));
        b.b = decimalFormat0;
        decimalFormat0.setRoundingMode(RoundingMode.DOWN);
    }
}

