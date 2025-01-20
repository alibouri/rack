package a8;

import q7.c;
import q7.d;
import q7.e;

public final class f implements d {
    public static final f a;
    public static final c b;
    public static final c c;
    public static final c d;
    public static final c e;

    static {
        f.a = new f();  // initializer: Ljava/lang/Object;-><init>()V
        f.b = c.a("processName");
        f.c = c.a("pid");
        f.d = c.a("importance");
        f.e = c.a("defaultProcess");
    }

    @Override  // q7.a
    public final void a(Object object0, Object object1) {
        ((e)object1).a(f.b, ((s)object0).a);
        ((e)object1).e(f.c, ((s)object0).b);
        ((e)object1).e(f.d, ((s)object0).c);
        ((e)object1).d(f.e, ((s)object0).d);
    }
}

