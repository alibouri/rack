package a;

import Aa.r;
import B.B;
import B.v0;
import B.x0;
import B.z0;
import B.z;
import D0.K;
import D0.P;
import D0.b0;
import E.e0;
import Ea.p0;
import F0.c0;
import Fa.X;
import G0.f0;
import G0.r0;
import I2.A;
import I2.J;
import J2.w;
import L0.k;
import M0.i;
import M0.o;
import M0.q;
import M6.b;
import N.m2;
import Nb.j;
import O0.N;
import O0.O;
import R.C;
import U.Z;
import U.g0;
import U.l0;
import U.p;
import U0.D;
import W.d;
import W5.f;
import X9.e;
import Z2.t;
import a1.h;
import android.content.Context;
import android.graphics.BlendModeColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.net.NetworkRequest.Builder;
import android.net.NetworkRequest;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.compose.foundation.layout.c;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Density;
import com.airbnb.lottie.compose.LottieAnimationSizeElement;
import com.apollographql.apollo.api.CompiledCondition;
import com.apollographql.apollo.api.CompiledField;
import com.drew.metadata.ErrorDirectory;
import com.drew.metadata.gif.GifAnimationDirectory;
import com.drew.metadata.gif.GifCommentDirectory;
import com.drew.metadata.gif.GifControlDirectory;
import com.drew.metadata.gif.GifHeaderDirectory;
import com.drew.metadata.gif.GifImageDirectory;
import com.sendwave.backend.fragment.AnnouncementFragment;
import com.sendwave.util.Country;
import g0.g;
import g0.l;
import ha.x;
import ha.y;
import io.sentry.ILogger;
import io.sentry.i1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import l4.m;
import n0.M;
import n0.n;
import q9.o0;
import ra.O0;

public abstract class a {
    public static final boolean A(List list0, Map map0) {
        Iterator iterator0 = list0.iterator();
        while(true) {
            boolean z = false;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            Object object1 = map0.get(((CompiledCondition)object0).getName());
            Boolean boolean0 = object1 instanceof Boolean ? ((Boolean)object1) : null;
            if(boolean0 != null) {
                z = boolean0.booleanValue();
            }
            if(((CompiledCondition)object0).getInverted()) {
                z = !z;
            }
            if(!z) {
                return true;
            }
        }
        return false;
    }

    public static final boolean B(Map map0, CompiledField compiledField0) {
        j.f(compiledField0, "<this>");
        j.f(map0, "variableValues");
        return a.A(compiledField0.getCondition(), map0);
    }

    public static final double C(long v) {
        return ((double)(v >>> 11)) * 2048.0 + ((double)(v & 0x7FFL));
    }

    public static final String D(int v, long v1) {
        if(Long.compare(v1, 0L) >= 0) {
            f.o(v);
            String s = Long.toString(v1, v);
            j.e(s, "toString(...)");
            return s;
        }
        long v2 = (v1 >>> 1) / ((long)v) << 1;
        long v3 = v1 - v2 * ((long)v);
        if(v3 >= ((long)v)) {
            v3 -= (long)v;
            ++v2;
        }
        f.o(v);
        String s1 = Long.toString(v2, v);
        j.e(s1, "toString(...)");
        f.o(v);
        String s2 = Long.toString(v3, v);
        j.e(s2, "toString(...)");
        return s1 + s2;
    }

    public static final void E(o o0, int v, r r0) {
        d d0 = new d(new o[16]);
        List list0 = o0.g(false, false, false);
    alab1:
        while(true) {
            d0.e(d0.Z, list0);
            while(true) {
                if(!d0.n()) {
                    break alab1;
                }
                o o1 = (o)d0.p(d0.Z - 1);
                c0 c00 = o1.c();
                if((c00 == null ? false : c00.N0())) {
                    continue;
                }
                M0.j j0 = o1.d;
                LinkedHashMap linkedHashMap0 = j0.X;
                if(linkedHashMap0.containsKey(q.m) || linkedHashMap0.containsKey(q.i)) {
                    continue;
                }
                c0 c01 = o1.c();
                Object object0 = null;
                if(c01 != null) {
                    h h0 = hb.h.f0(b0.f(c01));
                    if(h0.a >= h0.c || h0.b >= h0.d) {
                        continue;
                    }
                    Object object1 = j0.X.get(i.e);
                    if(object1 == null) {
                        object1 = null;
                    }
                    Object object2 = linkedHashMap0.get(q.p);
                    if(object2 != null) {
                        object0 = object2;
                    }
                    if(((Function2)object1) != null && ((M0.h)object0) != null && ((Number)((Function0)((M0.h)object0).b).invoke()).floatValue() <= 0.0f) {
                        r0.n(new k(o1, v + 1, h0, c01));
                        a.E(o1, v + 1, r0);
                        continue;
                    }
                    list0 = o1.g(false, false, false);
                    break;
                }
                b.U("Expected semantics node to have a coordinator.");
                throw null;
            }
        }
    }

