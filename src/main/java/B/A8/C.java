package a8;

import q7.d;
import q7.e;

public final class c implements d {
    public static final c a;
    public static final q7.c b;
    public static final q7.c c;
    public static final q7.c d;
    public static final q7.c e;
    public static final q7.c f;
    public static final q7.c g;

    static {
        c.a = new c();  // initializer: Ljava/lang/Object;-><init>()V
        c.b = q7.c.a("packageName");
        c.c = q7.c.a("versionName");
        c.d = q7.c.a("appBuildVersion");
        c.e = q7.c.a("deviceManufacturer");
        c.f = q7.c.a("currentProcessDetails");
        c.g = q7.c.a("appProcessDetails");
    }

    @Override  // q7.a
    public final void a(Object object0, Object object1) {
        ((e)object1).a(c.b, ((a)object0).a);
        ((e)object1).a(c.c, ((a)object0).b);
        ((e)object1).a(c.d, ((a)object0).c);
        ((e)object1).a(c.e, ((a)object0).d);
        ((e)object1).a(c.f, ((a)object0).e);
        ((e)object1).a(c.g, ((a)object0).f);
    }
}

