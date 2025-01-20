package a8;

import Bb.p;
import Bb.r;
import Bb.z;
import Nb.j;
import W1.e;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public abstract class y {
    public static final e a;

    static {
        y.a = new e("session_id");
    }

    public static ArrayList a(Context context0) {
        j.f(context0, "context");
        int v = context0.getApplicationInfo().uid;
        String s = context0.getApplicationInfo().processName;
        Object object0 = context0.getSystemService("activity");
        List list0 = null;
        ActivityManager activityManager0 = object0 instanceof ActivityManager ? ((ActivityManager)object0) : null;
        if(activityManager0 != null) {
            list0 = activityManager0.getRunningAppProcesses();
        }
        if(list0 == null) {
            list0 = z.X;
        }
        ArrayList arrayList0 = p.n0(list0);
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: arrayList0) {
            if(((ActivityManager.RunningAppProcessInfo)object1).uid == v) {
                arrayList1.add(object1);
            }
        }
        ArrayList arrayList2 = new ArrayList(r.b0(arrayList1));
        for(Object object2: arrayList1) {
            String s1 = ((ActivityManager.RunningAppProcessInfo)object2).processName;
            j.e(s1, "runningAppProcessInfo.processName");
            int v1 = ((ActivityManager.RunningAppProcessInfo)object2).pid;
            int v2 = ((ActivityManager.RunningAppProcessInfo)object2).importance;
            arrayList2.add(new s(j.a(((ActivityManager.RunningAppProcessInfo)object2).processName, s), s1, v1, v2));
        }
        return arrayList2;
    }
}

