package N4;

import I5.h;
import J2.w;
import M4.l;
import O4.a;
import V4.o;
import W4.e;
import a5.m;
import a5.r;
import a5.s;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import hb.A;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import jeb.synthetic.FIN;
import org.json.JSONException;
import org.json.JSONObject;

public final class c implements Runnable {
    public final int X;

    public c(int v) {
        this.X = v;
        super();
    }

    @Override
    public final void run() {
        TreeSet treeSet0;
        Class class15;
        s s3;
        int v4;
        r r0;
        Class class12;
        a a0;
        Set set0 = null;
        switch(this.X) {
            case 0: {
                d.a();
                return;
            }
            case 1: {
                Class class0 = i.class;
                if(!f5.a.b(class0)) {
                    try {
                        i.c = null;
                        if(io.sentry.hints.i.u() != k.Y) {
                            i.d(p.Y);
                            return;
                        }
                    }
                    catch(Throwable throwable0) {
                        f5.a.a(throwable0, class0);
                    }
                }
                return;
            }
            case 2: {
                Class class1 = i.class;
                if(!f5.a.b(class1)) {
                    try {
                        j.G(i.a);
                        i.a = new h(16);
                        return;
                    }
                    catch(Throwable throwable1) {
                        f5.a.a(throwable1, class1);
                    }
                }
                return;
            }
            case 3: {
                HashSet hashSet0 = new HashSet();
                Class class2 = i.class;
                if(!f5.a.b(class2)) {
                    try {
                        set0 = i.a.q();
                    }
                    catch(Throwable throwable2) {
                        f5.a.a(throwable2, class2);
                    }
                }
                for(Object object0: set0) {
                    hashSet0.add(((b)object0).X);
                }
                for(Object object1: hashSet0) {
                    a5.p.h(((String)object1), true);
                }
                return;
            }
            case 4: {
                Class class3 = a.class;
                if(!f5.a.b(class3)) {
                    try {
                        a5.b b0 = w.F(l.a());
                        if(b0 == null || !b0.e) {
                            a0 = a.a;
                            if(!f5.a.b(a0)) {
                                goto label_46;
                            }
                            goto label_55;
                        }
                        return;
                    }
                    catch(Throwable throwable3) {
                        goto label_58;
                    }
                    try {
                    label_46:
                        m m0 = a5.p.h(l.b(), false);
                        if(m0 != null) {
                            String s = m0.i;
                            if(s != null) {
                                try {
                                    O4.c.a().clear();
                                    Pb.a.v(new JSONObject(s));
                                }
                                catch(JSONException unused_ex) {
                                }
                            }
                        }
                        goto label_55;
                    }
                    catch(Throwable throwable4) {
                        try {
                            f5.a.a(throwable4, a0);
                        label_55:
                            a.b = true;
                            return;
                        }
                        catch(Throwable throwable3) {
                        }
                    }
                label_58:
                    f5.a.a(throwable3, class3);
                }
                return;
            }
            case 5: {
                A.d("app_launch", new Aa.p(27));
                return;
            }
            case 6: {
                Context context0 = l.a();
                ArrayList arrayList0 = T4.h.f(T4.c.g, context0);
                if(arrayList0.isEmpty()) {
                    Object object2 = T4.c.g;
                    Class class4 = T4.h.class;
                    if(!f5.a.b(class4)) {
                        try {
                            ArrayList arrayList1 = new ArrayList();
                            if(object2 == null) {
                                set0 = arrayList1;
                            }
                            else {
                                T4.h h0 = T4.h.a;
                                Class class5 = h0.b(context0, "com.android.vending.billing.IInAppBillingService");
                                set0 = class5 == null || h0.c(class5, "getPurchaseHistory") == null ? arrayList1 : h0.a(h0.d(object2, context0));
                            }
                        }
                        catch(Throwable throwable5) {
                            f5.a.a(throwable5, class4);
                        }
                    }
                    arrayList0 = set0;
                }
                T4.c.a(context0, arrayList0, false);
                return;
            }
            case 7: {
                Context context1 = l.a();
                T4.c.a(context1, T4.h.f(T4.c.g, context1), false);
                Object object3 = T4.c.g;
                Class class6 = T4.h.class;
                if(!f5.a.b(class6)) {
                    try {
                        ArrayList arrayList2 = T4.h.a.e(context1, object3, "subs");
                        set0 = T4.h.a.a(arrayList2);
                    }
                    catch(Throwable throwable6) {
                        f5.a.a(throwable6, class6);
                    }
                }
                T4.c.a(context1, ((ArrayList)set0), true);
                return;
            }
            case 8: {
                Class class7 = T4.d.class;
                if(!f5.a.b(class7)) {
                    try {
                        T4.d.a.d();
                        return;
                    }
                    catch(Throwable throwable7) {
                        f5.a.a(throwable7, class7);
                    }
                }
                return;
            }
            case 9: {
                Class class8 = T4.d.class;
                if(!f5.a.b(class8)) {
                    try {
                        T4.d.a.d();
                        return;
                    }
                    catch(Throwable throwable8) {
                        f5.a.a(throwable8, class8);
                    }
                }
                return;
            }
            case 10: {
                if(V4.d.f == null) {
                    SharedPreferences sharedPreferences0 = PreferenceManager.getDefaultSharedPreferences(l.a());
                    long v = sharedPreferences0.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0L);
                    long v1 = sharedPreferences0.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0L);
                    String s1 = sharedPreferences0.getString("com.facebook.appevents.SessionInfo.sessionId", null);
                    if(v != 0L && v1 != 0L && s1 != null) {
                        o o0 = new o(v, v1);
                        o0.a = sharedPreferences0.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
                        SharedPreferences sharedPreferences1 = PreferenceManager.getDefaultSharedPreferences(l.a());
                        if(sharedPreferences1.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
                            set0 = new N5.A(sharedPreferences1.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), sharedPreferences1.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false), 1);
                        }
                        o0.f = set0;
                        o0.d = System.currentTimeMillis();
                        UUID uUID0 = UUID.fromString(s1);
                        Nb.j.e(uUID0, "fromString(sessionIDStr)");
                        o0.e = uUID0;
                        set0 = o0;
                    }
                    V4.d.f = set0;
                }
                return;
            }
            case 11: {
                Class class9 = e.class;
                if(!f5.a.b(class9)) {
                    try {
                        SharedPreferences sharedPreferences2 = l.a().getSharedPreferences("com.facebook.internal.MODEL_STORE", 0);
                        String s2 = sharedPreferences2.getString("models", null);
                        JSONObject jSONObject0 = s2 == null || s2.length() == 0 ? new JSONObject() : new JSONObject(s2);
                        long v2 = sharedPreferences2.getLong("model_request_timestamp", 0L);
                        boolean z = a5.j.b(a5.h.j0);
                        e e0 = e.a;
                        if(z && jSONObject0.length() != 0 && (!f5.a.b(e0) && v2 != 0L && System.currentTimeMillis() - v2 < 259200000L)) {
                            goto label_141;
                        }
                        jSONObject0 = e0.c();
                        if(jSONObject0 != null) {
                            sharedPreferences2.edit().putString("models", jSONObject0.toString()).putLong("model_request_timestamp", System.currentTimeMillis()).apply();
                        label_141:
                            e0.a(jSONObject0);
                            e0.b();
                            return;
                        }
                        return;
                    }
                    catch(Exception unused_ex) {
                        return;
                    }
                    catch(Throwable throwable9) {
                    }
                    f5.a.a(throwable9, class9);
                }
                return;
            }
            case 12: {
                Class class10 = e.class;
                if(!f5.a.b(class10)) {
                    try {
                        Z4.d.a();
                        return;
                    }
                    catch(Throwable throwable10) {
                        f5.a.a(throwable10, class10);
                    }
                }
                return;
            }
            case 13: {
                Class class11 = e.class;
                if(!f5.a.b(class11)) {
                    try {
                        class12 = U4.b.class;
                        if(!f5.a.b(class12)) {
                            goto label_158;
                        }
                        return;
                    }
                    catch(Throwable throwable11) {
                        goto label_165;
                    }
                    try {
                    label_158:
                        U4.b.b = true;
                        U4.b.c = a5.l.b("FBSDKFeatureIntegritySample", l.b(), false);
                        return;
                    }
                    catch(Throwable throwable12) {
                        try {
                            f5.a.a(throwable12, class12);
                            return;
                        }
                        catch(Throwable throwable11) {
                        }
                    }
                label_165:
                    f5.a.a(throwable11, class11);
                }
                return;
            }
            case 14: {
                throw null;
            }
            case 15: {
                Class class13 = Z4.d.class;
                if(!f5.a.b(class13)) {
                    try {
                        AtomicBoolean atomicBoolean0 = Z4.d.b;
                        if(!atomicBoolean0.get()) {
                            atomicBoolean0.set(true);
                            Z4.d.a.b();
                            return;
                        }
                    }
                    catch(Throwable throwable13) {
                        f5.a.a(throwable13, class13);
                    }
                }
                return;
            }
            case 16: {
                AtomicBoolean atomicBoolean1 = s.c;
                Class class14 = s.class;
                if(!f5.a.b(class14)) {
                    try {
                        Iterator iterator2 = s.b.iterator();
                        while(true) {
                        label_183:
                            if(!iterator2.hasNext()) {
                                return;
                            }
                            Object object4 = iterator2.next();
                            r0 = (r)object4;
                            __monitor_enter(r0);
                            v4 = FIN.finallyOpen$NT();
                            s3 = s.a;
                            class15 = s.class;
                            if(f5.a.b(class15)) {
                                goto label_199;
                            }
                            else {
                                break;
                            }
                            goto label_200;
                        }
                    }
                    catch(Throwable throwable14) {
                        goto label_211;
                    }
                    finally {
                        atomicBoolean1.set(false);
                    }
                    try {
                        treeSet0 = s3.b(r0);
                        goto label_200;
                    }
                    catch(Throwable throwable15) {
                        try {
                            f5.a.a(throwable15, class15);
                        label_199:
                            treeSet0 = null;
                        label_200:
                            if((treeSet0 == null || treeSet0.isEmpty()) && r0.a == 1) {
                                String s4 = f5.a.b(s.class) ? null : "a5.s";
                                Log.w(s4, "Apps that target Android API 30+ (Android 11+) cannot call Facebook native apps unless the package visibility needs are declared. Please follow https://developers.facebook.com/docs/android/troubleshooting/#faq_267321845055988 to make the declaration.");
                            }
                            FIN.finallyCodeBegin$NT(v4);
                            __monitor_exit(r0);
                            FIN.finallyCodeEnd$NT(v4);
                            goto label_183;
                        }
                        catch(Throwable throwable14) {
                        }
                    }
                label_211:
                    f5.a.a(throwable14, class14);
                }
                return;
            }
            case 17: {
                Class class16 = d5.a.class;
                if(!f5.a.b(class16)) {
                    try {
                        Object object5 = l.a().getSystemService("activity");
                        if(object5 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
                        }
                        d5.a.a(((ActivityManager)object5));
                        return;
                    }
                    catch(Exception unused_ex) {
                        return;
                    }
                    catch(Throwable throwable16) {
                    }
                    f5.a.a(throwable16, class16);
                }
                return;
            }
            case 18: {
                A.d("app_launch", new lb.j(8));
            }
        }
    }
}

