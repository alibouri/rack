package N4;

import Ab.t;
import B.h;
import B.v0;
import B.x0;
import B.z0;
import B.z;
import B3.d;
import Bb.n;
import Bb.r;
import D0.K;
import E7.C;
import Ea.m0;
import F.a;
import F.i;
import F0.c0;
import F0.f;
import F0.m;
import G1.j;
import I2.J;
import N.b1;
import N.m2;
import O0.O;
import T0.B;
import T0.E;
import T0.w;
import U.g0;
import U.l0;
import U.p;
import Vb.q;
import Wc.k;
import a9.a0;
import a9.l5;
import a9.m5;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.hardware.biometrics.BiometricPrompt.CryptoObject;
import android.os.Build.VERSION;
import android.security.identity.IdentityCredential;
import android.util.Log;
import android.view.View;
import androidx.compose.ui.Modifier;
import androidx.lifecycle.LifecycleOwner;
import com.sendwave.backend.fragment.BillFavoriteFragment;
import com.sendwave.backend.fragment.BillFieldsFragment;
import com.sendwave.backend.fragment.PayableWalletFragment;
import f9.I;
import io.sentry.ILogger;
import io.sentry.T0;
import io.sentry.h0;
import io.sentry.protocol.F;
import io.sentry.protocol.s;
import io.sentry.protocol.u;
import j3.g;
import java.io.File;
import java.io.InputStream;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m0.c;
import n0.M;
import n0.S;
import q8.b;
import r.x;
import t0.e;
import yc.l;

public abstract class o {
    public static e a;

    public o() {
        new ConcurrentHashMap();
    }

    public j A(j[] arr_j, int v) {
        new b(4);
        j j0 = null;
        int v1 = 0x7FFFFFFF;
        for(int v2 = 0; v2 < arr_j.length; ++v2) {
            j j1 = arr_j[v2];
            int v3 = Math.abs(j1.c - ((v & 1) == 0 ? 400 : 700)) * 2 + (j1.d == ((v & 2) != 0) ? 0 : 1);
            if(j0 == null || v1 > v3) {
                j0 = j1;
                v1 = v3;
            }
        }
        return j0;
    }

    public static d B(View view0) {
        return Build.VERSION.SDK_INT < 26 ? null : new d(4, J0.e.a(view0));
    }

    public static final ArrayList C(PayableWalletFragment payableWalletFragment0) {
        Nb.j.f(payableWalletFragment0, "<this>");
        ArrayList arrayList0 = new ArrayList(r.b0(payableWalletFragment0.i));
        for(Object object0: payableWalletFragment0.i) {
            arrayList0.add(((l5)object0).b);
        }
        return arrayList0;
    }

    public static final int D(Cursor cursor0, String s) {
        Nb.j.f(cursor0, "c");
        int v = cursor0.getColumnIndex(s);
        if(v >= 0) {
            return v;
        }
        int v1 = cursor0.getColumnIndex("`" + s + '`');
        if(v1 < 0) {
            if(Build.VERSION.SDK_INT <= 25 && s.length() != 0) {
                String[] arr_s = cursor0.getColumnNames();
                Nb.j.e(arr_s, "columnNames");
                int v2 = 0;
                for(int v3 = 0; v2 < arr_s.length; ++v3) {
                    String s1 = arr_s[v2];
                    if(s1.length() >= s.length() + 2 && (q.I(s1, "." + s, false) || s1.charAt(0) != 0x60 && q.I(s1, "." + s + '`', false))) {
                        return v3;
                    }
                    ++v2;
                }
            }
            return -1;
        }
        return v1;
    }

