package p8;

import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class a {
    public static final Logger a;

    static {
        a.a = Logger.getLogger(a.class.getName());
    }

    public final InputStream a(String s) {
        InputStream inputStream0 = a.class.getResourceAsStream(s);
        if(inputStream0 == null) {
            a.a.log(Level.WARNING, "File " + s + " not found");
        }
        return inputStream0;
    }
}

