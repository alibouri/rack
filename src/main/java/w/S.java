package w;

import Ab.t;
import Nb.k;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import kotlin.jvm.functions.Function1;
import m0.a;
import m0.e;
import m5.b;
import n0.U;
import p0.h;
import v1.r;
import yc.l;

public final class s extends k implements Function1 {
    public final boolean X;
    public final U Y;
    public final long Z;
    public final float b0;
    public final float c0;
    public final long d0;
    public final long e0;
    public final h f0;

    public s(boolean z, U u0, long v, float f, float f1, long v1, long v2, h h0) {
        this.X = z;
        this.Y = u0;
        this.Z = v;
        this.b0 = f;
        this.c0 = f1;
        this.d0 = v1;
        this.e0 = v2;
        this.f0 = h0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        ((LayoutNodeDrawScope)object0).a();
        if(this.X) {
            b.m(((LayoutNodeDrawScope)object0), this.Y, 0L, 0L, this.Z, null, 0xF6);
            return t.a;
        }
        long v = this.Z;
        float f = this.b0;
        if(a.b(v) < f) {
            float f1 = e.d(((LayoutNodeDrawScope)object0).X.Y.A());
            float f2 = e.b(((LayoutNodeDrawScope)object0).X.Y.A());
            long v1 = ((LayoutNodeDrawScope)object0).X.Y.A();
            ((LayoutNodeDrawScope)object0).X.Y.o().n();
            try {
                ((g3.b)((LayoutNodeDrawScope)object0).X.Y.Y).e(this.c0, this.c0, f1 - this.c0, f2 - this.c0, 0);
                b.m(((LayoutNodeDrawScope)object0), this.Y, 0L, 0L, this.Z, null, 0xF6);
                return t.a;
            }
            finally {
                r.i(((LayoutNodeDrawScope)object0).X.Y, v1);
            }
        }
        b.m(((LayoutNodeDrawScope)object0), this.Y, this.d0, this.e0, l.C(f, v), this.f0, 0xD0);
        return t.a;
    }
}

