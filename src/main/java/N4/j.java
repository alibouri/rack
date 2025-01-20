package N4;

import A.k;
import B.r0;
import B.r;
import Bb.F;
import D0.K;
import Ec.q;
import Fa.I;
import G0.f0;
import I.h0;
import I.i0;
import I5.h;
import M.J;
import M.y;
import M4.m;
import N.Q1;
import N.R1;
import N.m2;
import N.o1;
import N.q1;
import N.r1;
import N.s1;
import Nb.z;
import O0.O;
import U.Z;
import U.d;
import U.g0;
import U.l0;
import U.l;
import V.D;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Trace;
import android.util.Log;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import cb.o;
import com.google.android.gms.common.api.Status;
import com.sendwave.backend.fragment.CustomerHomeFragment;
import com.sendwave.util.Country;
import f5.a;
import f9.C;
import io.sentry.i1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import jeb.synthetic.FIN;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import n0.S;
import n0.U;
import n0.v;
import o6.i;
import r.p;
import s.B;
import t0.e;
import u.c;
import v.A;
import v.k0;
import w.n0;
import w.n;
import w.o0;
import w.x;
import y.P0;
import y.m0;
import y.q0;

public abstract class j {
    public static long a;
    public static Method b;
    public static Method c;
    public static Method d;
    public static e e;
    public static Class f;
    public static final int g;

    public static final long A(float f, long v) {
        return Float.isNaN(f) || f >= 1.0f ? v : v.b(v.d(v) * f, v);
    }

    public static final void B(String s, String s1) {
        Nb.j.f(s, "arg");
        if(s.length() <= 0) {
            throw new IllegalArgumentException(J.e("Argument \'", s1, "\' cannot be empty").toString());
        }
    }

    public static final void C(M4.v v0) {
        Nb.j.f(v0, "container");
        for(Object object0: v0) {
            if(object0 == null) {
                throw new NullPointerException("Container \'requests\' cannot contain null values");
            }
            if(false) {
                break;
            }
        }
        if(v0.isEmpty()) {
            throw new IllegalArgumentException("Container \'requests\' cannot be empty".toString());
        }
    }

    public static final void D(String s, String s1) {
        if(s == null || s.length() <= 0) {
            throw new IllegalArgumentException(J.e("Argument \'", s1, "\' cannot be null or empty").toString());
        }
    }

    public void E(int v, CharSequence charSequence0) {
    }

    public void F(p p0) {
    }

