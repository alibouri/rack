package ia;

import Aa.E;
import B.e;
import B.r;
import B.z0;
import D0.K;
import F0.h;
import F0.i;
import F0.k;
import J2.w;
import N.m2;
import Nb.j;
import O0.f;
import U.d;
import U.g0;
import U.l0;
import U.l;
import U.p;
import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build.VERSION;
import androidx.compose.ui.Modifier;
import com.sendwave.models.CurrencyAmount;
import g0.a;
import g0.b;
import g0.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import n0.M;
import n0.n;
import q9.N0;

public abstract class c {
    public static final float a;

    static {
        c.a = 72.0f;
    }

    public static final void a(CurrencyAmount currencyAmount0, boolean z, Function0 function00, Modifier modifier0, long v, p p0, int v1) {
        j.f(function00, "onBalanceClick");
        p0.S(40437406);
        int v2 = (v1 & 6) == 0 ? (p0.f(currencyAmount0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (p0.g(z) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v2 |= (p0.h(function00) ? 0x100 : 0x80);
        }
        if((v1 & 0xC00) == 0) {
            v2 |= (p0.f(modifier0) ? 0x800 : 0x400);
        }
        if((v1 & 0x6000) == 0) {
            v2 |= (p0.e(v) ? 0x4000 : 0x2000);
        }
        if((v2 & 9363) != 9362 || !p0.x()) {
            p0.M();
            if((v1 & 1) != 0 && !p0.w()) {
                p0.K();
            }
            p0.q();
            g g0 = b.e;
            Modifier modifier1 = androidx.compose.foundation.layout.c.e(androidx.compose.foundation.layout.c.d(modifier0, 1.0f), c.a);
            K k0 = r.e(g0, false);
            int v3 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier2 = a.d(p0, modifier1);
            k.a.getClass();
            i i0 = F0.j.b;
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            d.K(p0, k0, F0.j.f);
            d.K(p0, g00, F0.j.e);
            h h0 = F0.j.g;
            if(p0.O || !j.a(p0.G(), v3)) {
                m5.b.F(v3, p0, v3, h0);
            }
            d.K(p0, modifier2, F0.j.d);
            Boolean boolean0 = Boolean.valueOf(z);
            p0.Q(-969465305);
            Object object0 = p0.G();
            if(object0 == l.a) {
                object0 = new T3.d(25);
                p0.a0(object0);
            }
            p0.p(false);
            M6.b.a(boolean0, null, ((Function1)object0), g0, "balance", null, c0.c.c(0xD8F74735, new ia.b(function00, currencyAmount0, v), p0), p0, v2 >> 3 & 14 | 1600896, 34);
            p0.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new ia.a(currencyAmount0, z, function00, modifier0, v, v1);
        }
    }

    public static final void b(CurrencyAmount currencyAmount0, Modifier modifier0, long v, Z0.i i0, p p0, int v1) {
        Z0.i i1;
        Z0.i i2;
        int v3;
        p0.S(0xF4840073);
        int v2 = (v1 & 6) == 0 ? (p0.f(currencyAmount0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (p0.f(modifier0) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v2 |= (p0.e(v) ? 0x100 : 0x80);
        }
        if((v1 & 0xC00) == 0) {
            v2 |= 0x400;
        }
        if((v2 & 0x493) != 1170 || !p0.x()) {
            p0.M();
            if((v1 & 1) == 0 || p0.w()) {
                v3 = v2 & 0xFFFFE3FF;
                i2 = new Z0.i(3);
            }
            else {
                p0.K();
                v3 = v2 & 0xFFFFE3FF;
                i2 = i0;
            }
            p0.q();
            m2.c((currencyAmount0 == null ? new f(6, "--", null) : N0.b(currencyAmount0)), modifier0, v, 0L, null, null, null, 0L, null, i2, 0L, 0, false, 0, 0, null, null, db.b.a(((db.a)p0.k(db.b.d)).u, p0), p0, v3 & 0x3F0, 0, 0x1FDF8);
            i1 = i2;
        }
        else {
            p0.K();
            i1 = i0;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Fa.i(currencyAmount0, modifier0, v, i1, v1);
        }
    }

    public static final void c(int v, p p0) {
        z0 z00 = z0.a;
        p0.S(-1310119850);
        if((((v & 6) == 0 ? (p0.f(z00) ? 4 : 2) | v : v) & 3) != 2 || !p0.x()) {
            e.b(p0, androidx.compose.foundation.layout.c.n(g0.l.X, 26.0f));
            M6.b.e(M6.b.W(0x7F080239, p0), w.S(0x7F1201B8, p0), androidx.compose.foundation.layout.a.l(z00.b(g0.l.X, b.k), 0.0f, 12.0f, 1), null, null, p0, 0, 120);  // drawable:ic_hide_balance_dots
            M6.b.e(M6.b.W(0x7F080297, p0), w.S(0x7F1203F7, p0), z00.b(androidx.compose.foundation.layout.a.l(g0.l.X, 4.0f, 0.0f, 2), b.k), null, null, p0, 0, 120);  // drawable:ic_show_balance
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new E(v, 11);
        }
    }

    public static final void d(CurrencyAmount currencyAmount0, long v, p p0, int v1) {
        int v3;
        z0 z00 = z0.a;
        p0.S(0xEA01CC9A);
        int v2 = (v1 & 6) == 0 ? (p0.f(z00) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (p0.f(currencyAmount0) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v2 |= (p0.e(v) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) != 0x92 || !p0.x()) {
            e.b(p0, androidx.compose.foundation.layout.c.n(g0.l.X, 27.0f));
            c.b(currencyAmount0, z00.b(g0.l.X, b.k), v, null, p0, v2 >> 3 & 14 | v2 & 0x380);
            t0.e e0 = M6.b.W(0x7F080238, p0);  // drawable:ic_hide_balance
            String s = w.S(0x7F1201BB, p0);  // string:hide_balance_alt_text "Hide balance"
            Modifier modifier0 = androidx.compose.foundation.layout.a.n(z00.b(g0.l.X, b.k), 8.0f, (currencyAmount0 == null || (currencyAmount0.X == null || !N0.c(currencyAmount0.X)) ? 0.0f : 8.0f), 0.0f, 0.0f, 12);
            BlendModeColorFilter blendModeColorFilter0 = Build.VERSION.SDK_INT >= 29 ? n0.p.a.a(v, 5) : new PorterDuffColorFilter(M.G(v), M.J(5));
            v3 = v1;
            M6.b.e(e0, s, modifier0, null, new n(v, 5, blendModeColorFilter0), p0, 0, 56);
        }
        else {
            p0.K();
            v3 = v1;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new eb.a(currencyAmount0, v, v3);
        }
    }
}

