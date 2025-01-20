package W5;

import Aa.D;
import B.B;
import B.z;
import Bb.F;
import Bb.q;
import E7.w;
import Ea.e0;
import Ec.m;
import I2.A;
import J2.I;
import J2.u;
import L.b;
import M.J;
import M4.s;
import N.G;
import N.m2;
import Nb.j;
import O0.N;
import O0.O;
import O0.n;
import Ta.r;
import U.Z;
import U.g0;
import U.l0;
import U.p;
import Ub.i;
import a1.a;
import a8.Q;
import a9.j3;
import a9.k6;
import a9.p3;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.work.impl.WorkDatabase_Impl;
import com.apollographql.apollo.api.json.-JsonReaders;
import com.apollographql.apollo.api.json.BufferedSinkJsonWriter;
import com.apollographql.apollo.api.json.BufferedSourceJsonReader;
import com.apollographql.apollo.api.json.JsonNumber;
import com.apollographql.apollo.api.json.JsonWriter;
import com.drew.metadata.exif.makernotes.AppleRunTimeMakernoteDirectory;
import com.sendwave.backend.fragment.KycInfoFragment;
import com.sendwave.backend.type.KycFineGrainTier.KYC0;
import com.sendwave.backend.type.KycFineGrainTier.KYC0Applied;
import com.sendwave.backend.type.KycFineGrainTier.KYC1;
import com.sendwave.backend.type.KycFineGrainTier.KYC1Applied;
import com.sendwave.backend.type.KycFineGrainTier.KYC2;
import com.sendwave.backend.type.KycFineGrainTier.KYC2SoftRejected;
import com.sendwave.backend.type.KycFineGrainTier.UNKNOWN__;
import com.sendwave.backend.type.KycFineGrainTier;
import com.sendwave.backend.type.UserKycIdPhotoStatusRectangle.ERROR;
import com.sendwave.backend.type.UserKycIdPhotoStatusRectangle.INFO;
import com.sendwave.backend.type.UserKycIdPhotoStatusRectangle.WARNING;
import com.sendwave.backend.type.UserKycIdPhotoStatusRectangle;
import com.sendwave.util.Country;
import g1.k;
import io.sentry.android.core.H;
import io.sentry.x;
import java.io.IOException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import k1.c;
import k1.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import l4.l;
import m1.g;
import m1.h;
import n0.M;
import n0.v;
import q9.r1;
import ra.O0;
import v3.o;
import v7.d;

public abstract class f {
    public static ClassLoader a;
    public static Thread b;

    public static final boolean A(char c, char c1, boolean z) {
        if(c == c1) {
            return true;
        }
        if(!z) {
            return false;
        }
        int v = Character.toUpperCase(c);
        int v1 = Character.toUpperCase(c1);
        return v == v1 || Character.toLowerCase(((char)v)) == Character.toLowerCase(((char)v1));
    }

    public static b B(b b0, LayoutDirection layoutDirection0, O o0, Density density0, FontFamily.Resolver fontFamily$Resolver0) {
        if(b0 != null && layoutDirection0 == b0.a && j.a(o0, b0.b) && density0.getDensity() == b0.c.X && fontFamily$Resolver0 == b0.d) {
            return b0;
        }
        b b1 = b.h;
        if(b1 != null && layoutDirection0 == b1.a && j.a(o0, b1.b) && density0.getDensity() == b1.c.X && fontFamily$Resolver0 == b1.d) {
            return b1;
        }
        b b2 = new b(layoutDirection0, n.h(o0, layoutDirection0), new a1.b(density0.getDensity(), density0.n()), fontFamily$Resolver0);
        b.h = b2;
        return b2;
    }

    public static final SavedStateRegistryOwner C(View view0) {
        j.f(view0, "<this>");
        return (SavedStateRegistryOwner)i.T(i.X(i.U(view0, v2.f.Y), v2.f.Z));
    }

    public static final Locale D(Context context0) {
        Locale locale0;
        Configuration configuration0 = context0.getResources().getConfiguration();
        if(Build.VERSION.SDK_INT >= 24) {
            locale0 = F1.i.o(configuration0.getLocales());
            j.c(locale0);
            return locale0;
        }
        locale0 = configuration0.locale;
        j.c(locale0);
        return locale0;
    }

    public static Object E(x x0) {
        synchronized(x0) {
            return x0.a.get("sentry:typeCheckHint");
        }
    }

    public static boolean F(x x0, Class class0) {
        return class0.isInstance(f.E(x0));
    }

    // Deobfuscation rating: MEDIUM(80)
    public static boolean G(String s) {
        return !"Connection".equalsIgnoreCase(s) && !"Keep-Alive".equalsIgnoreCase(s) && !"Proxy-Authenticate".equalsIgnoreCase(s) && !"Proxy-Authorization".equalsIgnoreCase(s) && !"TE".equalsIgnoreCase(s) && !"Trailers".equalsIgnoreCase(s) && !"Transfer-Encoding".equalsIgnoreCase(s) && !"Upgrade".equalsIgnoreCase(s);
    }

    public static boolean H(x x0) {
        return Boolean.TRUE.equals(x0.b(Boolean.class, "sentry:isFromHybridSdk"));
    }

    public static final boolean I(long v, long v1) {
        return a.j(v) <= ((int)(v1 >> 0x20)) && ((int)(v1 >> 0x20)) <= a.h(v) && (a.i(v) <= ((int)(v1 & 0xFFFFFFFFL)) && ((int)(v1 & 0xFFFFFFFFL)) <= a.g(v));
    }

