package h8;

import e8.s;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import l8.a;
import l8.b;

public final class k extends s {
    public final e8.k a;
    public final s b;
    public final Type c;

    public k(e8.k k0, s s0, Type type0) {
        this.a = k0;
        this.b = s0;
        this.c = type0;
    }

    @Override  // e8.s
    public final Object a(a a0) {
        return this.b.a(a0);
    }

    @Override  // e8.s
    public final void b(b b0, Object object0) {
        Type type0 = this.c;
        Type type1 = object0 == null || type0 != Object.class && !(type0 instanceof TypeVariable) && !(type0 instanceof Class) ? type0 : object0.getClass();
        s s0 = this.b;
        if(type1 != type0) {
            k8.a a0 = new k8.a(type1);
            s s1 = this.a.c(a0);
            if(!(s1 instanceof h) || s0 instanceof h) {
                s0 = s1;
            }
        }
        s0.b(b0, object0);
    }
}

