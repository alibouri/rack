package h8;

import e8.k;
import e8.s;
import g8.l;
import java.util.ArrayList;
import l8.b;
import v.h;

public final class f extends s {
    public final k a;
    public static final a b;

    static {
        f.b = new a(2);
    }

    public f(k k0) {
        this.a = k0;
    }

    @Override  // e8.s
    public final Object a(l8.a a0) {
        switch(h.d(a0.O())) {
            case 0: {
                Object object1 = new ArrayList();
                a0.a();
                while(a0.hasNext()) {
                    ((ArrayList)object1).add(this.a(a0));
                }
                a0.l();
                return object1;
            }
            case 2: {
                Object object0 = new l();
                a0.b();
                while(a0.hasNext()) {
                    ((l)object0).put(a0.nextName(), this.a(a0));
                }
                a0.q();
                return object0;
            }
            case 5: {
                return a0.nextString();
            }
            case 6: {
                return a0.nextDouble();
            }
            case 7: {
                return Boolean.valueOf(a0.nextBoolean());
            }
            case 8: {
                a0.G();
                return null;
            }
            default: {
                throw new IllegalStateException();
            }
        }
    }

    @Override  // e8.s
    public final void b(b b0, Object object0) {
        if(object0 == null) {
            b0.z();
            return;
        }
        Class class0 = object0.getClass();
        this.a.getClass();
        k8.a a0 = new k8.a(class0);
        s s0 = this.a.c(a0);
        if(s0 instanceof f) {
            b0.f();
            b0.q();
            return;
        }
        s0.b(b0, object0);
    }
}

