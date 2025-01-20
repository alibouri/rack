package c8;

import Nb.j;
import Nb.k;
import S5.c;
import T1.a;
import W1.b;
import android.app.Application;
import android.os.Build.VERSION;
import android.os.Process;
import android.util.Log;
import kotlin.jvm.functions.Function1;

public final class g extends k implements Function1 {
    public static final g X;

    static {
        g.X = new g(1);  // initializer: LNb/k;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        String s;
        j.f(((a)object0), "ex");
        StringBuilder stringBuilder0 = new StringBuilder("CorruptionException in settings DataStore in ");
        int v = Build.VERSION.SDK_INT;
        if(v >= 33) {
            s = Process.myProcessName();
            j.e(s, "myProcessName()");
        }
        else if(v >= 28) {
            s = Application.getProcessName();
            if(s == null) {
                goto label_10;
            }
        }
        else {
        label_10:
            s = c.b();
            if(s == null) {
                s = "";
            }
        }
        stringBuilder0.append(s);
        stringBuilder0.append('.');
        Log.w("SessionsSettings", stringBuilder0.toString(), ((a)object0));
        return new b(true);
    }
}