    public static final void a(boolean z, boolean z1, int v, int v1, long v2, long v3, long v4, long v5, Function0 function00, Modifier modifier0, p p0, int v6) {
        Modifier modifier1;
        Modifier modifier3;
        p0.S(-1990491874);
        int v7 = (v6 & 6) == 0 ? (p0.g(z) ? 4 : 2) | v6 : v6;
        if((v6 & 0x30) == 0) {
            v7 |= (p0.g(z1) ? 0x20 : 16);
        }
        if((v6 & 0x180) == 0) {
            v7 |= (p0.d(v) ? 0x100 : 0x80);
        }
        if((v6 & 0xC00) == 0) {
            v7 |= (p0.d(v1) ? 0x800 : 0x400);
        }
        if((v6 & 0x6000) == 0) {
            v7 |= (p0.e(v2) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v6) == 0) {
            v7 |= (p0.e(v3) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v6) == 0) {
            v7 |= (p0.e(v4) ? 0x100000 : 0x80000);
        }
        if((0xC00000 & v6) == 0) {
            v7 |= (p0.e(v5) ? 0x800000 : 0x400000);
        }
        if((0x6000000 & v6) == 0) {
            v7 |= (p0.h(function00) ? 0x4000000 : 0x2000000);
        }
        if((306783379 & (v7 | 0x30000000)) != 306783378 || !p0.x()) {
            l l0 = l.X;
            p0.h h0 = new p0.h(((Density)p0.k(f0.f)).w(2.0f), 0.0f, 1, 0, 26);
            p0.Q(0x13B4FDA0);
            Modifier modifier2 = androidx.compose.foundation.layout.a.c(c.d(androidx.compose.foundation.a.d(l0, false, null, function00, 7), 1.0f), 1.0f, false);
            Z z2 = U.l.a;
            if(z) {
                modifier3 = l0;
            }
            else {
                p0.Q(0xCC15049A);
                boolean z3 = p0.h(h0);
                Object object0 = p0.G();
                if(((((v7 | 0x30000000) & 0x380000) == 0x100000 ? 1 : 0) | ((((v7 | 0x30000000) & 0x1C00) == 0x800 ? 1 : 0) | ((0x70000 & (v7 | 0x30000000)) == 0x20000 | z3) | ((0x1C00000 & (v7 | 0x30000000)) == 0x800000 ? 1 : 0) | (((v7 | 0x30000000) & 0x380) == 0x100 ? 1 : 0))) != 0 || object0 == z2) {
                    object0 = new X9.a(v3, h0, v1, v5, v, v4);
                    p0.a0(object0);
                }
                p0.p(false);
                modifier3 = androidx.compose.ui.draw.a.a(l0, ((Function1)object0));
            }
            Modifier modifier4 = modifier2.d(modifier3);
            p0.p(false);
            K k0 = B.r.e(g0.b.a, false);
            int v8 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier5 = g0.a.d(p0, modifier4);
            F0.k.a.getClass();
            F0.i i0 = F0.j.b;
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            U.d.K(p0, k0, F0.j.f);
            U.d.K(p0, g00, F0.j.e);
            F0.h h1 = F0.j.g;
            if(p0.O || !j.a(p0.G(), v8)) {
                m5.b.F(v8, p0, v8, h1);
            }
            U.d.K(p0, modifier5, F0.j.d);
            Ab.k k1 = new Ab.k(Boolean.valueOf(z), Boolean.valueOf(z1));
            g g0 = g0.b.e;
            Modifier modifier6 = androidx.compose.foundation.layout.b.a.a(l0, g0);
            p0.Q(-871012830);
            Object object1 = p0.G();
            if(object1 == z2) {
                object1 = new T3.d(6);
                p0.a0(object1);
            }
            p0.p(false);
            modifier1 = l0;
            b.a(k1, modifier6, ((Function1)object1), g0, "play-pause-button", null, c0.c.c(-1407487035, new e(2.0f, v3, v2), p0), p0, 1600896, 0x20);
            p0.p(true);
        }
        else {
            p0.K();
            modifier1 = modifier0;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new X9.b(z, z1, v, v1, v2, v3, v4, v5, function00, modifier1, v6);
        }
    }

