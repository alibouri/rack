package K9;

import Ab.t;
import Eb.a;
import N4.j;
import android.content.Intent;
import android.net.Uri;
import kotlin.coroutines.g;
import kotlin.coroutines.k;
import q9.j3;
import q9.r1;
import v1.b;

public final class o0 extends j3 implements m0 {
    public final t0 b;
    public final t0 c;

    public o0(t0 t00) {
        this.c = t00;
        super(t00);
        this.b = t00;
    }

    @Override  // K9.m0
    public final Object S(y0 y00) {
        Object object0 = this.c.K(y00);
        return object0 == a.X ? object0 : t.a;
    }

    @Override  // K9.m0
    public final Object c(boolean z, g g0) {
        t0 t00 = this.c;
        t00.getClass();
        r1.b(t00).e().d("requesting contacts permission", null);
        if(!b.g(t00, "android.permission.READ_CONTACTS") && z) {
            k k0 = new k(j.w(g0));
            t00.I0 = k0;
            t00.startActivityForResult(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:com.wave.personal")), 2);
            return k0.c();
        }
        k k1 = new k(j.w(g0));
        t00.I0 = k1;
        b.f(this.b, new String[]{"android.permission.READ_CONTACTS"}, 1);
        return k1.c();
    }
}

