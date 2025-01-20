package F0;

import Ab.t;
import Nb.k;
import g0.n;
import kotlin.jvm.functions.Function0;

public final class a0 extends k implements Function0 {
    public final int X;
    public final c0 Y;
    public final n Z;
    public final d b0;
    public final long c0;
    public final r d0;
    public final boolean e0;
    public final boolean f0;
    public final float g0;

    public a0(c0 c00, n n0, d d0, long v, r r0, boolean z, boolean z1, float f, int v1) {
        this.X = v1;
        this.Y = c00;
        this.Z = n0;
        this.b0 = d0;
        this.c0 = v;
        this.d0 = r0;
        this.e0 = z;
        this.f0 = z1;
        this.g0 = f;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.X != 0) {
            this.Y.W0(f.e(this.Z, this.b0.a()), this.b0, this.c0, this.d0, this.e0, this.f0, this.g0);
            return t.a;
        }
        n n0 = f.e(this.Z, this.b0.a());
        boolean z = this.f0;
        c0 c00 = this.Y;
        d d0 = this.b0;
        long v = this.c0;
        r r0 = this.d0;
        boolean z1 = this.e0;
        if(n0 == null) {
            c00.L0(d0, v, r0, z1, z);
            return t.a;
        }
        c00.getClass();
        a0 a00 = new a0(c00, n0, d0, v, r0, z1, z, this.g0, 0);
        r0.c(n0, this.g0, z, a00);
        return t.a;
    }
}

