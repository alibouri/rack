package V6;

import A3.e;
import android.os.Process;
import android.util.Log;
import com.apollographql.apollo.api.b;
import java.util.Locale;

public final class m {
    public final String a;

    public m(String s) {
        this.a = e.u(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ") + s;
    }

    public final void a(String s, Object[] arr_object) {
        if(Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", m.b(this.a, s, arr_object));
        }
    }

    public static String b(String s, String s1, Object[] arr_object) {
        if(arr_object.length > 0) {
            s1 = String.format(Locale.US, s1, arr_object);
        }
        return b.q(s, " : ", s1);
    }
}

