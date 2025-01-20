package ha;

import Aa.x;
import Bb.q;
import Ea.s;
import Nb.j;
import R.J0;
import R.r0;
import U.H;
import U.Z;
import U.p;
import U.w;
import a9.B4;
import a9.D4;
import a9.E4;
import a9.x4;
import androidx.compose.ui.Modifier;
import dc.e;
import ia.l;
import io.sentry.config.a;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import mc.f;
import mc.g;
import n0.v;
import nc.b;
import v.U;
import v.c;
import yc.d;

public abstract class l0 {
    public static final U a;
    public static final float b;
    public static final float c;

    static {
        l0.a = c.i(0.0f, 7, null);
        l0.b = 94.0f;
        l0.c = l.a / ia.c.a;
    }

    public static final void a(boolean z, Function0 function00, p p0, int v) {
        p0.S(0x40C4C85F);
        int v1 = (v & 6) == 0 ? (p0.g(z) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.h(function00) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && p0.x()) {
            p0.K();
        }
        else if(z) {
            Modifier modifier0 = androidx.compose.foundation.layout.c.c(g0.l.X, 1.0f);
            nc.c c0 = new nc.c(new b(2000L, TimeUnit.MILLISECONDS));
            c0.b = 0.002f;
            a.e(modifier0, q.K(new mc.b(-90, 360, 30.0f, 0.9f, null, 2000L, true, new g(new f(0.0, 0.0), new f(1.0, 0.0)), c0, 0x18E0)), new g.a(2, function00), p0, 6, 0);
        }
        U.l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Ha.l(v, 2, function00, z);
        }
    }

    public static final void b(m0 m00, n n0, p p0, int v) {
        int v2;
        j.f(m00, "uiState");
        j.f(n0, "callbacks");
        p0.S(0xDA0A5A2E);
        int v1 = (v & 6) == 0 ? (p0.f(m00) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (((v & 0x40) == 0 ? p0.f(n0) : p0.h(n0)) ? 0x20 : 16);
        }
        if((v1 & 19) != 18 || !p0.x()) {
            Object object0 = p0.G();
            Z z0 = U.l.a;
            if(object0 == z0) {
                w w0 = new w(H.h(p0));
                p0.a0(w0);
                object0 = w0;
            }
            e e0 = ((w)object0).X;
            P.n n1 = W4.f.K(m00.j, n0.l, p0, 0);
            p0.Q(-1600557454);
            Object object1 = p0.G();
            if(object1 == z0) {
                object1 = new J0();
                p0.a0(object1);
            }
            p0.p(false);
            v v3 = null;
            D4 d40 = m00.m;
            x4 x40 = d40 == null ? null : d40.f;
            if(x40 == null) {
            label_32:
                if(x40 != null) {
                    B4 b40 = x40.b;
                    if(b40 != null) {
                        v3 = new v(b40.a);
                    }
                }
            }
            else {
                E4 e40 = x40.c;
                if(e40 != null) {
                    v3 = new v(e40.a);
                    goto label_36;
                }
                goto label_32;
            }
        label_36:
            p0.Q(-1600553082);
            long v4 = v3 == null ? d.h(0x7F06003E, p0) : v3.a;  // color:Violet600
            p0.p(false);
            U5.a.s(new v(v4), p0, 0);
            v2 = v;
            r0.a(null, null, null, c0.c.c(0x5F23D774, new x(15, ((J0)object1)), p0), null, 0, 0L, 0L, null, c0.c.c(0xCC5524FD, new k0(n1, x40, v4, m00, n0, e0, (d40 == null ? v.e : d40.g), ((J0)object1)), p0), p0, 0x30000C00);
        }
        else {
            p0.K();
            v2 = v;
        }
        U.l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new s(v2, 11, m00, n0);
        }
    }
}

