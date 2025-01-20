package J2;

import Aa.D;
import Aa.N;
import B.B;
import B.X;
import B.q0;
import B.v0;
import B.x0;
import B.z0;
import C.E;
import Ca.m;
import D0.K;
import E.A;
import E7.z;
import Ea.r;
import Eb.a;
import Fb.c;
import G0.W;
import G0.f0;
import G0.r0;
import I2.J;
import M4.h;
import M4.l;
import N.K0;
import N.m2;
import Na.d;
import Nb.j;
import O0.G;
import O0.O;
import R2.i;
import R2.p;
import U.C;
import U.H;
import U.N0;
import U.O0;
import U.Z;
import U.g0;
import U.l0;
import Vb.q;
import W5.f;
import Y8.H6;
import Y8.K9;
import Y8.Q9;
import Y8.R6;
import Y8.b9;
import Y8.d9;
import Y8.o;
import Y8.y6;
import Z2.t;
import a5.b;
import a9.X4;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Looper;
import android.widget.EdgeEffect;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.work.impl.WorkDatabase;
import com.google.common.util.concurrent.ListenableFuture;
import g0.e;
import g0.g;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import jeb.synthetic.TWR;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import n0.M;
import n0.v;
import o6.k;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q9.M0;
import q9.l1;
import y.m0;
import ya.n;

