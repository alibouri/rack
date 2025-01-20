package M6;

import B1.b;
import N6.c;

public final class d implements c {
    public final int X;
    public final U7.c Y;

    public d(U7.c c0, int v) {
        this.X = v;
        this.Y = c0;
        super();
    }

    @Override  // N6.c
    public final Object zza() {
        return this.X != 0 ? new k(((b)this.Y.Y).a) : new M6.c(((b)this.Y.Y).a);
    }
}

