package q5;

import q7.d;
import q7.e;

public final class c implements d {
    public static final c a;
    public static final q7.c b;

    static {
        c.a = new c();  // initializer: Ljava/lang/Object;-><init>()V
        c.b = q7.c.a("logRequest");
    }

    @Override  // q7.a
    public final void a(Object object0, Object object1) {
        ((e)object1).a(c.b, ((i)(((o)object0))).a);
    }
}

