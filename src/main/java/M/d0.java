package M;

import Ab.t;
import Nb.k;
import U5.a;
import kotlin.jvm.functions.Function0;
import x.n;

public final class d0 extends k implements Function0 {
    public final int X;
    public final n Y;
    public final a0 Z;

    public d0(n n0, a0 a00, int v) {
        this.X = v;
        this.Y = n0;
        this.Z = a00;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.X != 0) {
            this.Z.k();
            a.z(this.Y);
            return t.a;
        }
        this.Z.b();
        a.z(this.Y);
        return t.a;
    }
}

