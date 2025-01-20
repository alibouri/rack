package k2;

import K.v;
import Nb.j;
import androidx.recyclerview.widget.a;
import f9.p0;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import p2.A;
import p2.b;

public final class g {
    public final a a;
    public final v b;
    public final CopyOnWriteArrayList c;
    public c1 d;
    public c1 e;
    public int f;
    public final e g;
    public final d h;
    public final CopyOnWriteArrayList i;
    public final f j;

    public g(d1 d10) {
        p0 p00 = p0.d;
        super();
        this.c = new CopyOnWriteArrayList();
        e e0 = new e(this);
        this.g = e0;
        this.h = new d(2, 0, Z0.class, e0, "setState", "setState(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V");  // initializer: LNb/h;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V
        this.i = new CopyOnWriteArrayList();
        this.j = new f(this);
        this.a = new a(d10);
        synchronized(b.a) {
            if(b.b == null) {
                b.b = Executors.newFixedThreadPool(2);
            }
        }
        this.b = new v(b.b, 15, p00);
    }

    public final A a() {
        A a0 = this.a;
        if(a0 != null) {
            return a0;
        }
        j.p("updateCallback");
        throw null;
    }

    public final void b(c1 c10, c1 c11) {
        for(Object object0: this.c) {
            ((c)object0).a.j(c10, c11);
        }
    }
}

