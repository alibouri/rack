package w;

import U.Q;
import hc.d;
import hc.e;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

public final class l0 {
    public final AtomicReference a;
    public final d b;

    public l0() {
        this.a = new AtomicReference(null);
        this.b = e.a();
    }

    public static final void a(l0 l00, i0 i00) {
        while(true) {
            AtomicReference atomicReference0 = l00.a;
            i0 i01 = (i0)atomicReference0.get();
            if(i01 != null && i00.a.compareTo(i01.a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            do {
                if(atomicReference0.compareAndSet(i01, i00)) {
                    if(i01 != null) {
                        Q q0 = new Q("Mutation interrupted", 3);
                        i01.b.f(q0);
                    }
                    return;
                }
            }
            while(atomicReference0.get() == i01);
        }
    }
}

