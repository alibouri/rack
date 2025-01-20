package M5;

import N5.r;
import X1.h;
import Y6.b;
import android.os.Looper;

public final class j {
    public final Object a;
    public volatile Object b;
    public volatile Object c;

    public j(h h0) {
        this.a = h0;
    }

    public j(Looper looper0, Object object0, String s) {
        this.a = new p(looper0);
        r.k(object0, "Listener must not be null");
        this.b = object0;
        r.f(s);
        this.c = new M5.h(object0, s);
    }

    public void a(i i0) {
        b b0 = new b(this, 12, i0);
        ((p)this.a).execute(b0);
    }
}

