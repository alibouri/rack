package V4;

import Nb.j;
import Vb.q;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import f5.a;
import java.util.Arrays;

public abstract class e {
    public static final String a(byte[] arr_b) {
        StringBuffer stringBuffer0 = new StringBuffer();
        int v = 0;
        while(v < arr_b.length) {
            int v1 = arr_b[v];
            ++v;
            stringBuffer0.append(String.format("%02x", Arrays.copyOf(new Object[]{((byte)v1)}, 1)));
        }
        String s = stringBuffer0.toString();
        j.e(s, "sb.toString()");
        return s;
    }

    public static final View b(Activity activity0) {
        Class class0 = e.class;
        if(a.b(class0)) {
            return null;
        }
        if(activity0 == null) {
            return null;
        }
        try {
            Window window0 = activity0.getWindow();
            return window0 == null ? null : window0.getDecorView().getRootView();
        }
        catch(Exception throwable0) {
            a.a(throwable0, class0);
        }
        catch(Throwable unused_ex) {
        }
        return null;
    }

    public static final boolean c() {
        String s = Build.FINGERPRINT;
        j.e(s, "FINGERPRINT");
        if(!q.O(s, "generic", false) && !q.O(s, "unknown", false)) {
            String s1 = Build.MODEL;
            j.e(s1, "MODEL");
            if(!Vb.j.R(s1, "google_sdk", false) && !Vb.j.R(s1, "Emulator", false) && !Vb.j.R(s1, "Android SDK built for x86", false)) {
                String s2 = Build.MANUFACTURER;
                j.e(s2, "MANUFACTURER");
                if(!Vb.j.R(s2, "Genymotion", false)) {
                    String s3 = Build.BRAND;
                    j.e(s3, "BRAND");
                    if(q.O(s3, "generic", false)) {
                        String s4 = Build.DEVICE;
                        j.e(s4, "DEVICE");
                        return q.O(s4, "generic", false) ? true : "google_sdk".equals(Build.PRODUCT);
                    }
                    return "google_sdk".equals(Build.PRODUCT);
                }
            }
        }
        return true;
    }
}

