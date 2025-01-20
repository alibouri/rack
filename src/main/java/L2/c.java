package l2;

import Bb.p;
import Ca.v;
import Eb.a;
import G0.T;
import Nb.j;
import U.Z;
import U.d;
import U2.i;
import ac.B0;
import ac.h;
import ac.k0;
import android.os.Build;
import android.util.Log;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import k2.K;
import k2.O;
import k2.W0;
import k2.h1;
import k2.q;
import kotlin.coroutines.CoroutineContext;

public final class c {
    public final h a;
    public final CoroutineContext b;
    public final b c;
    public final ParcelableSnapshotMutableState d;
    public final ParcelableSnapshotMutableState e;

    public c(h h0) {
        j.f(h0, "flow");
        super();
        this.a = h0;
        CoroutineContext coroutineContext0 = (CoroutineContext)T.k0.getValue();
        this.b = coroutineContext0;
        b b0 = new b(this, coroutineContext0, (h0 instanceof k0 ? ((h1)p.q0(((k0)h0).a())) : null));
        this.c = b0;
        O o0 = b0.b();
        Z z0 = Z.e;
        this.d = d.D(o0, z0);
        q q0 = (q)((B0)b0.j.X).getValue();
        if(q0 == null) {
            q0 = new q(l2.h.a.a, l2.h.a.b, l2.h.a.c, l2.h.a, null);
        }
        this.e = d.D(q0, z0);
    }

    public final Object a(Fb.j j0) {
        i i0 = new i(new v(16, this), 3);
        this.c.j.d(i0, j0);
        return a.X;
    }

    public final Object b(int v) {
        b b0 = this.c;
        B0 b00 = b0.i;
        do {
            Object object0 = b00.getValue();
            ((Boolean)object0).getClass();
        }
        while(!b00.j(object0, Boolean.TRUE));
        b0.g = true;
        b0.h = v;
        if(Build.ID != null && Log.isLoggable("Paging", 2)) {
            String s = "Accessing item index[" + v + ']';
            j.f(s, "message");
            Log.v("Paging", s, null);
        }
        K k0 = b0.b;
        if(k0 != null) {
            k0.a(b0.c.b(v));
        }
        W0 w00 = b0.c;
        if(v < 0) {
            w00.getClass();
        }
        else if(v < w00.g()) {
            int v1 = v - w00.Z;
            if(v1 >= 0 && v1 < w00.Y) {
                w00.getItem(v1);
            }
            B0 b01 = b0.i;
            do {
                Object object1 = b01.getValue();
                ((Boolean)object1).getClass();
            }
            while(!b01.j(object1, Boolean.FALSE));
            return ((O)this.d.getValue()).get(v);
        }
        StringBuilder stringBuilder0 = m5.b.A(v, "Index: ", ", Size: ");
        stringBuilder0.append(w00.g());
        throw new IndexOutOfBoundsException(stringBuilder0.toString());
    }
}

