package f1;

public final class g {
    public volatile Thread a;
    public volatile g b;
    public static final g c;

    static {
        g.c = new g();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public g() {
        h.d0.B(this, Thread.currentThread());
    }
}

