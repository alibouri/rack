package B;

import Ab.t;
import D0.M;
import D0.V;
import I.P0;
import I.Z0;
import I.a0;
import I.f0;
import Nb.j;
import Nb.k;
import U.C;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.unit.LayoutDirection;
import c0.d;
import java.io.Serializable;
import kotlin.jvm.functions.Function1;
import l0.q;
import m0.c;
import s.y;
import y.q0;

public final class w0 extends k implements Function1 {
    public final int X;
    public final int Y;
    public final Object Z;
    public final Object b0;
    public final Object c0;

    public w0(Object object0, Object object1, int v, Serializable serializable0, int v1) {
        this.X = v1;
        this.Z = object0;
        this.b0 = object1;
        this.Y = v;
        this.c0 = serializable0;
        super(1);
    }

    public w0(Object object0, Object object1, Object object2, int v, int v1) {
        this.X = v1;
        this.Z = object0;
        this.b0 = object1;
        this.c0 = object2;
        this.Y = v;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        switch(this.X) {
            case 0: {
                V[] arr_v = (V[])this.Z;
                int v = 0;
                for(int v1 = 0; v < arr_v.length; ++v1) {
                    V v2 = arr_v[v];
                    j.c(v2);
                    Object object1 = v2.g();
                    e e0 = null;
                    u0 u00 = object1 instanceof u0 ? ((u0)object1) : null;
                    x0 x00 = (x0)this.b0;
                    x00.getClass();
                    if(u00 != null) {
                        e0 = u00.c;
                    }
                    int v3 = e0 == null ? x00.b.a(0, this.Y - v2.Y) : e0.d(this.Y - v2.Y, LayoutDirection.X);
                    Placeable.PlacementScope.d(((Placeable.PlacementScope)object0), v2, ((int[])this.c0)[v1], v3);
                    ++v;
                }
                return t.a;
            }
            case 1: {
                P0 p00 = (P0)((a0)this.b0).b0.invoke();
                boolean z1 = ((M)this.Z).getLayoutDirection() == LayoutDirection.Y;
                c c0 = f0.l(((M)this.Z), ((a0)this.b0).Y, ((a0)this.b0).Z, (p00 == null ? null : p00.a), z1, ((V)this.c0).X);
                ((a0)this.b0).X.a(q0.Y, c0, this.Y, ((V)this.c0).X);
                int v4 = Math.round(-((a0)this.b0).X.a.k());
                Placeable.PlacementScope.f(((Placeable.PlacementScope)object0), ((V)this.c0), v4, 0);
                return t.a;
            }
            case 2: {
                P0 p01 = (P0)((Z0)this.b0).b0.invoke();
                c c1 = f0.l(((M)this.Z), ((Z0)this.b0).Y, ((Z0)this.b0).Z, (p01 == null ? null : p01.a), false, ((V)this.c0).X);
                ((Z0)this.b0).X.a(q0.X, c1, this.Y, ((V)this.c0).Y);
                int v5 = Math.round(-((Z0)this.b0).X.a.k());
                Placeable.PlacementScope.f(((Placeable.PlacementScope)object0), ((V)this.c0), 0, v5);
                return t.a;
            }
            case 3: {
                if(object0 == ((C)this.Z)) {
                    throw new IllegalStateException("A derived state calculation cannot read itself");
                }
                if(object0 instanceof e0.t) {
                    int v6 = ((d)this.b0).a - this.Y;
                    int v7 = ((y)this.c0).c(object0);
                    ((y)this.c0).f(Math.min(v6, (v7 < 0 ? 0x7FFFFFFF : ((y)this.c0).c[v7])), object0);
                }
                return t.a;
            }
            case 4: {
                boolean z2 = l0.d.G(((q)this.Z), ((q)this.b0), this.Y, ((m0)this.c0));
                return z2 || !((D0.d)object0).a() ? Boolean.valueOf(z2) : null;
            }
            default: {
                boolean z = l0.d.F(this.Y, ((m0)this.c0), ((q)this.Z), ((c)this.b0));
                return z || !((D0.d)object0).a() ? Boolean.valueOf(z) : null;
            }
        }
    }
}

