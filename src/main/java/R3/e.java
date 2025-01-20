package r3;

public final class e implements i {
    public final int a;
    public final j b;

    public e(j j0, int v) {
        this.a = v;
        this.b = j0;
        super();
    }

    @Override  // r3.i
    public final void run() {
        if(this.a != 0) {
            this.b.h();
            return;
        }
        this.b.j();
    }
}

