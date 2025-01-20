package V4;

import M4.l;
import Nb.j;
import a5.m;
import android.content.Context;
import android.content.res.Configuration;
import io.sentry.android.core.AppComponentsBreadcrumbsIntegration;
import io.sentry.d;
import io.sentry.i1;
import io.sentry.protocol.f;
import io.sentry.x;
import java.util.Locale;

public final class a implements Runnable {
    public final int X;
    public final long Y;
    public final Object Z;
    public final Object b0;

    public a(long v, String s, Context context0) {
        this.X = 0;
        super();
        this.Y = v;
        this.Z = s;
        this.b0 = context0;
    }

    public a(AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration0, long v, Configuration configuration0) {
        this.X = 1;
        super();
        this.Z = appComponentsBreadcrumbsIntegration0;
        this.Y = v;
        this.b0 = configuration0;
    }

    @Override
    public final void run() {
        f f0 = null;
        if(this.X != 0) {
            AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration0 = (AppComponentsBreadcrumbsIntegration)this.Z;
            if(appComponentsBreadcrumbsIntegration0.Y != null) {
                switch(appComponentsBreadcrumbsIntegration0.X.getResources().getConfiguration().orientation) {
                    case 1: {
                        f0 = f.PORTRAIT;
                        break;
                    }
                    case 2: {
                        f0 = f.LANDSCAPE;
                    }
                }
                String s = f0 == null ? "undefined" : f0.name().toLowerCase(Locale.ROOT);
                d d0 = new d(this.Y);
                d0.b0 = "navigation";
                d0.d0 = "device.orientation";
                d0.b(s, "position");
                d0.f0 = i1.INFO;
                x x0 = new x();
                x0.c("android:configuration", ((Configuration)this.b0));
                appComponentsBreadcrumbsIntegration0.Y.c(d0, x0);
            }
            return;
        }
        long v = this.Y;
        String s1 = (String)this.Z;
        Context context0 = (Context)this.b0;
        Long long0 = V4.d.f == null ? null : ((Long)V4.d.f.c);
        if(V4.d.f == null) {
            V4.d.f = new o(v, null);
            String s2 = V4.d.h;
            j.e(context0, "appContext");
            p.c(context0, s1, s2);
        }
        else if(long0 != null) {
            long v1 = v - ((long)long0);
            m m0 = a5.p.b(l.b());
            if(v1 > ((long)((m0 == null ? 60 : m0.b) * 1000))) {
                p.e(s1, V4.d.f, V4.d.h);
                String s3 = V4.d.h;
                j.e(context0, "appContext");
                p.c(context0, s1, s3);
                V4.d.f = new o(v, null);
            }
            else if(v1 > 1000L) {
                o o0 = V4.d.f;
                if(o0 != null) {
                    ++o0.a;
                }
            }
        }
        o o1 = V4.d.f;
        if(o1 != null) {
            o1.c = v;
        }
        o o2 = V4.d.f;
        if(o2 != null) {
            o2.w();
        }
    }
}

