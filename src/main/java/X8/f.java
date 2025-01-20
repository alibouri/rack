package x8;

import java.nio.charset.Charset;

public abstract class f {
    public static final String a;
    public static final boolean b;

    static {
        String s = Charset.defaultCharset().name();
        f.a = s;
        f.b = "SJIS".equalsIgnoreCase(s) || "EUC_JP".equalsIgnoreCase(s);
    }
}

