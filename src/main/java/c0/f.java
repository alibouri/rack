package c0;

import U.Q0;
import U.g0;
import U.j0;
import Z.c;
import Z.m;

public final class f extends c implements g0 {
    public static final f b0;

    static {
        f.b0 = new f(m.e, 0);  // initializer: LZ/c;-><init>(LZ/m;I)V
    }

    @Override  // Z.c
    public final boolean containsKey(Object object0) {
        return object0 instanceof j0 ? super.containsKey(((j0)object0)) : false;
    }

    @Override  // Bb.h
    public final boolean containsValue(Object object0) {
        return object0 instanceof Q0 ? super.containsValue(((Q0)object0)) : false;
    }

    @Override  // Z.c
    public final Object get(Object object0) {
        return !(object0 instanceof j0) ? null : ((Q0)super.get(((j0)object0)));
    }

    @Override
    public final Object getOrDefault(Object object0, Object object1) {
        return !(object0 instanceof j0) ? object1 : ((Q0)super.getOrDefault(((j0)object0), ((Q0)object1)));
    }
}