    // Deobfuscation rating: LOW(20)
    public static boolean J(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static final long K(int v, long v1, int v2) {
        int v3 = a.j(v1) + v;
        int v4 = 0;
        if(v3 < 0) {
            v3 = 0;
        }
        int v5 = a.h(v1);
        if(v5 != 0x7FFFFFFF) {
            v5 += v;
            if(v5 < 0) {
                v5 = 0;
            }
        }
        int v6 = a.i(v1) + v2 >= 0 ? a.i(v1) + v2 : 0;
        int v7 = a.g(v1);
        if(v7 != 0x7FFFFFFF) {
            int v8 = v7 + v2;
            if(v8 >= 0) {
                v4 = v8;
            }
            v7 = v4;
        }
        return f.b(v3, v5, v6, v7);
    }

    public static void L(int v, k k0, Q q0, k1.a a0) {
        String s1;
        h h0 = v == 0 ? ((h)k0.e(1)) : ((m1.i)k0.e(2));
        c c0 = a0.t(1);
        if(c0 instanceof k1.a && ((k1.a)c0).c0.size() >= 1) {
            for(int v1 = 0; v1 < ((k1.a)c0).c0.size(); ++v1) {
                h0.q(new Object[]{((k1.a)c0).B(v1)});
            }
            if(a0.c0.size() > 2) {
                c c1 = a0.t(2);
                if(!(c1 instanceof k1.f)) {
                    return;
                }
                for(Object object0: ((k1.f)c1).F()) {
                    String s = (String)object0;
                    s.getClass();
                    if(s.equals("style")) {
                        c c2 = ((k1.f)c1).u(s);
                        if(!(c2 instanceof k1.a) || ((k1.a)c2).c0.size() <= 1) {
                            s1 = c2.d();
                        }
                        else {
                            s1 = ((k1.a)c2).B(0);
                            h0.n0 = ((k1.a)c2).w(1);
                        }
                        s1.getClass();
                        if(s1.equals("packed")) {
                            h0.t0 = l1.i.Z;
                        }
                        else {
                            h0.t0 = s1.equals("spread_inside") ? l1.i.Y : l1.i.X;
                        }
                    }
                    else {
                        f.M(q0, k0, s, ((k1.f)c1), h0);
                    }
                }
            }
        }
    }

    public static void M(Q q0, k k0, String s, k1.f f0, l1.b b0) {
        l1.b b2;
        int v2;
        int v1;
        boolean z1;
        int v;
        float f5;
        float f3;
        boolean z = k0.b;
        c c0 = f0.A(s);
        String s1 = null;
        k1.a a0 = c0 instanceof k1.a ? ((k1.a)c0) : null;
        if(a0 != null && a0.c0.size() > 1) {
            String s2 = a0.B(0);
            c c1 = a0.z(1);
            if(c1 instanceof k1.h) {
                s1 = c1.d();
            }
            float f1 = 0.0f;
            if(a0.c0.size() > 2) {
                float f2 = q0.m(a0.z(2));
                f3 = k0.a.o(f2);
            }
            else {
                f3 = 0.0f;
            }
            if(a0.c0.size() > 3) {
                float f4 = q0.m(a0.z(3));
                f5 = k0.a.o(f4);
            }
            else {
                f5 = 0.0f;
            }
            l1.b b1 = s2.equals("parent") ? k0.b(0) : k0.b(s2);
            s.getClass();
            switch(s) {
                case "baseline": {
                    s1.getClass();
                    switch(s1) {
                        case "baseline": {
                            k0.a(b0.a);
                            k0.a(b1.a);
                            b0.j0 = 15;
                            b0.X = b1;
                            goto label_77;
                        }
                        case "bottom": {
                            k0.a(b0.a);
                            b0.j0 = 17;
                            b0.Z = b1;
                            goto label_77;
                        }
                        case "top": {
                            k0.a(b0.a);
                            b0.j0 = 16;
                            b0.Y = b1;
                            goto label_77;
                        }
                        default: {
                            goto label_77;
                        }
                    }
                }
                case "bottom": {
                    s1.getClass();
                    switch(s1) {
                        case "baseline": {
                            k0.a(b1.a);
                            b0.j0 = 14;
                            b0.W = b1;
                            goto label_77;
                        }
                        case "bottom": {
                            b0.e(b1);
                            goto label_77;
                        }
                        case "top": {
                            b0.j0 = 12;
                            b0.U = b1;
                            goto label_77;
                        }
                        default: {
                            goto label_77;
                        }
                    }
                }
                case "circular": {
                    float f6 = q0.m(a0.t(1));
                    if(a0.c0.size() > 2) {
                        float f7 = q0.m(a0.z(2));
                        f1 = k0.a.o(f7);
                    }
                    b0.a0 = b0.j(b1);
                    b0.b0 = f6;
                    b0.c0 = f1;
                    b0.j0 = 20;
                    v = 1;
                    z1 = false;
                    break;
                }
                case "end": {
                    v = !z;
                    z1 = true;
                    break;
                }
                case "left": {
                    v = 1;
                    z1 = true;
                    break;
                }
                case "right": {
                    v = 0;
                    z1 = true;
                    break;
                }
                case "start": {
                    v = z;
                    z1 = true;
                    break;
                }
                case "top": {
                    s1.getClass();
                    switch(s1) {
                        case "baseline": {
                            k0.a(b1.a);
                            b0.j0 = 11;
                            b0.T = b1;
                            break;
                        }
                        case "bottom": {
                            b0.j0 = 10;
                            b0.S = b1;
                            break;
                        }
                        case "top": {
                            b0.p(b1);
                        }
                    }
                label_77:
                    v = 1;
                    z1 = false;
                    break;
                }
                default: {
                    goto label_77;
                }
            }
            if(z1) {
                s1.getClass();
                switch(s1) {
                    case "end": {
                        v1 = !z;
                        break;
                    }
                    case "right": {
                        v1 = 0;
                        break;
                    }
                    case "start": {
                        v1 = z;
                        break;
                    }
                    default: {
                        v1 = 1;
                    }
                }
                if(v == 0) {
                    if(v1 == 0) {
                        b0.j0 = 4;
                        b0.M = b1;
                    }
                    else {
                        b0.j0 = 3;
                        b0.L = b1;
                    }
                }
                else if(v1 != 0) {
                    b0.j0 = 1;
                    b0.J = b1;
                }
                else {
                    b0.j0 = 2;
                    b0.K = b1;
                }
            }
            b0.l(f3).n(f5);
            return;
        }
        String s3 = f0.D(s);
        if(s3 != null) {
            if(s3.equals("parent")) {
                v2 = 0;
                b2 = k0.b(0);
            }
            else {
                v2 = 0;
                b2 = k0.b(s3);
            }
            s.getClass();
            switch(s) {
                case "baseline": {
                    break;
                }
                case "bottom": {
                    v2 = 1;
                    break;
                }
                case "end": {
                    v2 = 2;
                    break;
                }
                case "start": {
                    v2 = 4;
                    break;
                }
                case "top": {
                    v2 = 3;
                    break;
                }
                default: {
                    v2 = -1;
                }
            }
            switch(v2) {
                case 0: {
                    k0.a(b0.a);
                    k0.a(b2.a);
                    b0.j0 = 15;
                    b0.X = b2;
                    break;
                }
                case 1: {
                    b0.e(b2);
                    return;
                }
                case 2: {
                    if(z) {
                        b0.j0 = 4;
                        b0.M = b2;
                        return;
                    }
                    b0.j0 = 1;
                    b0.J = b2;
                    return;
                }
                case 3: {
                    b0.p(b2);
                    return;
                }
                case 4: {
                    if(z) {
                        b0.j0 = 1;
                        b0.J = b2;
                        return;
                    }
                    b0.j0 = 4;
                    b0.M = b2;
                }
            }
        }
    }

    public static l1.f N(k1.f f0, String s, k k0, w w0) {
        c c0 = f0.u(s);
        l1.f f1 = l1.f.b(0);
        if(c0 instanceof k1.h) {
            return f.O(c0.d());
        }
        if(c0 instanceof e) {
            return l1.f.b(k0.c(w0.o(f0.x(s))));
        }
        if(c0 instanceof k1.f) {
            String s1 = ((k1.f)c0).D("value");
            if(s1 != null) {
                f1 = f.O(s1);
            }
            c c1 = ((k1.f)c0).A("min");
            if(c1 != null) {
                if(c1 instanceof e) {
                    int v = k0.c(w0.o(((e)c1).e()));
                    if(v >= 0) {
                        f1.a = v;
                    }
                }
                else if(c1 instanceof k1.h) {
                    f1.a = -2;
                }
            }
            c c2 = ((k1.f)c0).A("max");
            if(c2 != null) {
                if(c2 instanceof e) {
                    int v1 = k0.c(w0.o(((e)c2).e()));
                    if(f1.b >= 0) {
                        f1.b = v1;
                        return f1;
                    }
                }
                else if(c2 instanceof k1.h) {
                    String s2 = l1.f.i;
                    if(f1.g) {
                        f1.f = s2;
                        f1.b = 0x7FFFFFFF;
                    }
                }
            }
        }
        return f1;
    }

    public static l1.f O(String s) {
        l1.f f0 = l1.f.b(0);
        s.getClass();
        String s1 = l1.f.j;
        String s2 = l1.f.i;
        switch(s) {
            case "parent": {
                return new l1.f(l1.f.k);
            }
            case "preferWrap": {
                return l1.f.c(s2);
            }
            case "spread": {
                return l1.f.c(s1);
            }
            case "wrap": {
                return new l1.f(s2);
            }
            default: {
                if(s.endsWith("%")) {
                    f0 = new l1.f(l1.f.l);
                    f0.c = Float.parseFloat(s.substring(0, s.indexOf(37))) / 100.0f;
                    f0.g = true;
                    f0.b = 0;
                    return f0;
                }
                if(s.contains(":")) {
                    f0 = new l1.f(l1.f.m);
                    f0.e = s;
                    f0.f = s1;
                    f0.g = true;
                    return f0;
                }
                return f0;
            }
        }
    }

    public static void P(int v, k k0, String s, k1.f f0) {
        ArrayList arrayList0 = f0.F();
        l1.b b0 = k0.b(s);
        if(v == 0) {
            k0.d(0, s);
        }
        else {
            k0.d(1, s);
        }
        int v1 = k0.b || v == 0 ? 1 : 0;
        g g0 = (g)b0.c;
        boolean z = false;
        int v2 = 1;
        float f1 = 0.0f;
        for(Object object0: arrayList0) {
            String s1 = (String)object0;
            s1.getClass();
            switch(s1) {
                case "end": {
                label_46:
                    float f3 = f0.x(s1);
                    f1 = k0.a.o(f3);
                    v2 = v1 ^ 1;
                    break;
                }
                case "left": {
                    float f4 = f0.x(s1);
                    f1 = k0.a.o(f4);
                    v2 = 1;
                    break;
                }
                case "percent": {
                    c c0 = f0.A(s1);
                    k1.a a0 = c0 instanceof k1.a ? ((k1.a)c0) : null;
                    if(a0 == null) {
                        f1 = f0.x(s1);
                        z = true;
                        v2 = 1;
                        continue;
                    }
                    else {
                        if(a0.c0.size() > 1) {
                            String s2 = a0.B(0);
                            float f2 = a0.w(1);
                            s2.getClass();
                            switch(s2) {
                                case "end": {
                                    v2 = v1 ^ 1;
                                    f1 = f2;
                                    break;
                                }
                                case "left": {
                                    f1 = f2;
                                    z = true;
                                    v2 = 1;
                                    continue;
                                }
                                case "right": {
                                    f1 = f2;
                                    v2 = 0;
                                    break;
                                }
                                case "start": {
                                    v2 = v1;
                                    f1 = f2;
                                    break;
                                }
                                default: {
                                    f1 = f2;
                                }
                            }
                        }
                        z = true;
                        break;
                    }
                    goto label_46;
                }
                case "right": {
                    float f5 = f0.x(s1);
                    f1 = k0.a.o(f5);
                    v2 = 0;
                    break;
                }
                case "start": {
                    float f6 = f0.x(s1);
                    f1 = k0.a.o(f6);
                    v2 = v1;
                }
            }
        }
        if(z) {
            if(v2 != 0) {
                g0.d = -1;
                g0.e = -1;
                g0.f = f1;
                return;
            }
            g0.d = -1;
            g0.e = -1;
            g0.f = 1.0f - f1;
            return;
        }
        if(v2 != 0) {
            g0.d = g0.a.c(f1);
            g0.e = -1;
            g0.f = 0.0f;
            return;
        }
        g0.d = -1;
        g0.e = g0.a.c(f1);
        g0.f = 0.0f;
    }

    public static void Q(k k0, Q q0, String s, k1.f f0) {
        l1.b b0 = k0.b(s);
        String s1 = l1.f.i;
        if(b0.d0 == null) {
            b0.d0 = new l1.f(s1);
        }
        if(b0.e0 == null) {
            b0.e0 = new l1.f(s1);
        }
        for(Object object0: f0.F()) {
            f.k(q0, k0, ((String)object0), f0, b0);
        }
    }

    public static String R(X509Certificate x509Certificate0) {
        j.f(x509Certificate0, "certificate");
        return "sha256/" + f.X(x509Certificate0).a();
    }

    public static void S(AppleRunTimeMakernoteDirectory appleRunTimeMakernoteDirectory0, byte[] arr_b) {
        if(arr_b.length < 8) {
            throw new IllegalArgumentException("Input is not a bplist");
        }
        for(int v = 0; v < 8; ++v) {
            if(arr_b[v] != H4.a.a[v]) {
                throw new IllegalArgumentException("Input is not a bplist");
            }
        }
        ArrayList arrayList0 = new ArrayList();
        l l0 = new l(arr_b.length - 0x20, arr_b);
        l0.D(5L);
        l0.D(1L);
        int v1 = l0.a();
        l0.a();
        long v2 = l0.k();
        long v3 = l0.k();
        l l1 = new l(((int)(l0.k() + v3)), arr_b);
        int[] arr_v = new int[((int)v2)];
        for(long v4 = 0L; Long.compare(v4, v2) < 0; ++v4) {
            if(v1 == 1) {
                arr_v[((int)v4)] = l1.a();
            }
            else if(v1 == 2) {
                arr_v[((int)v4)] = l1.x();
            }
        }
        int v5 = 0;
        while(v5 < ((int)v2)) {
            l l2 = new l(arr_v[v5], arr_b);
            int v6 = l2.a();
            int v7 = v6 >> 4 & 15;
            if(v7 == 1) {
                int v13 = (int)Math.pow(2.0, v6 & 15);
                if(v13 == 1) {
                    arrayList0.add(v5, l2.a());
                }
                else if(v13 == 2) {
                    arrayList0.add(v5, l2.x());
                }
                else if(v13 == 4) {
                    arrayList0.add(v5, l2.z());
                }
                else if(v13 == 8) {
                    arrayList0.add(v5, l2.k());
                }
            }
            else {
                switch(v7) {
                    case 4: {
                        int v8 = v6 & 15;
                        if(v8 == 15) {
                            int v9 = l2.a();
                            if((15 & v9 >> 4) != 1) {
                                throw new IllegalArgumentException("Invalid size marker");
                            }
                            int v10 = (int)Math.pow(2.0, v9 & 15);
                            if(v10 == 1) {
                                v8 = l2.a();
                            }
                            else if(v10 == 2) {
                                v8 = l2.x();
                            }
                        }
                        arrayList0.add(v5, l2.c(v8));
                        break;
                    }
                    case 13: {
                        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                        byte[] arr_b1 = new byte[v6 & 15];
                        for(int v11 = 0; v11 < (v6 & 15); ++v11) {
                            arr_b1[v11] = l2.a();
                        }
                        for(int v12 = 0; v12 < (v6 & 15); ++v12) {
                            linkedHashMap0.put(((byte)arr_b1[v12]), l2.a());
                        }
                        arrayList0.add(v5, linkedHashMap0);
                        break;
                    }
                    default: {
                        if(v7 != 5) {
                            throw new IOException("Un-handled objectFormat encountered");
                        }
                        arrayList0.add(v5, l2.s(v6 & 15));
                        break;
                    }
                }
            }
            ++v5;
            v3 = v3;
        }
        Object object0 = arrayList0.get(((int)v3));
        Set set0 = object0 instanceof Map ? ((Map)object0).entrySet() : null;
        if(set0 != null) {
            HashMap hashMap0 = new HashMap(set0.size());
            for(Object object1: set0) {
                hashMap0.put(((String)arrayList0.get(((byte)(((Byte)((Map.Entry)object1).getKey()))))), arrayList0.get(((byte)(((Byte)((Map.Entry)object1).getValue())))));
            }
            Object object2 = hashMap0.get("flags");
            if(object2 instanceof Byte) {
                int v14 = (byte)(((Byte)object2));
                if((v14 & 1) == 1) {
                    appleRunTimeMakernoteDirectory0.setInt(1, v14);
                    appleRunTimeMakernoteDirectory0.setInt(2, ((byte)(((Byte)hashMap0.get("epoch")))));
                    appleRunTimeMakernoteDirectory0.setLong(3, ((long)(((Long)hashMap0.get("timescale")))));
                    appleRunTimeMakernoteDirectory0.setLong(4, ((long)(((Long)hashMap0.get("value")))));
                }
            }
            else if(object2 instanceof String) {
                int v15 = Byte.parseByte(((String)object2));
                if((v15 & 1) == 1) {
                    appleRunTimeMakernoteDirectory0.setInt(1, v15);
                    appleRunTimeMakernoteDirectory0.setInt(2, Byte.parseByte(((String)hashMap0.get("epoch"))));
                    appleRunTimeMakernoteDirectory0.setLong(3, Long.parseLong(((String)hashMap0.get("timescale"))));
                    appleRunTimeMakernoteDirectory0.setLong(4, Long.parseLong(((String)hashMap0.get("value"))));
                }
            }
        }
    }

    public static String T(O3.l l0) {
        j.f(l0, "record");
        Ec.j j0 = new Ec.j();  // initializer: Ljava/lang/Object;-><init>()V
        Throwable throwable0 = null;
        BufferedSinkJsonWriter bufferedSinkJsonWriter0 = new BufferedSinkJsonWriter(j0, null, 2, null);
        try {
            bufferedSinkJsonWriter0.beginObject();
            for(Object object0: l0.Y.entrySet()) {
                String s = (String)((Map.Entry)object0).getKey();
                Object object1 = ((Map.Entry)object0).getValue();
                f.e0(bufferedSinkJsonWriter0.name(s), object1);
            }
            bufferedSinkJsonWriter0.endObject();
            goto label_21;
        }
        catch(Throwable throwable1) {
        }
        try {
            bufferedSinkJsonWriter0.close();
        }
        catch(Throwable throwable2) {
            U5.a.y(throwable1, throwable2);
        }
        throwable0 = throwable1;
        goto label_24;
        try {
        label_21:
            bufferedSinkJsonWriter0.close();
        }
        catch(Throwable throwable0) {
        }
    label_24:
        if(throwable0 != null) {
            throw throwable0;
        }
        return j0.B();
    }

    public static final void U(View view0, SavedStateRegistryOwner savedStateRegistryOwner0) {
        j.f(view0, "<this>");
        view0.setTag(0x7F0A0325, savedStateRegistryOwner0);  // id:view_tree_saved_state_registry_owner
    }

    public static int V(int v, int v1, int v2) {
        int v3 = 2;
        int[][] arr2_v = new int[14][6];
        arr2_v[0] = new int[]{0x20, 0x20, 0x20, 0x20, 0x20, 8};
        arr2_v[1] = new int[]{0x40, 0x30, 40, 0x40, 0x30, 16};
        arr2_v[2] = new int[]{0x60, 56, 0x30, 0x60, 56, 24};
        arr2_v[3] = new int[]{0x80, 0x40, 56, 0x80, 0x40, 0x20};
        arr2_v[4] = new int[]{0xA0, 80, 0x40, 0xA0, 80, 0x40};
        arr2_v[5] = new int[]{0xC0, 0x60, 80, 0xC0, 0x60, 80};
        arr2_v[6] = new int[]{0xE0, 0x70, 0x60, 0xE0, 0x70, 56};
        arr2_v[7] = new int[]{0x100, 0x80, 0x70, 0x100, 0x80, 0x40};
        arr2_v[8] = new int[]{0x120, 0xA0, 0x80, 28, 0xA0, 0x80};
        arr2_v[9] = new int[]{320, 0xC0, 0xA0, 320, 0xC0, 0xA0};
        arr2_v[10] = new int[]{0x160, 0xE0, 0xC0, 0x160, 0xE0, 0x70};
        arr2_v[11] = new int[]{0x180, 0x100, 0xE0, 0x180, 0x100, 0x80};
        arr2_v[12] = new int[]{0x1A0, 320, 0x100, 0x1A0, 320, 0x100};
        arr2_v[13] = new int[]{0x1C0, 0x180, 320, 0x1C0, 0x180, 320};
        if(v2 == 2) {
            switch(v1) {
                case 1: {
                    return arr2_v[v - 1][5];
                }
                case 2: {
                    return arr2_v[v - 1][4];
                }
                case 3: {
                    return arr2_v[v - 1][3];
                }
                default: {
                    return arr2_v[v - 1][0];
                }
            }
        }
        if(v2 == 1) {
            boolean z = false;
            if(v1 == 1) {
                z = true;
            }
            else if(v1 == 2) {
                z = true;
                v3 = 1;
            }
            if(z) {
                return arr2_v[v - 1][v3];
            }
        }
        return arr2_v[v - 1][0];
    }

    public static final void W(ContextWrapper contextWrapper0, String s, String s1) {
        Configuration configuration0 = contextWrapper0.getResources().getConfiguration();
        Locale locale0 = Locale.ROOT;
        j.e(locale0, "ROOT");
        String s2 = s1.toUpperCase(locale0);
        j.e(s2, "toUpperCase(...)");
        configuration0.setLocale(new Locale(s, s2));
        contextWrapper0.getResources().updateConfiguration(configuration0, contextWrapper0.getResources().getDisplayMetrics());
    }

    public static m X(X509Certificate x509Certificate0) {
        j.f(x509Certificate0, "<this>");
        byte[] arr_b = x509Certificate0.getPublicKey().getEncoded();
        j.e(arr_b, "publicKey.encoded");
        return d.u(arr_b).d("SHA-256");
    }

    public static boolean Y(x x0) {
        Object object0 = f.E(x0);
        if(!io.sentry.hints.d.class.isInstance(object0)) {
            Object object1 = f.E(x0);
            if(!io.sentry.hints.b.class.isInstance(object1)) {
                return true;
            }
        }
        Object object2 = f.E(x0);
        return H.class.isInstance(object2);
    }

    public static final O0 Z(KycInfoFragment kycInfoFragment0) {
        j.f(kycInfoFragment0, "<this>");
        p3 p30 = kycInfoFragment0.b;
        KycFineGrainTier kycFineGrainTier0 = p30.a;
        if(!(kycFineGrainTier0 instanceof KYC0) && !(kycFineGrainTier0 instanceof UNKNOWN__)) {
            if(kycFineGrainTier0 instanceof KYC1) {
                j3 j30 = p30.c.b.e;
                if(j30 != null) {
                    UserKycIdPhotoStatusRectangle userKycIdPhotoStatusRectangle0 = j30.d;
                    if(userKycIdPhotoStatusRectangle0 != null) {
                        if(userKycIdPhotoStatusRectangle0 instanceof WARNING || userKycIdPhotoStatusRectangle0 instanceof ERROR) {
                            return O0.Y;
                        }
                        else if(!(userKycIdPhotoStatusRectangle0 instanceof INFO) && !(userKycIdPhotoStatusRectangle0 instanceof com.sendwave.backend.type.UserKycIdPhotoStatusRectangle.UNKNOWN__)) {
                            throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                        }
                    }
                }
                return O0.X;
            }
            if(!(kycFineGrainTier0 instanceof KYC0Applied) && !(kycFineGrainTier0 instanceof KYC1Applied)) {
                if(kycFineGrainTier0 instanceof KYC2) {
                    return O0.Z;
                }
                if(!(kycFineGrainTier0 instanceof KYC2SoftRejected)) {
                    throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                }
                return O0.Z;
            }
            return O0.Y;
        }
        return O0.X;
    }

    public static final void a(int v, Modifier modifier0, Function0 function00, c0.b b0, p p0, int v1) {
        Modifier modifier1;
        p0.S(1702217675);
        int v2 = (v1 & 6) == 0 ? (p0.d(v) ? 4 : 2) | v1 : v1;
        int v3 = (v1 & 0x180) == 0 ? v2 | 0x30 | (p0.h(function00) ? 0x100 : 0x80) : v2 | 0x30;
        if((v1 & 0xC00) == 0) {
            v3 |= (p0.h(b0) ? 0x800 : 0x400);
        }
        if((v3 & 0x493) != 1170 || !p0.x()) {
            c0.b b1 = c0.c.c(1701431842, new Fa.l(v, 1, b0), p0);
            M6.b.l(function00, g0.l.X, false, b1, p0, v3 >> 6 & 14 | 0xC00 | v3 & 0x70, 4);
            modifier1 = g0.l.X;
        }
        else {
            p0.K();
            modifier1 = modifier0;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new da.f(v, modifier1, function00, b0, v1);
        }
    }

    public static int a0(int v) {
        return (int)(((long)Integer.rotateLeft(((int)(((long)v) * 0xFFFFFFFFCC9E2D51L)), 15)) * 461845907L);
    }

    public static final long b(int v, int v1, int v2, int v3) {
        boolean z = false;
        if(v1 >= v) {
            if(v3 >= v2) {
                if(v >= 0 && v2 >= 0) {
                    z = true;
                }
                if(z) {
                    return f.u(v, v1, v2, v3);
                }
                a5.w.k0(("minWidth(" + v + ") and minHeight(" + v2 + ") must be >= 0"));
                throw null;
            }
            a5.w.k0(("maxHeight(" + v3 + ") must be >= than minHeight(" + v2 + ')'));
            throw null;
        }
        a5.w.k0(("maxWidth(" + v1 + ") must be >= than minWidth(" + v + ')'));
        throw null;
    }

    public static final void b0(Object object0) {
        if(object0 instanceof Ab.m) {
            throw ((Ab.m)object0).X;
        }
    }

    public static long c(int v, int v1, int v2) {
        if((v2 & 2) != 0) {
            v = 0x7FFFFFFF;
        }
        if((v2 & 8) != 0) {
            v1 = 0x7FFFFFFF;
        }
        return f.b(0, v, 0, v1);
    }

    public static final void c0(ContextWrapper contextWrapper0) {
        Country country0 = r1.b(contextWrapper0).k();
        String s = f.D(contextWrapper0).getLanguage();
        j.e(s, "getLanguage(...)");
        f.W(contextWrapper0, s, country0.Y);
    }

    public static final void d(k6 k60, Function0 function00, Function0 function01, p p0, int v) {
        p0.S(0xC0FC376F);
        int v1 = (v & 6) == 0 ? (p0.f(k60) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.h(function00) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.h(function01) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) != 0x92 || !p0.x()) {
            N4.h.c("", k60 != null, function01, null, false, null, null, c0.c.c(0x94173E0B, new Aa.l(k60, function00, function01, 7), p0), p0, v1 & 0x380 | 0xC00006, 120);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new D(k60, function00, function01, v, 14);
        }
    }

