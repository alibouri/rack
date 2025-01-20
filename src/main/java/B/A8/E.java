package a8;

import q7.c;
import q7.d;

public final class e implements d {
    public static final e a;
    public static final c b;
    public static final c c;
    public static final c d;

    static {
        e.a = new e();  // initializer: Ljava/lang/Object;-><init>()V
        e.b = c.a("performance");
        e.c = c.a("crashlytics");
        e.d = c.a("sessionSamplingRate");
    }

    @Override  // q7.a
    public final void a(Object object0, Object object1) {
        ((q7.e)object1).a(e.b, ((j)object0).a);
        ((q7.e)object1).a(e.c, ((j)object0).b);
        ((q7.e)object1).g(e.d, ((j)object0).c);
    }
}

