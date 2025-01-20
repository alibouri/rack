package v;

import Nb.j;
import U.H;
import U.N0;
import U.Z;
import U.l;
import U.p;
import Zb.m;
import a1.d;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public abstract class f {
    public static final U a;
    public static final U b;

    static {
        f.a = c.i(0.0f, 7, null);
        f.b = c.i(0.0f, 3, new d(0.1f));
    }

    public static final N0 a(float f, n0 n00, String s, p p0, int v, int v1) {
        if((v1 & 2) != 0) {
            n00 = f.b;
        }
        if((v1 & 4) != 0) {
            s = "DpAnimation";
        }
        return f.c(new d(f), p0.c, n00, null, s, null, p0, v << 3 & 0x380 | v << 6 & 0xE000, 8);
    }

    public static final N0 b(float f, n0 n00, p p0) {
        if(n00 == f.a) {
            p0.Q(0x431745D7);
            boolean z = p0.c(0.01f);
            Object object0 = p0.G();
            if(z || object0 == l.a) {
                object0 = c.i(0.0f, 3, 0.01f);
                p0.a0(object0);
            }
            p0.p(false);
            return f.c(f, p0.a, ((U)object0), 0.01f, "FloatAnimation", null, p0, 0, 0);
        }
        p0.Q(1125708605);
        p0.p(false);
        return f.c(f, p0.a, n00, 0.01f, "FloatAnimation", null, p0, 0, 0);
    }

    public static final N0 c(Object object0, o0 o00, k k0, Float float0, String s, Function1 function10, p p0, int v, int v1) {
        k k1 = k0;
        Z z0 = l.a;
        Float float1 = (v1 & 8) == 0 ? float0 : null;
        Object object1 = p0.G();
        if(object1 == z0) {
            object1 = U.d.D(null, Z.e);
            p0.a0(object1);
        }
        Object object2 = p0.G();
        if(object2 == z0) {
            object2 = new b(object0, o00, float1);
            p0.a0(object2);
        }
        MutableState mutableState0 = U.d.G(function10, p0);
        if(float1 != null && k1 instanceof U && !j.a(((U)k1).c, float1)) {
            k1 = new U(((U)k1).a, ((U)k1).b, float1);
        }
        MutableState mutableState1 = U.d.G(k1, p0);
        Object object3 = p0.G();
        if(object3 == z0) {
            object3 = T4.l.i(-1, 6, null);
            p0.a0(object3);
        }
        boolean z1 = p0.h(((m)object3));
        boolean z2 = (v & 14 ^ 6) <= 4 && p0.h(object0) || (v & 6) == 4;
        Object object4 = p0.G();
        if((z1 | z2) != 0 || object4 == z0) {
            object4 = new jc.p(((m)object3), 4, object0);
            p0.a0(object4);
        }
        H.g(((Function0)object4), p0);
        boolean z3 = p0.h(((m)object3));
        boolean z4 = p0.h(((b)object2));
        boolean z5 = p0.f(mutableState1);
        boolean z6 = p0.f(mutableState0);
        Object object5 = p0.G();
        if((z3 | z4 | z5 | z6) != 0 || object5 == z0) {
            object5 = new e(((m)object3), ((b)object2), mutableState1, mutableState0, null);
            p0.a0(object5);
        }
        H.d(p0, ((m)object3), ((Function2)object5));
        N0 n00 = (N0)((MutableState)object1).getValue();
        return n00 == null ? ((b)object2).c : n00;
    }
}

