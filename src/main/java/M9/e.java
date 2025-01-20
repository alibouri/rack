package m9;

import java.nio.charset.Charset;

public abstract class e {
    public static final Charset a;
    public static final Charset b;

    static {
        e.a = Charset.forName("US-ASCII");
        e.b = Charset.forName("UTF-8");
    }
}

