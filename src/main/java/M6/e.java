package M6;

import N6.k;
import N6.q;
import O6.a;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import o6.i;
import o6.p;

public final class e {
    public final j a;
    public final c b;
    public final Context c;

    public e(j j0, c c0, Context context0) {
        new Handler(Looper.getMainLooper());
        this.a = j0;
        this.b = c0;
        this.c = context0;
    }

    public final p a() {
        j j0 = this.a;
        q q0 = j0.a;
        if(q0 == null) {
            Object[] arr_object = {-9};
            k k0 = j.e;
            k0.getClass();
            if(Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", k.f(k0.Y, "onError(%d)", arr_object));
            }
            return o6.k.d(new a(-9));
        }
        j.e.e("requestUpdateInfo(%s)", new Object[]{"com.wave.personal"});
        i i0 = new i();
        f f0 = new f(q0, i0, i0, new f(j0, i0, "com.wave.personal", i0), 2);
        q0.a().post(f0);
        return i0.a;
    }
}

