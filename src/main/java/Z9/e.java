package Z9;

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
import N.b1;
import Nb.j;
import U.Z;
import U.d;
import U.g0;
import U.p;
import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build.VERSION;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.ui.Modifier;
import g0.a;
import g0.b;
import g0.f;
import g0.g;
import g0.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import n0.M;
import n0.n;

public final class e implements Mb.e {
    public final Function1 X;
    public final String Y;
    public final Function3 Z;
    public final String b0;
    public final long c0;
    public final long d0;
    public final int e0;
    public final int f0;
    public final long g0;

    public e(Function1 function10, String s, Function3 function30, String s1, long v, long v1, int v2, int v3, long v4) {
        this.X = function10;
        this.Y = s;
        this.Z = function30;
        this.b0 = s1;
        this.c0 = v;
        this.d0 = v1;
        this.e0 = v2;
        this.f0 = v3;
        this.g0 = v4;
    }

    @Override  // Mb.e
    public final Object r(Object object0, Object object1, Object object2, Object object3) {
        g g3;
        Z z9;
        e e0;
        h h8;
        h h7;
        h h6;
        h h5;
        g g2;
        f f1;
        Z z8;
        ((Number)object3).intValue();
        j.f(((u.g)object0), "$this$AnimatedContent");
        j.f(((k)object1), "$destruct$");
        boolean z = ((Boolean)((k)object1).X).booleanValue();
        boolean z1 = ((Boolean)((k)object1).Y).booleanValue();
        B.h h0 = new B.h(12.0f);
        l l0 = l.X;
        x0 x00 = v0.b(h0, b.j, ((p)object2), 6);
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
        ((p)object2).Q(1005091789);
        boolean z2 = ((p)object2).g(z1);
        Function1 function10 = this.X;
        boolean z3 = ((p)object2).f(function10);
        String s = this.Y;
        boolean z4 = ((p)object2).f(s);
        Function3 function30 = this.Z;
        boolean z5 = ((p)object2).f(function30);
        String s1 = this.b0;
        boolean z6 = ((p)object2).f(s1);
        Object object4 = ((p)object2).G();
        Z z7 = U.l.a;
        if((z2 | z3 | z4 | z5 | z6) != 0 || object4 == z7) {
            z8 = z7;
            c c0 = new c(z1, function10, s, function30, s1);
            ((p)object2).a0(c0);
            object4 = c0;
        }
        else {
            z8 = z7;
        }
        ((p)object2).p(false);
        Modifier modifier1 = androidx.compose.foundation.layout.c.k(androidx.compose.foundation.a.d(l0, false, null, ((Function0)object4), 7), 20.0f);
        f f0 = b.k;
        Modifier modifier2 = modifier1.d(new VerticalAlignElement(f0));
        g g0 = b.a;
        K k0 = r.e(g0, false);
        int v1 = ((p)object2).P;
        g0 g01 = ((p)object2).m();
        Modifier modifier3 = a.d(((p)object2), modifier2);
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
        d.K(((p)object2), modifier3, h4);
        androidx.compose.foundation.layout.b b0 = androidx.compose.foundation.layout.b.a;
        g g1 = b.e;
        if(z) {
            ((p)object2).Q(-1747501342);
            f1 = f0;
            g2 = g0;
            h5 = h4;
            h6 = h3;
            h7 = h2;
            h8 = h1;
            b1.b(b0.a(l0, g1), 0L, 0.0f, 0L, 0, ((p)object2), 0, 30);
            ((p)object2).p(false);
            e0 = this;
            z9 = z8;
            g3 = g1;
        }
        else {
            f1 = f0;
            g2 = g0;
            h5 = h4;
            h6 = h3;
            h7 = h2;
            h8 = h1;
            ((p)object2).Q(0x97D9757B);
            t0.e e1 = M6.b.W((z1 ? 0x7F0801D4 : 0x7F0801D6), ((p)object2));  // drawable:ic_audio_pause
            String s2 = w.S((z1 ? 0x7F12048F : 0x7F120490), ((p)object2));  // string:voice_announcement_pause_caption "Pause announcement"
            e0 = this;
            z9 = z8;
            long v2 = e0.c0;
            BlendModeColorFilter blendModeColorFilter0 = Build.VERSION.SDK_INT >= 29 ? n0.p.a.a(v2, 5) : new PorterDuffColorFilter(M.G(v2), M.J(5));
            n n0 = new n(v2, 5, blendModeColorFilter0);
            g3 = g1;
            M6.b.e(e1, s2, b0.a(l0, g3), null, n0, ((p)object2), 0, 56);
            ((p)object2).p(false);
        }
        ((p)object2).p(true);
        VerticalAlignElement verticalAlignElement0 = new VerticalAlignElement(f1);
        K k1 = r.e(g2, false);
        int v3 = ((p)object2).P;
        g0 g02 = ((p)object2).m();
        Modifier modifier4 = a.d(((p)object2), verticalAlignElement0);
        ((p)object2).U();
        if(((p)object2).O) {
            ((p)object2).l(i0);
        }
        else {
            ((p)object2).d0();
        }
        d.K(((p)object2), k1, h8);
        d.K(((p)object2), g02, h7);
        if(((p)object2).O || !j.a(((p)object2).G(), v3)) {
            m5.b.F(v3, ((p)object2), v3, h6);
        }
        d.K(((p)object2), modifier4, h5);
        Modifier modifier5 = b0.a(androidx.compose.foundation.layout.c.e(androidx.compose.foundation.layout.c.d(l0, 1.0f), 3.0f), g3);
        ((p)object2).Q(0xC2D61107);
        long v4 = e0.d0;
        boolean z10 = ((p)object2).e(v4);
        int v5 = e0.e0;
        boolean z11 = ((p)object2).d(v5);
        int v6 = e0.f0;
        boolean z12 = ((p)object2).d(v6);
        long v7 = e0.g0;
        boolean z13 = ((p)object2).e(v7);
        Object object5 = ((p)object2).G();
        if((z10 | z11 | z12 | z13) != 0 || object5 == z9) {
            object5 = new Z9.d(v5, v6, v4, v7);
            ((p)object2).a0(object5);
        }
        ((p)object2).p(false);
        J.a(modifier5, ((Function1)object5), ((p)object2), 0);
        ((p)object2).p(true);
        ((p)object2).p(true);
        return t.a;
    }
}

