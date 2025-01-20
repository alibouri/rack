package H;

public abstract class f {
    public static final e a;

    static {
        f.a = f.a(50);
    }

    public static final e a(int v) {
        d d0 = new d(((float)v));
        return new e(d0, d0, d0, d0);
    }

    public static final e b(float f) {
        c c0 = new c(f);
        return new e(c0, c0, c0, c0);
    }

    public static final e c(float f, float f1, float f2, float f3) {
        return new e(new c(f), new c(f1), new c(f2), new c(f3));
    }

    public static e d(float f, float f1, float f2, float f3, int v) {
        if((v & 1) != 0) {
            f = 0.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        if((v & 4) != 0) {
            f2 = 0.0f;
        }
        if((v & 8) != 0) {
            f3 = 0.0f;
        }
        return f.c(f, f1, f2, f3);
    }
}

