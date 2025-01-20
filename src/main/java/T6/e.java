package T6;

import android.os.Process;
import android.util.Log;
import com.apollographql.apollo.api.b;
import java.util.Locale;

public final class e {
    public final String a;

    public e(String s, int v) {
        if(v != 1) {
            super();
            this.a = A3.e.u(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ") + s;
            return;
        }
        super();
        this.a = s + "_";
    }

    public String a(Object object0) {
        String s = object0.toString();
        if(s == null || s.length() == 0) {
            throw new IllegalArgumentException("Invalid key: " + s);
        }
        int v = s.length();
        for(int v1 = 0; v1 < v; v1 += Character.charCount(v2)) {
            int v2 = s.codePointAt(v1);
            if(!Character.isLetterOrDigit(v2)) {
                throw new IllegalArgumentException("Invalid key: " + s);
            }
        }
        return this.a + object0;
    }

    public void b(String s, Object[] arr_object) {
        if(Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", e.d(this.a, s, arr_object));
        }
    }

    public void c(String s, Object[] arr_object) {
        if(Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", e.d(this.a, s, arr_object));
        }
    }

    public static String d(String s, String s1, Object[] arr_object) {
        if(arr_object.length > 0) {
            s1 = String.format(Locale.US, s1, arr_object);
        }
        return b.q(s, " : ", s1);
    }
}

