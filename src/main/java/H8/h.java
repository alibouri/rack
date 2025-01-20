package h8;

import e8.n;
import e8.s;
import g8.m;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import l8.a;
import l8.b;

public final class h extends s {
    public final m a;
    public final LinkedHashMap b;

    public h(m m0, LinkedHashMap linkedHashMap0) {
        this.a = m0;
        this.b = linkedHashMap0;
    }

    @Override  // e8.s
    public final Object a(a a0) {
        if(a0.O() == 9) {
            a0.G();
            return null;
        }
        Object object0 = this.a.r();
        try {
            a0.b();
            while(true) {
                if(!a0.hasNext()) {
                    goto label_20;
                }
                String s = a0.nextName();
                g g0 = (g)this.b.get(s);
                if(g0 != null && g0.c) {
                    Object object1 = g0.f.a(a0);
                    if(object1 == null && g0.i) {
                        continue;
                    }
                    g0.d.set(object0, object1);
                }
                else {
                    a0.skipValue();
                }
            }
        }
        catch(IllegalStateException illegalStateException0) {
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new AssertionError(illegalAccessException0);
        }
        throw new n(illegalStateException0);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
    label_20:
        a0.q();
        return object0;
    }

    @Override  // e8.s
    public final void b(b b0, Object object0) {
        if(object0 == null) {
            b0.z();
            return;
        }
        b0.f();
        try {
            for(Object object1: this.b.values()) {
                g g0 = (g)object1;
                Field field0 = g0.d;
                if(g0.b && field0.get(object0) != object0) {
                    b0.r(g0.a);
                    Object object2 = field0.get(object0);
                    s s0 = g0.f;
                    if(!g0.e) {
                        s0 = new k(g0.g, s0, g0.h.b);
                    }
                    s0.b(b0, object2);
                }
            }
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new AssertionError(illegalAccessException0);
        }
        b0.q();
    }
}

