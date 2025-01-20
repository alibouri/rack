package ha;

import Ab.t;
import Nb.j;
import U.N0;
import Y8.o;
import Y9.a;
import a1.g;
import androidx.compose.ui.unit.Density;
import ia.c;
import ia.l;
import kotlin.jvm.functions.Function1;
import n0.M;
import n0.O;

public final class g0 implements Function1 {
    public final int X;
    public final m0 Y;
    public final N0 Z;

    public g0(m0 m00, N0 n00, int v) {
        this.X = v;
        this.Y = m00;
        this.Z = n00;
        super();
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        float f1;
        if(this.X != 0) {
            j.f(((O)object0), "$this$graphicsLayer");
            N0 n00 = this.Z;
            if(this.Y.m == null) {
                float f3 = ((float)((Number)n00.getValue()).intValue()) / ((float)o.e(l0.b - l.a, ((O)object0)));
                f1 = N4.j.y(1.0f, l0.c, f3);
            }
            else {
                int v = ((Number)n00.getValue()).intValue();
                float f = a.a;
                if(v < o.e(f, ((O)object0))) {
                    f1 = 1.0f;
                }
                else {
                    float f2 = ((float)(((Number)n00.getValue()).intValue() - o.e(f, ((O)object0)))) / ((float)o.e(c.a, ((O)object0)));
                    f1 = N4.j.y(1.0f, l0.c, f2);
                }
            }
            ((O)object0).h(f1);
            ((O)object0).i(f1);
            ((O)object0).m(M.i(0.5f, 1.0f));
            return t.a;
        }
        j.f(((Density)object0), "$this$offset");
        return this.Y.m == null ? new g(android.support.v4.media.session.a.i(0, ((Density)object0).I(l0.b - c.a) - ((Number)this.Z.getValue()).intValue())) : new g(android.support.v4.media.session.a.i(0, ((Density)object0).I(l.a + a.a) - ((Number)this.Z.getValue()).intValue()));
    }
}

