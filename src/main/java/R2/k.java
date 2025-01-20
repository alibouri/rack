package R2;

import Ab.t;
import Bb.p;
import I3.g;
import I3.l;
import M8.a;
import O0.N;
import Q.C;
import Q0.e;
import T0.G;
import U.Z;
import U.d;
import U0.i;
import U0.j;
import Vb.q;
import X1.n;
import X1.u;
import X1.v;
import a5.w;
import ad.c;
import ad.x;
import ad.y;
import ad.z;
import android.database.sqlite.SQLiteDatabase;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import android.util.SparseArray;
import androidx.compose.ui.node.LayoutNode;
import androidx.work.impl.WorkDatabase_Impl;
import b4.A0;
import com.google.android.gms.internal.measurement.B;
import com.google.android.gms.internal.measurement.o;
import com.google.android.gms.measurement.internal.zzno;
import io.sentry.ILogger;
import io.sentry.N1;
import io.sentry.i1;
import io.sentry.y1;
import j6.C0;
import j6.L;
import j6.M;
import j6.d0;
import j6.s;
import j6.w0;
import java.io.IOException;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import o9.R1;
import pc.f;
import pc.r;

public final class k implements e, n, B, ILogger, f {
    public final int X;
    public Object Y;
    public Object Z;

    public k(int v) {
        this.X = v;
        switch(v) {
            case 9: {
                super();
                this.Y = new ArrayList();
                return;
            }
            case 15: {
                super();
                this.Y = new ArrayList();
                this.Z = new ArrayList();
                return;
            }
            case 17: {
                super();
                this.Y = d.D(Boolean.FALSE, Z.e);
                return;
            }
            default: {
                super();
                this.Y = new W.d(new LayoutNode[16]);
            }
        }
    }

    public k(int v, Object object0, Object object1, boolean z) {
        this.X = v;
        this.Z = object0;
        this.Y = object1;
        super();
    }

    public k(int v, k1.f f0) {
        this.X = 11;
        super();
        this.Y = f0;
        String s = "start";
        if(v != -2) {
            switch(v) {
                case -1: {
                    s = "end";
                    break;
                }
                case 0: {
                    s = "left";
                    break;
                }
                default: {
                    if(v == 1) {
                        s = "right";
                    }
                    else {
                        Log.e("CCL", "verticalAnchorIndexToAnchorName: Unknown vertical index");
                    }
                }
            }
        }
        this.Z = s;
    }

    public k(int v, boolean z) {
        this.X = v;
        super();
    }

    public k(a a0, int[] arr_v) {
        this.X = 5;
        super();
        if(arr_v.length == 0) {
            throw new IllegalArgumentException();
        }
        this.Y = a0;
        int v = 1;
        if(arr_v.length > 1 && arr_v[0] == 0) {
            while(v < arr_v.length && arr_v[v] == 0) {
                ++v;
            }
            if(v == arr_v.length) {
                this.Z = new int[]{0};
                return;
            }
            int v1 = arr_v.length - v;
            int[] arr_v1 = new int[v1];
            this.Z = arr_v1;
            System.arraycopy(arr_v, v, arr_v1, 0, v1);
            return;
        }
        this.Z = arr_v;
    }

    public k(WorkDatabase_Impl workDatabase_Impl0) {
        this.X = 0;
        super();
        this.Y = workDatabase_Impl0;
        this.Z = new b(workDatabase_Impl0, 3);
    }

    public k(ILogger iLogger0, N1 n10) {
        this.X = 13;
        super();
        LinkedBlockingDeque linkedBlockingDeque0 = new LinkedBlockingDeque();
        this.Y = linkedBlockingDeque0;
        w.e0(iLogger0, "logger is required");
        this.Z = iLogger0;
        linkedBlockingDeque0.push(n10);
    }

    public k(y1 y10, ILogger iLogger0) {
        this.X = 12;
        super();
        w.e0(y10, "SentryOptions is required.");
        this.Y = y10;
        this.Z = iLogger0;
    }

    public k(Object object0) {
        this.X = 17;
        this(17);
        this.Z = d.D(object0, Z.e);
        d.D(object0, Z.e);
    }

    public k(Object object0, int v, Object object1) {
        this.X = v;
        this.Y = object0;
        this.Z = object1;
        super();
    }

    public k(String s, android.support.v4.media.session.a a0, H6.e e0) {
        this.X = 4;
        super();
        this.Z = s;
        this.Y = a0;
    }

