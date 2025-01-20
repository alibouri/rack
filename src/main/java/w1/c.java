package w1;

import M.J;
import android.app.AppOpsManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Process;
import android.text.TextUtils;
import java.io.File;
import java.util.Objects;
import v1.f;
import v1.w;

public abstract class c {
    public static final Object a;

    static {
    }

    public static int a(Context context0, String s) {
        if(s == null) {
            throw new NullPointerException("permission must be non-null");
        }
        if(Build.VERSION.SDK_INT < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", s)) {
            return new w(context0).a() ? 0 : -1;
        }
        return context0.checkPermission(s, Process.myPid(), Process.myUid());
    }

    public static int b(Context context0, String s) {
        int v4;
        int v = Process.myPid();
        int v1 = Process.myUid();
        if(context0.checkPermission(s, v, v1) != -1) {
            String s1 = AppOpsManager.permissionToOp(s);
            if(s1 == null) {
                return 0;
            }
            int v2 = Process.myUid();
            Class class0 = AppOpsManager.class;
            if(v2 != v1 || !Objects.equals("com.wave.personal", "com.wave.personal")) {
                v4 = ((AppOpsManager)context0.getSystemService(class0)).noteProxyOpNoThrow(s1, "com.wave.personal");
            }
            else {
                if(Build.VERSION.SDK_INT < 29) {
                    return ((AppOpsManager)context0.getSystemService(class0)).noteProxyOpNoThrow(s1, "com.wave.personal") == 0 ? 0 : -2;
                }
                AppOpsManager appOpsManager0 = (AppOpsManager)context0.getSystemService(class0);
                int v3 = 1;
                v4 = appOpsManager0 == null ? 1 : appOpsManager0.checkOpNoThrow(s1, Binder.getCallingUid(), "com.wave.personal");
                if(v4 == 0) {
                    String s2 = f.a(context0);
                    if(appOpsManager0 != null) {
                        v3 = appOpsManager0.checkOpNoThrow(s1, v1, s2);
                    }
                    return v3 == 0 ? 0 : -2;
                }
            }
            return v4 == 0 ? 0 : -2;
        }
        return -1;
    }

    public static File c(Context context0) {
        if(Build.VERSION.SDK_INT >= 24) {
            return a.b(context0);
        }
        String s = context0.getApplicationInfo().dataDir;
        return s == null ? null : new File(s);
    }

    public static String d(Context context0) {
        if(c.b(context0, "com.wave.personal.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION") != 0) {
            throw new RuntimeException(J.e("Permission ", "com.wave.personal.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION", " is required by your application to receive broadcasts, please add it to your manifest"));
        }
        return "com.wave.personal.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    }

    public static Intent e(Context context0, BroadcastReceiver broadcastReceiver0, IntentFilter intentFilter0, String s, int v) {
        if((v & 2) == 0 && (v & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if((v & 2) != 0 && (v & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        int v1 = Build.VERSION.SDK_INT;
        if(v1 >= 33) {
            return b.b(context0, broadcastReceiver0, intentFilter0, s, v);
        }
        if(v1 >= 26) {
            return b.a(context0, broadcastReceiver0, intentFilter0, s, v);
        }
        return (v & 4) == 0 || s != null ? context0.registerReceiver(broadcastReceiver0, intentFilter0, s, null) : context0.registerReceiver(broadcastReceiver0, intentFilter0, c.d(context0), null);
    }
}

