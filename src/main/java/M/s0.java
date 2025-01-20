package M;

import Ab.t;
import Nb.k;
import U5.a;
import kotlin.jvm.functions.Function0;
import x.n;

public final class s0 extends k implements Function0 {
    public final int X;
    public final n Y;
    public final o0 Z;

    public s0(n n0, o0 o00, int v) {
        this.X = v;
        this.Y = n0;
        this.Z = o00;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.X) {
            case 0: {
                this.Z.d();
                a.z(this.Y);
                return t.a;
            }
            case 1: {
                this.Z.b(false);
                a.z(this.Y);
                return t.a;
            }
            case 2: {
                this.Z.l();
                a.z(this.Y);
                return t.a;
            }
            default: {
                this.Z.m();
                a.z(this.Y);
                return t.a;
            }
        }
    }
}

