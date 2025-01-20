package yc;

import Aa.E;
import Aa.x;
import Ab.e;
import B.B;
import B.r;
import B.z;
import Bb.q;
import D0.K;
import E7.d;
import Ea.s;
import F0.h;
import F0.i;
import F0.k;
import Fa.y;
import I2.J;
import J2.w;
import M0.t;
import N.m2;
import Nb.j;
import O0.O;
import R9.j3;
import S9.m;
import U.Z;
import U.g0;
import U.l0;
import U.p;
import W4.f;
import Xb.A;
import Xb.Q;
import Y8.T;
import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.BlendModeColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.Layout;
import android.util.TypedValue;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sendwave.util.Country;
import f1.g;
import g0.b;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m0.a;
import n0.M;
import n0.n;
import n0.v;
import o9.L1;
import org.json.JSONArray;
import org.xmlpull.v1.XmlPullParserException;
import q9.L0;
import q9.r1;

public abstract class l {
    public static boolean a;

    public abstract void A(g arg1, g arg2);

    public abstract void B(g arg1, Thread arg2);

    public static final long C(float f, long v) {
        return q.a(Math.max(0.0f, a.b(v) - f), Math.max(0.0f, a.c(v) - f));
    }

    public static final Integer D(int v) {
        return v == 0x80000000 ? null : v;
    }

    public static byte[] E(d d0) {
        ArrayDeque arrayDeque0 = new ArrayDeque(20);
        int v = Math.min(0x2000, Math.max(0x80, Integer.highestOneBit(0) * 2));
        int v1 = 0;
        while(v1 < 0x7FFFFFF7) {
            int v2 = Math.min(v, 0x7FFFFFF7 - v1);
            byte[] arr_b = new byte[v2];
            arrayDeque0.add(arr_b);
            int v3 = 0;
            while(v3 < v2) {
                int v4 = d0.read(arr_b, v3, v2 - v3);
                if(v4 == -1) {
                    return l.o(arrayDeque0, v1);
                }

                v3 += v4;
                v1 += v4;
            }

            long v5 = ((long)v) * ((long)(v >= 0x1000 ? 2 : 4));
            if(v5 > 0x7FFFFFFFL) {
                v = 0x7FFFFFFF;
            }
            else if(v5 < 0xFFFFFFFF80000000L) {
                v = 0x80000000;
            }
            else {
                v = (int)v5;
            }
        }

        if(d0.read() != -1) {
            throw new OutOfMemoryError("input is too large to fit in a byte array");
        }

        return l.o(arrayDeque0, 0x7FFFFFF7);
    }

