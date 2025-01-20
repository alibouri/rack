package l7;

import C3.i;
import Fc.d;
import N5.r;
import Q6.j;
import Z6.g;
import android.content.Context;
import java.util.concurrent.Executor;
import x7.a;

public final class c {
    public final String a;
    public final j b;
    public final i c;
    public final Executor d;
    public final Executor e;
    public final d f;

    public c(g g0, Executor executor0, Executor executor1) {
        g0.a();
        String s = g0.c.e;
        g0.a();
        Context context0 = g0.a;
        synchronized(Q6.i.class) {
            if(Q6.i.a == null) {
                Context context1 = context0.getApplicationContext();
                if(context1 != null) {
                    context0 = context1;
                }
                Q6.i.a = new B3.c(context0);
            }
        }
        j j0 = (j)((V6.d)Q6.i.a.Y).e();
        g0.a();
        g0.a();
        a a0 = ((h7.c)g0.b(h7.c.class)).b;
        i i0 = new i();  // initializer: Ljava/lang/Object;-><init>()V
        r.j(g0.a);
        r.j(g0.c);
        r.j(a0);
        i0.X = g0.a;
        i0.Y = g0.c.a;
        i0.Z = g0.c.b;
        i0.b0 = g0.c.g;
        if(g0.c.g == null) {
            throw new IllegalArgumentException("FirebaseOptions#getProjectId cannot be null.");
        }
        i0.c0 = a0;
        d d0 = new d();  // initializer: Ljava/lang/Object;-><init>()V
        d0.a = 0L;
        d0.b = -1L;
        super();
        this.a = s;
        this.b = j0;
        this.c = i0;
        this.d = executor0;
        this.e = executor1;
        this.f = d0;
    }
}

