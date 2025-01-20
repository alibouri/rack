package Y2;

import A0.b;
import Ec.q;
import H6.e;
import Kb.j;
import R2.m;
import Xb.V;
import android.app.ActivityManager;
import android.content.Context;
import b3.a;
import b3.h;
import g3.c;
import io.sentry.g1;
import java.io.File;
import kotlin.jvm.functions.Function0;
import m3.k;

public final class d implements Function0 {
    public final int X;
    public final m Y;

    public d(m m0, int v) {
        this.X = v;
        this.Y = m0;
        super();
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int v2;
        int v = 0;
        if(this.X != 0) {
            k k0 = k.a;
            Context context0 = (Context)this.Y.X;
            synchronized(k0) {
                h h0 = k.b;
                if(h0 == null) {
                    a a0 = new a();  // initializer: Ljava/lang/Object;-><init>()V
                    a0.b = q.a;
                    a0.c = 0.02;
                    a0.d = 0xA00000L;
                    a0.e = 0xFA00000L;
                    a0.f = V.c;
                    File file0 = context0.getCacheDir();
                    if(file0 == null) {
                        throw new IllegalStateException("cacheDir == null");
                    }
                    file0.mkdirs();
                    a0.a = e.n(j.c0(file0));
                    h0 = a0.a();
                    k.b = h0;
                    return h0;
                }
                return h0;
            }
        }
        Class class0 = ActivityManager.class;
        Context context1 = (Context)this.Y.X;
        double f = 0.2;
        try {
            Object object0 = context1.getSystemService(class0);
            Nb.j.c(object0);
            if(((ActivityManager)object0).isLowRamDevice()) {
                f = 0.15;
            }
        }
        catch(Exception unused_ex) {
        }
        b b0 = new b(7, false);
        if(f > 0.0) {
            try {
                Object object1 = context1.getSystemService(class0);
                Nb.j.c(object1);
                v2 = (context1.getApplicationInfo().flags & 0x100000) == 0 ? ((ActivityManager)object1).getMemoryClass() : ((ActivityManager)object1).getLargeMemoryClass();
            }
            catch(Exception unused_ex) {
                v2 = 0x100;
            }
            v = (int)(f * ((double)v2) * 1048576.0);
        }
        return v <= 0 ? new c(new B3.d(28, b0), b0) : new c(new g1(v, b0), b0);
    }
}

