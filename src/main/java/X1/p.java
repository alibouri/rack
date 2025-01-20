package X1;

import A0.b;
import Bb.F;
import E7.D;
import G1.d;
import G1.e;
import G1.j;
import M.J;
import R2.f;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class p implements g {
    public final Context a;
    public final e b;
    public final H6.e c;
    public final Object d;
    public Handler e;
    public ThreadPoolExecutor f;
    public ThreadPoolExecutor g;
    public f h;

    public p(Context context0, e e0) {
        this.d = new Object();
        F.n(context0, "Context cannot be null");
        this.a = context0.getApplicationContext();
        this.b = e0;
        this.c = q.d;
    }

    @Override  // X1.g
    public final void a(f f0) {
        synchronized(this.d) {
            this.h = f0;
        }
        this.c();
    }

    public final void b() {
        synchronized(this.d) {
            this.h = null;
            Handler handler0 = this.e;
            if(handler0 != null) {
                handler0.removeCallbacks(null);
            }
            this.e = null;
            ThreadPoolExecutor threadPoolExecutor0 = this.g;
            if(threadPoolExecutor0 != null) {
                threadPoolExecutor0.shutdown();
            }
            this.f = null;
            this.g = null;
        }
    }

    public final void c() {
        synchronized(this.d) {
            if(this.h == null) {
                return;
            }
            if(this.f == null) {
                a a0 = new a("emojiCompat");
                ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), a0);
                threadPoolExecutor0.allowCoreThreadTimeOut(true);
                this.g = threadPoolExecutor0;
                this.f = threadPoolExecutor0;
            }
            this.f.execute(new D(15, this));
        }
    }

    public final j d() {
        int v;
        b b0;
        try {
            this.c.getClass();
            ArrayList arrayList0 = new ArrayList(1);
            Objects.requireNonNull(this.b);
            arrayList0.add(this.b);
            List list0 = Collections.unmodifiableList(arrayList0);
            b0 = d.a(this.a, list0);
            v = b0.X;
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            throw new RuntimeException("provider not found", packageManager$NameNotFoundException0);
        }
        if(v != 0) {
            throw new RuntimeException(J.d(v, "fetchFonts failed (", ")"));
        }
        j[] arr_j = (j[])((List)b0.Y).get(0);
        if(arr_j == null || arr_j.length == 0) {
            throw new RuntimeException("fetchFonts failed (empty result)");
        }
        return arr_j[0];
    }
}