    public static final int E(Cursor cursor0, String s) {
        String s1;
        Nb.j.f(cursor0, "c");
        int v = o.D(cursor0, s);
        if(v >= 0) {
            return v;
        }
        try {
            String[] arr_s = cursor0.getColumnNames();
            Nb.j.e(arr_s, "c.columnNames");
            s1 = n.v0(arr_s);
        }
        catch(Exception exception0) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", exception0);
            s1 = "unknown";
        }
        throw new IllegalArgumentException("column \'" + s + "\' does not exist. Available columns: " + s1);
    }

    public static final Object F(m m0, c c0, Fb.c c1) {
        a a0;
        Object object0 = t.a;
        if(((g0.n)m0).X.k0) {
            c0 c00 = f.u(m0);
            if(((g0.n)m0).X.k0) {
                a a1 = (a)f.j(m0, i.n0);
                if(a1 == null) {
                    a1 = new F.j(m0);
                }
                a0 = a1;
            }
            else {
                a0 = null;
            }
            if(a0 != null) {
                Object object1 = a0.H(c00, new D.j(c0, 2, c00), c1);
                return object1 == Eb.a.X ? object1 : object0;
            }
        }
        return object0;
    }

    public static final ArrayList G(PayableWalletFragment payableWalletFragment0) {
        Nb.j.f(payableWalletFragment0, "<this>");
        ArrayList arrayList0 = new ArrayList(r.b0(payableWalletFragment0.f));
        for(Object object0: payableWalletFragment0.f) {
            arrayList0.add(((m5)object0).b);
        }
        ArrayList arrayList1 = o.z(arrayList0);
        ArrayList arrayList2 = new ArrayList(r.b0(arrayList1));
        for(Object object1: arrayList1) {
            arrayList2.add(((BillFieldsFragment)object1).b);
        }
        ArrayList arrayList3 = o.C(payableWalletFragment0);
        ArrayList arrayList4 = new ArrayList();
        Iterator iterator2 = arrayList3.iterator();
    label_17:
        while(iterator2.hasNext()) {
            Object object2 = iterator2.next();
            Iterable iterable0 = ((BillFavoriteFragment)object2).c;
            if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
                Iterator iterator3 = iterable0.iterator();
                do {
                    if(!iterator3.hasNext()) {
                        continue label_17;
                    }
                    Object object3 = iterator3.next();
                }
                while(!arrayList2.contains(((a0)object3).a));
                arrayList4.add(object2);
            }
        }
        return arrayList4;
    }

    public static final Object H(int v, Object object0, B b0, w w0, int v1) {
        int v2 = 1;
        if(!(object0 instanceof Typeface)) {
            return object0;
        }
        boolean z = (v == 1 || v == 2) && !Nb.j.a(b0.b, w0) && (w0.a(w.e0) >= 0 && Nb.j.h(b0.b.X, w.e0.X) < 0);
        boolean z1 = (v == 1 || v == 3) && v1 != b0.c;
        if(!z1 && !z) {
            return object0;
        }
        if(Build.VERSION.SDK_INT < 28) {
            boolean z2 = z1 && v1 == 1;
            if(z2 && z) {
                return Typeface.create(((Typeface)object0), 3);
            }
            if(!z) {
                if(z2) {
                    return Typeface.create(((Typeface)object0), 2);
                }
                v2 = 0;
            }
            return Typeface.create(((Typeface)object0), v2);
        }
        int v3 = z ? w0.X : b0.b.X;
        return z1 ? E.a.a(((Typeface)object0), v3, v1 == 1) : E.a.a(((Typeface)object0), v3, b0.c == 1);
    }

    public static final long I(int v, Wb.c c0) {
        Nb.j.f(c0, "unit");
        return c0.compareTo(Wb.c.b0) > 0 ? o.J(v, c0) : o.w(P4.c.q(v, c0, Wb.c.Y));
    }

    public static final long J(long v, Wb.c c0) {
        Nb.j.f(c0, "unit");
        Wb.c c1 = Wb.c.Y;
        long v1 = P4.c.q(0x3FFFFFFFFFFA14BFL, c1, c0);
        if(-v1 <= v && v <= v1) {
            return o.w(P4.c.q(v, c0, c1));
        }
        Nb.j.f(Wb.c.Z, "targetUnit");
        return o.u(J.t(Wb.c.Z.X.convert(v, c0.X), 0xC000000000000001L, 0x3FFFFFFFFFFFFFFFL));
    }

    public static final float K(l l0, g g0) {
        if(l0 instanceof j3.a) {
            return (float)((j3.a)l0).b;
        }
        switch(g0.ordinal()) {
            case 0: {
                return 1.401298E-45f;
            }
            case 1: {
                return 3.402823E+38f;
            }
            default: {
                throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
            }
        }
    }

    public static String L(int v) {
        switch(v) {
            case 1: {
                return "Clip";
            }
            case 2: {
                return "Ellipsis";
            }
            case 3: {
                return "Visible";
            }
            default: {
                return "Invalid";
            }
        }
    }

    public static final Wc.b M(long v, Wc.b b0) {
        Nb.j.f(b0, "now");
        k k0 = v == 0L ? k.Y : new k(U5.a.O(86400000, v));
        if(k0 != null) {
            long v1 = k0.X;
            if(Long.compare(v1, 0L) != 0) {
                long v2 = b0.X;
                ((Yc.c)b0.Y).getClass();
                b0 = b0.h(U5.a.N(v2, U5.a.O(1, v1)));
            }
        }
        return b0.i().j(Wc.i.Y);
    }

    public static BiometricPrompt.CryptoObject N(C c0) {
        if(c0 == null) {
            return null;
        }
        Cipher cipher0 = (Cipher)c0.Y;
        if(cipher0 != null) {
            return r.w.b(cipher0);
        }
        Signature signature0 = (Signature)c0.X;
        if(signature0 != null) {
            return r.w.a(signature0);
        }
        Mac mac0 = (Mac)c0.Z;
        if(mac0 != null) {
            return r.w.c(mac0);
        }
        if(Build.VERSION.SDK_INT >= 30) {
            IdentityCredential identityCredential0 = (IdentityCredential)c0.b0;
            return identityCredential0 == null ? null : x.a(identityCredential0);
        }
        return null;
    }

    public static int O(int v) {
        for(int v1 = 0; v1 < 6; ++v1) {
            int v2 = new int[]{1, 2, 3, 4, 5, 6}[v1];
            if(v2 == 0) {
                throw null;
            }
            if(v2 - 1 == v) {
                return v2;
            }
        }
        return 1;
    }

    public static final void a(Integer integer0, O0.f f0, O0.f f1, ab.i i0, Modifier modifier0, boolean z, Function0 function00, Function0 function01, p p0, int v) {
        Nb.j.f(i0, "style");
        p0.S(0x10ADEC7);
        int v1 = (v & 6) == 0 ? (p0.f(integer0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.f(f0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.f(f1) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (((v & 0x1000) == 0 ? p0.f(i0) : p0.h(i0)) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (p0.f(modifier0) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            v1 |= (p0.f(null) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v) == 0) {
            v1 |= (p0.g(z) ? 0x100000 : 0x80000);
        }
        if((0xC00000 & v) == 0) {
            v1 |= (p0.h(function00) ? 0x800000 : 0x400000);
        }
        if((0x6000000 & v) == 0) {
            v1 |= (p0.h(function01) ? 0x4000000 : 0x2000000);
        }
        if((v1 & 0x2492493) != 0x2492492 || !p0.x()) {
            Modifier modifier1 = g0.l.X;
            long v2 = i0.d(p0);
            if(function00 != null) {
                modifier1 = androidx.compose.foundation.a.d(modifier1, false, null, function00, 7);
            }
            J2.w.l(v2, modifier0.d(modifier1), null, true, c0.c.c(0x84D0FE07, new ab.d(integer0, f0, f1, i0, z, function01), p0), p0, 0x6C00, 4);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Qa.q(integer0, f0, f1, i0, modifier0, z, function00, function01, v, 2);
        }
    }

    public static final void b(Integer integer0, String s, String s1, ab.i i0, Modifier modifier0, boolean z, Function0 function00, Function0 function01, p p0, int v) {
        Function0 function03;
        Function0 function02;
        boolean z1;
        p0.S(-1490415123);
        int v1 = (v & 6) == 0 ? (p0.f(integer0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.f(s) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.f(s1) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (((v & 0x1000) == 0 ? p0.f(i0) : p0.h(i0)) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (p0.f(modifier0) ? 0x4000 : 0x2000);
        }
        if((0x2492493 & (v1 | 0x6DB0000)) != 0x2492492 || !p0.x()) {
            o.a(integer0, (s == null ? null : new O0.f(6, s, null)), (s1 == null ? null : new O0.f(6, s1, null)), i0, modifier0, true, null, null, p0, (v1 | 0x6DB0000) & 0xFFFFC0E);
            function02 = null;
            function03 = null;
            z1 = true;
        }
        else {
            p0.K();
            z1 = z;
            function02 = function00;
            function03 = function01;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Qa.q(integer0, s, s1, i0, modifier0, z1, function02, function03, v, 1);
        }
    }

    public static final void c(Integer integer0, O0.f f0, O0.f f1, O o0, ab.i i0, boolean z, Function0 function00, p p0, int v) {
        O o1;
        p p1;
        int v2;
        O o2;
        p0.S(0x4B264019);
        int v1 = (v & 6) == 0 ? (p0.f(integer0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.f(f0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.f(f1) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= 0x400;
        }
        if((v & 0x6000) == 0) {
            v1 |= (((0x8000 & v) == 0 ? p0.f(i0) : p0.h(i0)) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            v1 |= (p0.f(null) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v) == 0) {
            v1 |= (p0.g(z) ? 0x100000 : 0x80000);
        }
        if((0xC00000 & v) == 0) {
            v1 |= (p0.h(function00) ? 0x800000 : 0x400000);
        }
        if((0x492493 & v1) != 4793490 || !p0.x()) {
            p0.M();
            if((v & 1) == 0 || p0.w()) {
                v2 = v1 & 0xFFFFE3FF;
                o2 = ((db.a)p0.k(db.b.d)).e;
            }
            else {
                p0.K();
                o2 = o0;
                v2 = v1 & 0xFFFFE3FF;
            }
            p0.q();
            B.B b0 = z.a(new h(4.0f), g0.b.m, p0, 6);
            int v3 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier0 = g0.a.d(p0, g0.l.X);
            F0.k.a.getClass();
            F0.i i1 = F0.j.b;
            p0.U();
            if(p0.O) {
                p0.l(i1);
            }
            else {
                p0.d0();
            }
            U.d.K(p0, b0, F0.j.f);
            U.d.K(p0, g00, F0.j.e);
            F0.h h0 = F0.j.g;
            if(p0.O || !Nb.j.a(p0.G(), v3)) {
                m5.b.F(v3, p0, v3, h0);
            }
            U.d.K(p0, modifier0, F0.j.d);
            p0.Q(0xEB93C1C6);
            if(f0 != null) {
                o.e(integer0, f0, i0, z, function00, p0, v2 >> 6 & 0x380 | v2 & 0x7E | v2 >> 9 & 0x1C00 | v2 >> 9 & 0xE000);
            }
            p0.p(false);
            p0.Q(-342629803);
            if(f1 == null) {
                p1 = p0;
            }
            else {
                p1 = p0;
                o.d(integer0, f1, o2, i0, integer0 != null && f0 != null, function00 != null && f0 != null, true, z, function00, p0, v2 & 14 | v2 >> 3 & 0x70 | v2 >> 3 & 0x1C00 | 0x1C00000 & v2 << 3 | v2 << 3 & 0xE000000);
            }
            p1.p(false);
            p1.Q(0xEB941F60);
            p1.p(false);
            p1.p(true);
            o1 = o2;
        }
        else {
            p0.K();
            o1 = o0;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new ab.a(integer0, f0, f1, o1, i0, z, function00, v);
        }
    }

    public static final void d(Integer integer0, O0.f f0, O o0, ab.i i0, boolean z, boolean z1, boolean z2, boolean z3, Function0 function00, p p0, int v) {
        n0.n n1;
        F0.h h6;
        F0.i i2;
        g0.g g1;
        g0.f f2;
        g0.l l1;
        n0.p p2;
        F0.h h5;
        n0.n n0;
        F0.h h4;
        BlendModeColorFilter blendModeColorFilter0;
        z0 z01;
        p0.S(1046317840);
        int v1 = (v & 6) == 0 ? (p0.f(integer0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.f(f0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.f(o0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (((v & 0x1000) == 0 ? p0.f(i0) : p0.h(i0)) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (p0.g(z) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            v1 |= (p0.g(z1) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v) == 0) {
            v1 |= (p0.g(z2) ? 0x100000 : 0x80000);
        }
        if((0xC00000 & v) == 0) {
            v1 |= (p0.g(z3) ? 0x800000 : 0x400000);
        }
        if((0x6000000 & v) == 0) {
            v1 |= (p0.h(function00) ? 0x4000000 : 0x2000000);
        }
        if((0x2492493 & v1) != 0x2492492 || !p0.x()) {
            p0.M();
            if((v & 1) != 0 && !p0.w()) {
                p0.K();
            }
            p0.q();
            g0.f f1 = g0.b.j;
            g0.l l0 = g0.l.X;
            x0 x00 = v0.b(B.k.a, (z2 ? g0.b.k : f1), p0, 0);
            int v2 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier0 = g0.a.d(p0, l0);
            F0.k.a.getClass();
            F0.i i1 = F0.j.b;
            p0.U();
            if(p0.O) {
                p0.l(i1);
            }
            else {
                p0.d0();
            }
            F0.h h0 = F0.j.f;
            U.d.K(p0, x00, h0);
            F0.h h1 = F0.j.e;
            U.d.K(p0, g00, h1);
            F0.h h2 = F0.j.g;
            if(p0.O || !Nb.j.a(p0.G(), v2)) {
                m5.b.F(v2, p0, v2, h2);
            }
            F0.h h3 = F0.j.d;
            U.d.K(p0, modifier0, h3);
            z0 z00 = z0.a;
            p0.Q(0x69C81C3F);
            n0.p p1 = n0.p.a;
            g0.g g0 = g0.b.a;
            if(integer0 == null && !z) {
                z01 = z00;
                h5 = h1;
                p2 = p1;
                l1 = l0;
                g1 = g0;
                i2 = i1;
                h6 = h2;
                f2 = f1;
            }
            else {
                z01 = z00;
                Modifier modifier1 = androidx.compose.foundation.layout.c.k(l0, 24.0f);
                K k0 = B.r.e(g0, false);
                int v3 = p0.P;
                g0 g01 = p0.m();
                Modifier modifier2 = g0.a.d(p0, modifier1);
                p0.U();
                if(p0.O) {
                    p0.l(i1);
                }
                else {
                    p0.d0();
                }
                U.d.K(p0, k0, h0);
                U.d.K(p0, g01, h1);
                if(p0.O || !Nb.j.a(p0.G(), v3)) {
                    m5.b.F(v3, p0, v3, h2);
                }
                U.d.K(p0, modifier2, h3);
                p0.Q(0xB2C34F6A);
                if(integer0 == null || z) {
                    h5 = h1;
                    i2 = i1;
                    h6 = h2;
                    f2 = f1;
                    l1 = l0;
                    g1 = g0;
                    p2 = p1;
                }
                else {
                    s0.b b0 = l.y(((int)integer0), p0, v1 & 14);
                    p0.Q(-1295817490);
                    if(z3) {
                        long v4 = i0.a(p0);
                        if(Build.VERSION.SDK_INT >= 29) {
                            blendModeColorFilter0 = p1.a(v4, 5);
                            h4 = h1;
                        }
                        else {
                            h4 = h1;
                            blendModeColorFilter0 = new PorterDuffColorFilter(M.G(v4), M.J(5));
                        }
                        n0 = new n0.n(v4, 5, blendModeColorFilter0);
                    }
                    else {
                        h4 = h1;
                        n0 = null;
                    }
                    p0.p(false);
                    h5 = h4;
                    p2 = p1;
                    l1 = l0;
                    f2 = f1;
                    g1 = g0;
                    i2 = i1;
                    h6 = h2;
                    M6.b.d(b0, null, null, null, null, 0.0f, n0, p0, 0x30, 60);
                }
                p0.p(false);
                p0.p(true);
                B.e.b(p0, androidx.compose.foundation.layout.c.n(l1, 20.0f));
            }
            p0.p(false);
            long v5 = i0.b(p0);
            m2.c(f0, z01.a(l1, 1.0f, true), v5, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, o0, p0, v1 >> 3 & 14, v1 << 15 & 0x1C00000, 0x1FFF8);
            p0.Q(1774740258);
            if(function00 != null && !z1) {
                B.e.b(p0, androidx.compose.foundation.layout.c.n(l1, 20.0f));
                Modifier modifier3 = z01.b(androidx.compose.foundation.layout.c.k(l1, 24.0f), f2);
                K k1 = B.r.e(g1, false);
                int v6 = p0.P;
                g0 g02 = p0.m();
                Modifier modifier4 = g0.a.d(p0, modifier3);
                p0.U();
                if(p0.O) {
                    p0.l(i2);
                }
                else {
                    p0.d0();
                }
                U.d.K(p0, k1, h0);
                U.d.K(p0, g02, h5);
                if(p0.O || !Nb.j.a(p0.G(), v6)) {
                    m5.b.F(v6, p0, v6, h6);
                }
                U.d.K(p0, modifier4, h3);
                androidx.compose.foundation.layout.b b1 = androidx.compose.foundation.layout.b.a;
                s0.b b2 = l.y(0x7F080204, p0, 0);  // drawable:ic_cancel_grey_20
                p0.Q(0xB2C3B14E);
                if(z3) {
                    long v7 = i0.a(p0);
                    BlendModeColorFilter blendModeColorFilter1 = Build.VERSION.SDK_INT >= 29 ? p2.a(v7, 5) : new PorterDuffColorFilter(M.G(v7), M.J(5));
                    n1 = new n0.n(v7, 5, blendModeColorFilter1);
                }
                else {
                    n1 = null;
                }
                p0.p(false);
                M6.b.d(b2, null, androidx.compose.foundation.a.d(b1.a(l1, g0.b.e), false, null, function00, 7), null, null, 0.0f, n1, p0, 0x30, 56);
                p0.p(true);
            }
            p0.p(false);
            p0.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new ab.c(integer0, f0, o0, i0, z, z1, z2, z3, function00, v);
        }
    }

    public static final void e(Integer integer0, O0.f f0, ab.i i0, boolean z, Function0 function00, p p0, int v) {
        n0.n n1;
        g0.l l1;
        int v6;
        F0.h h7;
        F0.i i2;
        F0.h h6;
        z0 z01;
        F0.h h5;
        n0.p p3;
        g0.g g1;
        n0.n n0;
        F0.h h4;
        BlendModeColorFilter blendModeColorFilter0;
        n0.p p2;
        int v5;
        p0.S(0x75ACB5BB);
        int v1 = (v & 6) == 0 ? (p0.f(integer0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.f(f0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (((v & 0x200) == 0 ? p0.f(i0) : p0.h(i0)) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (p0.g(z) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (p0.h(function00) ? 0x4000 : 0x2000);
        }
        if((v1 & 9363) != 9362 || !p0.x()) {
            g0.l l0 = g0.l.X;
            x0 x00 = v0.b(B.k.a, g0.b.k, p0, 0x30);
            int v2 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier0 = g0.a.d(p0, l0);
            F0.k.a.getClass();
            F0.i i1 = F0.j.b;
            p0.U();
            if(p0.O) {
                p0.l(i1);
            }
            else {
                p0.d0();
            }
            F0.h h0 = F0.j.f;
            U.d.K(p0, x00, h0);
            F0.h h1 = F0.j.e;
            U.d.K(p0, g00, h1);
            F0.h h2 = F0.j.g;
            if(p0.O || !Nb.j.a(p0.G(), v2)) {
                m5.b.F(v2, p0, v2, h2);
            }
            F0.h h3 = F0.j.d;
            U.d.K(p0, modifier0, h3);
            p0.Q(0x14218D93);
            n0.p p1 = n0.p.a;
            g0.g g0 = g0.b.a;
            z0 z00 = z0.a;
            if(integer0 == null) {
                g1 = g0;
                p3 = p1;
                h5 = h2;
                h6 = h1;
                h7 = h0;
                i2 = i1;
                l1 = l0;
                z01 = z00;
                v6 = v1;
            }
            else {
                Modifier modifier1 = androidx.compose.foundation.layout.c.k(l0, 24.0f);
                K k0 = B.r.e(g0, false);
                int v3 = p0.P;
                g0 g01 = p0.m();
                Modifier modifier2 = g0.a.d(p0, modifier1);
                p0.U();
                if(p0.O) {
                    p0.l(i1);
                }
                else {
                    p0.d0();
                }
                U.d.K(p0, k0, h0);
                U.d.K(p0, g01, h1);
                if(p0.O || !Nb.j.a(p0.G(), v3)) {
                    m5.b.F(v3, p0, v3, h2);
                }
                U.d.K(p0, modifier2, h3);
                s0.b b0 = l.y(((int)integer0), p0, v1 & 14);
                p0.Q(1217320333);
                if(z) {
                    long v4 = i0.a(p0);
                    v5 = v1;
                    if(Build.VERSION.SDK_INT >= 29) {
                        p2 = p1;
                        blendModeColorFilter0 = p1.a(v4, 5);
                        h4 = h2;
                    }
                    else {
                        h4 = h2;
                        p2 = p1;
                        blendModeColorFilter0 = new PorterDuffColorFilter(M.G(v4), M.J(5));
                    }
                    n0 = new n0.n(v4, 5, blendModeColorFilter0);
                }
                else {
                    p2 = p1;
                    h4 = h2;
                    v5 = v1;
                    n0 = null;
                }
                p0.p(false);
                g1 = g0;
                p3 = p2;
                h5 = h4;
                z01 = z00;
                h6 = h1;
                i2 = i1;
                h7 = h0;
                v6 = v5;
                M6.b.d(b0, null, null, null, null, 0.0f, n0, p0, 0x30, 60);
                p0.p(true);
                l1 = l0;
                B.e.b(p0, androidx.compose.foundation.layout.c.n(l1, 20.0f));
            }
            p0.p(false);
            long v7 = i0.c(p0);
            O o0 = ((db.a)p0.k(db.b.d)).i;
            m2.c(f0, z01.a(l1, 1.0f, true), v7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, o0, p0, v6 >> 3 & 14, 0, 0x1FFF8);
            p0.Q(0x1421D170);
            if(function00 != null) {
                B.e.b(p0, androidx.compose.foundation.layout.c.n(l1, 20.0f));
                Modifier modifier3 = androidx.compose.foundation.layout.c.k(l1, 24.0f);
                K k1 = B.r.e(g1, false);
                int v8 = p0.P;
                g0 g02 = p0.m();
                Modifier modifier4 = g0.a.d(p0, modifier3);
                p0.U();
                if(p0.O) {
                    p0.l(i2);
                }
                else {
                    p0.d0();
                }
                U.d.K(p0, k1, h7);
                U.d.K(p0, g02, h6);
                if(p0.O || !Nb.j.a(p0.G(), v8)) {
                    m5.b.F(v8, p0, v8, h5);
                }
                U.d.K(p0, modifier4, h3);
                androidx.compose.foundation.layout.b b1 = androidx.compose.foundation.layout.b.a;
                s0.b b2 = l.y(0x7F080204, p0, 0);  // drawable:ic_cancel_grey_20
                p0.Q(1217340205);
                if(z) {
                    long v9 = i0.a(p0);
                    BlendModeColorFilter blendModeColorFilter1 = Build.VERSION.SDK_INT >= 29 ? p3.a(v9, 5) : new PorterDuffColorFilter(M.G(v9), M.J(5));
                    n1 = new n0.n(v9, 5, blendModeColorFilter1);
                }
                else {
                    n1 = null;
                }
                p0.p(false);
                M6.b.d(b2, null, androidx.compose.foundation.a.d(b1.a(l1, g0.b.e), false, null, function00, 7), null, null, 0.0f, n1, p0, 0x30, 56);
                p0.p(true);
            }
            p0.p(false);
            p0.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new ab.b(integer0, f0, i0, z, function00, v);
        }
    }

    public static final void f(int v, int v1, p p0, Modifier modifier0) {
        String s;
        p0.S(0xF5ADE398);
        int v2 = (v1 & 6) == 0 ? (p0.d(v) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (p0.f(modifier0) ? 0x20 : 16);
        }
        if((v2 & 19) != 18 || !p0.x()) {
            ab.g g0 = v == 2 ? ab.g.a : ab.e.a;
            if(v == 2) {
                p0.Q(0xBA2725D4);
                s = J2.w.S(0x7F120328, p0);  // string:personal_history_search_error_message "Wave is fixing a temporary issue. 
                                             // Your history may be out of date."
            }
            else {
                p0.Q(0xBA272FD6);
                s = J2.w.S(0x7F120329, p0);  // string:personal_history_search_offline_message "You are offline. Your history may 
                                             // be out of date."
            }
            p0.p(false);
            o.b(((int)(v == 2 ? 0x7F080254 : 0x7F0802B5)), null, s, g0, modifier0, false, null, null, p0, v2 << 9 & 0xE000 | 0x30);  // drawable:ic_maintenance_32dp
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Qa.o(v, v1, modifier0);
        }
    }

    public static final void g(Modifier modifier0, p p0, int v) {
        p0.S(0x4E781DAF);
        if((((v & 6) == 0 ? (p0.f(modifier0) ? 4 : 2) | v : v) & 3) != 2 || !p0.x()) {
            Modifier modifier1 = androidx.compose.foundation.layout.c.c(modifier0, 1.0f);
            K k0 = B.r.e(g0.b.e, false);
            int v1 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier2 = g0.a.d(p0, modifier1);
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
            F0.h h0 = F0.j.g;
            if(p0.O || !Nb.j.a(p0.G(), v1)) {
                m5.b.F(v1, p0, v1, h0);
            }
            U.d.K(p0, modifier2, F0.j.d);
            b1.b(null, 0L, 0.0f, 0L, 0, p0, 0, 0x1F);
            p0.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new m0(v, 5, modifier0);
        }
    }

    public static final void h(Object object0, Modifier modifier0, Function2 function20, c0.b b0, p p0, int v, int v1) {
        Modifier modifier1;
        Function2 function22;
        Function2 function21;
        p0.S(2058053906);
        int v2 = (v & 6) == 0 ? (((v & 8) == 0 ? p0.f(object0) : p0.h(object0)) ? 4 : 2) | v : v;
        int v3 = v2 | 0x30;
        if((v1 & 4) != 0) {
            v3 = v2 | 0x1B0;
            function21 = function20;
        }
        else if((v & 0x180) == 0) {
            function21 = function20;
            v3 |= (p0.h(function20) ? 0x100 : 0x80);
        }
        else {
            function21 = function20;
        }
        if((v & 0xC00) == 0) {
            v3 |= (p0.h(b0) ? 0x800 : 0x400);
        }
        if((v3 & 0x493) != 1170 || !p0.x()) {
            g0.l l0 = g0.l.X;
            if((v1 & 4) != 0) {
                function21 = c0.c.c(-42324670, new Aa.x(11, l0), p0);
            }
            if(object0 == null) {
                p0.Q(0x2D96EF31);
                function21.j(p0, ((int)(v3 >> 6 & 14)));
            }
            else {
                p0.Q(0x2D96F276);
                b0.h(object0, p0, ((int)(v3 >> 6 & 0x70 | v3 & 14)));
            }
            p0.p(false);
            function22 = function21;
            modifier1 = l0;
        }
        else {
            p0.K();
            function22 = function21;
            modifier1 = modifier0;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Fa.f(object0, modifier1, function22, b0, v, v1, 5);
        }
    }

    public static void i(w2.d d0, Object[] arr_object) {
        if(arr_object == null) {
            return;
        }
        int v = 0;
        while(v < arr_object.length) {
            Object object0 = arr_object[v];
            ++v;
            if(object0 == null) {
                d0.s(v);
            }
            else if(object0 instanceof byte[]) {
                d0.P(v, ((byte[])object0));
            }
            else if(object0 instanceof Float) {
                d0.u(v, ((double)((Number)object0).floatValue()));
            }
            else if(object0 instanceof Double) {
                d0.u(v, ((Number)object0).doubleValue());
            }
            else if(object0 instanceof Long) {
                d0.H(v, ((Number)object0).longValue());
            }
            else if(object0 instanceof Integer) {
                d0.H(v, ((long)((Number)object0).intValue()));
            }
            else if(object0 instanceof Short) {
                d0.H(v, ((long)((Number)object0).shortValue()));
            }
            else if(object0 instanceof Byte) {
                d0.H(v, ((long)((Number)object0).byteValue()));
            }
            else if(object0 instanceof String) {
                d0.c(v, ((String)object0));
            }
            else {
                if(!(object0 instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + object0 + " at index " + v + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                d0.H(v, (((Boolean)object0).booleanValue() ? 1L : 0L));
            }
        }
    }

    public static final Modifier j(Modifier modifier0, S s0) {
        return androidx.compose.ui.graphics.a.b(modifier0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, s0, true, 0x1E7FF);
    }

    public static final Modifier k(Modifier modifier0) {
        return androidx.compose.ui.graphics.a.b(modifier0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 0x1EFFF);
    }

    public static M6.e l(Context context0) {
        synchronized(M6.b.class) {
            if(M6.b.a == null) {
                Context context1 = context0.getApplicationContext();
                if(context1 != null) {
                    context0 = context1;
                }
                M6.b.a = new d(new B1.b(context0));
            }
        }
        return (M6.e)((N6.c)M6.b.a.Y).zza();
    }

    public abstract Typeface m(Context arg1, y1.e arg2, Resources arg3, int arg4);

    public abstract Typeface n(Context arg1, j[] arg2, int arg3);

    public Typeface o(Context context0, List list0, int v) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface p(Context context0, InputStream inputStream0) {
        File file0 = P4.c.K(context0);
        if(file0 == null) {
            return null;
        }
        try {
            return P4.c.t(file0, inputStream0) ? Typeface.createFromFile(file0.getPath()) : null;
        }
        catch(RuntimeException unused_ex) {
            return null;
        }
        finally {
            file0.delete();
        }
    }

    public Typeface q(Context context0, Resources resources0, int v, String s, int v1) {
        File file0 = P4.c.K(context0);
        if(file0 == null) {
            return null;
        }
        try {
            return P4.c.s(file0, resources0, v) ? Typeface.createFromFile(file0.getPath()) : null;
        }
        catch(RuntimeException unused_ex) {
            return null;
        }
        finally {
            file0.delete();
        }
    }

    public static boolean r(T0 t00, String s, h0 h00, ILogger iLogger0) {
        switch(s) {
            case "breadcrumbs": {
                t00.k0 = h00.F(iLogger0, new io.sentry.c(0));
                return true;
            }
            case "contexts": {
                io.sentry.protocol.c c0 = io.sentry.clientreport.a.c(h00, iLogger0);
                t00.Y.putAll(c0);
                return true;
            }
            case "debug_meta": {
                t00.l0 = (io.sentry.protocol.e)h00.U(iLogger0, new io.sentry.clientreport.a(8));
                return true;
            }
            case "dist": {
                t00.j0 = h00.V();
                return true;
            }
            case "environment": {
                t00.e0 = h00.V();
                return true;
            }
            case "event_id": {
                t00.X = (u)h00.U(iLogger0, new io.sentry.clientreport.a(22));
                return true;
            }
            case "extra": {
                t00.m0 = U5.a.H(((Map)h00.S()));
                return true;
            }
            case "platform": {
                t00.f0 = h00.V();
                return true;
            }
            case "release": {
                t00.d0 = h00.V();
                return true;
            }
            case "request": {
                t00.b0 = (io.sentry.protocol.o)h00.U(iLogger0, new io.sentry.clientreport.a(18));
                return true;
            }
            case "sdk": {
                t00.Z = (s)h00.U(iLogger0, new io.sentry.clientreport.a(20));
                return true;
            }
            case "server_name": {
                t00.i0 = h00.V();
                return true;
            }
            case "tags": {
                t00.c0 = U5.a.H(((Map)h00.S()));
                return true;
            }
            case "user": {
                t00.g0 = (F)h00.U(iLogger0, new io.sentry.protocol.E(0));
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static final int s(View view0, int v) {
        return (int)(((float)Math.ceil(((float)v) * view0.getResources().getDisplayMetrics().density)));
    }

    public static final I t(LifecycleOwner lifecycleOwner0) {
        Nb.j.f(lifecycleOwner0, "owner");
        return new I(0x7F0D0062, new Object(), lifecycleOwner0);  // layout:item_empty
    }

    public static final long u(long v) {
        return (v << 1) + 1L;
    }

    public static final long v(long v) {
        return -4611686018426L > v || v >= 4611686018427L ? o.u(J.t(v, 0xC000000000000001L, 0x3FFFFFFFFFFFFFFFL)) : v * 1000000L << 1;
    }

    public static final long w(long v) [...] // Inlined contents

    public static final boolean x(int v, int v1) [...] // Inlined contents

    public static final BillFieldsFragment y(PayableWalletFragment payableWalletFragment0, String s) {
        Nb.j.f(payableWalletFragment0, "<this>");
        ArrayList arrayList0 = new ArrayList(r.b0(payableWalletFragment0.f));
        for(Object object0: payableWalletFragment0.f) {
            arrayList0.add(((m5)object0).b);
        }
        for(Object object1: arrayList0) {
            BillFieldsFragment billFieldsFragment0 = (BillFieldsFragment)object1;
            if(billFieldsFragment0.b.equals(s)) {
                return billFieldsFragment0;
            }
            if(false) {
                break;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final ArrayList z(ArrayList arrayList0) {
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: arrayList0) {
            if(((BillFieldsFragment)object0).f) {
                arrayList1.add(object0);
            }
        }
        return arrayList1;
    }
}

