package R2;

import Aa.H;
import Aa.N;
import B.B;
import B.C;
import B.O;
import B.g;
import B.k;
import B.q0;
import B.v0;
import B.x0;
import B.z0;
import B.z;
import Bb.r;
import C9.d;
import C9.e;
import D.A;
import D0.K;
import D0.V;
import Ea.F0;
import Ea.n;
import Ea.s;
import F0.h;
import F0.i;
import M.J;
import N.M0;
import N.M;
import N.Q;
import N.T;
import N.m2;
import N.n2;
import N.o2;
import N.r1;
import N.s1;
import N.x;
import N4.o;
import Nb.j;
import T9.c;
import U.Z;
import U.g0;
import U.l0;
import U.p;
import Y8.F7;
import Y8.G7;
import Y8.H7;
import Y8.I7;
import Y8.K7;
import Y8.y6;
import Z2.t;
import a5.w;
import a9.C4;
import a9.z4;
import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c0.b;
import com.sendwave.backend.fragment.NonTimelyAnnouncementsFragment;
import com.sendwave.models.CurrencyAmount;
import e1.q;
import g0.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import k5.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import n0.S;
import n0.v;
import u.P;
import y.F;
import y.m0;

public abstract class f {
    public static final Bundle A(Iterable iterable0, c c0) {
        Bundle bundle0 = new Bundle();
        for(Object object0: iterable0) {
            C9.f f0 = (C9.f)object0;
            if(f0 instanceof C9.c) {
                String s = c0.a(f0);
                if(s == null) {
                    s = "amount";
                }
                bundle0.putDouble(s, ((C9.c)f0).a);
            }
            else if(f0 instanceof e) {
                String s1 = c0.a(f0);
                if(s1 == null) {
                    s1 = "currency";
                }
                bundle0.putString(s1, ((e)f0).b);
            }
            else {
                if(!(f0 instanceof d)) {
                    throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                }
                String s2 = c0.a(f0);
                if(s2 == null) {
                    s2 = "bill_id";
                }
                bundle0.putString(s2, ((d)f0).a);
            }
        }
        return bundle0;
    }

    public static final void B(G9.c c0, y6 y60) {
        j.f(c0, "<this>");
        j.f(y60, "from");
        H7 h70 = ((G7)y60.b).a;
        if(h70 != null) {
            I7 i70 = h70.c;
            if(i70 != null) {
                K7 k70 = i70.b;
                if(k70 != null) {
                    F7 f70 = k70.b;
                    if(f70 != null) {
                        NonTimelyAnnouncementsFragment nonTimelyAnnouncementsFragment0 = f70.b;
                        if(nonTimelyAnnouncementsFragment0 != null) {
                            c0.a(nonTimelyAnnouncementsFragment0);
                        }
                    }
                }
            }
        }
    }

    public static void C(Parcel parcel0, int v, Bundle bundle0) {
        if(bundle0 == null) {
            return;
        }
        int v1 = f.I(v, parcel0);
        parcel0.writeBundle(bundle0);
        f.J(v1, parcel0);
    }

    public static void D(Parcel parcel0, int v, IBinder iBinder0) {
        if(iBinder0 == null) {
            return;
        }
        int v1 = f.I(v, parcel0);
        parcel0.writeStrongBinder(iBinder0);
        f.J(v1, parcel0);
    }

    public static void E(Parcel parcel0, int v, Parcelable parcelable0, int v1) {
        if(parcelable0 == null) {
            return;
        }
        int v2 = f.I(v, parcel0);
        parcelable0.writeToParcel(parcel0, v1);
        f.J(v2, parcel0);
    }

    public static void F(Parcel parcel0, int v, String s) {
        if(s == null) {
            return;
        }
        int v1 = f.I(v, parcel0);
        parcel0.writeString(s);
        f.J(v1, parcel0);
    }

    public static void G(Parcel parcel0, int v, Parcelable[] arr_parcelable, int v1) {
        if(arr_parcelable == null) {
            return;
        }
        int v2 = f.I(v, parcel0);
        parcel0.writeInt(arr_parcelable.length);
        for(int v3 = 0; v3 < arr_parcelable.length; ++v3) {
            Parcelable parcelable0 = arr_parcelable[v3];
            if(parcelable0 == null) {
                parcel0.writeInt(0);
            }
            else {
                int v4 = parcel0.dataPosition();
                parcel0.writeInt(1);
                int v5 = parcel0.dataPosition();
                parcelable0.writeToParcel(parcel0, v1);
                int v6 = parcel0.dataPosition();
                parcel0.setDataPosition(v4);
                parcel0.writeInt(v6 - v5);
                parcel0.setDataPosition(v6);
            }
        }
        f.J(v2, parcel0);
    }

    public static void H(Parcel parcel0, int v, List list0) {
        if(list0 == null) {
            return;
        }
        int v1 = f.I(v, parcel0);
        int v2 = list0.size();
        parcel0.writeInt(v2);
        for(int v3 = 0; v3 < v2; ++v3) {
            Parcelable parcelable0 = (Parcelable)list0.get(v3);
            if(parcelable0 == null) {
                parcel0.writeInt(0);
            }
            else {
                int v4 = parcel0.dataPosition();
                parcel0.writeInt(1);
                int v5 = parcel0.dataPosition();
                parcelable0.writeToParcel(parcel0, 0);
                int v6 = parcel0.dataPosition();
                parcel0.setDataPosition(v4);
                parcel0.writeInt(v6 - v5);
                parcel0.setDataPosition(v6);
            }
        }
        f.J(v1, parcel0);
    }

    public static int I(int v, Parcel parcel0) {
        parcel0.writeInt(v | 0xFFFF0000);
        parcel0.writeInt(0);
        return parcel0.dataPosition();
    }

    public static void J(int v, Parcel parcel0) {
        int v1 = parcel0.dataPosition();
        parcel0.setDataPosition(v - 4);
        parcel0.writeInt(v1 - v);
        parcel0.setDataPosition(v1);
    }

    public static void K(Parcel parcel0, int v, int v1) {
        parcel0.writeInt(v | v1 << 16);
    }

    public static final void a(Function0 function00, b b0, Modifier modifier0, Function2 function20, Function2 function21, S s0, long v, long v1, q q0, p p0, int v2) {
        q q1;
        long v6;
        long v5;
        S s1;
        Modifier modifier1;
        q q2;
        int v7;
        p0.S(1035523925);
        int v3 = (v2 & 6) == 0 ? (p0.h(function00) ? 4 : 2) | v2 : v2;
        if((v2 & 0x30) == 0) {
            v3 |= (p0.h(b0) ? 0x20 : 16);
        }
        int v4 = (v2 & 0xC00) == 0 ? v3 | 0x180 | (p0.h(function20) ? 0x800 : 0x400) : v3 | 0x180;
        if((v2 & 0x6000) == 0) {
            v4 |= (p0.h(function21) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v2) == 0) {
            v4 |= 0x10000;
        }
        if((0x180000 & v2) == 0) {
            v4 |= 0x80000;
        }
        if((0xC00000 & v2) == 0) {
            v4 |= 0x400000;
        }
        if((0x2492493 & (v4 | 0x6000000)) != 0x2492492 || !p0.x()) {
            p0.M();
            if((v2 & 1) == 0 || p0.w()) {
                modifier1 = l.X;
                s1 = ((r1)p0.k(s1.a)).b;
                v5 = ((Q)p0.k(T.a)).g();
                long v8 = T.b(v5, p0);
                v7 = (v4 | 0x6000000) & 0xFE00FFFF;
                q2 = new q(7, false);
                v6 = v8;
            }
            else {
                p0.K();
                v7 = (v4 | 0x6000000) & 0xFE00FFFF;
                modifier1 = modifier0;
                s1 = s0;
                v5 = v;
                v6 = v1;
                q2 = q0;
            }
            p0.q();
            w.a(function00, q2, c0.c.c(0x9576276C, new N.w(b0, modifier1, function20, function21, s1, v5, v6), p0), p0, v7 >> 21 & 0x70 | (v7 & 14 | 0x180), 0);
            q1 = q2;
        }
        else {
            p0.K();
            modifier1 = modifier0;
            s1 = s0;
            v5 = v;
            v6 = v1;
            q1 = q0;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new x(function00, b0, modifier1, function20, function21, s1, v5, v6, q1, v2);
        }
    }

