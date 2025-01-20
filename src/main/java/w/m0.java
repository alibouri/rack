package w;

import Ab.t;
import Eb.a;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import g0.l;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m0.b;
import m0.c;
import m0.e;
import n0.I;
import n0.K;
import n0.S;

public final class m0 implements S, Y, p0 {
    public final int X;
    public static final m0 Y;
    public static final m0 Z;

    static {
        m0.Y = new m0(0);
        m0.Z = new m0(1);
    }

    public m0(int v) {
        this.X = v;
        super();
    }

    @Override  // w.p0
    public boolean a() {
        return false;
    }

    @Override  // w.Y
    public void b(LayoutNodeDrawScope layoutNodeDrawScope0) {
        layoutNodeDrawScope0.a();
    }

    @Override  // w.p0
    public Modifier c() {
        return l.X;
    }

    @Override  // n0.S
    public K d(long v, LayoutDirection layoutDirection0, Density density0) {
        if(this.X != 3) {
            float f = (float)density0.I(x.a);
            return new I(new c(-f, 0.0f, e.d(v) + f, e.b(v)));
        }
        float f1 = (float)density0.I(x.a);
        return new I(new c(0.0f, -f1, e.d(v), e.b(v) + f1));
    }

    @Override  // w.p0
    public long e(long v, int v1, Function1 function10) {
        return ((b)function10.n(new b(v))).a;
    }

    @Override  // w.p0
    public Object f(long v, Function2 function20, g g0) {
        Object object0 = function20.j(new a1.l(v), g0);
        return object0 == a.X ? object0 : t.a;
    }
}

