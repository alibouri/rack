package X1;

import android.util.SparseArray;

public final class r {
    public final SparseArray a;
    public u b;

    public r(int v) {
        this.a = new SparseArray(v);
    }

    public final void a(u u0, int v, int v1) {
        int v2 = u0.a(v);
        SparseArray sparseArray0 = this.a;
        r r0 = sparseArray0 == null ? null : ((r)sparseArray0.get(v2));
        if(r0 == null) {
            r0 = new r(1);
            sparseArray0.put(u0.a(v), r0);
        }
        if(v1 > v) {
            r0.a(u0, v + 1, v1);
            return;
        }
        r0.b = u0;
    }
}