    public static final void b(AnnouncementFragment announcementFragment0, boolean z, boolean z1, int v, int v1, Function1 function10, Function0 function00, Function3 function30, Function1 function11, Modifier modifier0, p p0, int v2) {
        int v9;
        int v8;
        androidx.compose.foundation.layout.b b2;
        p p1;
        a9.j j1;
        l l1;
        j.f(function10, "onItemClicked");
        j.f(function00, "onItemDismissClicked");
        j.f(function30, "onPlayPauseClicked");
        j.f(function11, "absolutizeUrl");
        p0.S(0x492779E1);
        int v3 = (v2 & 6) == 0 ? (p0.f(announcementFragment0) ? 4 : 2) | v2 : v2;
        if((v2 & 0x30) == 0) {
            v3 |= (p0.g(z) ? 0x20 : 16);
        }
        if((v2 & 0x180) == 0) {
            v3 |= (p0.g(z1) ? 0x100 : 0x80);
        }
        if((v2 & 0xC00) == 0) {
            v3 |= (p0.d(v) ? 0x800 : 0x400);
        }
        if((v2 & 0x6000) == 0) {
            v3 |= (p0.d(v1) ? 0x4000 : 0x2000);
        }
        if((v2 & 0x30000) == 0) {
            v3 |= (p0.h(function10) ? 0x20000 : 0x10000);
        }
        if((v2 & 0x180000) == 0) {
            v3 |= (p0.h(function00) ? 0x100000 : 0x80000);
        }
        if((v2 & 0xC00000) == 0) {
            v3 |= (p0.h(function30) ? 0x800000 : 0x400000);
        }
        if((v2 & 0x6000000) == 0) {
            v3 |= (p0.h(function11) ? 0x4000000 : 0x2000000);
        }
        if((v2 & 0x30000000) == 0) {
            v3 |= (p0.f(modifier0) ? 0x20000000 : 0x10000000);
        }
        if((v3 & 306783379) != 306783378 || !p0.x()) {
            p0.Q(0x66B6A9D0);
            a9.j j0 = announcementFragment0.k;
            if(j0 == null) {
                p0.Q(0xB71FDDE9);
                j0 = new a9.j(yc.d.h(0x7F06004C, p0), yc.d.h(0x7F06004C, p0), new a9.h(yc.d.h(0x7F06001C, p0), yc.d.h(0x7F060049, p0), yc.d.h(0x7F060015, p0), yc.d.h(0x7F06018F, p0)), new a9.b("AnnouncementSolidColorBackground", null, new a9.g(yc.d.h(0x7F060043, p0))));  // color:WaveBlue900
                p0.p(false);
            }
            p0.p(false);
            Modifier modifier1 = N4.o.j(c.e(modifier0, 128.0f), H.f.b(8.0f));
            p0.Q(0x66B6C2DD);
            boolean z2 = p0.f(j0);
            Object object0 = p0.G();
            Z z3 = U.l.a;
            if(z2 || object0 == z3) {
                object0 = new Ba.l(17, j0);
                p0.a0(object0);
            }
            p0.p(false);
            Modifier modifier2 = androidx.compose.ui.draw.a.a(modifier1, ((Function1)object0));
            p0.Q(1723258023);
            Object object1 = p0.G();
            if((((0x70000 & v3) == 0x20000 ? 1 : 0) | ((v3 & 14) == 4 ? 1 : 0)) != 0 || object1 == z3) {
                object1 = new Ca.j(function10, 8, announcementFragment0);
                p0.a0(object1);
            }
            p0.p(false);
            Modifier modifier3 = androidx.compose.foundation.a.d(modifier2, false, null, ((Function0)object1), 7);
            g g0 = g0.b.a;
            K k0 = B.r.e(g0, false);
            int v4 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier4 = g0.a.d(p0, modifier3);
            F0.k.a.getClass();
            F0.i i0 = F0.j.b;
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            F0.h h0 = F0.j.f;
            U.d.K(p0, k0, h0);
            F0.h h1 = F0.j.e;
            U.d.K(p0, g00, h1);
            F0.h h2 = F0.j.g;
            if(p0.O || !j.a(p0.G(), v4)) {
                m5.b.F(v4, p0, v4, h2);
            }
            F0.h h3 = F0.j.d;
            U.d.K(p0, modifier4, h3);
            l l0 = l.X;
            Modifier modifier5 = androidx.compose.foundation.layout.b.a.a(l0, g0.b.e);
            androidx.compose.foundation.layout.b b0 = androidx.compose.foundation.layout.b.a;
            x0 x00 = v0.b(B.k.a, g0.b.j, p0, 0);
            int v5 = p0.P;
            g0 g01 = p0.m();
            Modifier modifier6 = g0.a.d(p0, modifier5);
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            U.d.K(p0, x00, h0);
            U.d.K(p0, g01, h1);
            if(p0.O || !j.a(p0.G(), v5)) {
                m5.b.F(v5, p0, v5, h2);
            }
            U.d.K(p0, modifier6, h3);
            B.e.b(p0, c.n(l0, 12.0f));
            B.h h4 = new B.h(4.0f);
            Modifier modifier7 = z0.a.a(l0, 1.0f, true);
            Modifier modifier8 = z0.a.b(modifier7, g0.b.k);
            B b1 = z.a(h4, g0.b.m, p0, 6);
            int v6 = p0.P;
            g0 g02 = p0.m();
            Modifier modifier9 = g0.a.d(p0, modifier8);
            p0.U();
            z0 z00 = z0.a;
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            U.d.K(p0, b1, h0);
            U.d.K(p0, g02, h1);
            if(p0.O || !j.a(p0.G(), v6)) {
                m5.b.F(v6, p0, v6, h2);
            }
            U.d.K(p0, modifier9, h3);
            O o0 = db.b.a(((db.a)p0.k(db.b.d)).i, p0);
            m2.b(announcementFragment0.b, null, j0.a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o0, p0, 0, 0, 0xFFFA);
            O o1 = db.b.a(((db.a)p0.k(db.b.d)).d, p0);
            m2.b(announcementFragment0.c, null, j0.a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o1, p0, 0, 0, 0xFFFA);
            p0.p(true);
            String s = announcementFragment0.e == null ? null : ((String)function11.n(announcementFragment0.e));
            if(!((Boolean)p0.k(r0.a)).booleanValue() || s != null) {
                p0.Q(0xA4D26C03);
                t.b(s, null, c.k(l0, 108.0f), null, yc.l.y(0x7F08030A, p0, 0), yc.l.y(0x7F08030A, p0, 0), p0, 0x1B0, 0xFFC8);  // drawable:penguin_in_premium_suite_108
            }
            else {
                p0.Q(0xA4D9598D);
                b.d(yc.l.y(0x7F08030A, p0, 0), null, c.k(l0, 108.0f), null, null, 0.0f, null, p0, 0x1B0, 120);  // drawable:penguin_in_premium_suite_108
            }
            p0.p(false);
            B.e.b(p0, c.n(l0, 4.0f));
            Modifier modifier10 = c.k(z00.b(l0, g0.b.l), 32.0f);
            K k1 = B.r.e(g0, false);
            int v7 = p0.P;
            g0 g03 = p0.m();
            Modifier modifier11 = g0.a.d(p0, modifier10);
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            U.d.K(p0, k1, h0);
            U.d.K(p0, g03, h1);
            if(p0.O || !j.a(p0.G(), v7)) {
                m5.b.F(v7, p0, v7, h2);
            }
            U.d.K(p0, modifier11, h3);
            p0.Q(-170384670);
            String s1 = announcementFragment0.i;
            if(s1 == null) {
                l1 = l0;
                j1 = j0;
                p1 = p0;
                b2 = b0;
            }
            else {
                a9.h h5 = j0.c;
                p0.Q(0x740FC5A0);
                if((v3 & 0x1C00000) == 0x800000) {
                    v8 = 1;
                    v9 = v3 & 14;
                }
                else {
                    v9 = v3 & 14;
                    v8 = 0;
                }
                boolean z4 = p0.f(s1);
                Object object2 = p0.G();
                if((v8 | (v9 == 4 ? 1 : 0) | z4 | ((v3 & 0x380) == 0x100 ? 1 : 0)) != 0 || object2 == z3) {
                    object2 = new X9.c(function30, announcementFragment0, s1, z1);
                    p0.a0(object2);
                }
                p0.p(false);
                l1 = l0;
                j1 = j0;
                p1 = p0;
                b2 = b0;
                a.a(z, z1, v, v1, h5.a, h5.d, h5.b, h5.c, ((Function0)object2), null, p0, v3 >> 3 & 0x1FFE);
            }
            p1.p(false);
            p1.p(true);
            B.e.b(p1, c.n(l1, 8.0f));
            p1.p(true);
            t0.e e0 = b.W(0x7F0801D1, p1);  // drawable:ic_announcement_close
            String s2 = w.S(0x7F1200C0, p1);  // string:close_announcement_alt_text "Close announcement"
            long v10 = j1.b;
            BlendModeColorFilter blendModeColorFilter0 = Build.VERSION.SDK_INT >= 29 ? n0.p.a.a(v10, 5) : new PorterDuffColorFilter(M.G(v10), M.J(5));
            n n0 = new n(v10, 5, blendModeColorFilter0);
            b.e(e0, s2, androidx.compose.foundation.layout.a.j(androidx.compose.foundation.a.d(b2.a(l1, g0.b.c), false, null, function00, 7), 8.0f), null, n0, p0, 0, 56);
            p1.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new X9.d(announcementFragment0, z, z1, v, v1, function10, function00, function30, function11, modifier0, v2);
        }
    }

