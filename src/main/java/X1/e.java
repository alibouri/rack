package X1;

import G1.a;
import M5.j;
import R2.f;
import R2.w;
import T4.l;
import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.Set;

public final class e extends f {
    public final j a;

    public e(j j0) {
        this.a = j0;
    }

    @Override  // R2.f
    public final void v(Throwable throwable0) {
        ((h)this.a.a).e(throwable0);
    }

    @Override  // R2.f
    public final void w(R2.h h0) {
        this.a.c = h0;
        R2.h h1 = (R2.h)this.a.c;
        Set set0 = Build.VERSION.SDK_INT < 34 ? l.K() : m.a();
        this.a.b = new w(h1, ((h)this.a.a).g, ((h)this.a.a).i, set0);
        h h2 = (h)this.a.a;
        h2.getClass();
        ArrayList arrayList0 = new ArrayList();
        h2.a.writeLock().lock();
        try {
            h2.c = 1;
            arrayList0.addAll(h2.b);
            h2.b.clear();
        }
        catch(Throwable throwable0) {
            h2.a.writeLock().unlock();
            throw throwable0;
        }
        h2.a.writeLock().unlock();
        a a0 = new a(arrayList0, h2.c, null);
        h2.d.post(a0);
    }
}

