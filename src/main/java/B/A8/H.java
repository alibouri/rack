package a8;

import q7.c;
import q7.d;
import q7.e;

public final class h implements d {
    public static final h a;
    public static final c b;
    public static final c c;
    public static final c d;
    public static final c e;
    public static final c f;
    public static final c g;
    public static final c h;

    static {
        h.a = new h();  // initializer: Ljava/lang/Object;-><init>()V
        h.b = c.a("sessionId");
        h.c = c.a("firstSessionId");
        h.d = c.a("sessionIndex");
        h.e = c.a("eventTimestampUs");
        h.f = c.a("dataCollectionStatus");
        h.g = c.a("firebaseInstallationId");
        h.h = c.a("firebaseAuthenticationToken");
    }

    @Override  // q7.a
    public final void a(Object object0, Object object1) {
        ((e)object1).a(h.b, ((M)object0).a);
        ((e)object1).a(h.c, ((M)object0).b);
        ((e)object1).e(h.d, ((M)object0).c);
        ((e)object1).f(h.e, ((M)object0).d);
        ((e)object1).a(h.f, ((M)object0).e);
        ((e)object1).a(h.g, ((M)object0).f);
        ((e)object1).a(h.h, ((M)object0).g);
    }
}