    public static final long d0(long v, long v1) {
        int v2 = N.e(v);
        int v3 = N.d(v);
        if(N.e(v1) < N.d(v) && N.e(v) < N.d(v1)) {
            if(N.e(v1) <= N.e(v) && N.d(v) <= N.d(v1)) {
                v2 = N.e(v1);
                return n.b(v2, v2);
            }
            if(N.e(v) <= N.e(v1) && N.d(v1) <= N.d(v)) {
                return n.b(v2, v3 - N.c(v1));
            }
            return v2 >= N.d(v1) || N.e(v1) > v2 ? n.b(v2, N.e(v1)) : n.b(N.e(v1), v3 - N.c(v1));
        }
        return v3 <= N.e(v1) ? n.b(v2, v3) : n.b(v2 - N.c(v1), v3 - N.c(v1));
    }

    public static final void e(int v, int v1, p p0, String s, Function0 function00, Function0 function01) {
        Function0 function05;
        Function0 function04;
        Function0 function07;
        Function0 function06;
        Function0 function03;
        Function0 function02;
        p0.S(0xD0BFA367);
        int v2 = (v & 6) == 0 ? (p0.f(s) ? 4 : 2) | v : v;
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            function02 = function00;
        }
        else if((v & 0x30) == 0) {
            function02 = function00;
            v2 |= (p0.h(function02) ? 0x20 : 16);
        }
        else {
            function02 = function00;
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            function03 = function01;
        }
        else if((v & 0x180) == 0) {
            function03 = function01;
            v2 |= (p0.h(function03) ? 0x100 : 0x80);
        }
        else {
            function03 = function01;
        }
        if((v2 & 0x93) != 0x92 || !p0.x()) {
            Z z0 = U.l.a;
            if((v1 & 2) == 0) {
                function06 = function02;
            }
            else {
                p0.Q(2017520109);
                Object object0 = p0.G();
                if(object0 == z0) {
                    object0 = new e0(13);
                    p0.a0(object0);
                }
                p0.p(false);
                function06 = (Function0)object0;
            }
            if((v1 & 4) == 0) {
                function07 = function03;
            }
            else {
                p0.Q(2017521101);
                Object object1 = p0.G();
                if(object1 == z0) {
                    object1 = new e0(13);
                    p0.a0(object1);
                }
                function07 = (Function0)object1;
                p0.p(false);
            }
            B.h h0 = new B.h(16.0f);
            g0.l l0 = g0.l.X;
            Modifier modifier0 = androidx.compose.foundation.layout.a.n(androidx.compose.foundation.layout.a.l(l0, 20.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 32.0f, 7);
            B b0 = z.a(h0, g0.b.n, p0, 54);
            int v3 = p0.P;
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
            U.d.K(p0, b0, F0.j.f);
            U.d.K(p0, g00, F0.j.e);
            F0.h h1 = F0.j.g;
            if(p0.O || !j.a(p0.G(), v3)) {
                m5.b.F(v3, p0, v3, h1);
            }
            U.d.K(p0, modifier1, F0.j.d);
            F.d(new o("device_transfer.lottie"), androidx.compose.foundation.layout.a.n(androidx.compose.foundation.layout.c.l(l0, 180.0f, 120.0f), 0.0f, 0.0f, 0.0f, 12.0f, 7), !s.equals(""), p0, 54, 0);
            String s1 = J2.w.S(0x7F12012A, p0);  // string:device_approval_transfer_device "Did you request to transfer your Wave account 
                                                 // to a new device?"
            O o0 = ((db.a)p0.k(db.b.d)).n;
            m2.b(s1, null, 0L, 0L, null, null, null, 0L, null, new Z0.i(3), 0L, 0, false, 0, 0, null, o0, p0, 0, 0, 0xFDFE);
            String s2 = J2.w.T(0x7F120125, new Object[]{s}, p0);  // string:device_approval_new_device "You will be logged out of this device and connected 
                                                                  // to the new device “%1$s”."
            O o1 = ((db.a)p0.k(db.b.d)).h;
            m2.b(s2, null, 0L, 0L, null, null, null, 0L, null, new Z0.i(3), 0L, 0, false, 0, 0, null, o1, p0, 0, 0, 0xFDFE);
            String s3 = J2.w.S(0x7F12012E, p0);  // string:device_approval_wave_will_never "Wave staff will NEVER ask you to do this."
            O o2 = ((db.a)p0.k(db.b.d)).h;
            m2.b(s3, null, 0L, 0L, null, null, null, 0L, null, new Z0.i(3), 0L, 0, false, 0, 0, null, o2, p0, 0, 0, 0xFDFE);
            f.a(0x7F120126, null, function06, da.d.a, p0, v2 << 3 & 0x380 | 0xC00);  // string:device_approval_ok "Yes, this was me"
            f.a(0x7F120121, null, function07, da.d.b, p0, v2 & 0x380 | 0xC00);  // string:device_approval_cancel "No, this wasn\'t me"
            p0.p(true);
            function05 = function07;
            function04 = function06;
        }
        else {
            p0.K();
            function04 = function02;
            function05 = function03;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new r(s, function04, function05, v, v1);
        }
    }

