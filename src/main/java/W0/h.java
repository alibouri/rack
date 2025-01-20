package W0;

import O0.s;
import O0.u;
import Z0.j;
import android.text.TextPaint;
import java.util.ArrayList;
import n0.Q;
import n0.r;
import n0.t;
import p0.e;

public abstract class h {
    public static final i a;

    static {
        h.a = new i(false);
    }

    public static final void a(s s0, t t0, r r0, float f, Q q0, j j0, e e0, int v) {
        ArrayList arrayList0 = s0.h;
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            u u0 = (u)arrayList0.get(v2);
            u0.a.g(t0, r0, f, q0, j0, e0, v);
            t0.k(0.0f, u0.a.b());
        }
    }

    public static final void b(TextPaint textPaint0, float f) {
        if(!Float.isNaN(f)) {
            if(f < 0.0f) {
                f = 0.0f;
            }
            if(f > 1.0f) {
                f = 1.0f;
            }
            textPaint0.setAlpha(Math.round(f * 255.0f));
        }
    }
}

