package f9;

import Ab.k;
import Ab.t;
import B.r;
import B.v0;
import B.x0;
import D0.K;
import F0.h;
import F0.i;
import I2.J;
import J2.w;
import Mb.e;
import N.b1;
import Nb.j;
import U.Z;
import U.d;
import U.g0;
import U.p;
import Z9.c;
import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build.VERSION;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.ui.Modifier;
import g0.a;
import g0.g;
import g0.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import n0.M;

public final class n implements e {
    public final String X;
    public final Function1 Y;
    public final String Z;
    public final Function3 b0;
    public final long c0;
    public final long d0;
    public final b e0;
    public final long f0;
    public final long g0;

    public n(String s, Function1 function10, String s1, Function3 function30, long v, long v1, b b0, long v2, long v3) {
        this.X = s;
        this.Y = function10;
        this.Z = s1;
        this.b0 = function30;
        this.c0 = v;
        this.d0 = v1;
        this.e0 = b0;
        this.f0 = v2;
        this.g0 = v3;
    }

    @Override  // Mb.e
    public final Object r(Object object0, Object object1, Object object2, Object object3) {
        h h9;
        h h8;
        String s4;
        Z z12;
        h h7;
        h h6;
        g g1;
        h h5;
        String s3;
        String s2;
        boolean z11;
        boolean z10;
        Z z9;
        ((Number)object3).intValue();
        j.f(((u.g)object0), "$this$AnimatedContent");
        j.f(((k)object1), "$destruct$");
        boolean z = ((Boolean)((k)object1).X).booleanValue();
        boolean z1 = ((Boolean)((k)object1).Y).booleanValue();
        B.h h0 = new B.h(6.0f);
        l l0 = l.X;
        x0 x00 = v0.b(h0, g0.b.j, ((p)object2), 6);
        int v = ((p)object2).P;
        g0 g00 = ((p)object2).m();
        Modifier modifier0 = a.d(((p)object2), l0);
        F0.k.a.getClass();
        i i0 = F0.j.b;
        ((p)object2).U();
        if(((p)object2).O) {
            ((p)object2).l(i0);
        }
        else {
            ((p)object2).d0();
        }
        h h1 = F0.j.f;
        d.K(((p)object2), x00, h1);
        h h2 = F0.j.e;
        d.K(((p)object2), g00, h2);
        h h3 = F0.j.g;
        if(((p)object2).O || !j.a(((p)object2).G(), v)) {
            m5.b.F(v, ((p)object2), v, h3);
        }
        h h4 = F0.j.d;
        d.K(((p)object2), modifier0, h4);
        String s = this.X;
        boolean z2 = !z && s != null;
        ((p)object2).Q(221035592);
        boolean z3 = ((p)object2).f(s);
        boolean z4 = ((p)object2).g(z1);
        Function1 function10 = this.Y;
        boolean z5 = ((p)object2).f(function10);
        String s1 = this.Z;
        boolean z6 = ((p)object2).f(s1);
        Function3 function30 = this.b0;
        boolean z7 = ((p)object2).f(function30);
        Object object4 = ((p)object2).G();
        Z z8 = U.l.a;
        if((z3 | z4 | z5 | z6 | z7) != 0 || object4 == z8) {
            z9 = z8;
            z11 = z2;
            s2 = s;
            z10 = z1;
            s3 = s1;
            h5 = h4;
            c c0 = new c(s, z1, function10, s1, function30);
            ((p)object2).a0(c0);
            object4 = c0;
        }
        else {
            z9 = z8;
            z10 = z1;
            z11 = z2;
            s2 = s;
            s3 = s1;
            h5 = h4;
        }
        ((p)object2).p(false);
        Modifier modifier1 = androidx.compose.foundation.a.d(l0, z11, null, ((Function0)object4), 6);
        g g0 = g0.b.a;
        K k0 = r.e(g0, false);
        int v1 = ((p)object2).P;
        g0 g01 = ((p)object2).m();
        Modifier modifier2 = a.d(((p)object2), modifier1);
        ((p)object2).U();
        if(((p)object2).O) {
            ((p)object2).l(i0);
        }
        else {
            ((p)object2).d0();
        }
        d.K(((p)object2), k0, h1);
        d.K(((p)object2), g01, h2);
        if(((p)object2).O || !j.a(((p)object2).G(), v1)) {
            m5.b.F(v1, ((p)object2), v1, h3);
        }
        d.K(((p)object2), modifier2, h5);
        if(!z && s2 != null) {
            ((p)object2).Q(0x7E7153C5);
            t0.e e0 = M6.b.W((z10 ? 0x7F0801D4 : 0x7F0801D6), ((p)object2));  // drawable:ic_audio_pause
            String s5 = w.S((z10 ? 0x7F12048F : 0x7F120490), ((p)object2));  // string:voice_announcement_pause_caption "Pause announcement"
            z12 = z9;
            long v2 = this.c0;
            BlendModeColorFilter blendModeColorFilter0 = Build.VERSION.SDK_INT >= 29 ? n0.p.a.a(v2, 5) : new PorterDuffColorFilter(M.G(v2), M.J(5));
            n0.n n0 = new n0.n(v2, 5, blendModeColorFilter0);
            g1 = g0;
            h6 = h5;
            s4 = s3;
            h7 = h3;
            M6.b.e(e0, s5, androidx.compose.foundation.layout.c.k(androidx.compose.foundation.layout.a.j(l0, 12.0f), 24.0f), null, n0, ((p)object2), 0x180, 56);
            ((p)object2).p(false);
            h9 = h1;
            h8 = h2;
        }
        else {
            g1 = g0;
            h6 = h5;
            h7 = h3;
            z12 = z9;
            s4 = s3;
            ((p)object2).Q(0x7E6E2BB6);
            h8 = h2;
            h9 = h1;
            b1.b(androidx.compose.foundation.layout.c.k(androidx.compose.foundation.layout.a.j(l0, 12.0f), 24.0f), 0L, 0.0f, 0L, 0, ((p)object2), 6, 30);
            ((p)object2).p(false);
        }
        ((p)object2).p(true);
        VerticalAlignElement verticalAlignElement0 = new VerticalAlignElement(g0.b.k);
        K k1 = r.e(g1, false);
        int v3 = ((p)object2).P;
        g0 g02 = ((p)object2).m();
        Modifier modifier3 = a.d(((p)object2), verticalAlignElement0);
        ((p)object2).U();
        if(((p)object2).O) {
            ((p)object2).l(i0);
        }
        else {
            ((p)object2).d0();
        }
        d.K(((p)object2), k1, h9);
        d.K(((p)object2), g02, h8);
        if(((p)object2).O || !j.a(((p)object2).G(), v3)) {
            m5.b.F(v3, ((p)object2), v3, h7);
        }
        d.K(((p)object2), modifier3, h6);
        Modifier modifier4 = androidx.compose.foundation.layout.c.e(androidx.compose.foundation.layout.c.d(l0, 1.0f), 3.0f);
        Modifier modifier5 = androidx.compose.foundation.layout.b.a.a(modifier4, g0.b.e);
        ((p)object2).Q(0xC204309C);
        long v4 = this.d0;
        boolean z13 = ((p)object2).e(v4);
        b b0 = this.e0;
        boolean z14 = ((p)object2).f(b0);
        boolean z15 = ((p)object2).f(s4);
        long v5 = this.f0;
        boolean z16 = ((p)object2).e(v5);
        long v6 = this.g0;
        boolean z17 = ((p)object2).e(v6);
        Object object5 = ((p)object2).G();
        if((z13 | z14 | z15 | z16 | z17) != 0 || object5 == z12) {
            object5 = new m(v4, b0, s4, v5, v6);
            ((p)object2).a0(object5);
        }
        ((p)object2).p(false);
        J.a(modifier5, ((Function1)object5), ((p)object2), 0);
        ((p)object2).p(true);
        ((p)object2).p(true);
        return t.a;
    }
}

