package f1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import yc.l;

public final class e extends l {
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;
    public final AtomicReferenceFieldUpdater f;

    public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater1, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4) {
        this.b = atomicReferenceFieldUpdater0;
        this.c = atomicReferenceFieldUpdater1;
        this.d = atomicReferenceFieldUpdater2;
        this.e = atomicReferenceFieldUpdater3;
        this.f = atomicReferenceFieldUpdater4;
    }

    @Override  // yc.l
    public final void A(g g0, g g1) {
        this.c.lazySet(g0, g1);
    }

    @Override  // yc.l
    public final void B(g g0, Thread thread0) {
        this.b.lazySet(g0, thread0);
    }

    @Override  // yc.l
    public final boolean k(h h0, d d0, d d1) {
        do {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = this.e;
            if(atomicReferenceFieldUpdater0.compareAndSet(h0, d0, d1)) {
                return true;
            }
        }
        while(atomicReferenceFieldUpdater0.get(h0) == d0);
        return false;
    }

    @Override  // yc.l
    public final boolean l(h h0, Object object0, Object object1) {
        do {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = this.f;
            if(atomicReferenceFieldUpdater0.compareAndSet(h0, object0, object1)) {
                return true;
            }
        }
        while(atomicReferenceFieldUpdater0.get(h0) == object0);
        return false;
    }

    @Override  // yc.l
    public final boolean m(h h0, g g0, g g1) {
        do {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = this.d;
            if(atomicReferenceFieldUpdater0.compareAndSet(h0, g0, g1)) {
                return true;
            }
        }
        while(atomicReferenceFieldUpdater0.get(h0) == g0);
        return false;
    }
}

