package P;

import Ab.t;
import Nb.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m0.e;
import n0.O;
import v.z;

public final class h extends k implements Function1 {
    public final int X;
    public final boolean Y;
    public final Object Z;

    public h(n n0, boolean z) {
        this.X = 0;
        this.Z = n0;
        this.Y = z;
        super(1);
    }

    public h(Function0 function00, boolean z) {
        this.X = 1;
        this.Y = z;
        this.Z = function00;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        if(this.X != 0) {
            ((O)object0).c(!this.Y && ((Boolean)((Function0)this.Z).invoke()).booleanValue());
            return t.a;
        }
        n n0 = (n)this.Z;
        ((O)object0).p(n0.e.k() - e.b(((O)object0).p0));
        if(this.Y && !n0.b()) {
            float f = n0.e.k();
            float f1 = n0.g.k();
            float f2 = z.b.c(f / f1);
            if(f2 < 0.0f) {
                f2 = 0.0f;
            }
            if(f2 > 1.0f) {
                f2 = 1.0f;
            }
            ((O)object0).h(f2);
            ((O)object0).i(f2);
        }
        return t.a;
    }
}