    public static final void b(Context context0, boolean z, boolean z1, r1 r10, b b0, p p0, int v) {
        Q q1;
        long v10;
        boolean z7;
        Context context3;
        r1 r12;
        boolean z5;
        boolean z4;
        Context context2;
        r1 r11;
        boolean z3;
        boolean z2;
        Context context1;
        p0.S(1198302489);
        int v1 = (v & 0x1C00) == 0 ? v | 0x5B2 : v | 434;
        if((0xE000 & v) == 0) {
            v1 |= (p0.h(b0) ? 0x4000 : 0x2000);
        }
        if((v1 & 0xB6DB) == 9362 && p0.x()) {
            p0.K();
            context1 = context0;
            z2 = z;
            z3 = z1;
            r11 = r10;
        }
        else {
            p0.M();
            if((v & 1) == 0 || p0.w()) {
                context2 = (Context)p0.k(AndroidCompositionLocals_androidKt.b);
                z5 = true;
                r12 = (r1)p0.k(s1.a);
                z4 = true;
            }
            else {
                p0.K();
                context2 = context0;
                z4 = z;
                z5 = z1;
                r12 = r10;
            }
            p0.q();
            Resources.Theme resources$Theme0 = context2.getTheme();
            p0.R(1804679131);
            boolean z6 = p0.f(resources$Theme0);
            Object object0 = p0.G();
            if(!z6 && object0 != U.l.a) {
                context3 = context2;
                z7 = z4;
            }
            else {
                n2 n20 = null;
                TypedArray typedArray0 = context2.obtainStyledAttributes(k5.b.a);
                j.e(typedArray0, "obtainStyledAttributes(...)");
                if(!typedArray0.hasValue(9)) {
                    throw new IllegalArgumentException("createAppCompatTheme requires the host context\'s theme to extend Theme.AppCompat");
                }
                if(z4) {
                    Q q0 = typedArray0.getBoolean(8, true) ? T.c(0xFFF, 0L) : new Q(0xFFBB86FC00000000L, 0xFF3700B300000000L, 0xFF03DAC600000000L, 0xFF03DAC600000000L, 0xFF12121200000000L, 0xFF12121200000000L, 0xFFCF667900000000L, v.b, v.b, v.e, v.e, v.b, false);
                    long v2 = k5.d.b(typedArray0, 5);
                    long v3 = k5.d.b(typedArray0, 6);
                    long v4 = T4.l.B(v2);
                    long v5 = k5.d.b(typedArray0, 3);
                    long v6 = T4.l.B(v5);
                    long v7 = k5.d.b(typedArray0, 1);
                    long v8 = v.i;
                    if(!v.c(v7, v8)) {
                        v7 = v.b(1.0f, v7);
                    }
                    long v9 = q0.g();
                    if(v.c(v7, v8) || T4.l.A(v9, v7) < 4.5) {
                        context3 = context2;
                        z7 = z4;
                        v10 = T4.l.B(v9);
                    }
                    else {
                        context3 = context2;
                        z7 = z4;
                        v10 = v7;
                    }
                    long v11 = k5.d.b(typedArray0, 0);
                    if(v.c(v7, v8) || T4.l.A(v11, v7) < 4.5) {
                        v7 = T4.l.B(v11);
                    }
                    long v12 = k5.d.b(typedArray0, 4);
                    q1 = Q.a(q0, v2, v3, v5, v5, v11, v9, v12, v4, v6, v7, v10, T4.l.B(v12), 0x1000);
                }
                else {
                    context3 = context2;
                    z7 = z4;
                    q1 = null;
                }
                if(z5) {
                    a a0 = k5.d.c(typedArray0, 7);
                    if(a0 == null) {
                        a0 = k5.d.c(typedArray0, 2);
                    }
                    if(a0 != null) {
                        n20 = new n2(a0.a, 0x3FFE);
                    }
                }
                k5.c c0 = new k5.c(q1, n20);
                typedArray0.recycle();
                p0.a0(c0);
                object0 = c0;
            }
            p0.p(false);
            Q q2 = ((k5.c)object0).a;
            p0.R(1804679329);
            if(q2 == null) {
                q2 = (Q)p0.k(T.a);
            }
            p0.p(false);
            p0.R(1804679394);
            n2 n21 = ((k5.c)object0).b;
            if(n21 == null) {
                n21 = (n2)p0.k(o2.b);
            }
            p0.p(false);
            Z6.b.d(q2, n21, r12, c0.c.b(0x870FA5ED, new O(b0, 4), p0), p0, 0xC00, 0);
            context1 = context3;
            z2 = z7;
            z3 = z5;
            r11 = r12;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new M(context1, z2, z3, r11, b0, v);
        }
    }

    public static final void c(Fa.c c0, Modifier modifier0, p p0, int v) {
        j.f(c0, "res");
        p0.S(0xDD5A4836);
        int v1 = (v & 6) == 0 ? (((v & 8) == 0 ? p0.f(c0) : p0.h(c0)) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.f(null) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.f(modifier0) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && p0.x()) {
            p0.K();
        }
        else if(c0 instanceof Fa.a) {
            p0.Q(68804510);
            M6.b.d(yc.l.y(((Fa.a)c0).a, p0, 0), null, modifier0, null, null, 0.0f, null, p0, v1 & 0x3F0, 120);
            p0.p(false);
        }
        else if(c0 instanceof Fa.b) {
            p0.Q(69015837);
            t.b(((Fa.b)c0).a, null, modifier0, ((Fa.b)c0).b, ((Fa.b)c0).c, null, p0, v1 & 0x3F0, 0xFFE0);
            p0.p(false);
        }
        else {
            throw J.c(0xEF9DB69B, p0, false);
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new s(v, 2, c0, modifier0);
        }
    }

