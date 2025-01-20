package E;

import Aa.P;
import D0.u;
import U.H;
import U.Z;
import U.d;
import U.l0;
import U.l;
import U.p;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.saveable.SaveableStateRegistry.Entry;
import c0.b;
import d0.c;
import d0.j;
import d0.k;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

public final class d0 implements c, j {
    public final k a;
    public final ParcelableSnapshotMutableState b;
    public final LinkedHashSet c;

    public d0(j j0, Map map0) {
        k k0 = new k(map0, new b0(j0, 0));
        super();
        this.a = k0;
        this.b = d.D(null, Z.e);
        this.c = new LinkedHashSet();
    }

    @Override  // d0.j
    public final boolean a(Object object0) {
        return this.a.a(object0);
    }

    @Override  // d0.j
    public final Object b(String s) {
        return this.a.b(s);
    }

    @Override  // d0.j
    public final SaveableStateRegistry.Entry c(String s, Function0 function00) {
        return this.a.c(s, function00);
    }

    @Override  // d0.c
    public final void d(Object object0, b b0, p p0, int v) {
        p0.S(0xD671DF0F);
        int v1 = (v & 6) == 0 ? (p0.h(object0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.h(b0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.h(this) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && p0.x()) {
            p0.K();
        }
        else {
            c c0 = (c)this.b.getValue();
            if(c0 == null) {
                throw new IllegalArgumentException("null wrappedHolder");
            }
            c0.d(object0, b0, p0, v1 & 0x7E);
            boolean z = p0.h(this);
            boolean z1 = p0.h(object0);
            Object object1 = p0.G();
            if((z | z1) != 0 || object1 == l.a) {
                object1 = new P(this, 4, object0);
                p0.a0(object1);
            }
            H.b(object0, ((Function1)object1), p0);
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new u(this, object0, b0, v, 2);
        }
    }

    @Override  // d0.c
    public final void e(Object object0) {
        c c0 = (c)this.b.getValue();
        if(c0 == null) {
            throw new IllegalArgumentException("null wrappedHolder");
        }
        c0.e(object0);
    }
}