    public static final void a(S9.a a0, p p0, int v) {
        j.f(a0, "account");
        p0.S(0x14346658);
        if((((v & 6) == 0 ? (p0.f(a0) ? 4 : 2) | v : v) & 3) != 2 || !p0.x()) {
            g0.l l0 = g0.l.X;
            Modifier modifier0 = c.k(l0, 40.0f);
            K k0 = r.e(b.e, false);
            int v1 = p0.P;
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

            U.d.K(p0, k0, F0.j.f);
            U.d.K(p0, g00, F0.j.e);
            h h0 = F0.j.g;
            if(p0.O || !j.a(p0.G(), v1)) {
                m5.b.F(v1, p0, v1, h0);
            }

            U.d.K(p0, modifier1, F0.j.d);
            androidx.compose.foundation.layout.b b0 = androidx.compose.foundation.layout.b.a;
            l.d(a0.b, a0.f, p0, 0);
            p0.Q(2050229706);
            Country country0 = a0.c;
            if(country0 != null) {
                l.h(country0, b0.a(l0, b.c), p0, 0);
            }

            p0.p(false);
            p0.p(true);
        }
        else {
            p0.K();
        }

        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Aa.d(v, 6, a0);
        }
    }

    public static final void b(Function0 function00, Function0 function01, p p0, int v) {
        int v1 = 1;
        p0.S(0x383DEEE8);
        int v2 = (v & 6) == 0 ? (p0.h(function00) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v2 |= (p0.h(function01) ? 0x20 : 16);
        }

        if((v2 & 19) != 18 || !p0.x()) {
            Z z0 = U.l.a;
            Va.a a0 = new Va.a(w.S(0x7F120091, p0));  // string:cancel "Cancel"
            Va.b b0 = new Va.b(w.S(0x7F120112, p0));  // string:delete "Delete"
            String s = w.S(0x7F1200E4, p0);  // string:confirm_deletion_title "Delete Card"
            String s1 = w.S(0x7F12009E, p0);  // string:card_deletion_description "Your Virtual Visa will be terminated and all future 
                                              // online payments will fail. A new card can be activated with a new card number."
            List list0 = q.L(new Va.d[]{a0, b0});
            p0.Q(0xFF61E38);
            if((v2 & 0x70) != 0x20) {
                v1 = 0;
            }

            Object object0 = p0.G();
            if((v1 | ((v2 & 14) == 4 ? 1 : 0)) != 0 || object0 == z0) {
                object0 = new Ea.r(function00, function01);
                p0.a0(object0);
            }

            p0.p(false);
            f.k(s, s1, list0, function00, ((Function1)object0), p0, v2 << 9 & 0x1C00);
        }
        else {
            p0.K();
        }

        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Ha.j(function00, function01, v, 4);
        }
    }

    public static final void c(int v, p p0) {
        p0.S(0x7C467DF5);
        if(v != 0 || !p0.x()) {
            Modifier modifier0 = c.e(c.d(g0.l.X, 1.0f), 6.0f);
            p0.Q(0x74CD30E8);
            Object object0 = p0.G();
            if(object0 == U.l.a) {
                object0 = new T3.d(5);
                p0.a0(object0);
            }

            p0.p(false);
            J.a(modifier0, ((Function1)object0), p0, 54);
        }
        else {
            p0.K();
        }

        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new E(v, 9);
        }
    }

    public static final void d(j3 j30, boolean z, p p0, int v) {
        long v6;
        long v4;
        p0.S(1645410440);
        int v1 = (v & 6) == 0 ? (p0.f(j30) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.g(z) ? 0x20 : 16);
        }

        int v2 = -1;
        if((v1 & 19) != 18 || !p0.x()) {
            if(z) {
                p0.Q(496065030);
                int v3 = 0x7F06016D;  // color:purple_light
                switch((j30 == null ? -1 : m.a[j30.ordinal()])) {
                    case -1: {
                        v3 = 0x7F060047;  // color:WaveBlue50
                        break;
                    }
                    case 1: 
                    case 2: {
                        break;
                    }
                    case 3: 
                    case 4: 
                    case 5: {
                        v3 = 0x7F060171;  // color:red_telco_light
                        break;
                    }
                    case 6: {
                        v3 = 0x7F060105;  // color:lilac_light
                        break;
                    }
                    case 7: {
                        v3 = 0x7F06000A;  // color:ErrorRed100
                        break;
                    }
                    case 8: {
                        v3 = 0x7F06018B;  // color:turquoise_light
                        break;
                    }
                    case 9: {
                        v3 = 0x7F060074;  // color:another_light_blue
                        break;
                    }
                    case 10: 
                    case 11: 
                    case 12: {
                        v3 = 0x7F060162;  // color:peach_light
                        break;
                    }
                    case 13: 
                    case 14: {
                        v3 = 0x7F060103;  // color:light_yellow
                        break;
                    }
                    case 15: 
                    case 16: 
                    case 17: 
                    case 18: 
                    case 19: {
                        v3 = 0x7F060075;  // color:another_light_yellow
                        break;
                    }
                    case 20: {
                        v3 = 0x7F060176;  // color:salmon
                        break;
                    }
                    case 21: {
                        v3 = 0x7F060086;  // color:cant_get_enough_of_them_pale_yellows
                        break;
                    }
                    case 22: {
                        v3 = 0x7F06012B;  // color:more_light_blue
                        break;
                    }
                    case 23: {
                        v3 = 0x7F060129;  // color:mint_green
                        break;
                    }
                    case 24: {
                        v3 = 0x7F06017E;  // color:super_dark_yellow
                        break;
                    }
                    default: {
                        throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                    }
                }

                v4 = yc.d.h(v3, p0);
                p0.p(false);
            }
            else {
                v4 = M.J.b(p0, 0x1D915F86, 0x7F060014, p0, false);  // color:Gray200
            }

            if(z) {
                p0.Q(496067814);
                if(j30 != null) {
                    v2 = m.a[j30.ordinal()];
                }

                int v5 = 0x7F06016C;  // color:purple_dark
                switch(v2) {
                    case -1: {
                        v5 = 0x7F060046;  // color:WaveBlue400
                        break;
                    }
                    case 1: 
                    case 2: {
                        break;
                    }
                    case 3: 
                    case 4: 
                    case 5: {
                        v5 = 0x7F060170;  // color:red_telco_dark
                        break;
                    }
                    case 6: {
                        v5 = 0x7F060104;  // color:lilac_dark
                        break;
                    }
                    case 7: {
                        v5 = 0x7F06000E;  // color:ErrorRed500
                        break;
                    }
                    case 8: {
                        v5 = 0x7F06018A;  // color:turquoise
                        break;
                    }
                    case 9: {
                        v5 = 0x7F0600CF;  // color:green_telco
                        break;
                    }
                    case 10: 
                    case 11: 
                    case 12: {
                        v5 = 0x7F06009B;  // color:dark_blue
                        break;
                    }
                    case 13: 
                    case 14: {
                        v5 = 0x7F06006B;  // color:almost_black
                        break;
                    }
                    case 15: 
                    case 16: 
                    case 17: 
                    case 18: 
                    case 19: {
                        v5 = 0x7F06002C;  // color:Orange600
                        break;
                    }
                    case 20: {
                        v5 = 0x7F06018F;  // color:white
                        break;
                    }
                    case 21: {
                        v5 = 0x7F0600C7;  // color:dirtier_orange
                        break;
                    }
                    case 22: {
                        v5 = 0x7F06009C;  // color:dark_dark_blue
                        break;
                    }
                    case 23: {
                        v5 = 0x7F06017C;  // color:super_dark_orange
                        break;
                    }
                    case 24: {
                        v5 = 0x7F06017D;  // color:super_dark_pink
                        break;
                    }
                    default: {
                        throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                    }
                }

                v6 = yc.d.h(v5, p0);
                p0.p(false);
            }
            else {
                v6 = M.J.b(p0, 496069222, 0x7F060018, p0, false);  // color:Gray500
            }

            n0.p p1 = n0.p.a;
            g0.l l0 = g0.l.X;
            if(j30 == null) {
                p0.Q(-1800488818);
                Modifier modifier5 = androidx.compose.foundation.a.b(c.k(l0, 36.0f), v4, H.f.a);
                K k0 = r.e(b.e, false);
                int v8 = p0.P;
                g0 g01 = p0.m();
                Modifier modifier6 = g0.a.d(p0, modifier5);
                k.a.getClass();
                i i1 = F0.j.b;
                p0.U();
                if(p0.O) {
                    p0.l(i1);
                }
                else {
                    p0.d0();
                }

                U.d.K(p0, k0, F0.j.f);
                U.d.K(p0, g01, F0.j.e);
                h h1 = F0.j.g;
                if(p0.O || !j.a(p0.G(), v8)) {
                    m5.b.F(v8, p0, v8, h1);
                }

                U.d.K(p0, modifier6, F0.j.d);
                s0.b b3 = l.y(0x7F08029A, p0, 0);  // drawable:ic_sim_17
                BlendModeColorFilter blendModeColorFilter1 = Build.VERSION.SDK_INT >= 29 ? p1.a(v6, 5) : new PorterDuffColorFilter(M.G(v6), M.J(5));
                M6.b.d(b3,         // b0:s0.b
                       null,       // s:java.lang.String
                       null,       // modifier0:androidx.compose.ui.Modifier
                       null,       // c0:g0.c
                       null,       // j0:D0.j
                       0.0f,       // f:float
                       new n(v6, 5, blendModeColorFilter1), // n0:n0.n
                       p0,         // p0:U.p
                       0x30,       // v:int
                       60          // v1:int
                       );
            }
            else {
                p0.Q(-1801654635);
                Modifier modifier0 = androidx.compose.foundation.a.b(c.k(l0, 36.0f), v4, H.f.a);
                B b0 = z.a(B.k.c, b.m, p0, 0);
                int v7 = p0.P;
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

                U.d.K(p0, b0, F0.j.f);
                U.d.K(p0, g00, F0.j.e);
                h h0 = F0.j.g;
                if(p0.O || !j.a(p0.G(), v7)) {
                    m5.b.F(v7, p0, v7, h0);
                }

                U.d.K(p0, modifier1, F0.j.d);
                s0.b b1 = l.y(0x7F08029A, p0, 0);  // drawable:ic_sim_17
                Modifier modifier2 = androidx.compose.foundation.layout.a.n(l0, 0.0f, 5.0f, 0.0f, 0.0f, 13);
                g0.e e0 = b.n;
                Modifier modifier3 = modifier2.d(new HorizontalAlignElement(e0));
                BlendModeColorFilter blendModeColorFilter0 = Build.VERSION.SDK_INT >= 29 ? p1.a(v6, 5) : new PorterDuffColorFilter(M.G(v6), M.J(5));
                M6.b.d(b1,         // b0:s0.b
                       null,       // s:java.lang.String
                       modifier3,  // modifier0:androidx.compose.ui.Modifier
                       null,       // c0:g0.c
                       null,       // j0:D0.j
                       0.0f,       // f:float
                       new n(v6, 5, blendModeColorFilter0), // n0:n0.n
                       p0,         // p0:U.p
                       0x30,       // v:int
                       56          // v1:int
                       );
                Modifier modifier4 = androidx.compose.foundation.layout.a.n(l0, 0.0f, 0.5f, 0.0f, 0.0f, 13).d(new HorizontalAlignElement(e0));
                O0.B b2 = new O0.B(true);
                m2.b(j30.X,         // s:java.lang.String
                     modifier4,     // modifier0:androidx.compose.ui.Modifier
                     0L,            // v:long
                     0L,            // v1:long
                     null,          // s1:T0.s
                     null,          // w0:T0.w
                     null,          // l0:T0.l
                     0L,            // v2:long
                     null,          // j0:Z0.j
                     null,          // i0:Z0.i
                     0L,            // v3:long
                     0,             // v4:int
                     false,         // z:boolean
                     0,             // v5:int
                     0,             // v6:int
                     null,          // function10:kotlin.jvm.functions.Function1
                     db.b.a(new O(v6, q.C(7), T0.w.k0, db.b.a, q.B(0.06), 3, q.C(13), b2, 0xF57F58), p0), // o0:O0.O
                     p0,            // p0:U.p
                     0,             // v7:int
                     0,             // v8:int
                     0xFFFC         // v9:int
                     );
            }

            p0.p(true);
            p0.p(false);
        }
        else {
            p0.K();
        }

        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new S9.l(j30, z, v);
        }
    }

    public static final void e(ia.j j0, Modifier modifier0, p p0, int v) {
        androidx.compose.foundation.layout.b b0 = androidx.compose.foundation.layout.b.a;
        j.f(j0, "state");
        p0.S(0x216080C5);
        int v1 = (v & 6) == 0 ? (p0.f(b0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.f(j0) ? 0x20 : 16);
        }

        if(((v1 | 0x180) & 0x93) != 0x92 || !p0.x()) {
            modifier0 = g0.l.X;
            M6.b.a(j0,         // object0:java.lang.Object
                   b0.a(c.m(modifier0, 120.0f, 120.0f, NaNf, NaNf), b.e), // modifier0:androidx.compose.ui.Modifier
                   null,       // function10:kotlin.jvm.functions.Function1
                   b.e,        // c0:g0.c
                   "loading-success-overlay", // s:java.lang.String
                   null,       // function11:kotlin.jvm.functions.Function1
                   ia.e.a,     // b0:c0.b
                   p0,         // p0:U.p
                   (v1 | 0x180) >> 3 & 14 | 0x186C00, // v:int
                   36          // v1:int
                   );
        }
        else {
            p0.K();
        }

        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new s(v, 14, j0, modifier0);
        }
    }

    public static final void f(ta.e e0, Function0 function00, Function0 function01, Function0 function02, Function0 function03, p p0, int v) {
        j.f(e0, "state");
        j.f(function00, "onDeleteCardClicked");
        j.f(function01, "onDeleteConfirmationDismissed");
        j.f(function02, "onDeletionConfirmed");
        j.f(function03, "onBackPressed");
        p0.S(0x74E4AD0D);
        int v1 = (v & 6) == 0 ? (p0.f(e0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.h(function00) ? 0x20 : 16);
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
            N4.j.d(w.S(0x7F1200A6, p0),         // s:java.lang.String  // string:card_settings "Card Settings"
                   null,                        // modifier0:androidx.compose.ui.Modifier
                   0L,                          // v:long
                   function03,                  // function00:kotlin.jvm.functions.Function0
                   null,                        // function30:kotlin.jvm.functions.Function3
                   0L,                          // v1:long
                   0L,                          // v2:long
                   null,                        // q10:N.q1
                   c0.c.c(1632101705, new y(e0, function01, function02, function03, function00, 3), p0), // b0:c0.b
                   p0,                          // p0:U.p
                   v1 >> 3 & 0x1C00 | 0x6000000, // v3:int
                   0xF6                         // v4:int
                   );
        }
        else {
            p0.K();
        }

        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Va.p(e0, function00, function01, function02, function03, v, 3);
        }
    }

    public static final m0.c g(long v, long v1) {
        return new m0.c(m0.b.d(v), m0.b.e(v), m0.e.d(v1) + m0.b.d(v), m0.e.b(v1) + m0.b.e(v));
    }

    public static final void h(Country country0, Modifier modifier0, p p0, int v) {
        Integer integer0;
        p0.S(0xB611F753);
        int v1 = (v & 6) == 0 ? (p0.f(country0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.f(modifier0) ? 0x20 : 16);
        }

        if((v1 & 19) != 18 || !p0.x()) {
            g0.l l0 = g0.l.X;
            if(j.a(country0, L0.d)) {
                integer0 = 0x7F080197;  // drawable:flag_sn_round
            }
            else if(j.a(country0, L0.e)) {
                integer0 = 0x7F08010F;  // drawable:flag_ci_round
            }
            else if(j.a(country0, L0.f)) {
                integer0 = 0x7F0801AF;  // drawable:flag_ug_round
            }
            else if(j.a(country0, L0.i)) {
                integer0 = 0x7F0800F9;  // drawable:flag_bf_round
            }
            else if(j.a(country0, L0.h)) {
                integer0 = 0x7F080166;  // drawable:flag_ml_round
            }
            else if(j.a(country0, L0.l)) {
                integer0 = 0x7F080131;  // drawable:flag_gm_round
            }
            else if(j.a(country0, L0.m)) {
                integer0 = 0x7F080173;  // drawable:flag_ne_round
            }
            else {
                integer0 = j.a(country0, L0.p) ? 0x7F080194 : null;  // drawable:flag_sl_round
            }

            if(integer0 != null) {
                Modifier modifier1 = androidx.compose.foundation.a.b(c.k(modifier0, 18.0f), v.e, H.f.a);
                K k0 = r.e(b.e, false);
                int v2 = p0.P;
                g0 g00 = p0.m();
                Modifier modifier2 = g0.a.d(p0, modifier1);
                k.a.getClass();
                i i0 = F0.j.b;
                p0.U();
                if(p0.O) {
                    p0.l(i0);
                }
                else {
                    p0.d0();
                }

                U.d.K(p0, k0, F0.j.f);
                U.d.K(p0, g00, F0.j.e);
                h h0 = F0.j.g;
                if(p0.O || !j.a(p0.G(), v2)) {
                    m5.b.F(v2, p0, v2, h0);
                }

                U.d.K(p0, modifier2, F0.j.d);
                Modifier modifier3 = c.k(l0, 16.0f);
                M6.b.d(l.y(((int)integer0), p0, 0),         // b0:s0.b
                       country0.X,                          // s:java.lang.String
                       modifier3,                           // modifier0:androidx.compose.ui.Modifier
                       null,                                // c0:g0.c
                       null,                                // j0:D0.j
                       0.0f,                                // f:float
                       null,                                // n0:n0.n
                       p0,                                  // p0:U.p
                       0x180,                               // v:int
                       120                                  // v1:int
                       );
                p0.p(true);
            }
        }
        else {
            p0.K();
        }

        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new s(v, 6, country0, modifier0);
        }
    }

    public static final void i(N9.d d0, N9.e e0, int v, Function0 function00, Function0 function01, Function0 function02, c0.b b0, p p0, int v1, int v2) {
        N9.e e1;
        int v6;
        Z z5;
        N9.e e3;
        int v5;
        j.f(function00, "onTooltipClick");
        j.f(function01, "onTooltipDismiss");
        p0.S(0x44742E51);
        int v3 = (v1 & 6) == 0 ? (((v1 & 8) == 0 ? p0.f(d0) : p0.h(d0)) ? 4 : 2) | v1 : v1;
        int v4 = v3 | 0x30;
        if((v2 & 4) != 0) {
            v4 = v3 | 0x1B0;
            v5 = v;
        }
        else if((v1 & 0x180) == 0) {
            v5 = v;
            v4 |= (p0.d(v5) ? 0x100 : 0x80);
        }
        else {
            v5 = v;
        }

        if((v1 & 0xC00) == 0) {
            v4 |= (p0.h(function00) ? 0x800 : 0x400);
        }

        if((v1 & 0x6000) == 0) {
            v4 |= (p0.h(function01) ? 0x4000 : 0x2000);
        }

        if((v1 & 0x30000) == 0) {
            v4 |= (p0.h(function02) ? 0x20000 : 0x10000);
        }

        if((v1 & 0x180000) == 0) {
            v4 |= (p0.h(b0) ? 0x100000 : 0x80000);
        }

        if((0x92493 & v4) != 0x92492 || !p0.x()) {
            N9.e e2 = N9.e.X;
            int v7 = (v2 & 4) == 0 ? v5 : 0;
            Z z0 = U.l.a;
            if(d0 == null) {
                p0.Q(-1177466024);
                b0.j(p0, ((int)(v4 >> 18 & 14)));
                p0.p(false);
                e3 = e2;
            }
            else {
                p0.Q(0x80598503);
                String s = d0.f == null ? d0.a : d0.f;
                int v8 = v4 & 14 | v4 << 9 & 0xE000 | v4 << 6 & 0x70000 | v4 << 6 & 0x380000;
                j.f(s, "persistenceKey");
                p0.Q(0x69E265FB);
                p0.Q(0x6923510);
                int v9 = 1;
                boolean z1 = (v8 & 0xE000 ^ 0x6000) > 0x4000 && p0.f(e2);
                int v10 = d0.d;
                boolean z2 = p0.d(v10);
                int v11 = ((v8 & 0x70000 ^ 0x30000) <= 0x20000 || !p0.f(function00)) && (v8 & 0x30000) != 0x20000 ? 0 : 1;
                if(((v8 & 0x380000 ^ 0x180000) <= 0x100000 || !p0.f(function01)) && (v8 & 0x180000) != 0x100000) {
                    v9 = 0;
                }

                int v12 = d0.e;
                boolean z3 = p0.d(v12);
                boolean z4 = p0.f(s);
                Object object0 = p0.G();
                if((z1 | z2 | v11 | v9 | z3 | z4) != 0 || object0 == z0) {
                    z5 = z0;
                    N9.h h0 = new N9.h(e2, v10, v12, s, function00, function01);
                    p0.a0(h0);
                    object0 = h0;
                }
                else {
                    z5 = z0;
                }

                p0.p(false);
                p0.Q(0x74158CBA);
                Context context0 = (Context)p0.k(AndroidCompositionLocals_androidKt.b);
                p0.Q(110284158);
                boolean z6 = p0.f(d0);
                Object object1 = p0.G();
                if(z6 || object1 == z5) {
                    object1 = new u9.j(context0);
                    ((Function1)object0).n(object1);
                    p0.a0(object1);
                }

                p0.p(false);
                p0.p(false);
                p0.p(false);
                c0.b b1 = c0.c.c(0x7DF428AC, new x(7, d0), p0);
                e3 = e2;
                l.j(d0.a, e2, v7, ((u9.j)object1), b1, function02, b0, p0, v4 & 0x70 | 0x6000 | v4 & 0x380 | v4 & 0x70000 | v4 & 0x380000);
                p0.p(false);
            }

            e1 = e3;
            v6 = v7;
        }
        else {
            p0.K();
            v6 = v5;
            e1 = e0;
        }

        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new N9.f(d0, e1, v6, function00, function01, function02, b0, v1, v2);
        }
    }

    public static final void j(String s, N9.e e0, int v, u9.j j0, c0.b b0, Function0 function00, c0.b b1, p p0, int v1) {
        j.f(s, "showTooltipEffectKey");
        j.f(j0, "balloonBuilder");
        j.f(function00, "onTooltipShown");
        p0.S(825067002);
        int v2 = (v1 & 6) == 0 ? (p0.f(s) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (p0.f(e0) ? 0x20 : 16);
        }

        if((v1 & 0x180) == 0) {
            v2 |= (p0.d(v) ? 0x100 : 0x80);
        }

        if((v1 & 0xC00) == 0) {
            v2 |= (p0.f(j0) ? 0x800 : 0x400);
        }

        if((v1 & 0x6000) == 0) {
            v2 |= (p0.h(b0) ? 0x4000 : 0x2000);
        }

        if((0x30000 & v1) == 0) {
            v2 |= (p0.h(function00) ? 0x20000 : 0x10000);
        }

        if((v1 & 0x180000) == 0) {
            v2 |= (p0.h(b1) ? 0x100000 : 0x80000);
        }

        if((v2 & 0x92493) != 0x92492 || !p0.x()) {
            v9.h.a(null, j0, null, null, null, b0, c0.c.c(0xA7103DC1, new N9.k(b1, s, e0, v, function00), p0), p0, v2 >> 6 & 0x70 | 0x180000 | v2 << 3 & 0x70000);
        }
        else {
            p0.K();
        }

        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new N9.g(s, e0, v, j0, b0, function00, b1, v1);
        }
    }

    public abstract boolean k(f1.h arg1, f1.d arg2, f1.d arg3);

    public abstract boolean l(f1.h arg1, Object arg2, Object arg3);

    public abstract boolean m(f1.h arg1, g arg2, g arg3);

    public static final void n(int v, int v1) {
        if(v <= 0 || v1 <= 0) {
            throw new IllegalArgumentException((v == v1 ? M.J.d(v, "size ", " must be greater than zero.") : A3.e.u(v, v1, "Both size ", " and step ", " must be greater than zero.")).toString());
        }
    }

    public static byte[] o(ArrayDeque arrayDeque0, int v) {
        if(arrayDeque0.isEmpty()) {
            return new byte[0];
        }

        byte[] arr_b = (byte[])arrayDeque0.remove();
        if(arr_b.length == v) {
            return arr_b;
        }

        int v1 = v - arr_b.length;
        byte[] arr_b1 = Arrays.copyOf(arr_b, v);
        while(v1 > 0) {
            byte[] arr_b2 = (byte[])arrayDeque0.remove();
            int v2 = Math.min(v1, arr_b2.length);
            System.arraycopy(arr_b2, 0, arr_b1, v - v1, v2);
            v1 -= v2;
        }

        return arr_b1;
    }

    public static final double p(int v, int v1, int v2, int v3, j3.g g0) {
        double f = ((double)v2) / ((double)v);
        double f1 = ((double)v3) / ((double)v1);
        switch(g0.ordinal()) {
            case 0: {
                return Math.max(f, f1);
            }
            case 1: {
                return Math.min(f, f1);
            }
            default: {
                throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
            }
        }
    }

    public static void q(Ya.n n0, float f) {
        n0.a.i.m(f);
        n0.a.j.m(0.0f);
    }

    public static final void r(Throwable throwable0) {
        HashMap hashMap0;
        a5.h h0;
        if(l.a && throwable0 != null) {
            HashSet hashSet0 = new HashSet();
            StackTraceElement[] arr_stackTraceElement = throwable0.getStackTrace();
            j.e(arr_stackTraceElement, "e.stackTrace");
            for(int v = 0; v < arr_stackTraceElement.length; ++v) {
                String s = arr_stackTraceElement[v].getClassName();
                j.e(s, "it.className");
                synchronized(a5.j.a) {
                    hashMap0 = a5.j.b;
                    if(hashMap0.isEmpty()) {
                        hashMap0.put(a5.h.f0, new String[]{"com.facebook.appevents.aam."});
                        hashMap0.put(a5.h.c0, new String[]{"com.facebook.appevents.codeless."});
                        hashMap0.put(a5.h.d0, new String[]{"com.facebook.appevents.cloudbridge."});
                        hashMap0.put(a5.h.y0, new String[]{"com.facebook.internal.instrument.errorreport."});
                        hashMap0.put(a5.h.z0, new String[]{"com.facebook.internal.instrument.anrreport."});
                        hashMap0.put(a5.h.g0, new String[]{"com.facebook.appevents.ml."});
                        hashMap0.put(a5.h.h0, new String[]{"com.facebook.appevents.suggestedevents."});
                        hashMap0.put(a5.h.e0, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
                        hashMap0.put(a5.h.i0, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
                        hashMap0.put(a5.h.k0, new String[]{"com.facebook.appevents.integrity.ProtectedModeManager"});
                        hashMap0.put(a5.h.l0, new String[]{"com.facebook.appevents.integrity.MACARuleMatchingManager"});
                        hashMap0.put(a5.h.m0, new String[]{"com.facebook.appevents.integrity.BlocklistEventsManager"});
                        hashMap0.put(a5.h.n0, new String[]{"com.facebook.appevents.integrity.RedactedEventsManager"});
                        hashMap0.put(a5.h.o0, new String[]{"com.facebook.appevents.integrity.SensitiveParamsManager"});
                        hashMap0.put(a5.h.p0, new String[]{"com.facebook.appevents.eventdeactivation."});
                        hashMap0.put(a5.h.q0, new String[]{"com.facebook.appevents.ondeviceprocessing."});
                        hashMap0.put(a5.h.s0, new String[]{"com.facebook.appevents.iap."});
                        hashMap0.put(a5.h.A0, new String[]{"com.facebook.internal.logging.monitor"});
                    }
                }

                Iterator iterator0 = hashMap0.entrySet().iterator();
            alab1:
                while(true) {
                    if(!iterator0.hasNext()) {
                        h0 = a5.h.Y;
                        break;
                    }

                    Object object0 = iterator0.next();
                    h0 = (a5.h)((Map.Entry)object0).getKey();
                    String[] arr_s = (String[])((Map.Entry)object0).getValue();
                    for(int v2 = 0; v2 < arr_s.length; ++v2) {
                        if(Vb.q.O(s, arr_s[v2], false)) {
                            break alab1;
                        }
                    }
                }

                if(h0 != a5.h.Y) {
                    j.f(h0, "feature");
                    M4.l.a().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString("FBSDKFeature" + h0, "17.0.2").apply();
                    hashSet0.add(h0.toString());
                }
            }

            if(M4.B.c() && !hashSet0.isEmpty()) {
                JSONArray jSONArray0 = new JSONArray(hashSet0);
                c5.c c0 = new c5.c();  // initializer: Ljava/lang/Object;-><init>()V
                c0.b = c5.a.Y;
                Long long0 = (long)(System.currentTimeMillis() / 1000L);
                c0.g = long0;
                c0.c = jSONArray0;
                String s1 = "analysis_log_" + long0 + ".json";
                j.e(s1, "StringBuffer()\n            .append(InstrumentUtility.ANALYSIS_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
                c0.a = s1;
                c0.b();
            }
        }
    }

    public static final float s(Layout layout0, int v, Paint paint0) {
        float f = layout0.getLineLeft(v);
        if(layout0.getEllipsisCount(v) > 0 && layout0.getParagraphDirection(v) == 1 && f >= 0.0f) {
            int v1 = layout0.getLineStart(v);
            float f1 = layout0.getPrimaryHorizontal(layout0.getEllipsisStart(v) + v1);
            float f2 = paint0.measureText("…") + (f1 - f);
            Layout.Alignment layout$Alignment0 = layout0.getParagraphAlignment(v);
            return (layout$Alignment0 == null ? -1 : R0.d.a[layout$Alignment0.ordinal()]) == 1 ? (((float)layout0.getWidth()) - f2) / 2.0f + Math.abs(f) : ((float)layout0.getWidth()) - f2 + Math.abs(f);
        }

        return 0.0f;
    }

    public static final float t(Layout layout0, int v, Paint paint0) {
        int v1 = -1;
        if(layout0.getEllipsisCount(v) > 0 && layout0.getParagraphDirection(v) == -1 && ((float)layout0.getWidth()) >= layout0.getLineRight(v)) {
            int v2 = layout0.getLineStart(v);
            float f = layout0.getPrimaryHorizontal(layout0.getEllipsisStart(v) + v2);
            float f1 = layout0.getLineRight(v);
            float f2 = paint0.measureText("…") + (f1 - f);
            Layout.Alignment layout$Alignment0 = layout0.getParagraphAlignment(v);
            if(layout$Alignment0 != null) {
                v1 = R0.d.a[layout$Alignment0.ordinal()];
            }

            return v1 == 1 ? ((float)layout0.getWidth()) - layout0.getLineRight(v) - (((float)layout0.getWidth()) - f2) / 2.0f : ((float)layout0.getWidth()) - layout0.getLineRight(v) - (((float)layout0.getWidth()) - f2);
        }

        return 0.0f;
    }

    public static final Object u(M0.j j0, t t0) {
        Object object0 = j0.X.get(t0);
        return object0 == null ? null : object0;
    }

    public static final A v(q2.v v0) {
        Map map0 = v0.k;
        Object object0 = map0.get("QueryDispatcher");
        if(object0 == null) {
            Executor executor0 = v0.b;
            if(executor0 != null) {
                object0 = Xb.J.i(executor0);
                map0.put("QueryDispatcher", object0);
                return (A)object0;
            }

            j.p("internalQueryExecutor");
            throw null;
        }

        return (A)object0;
    }

    public static final A w(q2.v v0) {
        Map map0 = v0.k;
        Object object0 = map0.get("TransactionDispatcher");
        if(object0 == null) {
            S2.h h0 = v0.c;
            if(h0 != null) {
                object0 = Xb.J.i(h0);
                map0.put("TransactionDispatcher", object0);
                return (A)object0;
            }

            j.p("internalTransactionExecutor");
            throw null;
        }

        return (A)object0;
    }

    public static final Object x(V8.c c0, Exception exception0, Fb.c c1) {
        Exception exception1;
        Ua.h h0;
        if(c1 instanceof Ua.h) {
            h0 = (Ua.h)c1;
            int v = h0.d0;
            if((v & 0x80000000) == 0) {
                h0 = new Ua.h(c1);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
            }
            else {
                h0.d0 = v ^ 0x80000000;
            }
        }
        else {
            h0 = new Ua.h(c1);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
        }

        Object object0 = h0.c0;
        Object object1 = Eb.a.X;
        switch(h0.d0) {
            case 0: {
                W5.f.b0(object0);
                h0.b0 = exception0;
                h0.d0 = 1;
                object0 = c0.e(h0);
                if(object0 == object1) {
                    return object1;
                }

                goto label_21;
            }
            case 1: {
                exception0 = h0.b0;
                W5.f.b0(object0);
            label_21:
                String s = r1.d(0x7F120457, new Object[0]);  // string:unknown_error_title "Error"
                String s1 = r1.d(0x7F120183, new Object[0]);  // string:error_update_app_to_continue "You must update your app to continue."
                String s2 = r1.d(0x7F1202DC, new Object[0]);  // string:ok "OK"
                h0.b0 = exception0;
                h0.d0 = 2;
                if(Pb.a.O(((V8.d)object0),         // d0:V8.d
                          s,                       // s:java.lang.String
                          s1,                      // charSequence0:java.lang.CharSequence
                          s2,                      // s1:java.lang.String
                          null,                    // charSequence1:java.lang.CharSequence
                          false,                   // z:boolean
                          null,                    // integer0:java.lang.Integer
                          null,                    // u20:q9.U2
                          h0,                      // g0:kotlin.coroutines.g
                          504                      // v:int
                          ) == object1) {
                    return object1;
                }

                exception1 = exception0;
                break;
            }
            case 2: {
                exception1 = h0.b0;
                W5.f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }

        hb.n.b(exception1, null, null, 14);
        return Ab.t.a;
    }

    public static final s0.b y(int v, p p0, int v1) {
        boolean z;
        TypedValue typedValue0;
        s0.b b1;
        Context context0 = (Context)p0.k(AndroidCompositionLocals_androidKt.b);
        p0.k(AndroidCompositionLocals_androidKt.a);
        Resources resources0 = context0.getResources();
        K0.e e0 = (K0.e)p0.k(AndroidCompositionLocals_androidKt.d);
        synchronized(e0) {
            typedValue0 = (TypedValue)e0.a.f(v);
            z = true;
            if(typedValue0 == null) {
                typedValue0 = new TypedValue();
                resources0.getValue(v, typedValue0, true);
                int v3 = e0.a.d(v);
                Object[] arr_object = e0.a.c;
                Object object0 = arr_object[v3];
                e0.a.b[v3] = v;
                arr_object[v3] = typedValue0;
            }
        }

        CharSequence charSequence0 = typedValue0.string;
        K0.b b0 = null;
        if(charSequence0 != null && Vb.j.U(charSequence0, ".xml")) {
            p0.Q(-803040357);
            Resources.Theme resources$Theme0 = context0.getTheme();
            int v4 = typedValue0.changingConfigurations;
            K0.d d0 = (K0.d)p0.k(AndroidCompositionLocals_androidKt.c);
            K0.c c0 = new K0.c(resources$Theme0, v);
            WeakReference weakReference0 = (WeakReference)d0.a.get(c0);
            if(weakReference0 != null) {
                b0 = (K0.b)weakReference0.get();
            }

            if(b0 == null) {
                XmlResourceParser xmlResourceParser0 = resources0.getXml(v);
                int v5;
                for(v5 = xmlResourceParser0.next(); v5 != 1 && v5 != 2; v5 = xmlResourceParser0.next()) {
                }

                if(v5 != 2) {
                    throw new XmlPullParserException("No start tag found");
                }

                if(!j.a(xmlResourceParser0.getName(), "vector")) {
                    throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                }

                b0 = M6.b.N(resources$Theme0, resources0, xmlResourceParser0, v4);
                WeakReference weakReference1 = new WeakReference(b0);
                d0.a.put(c0, weakReference1);
            }

            b1 = t0.a.c(b0.a, p0);
            p0.p(false);
            return b1;
        }

        p0.Q(0xD024F3BD);
        Resources.Theme resources$Theme1 = context0.getTheme();
        boolean z1 = p0.f(charSequence0);
        if(((v1 & 14 ^ 6) <= 4 || !p0.d(v)) && (v1 & 6) != 4) {
            z = false;
        }

        boolean z2 = p0.f(resources$Theme1);
        Object object1 = p0.G();
        if((z1 | z | z2) != 0 || object1 == U.l.a) {
            try {
                Drawable drawable0 = resources0.getDrawable(v, null);
                j.d(drawable0, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                object1 = new n0.g(((BitmapDrawable)drawable0).getBitmap());
            }
            catch(Exception exception0) {
                throw new e("Error attempting to load resource: " + charSequence0, exception0);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
            }

            p0.a0(object1);
        }

        b1 = new s0.a(((n0.g)object1), 0L, io.sentry.config.a.d(((n0.g)object1).a.getWidth(), ((n0.g)object1).a.getHeight()));
        p0.p(false);
        return b1;
    }

    public static final Object z(int v, long v1, Function1 function10, Fb.c c0) {
        Function1 function11;
        long v5;
        int v4;
        int v3;
        L1 l10;
        if(c0 instanceof L1) {
            l10 = (L1)c0;
            int v2 = l10.g0;
            if((v2 & 0x80000000) == 0) {
                l10 = new L1(c0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
            }
            else {
                l10.g0 = v2 ^ 0x80000000;
            }
        }
        else {
            l10 = new L1(c0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
        }

        Object object0 = l10.f0;
        Object object1 = Eb.a.X;
        switch(l10.g0) {
            case 0: {
                W5.f.b0(object0);
                break;
            }
            case 1: {
                try {
                    v3 = l10.e0;
                    v4 = l10.d0;
                    v5 = l10.b0;
                    function11 = l10.c0;
                    W5.f.b0(object0);
                    goto label_42;
                }
                catch(T unused_ex) {
                    goto label_38;
                }
            }
            case 2: {
                v = l10.d0;
                v1 = l10.b0;
                function10 = l10.c0;
                W5.f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }

        while(v > 0) {
            int v6 = 3;
            function11 = function10;
            v5 = v1;
            v4 = v;
            while(true) {
                try {
                    v3 = v6 - 1;
                    l10.c0 = function11;
                    l10.b0 = v5;
                    l10.d0 = v4;
                    l10.e0 = v3;
                    l10.g0 = 1;
                    object0 = function11.n(l10);
                    break;
                }
                catch(T unused_ex) {
                label_38:
                    v6 = v3;
                }
            }

            if(object0 == object1) {
                return object1;
            }

        label_42:
            if(object0 != null) {
                return object0;
            }

            l10.c0 = function11;
            l10.b0 = v5;
            l10.d0 = v4 - 1;
            l10.g0 = 2;
            if(Q.b(v5, l10) == object1) {
                return object1;
            }

            v = v4 - 1;
            v1 = v5;
            function10 = function11;
        }

        return null;
    }
}

