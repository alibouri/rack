package D0;

import Ab.t;
import E.d0;
import F0.i0;
import G0.W;
import G0.f0;
import I.T0;
import M.c0;
import M.n;
import M.o0;
import N.B1;
import N.z1;
import Nb.k;
import R.E;
import R.G0;
import R.J0;
import U.d;
import U.p;
import a5.w;
import androidx.compose.ui.Modifier;
import c0.b;
import d0.h;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import x.c;
import x.o;

public final class u extends k implements Function2 {
    public final int X;
    public final Object Y;
    public final int Z;
    public final Object b0;
    public final Object c0;

    public u(Object object0, Object object1, b b0, int v, int v1) {
        this.X = v1;
        this.Y = object0;
        this.c0 = object1;
        this.b0 = b0;
        this.Z = v;
        super(2);
    }

    public u(Object object0, Object object1, Object object2, int v, int v1) {
        this.X = v1;
        this.Y = object0;
        this.b0 = object1;
        this.c0 = object2;
        this.Z = v;
        super(2);
    }

    public u(Object object0, Object object1, Object object2, int v, int v1, boolean z) {
        this.X = v1;
        this.b0 = object0;
        this.Y = object1;
        this.c0 = object2;
        this.Z = v;
        super(2);
    }

    public u(c c0, Modifier modifier0, b b0, int v) {
        this.X = 13;
        this.c0 = c0;
        this.Y = modifier0;
        this.b0 = b0;
        this.Z = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        switch(this.X) {
            case 0: {
                ((Number)object1).intValue();
                b0.a(((Modifier)this.Y), ((b)this.b0), ((K)this.c0), ((p)object0), d.O(this.Z | 1));
                return t.a;
            }
            case 1: {
                ((Number)object1).intValue();
                b0.c(((e0)this.b0), ((Modifier)this.Y), ((Function2)this.c0), ((p)object0), d.O(this.Z | 1));
                return t.a;
            }
            case 2: {
                ((Number)object1).intValue();
                ((d0)this.Y).d(this.c0, ((b)this.b0), ((p)object0), d.O(this.Z | 1));
                return t.a;
            }
            case 3: {
                ((Number)object1).intValue();
                f0.a(((i0)this.Y), ((W)this.c0), ((b)this.b0), ((p)object0), d.O(this.Z | 1));
                return t.a;
            }
            case 4: {
                ((Number)object1).intValue();
                I.f0.g(((Modifier)this.Y), ((o0)this.c0), ((b)this.b0), ((p)object0), d.O(this.Z | 1));
                return t.a;
            }
            case 5: {
                ((Number)object1).intValue();
                Object[] arr_object = Arrays.copyOf(((Object[])this.b0), ((Object[])this.b0).length);
                ((T0)this.Y).b(arr_object, ((Function1)this.c0), ((p)object0), d.O(this.Z | 1));
                return t.a;
            }
            case 6: {
                ((Number)object1).intValue();
                c0.a(((n)this.Y), ((g0.c)this.c0), ((b)this.b0), ((p)object0), d.O(this.Z | 1));
                return t.a;
            }
            case 7: {
                ((Number)object1).intValue();
                w.d(((z1)this.b0), ((Modifier)this.Y), ((Function3)this.c0), ((p)object0), d.O(this.Z | 1));
                return t.a;
            }
            case 8: {
                ((Number)object1).intValue();
                w.g(((B1)this.b0), ((Modifier)this.Y), ((Function3)this.c0), ((p)object0), d.O(this.Z | 1));
                return t.a;
            }
            case 9: {
                ((Number)object1).intValue();
                E.b(((G0)this.b0), ((Modifier)this.Y), ((Function3)this.c0), ((p)object0), d.O(this.Z | 1));
                return t.a;
            }
            case 10: {
                ((Number)object1).intValue();
                E.e(((J0)this.b0), ((Modifier)this.Y), ((Function3)this.c0), ((p)object0), d.O(this.Z | 1));
                return t.a;
            }
            case 11: {
                ((Number)object1).intValue();
                ((b)this.b0).b(this.Y, this.c0, ((p)object0), d.O(this.Z) | 1);
                return t.a;
            }
            case 12: {
                ((Number)object1).intValue();
                ((h)this.Y).d(this.c0, ((b)this.b0), ((p)object0), d.O(this.Z | 1));
                return t.a;
            }
            default: {
                ((Number)object1).intValue();
                o.a(((c)this.c0), ((Modifier)this.Y), ((b)this.b0), ((p)object0), d.O(this.Z | 1));
                return t.a;
            }
        }
    }
}

