package f9;

import Nb.j;
import p2.b;

public final class p0 extends b {
    public static final p0 d;

    static {
        p0.d = new p0();  // initializer: Ljava/lang/Object;-><init>()V
    }

    @Override  // p2.b
    public final boolean b(Object object0, Object object1) {
        j.f(((f9.j)object0), "oldItem");
        j.f(((f9.j)object1), "newItem");
        return ((f9.j)object0).equals(((f9.j)object1));
    }

    @Override  // p2.b
    public final boolean d(Object object0, Object object1) {
        j.f(((f9.j)object0), "oldItem");
        j.f(((f9.j)object1), "newItem");
        return j.a(((f9.j)object0).a, ((f9.j)object1).a);
    }
}