    public static final void G(h h0) {
        synchronized(j.class) {
            if(a.b(j.class)) {
                return;
            }
            goto label_5;
        }
        return;
        try {
        label_5:
            Nb.j.f(h0, "eventsToPersist");
            s s0 = N4.h.E();
            for(Object object0: h0.q()) {
                t t0 = h0.l(((b)object0));
                if(t0 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                s0.a(((b)object0), t0.d());
            }
            N4.h.J(s0);
            return;
        }
        catch(Throwable throwable1) {
        }
        a.a(throwable1, j.class);
    }

    public static final void H(b b0, t t0) {
        Class class0 = j.class;
        __monitor_enter(class0);
        int v = FIN.finallyOpen$NT();
        if(a.b(j.class)) {
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(class0);
            FIN.finallyCodeEnd$NT(v);
            return;
        }
        try {
            s s0 = N4.h.E();
            s0.a(b0, t0.d());
            N4.h.J(s0);
            FIN.finallyExec$NT(v);
        }
        catch(Throwable throwable0) {
            a.a(throwable0, j.class);
            FIN.finallyExec$NT(v);
        }
    }

    public static final Modifier I(Modifier modifier0, P0 p00, q0 q00, boolean z, boolean z1, m0 m00, k k0, U.p p0) {
        Context context0 = (Context)p0.k(AndroidCompositionLocals_androidKt.b);
        n0 n00 = (n0)p0.k(o0.a);
        if(n00 != null) {
            p0.Q(1586021609);
            boolean z2 = p0.f(context0);
            boolean z3 = p0.f(n00);
            Object object0 = p0.G();
            if((z2 | z3) != 0 || object0 == l.a) {
                object0 = new n(context0, n00);
                p0.a0(object0);
            }
            p0.p(false);
            w.m0 m01 = (n)object0;
            return androidx.compose.foundation.gestures.a.f(modifier0.d((q00 == q0.X ? x.c : x.b)).d(m01.c()), p00, q00, m01, z, (((LayoutDirection)p0.k(f0.l)) != LayoutDirection.Y || q00 == q0.X ? !z1 : z1), m00, k0, null);
        }
        p0.Q(1586120933);
        p0.p(false);
        return androidx.compose.foundation.gestures.a.f(modifier0.d((q00 == q0.X ? x.c : x.b)).d(w.m0.Z.c()), p00, q00, w.m0.Z, z, (((LayoutDirection)p0.k(f0.l)) != LayoutDirection.Y || q00 == q0.X ? !z1 : z1), m00, k0, null);
    }

    public static final void J() {
        if(!M4.l.l.get()) {
            throw new m("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");  // initializer: LM4/h;-><init>(Ljava/lang/String;)V
        }
    }

    public static final void K(String s, String s1) {
        try {
            if(j.f == null) {
                j.f = Class.forName("com.unity3d.player.UnityPlayer");
            }
            Class class0 = j.f;
            if(class0 != null) {
                Method method0 = class0.getMethod("UnitySendMessage", String.class, String.class, String.class);
                Class class1 = j.f;
                if(class1 != null) {
                    method0.invoke(class1, "UnityFacebookSDKPlugin", s, s1);
                    return;
                }
                Nb.j.p("unityPlayer");
                throw null;
            }
            Nb.j.p("unityPlayer");
            throw null;
        }
        catch(Exception exception0) {
        }
        Log.e("N4.j", "Failed to send message to Unity", exception0);
    }

    public static final void L(D d0, int v, int v1) {
        int v2 = d0.h;
        if((v2 & 1 << v) == 0) {
            d0.h = 1 << v | v2;
            int[] arr_v = d0.d;
            arr_v[d0.e - d0.U().a + v] = v1;
            return;
        }
        d.N(("Already pushed argument " + d0.U().b(v)));
        throw null;
    }

    public static final void M(D d0, int v, Object object0) {
        int v1 = d0.i;
        if((v1 & 1 << v) == 0) {
            d0.i = 1 << v | v1;
            Object[] arr_object = d0.f;
            arr_object[d0.g - d0.U().b + v] = object0;
            return;
        }
        d.N(("Already pushed argument " + d0.U().c(v)));
        throw null;
    }

    public static void N(Status status0, Object object0, i i0) {
        if(status0.X <= 0) {
            i0.b(object0);
            return;
        }
        L5.d d0 = status0.Z == null ? new L5.d(status0) : new L5.k(status0);  // initializer: LL5/d;-><init>(Lcom/google/android/gms/common/api/Status;)V
        i0.a(d0);
    }

    public static String O(int v) {
        switch(v) {
            case 0: {
                return "Blocking";
            }
            case 1: {
                return "Optional";
            }
            case 2: {
                return "Async";
            }
            default: {
                return "Invalid(value=" + v + ')';
            }
        }
    }

    public static String P(String s) {
        return s.length() > 0x7F ? s.substring(0, 0x7F) : s;
    }

    public static Object Q(Function2 function20, Object object0, g g0) {
        Nb.j.f(function20, "<this>");
        CoroutineContext coroutineContext0 = g0.a();
        Eb.d d0 = coroutineContext0 == kotlin.coroutines.j.X ? new Eb.d(g0) : new Eb.e(g0, coroutineContext0);  // initializer: LFb/h;-><init>(Lkotlin/coroutines/g;)V / initializer: LFb/c;-><init>(Lkotlin/coroutines/g;Lkotlin/coroutines/CoroutineContext;)V
        z.d(2, function20);
        return function20.j(object0, d0);
    }

    public static int R(int v) {
        for(int v1 = 0; v1 < 3; ++v1) {
            int v2 = new int[]{1, 2, 3}[v1];
            if(v2 == 0) {
                throw null;
            }
            if(v2 - 1 == v) {
                return v2;
            }
        }
        return 1;
    }

    public static final void a(Boolean boolean0, Modifier modifier0, A a0, String s, c0.b b0, U.p p0, int v) {
        String s1;
        Modifier modifier1;
        p0.S(0xED7B4BE0);
        int v1 = (v & 6) == 0 ? (((v & 8) == 0 ? p0.f(boolean0) : p0.h(boolean0)) ? 4 : 2) | v : v;
        int v2 = (v & 0x180) == 0 ? v1 | 0x30 | (p0.h(a0) ? 0x100 : 0x80) : v1 | 0x30;
        int v3 = (v & 0x6000) == 0 ? v2 | 0xC00 | (p0.h(b0) ? 0x4000 : 0x2000) : v2 | 0xC00;
        if((v3 & 9363) != 9362 || !p0.x()) {
            j.b(v.m0.c(boolean0, "Crossfade", p0, v3 & 14 | v3 >> 6 & 0x70, 0), g0.l.X, a0, null, b0, p0, v3 & 0xE3F0);
            modifier1 = g0.l.X;
            s1 = "Crossfade";
        }
        else {
            p0.K();
            modifier1 = modifier0;
            s1 = s;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new c0.a(boolean0, modifier1, a0, s1, b0, v, 3);
        }
    }

    public static final void b(k0 k00, Modifier modifier0, A a0, Function1 function10, c0.b b0, U.p p0, int v) {
        B b2;
        int v14;
        int v3;
        Function1 function11;
        p0.S(679005231);
        int v1 = (v & 6) == 0 ? (p0.f(k00) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.f(modifier0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.h(a0) ? 0x100 : 0x80);
        }
        int v2 = (v & 0x6000) == 0 ? v1 | 0xC00 | (p0.h(b0) ? 0x4000 : 0x2000) : v1 | 0xC00;
        if((v2 & 9363) == 9362 && p0.x()) {
            p0.K();
            function11 = function10;
            goto label_133;
        }
        c c0 = c.d0;
        Object object0 = p0.G();
        Z z0 = l.a;
        if(object0 == z0) {
            object0 = new e0.p();
            ((e0.p)object0).add(k00.c());
            p0.a0(object0);
        }
        Object object1 = p0.G();
        if(object1 == z0) {
            object1 = new B();
            p0.a0(object1);
        }
        B b1 = (B)object1;
        Object object2 = k00.c();
        ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = k00.d;
        if(Nb.j.a(object2, parcelableSnapshotMutableState0.getValue())) {
            p0.Q(860660313);
            if(((e0.p)object0).size() != 1 || !Nb.j.a(((e0.p)object0).get(0), parcelableSnapshotMutableState0.getValue())) {
                p0.Q(0x334EAF2B);
                Object object3 = p0.G();
                if((v2 & 14) == 4 || object3 == z0) {
                    object3 = new u.s(k00, 0);
                    p0.a0(object3);
                }
                Bb.v.i0(((e0.p)object0), ((Function1)object3));
                b1.a();
            }
            else {
                p0.Q(860984945);
            }
            p0.p(false);
        }
        else {
            p0.Q(860990897);
        }
        p0.p(false);
        Object object4 = parcelableSnapshotMutableState0.getValue();
        if(object4 == null) {
            v3 = 0;
        }
        else {
            b1.getClass();
            v3 = object4.hashCode();
        }
        int v4 = v3 * 0xCC9E2D51 ^ v3 * 0xCC9E2D51 << 16;
        int v5 = v4 & 0x7F;
        int v6 = b1.d;
        int v7 = v4 >>> 7 & v6;
        int v8 = 0;
        while(true) {
            int v9 = (v7 & 7) << 3;
            long v10 = b1.a[v7 >> 3] >>> v9 | b1.a[(v7 >> 3) + 1] << 0x40 - v9 & -((long)v9) >> 0x3F;
            long v11 = ((long)v5) * 0x101010101010101L ^ v10;
            long v12 = v11 - 0x101010101010101L & ~v11 & 0x8080808080808080L;
            while(Long.compare(v12, 0L) != 0) {
                int v13 = v7 + (Long.numberOfTrailingZeros(v12) >> 3) & v6;
                if(Nb.j.a(b1.b[v13], object4)) {
                    v14 = v13;
                    goto label_68;
                }
                v12 &= v12 - 1L;
                v5 = v5;
            }
            if((v10 & ~v10 << 6 & 0x8080808080808080L) == 0L) {
                goto label_137;
            }
            else {
                v14 = -1;
            }
        label_68:
            if(v14 < 0) {
                p0.Q(861052122);
                ListIterator listIterator0 = ((e0.p)object0).listIterator();
                int v15;
                for(v15 = 0; true; ++v15) {
                    if(!((Cb.a)listIterator0).hasNext()) {
                        v15 = -1;
                        break;
                    }
                    if(Nb.j.a(((Cb.a)listIterator0).next(), parcelableSnapshotMutableState0.getValue())) {
                        break;
                    }
                }
                if(v15 == -1) {
                    ((e0.p)object0).add(parcelableSnapshotMutableState0.getValue());
                }
                else {
                    ((e0.p)object0).set(v15, parcelableSnapshotMutableState0.getValue());
                }
                b1.a();
                int v16 = ((e0.p)object0).size();
                int v17 = 0;
                while(v17 < v16) {
                    Object object5 = ((e0.p)object0).get(v17);
                    b1.i(object5, c0.c.c(0xAAFA89D8, new y(k00, a0, object5, b0, 1), p0));
                    ++v17;
                    b1 = b1;
                }
                b2 = b1;
            }
            else {
                b2 = b1;
                p0.Q(0x335E3631);
            }
            p0.p(false);
            K k0 = r.e(g0.b.a, false);
            int v18 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier1 = g0.a.d(p0, modifier0);
            F0.k.a.getClass();
            F0.i i0 = F0.j.b;
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            d.K(p0, k0, F0.j.f);
            d.K(p0, g00, F0.j.e);
            F0.h h0 = F0.j.g;
            if(p0.O || !Nb.j.a(p0.G(), v18)) {
                m5.b.F(v18, p0, v18, h0);
            }
            d.K(p0, modifier1, F0.j.d);
            p0.Q(0xF4D33EC0);
            int v19 = ((e0.p)object0).size();
            for(int v20 = 0; v20 < v19; ++v20) {
                Object object6 = ((e0.p)object0).get(v20);
                p0.O(0xBF83EBDB, object6);
                Function2 function20 = (Function2)b2.e(object6);
                if(function20 == null) {
                    p0.Q(0x30FA588A);
                }
                else {
                    p0.Q(0xBF83F257);
                    function20.j(p0, 0);
                }
                p0.p(false);
                p0.p(false);
            }
            p0.p(false);
            p0.p(true);
            function11 = c0;
        label_133:
            l0 l00 = p0.r();
            if(l00 != null) {
                l00.d = new c0.a(k00, modifier0, a0, function11, b0, v, 4);
            }
            return;
        label_137:
            v8 += 8;
            v7 = v7 + v8 & v6;
            v5 = v5;
            b1 = b1;
        }
    }

    public static final void c(String s, float f, boolean z, Modifier modifier0, U.p p0, int v, int v1) {
        float f1;
        boolean z2;
        boolean z1;
        Nb.j.f(s, "qrUrl");
        p0.S(0xE5E1A016);
        int v2 = (v & 6) == 0 ? (p0.f(s) ? 4 : 2) | v : v;
        int v3 = v2 | 0x30;
        if((v1 & 4) != 0) {
            v3 = v2 | 0x1B0;
            z1 = z;
        }
        else if((v & 0x180) == 0) {
            z1 = z;
            v3 |= (p0.g(z1) ? 0x100 : 0x80);
        }
        else {
            z1 = z;
        }
        if((v & 0xC00) == 0) {
            v3 |= (p0.f(modifier0) ? 0x800 : 0x400);
        }
        if((v3 & 0x493) != 1170 || !p0.x()) {
            boolean z3 = (v1 & 4) == 0 ? z1 : false;
            int v4 = ((Density)p0.k(f0.f)).I(0.0f);
            p0.Q(455498055);
            boolean z4 = p0.d(v4);
            Object object0 = p0.G();
            Z z5 = l.a;
            if(((v3 & 14) == 4 | z4 | ((v3 & 0x380) == 0x100 ? 1 : 0)) != 0 || object0 == z5) {
                object0 = new C(s, z3, v4);
                p0.a0(object0);
            }
            p0.p(false);
            p0.Q(455508593);
            Object object1 = p0.G();
            if((((v3 & 14) == 4 ? 1 : 0) | ((v3 & 0x380) == 0x100 ? 1 : 0)) != 0 || object1 == z5) {
                object1 = new com.apollographql.apollo.api.http.a(1, s, z3);
                p0.a0(object1);
            }
            p0.p(false);
            androidx.compose.ui.viewinterop.a.a(((Function1)object0), modifier0, ((Function1)object1), p0, v3 >> 6 & 0x70, 0);
            f1 = 0.0f;
            z2 = z3;
        }
        else {
            p0.K();
            z2 = z1;
            f1 = f;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new I(s, f1, z2, modifier0, v, v1);
        }
    }

    public static final void d(String s, Modifier modifier0, long v, Function0 function00, Function3 function30, long v1, long v2, q1 q10, c0.b b0, U.p p0, int v3, int v4) {
        long v12;
        q1 q12;
        long v11;
        long v10;
        Function3 function31;
        q1 q13;
        Modifier modifier2;
        int v15;
        long v14;
        Function3 function32;
        long v13;
        int v9;
        q1 q11;
        int v8;
        long v7;
        Modifier modifier1;
        Nb.j.f(s, "title");
        p0.S(0xEE781FF0);
        int v5 = (v3 & 6) == 0 ? (p0.f(s) ? 4 : 2) | v3 : v3;
        if((v4 & 2) != 0) {
            v5 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v3 & 0x30) == 0) {
            modifier1 = modifier0;
            v5 |= (p0.f(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        int v6 = ((v3 & 0xC00) == 0 ? v5 | 0x180 | (p0.h(function00) ? 0x800 : 0x400) : v5 | 0x180) | 0x6000;
        if((0x30000 & v3) == 0) {
            if((v4 & 0x20) == 0) {
                v7 = v1;
                v8 = p0.e(v7) ? 0x20000 : 0x10000;
            }
            else {
                v7 = v1;
                v8 = 0x10000;
            }
            v6 |= v8;
        }
        else {
            v7 = v1;
        }
        if((0x180000 & v3) == 0) {
            v6 |= 0x80000;
        }
        if((0xC00000 & v3) == 0) {
            if((v4 & 0x80) == 0) {
                q11 = q10;
                v9 = p0.f(q11) ? 0x800000 : 0x400000;
            }
            else {
                q11 = q10;
                v9 = 0x400000;
            }
            v6 |= v9;
        }
        else {
            q11 = q10;
        }
        if((0x6000000 & v3) == 0) {
            v6 |= (p0.h(b0) ? 0x4000000 : 0x2000000);
        }
        if((0x2492493 & v6) != 0x2492492 || !p0.x()) {
            p0.M();
            if((v3 & 1) == 0 || p0.w()) {
                Modifier modifier3 = (v4 & 2) == 0 ? modifier1 : g0.l.X;
                long v16 = v.b;
                c0.b b1 = cb.k.a;
                if((v4 & 0x20) != 0) {
                    v7 = yc.d.h(0x7F060002, p0);  // color:BgGray100
                    v6 &= 0xFFF8FFFF;
                }
                if((v4 & 0x80) == 0) {
                    modifier2 = modifier3;
                    function32 = b1;
                    v11 = v7;
                    v14 = v11;
                    q13 = q11;
                    v15 = v6 & 0xFFC7FFFF;
                }
                else {
                    v15 = v6 & 0xFE07FFFF;
                    modifier2 = modifier3;
                    function32 = b1;
                    v11 = v7;
                    v14 = v11;
                    q13 = o1.d(p0);
                }
                v13 = v16;
            }
            else {
                p0.K();
                if((v4 & 0x20) != 0) {
                    v6 &= 0xFFF8FFFF;
                }
                v13 = v;
                function32 = function30;
                v14 = v2;
                v15 = (v4 & 0x80) == 0 ? v6 & 0xFFC7FFFF : v6 & 0xFE07FFFF;
                modifier2 = modifier1;
                v11 = v7;
                q13 = q11;
            }
            p0.q();
            j.e(c0.c.c(0x570499B8, new o(s, v13, v14, function00, function32), p0), modifier2, q13, v11, b0, p0, v15 & 0x70 | 6 | v15 >> 15 & 0x380 | v15 >> 6 & 0x1C00 | v15 >> 12 & 0xE000, 0);
            modifier1 = modifier2;
            v12 = v13;
            function31 = function32;
            v10 = v14;
            q12 = q13;
        }
        else {
            p0.K();
            function31 = function30;
            v10 = v2;
            v11 = v7;
            q12 = q11;
            v12 = v;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new cb.n(s, modifier1, v12, function00, function31, v11, v10, q12, b0, v3, v4);
        }
    }

    public static final void e(c0.b b0, Modifier modifier0, q1 q10, long v, c0.b b1, U.p p0, int v1, int v2) {
        long v7;
        q1 q12;
        Modifier modifier2;
        long v8;
        q1 q13;
        Modifier modifier3;
        q1 q14;
        int v6;
        long v5;
        int v4;
        q1 q11;
        Modifier modifier1;
        p0.S(-421099304);
        int v3 = (v1 & 6) == 0 ? (p0.h(b0) ? 4 : 2) | v1 : v1;
        if((v2 & 2) != 0) {
            v3 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v1 & 0x30) == 0) {
            modifier1 = modifier0;
            v3 |= (p0.f(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((v1 & 0x180) == 0) {
            if((v2 & 4) == 0) {
                q11 = q10;
                v4 = p0.f(q11) ? 0x100 : 0x80;
            }
            else {
                q11 = q10;
                v4 = 0x80;
            }
            v3 |= v4;
        }
        else {
            q11 = q10;
        }
        if((v1 & 0xC00) == 0) {
            if((v2 & 8) == 0) {
                v5 = v;
                v6 = p0.e(v5) ? 0x800 : 0x400;
            }
            else {
                v5 = v;
                v6 = 0x400;
            }
            v3 |= v6;
        }
        else {
            v5 = v;
        }
        if((v1 & 0x6000) == 0) {
            v3 |= (p0.h(b1) ? 0x4000 : 0x2000);
        }
        if((v3 & 9363) != 9362 || !p0.x()) {
            p0.M();
            if((v1 & 1) == 0 || p0.w()) {
                Modifier modifier4 = (v2 & 2) == 0 ? modifier1 : g0.l.X;
                if((v2 & 4) == 0) {
                    q14 = q11;
                }
                else {
                    q14 = o1.d(p0);
                    v3 &= -897;
                }
                if((v2 & 8) == 0) {
                    modifier3 = modifier4;
                    q13 = q14;
                    v8 = v5;
                }
                else {
                    v3 &= 0xFFFFE3FF;
                    modifier3 = modifier4;
                    q13 = q14;
                    v8 = yc.d.h(0x7F060002, p0);  // color:BgGray100
                }
            }
            else {
                p0.K();
                if((v2 & 4) != 0) {
                    v3 &= -897;
                }
                if((v2 & 8) != 0) {
                    v3 &= 0xFFFFE3FF;
                }
                modifier3 = modifier1;
                q13 = q11;
                v8 = v5;
            }
            p0.q();
            o1.a(modifier3, q13, b0, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, v8, 0L, b1, p0, v3 >> 3 & 0x7E | v3 << 6 & 0x380, 0x70000 & v3 << 6 | v3 << 9 & 0x1C00000, 0x17FF8);
            modifier2 = modifier3;
            q12 = q13;
            v7 = v8;
        }
        else {
            p0.K();
            modifier2 = modifier1;
            q12 = q11;
            v7 = v5;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new cb.m(b0, modifier2, q12, v7, b1, v1, v2);
        }
    }

    public static final void f(String s, Function1 function10, Modifier modifier0, boolean z, boolean z1, O o0, Function2 function20, Function2 function21, Function2 function22, Function2 function23, boolean z2, U0.K k0, i0 i00, h0 h00, boolean z3, int v, k k1, S s1, N.k0 k00, float f, B.q0 q00, U.p p0, int v1, int v2, int v3, int v4) {
        B.q0 q01;
        float f1;
        S s2;
        k k3;
        int v13;
        boolean z6;
        h0 h01;
        i0 i01;
        U0.K k2;
        boolean z5;
        Function2 function26;
        Function2 function25;
        Function2 function24;
        O o1;
        boolean z4;
        long v20;
        int v16;
        int v15;
        B.q0 q02;
        float f2;
        S s3;
        k k5;
        int v14;
        boolean z9;
        h0 h02;
        i0 i02;
        U0.K k4;
        boolean z8;
        Function2 function29;
        Function2 function28;
        Function2 function27;
        O o2;
        boolean z7;
        S s4;
        Function2 function215;
        int v18;
        k k8;
        k k7;
        boolean z11;
        h0 h03;
        Function2 function214;
        Function2 function213;
        O o3;
        int v10;
        int v5 = 16;
        Nb.j.f(s, "value");
        Nb.j.f(function10, "onValueChange");
        p0.S(0x5F5FF247);
        int v6 = 4;
        int v7 = (v1 & 6) == 0 ? (p0.f(s) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v7 |= (p0.h(function10) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v7 |= (p0.f(modifier0) ? 0x100 : 0x80);
        }
        if((v1 & 0xC00) == 0) {
            v7 |= (p0.g(z) ? 0x800 : 0x400);
        }
        if((v4 & 16) != 0) {
            v7 |= 0x6000;
        }
        else if((v1 & 0x6000) == 0) {
            v7 |= (p0.g(z1) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x30000) == 0) {
            v7 |= ((v4 & 0x20) != 0 || !p0.f(o0) ? 0x10000 : 0x20000);
        }
        int v8 = 0x80000;
        if((v1 & 0x180000) == 0) {
            v7 |= (p0.h(function20) ? 0x100000 : 0x80000);
        }
        int v9 = 0x400000;
        if((v4 & 0x80) != 0) {
            v7 |= 0xC00000;
        }
        else if((v1 & 0xC00000) == 0) {
            v7 |= (p0.h(function21) ? 0x800000 : 0x400000);
        }
        if((v4 & 0x100) != 0) {
            v7 |= 0x6000000;
        }
        else if((v1 & 0x6000000) == 0) {
            v7 |= (p0.h(function22) ? 0x4000000 : 0x2000000);
        }
        if((v4 & 0x200) != 0) {
            v7 |= 0x30000000;
        }
        else if((v1 & 0x30000000) == 0) {
            v7 |= (p0.h(function23) ? 0x20000000 : 0x10000000);
        }
        if((v4 & 0x400) != 0) {
            v10 = v2 | 6;
        }
        else if((v2 & 6) == 0) {
            if(!p0.g(z2)) {
                v6 = 2;
            }
            v10 = v2 | v6;
        }
        else {
            v10 = v2;
        }
        if((v4 & 0x800) != 0) {
            v10 |= 0x30;
        }
        else if((v2 & 0x30) == 0) {
            if(p0.f(k0)) {
                v5 = 0x20;
            }
            v10 |= v5;
        }
        int v11 = v10;
        if((v4 & 0x1000) != 0) {
            v11 |= 0x180;
        }
        else if((v2 & 0x180) == 0) {
            v11 |= (p0.f(i00) ? 0x100 : 0x80);
        }
        if((v2 & 0xC00) == 0) {
            v11 |= ((v4 & 0x2000) != 0 || !p0.f(h00) ? 0x400 : 0x800);
        }
        if((v4 & 0x4000) != 0) {
            v11 |= 0x6000;
        }
        else if((v2 & 0x6000) == 0) {
            v11 |= (p0.g(z3) ? 0x4000 : 0x2000);
        }
        if((v4 & 0x8000) != 0) {
            v11 |= 0x30000;
        }
        else if((v2 & 0x30000) == 0) {
            v11 |= (p0.d(v) ? 0x20000 : 0x10000);
        }
        if((v4 & 0x10000) != 0) {
            v11 |= 0x180000;
        }
        else if((v2 & 0x180000) == 0) {
            if(p0.f(k1)) {
                v8 = 0x100000;
            }
            v11 |= v8;
        }
        if((v2 & 0xC00000) == 0) {
            if((v4 & 0x20000) == 0 && p0.f(s1)) {
                v9 = 0x800000;
            }
            v11 |= v9;
        }
        if((v2 & 0x6000000) == 0) {
            v11 |= (p0.f(k00) ? 0x4000000 : 0x2000000);
        }
        int v12 = v11 | 0x30000000;
        if((v7 & 306783379) != 306783378 || (v12 & 306783379) != 306783378 || ((v3 | 6) & 3) != 2 || !p0.x()) {
            p0.M();
            if((v1 & 1) == 0 || p0.w()) {
                if((v4 & 0x20) == 0) {
                    o3 = o0;
                }
                else {
                    o3 = (O)p0.k(m2.a);
                    v7 &= 0xFFF8FFFF;
                }
                Function2 function210 = (v4 & 0x80) == 0 ? function21 : null;
                Function2 function211 = (v4 & 0x100) == 0 ? function22 : null;
                Function2 function212 = (v4 & 0x200) == 0 ? function23 : null;
                U0.K k6 = (v4 & 0x800) == 0 ? k0 : U0.J.X;
                i0 i03 = (v4 & 0x1000) == 0 ? i00 : i0.g;
                if((0x2000 & v4) == 0) {
                    function213 = function212;
                    function214 = function211;
                    h03 = h00;
                }
                else {
                    function213 = function212;
                    function214 = function211;
                    h03 = new h0(0x3F, null);
                    v12 &= 0xFFFFE3FF;
                }
                boolean z10 = (v4 & 0x4000) == 0 ? z3 : false;
                int v17 = (v4 & 0x8000) == 0 ? v : 0x7FFFFFFF;
                if((v4 & 0x10000) == 0) {
                    z11 = z10;
                    k7 = k1;
                }
                else {
                    p0.Q(0xDA13F76);
                    Object object0 = p0.G();
                    z11 = z10;
                    if(object0 == l.a) {
                        object0 = v1.r.d(p0);
                    }
                    k7 = (k)object0;
                    p0.p(false);
                }
                if((v4 & 0x20000) == 0) {
                    k8 = k7;
                    v18 = v17;
                    function215 = function210;
                    s4 = s1;
                }
                else {
                    k8 = k7;
                    v18 = v17;
                    function215 = function210;
                    s4 = H.e.a(((r1)p0.k(s1.a)).a, null, H.b.a, H.b.a, 3);
                    v12 &= 0xFE3FFFFF;
                }
                function27 = function215;
                function29 = function213;
                function28 = function214;
                z9 = z11;
                k5 = k8;
                v14 = v18;
                q02 = new r0(0.0f, 0.0f, 0.0f, 0.0f);
                v15 = v12;
                v16 = v7;
                z7 = (v4 & 16) == 0 ? z1 : false;
                z8 = (v4 & 0x400) == 0 ? z2 : false;
                k4 = k6;
                i02 = i03;
                h02 = h03;
                s3 = s4;
                f2 = 0.0f;
                o2 = o3;
            }
            else {
                p0.K();
                if((v4 & 0x20) != 0) {
                    v7 &= 0xFFF8FFFF;
                }
                if((0x2000 & v4) != 0) {
                    v12 &= 0xFFFFE3FF;
                }
                if((v4 & 0x20000) != 0) {
                    v12 &= 0xFE3FFFFF;
                }
                z7 = z1;
                o2 = o0;
                function27 = function21;
                function28 = function22;
                function29 = function23;
                z8 = z2;
                k4 = k0;
                i02 = i00;
                h02 = h00;
                z9 = z3;
                v14 = v;
                k5 = k1;
                s3 = s1;
                f2 = f;
                q02 = q00;
                v15 = v12;
                v16 = v7;
            }
            p0.q();
            p0.Q(0xDA16E1D);
            long v19 = o2.b();
            if(v19 == 16L) {
                k00.getClass();
                p0.Q(9804418);
                MutableState mutableState0 = d.G(new v((z ? k00.a : k00.b)), p0);
                p0.p(false);
                v20 = ((v)mutableState0.getValue()).a;
            }
            else {
                v20 = v19;
            }
            p0.p(false);
            O o4 = o2.d(new O(v20, 0L, null, null, 0L, 0, 0L, null, 0xFFFFFE));
            k00.getClass();
            p0.Q(0xAB206B03);
            MutableState mutableState1 = d.G(new v(k00.o), p0);
            p0.p(false);
            Modifier modifier1 = androidx.compose.foundation.a.b(modifier0, ((v)mutableState1.getValue()).a, s3);
            Q1 q10 = new Q1(z, z8, k5, k00, R1.d, R1.c);
            Modifier modifier2 = androidx.compose.foundation.layout.c.a(g0.a.b(modifier1, G0.j.e0, q10), R1.b, f2);
            p0.Q(0xA9C9582B);
            MutableState mutableState2 = d.G(new v((z8 ? k00.d : k00.c)), p0);
            p0.p(false);
            I.k.a(s, function10, modifier2, z, z7, o4, i02, h02, z9, v14, 0, k4, null, k5, new U(((v)mutableState2.getValue()).a), c0.c.c(1828307908, new Wa.l(s, z, z9, k4, k5, z8, function20, function27, function28, function29, k00, q02), p0), p0, v16 & 0xFC7E | 0x380000 & v15 << 12 | 0x1C00000 & v15 << 12 | 0xE000000 & v15 << 12 | v15 << 12 & 0x70000000, v15 & 0x70 | 0x30000 | v15 >> 9 & 0x1C00, 0x1400);
            z4 = z7;
            function24 = function27;
            function25 = function28;
            function26 = function29;
            z5 = z8;
            k2 = k4;
            i01 = i02;
            h01 = h02;
            z6 = z9;
            s2 = s3;
            v13 = v14;
            k3 = k5;
            q01 = q02;
            o1 = o2;
            f1 = f2;
        }
        else {
            p0.K();
            z4 = z1;
            o1 = o0;
            function24 = function21;
            function25 = function22;
            function26 = function23;
            z5 = z2;
            k2 = k0;
            i01 = i00;
            h01 = h00;
            z6 = z3;
            v13 = v;
            k3 = k1;
            s2 = s1;
            f1 = f;
            q01 = q00;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Wa.k(s, function10, modifier0, z, z4, o1, function20, function24, function25, function26, z5, k2, i01, h01, z6, v13, k3, s2, k00, f1, q01, v1, v2, v3, v4);
        }
    }

    // Deobfuscation rating: LOW(20)
    public static final Modifier g(Modifier modifier0, float f) {
        return f == 1.0f ? modifier0 : androidx.compose.ui.graphics.a.b(modifier0, 0.0f, 0.0f, f, 0.0f, 0.0f, null, true, 0x1EFFB);
    }

    public static final void h(Country country0, CustomerHomeFragment customerHomeFragment0) {
        Nb.j.f(customerHomeFragment0, "customerHomeFragment");
        String s = customerHomeFragment0.e.d;
        String s1 = country0.Y;
        if(!s1.equalsIgnoreCase(s)) {
            Map map0 = F.K(new Ab.k[]{new Ab.k("appCountry", s1), new Ab.k("walletCountry", s)});
            hb.n.d("App\'s country doesn\'t match wallet\'s country", i1.ERROR, map0, false, 8);
        }
    }

    public static boolean i(z1.d[] arr_d, z1.d[] arr_d1) {
        if(arr_d == null || arr_d1 == null || arr_d.length != arr_d1.length) {
            return false;
        }
        int v = 0;
        while(v < arr_d.length) {
            z1.d d0 = arr_d[v];
            int v1 = d0.a;
            z1.d d1 = arr_d1[v];
            if(v1 == d1.a && d0.b.length == d1.b.length) {
                ++v;
                continue;
            }
            return false;
        }
        return true;
    }

    public static float[] j(int v, float[] arr_f) {
        if(v < 0) {
            throw new IllegalArgumentException();
        }
        if(arr_f.length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        float[] arr_f1 = new float[v];
        System.arraycopy(arr_f, 0, arr_f1, 0, Math.min(v, arr_f.length));
        return arr_f1;
    }

    public static g k(g g0, g g1, Function2 function20) {
        Nb.j.f(function20, "<this>");
        if(function20 instanceof Fb.a) {
            return ((Fb.a)function20).t(g0, g1);
        }
        CoroutineContext coroutineContext0 = g1.a();
        return coroutineContext0 == kotlin.coroutines.j.X ? new Eb.b(g1, g0, function20) : new Eb.c(g1, coroutineContext0, function20, g0);
    }

    public static z1.d[] l(String s) {
        float[] arr_f1;
        ArrayList arrayList0 = new ArrayList();
        int v = 0;
        int v1 = 1;
        while(v1 < s.length()) {
            while(v1 < s.length()) {
                int v2 = s.charAt(v1);
                if(((v2 - 90) * (v2 - 65) <= 0 || (v2 - 0x7A) * (v2 - 97) <= 0) && v2 != 101 && v2 != 69) {
                    break;
                }
                ++v1;
            }
            String s1 = s.substring(v, v1).trim();
            if(!s1.isEmpty()) {
                if(s1.charAt(0) == 90 || s1.charAt(0) == 0x7A) {
                    arr_f1 = new float[0];
                }
                else {
                    try {
                        float[] arr_f = new float[s1.length()];
                        int v3 = s1.length();
                        int v4 = 0;
                        for(int v5 = 1; v5 < v3; v5 = z3 ? v6 : v6 + 1) {
                            boolean z = false;
                            boolean z1 = false;
                            boolean z2 = false;
                            boolean z3 = false;
                            int v6;
                            for(v6 = v5; v6 < s1.length(); ++v6) {
                                switch(s1.charAt(v6)) {
                                    case 0x20: 
                                    case 44: {
                                        z = false;
                                        z2 = true;
                                        break;
                                    }
                                    case 45: {
                                        if(v6 == v5 || z) {
                                            z = false;
                                            break;
                                        }
                                        z = false;
                                        z2 = true;
                                        z3 = true;
                                        break;
                                    }
                                    case 46: {
                                        if(!z1) {
                                            z = false;
                                            z1 = true;
                                            break;
                                        }
                                        z = false;
                                        z2 = true;
                                        z3 = true;
                                        break;
                                    }
                                    case 69: 
                                    case 101: {
                                        z = true;
                                        break;
                                    }
                                    default: {
                                        z = false;
                                    }
                                }
                                if(z2) {
                                    break;
                                }
                            }
                            if(v5 < v6) {
                                arr_f[v4] = Float.parseFloat(s1.substring(v5, v6));
                                ++v4;
                            }
                        }
                        arr_f1 = j.j(v4, arr_f);
                        goto label_57;
                    }
                    catch(NumberFormatException numberFormatException0) {
                    }
                    throw new RuntimeException(J.e("error in parsing \"", s1, "\""), numberFormatException0);
                }
            label_57:
                arrayList0.add(new z1.d(s1.charAt(0), arr_f1));
            }
            v = v1;
            ++v1;
        }
        if(v1 - v == 1 && v < s.length()) {
            arrayList0.add(new z1.d(s.charAt(v), new float[0]));
        }
        return (z1.d[])arrayList0.toArray(new z1.d[0]);
    }

    public static z1.d[] m(z1.d[] arr_d) {
        z1.d[] arr_d1 = new z1.d[arr_d.length];
        for(int v = 0; v < arr_d.length; ++v) {
            arr_d1[v] = new z1.d(arr_d[v]);
        }
        return arr_d1;
    }

    public static final void n(q q0, Ec.C c0) {
        try {
            List list0 = q0.d(c0);
        }
        catch(FileNotFoundException unused_ex) {
            return;
        }
        Throwable throwable0 = null;
        for(Object object0: list0) {
            Ec.C c1 = (Ec.C)object0;
            try {
                if(q0.e(c1).c) {
                    j.n(q0, c1);
                }
                q0.a(c1);
                continue;
            label_13:
                if(throwable0 == null) {
                    goto label_14;
                }
                continue;
            }
            catch(IOException iOException0) {
                goto label_13;
            }
        label_14:
            throwable0 = iOException0;
        }
        if(throwable0 != null) {
            throw throwable0;
        }
    }

    public static final boolean o(int v, int v1) [...] // Inlined contents

    public static void p() {
    }

    public static Date q() {
        return Calendar.getInstance(io.sentry.vendor.gson.internal.bind.util.a.a).getTime();
    }

    public static Date r(long v) {
        Calendar calendar0 = Calendar.getInstance(io.sentry.vendor.gson.internal.bind.util.a.a);
        calendar0.setTimeInMillis(v);
        return calendar0.getTime();
    }

    public static Date s(String s) {
        try {
            return io.sentry.vendor.gson.internal.bind.util.a.c(s, new ParsePosition(0));
        }
        catch(ParseException unused_ex) {
            throw new IllegalArgumentException("timestamp is not ISO format " + s);
        }
    }

    public static Date t(String s) {
        try {
            return j.r(new BigDecimal(s).setScale(3, RoundingMode.DOWN).movePointRight(3).longValue());
        }
        catch(NumberFormatException unused_ex) {
            throw new IllegalArgumentException("timestamp is not millis format " + s);
        }
    }

    public static String u(Date date0) {
        GregorianCalendar gregorianCalendar0 = new GregorianCalendar(io.sentry.vendor.gson.internal.bind.util.a.a, Locale.US);
        gregorianCalendar0.setTime(date0);
        StringBuilder stringBuilder0 = new StringBuilder(23 + (io.sentry.vendor.gson.internal.bind.util.a.a.getRawOffset() == 0 ? 1 : 6));
        io.sentry.vendor.gson.internal.bind.util.a.b(gregorianCalendar0.get(1), 4, stringBuilder0);
        int v = 45;
        stringBuilder0.append('-');
        io.sentry.vendor.gson.internal.bind.util.a.b(gregorianCalendar0.get(2) + 1, 2, stringBuilder0);
        stringBuilder0.append('-');
        io.sentry.vendor.gson.internal.bind.util.a.b(gregorianCalendar0.get(5), 2, stringBuilder0);
        stringBuilder0.append('T');
        io.sentry.vendor.gson.internal.bind.util.a.b(gregorianCalendar0.get(11), 2, stringBuilder0);
        stringBuilder0.append(':');
        io.sentry.vendor.gson.internal.bind.util.a.b(gregorianCalendar0.get(12), 2, stringBuilder0);
        stringBuilder0.append(':');
        io.sentry.vendor.gson.internal.bind.util.a.b(gregorianCalendar0.get(13), 2, stringBuilder0);
        stringBuilder0.append('.');
        io.sentry.vendor.gson.internal.bind.util.a.b(gregorianCalendar0.get(14), 3, stringBuilder0);
        int v1 = io.sentry.vendor.gson.internal.bind.util.a.a.getOffset(gregorianCalendar0.getTimeInMillis());
        if(v1 != 0) {
            int v2 = Math.abs(v1 / 60000 / 60);
            int v3 = Math.abs(v1 / 60000 % 60);
            if(v1 >= 0) {
                v = 43;
            }
            stringBuilder0.append(((char)v));
            io.sentry.vendor.gson.internal.bind.util.a.b(v2, 2, stringBuilder0);
            stringBuilder0.append(':');
            io.sentry.vendor.gson.internal.bind.util.a.b(v3, 2, stringBuilder0);
            return stringBuilder0.toString();
        }
        stringBuilder0.append('Z');
        return stringBuilder0.toString();
    }

    public static void v(String s, Exception exception0) {
        if(exception0 instanceof InvocationTargetException) {
            Throwable throwable0 = exception0.getCause();
            throw throwable0 instanceof RuntimeException ? ((RuntimeException)throwable0) : new RuntimeException(throwable0);
        }
        Log.v("Trace", "Unable to call " + s + " via reflection", exception0);
    }

    public static g w(g g0) {
        Nb.j.f(g0, "<this>");
        Fb.c c0 = g0 instanceof Fb.c ? ((Fb.c)g0) : null;
        if(c0 != null) {
            g0 = c0.Z;
            if(g0 == null) {
                kotlin.coroutines.i i0 = (kotlin.coroutines.i)c0.a().l(kotlin.coroutines.h.X);
                dc.h h0 = i0 == null ? c0 : new dc.h(((Xb.A)i0), c0);
                c0.Z = h0;
                return h0;
            }
        }
        return g0;
    }

    public static boolean x() {
        if(Build.VERSION.SDK_INT >= 29) {
            return A2.a.c();
        }
        try {
            Class class0 = Trace.class;
            if(j.b == null) {
                j.a = class0.getField("TRACE_TAG_APP").getLong(null);
                j.b = class0.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean)j.b.invoke(null, ((long)j.a))).booleanValue();
        }
        catch(Exception exception0) {
        }
        j.v("isTagEnabled", exception0);
        return false;
    }

    public static float y(float f, float f1, float f2) {
        return f2 * f1 + (1.0f - f2) * f;
    }

    public static String z(String s, String s1) {
        int v = s.length() - s1.length();
        if(v < 0 || v > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder stringBuilder0 = new StringBuilder(s1.length() + s.length());
        for(int v1 = 0; v1 < s.length(); ++v1) {
            stringBuilder0.append(s.charAt(v1));
            if(s1.length() > v1) {
                stringBuilder0.append(s1.charAt(v1));
            }
        }
        return stringBuilder0.toString();
    }
}

