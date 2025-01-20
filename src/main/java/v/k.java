package v;

import B.o;
import U.Z;
import U.l0;
import U.l;
import U.p;
import W.d;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.functions.Function2;

public final class K {
    public final d a;
    public final ParcelableSnapshotMutableState b;
    public long c;
    public final ParcelableSnapshotMutableState d;

    public K() {
        this.a = new d(new H[16]);
        this.b = U.d.D(Boolean.FALSE, Z.e);
        this.c = 0x8000000000000000L;
        this.d = U.d.D(Boolean.TRUE, Z.e);
    }

    public final void a(int v, p p0) {
        p0.S(0xED0B0967);
        if((((v & 6) == 0 ? (p0.h(this) ? 4 : 2) | v : v) & 3) != 2 || !p0.x()) {
            Object object0 = p0.G();
            Z z0 = l.a;
            if(object0 == z0) {
                object0 = U.d.D(null, Z.e);
                p0.a0(object0);
            }
            if(((Boolean)this.d.getValue()).booleanValue() || ((Boolean)this.b.getValue()).booleanValue()) {
                p0.Q(0x6683D52A);
                boolean z1 = p0.h(this);
                Object object1 = p0.G();
                if(z1 || object1 == z0) {
                    object1 = new J(((MutableState)object0), this, null);
                    p0.a0(object1);
                }
                U.H.d(p0, this, ((Function2)object1));
            }
            else {
                p0.Q(0x669B07D8);
            }
            p0.p(false);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new o(v, 9, this);
        }
    }
}

