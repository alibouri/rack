package S2;

import I2.A;
import Nb.j;
import android.content.Context;
import android.os.PowerManager.WakeLock;
import android.os.PowerManager;

public abstract class k {
    public static final String a;

    static {
        String s = A.g("WakeLocks");
        j.e(s, "tagWithPrefix(\"WakeLocks\")");
        k.a = s;
    }

    public static final PowerManager.WakeLock a(Context context0, String s) {
        j.f(context0, "context");
        j.f(s, "tag");
        Object object0 = context0.getApplicationContext().getSystemService("power");
        j.d(object0, "null cannot be cast to non-null type android.os.PowerManager");
        PowerManager.WakeLock powerManager$WakeLock0 = ((PowerManager)object0).newWakeLock(1, "WorkManager: " + s);
        synchronized(l.a) {
            String s1 = (String)l.b.put(powerManager$WakeLock0, "WorkManager: " + s);
        }
        j.e(powerManager$WakeLock0, "wakeLock");
        return powerManager$WakeLock0;
    }
}

