package G2;

import H2.i;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public final class e extends i {
    public final int a;
    public final Object b;

    public e() {
        this.a = 1;
        super();
        this.b = new ArrayList(3);
    }

    public e(h h0) {
        this.a = 0;
        super();
        this.b = h0;
    }

    @Override  // H2.i
    public final void a(int v) {
        if(this.a != 0) {
            try {
                for(Object object0: ((ArrayList)this.b)) {
                    ((i)object0).a(v);
                }
                return;
            }
            catch(ConcurrentModificationException concurrentModificationException0) {
                throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException0);
            }
        }
        ((h)this.b).b(false);
    }

    @Override  // H2.i
    public void b(int v, float f, int v1) {
        if(this.a != 1) {
            return;
        }
        try {
            for(Object object0: ((ArrayList)this.b)) {
                ((i)object0).b(v, f, v1);
            }
        }
        catch(ConcurrentModificationException concurrentModificationException0) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException0);
        }
    }

    @Override  // H2.i
    public final void c(int v) {
        if(this.a != 0) {
            try {
                for(Object object0: ((ArrayList)this.b)) {
                    ((i)object0).c(v);
                }
                return;
            }
            catch(ConcurrentModificationException concurrentModificationException0) {
                throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException0);
            }
        }
        ((h)this.b).b(false);
    }
}

