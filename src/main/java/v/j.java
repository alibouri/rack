package v;

import Nb.k;
import U.Z;
import U.d;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.functions.Function0;

public final class j {
    public final o0 a;
    public final Object b;
    public final long c;
    public final k d;
    public final ParcelableSnapshotMutableState e;
    public q f;
    public long g;
    public long h;
    public final ParcelableSnapshotMutableState i;

    public j(Object object0, o0 o00, q q0, long v, Object object1, long v1, Function0 function00) {
        this.a = o00;
        this.b = object1;
        this.c = v1;
        this.d = (k)function00;
        this.e = d.D(object0, Z.e);
        this.f = c.f(q0);
        this.g = v;
        this.h = 0x8000000000000000L;
        this.i = d.D(Boolean.TRUE, Z.e);
    }

    public final void a() {
        this.i.setValue(Boolean.FALSE);
        ((Function0)this.d).invoke();
    }

    public final Object b() {
        return this.a.b.n(this.f);
    }
}

