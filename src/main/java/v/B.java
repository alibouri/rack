package v;

import Ab.t;
import Ea.I0;
import I2.J;
import Nb.j;
import U.Z;
import U.d;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;

public final class b {
    public final o0 a;
    public final Object b;
    public final l c;
    public final ParcelableSnapshotMutableState d;
    public final ParcelableSnapshotMutableState e;
    public final Q f;
    public final U g;
    public final q h;
    public final q i;
    public final q j;
    public final q k;

    public b(Object object0, o0 o00, Object object1) {
        m m1;
        m m0;
        this.a = o00;
        this.b = object1;
        l l0 = new l(o00, object0, null, 60);
        this.c = l0;
        this.d = d.D(Boolean.FALSE, Z.e);
        this.e = d.D(object0, Z.e);
        this.f = new Q();
        this.g = new U(3, object1);
        q q0 = l0.Z;
        if(q0 instanceof m) {
            m0 = c.e;
        }
        else if(q0 instanceof n) {
            m0 = c.f;
        }
        else if(q0 instanceof o) {
            m0 = c.g;
        }
        else {
            m0 = c.h;
        }
        this.h = m0;
        if(q0 instanceof m) {
            m1 = c.a;
        }
        else if(q0 instanceof n) {
            m1 = c.b;
        }
        else if(q0 instanceof o) {
            m1 = c.c;
        }
        else {
            m1 = c.d;
        }
        this.i = m1;
        this.j = m0;
        this.k = m1;
    }

    public b(Object object0, o0 o00, Object object1, int v) {
        if((v & 4) != 0) {
            object1 = null;
        }
        this(object0, o00, object1);
    }

    public static final Object a(b b0, Object object0) {
        q q0 = b0.j;
        boolean z = j.a(q0, b0.h);
        q q1 = b0.k;
        if(!z || !j.a(q1, b0.i)) {
            o0 o00 = b0.a;
            q q2 = (q)o00.a.n(object0);
            int v = q2.b();
            boolean z1 = false;
            for(int v1 = 0; v1 < v; ++v1) {
                if(q2.a(v1) >= q0.a(v1) || q2.a(v1) <= q1.a(v1)) {
                    q2.e(v1, J.q(q2.a(v1), q0.a(v1), q1.a(v1)));
                    z1 = true;
                }
            }
            return z1 ? o00.b.n(q2) : object0;
        }
        return object0;
    }

    public static final void b(b b0) {
        b0.c.Z.d();
        b0.c.b0 = 0x8000000000000000L;
        b0.d.setValue(Boolean.FALSE);
    }

    public static Object c(b b0, Object object0, k k0, Function1 function10, g g0, int v) {
        if((v & 2) != 0) {
            k0 = b0.g;
        }
        Object object1 = b0.a.b.n(b0.c.Z);
        if((v & 8) != 0) {
            function10 = null;
        }
        Object object2 = b0.d();
        Object object3 = b0.a.a.n(object1);
        a a0 = new a(b0, object1, new c0(k0, b0.a, object2, object0, ((q)object3)), b0.c.b0, function10, null);
        return Q.a(b0.f, a0, g0);
    }

    public final Object d() {
        return this.c.Y.getValue();
    }

    public final Object e(Object object0, g g0) {
        s2.a a0 = new s2.a(this, object0, null, 1);
        Object object1 = Q.a(this.f, a0, g0);
        return object1 == Eb.a.X ? object1 : t.a;
    }

    public final Object f(Fb.j j0) {
        I0 i00 = new I0(this, null, 2);
        Object object0 = Q.a(this.f, i00, j0);
        return object0 == Eb.a.X ? object0 : t.a;
    }
}

