package q5;

import q7.c;
import q7.d;

public final class e implements d {
    public static final e a;
    public static final c b;
    public static final c c;
    public static final c d;
    public static final c e;
    public static final c f;
    public static final c g;
    public static final c h;

    static {
        e.a = new e();  // initializer: Ljava/lang/Object;-><init>()V
        e.b = c.a("eventTimeMs");
        e.c = c.a("eventCode");
        e.d = c.a("eventUptimeMs");
        e.e = c.a("sourceExtension");
        e.f = c.a("sourceExtensionJsonProto3");
        e.g = c.a("timezoneOffsetSeconds");
        e.h = c.a("networkConnectionInfo");
    }

    @Override  // q7.a
    public final void a(Object object0, Object object1) {
        ((q7.e)object1).f(e.b, ((k)(((r)object0))).a);
        ((q7.e)object1).a(e.c, ((k)(((r)object0))).b);
        ((q7.e)object1).f(e.d, ((k)(((r)object0))).c);
        ((q7.e)object1).a(e.e, ((k)(((r)object0))).d);
        ((q7.e)object1).a(e.f, ((k)(((r)object0))).e);
        ((q7.e)object1).f(e.g, ((k)(((r)object0))).f);
        ((q7.e)object1).a(e.h, ((k)(((r)object0))).g);
    }
}

