package K5;

public class p {
    public final boolean a;
    public final String b;
    public final Exception c;
    public static final p d;

    static {
        p.d = new p(null, true, null);
    }

    public p(String s, boolean z, Exception exception0) {
        this.a = z;
        this.b = s;
        this.c = exception0;
    }

    public String a() {
        return this.b;
    }
}

