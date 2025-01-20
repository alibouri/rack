package e0;

import Nb.j;
import Y.c;

public final class o extends v {
    public c c;
    public int d;
    public int e;

    public o(c c0) {
        this.c = c0;
    }

    @Override  // e0.v
    public final void a(v v0) {
        synchronized(q.a) {
            j.d(v0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord.assign$lambda$0>");
            this.c = ((o)v0).c;
            this.d = ((o)v0).d;
            this.e = ((o)v0).e;
        }
    }

    @Override  // e0.v
    public final v b() {
        return new o(this.c);
    }
}

