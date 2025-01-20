package N;

import Ab.t;
import M0.a;
import M0.i;
import M0.q;
import M0.s;
import Nb.j;
import Nb.k;
import Tb.e;
import kotlin.jvm.functions.Function1;

public final class v1 extends k implements Function1 {
    public final int X;
    public final z1 Y;

    public v1(z1 z10, int v) {
        this.X = v;
        this.Y = z10;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        z1 z10 = this.Y;
        if(this.X != 0) {
            return Boolean.valueOf(j.a(((G0)object0).a, z10));
        }
        e e0 = s.a[3];
        M0.e e1 = new M0.e();  // initializer: Ljava/lang/Object;-><init>()V
        q.j.a(((M0.j)object0), e1);
        a a0 = new a(null, new u1(z10, 0));
        ((M0.j)object0).c(i.t, a0);
        return t.a;
    }
}

