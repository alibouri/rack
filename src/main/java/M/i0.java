package M;

import B.L0;
import Bb.u;
import Db.a;
import Nb.j;
import U.Z;
import U.d;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import s.m;
import s.v;

public final class i0 implements g0 {
    public boolean a;
    public final ArrayList b;
    public final v c;
    public final AtomicLong d;
    public z e;
    public V f;
    public W g;
    public x h;
    public z i;
    public z j;
    public final ParcelableSnapshotMutableState k;
    public static final K.v l;

    static {
        i0.l = new K.v(h0.X, 11, P.b0);
    }

    public i0(long v) {
        this.b = new ArrayList();
        this.c = new v();
        this.d = new AtomicLong(v);
        j.d(m.a, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.emptyLongObjectMap>");
        this.k = d.D(m.a, Z.e);
    }

    public final v a() {
        return (v)this.k.getValue();
    }

    public final boolean b(LayoutCoordinates layoutCoordinates0, long v, long v1, r r0, boolean z) {
        W w0 = this.g;
        if(w0 != null) {
            long v2 = a0.a(w0.X, layoutCoordinates0, v);
            long v3 = a0.a(w0.X, layoutCoordinates0, v1);
            w0.X.l(z);
            return w0.X.p(v2, v3, false, r0);
        }
        return true;
    }

    public final ArrayList c(LayoutCoordinates layoutCoordinates0) {
        ArrayList arrayList0 = this.b;
        if(!this.a) {
            u.e0(arrayList0, new a(1, new L0(8, layoutCoordinates0)));
            this.a = true;
        }
        return arrayList0;
    }

    public final void d(M.m m0) {
        int v12;
        v v0 = this.c;
        if(!v0.b(m0.a)) {
            return;
        }
        this.b.remove(m0);
        long v1 = m0.a;
        int v2 = ((int)(v1 >>> 0x20 ^ v1)) * 0xCC9E2D51;
        int v3 = v2 ^ v2 << 16;
        int v4 = v0.d;
        int v5 = v3 >>> 7 & v4;
        int v6 = 0;
        while(true) {
            int v7 = (v5 & 7) << 3;
            long v8 = v0.a[(v5 >> 3) + 1] << 0x40 - v7 & -((long)v7) >> 0x3F | v0.a[v5 >> 3] >>> v7;
            long v9 = ((long)(v3 & 0x7F)) * 0x101010101010101L ^ v8;
            long v10 = ~v9 & v9 - 0x101010101010101L & 0x8080808080808080L;
            while(v10 != 0L) {
                int v11 = (Long.numberOfTrailingZeros(v10) >> 3) + v5 & v4;
                if(v0.b[v11] == v1) {
                    v12 = v11;
                    goto label_23;
                }
                v10 &= v10 - 1L;
            }
            if((v8 & ~v8 << 6 & 0x8080808080808080L) == 0L) {
                goto label_38;
            }
            else {
                v12 = -1;
            }
        label_23:
            if(v12 >= 0) {
                --v0.e;
                long[] arr_v = v0.a;
                int v13 = v0.d;
                int v14 = (v12 & 7) << 3;
                long v15 = arr_v[v12 >> 3] & ~(0xFFL << v14) | 0xFEL << v14;
                arr_v[v12 >> 3] = v15;
                arr_v[(v12 - 7 & v13) + (v13 & 7) >> 3] = v15;
                Object[] arr_object = v0.c;
                Object object0 = arr_object[v12];
                arr_object[v12] = null;
            }
            z z0 = this.j;
            if(z0 != null) {
                z0.n(v1);
            }
            return;
        label_38:
            v6 += 8;
            v5 = v5 + v6 & v4;
        }
    }
}