    public static void e0(JsonWriter jsonWriter0, Object object0) {
        if(object0 == null) {
            jsonWriter0.nullValue();
            return;
        }
        if(object0 instanceof String) {
            jsonWriter0.value(((String)object0));
            return;
        }
        if(object0 instanceof Boolean) {
            jsonWriter0.value(((Boolean)object0).booleanValue());
            return;
        }
        if(object0 instanceof Integer) {
            jsonWriter0.value(((Number)object0).intValue());
            return;
        }
        if(object0 instanceof Long) {
            jsonWriter0.value(((Number)object0).longValue());
            return;
        }
        if(object0 instanceof Double) {
            jsonWriter0.value(((Number)object0).doubleValue());
            return;
        }
        if(object0 instanceof JsonNumber) {
            jsonWriter0.value(((JsonNumber)object0));
            return;
        }
        if(object0 instanceof O3.b) {
            jsonWriter0.value("ApolloCacheReference{" + ((O3.b)object0).a + '}');
            return;
        }
        if(object0 instanceof List) {
            jsonWriter0.beginArray();
            for(Object object1: ((Iterable)object0)) {
                f.e0(jsonWriter0, object1);
            }
            jsonWriter0.endArray();
            return;
        }
        if(!(object0 instanceof Map)) {
            throw new IllegalStateException(("Unsupported record value type: \'" + object0 + '\'').toString());
        }
        jsonWriter0.beginObject();
        for(Object object2: ((Map)object0).entrySet()) {
            f.e0(jsonWriter0.name(((String)((Map.Entry)object2).getKey())), ((Map.Entry)object2).getValue());
        }
        jsonWriter0.endObject();
    }