    public static final long c(float f, float f1) {
        return ((long)Float.floatToRawIntBits(f1)) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(f)) << 0x20;
    }

    public static final void d(r3.a a0, Function0 function00, Modifier modifier0, boolean z, boolean z1, boolean z2, boolean z3, int v, boolean z4, g0.c c0, D0.j j0, boolean z5, boolean z6, Map map0, int v1, boolean z7, p p0, int v2, int v3) {
        j.f(function00, "progress");
        p0.S(382909894);
        g g0 = g0.b.e;
        P p1 = D0.i.a;
        p0.R(0xB0932B9);
        Object object0 = p0.G();
        Z z8 = U.l.a;
        if(object0 == z8) {
            object0 = new r3.j();
            p0.a0(object0);
        }
        p0.p(false);
        p0.R(0xB0932E8);
        Object object1 = p0.G();
        if(object1 == z8) {
            object1 = new Matrix();
            p0.a0(object1);
        }
        p0.p(false);
        p0.R(0xB093338);
        boolean z9 = p0.f(a0);
        Object object2 = p0.G();
        if(z9 || object2 == z8) {
            object2 = U.d.D(null, Z.e);
            p0.a0(object2);
        }
        p0.p(false);
        p0.R(0xB09336C);
        if(a0 != null && a0.b() == 0.0f) {
            p0.p(false);
            Rect rect0 = a0.k;
            Object object3 = p0.k(AndroidCompositionLocals_androidKt.b);
            int v4 = rect0.width();
            int v5 = rect0.height();
            j.f(modifier0, "<this>");
            J.a(modifier0.d(new LottieAnimationSizeElement(v4, v5)), new v3.j(rect0, p1, g0, ((Matrix)object1), ((r3.j)object0), false, false, 1, 1, a0, null, false, false, true, false, true, false, ((Context)object3), function00, ((MutableState)object2)), p0, 0);
            l0 l00 = p0.r();
            if(l00 != null) {
                l00.d = new v3.i(a0, function00, modifier0, false, false, true, false, 1, false, g0, p1, true, false, null, 1, false, v2, v3, 1);
            }
            return;
        }
        B.r.a(modifier0, p0, v2 >> 6 & 14);
        p0.p(false);
        l0 l01 = p0.r();
        if(l01 != null) {
            l01.d = new v3.i(a0, function00, modifier0, false, false, true, false, 1, false, g0, p1, true, false, null, 1, false, v2, v3, 0);
        }
    }

    public static final void e(y y0, ha.z z0, Function0 function00, Function0 function01, Function0 function02, Function0 function03, Function0 function04, Function3 function30, p p0, int v) {
        j.f(y0, "uiState");
        j.f(z0, "callbacks");
        j.f(function00, "onOverdraftIntroSheetDismissed");
        j.f(function01, "onUseOverdraftClicked");
        j.f(function02, "onOverdraftTermsSheetDismissed");
        j.f(function03, "onOverdraftTermsAccepted");
        j.f(function04, "onOverdraftTermsOpened");
        j.f(function30, "onOverdraftPlayPauseClicked");
        p0.S(0xEF426C1B);
        int v1 = (v & 6) == 0 ? (p0.f(y0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (((v & 0x40) == 0 ? p0.f(z0) : p0.h(z0)) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.h(function00) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (p0.h(function01) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (p0.h(function02) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            v1 |= (p0.h(function03) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v) == 0) {
            v1 |= (p0.h(function04) ? 0x100000 : 0x80000);
        }
        if((0xC00000 & v) == 0) {
            v1 |= (p0.h(function30) ? 0x800000 : 0x400000);
        }
        if((v1 & 0x492493) != 4793490 || !p0.x()) {
            hb.h.w(y0.a, y0.b, y0.c, y0.d, z0.a, z0.b, z0.e, p0, 0);
            f.d(y0.e, z0.c, z0.d, p0, 0);
            W4.f.f(y0.f, z0.f, p0, 0);
            wa.j.h(y0.i, z0.h, z0.o, p0, 0);
            Sa.b.c(y0.m, z0.m, z0.n, null, p0, 0);
            io.sentry.config.a.b(y0.k, z0.j, z0.k, z0.l, p0, 0);
            android.support.v4.media.session.a.k(y0.g, z0.g, p0, 0);
            p0.Q(1432138093);
            int v2 = (v1 & 0x70) == 0x20 || (v1 & 0x40) != 0 && p0.h(z0) ? 1 : 0;
            Object object0 = p0.G();
            if((((v1 & 14) == 4 ? 1 : 0) | v2) != 0 || object0 == U.l.a) {
                object0 = new Ca.j(y0, 12, z0);
                p0.a0(object0);
            }
            p0.p(false);
            android.support.v4.media.session.a.c(y0.j, ((Function0)object0), p0, 0);
            w.i(y0.n, function00, function01, function30, p0, v1 >> 3 & 0x3F0 | v1 >> 12 & 0x1C00);
            b.f(y0.o, function02, function03, function04, p0, v1 >> 9 & 0x1FF0);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new x(y0, z0, function00, function01, function02, function03, function04, function30, v);
        }
    }

    public static final void f(c0.b b0, p p0, int v) {
        p0.S(0xB125F60A);
        int v1 = (v & 6) == 0 ? (p0.h(b0) ? 4 : 2) | v : v;
        if((v1 & 3) != 2 || !p0.x()) {
            b0.j(p0, ((int)(v1 & 14)));
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new e0(b0, v, 1);
        }
    }

    public static final void g(c0.b b0, p p0, int v) {
        p0.S(0xD0D6A1F1);
        if((((v & 6) == 0 ? (p0.h(b0) ? 4 : 2) | v : v) & 3) != 2 || !p0.x()) {
            C.a(R.l.d(yc.d.h(0x7F060042, p0), yc.d.h(0x7F06003E, p0), -34), null, null, c0.c.c(0x8BF9529D, new p0(b0, 3), p0), p0, 0xC00);  // color:WaveBlue
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new X(b0, v, 1);
        }
    }

    public void h(Window window0) {
    }

    public static void i(StringBuilder stringBuilder0, Object object0, Function1 function10) {
        if(function10 != null) {
            stringBuilder0.append(((CharSequence)function10.n(object0)));
            return;
        }
        if((object0 == null ? true : object0 instanceof CharSequence)) {
            stringBuilder0.append(((CharSequence)object0));
            return;
        }
        if(object0 instanceof Character) {
            stringBuilder0.append(((Character)object0).charValue());
            return;
        }
        stringBuilder0.append(String.valueOf(object0));
    }

    public static int j(Comparable comparable0, Comparable comparable1) {
        if(comparable0 == comparable1) {
            return 0;
        }
        if(comparable0 == null) {
            return -1;
        }
        return comparable1 == null ? 1 : comparable0.compareTo(comparable1);
    }

    public static S2.e k(int[] arr_v, int[] arr_v1) {
        NetworkRequest.Builder networkRequest$Builder0 = new NetworkRequest.Builder();
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            int v2 = arr_v[v1];
            try {
                networkRequest$Builder0.addCapability(v2);
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                A a0 = A.e();
                String s = S2.e.b;
                if(a0.a <= 5) {
                    Log.w(s, "Ignoring adding capability \'" + v2 + '\'', illegalArgumentException0);
                }
            }
        }
        for(int v = 0; v < arr_v1.length; ++v) {
            networkRequest$Builder0.addTransportType(arr_v1[v]);
        }
        NetworkRequest networkRequest0 = networkRequest$Builder0.build();
        j.e(networkRequest0, "networkRequest.build()");
        return new S2.e(networkRequest0);
    }

    public static final void l(p0.d d0, float f, float f1, long v, p0.h h0) {
        float f2 = h0.a / 2.0f;
        float f3 = m0.e.d(d0.d()) - 2.0f * f2;
        m5.b.c(d0, v, f, f1, yc.d.d(f2, f2), w.m(f3, f3), 0.0f, h0, 0x340);
    }

    public static Ab.k m(B3.c c0, Editable editable0, int v) {
        j.f(c0, "renderer");
        j.f(editable0, "sequence");
        J9.f f0 = new J9.f();  // initializer: Ljava/lang/Object;-><init>()V
        f0.c = c0;
        f0.d = "";
        String s = editable0.toString();
        Country country0 = (Country)c0.Y;
        String s1 = country0.c0;
        if(Vb.q.O(s, s1, false)) {
            s = s.substring(s1.length());
            j.e(s, "substring(...)");
        }
        String s2 = o0.x(country0);
        if(s2 != null && Vb.q.O(s, s2, false)) {
            f0.d = s2;
        }
        int v1 = s.length();
        String s3 = "";
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            int v4 = s.charAt(v2);
            if(Character.isDigit(((char)v4))) {
                if(v3 != 0) {
                    s3 = f0.a(s3, ((char)v3));
                    f0.a = false;
                }
                v3 = v4;
            }
            if(v2 == v - 1) {
                f0.a = true;
            }
        }
        if(v3 != 0) {
            s3 = f0.a(s3, ((char)v3));
        }
        return new Ab.k(s3, ((int)f0.b));
    }

    public static Spanned n(int v, String s) {
        return Build.VERSION.SDK_INT < 24 ? Html.fromHtml(s) : F1.d.b(v, s);
    }

    public static pc.o o(SSLSession sSLSession0) {
        List list1;
        List list0 = Bb.z.X;
        String s = sSLSession0.getCipherSuite();
        if(s == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if((s.equals("TLS_NULL_WITH_NULL_NULL") ? true : s.equals("SSL_NULL_WITH_NULL_NULL"))) {
            throw new IOException("cipherSuite == " + s);
        }
        pc.j j0 = pc.j.b.d(s);
        String s1 = sSLSession0.getProtocol();
        if(s1 == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if("NONE".equals(s1)) {
            throw new IOException("tlsVersion == NONE");
        }
        pc.B b0 = Bb.q.q(s1);
        try {
            Certificate[] arr_certificate = sSLSession0.getPeerCertificates();
            list1 = arr_certificate == null ? list0 : rc.b.l(Arrays.copyOf(arr_certificate, arr_certificate.length));
        }
        catch(SSLPeerUnverifiedException unused_ex) {
            list1 = list0;
        }
        Certificate[] arr_certificate1 = sSLSession0.getLocalCertificates();
        if(arr_certificate1 != null) {
            list0 = rc.b.l(Arrays.copyOf(arr_certificate1, arr_certificate1.length));
        }
        return new pc.o(b0, j0, list0, new D(16, list1));
    }

    public static final O0.f p(U0.B b0) {
        b0.a.getClass();
        return b0.a.d(N.e(b0.b), N.d(b0.b));
    }

    public static final O0.f q(U0.B b0, int v) {
        return b0.a.d(N.d(b0.b), Math.min(N.d(b0.b) + v, b0.a.X.length()));
    }

    public static final O0.f r(U0.B b0, int v) {
        return b0.a.d(Math.max(0, N.e(b0.b) - v), N.e(b0.b));
    }

    public static final Map s(O0 o00) {
        switch(o00.ordinal()) {
            case 0: {
                return com.apollographql.apollo.api.b.t("kyc", "kyc1");
            }
            case 1: {
                return com.apollographql.apollo.api.b.t("kyc", "kyc2-in-review");
            }
            case 2: {
                return com.apollographql.apollo.api.b.t("kyc", "kyc2");
            }
            default: {
                throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
            }
        }
    }

    public static void t(Class class0, Object object0, ILogger iLogger0) {
        String s = object0 == null ? "Hint" : object0.getClass().getCanonicalName();
        iLogger0.h(i1.DEBUG, "%s is not %s", new Object[]{s, class0.getCanonicalName()});
    }

    public static void u(InputConnection inputConnection0, EditorInfo editorInfo0, TextView textView0) {
        if(inputConnection0 != null && editorInfo0.hintText == null) {
            for(ViewParent viewParent0 = textView0.getParent(); viewParent0 instanceof View; viewParent0 = viewParent0.getParent()) {
            }
        }
    }

    public static void v(m m0, U7.c c0) {
        s4.a a0;
        ErrorDirectory errorDirectory0 = null;
        boolean z = false;
        int v = m0.a();
        int v1 = m0.B();
        long v2 = m0.c;
        switch(v) {
            case -7: {
                GifControlDirectory gifControlDirectory0 = new GifControlDirectory();
                int v3 = m0.B();
                switch(v3 >> 2 & 7) {
                    case 0: {
                        a0 = s4.a.X;
                        break;
                    }
                    case 1: {
                        a0 = s4.a.Y;
                        break;
                    }
                    case 2: {
                        a0 = s4.a.Z;
                        break;
                    }
                    case 3: {
                        a0 = s4.a.b0;
                        break;
                    }
                    case 4: 
                    case 5: 
                    case 6: 
                    case 7: {
                        a0 = s4.a.c0;
                        break;
                    }
                    default: {
                        a0 = s4.a.d0;
                    }
                }
                gifControlDirectory0.setObject(2, a0);
                gifControlDirectory0.setBoolean(3, (2 & v3) >> 1 == 1);
                if((v3 & 1) == 1) {
                    z = true;
                }
                gifControlDirectory0.setBoolean(4, z);
                gifControlDirectory0.setInt(1, m0.x());
                gifControlDirectory0.setInt(5, m0.B());
                m0.D(1L);
                c0.i(gifControlDirectory0);
                break;
            }
            case -2: {
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                for(int v4 = v1; v4 > 0; v4 = m0.a() & 0xFF) {
                    byteArrayOutputStream0.write(m0.c(v4), 0, v4);
                }
                c0.i(new GifCommentDirectory(new com.drew.metadata.e(byteArrayOutputStream0.toByteArray(), l4.d.c)));
                break;
            }
            case -1: {
                if(v1 == 11) {
                    String s = new String(m0.c(11), l4.d.a);
                    if(s.equals("XMP DataXMP")) {
                        ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
                        byte[] arr_b = new byte[0x101];
                        byte b;
                        while((b = m0.a()) != 0) {
                            arr_b[0] = b;
                            m0.F(arr_b, 1, b & 0xFF);
                            byteArrayOutputStream1.write(arr_b, 0, (b & 0xFF) + 1);
                        }
                        byte[] arr_b1 = byteArrayOutputStream1.toByteArray();
                        if(arr_b1.length - 0x101 > 0) {
                            L4.a.c(arr_b1, 0, arr_b1.length - 0x101, c0, null);
                        }
                    }
                    else if(s.equals("ICCRGBG1012")) {
                        int v5 = m0.a() & 0xFF;
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        while(v5 > 0) {
                            byteArrayOutputStream2.write(m0.c(v5), 0, v5);
                            v5 = m0.a() & 0xFF;
                        }
                        byte[] arr_b2 = byteArrayOutputStream2.toByteArray();
                        if(arr_b2.length != 0) {
                            com.drew.metadata.jpeg.b.d(new l4.b(0, arr_b2), c0, null);
                        }
                    }
                    else if(s.equals("NETSCAPE2.0")) {
                        m0.D(2L);
                        int v6 = m0.x();
                        m0.D(1L);
                        GifAnimationDirectory gifAnimationDirectory0 = new GifAnimationDirectory();
                        gifAnimationDirectory0.setInt(1, v6);
                        c0.i(gifAnimationDirectory0);
                    }
                    else {
                        int v7;
                        while((v7 = m0.B()) != 0) {
                            m0.D(((long)v7));
                        }
                    }
                }
                else {
                    c0.i(new ErrorDirectory(String.format("Invalid GIF application extension block size. Expected 11, got %d.", v1)));
                }
                break;
            }
            case 1: {
                if(v1 == 12) {
                    m0.D(12L);
                    int v8;
                    while((v8 = m0.B()) != 0) {
                        m0.D(((long)v8));
                    }
                }
                else {
                    errorDirectory0 = new ErrorDirectory(String.format("Invalid GIF plain text block size. Expected 12, got %d.", v1));
                }
                if(errorDirectory0 != null) {
                    c0.i(errorDirectory0);
                }
                break;
            }
            default: {
                c0.i(new ErrorDirectory(String.format("Unsupported GIF extension block with type 0x%02X.", ((byte)v))));
            }
        }
        long v9 = v2 + ((long)v1) - m0.c;
        if(v9 > 0L) {
            m0.D(v9);
        }
    }

    public static GifHeaderDirectory w(m m0) {
        GifHeaderDirectory gifHeaderDirectory0 = new GifHeaderDirectory();
        if(!m0.s(3).equals("GIF")) {
            gifHeaderDirectory0.addError("Invalid GIF file signature");
            return gifHeaderDirectory0;
        }
        String s = m0.s(3);
        if(!s.equals("87a") && !s.equals("89a")) {
            gifHeaderDirectory0.addError("Unexpected GIF version");
            return gifHeaderDirectory0;
        }
        boolean z = true;
        gifHeaderDirectory0.setString(1, s);
        gifHeaderDirectory0.setInt(2, m0.x());
        gifHeaderDirectory0.setInt(3, m0.x());
        int v = m0.B();
        gifHeaderDirectory0.setInt(4, 1 << (v & 7) + 1);
        if(s.equals("89a")) {
            if((v & 8) == 0) {
                z = false;
            }
            gifHeaderDirectory0.setBoolean(5, z);
        }
        gifHeaderDirectory0.setInt(6, ((v & 0x70) >> 4) + 1);
        gifHeaderDirectory0.setBoolean(7, v >> 7 != 0);
        gifHeaderDirectory0.setInt(8, m0.B());
        int v1 = m0.B();
        if(v1 != 0) {
            gifHeaderDirectory0.setFloat(9, ((float)((((double)v1) + 15.0) / 64.0)));
        }
        return gifHeaderDirectory0;
    }

    public static GifImageDirectory x(m m0) {
        GifImageDirectory gifImageDirectory0 = new GifImageDirectory();
        boolean z = true;
        gifImageDirectory0.setInt(1, m0.x());
        gifImageDirectory0.setInt(2, m0.x());
        gifImageDirectory0.setInt(3, m0.x());
        gifImageDirectory0.setInt(4, m0.x());
        int v = m0.a();
        boolean z1 = v >> 7 != 0;
        gifImageDirectory0.setBoolean(5, z1);
        gifImageDirectory0.setBoolean(6, (v & 0x40) != 0);
        if(z1) {
            if((v & 0x20) == 0) {
                z = false;
            }
            gifImageDirectory0.setBoolean(7, z);
            gifImageDirectory0.setInt(8, (v & 7) + 1);
            m0.D(((long)((2 << (v & 7)) * 3)));
        }
        m0.a();
        return gifImageDirectory0;
    }

    public static x8.b y(x8.b b0, int v, int v1, x8.e e0) {
        int v7;
        if(v <= 0 || v1 <= 0) {
            throw r8.i.Z;
        }
        x8.b b1 = new x8.b(v, v1);
        float[] arr_f = new float[v * 2];
        for(int v2 = 0; v2 < v1; ++v2) {
            for(int v3 = 0; v3 < v * 2; v3 += 2) {
                arr_f[v3] = ((float)(v3 / 2)) + 0.5f;
                arr_f[v3 + 1] = ((float)v2) + 0.5f;
            }
            for(int v4 = 0; v4 < v * 2; v4 += 2) {
                float f = arr_f[v4];
                float f1 = arr_f[v4 + 1];
                float f2 = e0.f * f1 + e0.c * f + e0.i;
                arr_f[v4] = (e0.d * f1 + e0.a * f + e0.g) / f2;
                arr_f[v4 + 1] = (e0.e * f1 + e0.b * f + e0.h) / f2;
            }
            int v5 = b0.X;
            boolean z = true;
            for(int v6 = 0; true; v6 += 2) {
                v7 = b0.Y;
                if(v6 >= v * 2 || !z) {
                    break;
                }
                int v8 = (int)arr_f[v6];
                int v9 = (int)arr_f[v6 + 1];
                if(v8 < -1 || v8 > v5 || v9 < -1 || v9 > v7) {
                    throw r8.i.Z;
                }
                if(v8 == -1) {
                    arr_f[v6] = 0.0f;
                    z = true;
                }
                else if(v8 == v5) {
                    arr_f[v6] = (float)(v5 - 1);
                    z = true;
                }
                else {
                    z = false;
                }
                if(v9 == -1) {
                    arr_f[v6 + 1] = 0.0f;
                    z = true;
                }
                else if(v9 == v7) {
                    arr_f[v6 + 1] = (float)(v7 - 1);
                    z = true;
                }
            }
            int v10 = v * 2 - 2;
            boolean z1 = true;
            while(v10 >= 0 && z1) {
                int v11 = (int)arr_f[v10];
                int v12 = (int)arr_f[v10 + 1];
                if(v11 < -1 || v11 > v5 || v12 < -1 || v12 > v7) {
                    throw r8.i.Z;
                }
                if(v11 == -1) {
                    arr_f[v10] = 0.0f;
                    z1 = true;
                }
                else if(v11 == v5) {
                    arr_f[v10] = (float)(v5 - 1);
                    z1 = true;
                }
                else {
                    z1 = false;
                }
                if(v12 == -1) {
                    arr_f[v10 + 1] = 0.0f;
                    z1 = true;
                }
                else if(v12 == v7) {
                    arr_f[v10 + 1] = (float)(v7 - 1);
                    z1 = true;
                }
                v10 += -2;
            }
            for(int v13 = 0; v13 < v * 2; v13 += 2) {
                try {
                    if(b0.c(((int)arr_f[v13]), ((int)arr_f[v13 + 1]))) {
                        b1.g(v13 / 2, v2);
                    }
                }
                catch(ArrayIndexOutOfBoundsException unused_ex) {
                    throw r8.i.Z;
                }
            }
        }
        return b1;
    }

    public abstract void z(c.P arg1, c.P arg2, Window arg3, View arg4, boolean arg5, boolean arg6);
}

