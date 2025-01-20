package K5;

import U5.b;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller.SessionInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class f {
    public static final AtomicBoolean a = null;
    public static boolean b = false;
    public static boolean c = false;
    public static final AtomicBoolean d;
    public static final int e;

    static {
        f.a = new AtomicBoolean();
        f.d = new AtomicBoolean();
    }

    public static boolean a(Context context0) {
        if(!f.c) {
            try {
                PackageInfo packageInfo0 = b.a(context0).c(0x40, "com.google.android.gms");
                g.a(context0);
                f.b = packageInfo0 == null || g.d(packageInfo0, false) || !g.d(packageInfo0, true) ? false : true;
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", packageManager$NameNotFoundException0);
            }
            finally {
                f.c = true;
            }
        }
        return f.b || !"user".equals(Build.TYPE);
    }

    public static boolean b(Context context0) {
        try {
            List list0 = context0.getPackageManager().getPackageInstaller().getAllSessions();
        }
        catch(Exception unused_ex) {
            return false;
        }
        for(Object object0: list0) {
            if("com.google.android.gms".equals(((PackageInstaller.SessionInfo)object0).getAppPackageName())) {
                return true;
            }
            if(false) {
                break;
            }
        }
        PackageManager packageManager0 = context0.getPackageManager();
        try {
            return packageManager0.getApplicationInfo("com.google.android.gms", 0x2000).enabled;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return false;
        }
    }
}

