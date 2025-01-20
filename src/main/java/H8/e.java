package h8;

import com.apollographql.apollo.api.b;
import e8.n;
import e8.s;
import g8.m;
import j6.x;
import java.lang.reflect.Type;
import java.util.Map.Entry;
import java.util.Map;
import l8.a;

public final class e extends s {
    public final k a;
    public final k b;
    public final m c;
    public final c d;

    public e(c c0, e8.k k0, Type type0, s s0, Type type1, s s1, m m0) {
        this.d = c0;
        this.a = new k(k0, s0, type0);
        this.b = new k(k0, s1, type1);
        this.c = m0;
    }

    @Override  // e8.s
    public final Object a(a a0) {
        int v = a0.O();
        if(v == 9) {
            a0.G();
            return null;
        }
        Map map0 = (Map)this.c.r();
        s s0 = this.b.b;
        s s1 = this.a.b;
        if(v == 1) {
            a0.a();
            while(a0.hasNext()) {
                a0.a();
                Object object0 = s1.a(a0);
                if(map0.put(object0, s0.a(a0)) != null) {
                    throw new n("duplicate key: " + object0);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                }
                a0.l();
            }
            a0.l();
            return map0;
        }
        a0.b();
        while(a0.hasNext()) {
            x.Y.getClass();
            switch((a0.f0 == 0 ? a0.h() : a0.f0)) {
                case 12: {
                    a0.f0 = 8;
                    break;
                }
                case 13: {
                    a0.f0 = 9;
                    break;
                }
                case 14: {
                    a0.f0 = 10;
                    break;
                }
                default: {
                    throw new IllegalStateException("Expected a name but was " + b.A(a0.O()) + a0.z());
                }
            }
            Object object1 = s1.a(a0);
            if(map0.put(object1, s0.a(a0)) != null) {
                throw new n("duplicate key: " + object1);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
            }
            if(false) {
                break;
            }
        }
        a0.q();
        return map0;
    }

    @Override  // e8.s
    public final void b(l8.b b0, Object object0) {
        if(((Map)object0) == null) {
            b0.z();
            return;
        }
        this.d.getClass();
        k k0 = this.b;
        b0.f();
        for(Object object1: ((Map)object0).entrySet()) {
            b0.r(String.valueOf(((Map.Entry)object1).getKey()));
            k0.b(b0, ((Map.Entry)object1).getValue());
        }
        b0.q();
    }
}

