package i;

import F1.f;
import F1.j;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n2.b;
import n2.d;
import s.a;
import v1.e;

public final class l implements Runnable {
    public final int X;
    public final Context Y;

    public l(Context context0, int v) {
        this.X = v;
        this.Y = context0;
        super();
    }

    @Override
    public final void run() {
        f f0;
        switch(this.X) {
            case 0: {
                int v = Build.VERSION.SDK_INT;
                if(v >= 33) {
                    Context context0 = this.Y;
                    ComponentName componentName0 = new ComponentName(context0, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if(context0.getPackageManager().getComponentEnabledSetting(componentName0) != 1) {
                        if(v >= 33) {
                            Object object0 = null;
                            o.e0.getClass();
                            a a0 = new a(o.e0);
                            while(a0.hasNext()) {
                                o o0 = (o)((WeakReference)a0.next()).get();
                                if(o0 != null) {
                                    Context context1 = ((B)o0).i0;
                                    if(context1 != null) {
                                        object0 = context1.getSystemService("locale");
                                        break;
                                    }
                                }
                            }
                            f0 = object0 == null ? f.b : new f(new j(n.a(object0)));
                        }
                        else {
                            f0 = o.Z;
                            if(f0 == null) {
                                f0 = f.b;
                            }
                        }
                        if(f0.a.isEmpty()) {
                            String s = e.e(context0);
                            Object object1 = context0.getSystemService("locale");
                            if(object1 != null) {
                                n.b(object1, m.a(s));
                            }
                        }
                        context0.getPackageManager().setComponentEnabledSetting(componentName0, 1, 1);
                    }
                }
                o.d0 = true;
                return;
            }
            case 1: {
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new l(this.Y, 2));
                return;
            }
            default: {
                b b0 = new b(0);
                d.t(this.Y, b0, d.a, false);
            }
        }
    }
}

