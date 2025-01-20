package d7;

import N5.r;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.e0;
import com.google.android.gms.internal.measurement.h0;
import g.a;
import java.util.concurrent.ConcurrentHashMap;

public final class c implements b {
    public final a a;
    public static volatile c b;

    public c(a a0) {
        r.j(a0);
        this.a = a0;
        new ConcurrentHashMap();
    }

    public final void a(String s, String s1, Bundle bundle0) {
        if(e7.a.b.contains(s)) {
            return;
        }
        if(!e7.a.a(s1, bundle0)) {
            return;
        }
        if(!e7.a.c(s, s1, bundle0)) {
            return;
        }
        if("clx".equals(s) && "_ae".equals(s1)) {
            bundle0.putLong("_r", 1L);
        }
        e0 e00 = (e0)this.a.Y;
        e00.getClass();
        e00.e(new h0(e00, s, s1, bundle0, true, 2));
    }
}

