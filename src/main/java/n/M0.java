package N;

import Ab.t;
import F0.f;
import Nb.k;
import Q.b;
import Q.d;
import Q.v;
import Q.z;
import kotlin.jvm.functions.Function0;
import n0.M;

public final class m0 extends k implements Function0 {
    public final int X;
    public final n0 Y;

    public m0(n0 n00, int v) {
        this.X = v;
        this.Y = n00;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        n0 n00 = this.Y;
        if(this.X != 0) {
            if(((d1)f.i(n00, e1.b)) == null) {
                v v0 = n00.r0;
                if(v0 != null) {
                    n00.y0(v0);
                    return t.a;
                }
            }
            else if(n00.r0 == null) {
                l0 l00 = new l0(0, n00);
                m0 m00 = new m0(n00, 0);
                boolean z = n00.p0;
                float f = n00.q0;
                A.k k0 = n00.o0;
                d d0 = z.a ? new d(k0, z, f, l00, m00) : new b(k0, z, f, l00, m00);  // initializer: LQ/v;-><init>(LA/k;ZFLn0/w;Lkotlin/jvm/functions/Function0;)V
                n00.x0(d0);
                n00.r0 = d0;
            }
            return t.a;
        }
        d1 d10 = (d1)f.i(n00, e1.b);
        if(d10 != null) {
            Object object0 = d10.b;
            if(object0 != null) {
                return object0;
            }
        }
        long v1 = ((n0.v)f.i(n00, a0.a)).a;
        if(((Q)f.i(n00, T.a)).h()) {
            return ((double)M.w(v1)) > 0.5 ? e1.e : e1.f;
        }
        return e1.g;
    }
}

