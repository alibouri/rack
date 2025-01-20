package h4;

import M.J;

public final class e {
    public final int a;
    public final String b;
    public static final e c;
    public static final e d;
    public static final e e;
    public static final e f;
    public static final e g;

    static {
        e.c = new e(0, "Greyscale");
        e.d = new e(2, "True Color");
        e.e = new e(3, "Indexed Color");
        e.f = new e(4, "Greyscale with Alpha");
        e.g = new e(6, "True Color with Alpha");
    }

    public e(int v, String s) {
        this.a = v;
        this.b = s;
    }

    public static e a(int v) {
        switch(v) {
            case 0: {
                return e.c;
            }
            case 2: {
                return e.d;
            }
            case 3: {
                return e.e;
            }
            case 4: {
                return e.f;
            }
            case 6: {
                return e.g;
            }
            default: {
                return new e(v, J.d(v, "Unknown (", ")"));
            }
        }
    }
}

