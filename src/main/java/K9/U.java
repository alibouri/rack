package K9;

import B.h;
import B.v0;
import B.x0;
import Bb.q;
import F0.i;
import F0.k;
import I2.J;
import J2.w;
import N.m2;
import N9.c;
import N9.d;
import Nb.j;
import O0.O;
import U.g0;
import U.l0;
import U.p;
import androidx.compose.foundation.layout.a;
import androidx.compose.ui.Modifier;
import com.sendwave.backend.type.TooltipTarget.SEND_SCAN_QR;
import g0.b;
import g0.l;
import kotlin.jvm.functions.Function0;

public abstract class u {
    public static final void a(Function0 function00, d d0, Function0 function01, Function0 function02, Function0 function03, p p0, int v) {
        d d1;
        j.f(function00, "onScanToSendClicked");
        j.f(function01, "onTooltipClick");
        j.f(function02, "onTooltipDismiss");
        j.f(function03, "onTooltipShown");
        p0.S(0x305E0AFC);
        int v1 = (v & 6) == 0 ? (p0.h(function00) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (((v & 0x40) == 0 ? p0.f(d0) : p0.h(d0)) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.h(function01) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (p0.h(function02) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (p0.h(function03) ? 0x4000 : 0x2000);
        }
        if((v1 & 9363) != 9362 || !p0.x()) {
            Modifier modifier0 = a.j(androidx.compose.foundation.a.d(l.X, false, null, function00, 7), 16.0f);
            x0 x00 = v0.b(new h(22.0f), b.k, p0, 54);
            int v2 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier1 = g0.a.d(p0, modifier0);
            k.a.getClass();
            i i0 = F0.j.b;
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            U.d.K(p0, x00, F0.j.f);
            U.d.K(p0, g00, F0.j.e);
            F0.h h0 = F0.j.g;
            if(p0.O || !j.a(p0.G(), v2)) {
                m5.b.F(v2, p0, v2, h0);
            }
            U.d.K(p0, modifier1, F0.j.d);
            if(d0 == null) {
                d1 = null;
            }
            else {
                c c0 = J.A(SEND_SCAN_QR.X);
                d1 = d0.b.equals(c0) ? d0 : null;
            }
            p0.Q(0x4D608AED);
            Object object0 = p0.G();
            if((((v1 & 14) == 4 ? 1 : 0) | ((v1 & 0x380) == 0x100 ? 1 : 0)) != 0 || object0 == U.l.a) {
                object0 = new s(function01, function00, 0);
                p0.a0(object0);
            }
            p0.p(false);
            yc.l.i(d1, null, 0, ((Function0)object0), function02, function03, K9.b.a, p0, 0xE000 & v1 << 3 | 0x180008 | v1 << 3 & 0x70000, 6);
            String s = w.S(0x7F1203A7, p0);  // string:scan_to_send "Scan to send"
            new O(yc.d.h(0x7F06007B, p0), q.C(18), T0.w.l0, db.b.a, 0L, 0, q.C(24), null, 0xFDFFD8);  // color:black
            m2.b(s, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, p0, 0, 0, 0xFFFE);
            p0.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new t(function00, d0, function01, function02, function03, v, 0);
        }
    }
}

