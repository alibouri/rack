package Ea;

import Ab.k;
import Ab.t;
import C3.i;
import Fa.C;
import Fa.m;
import Mb.e;
import Nb.j;
import Qa.u;
import Qa.w;
import Qa.z;
import R.W0;
import U.H;
import U.N0;
import U.Z;
import U.l;
import U.p;
import androidx.compose.ui.Modifier;
import c0.b;
import com.wave.designsystem.extensions.swipetodismiss.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import l2.c;

public final class s0 implements e {
    public final int X;
    public final c Y;
    public final Object Z;
    public final Object b0;
    public final Object c0;
    public final Object d0;

    public s0(c c0, Object object0, Object object1, Object object2, Object object3, int v) {
        this.X = v;
        this.Y = c0;
        this.Z = object0;
        this.b0 = object1;
        this.c0 = object2;
        this.d0 = object3;
        super();
    }

    @Override  // Mb.e
    public final Object r(Object object0, Object object1, Object object2, Object object3) {
        if(this.X != 0) {
            int v = ((Number)object1).intValue();
            int v1 = ((Number)object3).intValue();
            j.f(((C.c)object0), "$this$items");
            int v2 = (v1 & 6) == 0 ? (((p)object2).f(((C.c)object0)) ? 4 : 2) | v1 : v1;
            if((v1 & 0x30) == 0) {
                v2 |= (((p)object2).d(v) ? 0x20 : 16);
            }
            Object object4 = t.a;
            if((v2 & 0x93) == 0x92 && ((p)object2).x()) {
                ((p)object2).K();
                return object4;
            }
            Qa.c c0 = (Qa.c)this.Y.b(v);
            if(c0 != null) {
                ((p)object2).Q(-990423507);
                float f = z.a;
                ((p)object2).Q(0x9AFFCDCC);
                Function1 function10 = (Function1)this.Z;
                boolean z = ((p)object2).f(function10);
                boolean z1 = ((p)object2).f(c0);
                Object object5 = ((p)object2).G();
                Z z2 = l.a;
                if((z | z1) != 0 || object5 == z2) {
                    object5 = new r(function10, 3, c0);
                    ((p)object2).a0(object5);
                }
                ((p)object2).p(false);
                Ya.z z3 = a.b(f, ((Function1)object5), z.b, ((p)object2));
                ((p)object2).Q(0x9B000260);
                k k0 = (k)this.b0;
                if(c0.equals((k0 == null ? null : ((Qa.c)k0.X))) && z3.a() == W0.Y && k0.Y == W0.Z) {
                    ((p)object2).Q(0x9B0028EB);
                    boolean z4 = ((p)object2).h(z3);
                    Object object6 = ((p)object2).G();
                    if(z4 || object6 == z2) {
                        object6 = new u(z3, null);
                        ((p)object2).a0(object6);
                    }
                    ((p)object2).p(false);
                    H.d(((p)object2), object4, ((Function2)object6));
                }
                ((p)object2).p(false);
                Modifier modifier0 = A3.e.n(((C.c)object0), g0.l.X);
                b b0 = c0.c.c(0x37E5CAFD, new w(c0, ((Function2)this.c0), v, ((N0)this.d0)), ((p)object2));
                a.a(z3, Qa.b.a, modifier0, false, true, false, b0, ((p)object2), 1600560, 0x20);
                ((p)object2).p(false);
                return object4;
            }
            ((p)object2).Q(-988353079);
            z.a(0, 1, ((p)object2), null);
            ((p)object2).p(false);
            return object4;
        }
        int v3 = ((Number)object1).intValue();
        int v4 = ((Number)object3).intValue();
        j.f(((D.k)object0), "$this$items");
        if((v4 & 0x30) == 0) {
            v4 |= (((p)object2).d(v3) ? 0x20 : 16);
        }
        if((v4 & 0x91) == 0x90 && ((p)object2).x()) {
            ((p)object2).K();
            return t.a;
        }
        Object object7 = this.Y.b(v3);
        if(((O)object7) != null) {
            ((p)object2).Q(0x56BBABC6);
            dc.e e0 = (dc.e)this.Z;
            boolean z5 = ((p)object2).h(e0);
            f0 f00 = (f0)this.b0;
            boolean z6 = ((p)object2).f(f00);
            C c1 = (C)this.c0;
            boolean z7 = ((p)object2).f(c1);
            boolean z8 = ((p)object2).h(((O)object7));
            Object object8 = ((p)object2).G();
            if((z5 | z6 | z7 | z8) != 0 || object8 == l.a) {
                object8 = new r0(((O)object7), e0, f00, c1, 0);
                ((p)object2).a0(object8);
            }
            ((p)object2).p(false);
            m.c(((O)object7), null, ((Function0)object8), ((i)this.d0), ((p)object2), 0, 2);
        }
        return t.a;
    }
}

