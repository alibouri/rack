package G7;

import I7.a;
import R7.e;
import R7.f;
import S7.c;
import Z6.g;
import Z6.i;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import java.util.concurrent.ConcurrentHashMap;
import y7.d;

public final class b {
    public final ConcurrentHashMap a;
    public final a b;
    public Boolean c;
    public static final L7.a d;

    static {
        b.d = L7.a.d();
    }

    public b(g g0, x7.a a0, d d0, x7.a a1, RemoteConfigManager remoteConfigManager0, a a2, SessionManager sessionManager0) {
        this.a = new ConcurrentHashMap();
        Bundle bundle0 = null;
        this.c = null;
        if(g0 == null) {
            this.c = Boolean.FALSE;
            this.b = a2;
            new c(new Bundle());
            return;
        }
        f.q0.b0 = g0;
        g0.a();
        i i0 = g0.c;
        f.q0.n0 = i0.g;
        f.q0.d0 = d0;
        f.q0.e0 = a1;
        e e0 = new e(f.q0, 1);
        f.q0.g0.execute(e0);
        g0.a();
        Context context0 = g0.a;
        try {
            bundle0 = context0.getPackageManager().getApplicationInfo("com.wave.personal", 0x80).metaData;
        }
        catch(PackageManager.NameNotFoundException | NullPointerException packageManager$NameNotFoundException0) {
            Log.d("isEnabled", "No perf enable meta data found " + packageManager$NameNotFoundException0.getMessage());
        }
        c c0 = bundle0 == null ? new c() : new c(bundle0);
        remoteConfigManager0.setFirebaseRemoteConfigProvider(a0);
        this.b = a2;
        a2.b = c0;
        a.d.b = android.support.v4.media.session.a.G(context0);
        a2.c.c(context0);
        sessionManager0.setApplicationContext(context0);
        Boolean boolean0 = a2.h();
        this.c = boolean0;
        L7.a a3 = b.d;
        if(a3.b && (boolean0 == null ? g.c().h() : boolean0.booleanValue())) {
            g0.a();
            String s = "Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: " + (io.sentry.config.a.O(i0.g, "com.wave.personal") + "/trends?utm_source=perf-android-sdk&utm_medium=android-ide");
            if(a3.b) {
                a3.a.getClass();
                Log.i("FirebasePerformance", s);
            }
        }
    }
}

