package l7;

import E7.j;
import Q6.e;
import Q6.h;
import V6.o;
import android.util.Base64;
import o6.g;
import o6.i;
import o6.k;
import o6.p;

public final class b implements g {
    public final int X;
    public final c Y;

    public b(c c0, int v) {
        this.X = v;
        this.Y = c0;
        super();
    }

    @Override  // o6.g
    public final p i(Object object0) {
        byte[] arr_b;
        c c0 = this.Y;
        if(this.X != 0) {
            Long long0 = Long.parseLong(c0.a);
            String s = ((a)object0).a;
            h h0 = new h(s, long0);
            e e0 = c0.b.a;
            V6.a a0 = e0.c;
            if(a0 == null) {
                return k.d(new Q6.a(-2, null));
            }
            try {
                arr_b = Base64.decode(s, 10);
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                return k.d(new Q6.a(-13, illegalArgumentException0));
            }
            e0.a.a("requestIntegrityToken(%s)", new Object[]{h0});
            i i0 = new i();
            o o0 = new o(a0, i0, i0, new Q6.c(e0, i0, arr_b, long0, i0, h0));
            a0.a().post(o0);
            return i0.a;
        }
        c0.getClass();
        j j0 = new j(c0, 8, new i7.a(((Q6.g)object0).a));
        return k.c(c0.e, j0);
    }
}

