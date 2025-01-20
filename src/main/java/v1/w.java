package v1;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build.VERSION;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;

public final class w {
    public final Context a;
    public final NotificationManager b;

    static {
        new HashSet();
    }

    public w(Context context0) {
        this.a = context0;
        this.b = (NotificationManager)context0.getSystemService("notification");
    }

    public final boolean a() {
        if(Build.VERSION.SDK_INT >= 24) {
            return s.a(this.b);
        }
        AppOpsManager appOpsManager0 = (AppOpsManager)this.a.getSystemService("appops");
        int v = this.a.getApplicationInfo().uid;
        try {
            Class class0 = Class.forName(AppOpsManager.class.getName());
            Method method0 = class0.getMethod("checkOpNoThrow", Integer.TYPE, Integer.TYPE, String.class);
            Integer integer0 = (Integer)class0.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            integer0.getClass();
            return ((int)(((Integer)method0.invoke(appOpsManager0, integer0, v, "com.wave.personal")))) == 0;
        }
        catch(ClassNotFoundException | NoSuchMethodException | NoSuchFieldException | InvocationTargetException | IllegalAccessException | RuntimeException unused_ex) {
            return true;
        }
    }
}

