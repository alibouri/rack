package a8;

import M.J;
import Nb.j;
import S5.c;
import Vb.a;
import android.app.Application;
import android.os.Build.VERSION;
import android.os.Process;
import android.util.Base64;

public abstract class t {
    public static final String a;
    public static final String b;

    static {
        String s;
        int v = Build.VERSION.SDK_INT;
        if(v >= 33) {
            s = Process.myProcessName();
            j.e(s, "myProcessName()");
        }
        else if(v >= 28) {
            s = Application.getProcessName();
            if(s == null) {
                goto label_8;
            }
        }
        else {
        label_8:
            s = c.b();
            if(s == null) {
                s = "";
            }
        }
        byte[] arr_b = s.getBytes(a.a);
        j.e(arr_b, "getBytes(...)");
        String s1 = Base64.encodeToString(arr_b, 10);
        t.a = J.e("firebase_session_", s1, "_data");
        t.b = J.e("firebase_session_", s1, "_settings");
    }
}