    public static final void d(int v, String s, String s1, Function0 function00, boolean z, p p0, int v1) {
        h h3;
        j.f(s, "title");
        j.f(s1, "description");
        j.f(function00, "onClick");
        p0.S(0x20518636);
        int v2 = (v1 & 6) == 0 ? (p0.d(v) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (p0.f(s) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v2 |= (p0.f(s1) ? 0x100 : 0x80);
        }
        if((v1 & 0xC00) == 0) {
            v2 |= (p0.h(function00) ? 0x800 : 0x400);
        }
        if((v1 & 0x6000) == 0) {
            v2 |= (p0.g(z) ? 0x4000 : 0x2000);
        }
        if((v2 & 9363) != 9362 || !p0.x()) {
            l l0 = l.X;
            Modifier modifier0 = androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.c.d(androidx.compose.foundation.a.d(l0, z, null, function00, 6), 1.0f), 16.0f, 10.0f);
            x0 x00 = v0.b(k.a, g0.b.k, p0, 0x30);
            int v3 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier1 = g0.a.d(p0, modifier0);
            F0.k.a.getClass();
            i i0 = F0.j.b;
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            h h0 = F0.j.f;
            U.d.K(p0, x00, h0);
            h h1 = F0.j.e;
            U.d.K(p0, g00, h1);
            h h2 = F0.j.g;
            if(p0.O) {
                h3 = h1;
                m5.b.F(v3, p0, v3, h2);
            }
            else {
                h3 = h1;
                if(!j.a(p0.G(), v3)) {
                    m5.b.F(v3, p0, v3, h2);
                }
            }
            h h4 = F0.j.d;
            U.d.K(p0, modifier1, h4);
            M6.b.d(yc.l.y(v, p0, v2 & 14), s, null, null, null, 0.0f, null, p0, v2 & 0x70, 0x7C);
            B.e.b(p0, androidx.compose.foundation.layout.c.k(l0, 16.0f));
            B b0 = z.a(k.c, g0.b.m, p0, 0);
            int v4 = p0.P;
            g0 g01 = p0.m();
            Modifier modifier2 = g0.a.d(p0, l0);
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            U.d.K(p0, b0, h0);
            U.d.K(p0, g01, h3);
            if(p0.O || !j.a(p0.G(), v4)) {
                m5.b.F(v4, p0, v4, h2);
            }
            U.d.K(p0, modifier2, h4);
            m2.b(s, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((db.a)p0.k(db.b.d)).i, p0, v2 >> 3 & 14, 0xC30, 0xD7FE);
            m2.b(s1, null, yc.d.h(0x7F06001A, p0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((db.a)p0.k(db.b.d)).d, p0, v2 >> 6 & 14, 0, 0xFFFA);  // color:Gray700
            p0.p(true);
            p0.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Wa.i(v, s, s1, function00, z, v1);
        }
    }

    public static final void e(String s, p p0, int v) {
        p0.S(0x32E7DFF6);
        int v1 = (v & 6) == 0 ? (p0.f(s) ? 4 : 2) | v : v;
        if((v1 & 3) != 2 || !p0.x()) {
            l l0 = l.X;
            x0 x00 = v0.b(k.a, g0.b.j, p0, 0);
            int v2 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier0 = g0.a.d(p0, l0);
            F0.k.a.getClass();
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
            h h0 = F0.j.g;
            if(p0.O || !j.a(p0.G(), v2)) {
                m5.b.F(v2, p0, v2, h0);
            }
            U.d.K(p0, modifier0, F0.j.d);
            O0.O o0 = ((db.a)p0.k(db.b.d)).h;
            m2.b("•", androidx.compose.foundation.layout.c.n(l0, 24.0f), 0L, 0L, null, null, null, 0L, null, new Z0.i(3), 0L, 0, false, 0, 0, null, o0, p0, 54, 0, 0xFDFC);
            O0.O o1 = ((db.a)p0.k(db.b.d)).h;
            m2.b(s, z0.a.a(l0, 1.0f, true), 0L, 0L, null, null, null, 0L, null, new Z0.i(5), 0L, 0, false, 0, 0, null, o1, p0, v1 & 14, 0, 0xFDFC);
            p0.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new n(s, v, 3);
        }
    }

    public static final void f(String s, p p0, int v) {
        p p2;
        l l1;
        p p1 = p0;
        p1.S(1397056897);
        if((((v & 6) == 0 ? (p1.f(s) ? 4 : 2) | v : v) & 3) != 2 || !p0.x()) {
            Iterable iterable0 = Vb.j.p0(s, new String[]{"\n"}, 0, 6);
            ArrayList arrayList0 = new ArrayList(r.b0(iterable0));
            Iterator iterator0 = iterable0.iterator();
            while(true) {
                boolean z = true;
                if(!iterator0.hasNext()) {
                    break;
                }
                Object object0 = iterator0.next();
                String s1 = Vb.j.z0(((String)object0)).toString();
                if(!Vb.q.O(Vb.j.z0(((String)object0)).toString(), "•", false) && !Vb.q.O(Vb.j.z0(((String)object0)).toString(), "•", false)) {
                    z = false;
                }
                arrayList0.add(new Ab.k(s1, Boolean.valueOf(z)));
            }
            l l0 = l.X;
            B b0 = z.a(k.c, g0.b.m, p1, 0);
            int v1 = p1.P;
            g0 g00 = p0.m();
            Modifier modifier0 = g0.a.d(p1, l0);
            F0.k.a.getClass();
            i i0 = F0.j.b;
            p0.U();
            if(p1.O) {
                p1.l(i0);
            }
            else {
                p0.d0();
            }
            U.d.K(p1, b0, F0.j.f);
            U.d.K(p1, g00, F0.j.e);
            h h0 = F0.j.g;
            if(p1.O || !j.a(p0.G(), v1)) {
                m5.b.F(v1, p1, v1, h0);
            }
            U.d.K(p1, modifier0, F0.j.d);
            p1.Q(5312980);
            for(Object object1: arrayList0) {
                String s2 = (String)((Ab.k)object1).X;
                if(((Boolean)((Ab.k)object1).Y).booleanValue()) {
                    p1.Q(-2069820420);
                    f.e(Vb.j.z0(Vb.j.j0("•", Vb.j.j0("•", s2))).toString(), p1, 0);
                    p1.p(((boolean)0));
                    l1 = l0;
                    p2 = p1;
                }
                else {
                    p1.Q(-2069646789);
                    O0.O o0 = ((db.a)p1.k(db.b.d)).h;
                    l1 = l0;
                    m2.b(s2, androidx.compose.foundation.layout.a.l(l0, 0.0f, 12.0f, 1), 0L, 0L, null, null, null, 0L, null, new Z0.i(3), 0L, 0, false, 0, 0, null, o0, p0, 0x30, 0, 0xFDFC);
                    p2 = p0;
                    p2.p(false);
                }
                p1 = p2;
                l0 = l1;
            }
            p1.p(0);
            p1.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new n(s, v, 2);
        }
    }

    public static final void g(D.a a0, Modifier modifier0, A a1, q0 q00, boolean z, B.i i0, g g0, m0 m00, boolean z1, Function1 function10, p p0, int v) {
        boolean z3;
        m0 m01;
        boolean z2;
        boolean z6;
        m0 m02;
        boolean z5;
        int v5;
        p0.S(0x588990D0);
        int v1 = (v & 6) == 0 ? (p0.f(a0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.f(modifier0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.f(a1) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (p0.f(q00) ? 0x800 : 0x400);
        }
        int v2 = (v & 0x30000) == 0 ? v1 | 0x6000 | (p0.f(i0) ? 0x20000 : 0x10000) : v1 | 0x6000;
        if((0x180000 & v) == 0) {
            v2 |= (p0.f(g0) ? 0x100000 : 0x80000);
        }
        if((0xC00000 & v) == 0) {
            v2 |= 0x400000;
        }
        int v3 = (0x30000000 & v) == 0 ? v2 | 0x6000000 | (p0.h(function10) ? 0x20000000 : 0x10000000) : v2 | 0x6000000;
        if((306783379 & v3) != 306783378 || !p0.x()) {
            p0.M();
            Z z4 = U.l.a;
            int v4 = 0;
            if((v & 1) == 0 || p0.w()) {
                v.w w0 = P.a(p0);
                boolean z7 = p0.f(w0);
                Object object0 = p0.G();
                if(z7 || object0 == z4) {
                    object0 = new F(w0);
                    p0.a0(object0);
                }
                v5 = v3 & 0xFE3FFFFF;
                m02 = (F)object0;
                z5 = false;
                z6 = true;
            }
            else {
                p0.K();
                v5 = v3 & 0xFE3FFFFF;
                z5 = z;
                m02 = m00;
                z6 = z1;
            }
            p0.q();
            int v6 = v5 & 14 | v5 >> 15 & 0x70 | v5 >> 3 & 0x380;
            int v7 = ((v6 & 14 ^ 6) <= 4 || !p0.f(a0)) && (v6 & 6) != 4 ? 0 : 1;
            int v8 = ((v6 & 0x70 ^ 0x30) <= 0x20 || !p0.f(g0)) && (v6 & 0x30) != 0x20 ? 0 : 1;
            if((v6 & 0x380 ^ 0x180) <= 0x100 && p0.f(q00) || (v6 & 0x180) == 0x100) {
                v4 = 1;
            }
            Object object1 = p0.G();
            if((v7 | v8 | v4) != 0 || object1 == z4) {
                object1 = new D.c(new B.w(q00, a0, g0));
                p0.a0(object1);
            }
            T4.l.m(modifier0, a1, ((D.c)object1), q00, z5, m02, z6, i0, g0, function10, p0, v5 >> 3 & 14 | 0x30000 | v5 >> 3 & 0x70 | v5 & 0x1C00 | 0xE000 & v5 | 0x1C00000 & v5 >> 3 | 0xE000000 & v5 << 9 | v5 << 9 & 0x70000000, v5 >> 27 & 14);
            z2 = z5;
            m01 = m02;
            z3 = z6;
        }
        else {
            p0.K();
            z2 = z;
            m01 = m00;
            z3 = z1;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new D.e(a0, modifier0, a1, q00, z2, i0, g0, m01, z3, function10, v);
        }
    }

    public static final void h(Modifier modifier0, b b0, p p0, int v) {
        p0.S(0xDFEBA217);
        int v1 = (v & 6) == 0 ? (p0.f(modifier0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.h(b0) ? 0x20 : 16);
        }
        if((v1 & 19) != 18 || !p0.x()) {
            H.e e0 = H.f.b(10.0f);
            Modifier modifier1 = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.layout.c.d(androidx.compose.foundation.a.b(modifier0, v.e, e0), 1.0f), 0.0f, 6.0f, 1);
            B b1 = z.a(k.c, g0.b.m, p0, 0);
            int v2 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier2 = g0.a.d(p0, modifier1);
            F0.k.a.getClass();
            i i0 = F0.j.b;
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            U.d.K(p0, b1, F0.j.f);
            U.d.K(p0, g00, F0.j.e);
            h h0 = F0.j.g;
            if(p0.O || !j.a(p0.G(), v2)) {
                m5.b.F(v2, p0, v2, h0);
            }
            U.d.K(p0, modifier2, F0.j.d);
            b0.h(C.a, p0, ((int)((v1 << 6 & 0x1C00) >> 6 & 0x70 | 6)));
            p0.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new ra.i(modifier0, b0, v, 0);
        }
    }

    public static final void i(int v, String s, Function0 function00, boolean z, p p0, int v1) {
        j.f(s, "text");
        j.f(function00, "onClick");
        p0.S(0xCB2585CB);
        int v2 = (v1 & 6) == 0 ? (p0.d(v) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (p0.f(s) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v2 |= (p0.h(function00) ? 0x100 : 0x80);
        }
        if((v1 & 0xC00) == 0) {
            v2 |= (p0.g(z) ? 0x800 : 0x400);
        }
        if((v2 & 0x493) != 1170 || !p0.x()) {
            l l0 = l.X;
            Modifier modifier0 = androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.c.d(androidx.compose.foundation.a.d(l0, z, null, function00, 6), 1.0f), 16.0f, 10.0f);
            x0 x00 = v0.b(k.a, g0.b.j, p0, 0);
            int v3 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier1 = g0.a.d(p0, modifier0);
            F0.k.a.getClass();
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
            h h0 = F0.j.g;
            if(p0.O || !j.a(p0.G(), v3)) {
                m5.b.F(v3, p0, v3, h0);
            }
            U.d.K(p0, modifier1, F0.j.d);
            M6.b.d(yc.l.y(v, p0, v2 & 14), s, null, null, null, 0.0f, null, p0, v2 & 0x70, 0x7C);
            B.e.b(p0, androidx.compose.foundation.layout.c.k(l0, 16.0f));
            m2.b(s, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((db.a)p0.k(db.b.d)).h, p0, v2 >> 3 & 14, 0xC30, 0xD7FE);
            p0.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Ua.e(v, s, function00, z, v1);
        }
    }

    public static final void j(int v, CharSequence charSequence0, Function2 function20, Modifier modifier0, p p0, int v1, int v2) {
        Function2 function22;
        Function2 function24;
        Function2 function21;
        j.f(charSequence0, "text");
        p0.S(0x1BFECE7A);
        int v3 = (v1 & 6) == 0 ? (p0.d(v) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v3 |= (p0.h(charSequence0) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
            function21 = function20;
        }
        else if((v1 & 0x180) == 0) {
            function21 = function20;
            v3 |= (p0.h(function21) ? 0x100 : 0x80);
        }
        else {
            function21 = function20;
        }
        if((v1 & 0xC00) == 0) {
            v3 |= (p0.f(modifier0) ? 0x800 : 0x400);
        }
        if((v3 & 0x493) != 1170 || !p0.x()) {
            Function2 function23 = (v2 & 4) == 0 ? function21 : null;
            l l0 = l.X;
            B.h h0 = new B.h(16.0f);
            Modifier modifier1 = androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.c.d(modifier0, 1.0f), 16.0f, 12.0f);
            x0 x00 = v0.b(h0, (function23 == null ? g0.b.j : g0.b.k), p0, 6);
            int v4 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier2 = g0.a.d(p0, modifier1);
            F0.k.a.getClass();
            i i0 = F0.j.b;
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            h h1 = F0.j.f;
            U.d.K(p0, x00, h1);
            h h2 = F0.j.e;
            U.d.K(p0, g00, h2);
            h h3 = F0.j.g;
            if(p0.O || !j.a(p0.G(), v4)) {
                m5.b.F(v4, p0, v4, h3);
            }
            h h4 = F0.j.d;
            U.d.K(p0, modifier2, h4);
            M0.a(yc.l.y(v, p0, v3 & 14), null, androidx.compose.foundation.layout.c.l(l0, 24.0f, 24.0f), 0L, p0, 0x1B0, 8);
            Modifier modifier3 = z0.a.a(l0, 1.0f, true);
            B b0 = z.a(k.c, g0.b.m, p0, 0);
            int v5 = p0.P;
            g0 g01 = p0.m();
            Modifier modifier4 = g0.a.d(p0, modifier3);
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            U.d.K(p0, b0, h1);
            U.d.K(p0, g01, h2);
            if(p0.O || !j.a(p0.G(), v5)) {
                m5.b.F(v5, p0, v5, h3);
            }
            U.d.K(p0, modifier4, h4);
            if(charSequence0 instanceof O0.f) {
                p0.Q(-1742024377);
                function24 = function23;
                m2.c(((O0.f)charSequence0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, ((db.a)p0.k(db.b.d)).h, p0, 0, 0, 0x1FFFE);
            }
            else {
                function24 = function23;
                p0.Q(-1741940708);
                m2.b(charSequence0.toString(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((db.a)p0.k(db.b.d)).h, p0, 0, 0, 0xFFFE);
            }
            p0.p(false);
            p0.Q(0x70438A39);
            function22 = function24;
            if(function22 != null) {
                function22.j(p0, 0);
            }
            p0.p(false);
            p0.p(true);
            p0.p(true);
        }
        else {
            p0.K();
            function22 = function21;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new ab.n(v, charSequence0, function22, modifier0, v1, v2, 0);
        }
    }

    public static final void k(Z9.g g0, Z9.h h0, p p0, int v) {
        W9.d d0;
        j.f(g0, "uiState");
        j.f(h0, "callbacks");
        p0.S(0x66F9C71);
        int v1 = (v & 6) == 0 ? (p0.f(g0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (((v & 0x40) == 0 ? p0.f(h0) : p0.h(h0)) ? 0x20 : 16);
        }
        if((v1 & 19) != 18 || !p0.x()) {
            C4 c40 = g0.a;
            if(c40 != null) {
                p0.Q(0x63BA495E);
                Z z0 = U.l.a;
                boolean z1 = true;
                z4 z40 = c40.g;
                if(z40 == null) {
                    d0 = null;
                }
                else {
                    p0.Q(0x2FDCA2C2);
                    boolean z2 = (v1 & 0x70) == 0x20 || (v1 & 0x40) != 0 && p0.h(h0);
                    boolean z3 = p0.f(z40);
                    boolean z4 = p0.f(c40);
                    Object object0 = p0.G();
                    if((z2 | z3 | z4) != 0 || object0 == z0) {
                        object0 = new F0(h0, z40, c40, 4);
                        p0.a0(object0);
                    }
                    p0.p(false);
                    d0 = new W9.d(z40.a, ((Function0)object0));
                }
                p0.p(false);
                p0.Q(0x5104A2C9);
                if((v1 & 0x70) != 0x20 && ((v1 & 0x40) == 0 || !p0.h(h0))) {
                    z1 = false;
                }
                boolean z5 = p0.f(c40);
                Object object1 = p0.G();
                if((z5 | z1) != 0 || object1 == z0) {
                    object1 = new Ca.j(h0, 10, c40);
                    p0.a0(object1);
                }
                p0.p(false);
                b b0 = c0.c.c(0xBB4B1F91, new Z9.f(c40, 0), p0);
                b b1 = c0.c.c(0xA3873FD2, new H(c40, g0, h0, 5), p0);
                yc.d.a(c40.a, c40.b, d0, false, ((Function0)object1), null, true, b0, b1, p0, 0x6D80C00, 0x20);
            }
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new s(v, 7, g0, h0);
        }
    }

    public static final void l(String s, Function1 function10, Function0 function00, Date date0, Date date1, Date date2, p p0, int v) {
        j.f(s, "title");
        j.f(function10, "onDateSelected");
        j.f(function00, "onDismissRequest");
        p0.S(0xB85E75FE);
        int v1 = (v & 6) == 0 ? (p0.f(s) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.h(function10) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.h(function00) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (p0.h(date0) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (p0.h(date1) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            v1 |= (p0.h(date2) ? 0x20000 : 0x10000);
        }
        if((74899 & v1) != 74898 || !p0.x()) {
            p0.Q(0x366C73FA);
            Object object0 = p0.G();
            if((v1 & 0x380) == 0x100 || object0 == U.l.a) {
                object0 = new N(function00, 10);
                p0.a0(object0);
            }
            p0.p(false);
            w.a(((Function0)object0), null, c0.c.c(0xF39089D5, new Va.j(s, date0, date1, date2, function10, function00), p0), p0, 0x180, 2);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Ca.k(s, function10, function00, date0, date1, date2, v);
        }
    }

    public static final void m(Modifier modifier0, long v, long v1, p p0, int v2, int v3) {
        long v9;
        long v8;
        int v7;
        long v6;
        long v5;
        p0.S(0x8D063E6C);
        int v4 = (v2 & 6) == 0 ? (p0.f(modifier0) ? 4 : 2) | v2 : v2;
        if((v3 & 2) != 0) {
            v4 |= 0x30;
            v5 = v;
        }
        else if((v2 & 0x30) == 0) {
            v5 = v;
            v4 |= (p0.e(v5) ? 0x20 : 16);
        }
        else {
            v5 = v;
        }
        if((v2 & 0x180) == 0) {
            if((v3 & 4) == 0) {
                v6 = v1;
                v7 = p0.e(v6) ? 0x100 : 0x80;
            }
            else {
                v6 = v1;
                v7 = 0x80;
            }
            v4 |= v7;
        }
        else {
            v6 = v1;
        }
        if((v4 & 0x93) != 0x92 || !p0.x()) {
            p0.M();
            l l0 = l.X;
            if((v2 & 1) == 0 || p0.w()) {
                if((v3 & 2) != 0) {
                    v5 = v.i;
                }
                if((v3 & 4) != 0) {
                    v6 = yc.d.h(0x7F06001A, p0);  // color:Gray700
                    v4 &= -897;
                }
            }
            else {
                p0.K();
                if((v3 & 4) != 0) {
                    v4 &= -897;
                }
            }
            p0.q();
            Modifier modifier1 = androidx.compose.foundation.layout.a.n(androidx.compose.foundation.a.b(modifier0, v5, n0.M.a), 0.0f, 0.0f, 16.0f, 0.0f, 11);
            K k0 = B.r.e(g0.b.f, false);
            int v10 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier2 = g0.a.d(p0, modifier1);
            F0.k.a.getClass();
            i i0 = F0.j.b;
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            h h0 = F0.j.f;
            U.d.K(p0, k0, h0);
            h h1 = F0.j.e;
            U.d.K(p0, g00, h1);
            h h2 = F0.j.g;
            if(p0.O || !j.a(p0.G(), v10)) {
                m5.b.F(v10, p0, v10, h2);
            }
            h h3 = F0.j.d;
            U.d.K(p0, modifier2, h3);
            B b0 = z.a(k.e, g0.b.n, p0, 54);
            int v11 = p0.P;
            g0 g01 = p0.m();
            Modifier modifier3 = g0.a.d(p0, l0);
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            U.d.K(p0, b0, h0);
            U.d.K(p0, g01, h1);
            if(p0.O || !j.a(p0.G(), v11)) {
                m5.b.F(v11, p0, v11, h2);
            }
            U.d.K(p0, modifier3, h3);
            t0.e e0 = M6.b.W(0x7F08023B, p0);  // drawable:ic_hide_icon
            BlendModeColorFilter blendModeColorFilter0 = Build.VERSION.SDK_INT >= 29 ? n0.p.a.a(v6, 5) : new PorterDuffColorFilter(n0.M.G(v6), n0.M.J(5));
            M6.b.e(e0, null, null, null, new n0.n(v6, 5, blendModeColorFilter0), p0, 0x30, 60);
            m2.b(J2.w.S(0x7F1201BD, p0), null, v6, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((db.a)p0.k(db.b.d)).f, p0, v4 & 0x380, 0, 0xFFFA);  // string:hide_history_item "Hide"
            p0.p(true);
            p0.p(true);
            v9 = v6;
            v8 = v5;
        }
        else {
            p0.K();
            v8 = v5;
            v9 = v6;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Ra.e(modifier0, v8, v9, v2, v3);
        }
    }

    public static final void n(String s, Integer integer0, String s1, String s2, CurrencyAmount currencyAmount0, boolean z, boolean z1, Function1 function10, p p0, int v) {
        H.e e0;
        j.f(s, "id");
        j.f(function10, "onTransactionClick");
        p0.S(0xCF008881);
        int v1 = (v & 6) == 0 ? (p0.f(s) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.f(integer0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.f(s1) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (p0.f(s2) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (p0.f(currencyAmount0) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            v1 |= (p0.g(z) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v) == 0) {
            v1 |= (p0.g(z1) ? 0x100000 : 0x80000);
        }
        if((0xC00000 & v) == 0) {
            v1 |= (p0.h(function10) ? 0x800000 : 0x400000);
        }
        if((0x492493 & v1) != 4793490 || !p0.x()) {
            if(z && z1) {
                e0 = H.f.b(10.0f);
            }
            else if(z) {
                e0 = H.f.d(10.0f, 10.0f, 0.0f, 0.0f, 12);
            }
            else if(z1) {
                e0 = H.f.d(0.0f, 0.0f, 10.0f, 10.0f, 3);
            }
            else {
                e0 = n0.M.a;
            }
            l l0 = l.X;
            Modifier modifier0 = o.j(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.a.m(l0, 16.0f, (z ? 12.0f : 0.0f), 16.0f, (z1 ? 12.0f : 0.0f)), v.e, e0), e0);
            p0.Q(1446947802);
            Object object0 = p0.G();
            if((((0x1C00000 & v1) == 0x800000 ? 1 : 0) | ((v1 & 14) == 4 ? 1 : 0)) != 0 || object0 == U.l.a) {
                object0 = new Ca.j(function10, 3, s);
                p0.a0(object0);
            }
            p0.p(false);
            Modifier modifier1 = androidx.compose.foundation.layout.a.n(androidx.compose.foundation.a.d(modifier0, false, null, ((Function0)object0), 7), 0.0f, (z ? 20.0f : 16.0f), 0.0f, (z1 ? 20.0f : 16.0f), 5);
            x0 x00 = v0.b(k.a, g0.b.j, p0, 0);
            int v2 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier2 = g0.a.d(p0, modifier1);
            F0.k.a.getClass();
            i i0 = F0.j.b;
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            h h0 = F0.j.f;
            U.d.K(p0, x00, h0);
            h h1 = F0.j.e;
            U.d.K(p0, g00, h1);
            h h2 = F0.j.g;
            if(p0.O || !j.a(p0.G(), v2)) {
                m5.b.F(v2, p0, v2, h2);
            }
            h h3 = F0.j.d;
            U.d.K(p0, modifier2, h3);
            B.e.b(p0, androidx.compose.foundation.layout.c.n(l0, 16.0f));
            p0.Q(-900308826);
            Modifier modifier3 = androidx.compose.foundation.layout.c.k(androidx.compose.foundation.layout.a.l(l0, 0.0f, 3.5f, 1), 32.0f);
            M6.b.d(yc.l.y(((int)integer0), p0, v1 >> 3 & 14), null, modifier3, null, null, 0.0f, null, p0, 0x1B0, 120);
            B.e.b(p0, androidx.compose.foundation.layout.c.n(l0, 16.0f));
            p0.p(false);
            Modifier modifier4 = z0.a.a(l0, 1.0f, true);
            B b0 = z.a(k.c, g0.b.m, p0, 0);
            int v3 = p0.P;
            g0 g01 = p0.m();
            Modifier modifier5 = g0.a.d(p0, modifier4);
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            U.d.K(p0, b0, h0);
            U.d.K(p0, g01, h1);
            if(p0.O || !j.a(p0.G(), v3)) {
                m5.b.F(v3, p0, v3, h2);
            }
            U.d.K(p0, modifier5, h3);
            m2.b(s1, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((db.a)p0.k(db.b.d)).i, p0, v1 >> 6 & 14, 0, 0xFFFE);
            m2.b(s2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, O0.O.a(((db.a)p0.k(db.b.d)).e, yc.d.h(0x7F06001A, p0), 0L, null, null, 0L, null, 0L, null, null, 0xFFFFFE), p0, v1 >> 9 & 14, 0, 0xFFFE);  // color:Gray700
            p0.p(true);
            m2.b(q9.M0.a(currencyAmount0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((db.a)p0.k(db.b.d)).i, p0, 0, 0, 0xFFFE);
            B.e.b(p0, androidx.compose.foundation.layout.c.n(l0, 16.0f));
            p0.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Ka.a(s, integer0, s1, s2, currencyAmount0, z, z1, function10, v);
        }
    }

    public static final Object o(z0.x x0, Fb.a a0) {
        x.d d0;
        if(a0 instanceof x.d) {
            d0 = (x.d)a0;
            int v = d0.d0;
            if((v & 0x80000000) == 0) {
                d0 = new x.d(a0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
            }
            else {
                d0.d0 = v ^ 0x80000000;
            }
        }
        else {
            d0 = new x.d(a0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
        }
        Object object0 = d0.c0;
        Object object1 = Eb.a.X;
        switch(d0.d0) {
            case 0: {
                W5.f.b0(object0);
                goto label_27;
            }
            case 1: {
                x0 = d0.b0;
                W5.f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            if((((z0.f)object0).c & 66) != 0) {
                Object object2 = ((z0.f)object0).a;
                int v1 = ((List)object2).size();
                int v2 = 0;
                while(v2 < v1) {
                    z0.n n0 = (z0.n)((List)object2).get(v2);
                    if(n0.b() || n0.h || !n0.d) {
                        goto label_27;
                    }
                    ++v2;
                }
                return ((List)object2).get(0);
            }
        label_27:
            d0.b0 = x0;
            d0.d0 = 1;
            object0 = v1.r.a(x0, d0);
        }
        while(object0 != object1);
        return object1;
    }

    public static final void p(g1.k k0, List list0) {
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            D0.J j0 = (D0.J)list0.get(v1);
            Object object0 = androidx.compose.ui.layout.a.a(j0);
            if(object0 == null) {
                j0.g();
                object0 = new L7.b(20);
            }
            l1.b b0 = k0.b(object0.toString());
            if(b0 != null) {
                b0.f0 = j0;
                o1.d d0 = b0.g0;
                if(d0 != null) {
                    d0.g0 = j0;
                }
            }
            j0.g();
        }
    }

    public static boolean q(String s, String s1) {
        j.f(s, "current");
        if(s.equals(s1)) {
            return true;
        }
        if(s.length() != 0) {
            int v = 0;
            int v1 = 0;
            for(int v2 = 0; v < s.length(); ++v2) {
                int v3 = s.charAt(v);
                if(v2 == 0 && v3 != 40) {
                    return false;
                }
                switch(v3) {
                    case 40: {
                        ++v1;
                        break;
                    }
                    case 41: {
                        --v1;
                        if(v1 != 0 || v2 == s.length() - 1) {
                            break;
                        }
                        return false;
                    }
                }
                ++v;
            }
            if(v1 == 0) {
                String s2 = s.substring(1, s.length() - 1);
                j.e(s2, "this as java.lang.String…ing(startIndex, endIndex)");
                return j.a(Vb.j.z0(s2).toString(), s1);
            }
        }
        return false;
    }

    public static final String r(Object object0) [...] // Inlined contents

    public static HashMap s() {
        HashMap hashMap0 = new HashMap(286);
        ArrayList arrayList0 = new ArrayList(25);
        arrayList0.add("US");
        arrayList0.add("AG");
        arrayList0.add("AI");
        arrayList0.add("AS");
        arrayList0.add("BB");
        arrayList0.add("BM");
        arrayList0.add("BS");
        arrayList0.add("CA");
        arrayList0.add("DM");
        arrayList0.add("DO");
        arrayList0.add("GD");
        arrayList0.add("GU");
        arrayList0.add("JM");
        arrayList0.add("KN");
        arrayList0.add("KY");
        arrayList0.add("LC");
        arrayList0.add("MP");
        arrayList0.add("MS");
        arrayList0.add("PR");
        arrayList0.add("SX");
        arrayList0.add("TC");
        arrayList0.add("TT");
        arrayList0.add("VC");
        arrayList0.add("VG");
        arrayList0.add("VI");
        hashMap0.put(1, arrayList0);
        ArrayList arrayList1 = new ArrayList(2);
        arrayList1.add("RU");
        arrayList1.add("KZ");
        ArrayList arrayList2 = m5.b.B(36, hashMap0, m5.b.B(34, hashMap0, m5.b.B(33, hashMap0, m5.b.B(0x20, hashMap0, m5.b.B(0x1F, hashMap0, m5.b.B(30, hashMap0, m5.b.B(27, hashMap0, m5.b.B(20, hashMap0, m5.b.B(7, hashMap0, arrayList1, 1, "EG"), 1, "ZA"), 1, "GR"), 1, "NL"), 1, "BE"), 1, "FR"), 1, "ES"), 1, "HU"), 2, "IT");
        arrayList2.add("VA");
        hashMap0.put(39, arrayList2);
        ArrayList arrayList3 = new ArrayList(1);
        arrayList3.add("RO");
        ArrayList arrayList4 = m5.b.B(43, hashMap0, m5.b.B(41, hashMap0, m5.b.B(40, hashMap0, arrayList3, 1, "CH"), 1, "AT"), 4, "GB");
        arrayList4.add("GG");
        arrayList4.add("IM");
        arrayList4.add("JE");
        hashMap0.put(44, arrayList4);
        ArrayList arrayList5 = new ArrayList(1);
        arrayList5.add("DK");
        ArrayList arrayList6 = m5.b.B(46, hashMap0, m5.b.B(45, hashMap0, arrayList5, 1, "SE"), 2, "NO");
        arrayList6.add("SJ");
        hashMap0.put(0x2F, arrayList6);
        ArrayList arrayList7 = new ArrayList(1);
        arrayList7.add("PL");
        ArrayList arrayList8 = m5.b.B(60, hashMap0, m5.b.B(58, hashMap0, m5.b.B(57, hashMap0, m5.b.B(56, hashMap0, m5.b.B(55, hashMap0, m5.b.B(54, hashMap0, m5.b.B(53, hashMap0, m5.b.B(52, hashMap0, m5.b.B(51, hashMap0, m5.b.B(49, hashMap0, m5.b.B(0x30, hashMap0, arrayList7, 1, "DE"), 1, "PE"), 1, "MX"), 1, "CU"), 1, "AR"), 1, "BR"), 1, "CL"), 1, "CO"), 1, "VE"), 1, "MY"), 3, "AU");
        arrayList8.add("CC");
        arrayList8.add("CX");
        hashMap0.put(61, arrayList8);
        ArrayList arrayList9 = new ArrayList(1);
        arrayList9.add("ID");
        ArrayList arrayList10 = m5.b.B(0xD3, hashMap0, m5.b.B(98, hashMap0, m5.b.B(0x5F, hashMap0, m5.b.B(94, hashMap0, m5.b.B(93, hashMap0, m5.b.B(92, hashMap0, m5.b.B(91, hashMap0, m5.b.B(90, hashMap0, m5.b.B(86, hashMap0, m5.b.B(84, hashMap0, m5.b.B(82, hashMap0, m5.b.B(81, hashMap0, m5.b.B(66, hashMap0, m5.b.B(65, hashMap0, m5.b.B(0x40, hashMap0, m5.b.B(0x3F, hashMap0, m5.b.B(62, hashMap0, arrayList9, 1, "PH"), 1, "NZ"), 1, "SG"), 1, "TH"), 1, "JP"), 1, "KR"), 1, "VN"), 1, "CN"), 1, "TR"), 1, "IN"), 1, "PK"), 1, "AF"), 1, "LK"), 1, "MM"), 1, "IR"), 1, "SS"), 2, "MA");
        arrayList10.add("EH");
        hashMap0.put(0xD4, arrayList10);
        ArrayList arrayList11 = new ArrayList(1);
        arrayList11.add("DZ");
        ArrayList arrayList12 = m5.b.B(0x105, hashMap0, m5.b.B(260, hashMap0, m5.b.B(0x102, hashMap0, m5.b.B(0x101, hashMap0, m5.b.B(0x100, hashMap0, m5.b.B(0xFF, hashMap0, m5.b.B(0xFE, hashMap0, m5.b.B(0xFD, hashMap0, m5.b.B(0xFC, hashMap0, m5.b.B(0xFB, hashMap0, m5.b.B(0xFA, hashMap0, m5.b.B(0xF9, hashMap0, m5.b.B(0xF8, hashMap0, m5.b.B(0xF7, hashMap0, m5.b.B(0xF6, hashMap0, m5.b.B(0xF5, hashMap0, m5.b.B(0xF4, hashMap0, m5.b.B(0xF3, hashMap0, m5.b.B(0xF2, hashMap0, m5.b.B(0xF1, hashMap0, m5.b.B(0xF0, hashMap0, m5.b.B(0xEF, hashMap0, m5.b.B(0xEE, hashMap0, m5.b.B(0xED, hashMap0, m5.b.B(0xEC, hashMap0, m5.b.B(0xEB, hashMap0, m5.b.B(0xEA, hashMap0, m5.b.B(0xE9, hashMap0, m5.b.B(0xE8, hashMap0, m5.b.B(0xE7, hashMap0, m5.b.B(230, hashMap0, m5.b.B(0xE5, hashMap0, m5.b.B(0xE4, hashMap0, m5.b.B(0xE3, hashMap0, m5.b.B(0xE2, hashMap0, m5.b.B(0xE1, hashMap0, m5.b.B(0xE0, hashMap0, m5.b.B(0xDF, hashMap0, m5.b.B(0xDE, hashMap0, m5.b.B(0xDD, hashMap0, m5.b.B(220, hashMap0, m5.b.B(0xDA, hashMap0, m5.b.B(0xD8, hashMap0, m5.b.B(0xD5, hashMap0, arrayList11, 1, "TN"), 1, "LY"), 1, "GM"), 1, "SN"), 1, "MR"), 1, "ML"), 1, "GN"), 1, "CI"), 1, "BF"), 1, "NE"), 1, "TG"), 1, "BJ"), 1, "MU"), 1, "LR"), 1, "SL"), 1, "GH"), 1, "NG"), 1, "TD"), 1, "CF"), 1, "CM"), 1, "CV"), 1, "ST"), 1, "GQ"), 1, "GA"), 1, "CG"), 1, "CD"), 1, "AO"), 1, "GW"), 1, "IO"), 1, "AC"), 1, "SC"), 1, "SD"), 1, "RW"), 1, "ET"), 1, "SO"), 1, "DJ"), 1, "KE"), 1, "TZ"), 1, "UG"), 1, "BI"), 1, "MZ"), 1, "ZM"), 1, "MG"), 2, "RE");
        arrayList12.add("YT");
        hashMap0.put(0x106, arrayList12);
        ArrayList arrayList13 = new ArrayList(1);
        arrayList13.add("ZW");
        ArrayList arrayList14 = m5.b.B(0x10D, hashMap0, m5.b.B(0x10C, hashMap0, m5.b.B(0x10B, hashMap0, m5.b.B(0x10A, hashMap0, m5.b.B(0x109, hashMap0, m5.b.B(0x108, hashMap0, m5.b.B(0x107, hashMap0, arrayList13, 1, "NA"), 1, "MW"), 1, "LS"), 1, "BW"), 1, "SZ"), 1, "KM"), 2, "SH");
        arrayList14.add("TA");
        hashMap0.put(290, arrayList14);
        ArrayList arrayList15 = new ArrayList(1);
        arrayList15.add("ER");
        ArrayList arrayList16 = m5.b.B(357, hashMap0, m5.b.B(356, hashMap0, m5.b.B(355, hashMap0, m5.b.B(354, hashMap0, m5.b.B(353, hashMap0, m5.b.B(0x160, hashMap0, m5.b.B(0x15F, hashMap0, m5.b.B(350, hashMap0, m5.b.B(299, hashMap0, m5.b.B(298, hashMap0, m5.b.B(297, hashMap0, m5.b.B(291, hashMap0, arrayList15, 1, "AW"), 1, "FO"), 1, "GL"), 1, "GI"), 1, "PT"), 1, "LU"), 1, "IE"), 1, "IS"), 1, "AL"), 1, "MT"), 1, "CY"), 2, "FI");
        arrayList16.add("AX");
        hashMap0.put(358, arrayList16);
        ArrayList arrayList17 = new ArrayList(1);
        arrayList17.add("BG");
        ArrayList arrayList18 = m5.b.B(509, hashMap0, m5.b.B(508, hashMap0, m5.b.B(507, hashMap0, m5.b.B(506, hashMap0, m5.b.B(505, hashMap0, m5.b.B(504, hashMap0, m5.b.B(503, hashMap0, m5.b.B(502, hashMap0, m5.b.B(501, hashMap0, m5.b.B(500, hashMap0, m5.b.B(423, hashMap0, m5.b.B(421, hashMap0, m5.b.B(420, hashMap0, m5.b.B(389, hashMap0, m5.b.B(387, hashMap0, m5.b.B(386, hashMap0, m5.b.B(385, hashMap0, m5.b.B(0x17F, hashMap0, m5.b.B(382, hashMap0, m5.b.B(381, hashMap0, m5.b.B(380, hashMap0, m5.b.B(378, hashMap0, m5.b.B(377, hashMap0, m5.b.B(376, hashMap0, m5.b.B(375, hashMap0, m5.b.B(374, hashMap0, m5.b.B(373, hashMap0, m5.b.B(372, hashMap0, m5.b.B(371, hashMap0, m5.b.B(370, hashMap0, m5.b.B(359, hashMap0, arrayList17, 1, "LT"), 1, "LV"), 1, "EE"), 1, "MD"), 1, "AM"), 1, "BY"), 1, "AD"), 1, "MC"), 1, "SM"), 1, "UA"), 1, "RS"), 1, "ME"), 1, "XK"), 1, "HR"), 1, "SI"), 1, "BA"), 1, "MK"), 1, "CZ"), 1, "SK"), 1, "LI"), 1, "FK"), 1, "BZ"), 1, "GT"), 1, "SV"), 1, "HN"), 1, "NI"), 1, "CR"), 1, "PA"), 1, "PM"), 1, "HT"), 3, "GP");
        arrayList18.add("BL");
        arrayList18.add("MF");
        hashMap0.put(590, arrayList18);
        ArrayList arrayList19 = new ArrayList(1);
        arrayList19.add("BO");
        ArrayList arrayList20 = m5.b.B(598, hashMap0, m5.b.B(597, hashMap0, m5.b.B(596, hashMap0, m5.b.B(595, hashMap0, m5.b.B(594, hashMap0, m5.b.B(593, hashMap0, m5.b.B(0x250, hashMap0, m5.b.B(0x24F, hashMap0, arrayList19, 1, "GY"), 1, "EC"), 1, "GF"), 1, "PY"), 1, "MQ"), 1, "SR"), 1, "UY"), 2, "CW");
        arrayList20.add("BQ");
        hashMap0.put(599, arrayList20);
        ArrayList arrayList21 = new ArrayList(1);
        arrayList21.add("TL");
        hashMap0.put(998, m5.b.B(996, hashMap0, m5.b.B(995, hashMap0, m5.b.B(994, hashMap0, m5.b.B(993, hashMap0, m5.b.B(0x3E0, hashMap0, m5.b.B(979, hashMap0, m5.b.B(977, hashMap0, m5.b.B(0x3D0, hashMap0, m5.b.B(0x3CF, hashMap0, m5.b.B(974, hashMap0, m5.b.B(973, hashMap0, m5.b.B(972, hashMap0, m5.b.B(971, hashMap0, m5.b.B(970, hashMap0, m5.b.B(968, hashMap0, m5.b.B(967, hashMap0, m5.b.B(966, hashMap0, m5.b.B(965, hashMap0, m5.b.B(964, hashMap0, m5.b.B(963, hashMap0, m5.b.B(962, hashMap0, m5.b.B(961, hashMap0, m5.b.B(960, hashMap0, m5.b.B(888, hashMap0, m5.b.B(886, hashMap0, m5.b.B(883, hashMap0, m5.b.B(882, hashMap0, m5.b.B(881, hashMap0, m5.b.B(880, hashMap0, m5.b.B(878, hashMap0, m5.b.B(870, hashMap0, m5.b.B(856, hashMap0, m5.b.B(855, hashMap0, m5.b.B(853, hashMap0, m5.b.B(852, hashMap0, m5.b.B(850, hashMap0, m5.b.B(808, hashMap0, m5.b.B(800, hashMap0, m5.b.B(692, hashMap0, m5.b.B(691, hashMap0, m5.b.B(690, hashMap0, m5.b.B(689, hashMap0, m5.b.B(0x2B0, hashMap0, m5.b.B(0x2AF, hashMap0, m5.b.B(686, hashMap0, m5.b.B(685, hashMap0, m5.b.B(683, hashMap0, m5.b.B(682, hashMap0, m5.b.B(681, hashMap0, m5.b.B(680, hashMap0, m5.b.B(679, hashMap0, m5.b.B(678, hashMap0, m5.b.B(677, hashMap0, m5.b.B(676, hashMap0, m5.b.B(675, hashMap0, m5.b.B(674, hashMap0, m5.b.B(673, hashMap0, m5.b.B(0x2A0, hashMap0, m5.b.B(670, hashMap0, arrayList21, 1, "NF"), 1, "BN"), 1, "NR"), 1, "PG"), 1, "TO"), 1, "SB"), 1, "VU"), 1, "FJ"), 1, "PW"), 1, "WF"), 1, "CK"), 1, "NU"), 1, "WS"), 1, "KI"), 1, "NC"), 1, "TV"), 1, "PF"), 1, "TK"), 1, "FM"), 1, "MH"), 1, "001"), 1, "001"), 1, "KP"), 1, "HK"), 1, "MO"), 1, "KH"), 1, "LA"), 1, "001"), 1, "001"), 1, "BD"), 1, "001"), 1, "001"), 1, "001"), 1, "TW"), 1, "001"), 1, "MV"), 1, "LB"), 1, "JO"), 1, "SY"), 1, "IQ"), 1, "KW"), 1, "SA"), 1, "YE"), 1, "OM"), 1, "PS"), 1, "AE"), 1, "IL"), 1, "BH"), 1, "QA"), 1, "BT"), 1, "MN"), 1, "NP"), 1, "001"), 1, "TJ"), 1, "TM"), 1, "AZ"), 1, "GE"), 1, "KG"), 1, "UZ"));
        return hashMap0;
    }

    public static boolean t(Context context0, String s) {
        w.e0(context0, "The application context is required.");
        return context0.checkPermission(s, Process.myPid(), Process.myUid()) == 0;
    }

    public static final void u(E9.a a0, s9.a a1, boolean z) {
        j.f(a0, "<this>");
        j.f(a1, "flowName");
        String s = a1.X;
        if(z) {
            a0.d("support channels modal - dialer clicked", Bb.F.J(new Ab.k("flowName", s)));
            return;
        }
        a0.d("support open dialer", Bb.F.J(new Ab.k("flowName", s)));
    }

    public abstract void v(Throwable arg1);

    public abstract void w(R2.h arg1);

    public static void x(Placeable.PlacementScope placeable$PlacementScope0, V v0, l1.k k0) {
        if(k0.o != 8) {
            if(Float.isNaN(k0.f) && Float.isNaN(k0.g) && Float.isNaN(k0.h) && Float.isNaN(k0.i) && Float.isNaN(k0.j) && Float.isNaN(k0.k) && Float.isNaN(k0.l) && Float.isNaN(k0.m) && Float.isNaN(k0.n)) {
                Placeable.PlacementScope.e(placeable$PlacementScope0, v0, android.support.v4.media.session.a.i(k0.b, k0.c));
                return;
            }
            V2.a a0 = new V2.a(9, k0);
            int v1 = k0.b;
            int v2 = k0.c;
            float f = Float.isNaN(k0.k) ? 0.0f : k0.k;
            placeable$PlacementScope0.getClass();
            Placeable.PlacementScope.a(placeable$PlacementScope0, v0);
            v0.Z(a1.g.d(android.support.v4.media.session.a.i(v1, v2), v0.c0), f, a0);
        }
    }

    public static final Object y(Object[] arr_object, K.v v0, Function0 function00, p p0, int v1, int v2) {
        Object object3;
        if((v2 & 2) != 0) {
            v0 = d0.n.a;
        }
        int v3 = p0.P;
        W5.f.o(36);
        String s = Integer.toString(v3, 36);
        j.e(s, "toString(this, checkRadix(radix))");
        j.d(v0, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        d0.j j0 = (d0.j)p0.k(d0.l.a);
        Object object0 = p0.G();
        Z z0 = U.l.a;
        Object object1 = null;
        if(object0 == z0) {
            if(j0 == null) {
                object3 = null;
            }
            else {
                Object object2 = j0.b(s);
                object3 = object2 == null ? null : ((Function1)v0.Z).n(object2);
            }
            if(object3 == null) {
                object3 = function00.invoke();
            }
            object0 = new d0.b(v0, j0, s, object3, arr_object);
            p0.a0(object0);
        }
        if(Arrays.equals(arr_object, ((d0.b)object0).c0)) {
            object1 = ((d0.b)object0).b0;
        }
        if(object1 == null) {
            object1 = function00.invoke();
        }
        boolean z1 = p0.h(((d0.b)object0));
        boolean z2 = p0.h(v0);
        boolean z3 = p0.h(j0);
        boolean z4 = p0.f(s);
        boolean z5 = p0.h(object1);
        boolean z6 = p0.h(arr_object);
        Object object4 = p0.G();
        if((z1 | z2 | z3 | z4 | z5 | z6) != 0 || object4 == z0) {
            object4 = new d0.a(((d0.b)object0), v0, j0, s, object1, arr_object);
            p0.a0(object4);
        }
        U.H.g(((Function0)object4), p0);
        return object1;
    }

    public static void z(Window window0, boolean z) {
        int v = Build.VERSION.SDK_INT;
        if(v >= 35) {
            A1.c.f(window0, z);
            return;
        }
        if(v >= 30) {
            A1.c.e(window0, z);
            return;
        }
        View view0 = window0.getDecorView();
        int v1 = view0.getSystemUiVisibility();
        view0.setSystemUiVisibility((z ? v1 & 0xFFFFF8FF : v1 | 0x700));
    }
}

