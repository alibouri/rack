package T6;

import R2.c;
import S6.b;
import o6.i;

public final class g extends f {
    public final i Y;
    public final b Z;
    public final T6.i b0;

    public g(T6.i i0, i i1, i i2, b b0) {
        this.Y = i2;
        this.Z = b0;
        this.b0 = i0;
        super(i1);
    }

    @Override  // T6.f
    public final void a() {
        synchronized(this.b0.f) {
            this.b0.e.add(this.Y);
            c c0 = new c(7, this.b0, this.Y, false);
            this.Y.a.j(c0);
            if(this.b0.k.getAndIncrement() > 0) {
                this.b0.b.b("Already connected to the service.", new Object[0]);
            }
            T6.i.b(this.b0, this.Z);
        }
    }
}

