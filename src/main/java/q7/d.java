package Q7;

import L7.a;
import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager;
import android.content.Context;

public final class d {
    public final Runtime a;
    public final ActivityManager b;
    public final ActivityManager.MemoryInfo c;

    static {
        a.d();
    }

    public d(Context context0) {
        this.a = Runtime.getRuntime();
        ActivityManager activityManager0 = (ActivityManager)context0.getSystemService("activity");
        this.b = activityManager0;
        ActivityManager.MemoryInfo activityManager$MemoryInfo0 = new ActivityManager.MemoryInfo();
        this.c = activityManager$MemoryInfo0;
        activityManager0.getMemoryInfo(activityManager$MemoryInfo0);
    }
}

