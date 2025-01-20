package L;

import Vb.q;

public abstract class c {
    public static final String a;
    public static final String b;

    static {
        String s = q.L(10, "H");
        c.a = s;
        c.b = s + '\n' + s;
    }
}

