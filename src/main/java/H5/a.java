package H5;

import K5.b;
import L5.f;
import W5.e;
import android.content.Context;

public final class a extends f {
    public static int k = 1;

    public final int d() {
        synchronized(this) {
            int v1 = a.k;
            if(v1 == 1) {
                Context context0 = this.a;
                b b0 = b.d;
                int v2 = b0.b(context0, 12451000);
                if(v2 == 0) {
                    v1 = 4;
                    a.k = 4;
                }
                else if(b0.a(v2, context0, null) != null || e.a(context0, "com.google.android.gms.auth.api.fallback") == 0) {
                    v1 = 2;
                    a.k = 2;
                }
                else {
                    v1 = 3;
                    a.k = 3;
                }
            }
            return v1;
        }
    }
}

