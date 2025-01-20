package c2;

import f.b;
import java.util.concurrent.atomic.AtomicReference;

public final class o extends b {
    public final AtomicReference a;

    public o(AtomicReference atomicReference0) {
        this.a = atomicReference0;
    }

    @Override  // f.b
    public final void a(Object object0) {
        b b0 = (b)this.a.get();
        if(b0 == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        b0.a(object0);
    }
}

