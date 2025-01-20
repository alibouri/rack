package e8;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import l8.a;
import l8.b;

public final class i extends s {
    public final int a;
    public final s b;

    public i(s s0, int v) {
        this.a = v;
        this.b = s0;
        super();
    }

    @Override  // e8.s
    public final Object a(a a0) {
        switch(this.a) {
            case 0: {
                return new AtomicLong(((Number)this.b.a(a0)).longValue());
            }
            case 1: {
                ArrayList arrayList0 = new ArrayList();
                a0.a();
                while(a0.hasNext()) {
                    arrayList0.add(((Number)this.b.a(a0)).longValue());
                }
                a0.l();
                int v = arrayList0.size();
                Object object0 = new AtomicLongArray(v);
                for(int v1 = 0; v1 < v; ++v1) {
                    ((AtomicLongArray)object0).set(v1, ((long)(((Long)arrayList0.get(v1)))));
                }
                return object0;
            }
            default: {
                if(a0.O() == 9) {
                    a0.G();
                    return null;
                }
                return this.b.a(a0);
            }
        }
    }

    @Override  // e8.s
    public final void b(b b0, Object object0) {
        switch(this.a) {
            case 0: {
                Long long0 = ((AtomicLong)object0).get();
                this.b.b(b0, long0);
                return;
            }
            case 1: {
                b0.b();
                int v = ((AtomicLongArray)object0).length();
                for(int v1 = 0; v1 < v; ++v1) {
                    Long long1 = ((AtomicLongArray)object0).get(v1);
                    this.b.b(b0, long1);
                }
                b0.l();
                return;
            }
            default: {
                if(object0 == null) {
                    b0.z();
                    return;
                }
                this.b.b(b0, object0);
            }
        }
    }
}

