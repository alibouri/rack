package s5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import io.sentry.internal.debugmeta.c;
import java.util.HashMap;

public final class f {
    public final c a;
    public final d b;
    public final HashMap c;

    public f(Context context0, d d0) {
        c c0 = new c(16, context0);
        super();
        this.c = new HashMap();
        this.a = c0;
        this.b = d0;
    }

    public final g a(String s) {
        synchronized(this) {
            if(this.c.containsKey(s)) {
                return (g)this.c.get(s);
            }
            CctBackendFactory cctBackendFactory0 = this.a.d(s);
            if(cctBackendFactory0 == null) {
                return null;
            }
            g g1 = cctBackendFactory0.create(new b(this.b.a, this.b.b, this.b.c, s));
            this.c.put(s, g1);
            return g1;
        }
    }
}

