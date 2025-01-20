package e0;

import U.e;

public abstract class u implements t {
    public final e X;

    public u() {
        this.X = new e(0);  // initializer: Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V
    }

    @Override  // e0.t
    public v g(v v0, v v1, v v2) {
        return null;
    }

    public final boolean h(int v) {
        return (v & this.X.get()) != 0;
    }

    public final void j(int v) {
        do {
            e e0 = this.X;
            int v1 = e0.get();
            if((v1 & v) != 0) {
                return;
            }
        }
        while(!e0.compareAndSet(v1, v1 | v));
    }
}

