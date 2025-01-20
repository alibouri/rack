package I1;

public final class d extends c {
    public final Object c;

    public d(int v) {
        super(v);
        this.c = new Object();
    }

    @Override  // I1.c
    public final Object a() {
        synchronized(this.c) {
            return super.a();
        }
    }

    @Override  // I1.c
    public final boolean c(Object object0) {
        synchronized(this.c) {
            return super.c(object0);
        }
    }
}

