package R7;

import E7.n;
import H7.c;
import I7.a;
import S7.d;
import T7.b;
import Z6.g;
import android.content.pm.PackageManager.NameNotFoundException;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

public final class e implements Runnable {
    public final int X;
    public final f Y;

    public e(f f0, int v) {
        this.X = v;
        this.Y = f0;
        super();
    }

    @Override
    public final void run() {
        I7.f f1;
        d d0;
        String s;
        if(this.X != 0) {
            f f0 = this.Y;
            g g0 = f0.b0;
            g0.a();
            f0.h0 = g0.a;
            f0.m0 = "com.wave.personal";
            f0.i0 = a.e();
            f0.j0 = new R7.d(f0.h0, new S7.g(100L, 1L, TimeUnit.MINUTES));
            f0.k0 = c.a();
            x7.a a0 = f0.e0;
            a a1 = f0.i0;
            a1.getClass();
            synchronized(I7.f.class) {
                if(I7.f.b == null) {
                    I7.f.b = new I7.f();  // initializer: Ljava/lang/Object;-><init>()V
                }
                f1 = I7.f.b;
            }
            f1.getClass();
            Long long0 = (Long)a1.a.getRemoteConfigValueOrDefault("fpr_log_source", -1L);
            long0.getClass();
            Map map0 = I7.f.c;
            if(map0.containsKey(long0)) {
                s = (String)map0.get(long0);
                if(s == null) {
                    d0 = a1.d(f1);
                    s = d0.b() ? ((String)d0.a()) : "FIREPERF";
                }
                else {
                    a1.c.f("com.google.firebase.perf.LogSourceName", s);
                }
            }
            else {
                d0 = a1.d(f1);
                s = d0.b() ? ((String)d0.a()) : "FIREPERF";
            }
            f0.f0 = new R7.a(a0, s);
            f0.k0.d(new WeakReference(f.q0));
            T7.e e0 = T7.g.F();
            f0.l0 = e0;
            g g1 = f0.b0;
            g1.a();
            e0.j();
            T7.g.u(((T7.g)e0.Y), g1.c.b);
            T7.a a2 = b.A();
            String s1 = f0.m0;
            a2.j();
            b.u(((b)a2.Y), s1);
            a2.j();
            b.v(((b)a2.Y));
            String s2 = "";
            try {
                String s3 = f0.h0.getPackageManager().getPackageInfo("com.wave.personal", 0).versionName;
                if(s3 != null) {
                    s2 = s3;
                }
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
            }
            a2.j();
            b.w(((b)a2.Y), s2);
            e0.j();
            T7.g.y(((T7.g)e0.Y), ((b)a2.h()));
            f0.Z.set(true);
            while(true) {
                ConcurrentLinkedQueue concurrentLinkedQueue0 = f0.Y;
                if(concurrentLinkedQueue0.isEmpty()) {
                    break;
                }
                R7.b b0 = (R7.b)concurrentLinkedQueue0.poll();
                if(b0 != null) {
                    n n0 = new n(f0, 17, b0);
                    f0.g0.execute(n0);
                }
            }
            return;
        }
        R7.d d1 = this.Y.j0;
        boolean z = this.Y.o0;
        d1.d.a(z);
        d1.e.a(z);
    }
}

