package a8;

import q7.c;
import q7.e;

public final class d implements q7.d {
    public static final d a;
    public static final c b;
    public static final c c;
    public static final c d;
    public static final c e;
    public static final c f;
    public static final c g;

    static {
        d.a = new d();  // initializer: Ljava/lang/Object;-><init>()V
        d.b = c.a("appId");
        d.c = c.a("deviceModel");
        d.d = c.a("sessionSdkVersion");
        d.e = c.a("osVersion");
        d.f = c.a("logEnvironment");
        d.g = c.a("androidAppInfo");
    }

    @Override  // q7.a
    public final void a(Object object0, Object object1) {
        ((e)object1).a(d.b, ((b)object0).a);
        ((e)object1).a(d.c, ((b)object0).b);
        ((e)object1).a(d.d, "2.0.0");
        ((e)object1).a(d.e, ((b)object0).c);
        ((e)object1).a(d.f, r.Y);
        ((e)object1).a(d.g, ((b)object0).d);
    }
}

