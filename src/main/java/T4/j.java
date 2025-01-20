package T4;

import M4.l;
import a5.h;
import android.content.pm.ApplicationInfo;
import f5.a;
import java.util.concurrent.atomic.AtomicBoolean;

public final class j {
    public static final j a;
    public static final AtomicBoolean b;

    static {
        j.a = new j();  // initializer: Ljava/lang/Object;-><init>()V
        j.b = new AtomicBoolean(false);
    }

    public static final void a() {
        Class class0 = j.class;
        if(a.b(class0)) {
            return;
        }
        try {
            if(j.b.get()) {
                if(j.a.b() && a5.j.b(h.t0)) {
                    d.e(l.a());
                    return;
                }
                c.b();
            }
            return;
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, class0);
    }

    public final boolean b() {
        if(a.b(this)) {
            return false;
        }
        try {
            ApplicationInfo applicationInfo0 = l.a().getPackageManager().getApplicationInfo("com.wave.personal", 0x80);
            Nb.j.e(applicationInfo0, "context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)");
            String s = applicationInfo0.metaData.getString("com.google.android.play.billingclient.version");
            return s == null ? false : Integer.parseInt(((String)Vb.j.p0(s, new String[]{"."}, 3, 2).get(0))) >= 2;
        }
        catch(Exception throwable0) {
            a.a(throwable0, this);
        }
        catch(Throwable unused_ex) {
        }
        return false;
    }
}

