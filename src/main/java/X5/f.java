package x5;

import r5.i;
import z5.b;

public final class f implements b {
    public final h X;
    public final i Y;
    public final int Z;

    public f(h h0, i i0, int v) {
        this.X = h0;
        this.Y = i0;
        this.Z = v;
    }

    @Override  // z5.b
    public final Object a() {
        this.X.d.a(this.Y, this.Z + 1, false);
        return null;
    }
}

