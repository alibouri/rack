package l4;

import java.nio.charset.Charset;

public abstract class d {
    public static final Charset a;
    public static final Charset b;
    public static final Charset c;
    public static final Charset d;
    public static final Charset e;
    public static final Charset f;

    static {
        d.a = Charset.forName("UTF-8");
        Charset.forName("UTF-16");
        d.b = Charset.forName("ISO-8859-1");
        d.c = Charset.forName("US-ASCII");
        d.d = Charset.forName("UTF-16BE");
        d.e = Charset.forName("UTF-16LE");
        d.f = Charset.forName("Cp1252");
    }
}

