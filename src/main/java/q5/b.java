package q5;

import q7.c;
import q7.d;
import q7.e;

public final class b implements d {
    public static final b a;
    public static final c b;
    public static final c c;
    public static final c d;
    public static final c e;
    public static final c f;
    public static final c g;
    public static final c h;
    public static final c i;
    public static final c j;
    public static final c k;
    public static final c l;
    public static final c m;

    static {
        b.a = new b();  // initializer: Ljava/lang/Object;-><init>()V
        b.b = c.a("sdkVersion");
        b.c = c.a("model");
        b.d = c.a("hardware");
        b.e = c.a("device");
        b.f = c.a("product");
        b.g = c.a("osBuild");
        b.h = c.a("manufacturer");
        b.i = c.a("fingerprint");
        b.j = c.a("locale");
        b.k = c.a("country");
        b.l = c.a("mccMnc");
        b.m = c.a("applicationBuild");
    }

    @Override  // q7.a
    public final void a(Object object0, Object object1) {
        ((e)object1).a(b.b, ((h)(((a)object0))).a);
        ((e)object1).a(b.c, ((h)(((a)object0))).b);
        ((e)object1).a(b.d, ((h)(((a)object0))).c);
        ((e)object1).a(b.e, ((h)(((a)object0))).d);
        ((e)object1).a(b.f, ((h)(((a)object0))).e);
        ((e)object1).a(b.g, ((h)(((a)object0))).f);
        ((e)object1).a(b.h, ((h)(((a)object0))).g);
        ((e)object1).a(b.i, ((h)(((a)object0))).h);
        ((e)object1).a(b.j, ((h)(((a)object0))).i);
        ((e)object1).a(b.k, ((h)(((a)object0))).j);
        ((e)object1).a(b.l, ((h)(((a)object0))).k);
        ((e)object1).a(b.m, ((h)(((a)object0))).l);
    }
}

