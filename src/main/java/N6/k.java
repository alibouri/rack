package N6;

import A3.e;
import M.J;
import X1.n;
import X1.u;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.apollographql.apollo.api.b;
import java.util.Locale;

public final class k implements n {
    public final int X;
    public final String Y;

    public k(String s) {
        this.X = 0;
        super();
        this.Y = e.u(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ") + s;
    }

    public k(String s, int v) {
        this.X = v;
        this.Y = s;
        super();
    }

    @Override  // X1.n
    public Object a() {
        return this;
    }

    public void b(String s, Object[] arr_object) {
        if(Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", k.f(this.Y, s, arr_object));
        }
    }

    public void c(RemoteException remoteException0, String s, Object[] arr_object) {
        if(Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", k.f(this.Y, s, arr_object), remoteException0);
        }
    }

    @Override  // X1.n
    public boolean d(CharSequence charSequence0, int v, int v1, u u0) {
        if(TextUtils.equals(charSequence0.subSequence(v, v1), this.Y)) {
            u0.c = u0.c & 3 | 4;
            return false;
        }
        return true;
    }

    public void e(String s, Object[] arr_object) {
        if(Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", k.f(this.Y, s, arr_object));
        }
    }

    public static String f(String s, String s1, Object[] arr_object) {
        if(arr_object.length > 0) {
            s1 = String.format(Locale.US, s1, arr_object);
        }
        return b.q(s, " : ", s1);
    }

    @Override
    public String toString() {
        return this.X == 2 ? J.g(new StringBuilder("<"), this.Y, '>') : super.toString();
    }
}