    public void A(Wc.d d0) {
        this.s(new ad.k(d0, false));
    }

    public static void B(int v, StringBuilder stringBuilder0) {
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            stringBuilder0.append('\uFFFD');
        }
    }

    public U0.B C(List list0) {
        N n0 = null;
        int v = list0.size();
        int v1 = 0;
        for(Object object0 = null; v1 < v; object0 = i0) {
            try {
                i i0 = (i)list0.get(v1);
                object0 = i0;
                i0.a(((j)this.Z));
                ++v1;
            }
            catch(Exception exception0) {
                StringBuilder stringBuilder0 = new StringBuilder();
                stringBuilder0.append("Error while applying EditCommand batch to buffer (length=" + ((j)this.Z).a.p() + ", composition=" + ((j)this.Z).c() + ", selection=" + N.g(O0.n.b(((j)this.Z).b, ((j)this.Z).c)) + "):");
                stringBuilder0.append('\n');
                p.u0(list0, stringBuilder0, new G(object0, 6, this), 60);
                String s = stringBuilder0.toString();
                Nb.j.e(s, "StringBuilder().apply(builderAction).toString()");
                throw new RuntimeException(s, exception0);
            }
        }
        j j0 = (j)this.Z;
        j0.getClass();
        O0.f f0 = new O0.f(6, j0.a.toString(), null);
        long v2 = O0.n.b(((j)this.Z).b, ((j)this.Z).c);
        N n1 = new N(v2);
        if(!N.f(((U0.B)this.Y).b)) {
            n0 = n1;
        }
        U0.B b0 = new U0.B(f0, (n0 == null ? O0.n.b(N.d(v2), N.e(v2)) : n0.a), ((j)this.Z).c());
        this.Y = b0;
        return b0;
    }

    public static boolean D(CharSequence charSequence0, int v, String s) {
        int v1 = s.length();
        if(charSequence0.length() - v < v1) {
            return false;
        }
        for(int v2 = 0; v2 < v1; ++v2) {
            if(charSequence0.charAt(v + v2) != s.charAt(v2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean E(CharSequence charSequence0, int v, String s) {
        int v1 = s.length();
        if(charSequence0.length() - v < v1) {
            return false;
        }
        for(int v2 = 0; v2 < v1; ++v2) {
            int v3 = charSequence0.charAt(v + v2);
            int v4 = s.charAt(v2);
            if(v3 != v4) {
                int v5 = Character.toUpperCase(((char)v3));
                int v6 = Character.toUpperCase(((char)v4));
                if(v5 != v6 && Character.toLowerCase(((char)v5)) != Character.toLowerCase(((char)v6))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void F(LayoutNode layoutNode0) {
        int v = 0;
        if(layoutNode0.v0.c != 5 || layoutNode0.v0.e || layoutNode0.v0.d || layoutNode0.E0 || !layoutNode0.F()) {
        label_35:
            layoutNode0.D0 = false;
            W.d d1 = layoutNode0.v();
            int v2 = d1.Z;
            if(v2 > 0) {
                Object[] arr_object = d1.X;
                while(true) {
                    k.F(((LayoutNode)arr_object[v]));
                    ++v;
                    if(v >= v2) {
                        break;
                    }
                }
            }
        }
        else {
            g0.n n0 = (g0.n)layoutNode0.u0.f;
            if((n0.b0 & 0x100) == 0) {
                goto label_35;
            }
            else {
                while(true) {
                    if(n0 == null) {
                        goto label_35;
                    }
                    if((n0.Z & 0x100) != 0) {
                        g0.n n1 = n0;
                        W.d d0 = null;
                        while(n1 != null) {
                            if(n1 instanceof F0.p) {
                                ((F0.p)n1).O(F0.f.t(((F0.p)n1), 0x100));
                            }
                            else if((n1.Z & 0x100) != 0 && n1 instanceof F0.n) {
                                g0.n n2 = ((F0.n)n1).m0;
                                int v1 = 0;
                                while(n2 != null) {
                                    if((n2.Z & 0x100) != 0) {
                                        ++v1;
                                        if(v1 == 1) {
                                            n1 = n2;
                                        }
                                        else {
                                            if(d0 == null) {
                                                d0 = new W.d(new g0.n[16]);
                                            }
                                            if(n1 != null) {
                                                d0.c(n1);
                                                n1 = null;
                                            }
                                            d0.c(n2);
                                        }
                                    }
                                    n2 = n2.d0;
                                }
                                if(v1 != 1) {
                                    goto label_30;
                                }
                                continue;
                            }
                        label_30:
                            n1 = F0.f.f(d0);
                        }
                    }
                    if((n0.b0 & 0x100) != 0) {
                        n0 = n0.d0;
                        continue;
                    }
                    goto label_35;
                }
            }
        }
    }

    public int G(int v) {
        if(v == 0) {
            return this.H(0);
        }
        a a0 = (a)this.Y;
        int[] arr_v = (int[])this.Z;
        if(v == 1) {
            int v3 = 0;
            for(int v1 = 0; v1 < arr_v.length; ++v1) {
                v3 = a0.a(v3, arr_v[v1]);
            }
            return v3;
        }
        int v4 = arr_v[0];
        for(int v2 = 1; v2 < arr_v.length; ++v2) {
            v4 = a0.a(a0.c(v, v4), arr_v[v2]);
        }
        return v4;
    }

    public int H(int v) {
        return ((int[])this.Z)[((int[])this.Z).length - 1 - v];
    }

    public int I() {
        return ((int[])this.Z).length - 1;
    }

    public Object J() {
        Object object0 = this.Z;
        if(object0 == null) {
            ArrayList arrayList0 = (ArrayList)this.Y;
            if(arrayList0.size() == 2) {
                Object object1 = arrayList0.get(0);
                Object object2 = arrayList0.get(1);
                if(object1 == null) {
                    object0 = object2;
                }
                else if(object1 == object2 || object2 == null) {
                    object0 = object1;
                }
            }
            if(object0 == null) {
                object0 = new ad.d(arrayList0);
            }
            this.Z = object0;
        }
        return object0;
    }

    public Object K(Tb.e e0, Object object0) {
        Nb.j.f(e0, "property");
        return this.Z;
    }

    public boolean L() {
        return ((int[])this.Z)[0] == 0;
    }

    public k M(int v) {
        a a0 = (a)this.Y;
        if(v == 0) {
            return a0.c;
        }
        if(v == 1) {
            return this;
        }
        int[] arr_v = (int[])this.Z;
        int[] arr_v1 = new int[arr_v.length];
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            arr_v1[v1] = a0.c(arr_v[v1], v);
        }
        return new k(a0, arr_v1);
    }

    public k N(k k0) {
        a a0 = (a)k0.Y;
        a a1 = (a)this.Y;
        if(!a1.equals(a0)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if(!this.L() && !k0.L()) {
            int[] arr_v = (int[])this.Z;
            int[] arr_v1 = (int[])k0.Z;
            int[] arr_v2 = new int[arr_v.length + arr_v1.length - 1];
            for(int v = 0; v < arr_v.length; ++v) {
                int v1 = arr_v[v];
                for(int v2 = 0; v2 < arr_v1.length; ++v2) {
                    arr_v2[v + v2] = a1.a(arr_v2[v + v2], a1.c(v1, arr_v1[v2]));
                }
            }
            return new k(a1, arr_v2);
        }
        return a1.c;
    }

    public void O(SQLiteDatabase sQLiteDatabase0) {
        g g0 = (g)this.Z;
        l l0 = g0.c;
        g g1 = (g)this.Y;
        l0.i0(sQLiteDatabase0, "store", "device_id", g1.g);
        g0.c.i0(sQLiteDatabase0, "store", "user_id", g1.f);
        g0.c.i0(sQLiteDatabase0, "long_store", "opt_out", ((long)(g1.i ? 1L : 0L)));
        g0.c.i0(sQLiteDatabase0, "long_store", "previous_session_id", ((long)g1.o));
        g0.c.i0(sQLiteDatabase0, "long_store", "last_event_time", ((long)g1.s));
    }

    public void P(Throwable throwable0) {
        int v;
        w0 w00 = (w0)this.Z;
        w00.q();
        w00.h0 = false;
        d0 d00 = (d0)w00.Y;
        if(!d00.e0.B(null, s.N0)) {
            w00.Q();
            w00.b().e0.b(throwable0, "registerTriggerAsync failed with throwable");
            return;
        }
        if(d00.e0.B(null, s.L0)) {
            String s = throwable0.getMessage();
            w00.l0 = false;
            if(s == null) {
                v = 2;
            }
            else if(throwable0 instanceof IllegalStateException || s.contains("garbage collected") || throwable0.getClass().getSimpleName().equals("ServiceUnavailableException")) {
                if(s.contains("Background")) {
                    w00.l0 = true;
                }
                v = 1;
            }
            else if(throwable0 instanceof SecurityException && !s.endsWith("READ_DEVICE_CONFIG")) {
                v = 3;
            }
            else {
                v = 2;
            }
        }
        else {
            v = 2;
        }
        zzno zzno0 = (zzno)this.Y;
        switch(v - 1) {
            case 0: {
                L l0 = w00.b();
                M m0 = L.u(d00.n().x());
                l0.h0.c(m0, "registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", L.u(throwable0.toString()));
                w00.i0 = 1;
                w00.L().add(zzno0);
                return;
            }
            case 1: {
                w00.L().add(zzno0);
                if(w00.i0 > 0x20) {
                    w00.i0 = 1;
                    L l1 = w00.b();
                    M m1 = L.u(d00.n().x());
                    l1.h0.c(m1, "registerTriggerAsync failed. May try later. App ID, throwable", L.u(throwable0.toString()));
                    return;
                }
                L l2 = w00.b();
                M m2 = L.u(d00.n().x());
                M m3 = L.u(String.valueOf(w00.i0));
                l2.h0.e("registerTriggerAsync failed. App ID, delay in seconds, throwable", m2, m3, L.u(throwable0.toString()));
                int v1 = w00.i0;
                if(w00.j0 == null) {
                    w00.j0 = new C0(w00, d00, 0);
                }
                w00.j0.b(((long)(v1 * 1000)));
                w00.i0 <<= 1;
                return;
            }
            case 2: {
                L l3 = w00.b();
                M m4 = L.u(d00.n().x());
                l3.e0.c(m4, "registerTriggerAsync failed. Dropping URI. App ID, Throwable", throwable0);
                SparseArray sparseArray0 = w00.o().z();
                sparseArray0.put(zzno0.Z, ((long)zzno0.Y));
                w00.o().u(sparseArray0);
                w00.i0 = 1;
                w00.Q();
            }
        }
    }

    public N1 Q() {
        return (N1)((LinkedBlockingDeque)this.Y).peek();
    }

    public void R(Tb.e e0, Object object0) {
        Nb.j.f(e0, "property");
        if(!Nb.j.a(this.Z, object0)) {
            this.Z = object0;
            ((R1)this.Y).invoke();
        }
    }

    public k S(k k0) {
        a a0;
        if(!((a)this.Y).equals(((a)k0.Y))) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if(k0.L()) {
            return this;
        }
        int[] arr_v = (int[])k0.Z;
        int[] arr_v1 = new int[arr_v.length];
        for(int v = 0; true; ++v) {
            a0 = (a)k0.Y;
            if(v >= arr_v.length) {
                break;
            }
            int v1 = arr_v[v];
            a0.getClass();
            arr_v1[v] = (929 - v1) % 929;
        }
        return this.n(new k(a0, arr_v1));
    }

    public ad.b T() {
        Object object0 = this.J();
        x x0 = null;
        z z0 = !(object0 instanceof z) || object0 instanceof ad.d && ((ad.d)object0).X == null ? null : ((z)object0);
        if(object0 instanceof x && (!(object0 instanceof ad.d) || ((ad.d)object0).Y != null)) {
            x0 = (x)object0;
        }
        if(z0 == null && x0 == null) {
            throw new UnsupportedOperationException("Both printing and parsing not supported");
        }
        return new ad.b(z0, x0);
    }

    public y U() {
        Object object0 = this.J();
        if(!(object0 instanceof x) || object0 instanceof ad.d && ((ad.d)object0).Y == null) {
            throw new UnsupportedOperationException("Parsing is not supported");
        }
        return y.a(((x)object0));
    }

    @Override  // X1.n
    public Object a() {
        return (X1.x)this.Y;
    }

    @Override  // Q0.e
    public int b(int v) {
        do {
            Lc.b b0 = (Lc.b)this.Z;
            b0.h(v);
            v = ((BreakIterator)b0.e).preceding(v);
            if(v == -1) {
                return -1;
            }
        }
        while(Character.isWhitespace(((CharSequence)this.Y).charAt(v)));
        return v;
    }

    @Override  // Q0.e
    public int c(int v) {
        do {
            Lc.b b0 = (Lc.b)this.Z;
            b0.h(v);
            v = ((BreakIterator)b0.e).following(v);
            if(v == -1) {
                return -1;
            }
        }
        while(Character.isWhitespace(((CharSequence)this.Y).charAt(v - 1)));
        return v;
    }

    @Override  // X1.n
    public boolean d(CharSequence charSequence0, int v, int v1, u u0) {
        if((u0.c & 4) > 0) {
            return true;
        }
        if(((X1.x)this.Y) == null) {
            Spannable spannable0 = charSequence0 instanceof Spannable ? ((Spannable)charSequence0) : new SpannableString(charSequence0);
            this.Y = new X1.x(spannable0);
        }
        ((v7.d)this.Z).getClass();
        v v2 = new v(u0);
        ((X1.x)this.Y).setSpan(v2, v, v1, 33);
        return true;
    }

    @Override  // Q0.e
    public int e(int v) {
        while(true) {
            Lc.b b0 = (Lc.b)this.Z;
            b0.h(v);
            v = ((BreakIterator)b0.e).following(v);
            if(v == -1) {
                break;
            }
            CharSequence charSequence0 = (CharSequence)this.Y;
            if(v == charSequence0.length()) {
                break;
            }
            if(!Character.isWhitespace(charSequence0.charAt(v))) {
                return v;
            }
        }
        return -1;
    }

    @Override  // Q0.e
    public int f(int v) {
        while(true) {
            Lc.b b0 = (Lc.b)this.Z;
            b0.h(v);
            v = ((BreakIterator)b0.e).preceding(v);
            if(v == -1 || v == 0) {
                break;
            }
            if(!Character.isWhitespace(((CharSequence)this.Y).charAt(v - 1))) {
                return v;
            }
        }
        return -1;
    }

    @Override  // pc.f
    public void g(pc.e e0, IOException iOException0) {
        Nb.j.f(e0, "call");
        ((Dc.g)this.Y).c(iOException0);
    }

    @Override  // io.sentry.ILogger
    public void h(i1 i10, String s, Object[] arr_object) {
        ILogger iLogger0 = (ILogger)this.Z;
        if(iLogger0 != null && this.j(i10)) {
            iLogger0.h(i10, s, arr_object);
        }
    }

    @Override  // com.google.android.gms.internal.measurement.B
    public h i(o o0) {
        h h0 = ((h)this.Y).e();
        String s = (String)this.Z;
        h0.k(s, o0);
        ((HashMap)h0.d).put(s, Boolean.TRUE);
        return h0;
    }

    // Deobfuscation rating: LOW(20)
    @Override  // io.sentry.ILogger
    public boolean j(i1 i10) {
        return i10 == null ? false : ((y1)this.Y).isDebug() && i10.ordinal() >= ((y1)this.Y).getDiagnosticLevel().ordinal();
    }

    @Override  // io.sentry.ILogger
    public void k(i1 i10, Throwable throwable0, String s, Object[] arr_object) {
        ILogger iLogger0 = (ILogger)this.Z;
        if(iLogger0 != null && this.j(i10)) {
            iLogger0.k(i10, throwable0, s, arr_object);
        }
    }

    @Override  // io.sentry.ILogger
    public void l(i1 i10, String s, Throwable throwable0) {
        ILogger iLogger0 = (ILogger)this.Z;
        if(iLogger0 != null && this.j(i10)) {
            iLogger0.l(i10, s, throwable0);
        }
    }

    @Override  // pc.f
    public void m(pc.e e0, pc.y y0) {
        String s2;
        Integer integer1;
        Integer integer0;
        boolean z3;
        boolean z2;
        boolean z1;
        boolean z;
        int v1;
        pc.p p0;
        uc.i i0;
        Nb.j.f(e0, "call");
        C c0 = y0.k0;
        try {
            ((Dc.g)this.Y).a(y0, c0);
            i0 = c0.j();
            p0 = y0.d0;
            int v = p0.size();
            v1 = 0;
            z = false;
            z1 = false;
            z2 = false;
            z3 = false;
            integer0 = null;
            integer1 = null;
        }
        catch(IOException iOException0) {
            ((Dc.g)this.Y).c(iOException0);
            rc.b.c(y0);
            if(c0 != null) {
                c0.a(true, true, null);
            }
            return;
        }
        while(v1 < v) {
            if(q.J(p0.d(v1), "Sec-WebSocket-Extensions")) {
                String s = p0.g(v1);
                int v2 = 0;
                while(v2 < s.length()) {
                    int v3 = rc.b.g(s, ',', v2, 0, 4);
                    int v4 = rc.b.f(s, ';', v2, v3);
                    int v5 = v4 + 1;
                    if(rc.b.z(v2, v4, s).equalsIgnoreCase("permessage-deflate")) {
                        if(z) {
                            z3 = true;
                        }
                        v2 = v5;
                        while(v2 < v3) {
                            int v6 = rc.b.f(s, ';', v2, v3);
                            int v7 = rc.b.f(s, '=', v2, v6);
                            String s1 = rc.b.z(v2, v7, s);
                            if(v7 < v6) {
                                s2 = rc.b.z(v7 + 1, v6, s);
                                if(s2.length() >= 2 && Vb.j.r0(s2, "\"") && Vb.j.U(s2, "\"")) {
                                    s2 = s2.substring(1, s2.length() - 1);
                                    Nb.j.e(s2, "substring(...)");
                                }
                            }
                            else {
                                s2 = null;
                            }
                            v2 = v6 + 1;
                            if(s1.equalsIgnoreCase("client_max_window_bits")) {
                                if(integer0 != null) {
                                    z3 = true;
                                }
                                integer0 = s2 == null ? null : q.P(s2);
                                if(integer0 != null) {
                                    continue;
                                }
                            }
                            else if(s1.equalsIgnoreCase("client_no_context_takeover")) {
                                if(z1) {
                                    z3 = true;
                                }
                                if(s2 != null) {
                                    z3 = true;
                                }
                                z1 = true;
                                continue;
                            }
                            else if(s1.equalsIgnoreCase("server_max_window_bits")) {
                                if(integer1 != null) {
                                    z3 = true;
                                }
                                integer1 = s2 == null ? null : q.P(s2);
                                if(integer1 != null) {
                                    continue;
                                }
                            }
                            else if(s1.equalsIgnoreCase("server_no_context_takeover")) {
                                if(z2) {
                                    z3 = true;
                                }
                                if(s2 != null) {
                                    z3 = true;
                                }
                                z2 = true;
                                continue;
                            }
                            z3 = true;
                        }
                        z = true;
                    }
                    else {
                        v2 = v5;
                        z3 = true;
                    }
                }
            }
            ++v1;
        }
        ((Dc.g)this.Y).d = new Dc.h(z, integer0, z1, integer1, z2, z3);
        if(z3 || integer0 != null) {
        label_84:
            Dc.g g0 = (Dc.g)this.Y;
            synchronized(g0) {
                g0.o.clear();
                g0.b(1010, "unexpected Sec-WebSocket-Extensions in response header");
            }
        }
        else if(integer1 != null) {
            int v8 = (int)integer1;
            if(8 > v8 || v8 > new Sb.d(8, 15, 1).Y) {  // initializer: LSb/b;-><init>(III)V
                goto label_84;
            }
        }
        try {
            ((Dc.g)this.Y).d(rc.b.g + " WebSocket " + ((r)((A0)this.Z).b).g(), i0);
            ((Xb.q)((Dc.g)this.Y).a.Y).b0(t.a);
            ((Dc.g)this.Y).e();
        }
        catch(Exception exception0) {
            ((Dc.g)this.Y).c(exception0);
        }
    }

    public k n(k k0) {
        a a0 = (a)k0.Y;
        a a1 = (a)this.Y;
        if(!a1.equals(a0)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if(this.L()) {
            return k0;
        }
        if(k0.L()) {
            return this;
        }
        int[] arr_v = (int[])this.Z;
        int[] arr_v1 = (int[])k0.Z;
        if(arr_v.length <= arr_v1.length) {
            int[] arr_v2 = arr_v;
            arr_v = arr_v1;
            arr_v1 = arr_v2;
        }
        int[] arr_v3 = new int[arr_v.length];
        int v = arr_v.length - arr_v1.length;
        System.arraycopy(arr_v, 0, arr_v3, 0, v);
        for(int v1 = v; v1 < arr_v.length; ++v1) {
            arr_v3[v1] = a1.a(arr_v1[v1 - v], arr_v[v1]);
        }
        return new k(a1, arr_v3);
    }

    public void o(String s, String s1) {
        Nb.j.f(s1, "value");
        ((ArrayList)this.Y).add(pc.b.c(s, 0, 0, " \"\':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, null, 91));
        ((ArrayList)this.Z).add(pc.b.c(s1, 0, 0, " \"\':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, null, 91));
    }

    public void p(ad.b b0) {
        if(b0 == null) {
            throw new IllegalArgumentException("No formatter supplied");
        }
        this.r(b0.a, b0.b);
    }

    public void q(y[] arr_y) {
        int v = 0;
        if(arr_y.length == 1) {
            y y0 = arr_y[0];
            if(y0 == null) {
                throw new IllegalArgumentException("No parser supplied");
            }
            this.r(null, ad.t.a(y0));
            return;
        }
        x[] arr_x = new x[arr_y.length];
        while(v < arr_y.length - 1) {
            x x0 = ad.t.a(arr_y[v]);
            arr_x[v] = x0;
            if(x0 == null) {
                throw new IllegalArgumentException("Incomplete parser array");
            }
            ++v;
        }
        arr_x[v] = ad.t.a(arr_y[v]);
        this.r(null, new ad.g(arr_x));
    }

    public void r(z z0, x x0) {
        this.Z = null;
        ArrayList arrayList0 = (ArrayList)this.Y;
        arrayList0.add(z0);
        arrayList0.add(x0);
    }

    public void s(Object object0) {
        this.Z = null;
        ArrayList arrayList0 = (ArrayList)this.Y;
        arrayList0.add(object0);
        arrayList0.add(object0);
    }

    public void t(Wc.d d0, int v, int v1) {
        if(d0 == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if(v1 < v) {
            v1 = v;
        }
        if(v < 0 || v1 <= 0) {
            throw new IllegalArgumentException();
        }
        if(v <= 1) {
            this.s(new ad.p(d0, v1, false));  // initializer: Lad/h;-><init>(LWc/d;IZ)V
            return;
        }
        this.s(new ad.i(d0, v1, false, v));
    }

    @Override
    public String toString() {
        if(this.X != 5) {
            return super.toString();
        }
        StringBuilder stringBuilder0 = new StringBuilder(this.I() * 8);
        for(int v = this.I(); v >= 0; --v) {
            int v1 = this.H(v);
            if(v1 != 0) {
                if(v1 < 0) {
                    stringBuilder0.append(" - ");
                    v1 = -v1;
                }
                else if(stringBuilder0.length() > 0) {
                    stringBuilder0.append(" + ");
                }
                if(v == 0 || v1 != 1) {
                    stringBuilder0.append(v1);
                }
                if(v != 0) {
                    if(v == 1) {
                        stringBuilder0.append('x');
                    }
                    else {
                        stringBuilder0.append("x^");
                        stringBuilder0.append(v);
                    }
                }
            }
        }
        return stringBuilder0.toString();
    }

    public void u(Wc.d d0, int v) {
        if(v <= 0) {
            throw new IllegalArgumentException("Illegal number of digits: " + v);
        }
        this.s(new ad.e(d0, v, false, v));  // initializer: Lad/i;-><init>(LWc/d;IZI)V
    }

    public void v(Wc.d d0, int v, int v1) {
        if(v1 < v) {
            v1 = v;
        }
        if(v < 0 || v1 <= 0) {
            throw new IllegalArgumentException();
        }
        this.s(new ad.f(d0, v, v1));
    }

    public void w(char c) {
        this.s(new c(c));
    }

    public void x(String s) {
        int v = s.length();
        if(v != 0) {
            if(v != 1) {
                this.s(new ad.j(s));
                return;
            }
            this.s(new c(s.charAt(0)));
        }
    }

    public void y(y y0) {
        if(y0 == null) {
            throw new IllegalArgumentException("No parser supplied");
        }
        this.r(null, new ad.g(new x[]{ad.t.a(y0), null}));
    }

    public void z(Wc.d d0, int v, int v1) {
        if(v1 < v) {
            v1 = v;
        }
        if(v < 0 || v1 <= 0) {
            throw new IllegalArgumentException();
        }
        if(v <= 1) {
            this.s(new ad.p(d0, v1, true));  // initializer: Lad/h;-><init>(LWc/d;IZ)V
            return;
        }
        this.s(new ad.i(d0, v1, true, v));
    }
}

