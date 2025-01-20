package aa;

import Aa.s;
import Nb.j;
import Nb.t;
import kotlin.jvm.functions.Function1;
import y.w0;

public final class e implements Function1 {
    public final t X;
    public final w0 Y;
    public final t Z;
    public final i b0;
    public final int c0;

    public e(t t0, w0 w00, t t1, i i0, int v) {
        this.X = t0;
        this.Y = w00;
        this.Z = t1;
        this.b0 = i0;
        this.c0 = v;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        j.f(((v.j)object0), "$this$animateTo");
        float f = ((Number)((v.j)object0).e.getValue()).floatValue() - this.X.X;
        w0 w00 = this.Y;
        float f1 = w00.a(f);
        this.X.X = ((Number)((v.j)object0).e.getValue()).floatValue();
        this.Z.X = ((Number)((v.j)object0).b()).floatValue();
        i i0 = this.b0;
        c c0 = i0.a.e();
        if(c0 == null) {
            ((v.j)object0).a();
            return Ab.t.a;
        }
        s s0 = new s(1, w00, w0.class, "scrollBy", "scrollBy(F)F", 0, 23);
        if(i0.e(((v.j)object0), c0, this.c0, s0)) {
            ((v.j)object0).a();
            return Ab.t.a;
        }
        if(Math.abs(f - f1) > 0.5f) {
            ((v.j)object0).a();
        }
        return Ab.t.a;
    }
}