public abstract class w {
    public static final Object A(R6 r60, c c0) {
        Na.c c1;
        if(c0 instanceof Na.c) {
            c1 = (Na.c)c0;
            int v = c1.c0;
            if((v & 0x80000000) == 0) {
                c1 = new Na.c(c0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
            }
            else {
                c1.c0 = v ^ 0x80000000;
            }
        }
        else {
            c1 = new Na.c(c0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
        }
        Object object0 = c1.b0;
        Object object1 = a.X;
        switch(c1.c0) {
            case 0: {
                f.b0(object0);
                Q9 q90 = new Q9();  // initializer: Ljava/lang/Object;-><init>()V
                c1.c0 = 1;
                object0 = R6.d(r60, q90, H6.b0, null, c1, 4);
                return object0 == object1 ? object1 : ((K9)((y6)object0).b).a.b;
            }
            case 1: {
                f.b0(object0);
                return ((K9)((y6)object0).b).a.b;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public static final Object B(R6 r60, c c0) {
        d d0;
        if(c0 instanceof d) {
            d0 = (d)c0;
            int v = d0.c0;
            if((v & 0x80000000) == 0) {
                d0 = new d(c0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
            }
            else {
                d0.c0 = v ^ 0x80000000;
            }
        }
        else {
            d0 = new d(c0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
        }
        Object object0 = d0.b0;
        Object object1 = a.X;
        switch(d0.c0) {
            case 0: {
                f.b0(object0);
                d9 d90 = new d9();  // initializer: Ljava/lang/Object;-><init>()V
                d0.c0 = 1;
                object0 = R6.d(r60, d90, H6.b0, null, d0, 4);
                return object0 == object1 ? object1 : ((b9)((y6)object0).b).a.b.b.b.a;
            }
            case 1: {
                f.b0(object0);
                return ((b9)((y6)object0).b).a.b.b.b.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public static final String C(long v) {
        if(Long.compare(v, -999500000L) <= 0) {
            return String.format("%6s", Arrays.copyOf(new Object[]{o.w((v - 500000000L) / 1000000000L, " s ", new StringBuilder())}, 1));
        }
        if(Long.compare(v, 0xFFFFFFFFFFF0BFB4L) <= 0) {
            return String.format("%6s", Arrays.copyOf(new Object[]{o.w((v - 500000L) / 1000000L, " ms", new StringBuilder())}, 1));
        }
        if(Long.compare(v, 0L) <= 0) {
            return String.format("%6s", Arrays.copyOf(new Object[]{o.w((v - 500L) / 1000L, " µs", new StringBuilder())}, 1));
        }
        if(v < 0xF404CL) {
            return String.format("%6s", Arrays.copyOf(new Object[]{o.w((v + 500L) / 1000L, " µs", new StringBuilder())}, 1));
        }
        return v >= 999500000L ? String.format("%6s", Arrays.copyOf(new Object[]{o.w((v + 500000000L) / 1000000000L, " s ", new StringBuilder())}, 1)) : String.format("%6s", Arrays.copyOf(new Object[]{o.w((v + 500000L) / 1000000L, " ms", new StringBuilder())}, 1));
    }

    public static final i D(p p0) {
        j.f(p0, "<this>");
        return new i(p0.a, p0.t);
    }

    public static final int E(T0.w w0, int v) {
        boolean z = w0.a(T0.w.e0) >= 0;
        if(v == 1 && z) {
            return 3;
        }
        if(z) {
            return 1;
        }
        return v == 1 ? 2 : 0;
    }

    public static b F(Context context0) {
        Cursor cursor0;
        Uri uri0;
        b b1;
        b b0;
        try {
            if(w.M(context0)) {
                Method method0 = a5.w.I("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", new Class[]{Context.class});
                if(method0 == null) {
                    b0 = null;
                }
                else {
                    Object object0 = a5.w.L(null, method0, new Object[]{context0});
                    if(object0 == null) {
                        b0 = null;
                    }
                    else {
                        Method method1 = a5.w.H(object0.getClass(), "getId", new Class[0]);
                        Method method2 = a5.w.H(object0.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
                        if(method1 == null || method2 == null) {
                            goto label_19;
                        }
                        else {
                            b0 = new b();  // initializer: Ljava/lang/Object;-><init>()V
                            b0.a = (String)a5.w.L(object0, method1, new Object[0]);
                            Boolean boolean0 = (Boolean)a5.w.L(object0, method2, new Object[0]);
                            b0.e = boolean0 == null ? false : boolean0.booleanValue();
                        }
                    }
                }
            }
            else {
                b0 = null;
                goto label_20;
            label_19:
                b0 = null;
            }
        }
        catch(Exception unused_ex) {
            goto label_19;
        }
    label_20:
        if(b0 == null) {
            if(w.M(context0)) {
                K3.a a0 = new K3.a();
                Intent intent0 = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent0.setPackage("com.google.android.gms");
                try {
                    if(context0.bindService(intent0, a0, 1)) {
                        goto label_26;
                    }
                    else {
                        goto label_39;
                    }
                    goto label_40;
                }
                catch(SecurityException unused_ex) {
                    goto label_39;
                }
                try {
                label_26:
                    a5.a a1 = new a5.a(a0.a());
                    b1 = new b();  // initializer: Ljava/lang/Object;-><init>()V
                    b1.a = a1.b();
                    b1.e = a1.c();
                }
                catch(Exception unused_ex) {
                    context0.unbindService(a0);
                    goto label_39;
                }
                finally {
                    context0.unbindService(a0);
                }
                b0 = b1;
            }
            else {
            label_39:
                b0 = null;
            }
        label_40:
            if(b0 == null) {
                b0 = new b();  // initializer: Ljava/lang/Object;-><init>()V
            }
        }
        try {
            if(j.a(Looper.myLooper(), Looper.getMainLooper())) {
                throw new h("getAttributionIdentifiers cannot be called on the main thread.");
            }
            b b2 = b.f;
            if(b2 != null && System.currentTimeMillis() - b2.b < 3600000L) {
                return b2;
            }
            ProviderInfo providerInfo0 = context0.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 0);
            ProviderInfo providerInfo1 = context0.getPackageManager().resolveContentProvider("com.facebook.wakizashi.provider.AttributionIdProvider", 0);
            if(providerInfo0 == null) {
            label_55:
                if(providerInfo1 == null) {
                    uri0 = null;
                }
                else {
                    String s1 = providerInfo1.packageName;
                    j.e(s1, "wakizashiProviderInfo.packageName");
                    uri0 = a5.f.a(context0, s1) ? Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider") : null;
                }
            }
            else {
                String s = providerInfo0.packageName;
                j.e(s, "contentProviderInfo.packageName");
                if(a5.f.a(context0, s)) {
                    uri0 = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
                    goto label_64;
                }
                goto label_55;
            }
        label_64:
            PackageManager packageManager0 = context0.getPackageManager();
            String s2 = packageManager0 == null ? null : packageManager0.getInstallerPackageName("com.wave.personal");
            if(s2 != null) {
                b0.d = s2;
            }
            if(uri0 == null) {
                b0.b = System.currentTimeMillis();
                b.f = b0;
                return b0;
            }
            cursor0 = context0.getContentResolver().query(uri0, new String[]{"aid", "androidid", "limit_tracking"}, null, null, null);
            goto label_79;
        label_74:
            cursor0 = null;
            goto label_88;
        }
        catch(Exception unused_ex) {
            goto label_74;
        }
        catch(Throwable throwable0) {
        }
        TWR.safeClose$NT(null, throwable0);
        throw throwable0;
        try {
        label_79:
            if(cursor0 != null && cursor0.moveToFirst()) {
                int v1 = cursor0.getColumnIndex("aid");
                int v2 = cursor0.getColumnIndex("androidid");
                int v3 = cursor0.getColumnIndex("limit_tracking");
                b0.c = cursor0.getString(v1);
                if(v2 > 0 && v3 > 0 && b0.a() == null) {
                    b0.a = cursor0.getString(v2);
                    b0.e = Boolean.parseBoolean(cursor0.getString(v3));
                }
                goto label_94;
            }
            goto label_98;
        }
        catch(Exception unused_ex) {
        label_88:
            if(cursor0 != null) {
                cursor0.close();
            }
            return null;
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    label_94:
        cursor0.close();
        b0.b = System.currentTimeMillis();
        b.f = b0;
        return b0;
    label_98:
        b0.b = System.currentTimeMillis();
        b.f = b0;
        if(cursor0 != null) {
            cursor0.close();
        }
        return b0;
    }

    public static final long G(long v) {
        if(v == 0x7FC000007FC00000L) {
            throw new IllegalStateException("Size is unspecified");
        }
        return yc.d.d(Float.intBitsToFloat(((int)(v >> 0x20))) / 2.0f, Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL))) / 2.0f);
    }

    public static float H(EdgeEffect edgeEffect0) {
        return Build.VERSION.SDK_INT < 0x1F ? 0.0f : M1.c.b(edgeEffect0);
    }

    public static final File I() {
        File file0 = new File(l.a().getCacheDir(), "instrument");
        return file0.exists() || file0.mkdirs() ? file0 : null;
    }

    public static final int J(int v, int v1) {
        return v >> v1 & 0x1F;
    }

    public static void K(Context context0) {
        boolean z;
        if(M6.b.F(context0).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            PackageManager packageManager0 = context0.getApplicationContext().getPackageManager();
            if(packageManager0 == null) {
            label_8:
                z = true;
            }
            else {
                ApplicationInfo applicationInfo0 = packageManager0.getApplicationInfo("com.wave.personal", 0x80);
                if(applicationInfo0 != null && (applicationInfo0.metaData != null && applicationInfo0.metaData.containsKey("firebase_messaging_notification_delegation_enabled"))) {
                    z = applicationInfo0.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
                    goto label_9;
                }
                goto label_8;
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            goto label_8;
        }
    label_9:
        if(Build.VERSION.SDK_INT >= 29) {
            new z(context0, z, new o6.i()).run();
            return;
        }
        k.e(null);
    }

    public static final boolean L(StackTraceElement stackTraceElement0) {
        String s = stackTraceElement0.getClassName();
        j.e(s, "element.className");
        if(!q.O(s, "com.facebook", false)) {
            String s1 = stackTraceElement0.getClassName();
            j.e(s1, "element.className");
            return q.O(s1, "com.meta", false);
        }
        return true;
    }

    public static boolean M(Context context0) {
        Method method0 = a5.w.I("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", new Class[]{Context.class});
        if(method0 == null) {
            return false;
        }
        Object object0 = a5.w.L(null, method0, new Object[]{context0});
        return object0 instanceof Integer && j.a(object0, 0);
    }

    public static final boolean N(Thread thread0) {
        StackTraceElement[] arr_stackTraceElement = thread0.getStackTrace();
        if(arr_stackTraceElement != null) {
            int v = 0;
            while(v < arr_stackTraceElement.length) {
                StackTraceElement stackTraceElement0 = arr_stackTraceElement[v];
                j.e(stackTraceElement0, "element");
                if(w.L(stackTraceElement0)) {
                    String s = stackTraceElement0.getClassName();
                    j.e(s, "element.className");
                    if(!q.O(s, "com.facebook.appevents.codeless", false)) {
                        String s1 = stackTraceElement0.getClassName();
                        j.e(s1, "element.className");
                        if(q.O(s1, "com.facebook.appevents.suggestedevents", false)) {
                            goto label_13;
                        }
                        return true;
                    }
                label_13:
                    String s2 = stackTraceElement0.getMethodName();
                    j.e(s2, "element.methodName");
                    if(!q.O(s2, "onClick", false)) {
                        String s3 = stackTraceElement0.getMethodName();
                        j.e(s3, "element.methodName");
                        if(!q.O(s3, "onItemClick", false)) {
                            String s4 = stackTraceElement0.getMethodName();
                            j.e(s4, "element.methodName");
                            if(q.O(s4, "onTouch", false)) {
                                goto label_23;
                            }
                            return true;
                        }
                    }
                }
            label_23:
                ++v;
            }
        }
        return false;
    }

    public static float O(EdgeEffect edgeEffect0, float f, float f1) {
        if(Build.VERSION.SDK_INT >= 0x1F) {
            return M1.c.c(edgeEffect0, f, f1);
        }
        M1.b.a(edgeEffect0, f, f1);
        return f;
    }

    public static final String P(int v, int v1, Object[] arr_object, U.p p0) {
        return J.N(p0).getQuantityString(v, v1, Arrays.copyOf(arr_object, arr_object.length));
    }

    public static final JSONObject Q(String s) {
        File file0 = w.I();
        if(file0 != null) {
            File file1 = new File(file0, s);
            try {
                return new JSONObject(a5.w.c0(new FileInputStream(file1)));
            }
            catch(Exception unused_ex) {
                w.x(s);
            }
        }
        return null;
    }

    public static final void R(String s, JSONArray jSONArray0, M4.p p0) {
        if(jSONArray0.length() == 0) {
            return;
        }
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put(s, jSONArray0.toString());
            JSONObject jSONObject1 = a5.w.E();
            if(jSONObject1 != null) {
                Iterator iterator0 = jSONObject1.keys();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    jSONObject0.put(((String)object0), jSONObject1.get(((String)object0)));
                }
            }
        }
        catch(JSONException unused_ex) {
            return;
        }
        io.sentry.hints.i.G(null, String.format("%s/instruments", Arrays.copyOf(new Object[]{l.b()}, 1)), jSONObject0, p0).d();
    }

    public static final String S(int v, U.p p0) {
        return J.N(p0).getString(v);
    }

    public static final String T(int v, Object[] arr_object, U.p p0) {
        return J.N(p0).getString(v, Arrays.copyOf(arr_object, arr_object.length));
    }

    public static final void U(String s, String s1) {
        File file0 = w.I();
        if(file0 != null && s != null && s1 != null) {
            File file1 = new File(file0, s);
            try {
                FileOutputStream fileOutputStream0 = new FileOutputStream(file1);
                byte[] arr_b = s1.getBytes(Vb.a.a);
                j.e(arr_b, "(this as java.lang.String).getBytes(charset)");
                fileOutputStream0.write(arr_b);
                fileOutputStream0.close();
            }
            catch(Exception unused_ex) {
            }
        }
    }

    public static final void a(String s, String s1, U.p p0, int v) {
        j.f(s, "leadingText");
        j.f(s1, "supportNumber");
        p0.S(-102311772);
        int v1 = (v & 6) == 0 ? (p0.f(s) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.f(s1) ? 0x20 : 16);
        }
        if((v1 & 19) != 18 || !p0.x()) {
            W w0 = (W)p0.k(f0.p);
            p0.Q(0x80E18909);
            O0.c c0 = new O0.c();
            c0.d(s);
            int v2 = c0.f(new G(yc.d.h(0x7F060048, p0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, Z0.j.c, null, 0xEFFE));  // color:WaveBlue500
            try {
                c0.d(s1);
            }
            catch(Throwable throwable0) {
                c0.e(v2);
                throw throwable0;
            }
            c0.e(v2);
            O0.f f0 = c0.g();
            p0.p(false);
            p0.Q(0x80E1B4C4);
            boolean z = p0.h(w0);
            Object object0 = p0.G();
            if(((v1 & 0x70) == 0x20 | z) != 0 || object0 == U.l.a) {
                object0 = new r(w0, 21, s1);
                p0.a0(object0);
            }
            p0.p(false);
            I.f0.c(f0, null, null, false, 0, 0, null, ((Function1)object0), p0, 0, 0x7E);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new m(v, 2, s, s1);
        }
    }

    public static final void b(n n0, ya.r r0, U.p p0, int v) {
        j.f(n0, "state");
        j.f(r0, "step");
        p0.S(0x1A9D8076);
        int v1 = (v & 0x30) == 0 ? (p0.f(n0) ? 0x20 : 16) | v : v;
        if((v & 0x180) == 0) {
            v1 |= (p0.h(r0) ? 0x100 : 0x80);
        }
        if((v1 & 0x91) != 0x90 || !p0.x()) {
            M6.b.d(yc.l.y(0x7F080271, p0, 0), null, null, null, null, 0.0f, null, p0, 0x30, 0x7C);  // drawable:ic_phone_with_x
            String s = w.S(0x7F12025D, p0);  // string:magic_link_device_mismatch_title "Device does not match"
            O o0 = ((db.a)p0.k(db.b.d)).n;
            m2.b(s, androidx.compose.foundation.layout.a.n(g0.l.X, 0.0f, 16.0f, 0.0f, 0.0f, 13), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o0, p0, 0x30, 0, 0xFFFC);
            m2.b(w.S(0x7F12025B, p0), androidx.compose.foundation.layout.a.n(g0.l.X, 0.0f, 16.0f, 0.0f, 16.0f, 5), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((db.a)p0.k(db.b.d)).h, p0, 0x30, 0, 0xFFFC);  // string:magic_link_device_mismatch_description "Someone tried to access your Wave 
                                                                                                                                                                                                                                      // account on another device:"
            w.c(r0.d, r0.e, r0.f, p0, 0);
            m2.b(w.S(0x7F12025C, p0), androidx.compose.foundation.layout.a.n(g0.l.X, 0.0f, 16.0f, 0.0f, 16.0f, 5), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((db.a)p0.k(db.b.d)).h, p0, 0x30, 0, 0xFFFC);  // string:magic_link_device_mismatch_instructions "If this was you:\n1. Insert your 
                                                                                                                                                                                                                                      // SIM card into the device\n2. Request a new link"
            w.a(w.S(0x7F12025A, p0), n0.a, p0, 0);  // string:magic_link_device_mismatch_call_support "If this was not you, call Wave support 
                                                    // at "
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new ya.l(n0, r0, v, 1);
        }
    }

    public static final void c(String s, String s1, Wc.b b0, U.p p0, int v) {
        F0.h h16;
        F0.h h15;
        F0.i i5;
        g0.l l2;
        z0 z02;
        g g2;
        F0.h h14;
        F0.i i4;
        F0.h h13;
        F0.h h12;
        F0.h h11;
        F0.h h10;
        F0.h h9;
        F0.i i3;
        g0.f f2;
        F0.h h8;
        F0.i i2;
        U.p p1;
        g0.f f1;
        g g1;
        int v6;
        g0.l l1;
        F0.i i1;
        z0 z01;
        F0.h h7;
        F0.h h6;
        F0.h h5;
        F0.h h4;
        p0.S(-260400690);
        int v1 = (v & 6) == 0 ? (p0.f(s) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.f(s1) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.h(b0) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) != 0x92 || !p0.x()) {
            g0.l l0 = g0.l.X;
            Modifier modifier0 = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.a.b(N4.o.j(androidx.compose.foundation.layout.c.d(l0, 1.0f), H.f.a(10)), yc.d.h(0x7F060013, p0), M.a), 16.0f);  // color:Gray100
            B b1 = B.z.a(new B.h(8.0f), g0.b.m, p0, 6);
            int v2 = p0.P;
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
            F0.h h0 = F0.j.f;
            U.d.K(p0, b1, h0);
            F0.h h1 = F0.j.e;
            U.d.K(p0, g00, h1);
            F0.h h2 = F0.j.g;
            if(p0.O || !j.a(p0.G(), v2)) {
                m5.b.F(v2, p0, v2, h2);
            }
            F0.h h3 = F0.j.d;
            U.d.K(p0, modifier1, h3);
            p0.Q(0x650BD863);
            g g0 = g0.b.a;
            z0 z00 = z0.a;
            g0.f f0 = g0.b.j;
            if(s == null) {
                f1 = f0;
                g1 = g0;
                z01 = z00;
                h4 = h2;
                h5 = h3;
                h6 = h1;
                h7 = h0;
                i1 = i0;
                l1 = l0;
                v6 = v1;
                p1 = p0;
            }
            else {
                x0 x00 = v0.b(B.k.a, f0, p0, 0);
                int v3 = p0.P;
                g0 g01 = p0.m();
                Modifier modifier2 = g0.a.d(p0, l0);
                p0.U();
                if(p0.O) {
                    p0.l(i0);
                }
                else {
                    p0.d0();
                }
                U.d.K(p0, x00, h0);
                U.d.K(p0, g01, h1);
                if(p0.O || !j.a(p0.G(), v3)) {
                    m5.b.F(v3, p0, v3, h2);
                }
                U.d.K(p0, modifier2, h3);
                Modifier modifier3 = z00.a(l0, 1.0f, true);
                K k0 = B.r.e(g0, false);
                int v4 = p0.P;
                g0 g02 = p0.m();
                Modifier modifier4 = g0.a.d(p0, modifier3);
                p0.U();
                if(p0.O) {
                    p0.l(i0);
                }
                else {
                    p0.d0();
                }
                U.d.K(p0, k0, h0);
                U.d.K(p0, g02, h1);
                if(p0.O || !j.a(p0.G(), v4)) {
                    m5.b.F(v4, p0, v4, h2);
                }
                U.d.K(p0, modifier4, h3);
                String s2 = w.S(0x7F12025E, p0);  // string:magic_link_device_model_label "Model"
                O0 o00 = db.b.d;
                m2.b(s2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((db.a)p0.k(o00)).h, p0, 0, 0, 0xFFFE);
                p0.p(true);
                Modifier modifier5 = z00.a(l0, 2.0f, true);
                K k1 = B.r.e(g0, false);
                int v5 = p0.P;
                g0 g03 = p0.m();
                Modifier modifier6 = g0.a.d(p0, modifier5);
                p0.U();
                if(p0.O) {
                    p0.l(i0);
                }
                else {
                    p0.d0();
                }
                U.d.K(p0, k1, h0);
                U.d.K(p0, g03, h1);
                if(p0.O || !j.a(p0.G(), v5)) {
                    m5.b.F(v5, p0, v5, h2);
                }
                U.d.K(p0, modifier6, h3);
                h4 = h2;
                h5 = h3;
                h6 = h1;
                h7 = h0;
                z01 = z00;
                i1 = i0;
                l1 = l0;
                v6 = v1;
                g1 = g0;
                f1 = f0;
                O o0 = ((db.a)p0.k(o00)).h;
                m2.b(s, null, 0L, 0L, null, T0.w.n0, null, 0L, null, null, 0L, 0, false, 0, 0, null, o0, p0, v1 & 14 | 0x30000, 0, 0xFFDE);
                p1 = p0;
                p1.p(true);
                p1.p(true);
            }
            p1.p(false);
            p1.Q(0x650C2220);
            if(s1 == null) {
                h12 = h4;
                h11 = h5;
                h13 = h6;
                h14 = h7;
                i4 = i1;
                z02 = z01;
                l2 = l1;
                g2 = g1;
                f2 = f1;
            }
            else {
                x0 x01 = v0.b(B.k.a, f1, p1, 0);
                int v7 = p1.P;
                g0 g04 = p0.m();
                Modifier modifier7 = g0.a.d(p1, l1);
                p0.U();
                if(p1.O) {
                    i2 = i1;
                    p1.l(i2);
                }
                else {
                    i2 = i1;
                    p0.d0();
                }
                U.d.K(p1, x01, h7);
                U.d.K(p1, g04, h6);
                if(!p1.O && j.a(p0.G(), v7)) {
                    h8 = h4;
                }
                else {
                    h8 = h4;
                    m5.b.F(v7, p1, v7, h8);
                }
                U.d.K(p1, modifier7, h5);
                Modifier modifier8 = z01.a(l1, 1.0f, true);
                K k2 = B.r.e(g1, false);
                int v8 = p1.P;
                g0 g05 = p0.m();
                Modifier modifier9 = g0.a.d(p1, modifier8);
                p0.U();
                if(p1.O) {
                    p1.l(i2);
                }
                else {
                    p0.d0();
                }
                U.d.K(p1, k2, h7);
                U.d.K(p1, g05, h6);
                if(p1.O || !j.a(p0.G(), v8)) {
                    m5.b.F(v8, p1, v8, h8);
                }
                U.d.K(p1, modifier9, h5);
                String s3 = w.S(0x7F12025F, p1);  // string:magic_link_device_name_label "Name"
                O o1 = ((db.a)p1.k(db.b.d)).h;
                O0 o01 = db.b.d;
                f2 = f1;
                m2.b(s3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o1, p0, 0, 0, 0xFFFE);
                p0.p(true);
                Modifier modifier10 = z01.a(l1, 2.0f, true);
                K k3 = B.r.e(g1, false);
                int v9 = p0.P;
                g0 g06 = p0.m();
                Modifier modifier11 = g0.a.d(p0, modifier10);
                p0.U();
                if(p0.O) {
                    i3 = i2;
                    p0.l(i3);
                }
                else {
                    i3 = i2;
                    p0.d0();
                }
                U.d.K(p0, k3, h7);
                U.d.K(p0, g06, h6);
                if(!p0.O && j.a(p0.G(), v9)) {
                    h10 = h5;
                    h9 = h8;
                }
                else {
                    h9 = h8;
                    m5.b.F(v9, p0, v9, h9);
                    h10 = h5;
                }
                U.d.K(p0, modifier11, h10);
                h11 = h10;
                O o2 = ((db.a)p0.k(o01)).h;
                h12 = h9;
                h13 = h6;
                i4 = i3;
                h14 = h7;
                g2 = g1;
                z02 = z01;
                l2 = l1;
                m2.b(s1, null, 0L, 0L, null, T0.w.n0, null, 0L, null, null, 0L, 0, false, 0, 0, null, o2, p0, v6 >> 3 & 14 | 0x30000, 0, 0xFFDE);
                p1 = p0;
                p1.p(true);
                p1.p(true);
            }
            p1.p(false);
            p1.Q(0x650C6BB7);
            if(b0 != null) {
                x0 x02 = v0.b(B.k.a, f2, p1, 0);
                int v10 = p1.P;
                g0 g07 = p0.m();
                Modifier modifier12 = g0.a.d(p1, l2);
                p0.U();
                if(p1.O) {
                    i5 = i4;
                    p1.l(i5);
                }
                else {
                    i5 = i4;
                    p0.d0();
                }
                U.d.K(p1, x02, h14);
                U.d.K(p1, g07, h13);
                if(!p1.O && j.a(p0.G(), v10)) {
                    h16 = h11;
                    h15 = h12;
                }
                else {
                    h15 = h12;
                    m5.b.F(v10, p1, v10, h15);
                    h16 = h11;
                }
                U.d.K(p1, modifier12, h16);
                Modifier modifier13 = z02.a(l2, 1.0f, true);
                K k4 = B.r.e(g2, false);
                int v11 = p1.P;
                g0 g08 = p0.m();
                Modifier modifier14 = g0.a.d(p1, modifier13);
                p0.U();
                if(p1.O) {
                    p1.l(i5);
                }
                else {
                    p0.d0();
                }
                U.d.K(p1, k4, h14);
                U.d.K(p1, g08, h13);
                if(p1.O || !j.a(p0.G(), v11)) {
                    m5.b.F(v11, p1, v11, h15);
                }
                U.d.K(p1, modifier14, h16);
                String s4 = w.S(0x7F120260, p1);  // string:magic_link_first_login_label "First login"
                O o3 = ((db.a)p1.k(db.b.d)).h;
                O0 o02 = db.b.d;
                m2.b(s4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o3, p0, 0, 0, 0xFFFE);
                p0.p(true);
                Modifier modifier15 = z02.a(l2, 2.0f, true);
                K k5 = B.r.e(g2, false);
                int v12 = p0.P;
                g0 g09 = p0.m();
                Modifier modifier16 = g0.a.d(p0, modifier15);
                p0.U();
                if(p0.O) {
                    p0.l(i5);
                }
                else {
                    p0.d0();
                }
                U.d.K(p0, k5, h14);
                U.d.K(p0, g09, h13);
                if(p0.O || !j.a(p0.G(), v12)) {
                    m5.b.F(v12, p0, v12, h15);
                }
                U.d.K(p0, modifier16, h16);
                String s5 = ad.a.a("d MMM yyyy H:mm").b(b0);
                j.e(s5, "toString(...)");
                O o4 = ((db.a)p0.k(o02)).h;
                m2.b(s5, null, 0L, 0L, null, T0.w.n0, null, 0L, null, null, 0L, 0, false, 0, 0, null, o4, p0, 0x30000, 0, 0xFFDE);
                p1 = p0;
                p1.p(true);
                p1.p(true);
            }
            p1.p(false);
            p1.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new D(s, s1, b0, v, 24);
        }
    }

    public static final void d(String s, U.p p0, int v) {
        p0.S(0x29CF9FB4);
        int v1 = (v & 6) == 0 ? (p0.f(s) ? 4 : 2) | v : v;
        if((v1 & 3) != 2 || !p0.x()) {
            Modifier modifier0 = androidx.compose.foundation.layout.c.k(g0.l.X, 32.0f);
            if(((Boolean)p0.k(r0.a)).booleanValue()) {
                p0.Q(0xAD29AFC7);
                M6.b.d(yc.l.y((Vb.j.R(s, "coins", false) || !Vb.j.R(s, "calendar", false) ? 0x7F08021E : 0x7F0801F3), p0, 0), null, modifier0, null, null, 0.0f, null, p0, 0x1B0, 120);  // drawable:ic_coins
            }
            else {
                p0.Q(0xAD2EDEF7);
                t.c(s, null, modifier0, null, null, p0, v1 & 14 | 0x1B0, 0xFF8);
            }
            p0.p(false);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Ea.n(s, v, 4);
        }
    }

    public static final void e(Modifier modifier0, E e0, q0 q00, boolean z, boolean z1, m0 m00, boolean z2, int v, e e1, B.i i0, g0.f f0, B.g g0, Function1 function10, U.p p0, int v1, int v2, int v3) {
        B.g g2;
        g0.f f1;
        B.i i1;
        e e2;
        int v8;
        int v25;
        int v24;
        U.p p1;
        Z z8;
        B.i i5;
        e e5;
        B.g g3;
        int v23;
        B.i i4;
        B.i i3;
        int v7;
        p0.S(0x25001C13);
        int v4 = (v1 & 6) == 0 ? (p0.f(modifier0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v4 |= (p0.f(e0) ? 0x20 : 16);
        }
        int v5 = 0x80;
        if((v1 & 0x180) == 0) {
            v4 |= (p0.f(q00) ? 0x100 : 0x80);
        }
        if((v1 & 0xC00) == 0) {
            v4 |= (p0.g(z) ? 0x800 : 0x400);
        }
        if((v1 & 0x6000) == 0) {
            v4 |= (p0.g(z1) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v1) == 0) {
            v4 |= (p0.f(m00) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x180000) == 0) {
            v4 |= (p0.g(z2) ? 0x100000 : 0x80000);
        }
        int v6 = v4 | 0xC00000;
        if((v3 & 0x100) != 0) {
            v6 = v4 | 0x6C00000;
        }
        else if((v1 & 0x6000000) == 0) {
            v6 |= (p0.f(e1) ? 0x4000000 : 0x2000000);
        }
        if((v3 & 0x200) != 0) {
            v6 |= 0x30000000;
        }
        else if((v1 & 0x30000000) == 0) {
            v6 |= (p0.f(i0) ? 0x20000000 : 0x10000000);
        }
        if((v3 & 0x400) == 0) {
            v7 = (v2 & 6) == 0 ? v2 | (p0.f(f0) ? 4 : 2) : v2;
        }
        else {
            v7 = v2 | 6;
        }
        if((v3 & 0x800) != 0) {
            v7 |= 0x30;
        }
        else if((v2 & 0x30) == 0) {
            v7 |= (p0.f(g0) ? 0x20 : 16);
        }
        if((v2 & 0x180) == 0) {
            if(p0.h(function10)) {
                v5 = 0x100;
            }
            v7 |= v5;
        }
        B.g g1 = null;
        if((v6 & 306783379) != 306783378 || (v7 & 0x93) != 0x92 || !p0.x()) {
            e e3 = (v3 & 0x100) == 0 ? e1 : null;
            B.i i2 = (v3 & 0x200) == 0 ? i0 : null;
            g0.f f2 = (v3 & 0x400) == 0 ? f0 : null;
            if((v3 & 0x800) == 0) {
                g1 = g0;
            }
            int v9 = v6 >> 3 & 14;
            int v10 = v9 | v7 >> 3 & 0x70;
            MutableState mutableState0 = U.d.G(function10, p0);
            int v11 = 0;
            boolean z3 = (v10 & 14 ^ 6) <= 4 && p0.f(e0) || (v10 & 6) == 4;
            Object object0 = p0.G();
            Z z4 = U.l.a;
            if(z3 || object0 == z4) {
                C.c c0 = new C.c();  // initializer: Ljava/lang/Object;-><init>()V
                c0.a = U.d.C(0x7FFFFFFF);
                c0.b = U.d.C(0x7FFFFFFF);
                i3 = i2;
                C.m m0 = new C.m(mutableState0, 0);
                C.n n0 = new C.n(U.d.v(Z.c, m0), e0, c0, 0);
                C c1 = U.d.v(Z.c, n0);
                object0 = new C.l(0, 0, N0.class, c1, "value", "getValue()Ljava/lang/Object;");
                p0.a0(object0);
            }
            else {
                i3 = i2;
            }
            int v12 = v9 | v6 >> 9 & 0x70;
            int v13 = ((v12 & 14 ^ 6) <= 4 || !p0.f(e0)) && (v12 & 6) != 4 ? 0 : 1;
            int v14 = ((v12 & 0x70 ^ 0x30) <= 0x20 || !p0.g(z1)) && (v12 & 0x30) != 0x20 ? 0 : 1;
            Object object1 = p0.G();
            if((v14 | v13) != 0 || object1 == z4) {
                object1 = new C.d(e0, z1);
                p0.a0(object1);
            }
            Object object2 = p0.G();
            if(object2 == z4) {
                U.w w0 = new U.w(H.h(p0));
                p0.a0(w0);
                object2 = w0;
            }
            Object object3 = p0.k(f0.e);
            boolean z5 = ((Boolean)p0.k(f0.t)).booleanValue();
            int v15 = v6 & 0xFFF0 | v6 >> 6 & 0x70000 | v6 >> 6 & 0x380000 | v7 << 21 & 0x1C00000 | v7 << 21 & 0xE000000 | v6 & 0x70000000;
            dc.e e4 = ((U.w)object2).X;
            int v16 = ((v15 & 0x70 ^ 0x30) <= 0x20 || !p0.f(e0)) && (v15 & 0x30) != 0x20 ? 0 : 1;
            int v17 = ((v15 & 0x380 ^ 0x180) <= 0x100 || !p0.f(q00)) && (v15 & 0x180) != 0x100 ? 0 : 1;
            int v18 = ((v15 & 0x1C00 ^ 0xC00) <= 0x800 || !p0.g(z)) && (v15 & 0xC00) != 0x800 ? 0 : 1;
            int v19 = ((0xE000 & v15 ^ 0x6000) <= 0x4000 || !p0.g(z1)) && (v15 & 0x6000) != 0x4000 ? 0 : 1;
            int v20 = ((v15 & 0x380000 ^ 0x180000) <= 0x100000 || !p0.f(e3)) && (v15 & 0x180000) != 0x100000 ? 0 : 1;
            int v21 = ((v15 & 0x1C00000 ^ 0xC00000) <= 0x800000 || !p0.f(f2)) && (v15 & 0xC00000) != 0x800000 ? 0 : 1;
            int v22 = ((v15 & 0xE000000 ^ 0x6000000) <= 0x4000000 || !p0.f(g1)) && (v15 & 0x6000000) != 0x4000000 ? 0 : 1;
            if((v15 & 0x70000000 ^ 0x30000000) > 0x20000000) {
                i4 = i3;
                if(p0.f(i4)) {
                    v23 = 1;
                }
                else {
                    v23 = (v15 & 0x30000000) == 0x20000000 ? 1 : 0;
                }
            }
            else {
                i4 = i3;
                v23 = (v15 & 0x30000000) == 0x20000000 ? 1 : 0;
            }
            boolean z6 = p0.f(((GraphicsContext)object3));
            boolean z7 = p0.g(!z5);
            Object object4 = p0.G();
            if((v16 | v17 | v18 | v19 | v20 | v21 | v22 | v23 | z6 | z7) != 0 || object4 == z4) {
                v24 = v6 & 0x1C00;
                g3 = g1;
                i5 = i4;
                e5 = e3;
                f1 = f2;
                z8 = z4;
                v25 = v6;
                C.r r0 = new C.r(e0, z1, q00, z, ((Tb.c)object0), i5, g3, !z5, 0, e4, ((GraphicsContext)object3), e5, f1);
                p1 = p0;
                p1.a0(r0);
                object4 = r0;
            }
            else {
                g3 = g1;
                e5 = e3;
                f1 = f2;
                i5 = i4;
                z8 = z4;
                p1 = p0;
                v24 = v6 & 0x1C00;
                v25 = v6;
            }
            y.q0 q01 = z1 ? y.q0.X : y.q0.Y;
            Modifier modifier1 = androidx.compose.foundation.lazy.layout.b.d(modifier0.d(e0.k).d(e0.l), ((Tb.c)object0), ((E.W)object1), q01, z2, z);
            int v26 = v9 | v25 >> 18 & 0x70;
            int v27 = ((v26 & 14 ^ 6) <= 4 || !p1.f(e0)) && (v26 & 6) != 4 ? 0 : 1;
            if((v26 & 0x70 ^ 0x30) > 0x20 && p1.d(0)) {
                v11 = 1;
            }
            Object object5 = p0.G();
            if((v27 | v11) != 0 || object5 == z8) {
                object5 = new C.e(e0, 0);
                p1.a0(object5);
            }
            Object object6 = p1.k(f0.l);
            A.a(((Tb.c)object0), N4.j.I(A.i(modifier1, ((C.e)object5), e0.n, z, ((LayoutDirection)object6), q01, z2, p0, 0x200 | v24 | v25 & 0x380000).d(e0.m.k), e0, q01, z2, z, m00, e0.f, p0), e0.o, ((Function2)object4), p0, 0);
            v8 = 0;
            g2 = g3;
            i1 = i5;
            e2 = e5;
        }
        else {
            p0.K();
            v8 = v;
            e2 = e1;
            i1 = i0;
            f1 = f0;
            g2 = g0;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            new C.o(modifier0, e0, q00, z, z1, m00, z2, v8, e2, i1, f1, g2, function10, v1, v2, v3);
            l00.d = null;
        }
    }

    public static final void f(n n0, f9.b b0, Function3 function30, Function1 function10, Function0 function00, String s, U.p p0, int v) {
        F0.h h4;
        boolean z1;
        int v5;
        F0.i i1;
        j.f(n0, "state");
        j.f(b0, "audioPlayerState");
        j.f(function30, "onPlayPauseClicked");
        j.f(function10, "dialNumber");
        j.f(function00, "resendSMS");
        j.f(s, "mobile");
        p0.S(0x755523C5);
        int v1 = (v & 6) == 0 ? (p0.f(n0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.f(b0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.h(function30) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (p0.h(function10) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (p0.h(function00) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            v1 |= (p0.f(s) ? 0x20000 : 0x10000);
        }
        if((74899 & v1) != 74898 || !p0.x()) {
            long v2 = N4.o.I(0, Wb.c.b0);
            boolean z = Wb.a.c(n0.b, v2) <= 0;
            long v3 = Wb.a.g(n0.b, Wb.c.c0);
            Wb.a.e(n0.b);
            String s1 = String.format(" %01d:%02d", Arrays.copyOf(new Object[]{v3, ((int)(Wb.a.f(n0.b) ? 0 : ((int)(Wb.a.g(n0.b, Wb.c.b0) % 60L))))}, 2));
            g0.l l0 = g0.l.X;
            Modifier modifier0 = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.c(l0, 1.0f), 16.0f);
            B b1 = B.z.a(B.k.c, g0.b.m, p0, 0);
            int v4 = p0.P;
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
            F0.h h0 = F0.j.f;
            U.d.K(p0, b1, h0);
            F0.h h1 = F0.j.e;
            U.d.K(p0, g00, h1);
            F0.h h2 = F0.j.g;
            if(p0.O || !j.a(p0.G(), v4)) {
                m5.b.F(v4, p0, v4, h2);
            }
            F0.h h3 = F0.j.d;
            U.d.K(p0, modifier1, h3);
            B.C c0 = B.C.a;
            B.e.b(p0, A3.e.D(l0, 0.5f));
            e e0 = g0.b.n;
            if(!(n0.d instanceof ya.p) || !((ya.p)n0.d).b) {
                i1 = i0;
                v5 = v1;
                z1 = z;
                h4 = h0;
                p0.Q(0x490E1B7F);
                M6.b.d(yc.l.y(0x7F08029F, p0, 0), null, androidx.compose.foundation.layout.a.n(c0.a(androidx.compose.foundation.layout.c.e(l0, 128.0f), e0), 0.0f, 0.0f, 0.0f, 16.0f, 7), null, null, 0.0f, null, p0, 0x30, 120);  // drawable:ic_sms
                String s3 = w.S(0x7F120257, p0);  // string:magic_link_description_part_1 "We have sent you a link via SMS to"
                O o1 = ((db.a)p0.k(db.b.d)).h;
                m2.b(s3, androidx.compose.foundation.layout.a.n(c0.a(l0, e0), 0.0f, 0.0f, 0.0f, 8.0f, 7), 0L, 0L, null, null, null, 0L, null, new Z0.i(3), 0L, 0, false, 0, 0, null, o1, p0, 0, 0, 0xFDFC);
            }
            else {
                p0.Q(0x490465CE);
                i1 = i0;
                v5 = v1;
                z1 = z;
                h4 = h0;
                M6.b.d(yc.l.y(0x7F0802A0, p0, 0), null, androidx.compose.foundation.layout.a.n(c0.a(androidx.compose.foundation.layout.c.e(l0, 128.0f), e0), 0.0f, 0.0f, 0.0f, 16.0f, 7), null, null, 0.0f, null, p0, 0x30, 120);  // drawable:ic_sms_wait
                String s2 = w.S(0x7F120258, p0);  // string:magic_link_description_part_1_link_resent "We have sent you a new link via 
                                                  // SMS to "
                O o0 = ((db.a)p0.k(db.b.d)).h;
                m2.b(s2, androidx.compose.foundation.layout.a.n(c0.a(l0, e0), 0.0f, 0.0f, 0.0f, 8.0f, 7), 0L, 0L, null, null, null, 0L, null, new Z0.i(3), 0L, 0, false, 0, 0, null, o0, p0, 0, 0, 0xFDFC);
            }
            p0.p(false);
            String s4 = l1.d(s, null);
            O o2 = ((db.a)p0.k(db.b.d)).l;
            Modifier modifier2 = androidx.compose.foundation.layout.a.n(c0.a(l0, e0), 0.0f, 0.0f, 0.0f, 32.0f, 7);
            Z0.i i2 = new Z0.i(3);
            O0 o00 = db.b.d;
            m2.b(s4, modifier2, 0L, 0L, null, null, null, 0L, null, i2, 0L, 0, false, 0, 0, null, o2, p0, 0, 0, 0xFDFC);
            String s5 = w.S(0x7F120259, p0);  // string:magic_link_description_part_2 "To continue, please click on the link in the 
                                              // SMS sent to that mobile number"
            O o3 = ((db.a)p0.k(o00)).h;
            m2.b(s5, c0.a(l0, e0), 0L, 0L, null, null, null, 0L, null, new Z0.i(3), 0L, 0, false, 0, 0, null, o3, p0, 0, 0, 0xFDFC);
            Modifier modifier3 = c0.a(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.a.n(l0, 0.0f, 48.0f, 0.0f, 0.0f, 13), yc.d.h(0x7F060013, p0), H.f.b(8.0f)), e0);  // color:Gray100
            K k0 = B.r.e(g0.b.a, false);
            int v6 = p0.P;
            g0 g01 = p0.m();
            Modifier modifier4 = g0.a.d(p0, modifier3);
            p0.U();
            if(p0.O) {
                p0.l(i1);
            }
            else {
                p0.d0();
            }
            U.d.K(p0, k0, h4);
            U.d.K(p0, g01, h1);
            if(p0.O || !j.a(p0.G(), v6)) {
                m5.b.F(v6, p0, v6, h2);
            }
            U.d.K(p0, modifier4, h3);
            p0.Q(0x614A5CF9);
            Object object0 = p0.G();
            Z z2 = U.l.a;
            if(object0 == z2) {
                object0 = new lb.j(24);
                p0.a0(object0);
            }
            p0.p(false);
            Modifier modifier5 = androidx.compose.foundation.layout.a.n(l0, 0.0f, 0.0f, 16.0f, 0.0f, 11);
            N4.h.f(b0, function30, ((Function1)object0), "magic-link-explanation", n0.c, modifier5, 0L, 0L, 0L, 0L, p0, v5 >> 3 & 14 | 200064 | v5 >> 3 & 0x70, 960);
            p0.p(true);
            String s6 = w.S(0x7F120263, p0);  // string:magic_link_resend_link "Resend link%s"
            if(z1) {
                s1 = "";
            }
            String s7 = String.format(s6, Arrays.copyOf(new Object[]{s1}, 1));
            O o4 = ((db.a)p0.k(o00)).f;
            p0.Q(0x5D33087A);
            long v7 = z1 ? yc.d.h(0x7F060048, p0) : v.b;  // color:WaveBlue500
            p0.p(false);
            Modifier modifier6 = c0.a(l0, e0);
            p0.Q(0x5D332A67);
            Object object1 = p0.G();
            if((0xE000 & v5) == 0x4000 || object1 == z2) {
                object1 = new N(function00, 12);
                p0.a0(object1);
            }
            p0.p(false);
            m2.b(s7, androidx.compose.foundation.layout.a.n(androidx.compose.foundation.a.d(modifier6, z1, null, ((Function0)object1), 6), 0.0f, 48.0f, 0.0f, 0.0f, 13), v7, 0L, null, null, null, 0L, null, new Z0.i(3), 0L, 0, false, 0, 0, null, o4, p0, 0, 0, 0xFDF8);
            B.e.b(p0, A3.e.D(l0, 1.0f));
            p0.Q(0x5D333CBB);
            Object object2 = p0.G();
            if((((v5 & 14) == 4 ? 1 : 0) | ((v5 & 0x1C00) == 0x800 ? 1 : 0)) != 0 || object2 == z2) {
                object2 = new Ca.j(function10, 18, n0);
                p0.a0(object2);
            }
            p0.p(false);
            M6.b.m(((Function0)object2), null, true, null, p0, 0x6180);
            p0.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Ca.k(n0, b0, function30, function10, function00, s, v);
        }
    }

    public static final void g(n n0, ya.r r0, U.p p0, int v) {
        j.f(n0, "state");
        j.f(r0, "step");
        p0.S(41039138);
        int v1 = (v & 6) == 0 ? (p0.f(n0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.h(r0) ? 0x20 : 16);
        }
        if((v1 & 19) != 18 || !p0.x()) {
            Modifier modifier0 = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.c(g0.l.X, 1.0f), 16.0f);
            B b0 = B.z.a(B.k.c, g0.b.m, p0, 0);
            int v2 = p0.P;
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
            F0.h h0 = F0.j.g;
            if(p0.O || !j.a(p0.G(), v2)) {
                m5.b.F(v2, p0, v2, h0);
            }
            U.d.K(p0, modifier1, F0.j.d);
            if(ya.m.a[r0.c.ordinal()] == 1) {
                p0.Q(0x62AAC5DF);
                w.b(n0, r0, p0, v1 << 3 & 0x380 | (v1 << 3 & 0x70 | 6));
            }
            else {
                p0.Q(0x62AACCCF);
                w.n(n0, p0, v1 << 3 & 0x70 | 6);
            }
            p0.p(false);
            p0.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new ya.l(n0, r0, v, 0);
        }
    }

    public static final void h(n n0, f9.b b0, Function3 function30, Function0 function00, Function1 function10, Function0 function01, String s, U.p p0, int v) {
        j.f(n0, "state");
        j.f(b0, "audioPlayerState");
        j.f(function30, "onPlayPauseClicked");
        j.f(function00, "onBackClicked");
        j.f(function10, "dialNumber");
        j.f(function01, "resendSMS");
        j.f(s, "mobile");
        p0.S(716033507);
        int v1 = (v & 6) == 0 ? (p0.f(n0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.f(b0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.h(function30) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (p0.h(function00) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (p0.h(function10) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            v1 |= (p0.h(function01) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v) == 0) {
            v1 |= (p0.f(s) ? 0x100000 : 0x80000);
        }
        if((0x92493 & v1) != 0x92492 || !p0.x()) {
            Modifier modifier0 = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.c(g0.l.X, 1.0f), 16.0f);
            p0.Q(0xBC03DDCF);
            Object object0 = p0.G();
            if(object0 == U.l.a) {
                object0 = new lb.j(23);
                p0.a0(object0);
            }
            p0.p(false);
            Modifier modifier1 = M0.k.a(modifier0, false, ((Function1)object0));
            B b1 = B.z.a(B.k.c, g0.b.m, p0, 0);
            int v2 = p0.P;
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
            U.d.K(p0, b1, F0.j.f);
            U.d.K(p0, g00, F0.j.e);
            F0.h h0 = F0.j.g;
            if(p0.O || !j.a(p0.G(), v2)) {
                m5.b.F(v2, p0, v2, h0);
            }
            U.d.K(p0, modifier2, F0.j.d);
            K0.a(function00, null, false, null, ya.b.a, p0, v1 >> 9 & 14 | 0x6000, 14);
            M6.b b2 = n0.d;
            if(b2 instanceof ya.r) {
                p0.Q(0xD27340F0);
                w.g(n0, ((ya.r)b2), p0, v1 & 14);
            }
            else {
                p0.Q(-764108493);
                w.f(n0, b0, function30, function10, function01, s, p0, v1 & 0x3FE | v1 >> 3 & 0x1C00 | 0xE000 & v1 >> 3 | v1 >> 3 & 0x70000);
            }
            p0.p(false);
            p0.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new pa.c(n0, b0, function30, function00, function10, function01, s, v);
        }
    }

    public static final void i(ja.m m0, Function0 function00, Function0 function01, Function3 function30, U.p p0, int v) {
        j.f(function00, "onSheetDismissed");
        j.f(function01, "onUseOverdraftClicked");
        j.f(function30, "onPlayPauseClicked");
        p0.S(0x59BB6C30);
        int v1 = (v & 6) == 0 ? (p0.h(m0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.h(function00) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.h(function01) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (p0.h(function30) ? 0x800 : 0x400);
        }
        if((v1 & 0x493) != 1170 || !p0.x()) {
            N4.h.c("", m0 != null, function00, null, false, null, null, c0.c.c(-369018604, new Aa.l(m0, function01, function30, 9), p0), p0, v1 << 3 & 0x380 | 0xC00006, 120);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Aa.c(m0, function00, function01, function30, v, 8);
        }
    }

    public static final void j(ja.m m0, Function0 function00, Function3 function30, U.p p0, int v) {
        p0.S(0x6EEE354F);
        int v1 = (v & 6) == 0 ? (p0.h(m0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.h(function00) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.h(function30) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) != 0x92 || !p0.x()) {
            g0.l l0 = g0.l.X;
            Modifier modifier0 = androidx.compose.foundation.layout.a.l(l0, 20.0f, 0.0f, 2);
            X x0 = new X(3, 4);
            Modifier modifier1 = androidx.compose.foundation.layout.a.n(g0.a.b(modifier0, G0.j.e0, x0), 0.0f, 0.0f, 0.0f, 16.0f, 7);
            B b0 = B.z.a(B.k.c, g0.b.n, p0, 0x30);
            int v2 = p0.P;
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
            U.d.K(p0, b0, F0.j.f);
            U.d.K(p0, g00, F0.j.e);
            F0.h h0 = F0.j.g;
            if(p0.O || !j.a(p0.G(), v2)) {
                m5.b.F(v2, p0, v2, h0);
            }
            U.d.K(p0, modifier2, F0.j.d);
            M6.b.d(yc.l.y(0x7F0801EB, p0, 0), null, null, null, null, 0.0f, null, p0, 0x30, 0x7C);  // drawable:ic_button_overdraft
            B.e.b(p0, androidx.compose.foundation.layout.c.e(l0, 20.0f));
            String s = w.T(0x7F1202E6, new Object[]{(m0 == null ? "--" : M0.a(m0.a))}, p0);  // string:overdraft_intro_sheet_title "You’ve been offered %s in Lebalma!"
            O o0 = ((db.a)p0.k(db.b.d)).n;
            m2.b(s, null, 0L, 0L, null, null, null, 0L, null, new Z0.i(3), 0L, 0, false, 0, 0, null, o0, p0, 0, 0, 0xFDFE);
            g0.l l1 = l0;
            B.e.b(p0, androidx.compose.foundation.layout.c.e(l1, 24.0f));
            List list0 = m0 == null ? null : m0.d;
            p0.Q(0xCC9D2E4B);
            if(list0 != null) {
                for(Object object0: list0) {
                    x0 x00 = v0.b(B.k.a, g0.b.j, p0, 0);
                    int v3 = p0.P;
                    g0 g01 = p0.m();
                    Modifier modifier3 = g0.a.d(p0, l1);
                    F0.k.a.getClass();
                    F0.i i1 = F0.j.b;
                    p0.U();
                    if(p0.O) {
                        p0.l(i1);
                    }
                    else {
                        p0.d0();
                    }
                    U.d.K(p0, x00, F0.j.f);
                    U.d.K(p0, g01, F0.j.e);
                    F0.h h1 = F0.j.g;
                    if(p0.O || !j.a(p0.G(), v3)) {
                        m5.b.F(v3, p0, v3, h1);
                    }
                    U.d.K(p0, modifier3, F0.j.d);
                    w.d(((X4)object0).a, p0, 0);
                    B.e.b(p0, androidx.compose.foundation.layout.c.n(l1, 16.0f));
                    m2.b(((X4)object0).b, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, p0, 0, 0, 0x1FFFE);
                    p0.p(true);
                    B.e.b(p0, androidx.compose.foundation.layout.c.e(l1, 24.0f));
                    l1 = l1;
                }
            }
            p0.p(false);
            p0.Q(-862105929);
            if(m0 != null) {
                p0.Q(-862100056);
                Object object1 = p0.G();
                if(object1 == U.l.a) {
                    object1 = new T3.d(28);
                    p0.a0(object1);
                }
                p0.p(false);
                N4.h.f(m0.c, function30, ((Function1)object1), "", m0.b, null, 0L, 0L, 0L, 0L, p0, v1 >> 3 & 0x70 | 0xD80, 0x3E0);
                B.e.b(p0, androidx.compose.foundation.layout.c.e(l1, 20.0f));
            }
            p0.p(false);
            M6.b.j(function00, null, false, false, ja.b.a, p0, v1 >> 3 & 14 | 0x6000, 14);
            p0.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new D(m0, function00, function30, v, 17);
        }
    }

    public static final void k(int v, U.p p0, String s, Function0 function00, boolean z) {
        j.f(s, "qrUrl");
        j.f(function00, "onClick");
        p0.S(298343010);
        int v1 = (v & 6) == 0 ? (p0.f(s) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.g(z) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.h(function00) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) != 0x92 || !p0.x()) {
            g0.l l0 = g0.l.X;
            K k0 = B.r.e(g0.b.a, false);
            int v2 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier0 = g0.a.d(p0, l0);
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
            if(p0.O || !j.a(p0.G(), v2)) {
                m5.b.F(v2, p0, v2, h2);
            }
            F0.h h3 = F0.j.d;
            U.d.K(p0, modifier0, h3);
            androidx.compose.foundation.layout.b b0 = androidx.compose.foundation.layout.b.a;
            g g0 = g0.b.e;
            Modifier modifier1 = androidx.compose.ui.platform.c.a(g0.a.e(androidx.compose.foundation.layout.a.c(androidx.compose.foundation.a.d(N4.o.j(androidx.compose.foundation.layout.a.l(androidx.compose.foundation.layout.c.d(l0, 1.0f), 48.0f, 0.0f, 2), H.f.b(16.0f)), false, null, function00, 7), 1.736842f, false), 2.0f), "QRCardView");
            K k1 = B.r.e(g0, false);
            int v3 = p0.P;
            g0 g01 = p0.m();
            Modifier modifier2 = g0.a.d(p0, modifier1);
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            U.d.K(p0, k1, h0);
            U.d.K(p0, g01, h1);
            if(p0.O || !j.a(p0.G(), v3)) {
                m5.b.F(v3, p0, v3, h2);
            }
            U.d.K(p0, modifier2, h3);
            M6.b.e(M6.b.W(0x7F0801D8, p0), null, androidx.compose.foundation.layout.c.d(l0, 1.0f), D0.i.b, null, p0, 25008, 104);  // drawable:ic_background_patterned
            Modifier modifier3 = b0.a(androidx.compose.foundation.layout.c.b(androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.a.l(l0, 0.0f, 10.0f, 1), 1.0f, false), 1.0f), g0);
            w.l(v.e, modifier3, new B.r0(10.0f, 10.0f, 10.0f, (z ? 0.0f : 10.0f)), false, c0.c.c(0xB06DB0AE, new Ha.p(s, z), p0), p0, 0x6006, 8);
            p0.p(true);
            B.r.a(androidx.compose.foundation.a.b(N4.o.j(b0.a(androidx.compose.foundation.layout.c.d(androidx.compose.foundation.layout.c.e(l0, 70.0f), 1.0f), g0.b.g), H.f.d(20.0f, 20.0f, 0.0f, 0.0f, 12)), v.e, M.a), p0, 0);
            p0.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Aa.k(s, z, function00, v);
        }
    }

    public static final void l(long v, Modifier modifier0, q0 q00, boolean z, c0.b b0, U.p p0, int v1, int v2) {
        boolean z1;
        q0 q01;
        Modifier modifier1;
        p0.S(570076775);
        int v3 = (v1 & 6) == 0 ? (p0.e(v) ? 4 : 2) | v1 : v1;
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
        if((v2 & 4) != 0) {
            v3 |= 0x180;
            q01 = q00;
        }
        else if((v1 & 0x180) == 0) {
            q01 = q00;
            v3 |= (p0.f(q01) ? 0x100 : 0x80);
        }
        else {
            q01 = q00;
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
            z1 = z;
        }
        else if((v1 & 0xC00) == 0) {
            z1 = z;
            v3 |= (p0.g(z1) ? 0x800 : 0x400);
        }
        else {
            z1 = z;
        }
        if((v1 & 0x6000) == 0) {
            v3 |= (p0.h(b0) ? 0x4000 : 0x2000);
        }
        if((v3 & 9363) != 9362 || !p0.x()) {
            Modifier modifier2 = g0.l.X;
            if((v2 & 2) != 0) {
                modifier1 = modifier2;
            }
            if((v2 & 4) != 0) {
                q01 = new B.r0(16.0f, 16.0f, 16.0f, 16.0f);
            }
            if((v2 & 8) != 0) {
                z1 = true;
            }
            Modifier modifier3 = androidx.compose.foundation.layout.c.d(modifier1, 1.0f);
            if(z1) {
                modifier2 = N4.o.j(modifier2, H.f.b(10.0f));
            }
            Modifier modifier4 = androidx.compose.foundation.layout.a.i(androidx.compose.foundation.a.b(modifier3.d(modifier2), v, M.a), q01);
            K k0 = B.r.e(g0.b.a, false);
            int v4 = p0.P;
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
            F0.h h0 = F0.j.g;
            if(p0.O || !j.a(p0.G(), v4)) {
                m5.b.F(v4, p0, v4, h0);
            }
            U.d.K(p0, modifier5, F0.j.d);
            b0.j(p0, ((int)(v3 >> 12 & 14)));
            p0.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Wa.e(v, modifier1, q01, z1, b0, v1, v2);
        }
    }

    public static final long m(float f, float f1) {
        return ((long)Float.floatToRawIntBits(f1)) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(f)) << 0x20;
    }

    public static final void n(n n0, U.p p0, int v) {
        j.f(n0, "state");
        p0.S(0x29060A06);
        if((((v & 0x30) == 0 ? (p0.f(n0) ? 0x20 : 16) | v : v) & 17) != 16 || !p0.x()) {
            M6.b.d(yc.l.y(0x7F080271, p0, 0), null, null, null, null, 0.0f, null, p0, 0x30, 0x7C);  // drawable:ic_phone_with_x
            String s = w.S(0x7F120266, p0);  // string:magic_link_unknown_error_title "Verification failed"
            O o0 = ((db.a)p0.k(db.b.d)).n;
            m2.b(s, androidx.compose.foundation.layout.a.n(g0.l.X, 0.0f, 16.0f, 0.0f, 0.0f, 13), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o0, p0, 0x30, 0, 0xFFFC);
            m2.b(w.S(0x7F120265, p0), androidx.compose.foundation.layout.a.n(g0.l.X, 0.0f, 16.0f, 0.0f, 16.0f, 5), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((db.a)p0.k(db.b.d)).h, p0, 0x30, 0, 0xFFFC);  // string:magic_link_unknown_error_description "Someone tried to access your Wave account 
                                                                                                                                                                                                                                      // on another device but something went wrong."
            w.a(w.S(0x7F120253, p0), n0.a, p0, 0);  // string:magic_link_call_support "Please call Wave support at "
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Aa.d(v, 16, n0);
        }
    }

    public static final Object[] o(Object[] arr_object, int v, Object object0, Object object1) {
        Object[] arr_object1 = new Object[arr_object.length + 2];
        Bb.n.l0(0, v, 6, arr_object, arr_object1);
        Bb.n.i0(v + 2, v, arr_object.length, arr_object, arr_object1);
        arr_object1[v] = object0;
        arr_object1[v + 1] = object1;
        return arr_object1;
    }

    public static final void p(tc.a a0, tc.c c0, String s) {
        tc.d.i.fine(c0.b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{s}, 1)) + ": " + a0.a);
    }

    public static final Object[] q(int v, Object[] arr_object) {
        Object[] arr_object1 = new Object[arr_object.length - 2];
        Bb.n.l0(0, v, 6, arr_object, arr_object1);
        Bb.n.i0(v, v + 2, arr_object.length, arr_object, arr_object1);
        return arr_object1;
    }

    public static final Object[] r(int v, Object[] arr_object) {
        Object[] arr_object1 = new Object[arr_object.length - 1];
        Bb.n.l0(0, v, 6, arr_object, arr_object1);
        Bb.n.i0(v, v + 1, arr_object.length, arr_object, arr_object1);
        return arr_object1;
    }

    public static final Object s(ListenableFuture listenableFuture0, Fb.j j0) {
        try {
            if(listenableFuture0.isDone()) {
                return f1.h.g(listenableFuture0);
            }
        }
        catch(ExecutionException executionException0) {
            Throwable throwable0 = executionException0.getCause();
            if(throwable0 != null) {
                throw throwable0;
            }
            j.n();
            throw null;
        }
        Xb.k k0 = new Xb.k(1, N4.j.w(j0));
        listenableFuture0.a(new J2.l(listenableFuture0, k0, 1), f1.m.X);
        k0.y(new V2.a(8, listenableFuture0));
        return k0.u();
    }

    public static final void t(long v, y.q0 q00) {
        if(q00 == y.q0.X) {
            if(a1.a.g(v) == 0x7FFFFFFF) {
                throw new IllegalStateException("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
            }
            return;
        }
        if(a1.a.h(v) == 0x7FFFFFFF) {
            throw new IllegalStateException("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static final MutableState u(A.k k0, U.p p0) {
        Object object0 = p0.G();
        Z z0 = U.l.a;
        if(object0 == z0) {
            object0 = U.d.D(Boolean.FALSE, Z.e);
            p0.a0(object0);
        }
        Object object1 = p0.G();
        if(object1 == z0) {
            object1 = new A.p(k0, ((MutableState)object0), null);
            p0.a0(object1);
        }
        H.d(p0, k0, ((Function2)object1));
        return (MutableState)object0;
    }

    public static final u v(Context context0, I2.b b0) {
        q2.u u0;
        j.f(context0, "context");
        T2.a a0 = new T2.a(b0.c);
        Context context1 = context0.getApplicationContext();
        j.e(context1, "context.applicationContext");
        S2.h h0 = a0.a;
        j.e(h0, "workTaskExecutor.serialTaskExecutor");
        boolean z = context0.getResources().getBoolean(0x7F050008);  // bool:workmanager_test_configuration
        I2.o o0 = b0.d;
        j.f(o0, "clock");
        Class class0 = WorkDatabase.class;
        if(z) {
            u0 = new q2.u(context1, class0, null);
            u0.j = true;
        }
        else {
            u0 = w.w(context1, class0, "androidx.work.workdb");
            u0.i = new J2.q(context1);
        }
        u0.g = h0;
        J2.a a1 = new J2.a(o0);
        u0.d.add(a1);
        u0.a(new r2.a[]{J2.c.h});
        u0.a(new r2.a[]{new J2.f(context1, 2, 3)});
        u0.a(new r2.a[]{J2.c.i});
        u0.a(new r2.a[]{J2.c.j});
        u0.a(new r2.a[]{new J2.f(context1, 5, 6)});
        u0.a(new r2.a[]{J2.c.k});
        u0.a(new r2.a[]{J2.c.l});
        u0.a(new r2.a[]{J2.c.m});
        u0.a(new r2.a[]{new J2.f(context1)});
        u0.a(new r2.a[]{new J2.f(context1, 10, 11)});
        u0.a(new r2.a[]{J2.c.d});
        u0.a(new r2.a[]{J2.c.e});
        u0.a(new r2.a[]{J2.c.f});
        u0.a(new r2.a[]{J2.c.g});
        u0.a(new r2.a[]{new J2.f(context1, 21, 22)});
        u0.l = false;
        u0.m = true;
        WorkDatabase workDatabase0 = (WorkDatabase)u0.b();
        Context context2 = context0.getApplicationContext();
        j.e(context2, "context.applicationContext");
        P2.m m0 = new P2.m(context2, a0);
        J2.e e0 = new J2.e(context0.getApplicationContext(), b0, a0, workDatabase0);
        Object object0 = J2.v.g0.f(context0, b0, a0, workDatabase0, m0, e0);
        return new u(context0.getApplicationContext(), b0, a0, workDatabase0, ((List)object0), e0, m0);
    }

    public static final q2.u w(Context context0, Class class0, String s) {
        j.f(context0, "context");
        if(s == null || Vb.j.c0(s)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new q2.u(context0, class0, s);
    }

    public static final void x(String s) {
        File file0 = w.I();
        if(file0 != null && s != null) {
            new File(file0, s).delete();
        }
    }

    public static final boolean y(int v, int v1) [...] // Inlined contents

    public static final Object z(R6 r60, c c0) {
        Na.b b0;
        if(c0 instanceof Na.b) {
            b0 = (Na.b)c0;
            int v = b0.c0;
            if((v & 0x80000000) == 0) {
                b0 = new Na.b(c0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
            }
            else {
                b0.c0 = v ^ 0x80000000;
            }
        }
        else {
            b0 = new Na.b(c0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
        }
        Object object0 = b0.b0;
        Object object1 = a.X;
        switch(b0.c0) {
            case 0: {
                f.b0(object0);
                Q9 q90 = new Q9();  // initializer: Ljava/lang/Object;-><init>()V
                b0.c0 = 1;
                object0 = R6.d(r60, q90, H6.b0, null, b0, 4);
                return object0 == object1 ? object1 : ((K9)((y6)object0).b).a.c.c;
            }
            case 1: {
                f.b0(object0);
                return ((K9)((y6)object0).b).a.c.c;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