    public static final long f(int v) {
        return ((long)v) << 0x20;
    }

    public static ClassLoader f0() {
        Ec.c c0;
        SecurityException securityException1;
        Thread thread2;
        Thread thread1;
        ThreadGroup threadGroup1;
        synchronized(f.class) {
            if(f.a == null) {
                Thread thread0 = f.b;
                ClassLoader classLoader0 = null;
                if(thread0 == null) {
                    ThreadGroup threadGroup0 = Looper.getMainLooper().getThread().getThreadGroup();
                    if(threadGroup0 == null) {
                        thread0 = null;
                    }
                    else {
                        Class class1 = Void.class;
                        synchronized(class1) {
                            try {
                                threadGroup1 = null;
                                int v2 = threadGroup0.activeGroupCount();
                                ThreadGroup[] arr_threadGroup = new ThreadGroup[v2];
                                threadGroup0.enumerate(arr_threadGroup);
                                int v3 = 0;
                                for(int v4 = 0; v4 < v2; ++v4) {
                                    ThreadGroup threadGroup2 = arr_threadGroup[v4];
                                    if("dynamiteLoader".equals(threadGroup2.getName())) {
                                        threadGroup1 = threadGroup2;
                                        break;
                                    }
                                }
                                if(threadGroup1 == null) {
                                    threadGroup1 = new ThreadGroup(threadGroup0, "dynamiteLoader");
                                }
                                thread1 = null;
                                int v5 = threadGroup1.activeCount();
                                Thread[] arr_thread = new Thread[v5];
                                threadGroup1.enumerate(arr_thread);
                                while(true) {
                                    if(v3 >= v5) {
                                        goto label_41;
                                    }
                                    thread2 = arr_thread[v3];
                                    if("GmsDynamite".equals(thread2.getName())) {
                                        break;
                                    }
                                    ++v3;
                                }
                            }
                            catch(SecurityException securityException0) {
                                securityException1 = securityException0;
                                goto label_53;
                            }
                        }
                        thread1 = thread2;
                    label_41:
                        if(thread1 == null) {
                            try {
                                c0 = new Ec.c(threadGroup1, "GmsDynamite");
                            }
                            catch(SecurityException securityException2) {
                                securityException1 = securityException2;
                                goto label_53;
                            }
                            try {
                                c0.setContextClassLoader(null);
                                thread1 = c0;
                                c0.start();
                                thread1 = c0;
                                goto label_54;
                            }
                            catch(SecurityException securityException1) {
                            }
                        label_53:
                            Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + securityException1.getMessage());
                        }
                    label_54:
                        thread0 = thread1;
                    }
                    f.b = thread0;
                    if(thread0 != null) {
                        __monitor_enter(thread0);
                        goto label_63;
                    }
                }
                else {
                    synchronized(thread0) {
                        try {
                        label_63:
                            classLoader0 = f.b.getContextClassLoader();
                        }
                        catch(SecurityException securityException3) {
                            Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + securityException3.getMessage());
                        }
                    }
                    __monitor_exit(thread0);
                }
                f.a = classLoader0;
            }
            return f.a;
        }
    }

    public static final void g(String s, long v, p p0, int v1, int v2) {
        int v5;
        long v4;
        j.f(s, "titleText");
        p0.S(0xCEC52F2C);
        int v3 = (v1 & 6) == 0 ? v1 | (p0.f(s) ? 4 : 2) : v1;
        if((v1 & 0x30) == 0) {
            if((v2 & 2) == 0) {
                v4 = v;
                v5 = p0.e(v4) ? 0x20 : 16;
            }
            else {
                v4 = v;
                v5 = 16;
            }
            v3 |= v5;
        }
        else {
            v4 = v;
        }
        if((v3 & 19) != 18 || !p0.x()) {
            p0.M();
            if((v1 & 1) != 0 && !p0.w()) {
                p0.K();
                if((v2 & 2) != 0) {
                    v3 &= 0xFFFFFF8F;
                }
            }
            else if((v2 & 2) != 0) {
                v4 = yc.d.h(0x7F060002, p0);  // color:BgGray100
                v3 &= 0xFFFFFF8F;
            }
            p0.q();
            G.b(null, v4, 0L, 0.0f, null, c0.c.c(0xD3D0D85B, new bb.l(s, 0), p0), p0, v3 & 0x70 | 0x30C00, 21);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new bb.k(v1, v2, v4, s);
        }
    }

    public static final void h(String s, long v, long v1, Function0 function00, int v2, float f, Function3 function30, p p0, int v3, int v4) {
        float f1;
        int v10;
        long v9;
        Function3 function32;
        long v13;
        float f2;
        int v12;
        int v11;
        Function3 function31;
        long v7;
        long v6;
        j.f(s, "titleText");
        p0.S(-992509298);
        int v5 = (v3 & 6) == 0 ? (p0.f(s) ? 4 : 2) | v3 : v3;
        if((v4 & 2) == 0) {
            v6 = v;
            if((v3 & 0x30) == 0) {
                v5 |= (p0.e(v6) ? 0x20 : 16);
            }
        }
        else {
            v5 |= 0x30;
            v6 = v;
        }
        if((v3 & 0x180) == 0) {
            v7 = v1;
            v5 |= ((v4 & 4) != 0 || !p0.e(v7) ? 0x80 : 0x100);
        }
        else {
            v7 = v1;
        }
        if((v3 & 0xC00) == 0) {
            v5 |= (p0.h(function00) ? 0x800 : 0x400);
        }
        if((v3 & 0x6000) == 0) {
            v5 |= 0x2000;
        }
        int v8 = 0x30000 | v5;
        if((v4 & 0x40) != 0) {
            v8 = 0x1B0000 | v5;
            function31 = function30;
        }
        else if((0x180000 & v3) == 0) {
            function31 = function30;
            v8 |= (p0.h(function31) ? 0x100000 : 0x80000);
        }
        else {
            function31 = function30;
        }
        if((0x92493 & v8) != 0x92492 || !p0.x()) {
            p0.M();
            if((v3 & 1) == 0 || p0.w()) {
                if((v4 & 2) != 0) {
                    v6 = v.b;
                }
                if((v4 & 4) != 0) {
                    v7 = yc.d.h(0x7F060002, p0);  // color:BgGray100
                    v8 &= -897;
                }
                v11 = v8 & 0xFFFF1FFF;
                if((v4 & 0x40) != 0) {
                    function31 = bb.h.a;
                }
                function32 = function31;
                f2 = 0.0f;
                v13 = v7;
                v12 = 0x7F0801D7;  // drawable:ic_back_arrow
            }
            else {
                p0.K();
                if((v4 & 4) != 0) {
                    v8 &= -897;
                }
                v11 = v8 & 0xFFFF1FFF;
                v12 = v2;
                f2 = f;
                function32 = function31;
                v13 = v7;
            }
            v9 = v6;
            p0.q();
            c0.b b0 = c0.c.c(0xCBEAF02E, new bb.o(1, v9, s), p0);
            p0.Q(-1247704461);
            c0.b b1 = function00 == null ? null : c0.c.c(1183501253, new bb.n(function00, v12), p0);
            p0.p(false);
            f.i(b0, b1, function32, v13, f2, p0, v11 >> 12 & 0x380 | 6 | v11 << 3 & 0x1C00 | v11 >> 3 & 0xE000, 0);
            v10 = v12;
            v7 = v13;
            f1 = f2;
        }
        else {
            p0.K();
            function32 = function31;
            v9 = v6;
            v10 = v2;
            f1 = f;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new bb.i(s, v9, v7, function00, v10, f1, function32, v3, v4);
        }
    }

    public static final void i(c0.b b0, Function2 function20, Function3 function30, long v, float f, p p0, int v1, int v2) {
        Function3 function32;
        long v6;
        long v7;
        Function3 function33;
        long v8;
        int v5;
        long v4;
        Function3 function31;
        p0.S(0xD96706B1);
        int v3 = (v1 & 6) == 0 ? (p0.h(b0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v3 |= (p0.h(function20) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
            function31 = function30;
        }
        else if((v1 & 0x180) == 0) {
            function31 = function30;
            v3 |= (p0.h(function31) ? 0x100 : 0x80);
        }
        else {
            function31 = function30;
        }
        if((v1 & 0xC00) == 0) {
            if((v2 & 8) == 0) {
                v4 = v;
                v5 = p0.e(v4) ? 0x800 : 0x400;
            }
            else {
                v4 = v;
                v5 = 0x400;
            }
            v3 |= v5;
        }
        else {
            v4 = v;
        }
        if((v1 & 0x6000) == 0) {
            v3 |= (p0.c(f) ? 0x4000 : 0x2000);
        }
        if((v3 & 9363) != 9362 || !p0.x()) {
            p0.M();
            if((v1 & 1) == 0 || p0.w()) {
                Function3 function34 = (v2 & 4) == 0 ? function31 : bb.h.b;
                if((v2 & 8) == 0) {
                    v8 = v4;
                }
                else {
                    v8 = yc.d.h(0x7F060002, p0);  // color:BgGray100
                    v3 &= 0xFFFFE3FF;
                }
                function33 = function34;
                v7 = v8;
            }
            else {
                p0.K();
                if((v2 & 8) != 0) {
                    v3 &= 0xFFFFE3FF;
                }
                function33 = function31;
                v7 = v4;
            }
            p0.q();
            G.d(b0, null, function20, function33, v7, 0L, f, p0, v3 & 14 | v3 << 3 & 0x380 | v3 << 3 & 0x1C00 | v3 << 3 & 0xE000 | v3 << 6 & 0x380000, 34);
            function32 = function33;
            v6 = v7;
        }
        else {
            p0.K();
            v6 = v4;
            function32 = function31;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new bb.j(b0, function20, function32, v6, f, v1, v2);
        }
    }

    public static final int j(int v) {
        if(v < 0x1FFF) {
            return 0x3FFFE;
        }
        if(v < 0x7FFF) {
            return 0xFFFE;
        }
        if(v < 0xFFFF) {
            return 0x7FFE;
        }
        if(v >= 0x3FFFF) {
            throw new IllegalArgumentException(J.d(v, "Can\'t represent a size of ", " in Constraints"));
        }
        return 0x1FFE;
    }

    public static void k(Q q0, k k0, String s, k1.f f0, l1.b b0) {
        long v;
        s.getClass();
        Integer integer0 = 0;
        switch(s) {
            case "alpha": {
                b0.F = q0.m(f0.u(s));
                return;
            }
            case "center": {
                String s2 = f0.C(s);
                l1.b b2 = s2.equals("parent") ? k0.b(integer0) : k0.b(s2);
                b0.o(b2);
                b0.i(b2);
                b0.p(b2);
                b0.e(b2);
                return;
            }
            case "centerHorizontally": {
                String s3 = f0.C(s);
                l1.b b3 = s3.equals("parent") ? k0.b(integer0) : k0.b(s3);
                b0.o(b3);
                b0.i(b3);
                return;
            }
            case "centerVertically": {
                String s1 = f0.C(s);
                l1.b b1 = s1.equals("parent") ? k0.b(integer0) : k0.b(s1);
                b0.p(b1);
                b0.e(b1);
                return;
            }
            case "custom": {
                c c0 = f0.A(s);
                k1.f f5 = c0 instanceof k1.f ? ((k1.f)c0) : null;
                if(f5 != null) {
                    for(Object object0: f5.F()) {
                        String s5 = (String)object0;
                        c c1 = f5.u(s5);
                        if(c1 instanceof e) {
                            float f6 = c1.e();
                            if(b0.i0 == null) {
                                b0.i0 = new HashMap();
                            }
                            b0.i0.put(s5, f6);
                        }
                        else if(c1 instanceof k1.h) {
                            String s6 = c1.d();
                            if(s6.startsWith("#")) {
                                String s7 = s6.substring(1);
                                v = Long.parseLong((s7.length() == 6 ? "FF" + s7 : s6.substring(1)), 16);
                            }
                            else {
                                v = -1L;
                            }
                            if(v != -1L) {
                                b0.h0.put(s5, ((int)v));
                            }
                        }
                    }
                    return;
                }
                break;
            }
            case "hBias": {
                b0.h = q0.m(f0.u(s));
                return;
            }
            case "hRtlBias": {
                float f4 = q0.m(f0.u(s));
                if(!k0.b) {
                    f4 = 1.0f - f4;
                }
                b0.h = f4;
                return;
            }
            case "hWeight": {
                b0.f = q0.m(f0.u(s));
                return;
            }
            case "height": {
                b0.e0 = f.N(f0, s, k0, k0.a);
                return;
            }
            case "motion": {
                c c2 = f0.u(s);
                if(c2 instanceof k1.f) {
                    j1.b b4 = new j1.b();
                    b4.e = new int[10];
                    b4.f = new int[10];
                    b4.b = 0;
                    b4.g = new int[10];
                    b4.i = new float[10];
                    b4.c = 0;
                    b4.h = new int[5];
                    b4.j = new String[5];
                    b4.d = 0;
                    for(Object object1: ((k1.f)c2).F()) {
                        String s8 = (String)object1;
                        s8.getClass();
                        switch(s8) {
                            case "easing": {
                                b4.c(603, ((k1.f)c2).C(s8));
                                break;
                            }
                            case "pathArc": {
                            label_142:
                                String s9 = ((k1.f)c2).C(s8);
                                int v2 = 0;
                                while(true) {
                                    if(v2 < 6) {
                                        if(new String[]{"none", "startVertical", "startHorizontal", "flip", "below", "above"}[v2].equals(s9)) {
                                            break;
                                        }
                                        else {
                                            ++v2;
                                            continue;
                                        }
                                    }
                                    v2 = -1;
                                    break;
                                }
                                if(v2 == -1) {
                                    System.err.println("0 pathArc = \'" + s9 + "\'");
                                    continue;
                                }
                                else {
                                    b4.b(607, v2);
                                    break;
                                }
                                b4.c(605, ((k1.f)c2).C(s8));
                                break;
                            }
                            case "quantize": {
                                c c3 = ((k1.f)c2).u(s8);
                                if(c3 instanceof k1.a) {
                                    int v1 = ((k1.a)c3).c0.size();
                                    if(v1 <= 0) {
                                        continue;
                                    }
                                    b4.b(610, ((k1.a)c3).y(0));
                                    if(v1 <= 1) {
                                        continue;
                                    }
                                    b4.c(611, ((k1.a)c3).B(1));
                                    if(v1 <= 2) {
                                        continue;
                                    }
                                    b4.a(602, ((k1.a)c3).w(2));
                                    continue;
                                }
                                else {
                                    c c4 = ((k1.f)c2).u(s8);
                                    if(c4 != null) {
                                        b4.b(610, c4.g());
                                        continue;
                                    }
                                    StringBuilder stringBuilder0 = com.apollographql.apollo.api.b.s("no int found for key <", s8, ">, found [");
                                    stringBuilder0.append(null.i());
                                    stringBuilder0.append("] : ");
                                    stringBuilder0.append(null);
                                    throw new k1.g(stringBuilder0.toString(), ((k1.f)c2));
                                }
                                goto label_142;
                            }
                            case "relativeTo": {
                                b4.c(605, ((k1.f)c2).C(s8));
                                break;
                            }
                            case "stagger": {
                                b4.a(600, ((k1.f)c2).x(s8));
                            }
                        }
                    }
                    b0.getClass();
                    return;
                }
                break;
            }
            case "pivotX": {
                b0.x = q0.m(f0.u(s));
                return;
            }
            case "pivotY": {
                b0.y = q0.m(f0.u(s));
                return;
            }
            case "rotationX": {
                b0.z = q0.m(f0.u(s));
                return;
            }
            case "rotationY": {
                b0.A = q0.m(f0.u(s));
                return;
            }
            case "rotationZ": {
                b0.B = q0.m(f0.u(s));
                return;
            }
            case "scaleX": {
                b0.G = q0.m(f0.u(s));
                return;
            }
            case "scaleY": {
                b0.H = q0.m(f0.u(s));
                return;
            }
            case "translationX": {
                float f1 = q0.m(f0.u(s));
                b0.C = k0.a.o(f1);
                return;
            }
            case "translationY": {
                float f2 = q0.m(f0.u(s));
                b0.D = k0.a.o(f2);
                return;
            }
            case "translationZ": {
                float f3 = q0.m(f0.u(s));
                b0.E = k0.a.o(f3);
                return;
            }
            case "vBias": {
                b0.i = q0.m(f0.u(s));
                return;
            }
            case "vWeight": {
                b0.g = q0.m(f0.u(s));
                return;
            }
            case "visibility": {
                String s4 = f0.C(s);
                s4.getClass();
                switch(s4) {
                    case "gone": {
                        b0.I = 8;
                        return;
                    }
                    case "invisible": {
                        b0.I = 4;
                        b0.F = 0.0f;
                        return;
                    }
                    case "visible": {
                        b0.I = 0;
                        return;
                    }
                    default: {
                        return;
                    }
                }
            }
            case "width": {
                b0.d0 = f.N(f0, s, k0, k0.a);
                return;
            }
            default: {
                f.M(q0, k0, s, f0, b0);
            }
        }
    }

    public static final int l(int v) {
        if(v < 0x1FFF) {
            return 13;
        }
        if(v < 0x7FFF) {
            return 15;
        }
        if(v < 0xFFFF) {
            return 16;
        }
        return v >= 0x3FFFF ? 0xFF : 18;
    }

    public static final float m(long v, float f, long v1, long v2) {
        long v3 = M.m(v.b(f, v), v2);
        float f1 = M.w(M.m(v1, v3));
        float f2 = M.w(v3);
        return Math.max(f1 + 0.05f, f2 + 0.05f) / Math.min(f1 + 0.05f, f2 + 0.05f);
    }

    public static final void n(u u0, String s) {
        I i0;
        j.e(u0.c, "workManagerImpl.workDatabase");
        R2.u u1 = u0.c.x();
        R2.c c0 = u0.c.s();
        ArrayList arrayList0 = q.N(new String[]{s});
        while(!arrayList0.isEmpty()) {
            String s1 = (String)Bb.v.j0(arrayList0);
            switch(u1.i(s1)) {
                case 3: 
                case 4: {
                    break;
                }
                default: {
                    ((WorkDatabase_Impl)u1.a).b();
                    x2.g g0 = ((Ma.m)u1.f).a();
                    g0.c(1, s1);
                    try {
                        ((WorkDatabase_Impl)u1.a).c();
                        try {
                            g0.b();
                            ((WorkDatabase_Impl)u1.a).q();
                        }
                        finally {
                            ((WorkDatabase_Impl)u1.a).k();
                        }
                    }
                    finally {
                        ((Ma.m)u1.f).c(g0);
                    }
                }
            }
            arrayList0.addAll(c0.d(s1));
        }
        j.e(u0.f, "workManagerImpl.processor");
        synchronized(u0.f.k) {
            A.e().a(J2.e.l, "Processor cancelling " + s);
            u0.f.i.add(s);
            i0 = u0.f.b(s);
        }
        J2.e.e(s, i0, 1);
        for(Object object0: u0.e) {
            ((J2.g)object0).a(s);
        }
    }

    public static void o(int v) {
        if(2 <= v && v < 37) {
            return;
        }
        StringBuilder stringBuilder0 = m5.b.A(v, "radix ", " was not in valid range ");
        stringBuilder0.append(new Sb.d(2, 36, 1));  // initializer: LSb/b;-><init>(III)V
        throw new IllegalArgumentException(stringBuilder0.toString());
    }

    public static pc.p p(pc.p p0, pc.p p1) {
        s s0 = new s(4, false);
        int v1 = p0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            String s1 = p0.d(v2);
            String s2 = p0.g(v2);
            if((!"Warning".equalsIgnoreCase(s1) || !Vb.q.O(s2, "1", false)) && ("Content-Length".equalsIgnoreCase(s1) || "Content-Encoding".equalsIgnoreCase(s1) || "Content-Type".equalsIgnoreCase(s1) || !f.G(s1) || p1.a(s1) == null)) {
                s0.f(s1, s2);
            }
        }
        int v3 = p1.size();
        for(int v = 0; v < v3; ++v) {
            String s3 = p1.d(v);
            if(!"Content-Length".equalsIgnoreCase(s3) && !"Content-Encoding".equalsIgnoreCase(s3) && !"Content-Type".equalsIgnoreCase(s3) && f.G(s3)) {
                s0.f(s3, p1.g(v));
            }
        }
        return s0.j();
    }

    public static final long q(long v, long v1) {
        return io.sentry.config.a.d(I2.J.r(((int)(v1 >> 0x20)), a.j(v), a.h(v)), I2.J.r(((int)(v1 & 0xFFFFFFFFL)), a.i(v), a.g(v)));
    }

    public static final long r(long v, long v1) {
        return f.b(I2.J.r(a.j(v1), a.j(v), a.h(v)), I2.J.r(a.h(v1), a.j(v), a.h(v)), I2.J.r(a.i(v1), a.i(v), a.g(v)), I2.J.r(a.g(v1), a.i(v), a.g(v)));
    }

    public static final int s(int v, long v1) {
        return I2.J.r(v, a.i(v1), a.g(v1));
    }

    public static final int t(int v, long v1) {
        return I2.J.r(v, a.j(v1), a.h(v1));
    }

    public static final long u(int v, int v1, int v2, int v3) {
        int v4 = v3 == 0x7FFFFFFF ? v2 : v3;
        int v5 = v1 == 0x7FFFFFFF ? v : v1;
        int v6 = 0;
        int v7 = f.l(v5);
        if(f.l(v4) + v7 > 0x1F) {
            throw new IllegalArgumentException(A3.e.u(v5, v4, "Can\'t represent a width of ", " and height of ", " in Constraints"));
        }
        switch(v7) {
            case 15: {
                v6 = 1;
                break;
            }
            case 16: {
                v6 = 2;
                break;
            }
            case 18: {
                v6 = 3;
            }
        }
        int v8 = ((v6 & 2) >> 1) * 3 + ((v6 & 1) << 1);
        return ((long)(v1 + 1 & ~(v1 + 1 >> 0x1F))) << 33 | (((long)v6) | ((long)v) << 2) | ((long)v2) << v8 + 15 | ((long)(v3 + 1 & ~(v3 + 1 >> 0x1F))) << v8 + 46;
    }

    public static final Ab.m v(Throwable throwable0) {
        j.f(throwable0, "exception");
        return new Ab.m(throwable0);
    }

    public static x w(Object object0) {
        x x0 = new x();
        x0.c("sentry:typeCheckHint", object0);
        return x0;
    }

    public static O3.l x(String s, String s1) {
        j.f(s, "key");
        j.f(s1, "jsonFieldSource");
        Ec.j j0 = new Ec.j();  // initializer: Ljava/lang/Object;-><init>()V
        j0.e0(d.l(s1));
        Object object0 = f.y(-JsonReaders.readAny(new BufferedSourceJsonReader(j0)));
        Map map0 = object0 instanceof Map ? ((Map)object0) : null;
        if(map0 == null) {
            throw new IllegalStateException(("error deserializing: " + s1).toString());
        }
        return new O3.l(s, map0, null);
    }

    public static Object y(Object object0) {
        LinkedHashMap linkedHashMap0;
        if(object0 instanceof String) {
            j.f(((String)object0), "value");
            Vb.h h0 = O3.b.b;
            if(h0.c(((String)object0))) {
                Vb.d d0 = h0.b(((String)object0));
                List list0 = d0 == null ? null : d0.a();
                if(list0 == null || ((Bb.b)list0).a() <= 1) {
                    throw new IllegalArgumentException(J.e("Not a cache reference: ", ((String)object0), " Must be of the form: ApolloCacheReference{%s}").toString());
                }
                return new O3.b(((String)((Bb.H)list0).get(1)));
            }
        }
        else {
            if(object0 instanceof Map) {
                linkedHashMap0 = new LinkedHashMap(F.I(((Map)object0).size()));
                for(Object object1: ((Map)object0).entrySet()) {
                    linkedHashMap0.put(((Map.Entry)object1).getKey(), f.y(((Map.Entry)object1).getValue()));
                }
                return linkedHashMap0;
            }
            if(object0 instanceof List) {
                linkedHashMap0 = new ArrayList(Bb.r.b0(((Iterable)object0)));
                for(Object object2: ((Iterable)object0)) {
                    ((ArrayList)linkedHashMap0).add(f.y(object2));
                }
                return linkedHashMap0;
            }
        }
        return object0;
    }

    public static final Gb.b z(Enum[] arr_enum) [...] // Inlined contents
}

