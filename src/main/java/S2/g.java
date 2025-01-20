package S2;

import I2.A;
import I2.J;
import I2.b;
import Nb.j;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Process;
import java.lang.reflect.Method;
import java.util.List;

public abstract class g {
    public static final String a;

    static {
        String s = A.g("ProcessUtils");
        j.e(s, "tagWithPrefix(\"ProcessUtils\")");
        g.a = s;
    }

    public static final boolean a(Context context0, b b0) {
        String s;
        j.f(context0, "context");
        j.f(b0, "configuration");
        if(Build.VERSION.SDK_INT >= 28) {
            return j.a(A1.b.f(), context0.getApplicationInfo().processName);
        }
        try {
            s = null;
            Method method0 = Class.forName("android.app.ActivityThread", false, J.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
            method0.setAccessible(true);
            Object object0 = method0.invoke(null, null);
            j.c(object0);
            if(object0 instanceof String) {
                return j.a(((String)object0), context0.getApplicationInfo().processName);
            }
        }
        catch(Throwable throwable0) {
            A.e().b(g.a, "Unable to check ActivityThread for processName", throwable0);
        }
        int v = Process.myPid();
        Object object1 = context0.getSystemService("activity");
        j.d(object1, "null cannot be cast to non-null type android.app.ActivityManager");
        List list0 = ((ActivityManager)object1).getRunningAppProcesses();
        if(list0 != null) {
            Object object2 = null;
            for(Object object3: list0) {
                if(((ActivityManager.RunningAppProcessInfo)object3).pid == v) {
                    object2 = object3;
                    break;
                }
            }
            if(((ActivityManager.RunningAppProcessInfo)object2) != null) {
                s = ((ActivityManager.RunningAppProcessInfo)object2).processName;
            }
        }
        return j.a(s, context0.getApplicationInfo().processName);
    }
}

