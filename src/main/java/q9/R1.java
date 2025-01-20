package q9;

import Ab.k;
import Ab.t;
import Bb.F;
import Bb.d;
import E7.w;
import Eb.a;
import Nb.j;
import W4.f;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import c2.I;
import com.wave.customer.nearbyagents.NearbyAgentsActivity;
import hb.n;
import io.sentry.android.core.internal.util.g;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import o9.R1;

public final class r1 {
    static {
    }

    public r1(NearbyAgentsActivity nearbyAgentsActivity0, int v) {
        if(v != 4) {
            j.f(nearbyAgentsActivity0, "activity");
            super();
            new r1(nearbyAgentsActivity0, 4);
            new k0(nearbyAgentsActivity0);
            f.A(new R1(7, nearbyAgentsActivity0));
            return;
        }
        j.f(nearbyAgentsActivity0, "activity");
        super();
        nearbyAgentsActivity0.v(new I(3), new w(28, this));
    }

    public static void a(C3 c30, String s) {
        j.f(c30, "ctx");
        ArrayList arrayList0 = new ArrayList();
        t1.m0.getClass();
        d d0 = new d(0, t1.m0);
        while(d0.hasNext()) {
            Object object0 = d0.next();
            if(!((t1)object0).Y) {
                arrayList0.add(object0);
            }
        }
        for(Object object1: arrayList0) {
            m m0 = r1.c(((t1)object1), s, c30);
            ((SharedPreferences)m0.c).edit().clear().commit();
            int v = Build.VERSION.SDK_INT;
            String s1 = (String)m0.b;
            if(v >= 24) {
                g.r(c30, s1);
            }
            else {
                new File(new File(c30.getApplicationInfo().dataDir, "shared_prefs"), s1 + ".xml").delete();
            }
        }
    }

    public static C3 b(Context context0) {
        j.f(context0, "context");
        Context context1 = context0.getApplicationContext();
        j.d(context1, "null cannot be cast to non-null type com.sendwave.util.WaveApp<*>");
        return (C3)context1;
    }

    public static m c(t1 t10, String s, C3 c30) {
        j.f(t10, "group");
        j.f(s, "mobile");
        j.f(c30, "ctx");
        String s1 = t10.X;
        if(t10.Y) {
            n.d("Getting an app-wide pref for a specific mobile.", null, F.J(new k("group", s1)), false, 10);
            return new m(c30, s1);
        }
        return new m(c30, s1 + "_" + s);
    }

    public static String d(int v, Object[] arr_object) {
        j.f(arr_object, "args");
        q9.n n0 = C3.t0;
        if(n0 != null) {
            Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length);
            j.f(arr_object1, "args");
            Object[] arr_object2 = Arrays.copyOf(arr_object1, arr_object1.length);
            String s = n0.a.getString(v, arr_object2);
            j.e(s, "getString(...)");
            return s;
        }
        j.p("translator");
        throw null;
    }

    public static Object e(Z2 z20, long v, Function1 function10, Fb.j j0, int v1) {
        if((v1 & 2) != 0) {
            v = Y2.d;
        }
        T2 t20 = new T2();  // initializer: Ljava/lang/Object;-><init>()V
        ConcurrentHashMap concurrentHashMap0 = Y2.c;
        Object object0 = concurrentHashMap0.get(z20);
        if(object0 == null) {
            object0 = new Y2(t20);
            Object object1 = concurrentHashMap0.putIfAbsent(z20, object0);
            if(object1 != null) {
                object0 = object1;
            }
        }
        Object object2 = ((Y2)object0).a(v, function10, j0);
        return object2 != a.X ? t.a : object2;
    }
}

