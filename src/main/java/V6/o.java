package V6;

import Q6.c;
import io.sentry.g1;
import o6.i;

public final class o extends n {
    public final i Y;
    public final c Z;
    public final a b0;

    public o(a a0, i i0, i i1, c c0) {
        this.b0 = a0;
        this.Y = i1;
        this.Z = c0;
        super(i0);
    }

    @Override  // V6.n
    public final void b() {
        synchronized(this.b0.f) {
            this.b0.e.add(this.Y);
            g1 g10 = new g1(this.b0, 7, this.Y);
            this.Y.a.j(g10);
            if(this.b0.l.getAndIncrement() > 0) {
                this.b0.b.a("Already connected to the service.", new Object[0]);
            }
            a.b(this.b0, this.Z);
        }
    }
}

