package com.apollographql.apollo.api;

import Bb.F;
import Bb.q;
import R2.e;
import R2.k;
import android.util.Log;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import androidx.compose.ui.Modifier;
import com.google.android.gms.internal.measurement.B2;
import com.google.android.gms.internal.measurement.E1;
import com.google.android.gms.internal.measurement.l2;
import g0.i;
import g0.l;
import g1.c;
import io.sentry.ILogger;
import io.sentry.config.d;
import io.sentry.i1;
import j3.a;
import j3.f;
import j3.h;
import j6.P0;
import j6.d0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class b {
    public static String A(int v) {
        switch(v) {
            case 1: {
                return "BEGIN_ARRAY";
            }
            case 2: {
                return "END_ARRAY";
            }
            case 3: {
                return "BEGIN_OBJECT";
            }
            case 4: {
                return "END_OBJECT";
            }
            case 5: {
                return "NAME";
            }
            case 6: {
                return "STRING";
            }
            case 7: {
                return "NUMBER";
            }
            case 8: {
                return "BOOLEAN";
            }
            case 9: {
                return "NULL";
            }
            case 10: {
                return "END_DOCUMENT";
            }
            default: {
                return "null";
            }
        }
    }

    public static List a(d d0, String s) {
        String s1 = d0.a(s);
        return s1 == null ? Collections.emptyList() : Arrays.asList(s1.split(","));
    }

    public static boolean b(String s, ILogger iLogger0) {
        if(s != null && !s.isEmpty()) {
            return true;
        }
        iLogger0.h(i1.INFO, "No cached dir path is defined in options.", new Object[0]);
        return false;
    }

    public static Modifier c(Modifier modifier0, Modifier modifier1) {
        return modifier1 != l.X ? new i(modifier0, modifier1) : modifier0;
    }

    public static yc.l d(int v, int v1, int v2) {
        if(v == -2) {
            return j3.b.b;
        }
        int v3 = v - v2;
        if(v3 > 0) {
            return new a(v3);
        }
        int v4 = v1 - v2;
        return v4 > 0 ? new a(v4) : null;
    }

    public static h e(f f0) {
        int v5;
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = f0.X.getLayoutParams();
        int v = -1;
        int v1 = viewGroup$LayoutParams0 == null ? -1 : viewGroup$LayoutParams0.width;
        ImageView imageView0 = f0.X;
        int v2 = imageView0.getWidth();
        int v3 = 0;
        boolean z = f0.Y;
        if(z) {
            int v4 = imageView0.getPaddingLeft();
            v5 = imageView0.getPaddingRight() + v4;
        }
        else {
            v5 = 0;
        }
        yc.l l0 = b.d(v1, v2, v5);
        if(l0 == null) {
            return null;
        }
        ViewGroup.LayoutParams viewGroup$LayoutParams1 = imageView0.getLayoutParams();
        if(viewGroup$LayoutParams1 != null) {
            v = viewGroup$LayoutParams1.height;
        }
        int v6 = imageView0.getHeight();
        if(z) {
            int v7 = imageView0.getPaddingTop();
            v3 = imageView0.getPaddingBottom() + v7;
        }
        yc.l l1 = b.d(v, v6, v3);
        return l1 == null ? null : new h(l0, l1);
    }

    public static int f(int v) {
        switch(v) {
            case 0: {
                return 1;
            }
            case 1: {
                return 2;
            }
            case 2: {
                return 3;
            }
            case 3: {
                return 4;
            }
            case 4: {
                return 5;
            }
            default: {
                return 0;
            }
        }
    }

    public static int g(int v) {
        switch(v) {
            case 0: {
                return 1;
            }
            case 1: {
                return 2;
            }
            case 2: {
                return 3;
            }
            case 3: {
                return 4;
            }
            case 4: {
                return 5;
            }
            default: {
                return 0;
            }
        }
    }

    public static int h(int v) {
        switch(v) {
            case 0: {
                return 1;
            }
            case 1: {
                return 2;
            }
            case 2: {
                return 3;
            }
            case 3: {
                return 4;
            }
            case 4: {
                return 5;
            }
            default: {
                return 0;
            }
        }
    }

    public static void i(e e0, c c0) {
        e0.k(c0, 0.0f, 0.0f);
    }

    public static void j(k k0, g1.d d0) {
        k0.getClass();
        String s = "start";
        switch(d0.b) {
            case -2: {
                break;
            }
            case -1: {
                s = "end";
                break;
            }
            case 1: {
                s = "right";
                break;
            }
            default: {
                Log.e("CCL", "verticalAnchorIndexToAnchorName: Unknown vertical index");
            }
        }
        k1.a a0 = new k1.a(new char[0]);  // initializer: Lk1/b;-><init>([C)V
        a0.o(k1.h.o(d0.a.toString()));
        a0.o(k1.h.o(s));
        a0.o(new k1.e(0.0f));
        a0.o(new k1.e(0.0f));
        ((k1.f)k0.Y).G(((String)k0.Z), a0);
    }

    public static CompiledArgumentDefinition k(String s) {
        return new Builder(s).build();
    }

    public static ObjectType l(String s) {
        return new com.apollographql.apollo.api.ObjectType.Builder(s).build();
    }

    public static ObjectType m(InterfaceType[] arr_interfaceType, com.apollographql.apollo.api.ObjectType.Builder objectType$Builder0) {
        return objectType$Builder0.interfaces(q.L(arr_interfaceType)).build();
    }

    public static P0 n(d0 d00) {
        P0 p00 = d00.q();
        p00.q();
        p00.u();
        return p00;
    }

    public static String o(Object object0, String s) [...] // Inlined contents

    public static String p(String s, String s1) [...] // Inlined contents

    public static String q(String s, String s1, String s2) {
        return s + s1 + s2;
    }

    public static String r(StringBuilder stringBuilder0, boolean z, String s) {
        stringBuilder0.append(z);
        stringBuilder0.append(s);
        return stringBuilder0.toString();
    }

    public static StringBuilder s(String s, String s1, String s2) {
        StringBuilder stringBuilder0 = new StringBuilder(s);
        stringBuilder0.append(s1);
        stringBuilder0.append(s2);
        return stringBuilder0;
    }

    public static Map t(String s, String s1) {
        return F.J(new Ab.k(s, s1));
    }

    public static void u(int v, HashMap hashMap0, String s, int v1, String s1) [...] // Inlined contents

    public static void v(l2 l20) {
        if(l20 != null) {
            throw new ClassCastException();
        }
    }

    public static void w(B2 b20) {
        if(b20 != null) {
            throw new ClassCastException();
        }
    }

    public static void x(HashMap hashMap0, String s, E1 e10, String s1, ILogger iLogger0) {
        Object object0 = hashMap0.get(s);
        e10.s(s1);
        e10.w(iLogger0, object0);
    }

    public static void y(ConcurrentHashMap concurrentHashMap0, String s, E1 e10, String s1, ILogger iLogger0) {
        Object object0 = concurrentHashMap0.get(s);
        e10.s(s1);
        e10.w(iLogger0, object0);
    }

    public static void z(int v, HashMap hashMap0, String s, int v1, String s1) {
        hashMap0.put(v, s);
        hashMap0.put(v1, s1);
    }
}

