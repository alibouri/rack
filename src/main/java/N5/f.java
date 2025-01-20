package N5;

import B3.d;
import K5.b;
import L5.c;
import L5.g;
import L5.h;
import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import b4.A0;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;

public abstract class f extends e implements c {
    public final Set w0;

    public f(Context context0, Looper looper0, int v, A0 a00, g g0, h h0) {
        z z0 = z.a(context0);
        r.j(g0);
        r.j(h0);
        d d0 = new d(11, g0);
        I5.h h1 = new I5.h(17, h0);
        super(context0, looper0, z0, b.d, v, d0, h1, ((String)a00.e));
        Set set0 = (Set)a00.c;
        for(Object object0: set0) {
            if(!set0.contains(((Scope)object0))) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
            if(false) {
                break;
            }
        }
        this.w0 = set0;
    }

    // Deobfuscation rating: LOW(20)
    @Override  // L5.c
    public final Set b() {
        return this.l() ? this.w0 : Collections.emptySet();
    }

    @Override  // N5.e
    public final Account p() {
        return null;
    }

    @Override  // N5.e
    public final Set s() {
        return this.w0;
    }
}

