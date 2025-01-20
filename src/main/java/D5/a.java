package d5;

import I2.J;
import J2.w;
import N4.c;
import Nb.j;
import android.app.ActivityManager.ProcessErrorStateInfo;
import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;

public abstract class a {
    public static final int a;
    public static final ScheduledExecutorService b;
    public static String c;
    public static final c d;

    static {
        a.a = Process.myUid();
        a.b = Executors.newSingleThreadScheduledExecutor();
        a.c = "";
        a.d = new c(17);
    }

    public static final void a(ActivityManager activityManager0) {
        Class class0 = a.class;
        if(f5.a.b(class0)) {
            return;
        }
        try {
            List list0 = activityManager0.getProcessesInErrorState();
            if(list0 != null) {
                for(Object object0: list0) {
                    ActivityManager.ProcessErrorStateInfo activityManager$ProcessErrorStateInfo0 = (ActivityManager.ProcessErrorStateInfo)object0;
                    if(activityManager$ProcessErrorStateInfo0.condition == 2 && activityManager$ProcessErrorStateInfo0.uid == a.a) {
                        Thread thread0 = Looper.getMainLooper().getThread();
                        j.e(thread0, "getMainLooper().thread");
                        StackTraceElement[] arr_stackTraceElement = thread0.getStackTrace();
                        JSONArray jSONArray0 = new JSONArray();
                        j.e(arr_stackTraceElement, "stackTrace");
                        int v = 0;
                        while(v < arr_stackTraceElement.length) {
                            StackTraceElement stackTraceElement0 = arr_stackTraceElement[v];
                            ++v;
                            jSONArray0.put(stackTraceElement0.toString());
                        }
                        String s = jSONArray0.toString();
                        if(!j.a(s, a.c) && w.N(thread0)) {
                            a.c = s;
                            J.j(activityManager$ProcessErrorStateInfo0.shortMsg, s).b();
                        }
                    }
                }
            }
        }
        catch(Throwable throwable0) {
            f5.a.a(throwable0, class0);
        }
    }
}

