package E7;

import q7.c;
import q7.d;
import t7.a;
import t7.e;

public final class b implements d {
    public static final b a;
    public static final c b;

    static {
        b.a = new b();  // initializer: Ljava/lang/Object;-><init>()V
        a a0 = new a(1);
        b.b = new c("messagingClientEvent", m5.b.D(m5.b.C(e.class, a0)));
    }

    @Override  // q7.a
    public final void a(Object object0, Object object1) {
        ((q7.e)object1).a(b.b, ((F7.e)object0).a);
    }
}

