package a5;

import Aa.s;
import Ab.t;
import Bb.A;
import Bb.r;
import D0.K;
import D0.u;
import E.F;
import E7.g;
import Fb.c;
import G0.f0;
import I.O;
import I.y0;
import M4.h;
import M4.l;
import N.B1;
import N.G0;
import N.H0;
import N.Y;
import N.w1;
import N.z1;
import Nb.j;
import Q0.e;
import R.j0;
import U.H;
import U.Z;
import U.g0;
import U.l0;
import U.n;
import W5.f;
import Y8.R6;
import Y8.V;
import Y8.k3;
import Y8.m3;
import Y8.n3;
import Y8.o3;
import Y8.p3;
import Y8.y6;
import a9.S7;
import a9.T7;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.platform.AccessibilityManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.LifecycleOwner;
import c.L;
import c.M;
import com.sendwave.util.Country;
import ha.J;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import la.k;
import m7.a;
import m7.b;
import m7.i;
import o.K0;
import o.M0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import q9.L0;
import q9.p1;
import r3.d;
import r3.o;
import v3.p;
import v3.q;
import v3.v;

public abstract class w implements e {
    public static int X = 0;
    public static long Y = -1L;
    public static long Z = -1L;
    public static long b0 = -1L;
    public static String c0 = "";
    public static String d0 = "";
    public static String e0 = "NoCarrier";
    public static String f0 = "";
    public static Locale g0;
    public static String[] h0;

    public static b A(String s, T9.b b0) {
        a a0 = b.a(U7.a.class);
        a0.c = 1;
        a0.a(i.b(Context.class));
        a0.g = new g(s, 4, b0);
        return a0.b();
    }

    public static final Object B(Object object0) {
        if(object0 instanceof JSONObject) {
            return w.m0(((JSONObject)object0));
        }
        if(object0 instanceof JSONArray) {
            j.f(((JSONArray)object0), "<this>");
            ArrayList arrayList0 = new ArrayList();
            int v = ((JSONArray)object0).length();
            if(v > 0) {
                for(int v1 = 0; true; ++v1) {
                    arrayList0.add(w.B(((JSONArray)object0).get(v1)));
                    if(v1 + 1 >= v) {
                        break;
                    }
                }
            }
            return arrayList0;
        }
        if(object0 instanceof BigDecimal) {
            return ((BigDecimal)object0).doubleValue();
        }
        return j.a(object0, JSONObject.NULL) ? null : object0;
    }

    public static final String C(Context context0) {
        if(context0 == null) {
            return "null";
        }
        return context0 == context0.getApplicationContext() ? "unknown" : context0.getClass().getSimpleName();
    }

    public static final String D(Context context0) {
        try {
            N4.j.J();
            String s = l.e;
            if(s != null) {
                return s;
            }
            ApplicationInfo applicationInfo0 = context0.getApplicationInfo();
            int v = applicationInfo0.labelRes;
            if(v == 0) {
                return applicationInfo0.nonLocalizedLabel.toString();
            }
            String s1 = context0.getString(v);
            j.e(s1, "context.getString(stringId)");
            return s1;
        }
        catch(Exception unused_ex) {
            return "";
        }
    }

    public static final JSONObject E() {
        Class class0 = w.class;
        if(f5.a.b(class0)) {
            return null;
        }
        try {
            String s = l.a().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
            if(s != null) {
                try {
                    return new JSONObject(s);
                }
                catch(JSONException unused_ex) {
                }
            }
        }
        catch(Throwable throwable0) {
            f5.a.a(throwable0, class0);
        }
        return null;
    }

    public static J F(Country country0) {
        if(country0.equals(L0.d)) {
            return new J(false, false, true, true, true, false, true, false, false, false, false, 0L, 4003);
        }
        if(country0.equals(L0.e)) {
            return new J(false, false, true, false, true, false, false, false, false, false, false, 0L, 0xFEB);
        }
        if(country0.equals(L0.f)) {
            return new J(false, true, false, true, false, false, false, false, false, false, false, 0L, 0xFF5);
        }
        if(country0.equals(L0.h)) {
            return new J(false, true, false, true, false, false, false, false, false, false, false, 0L, 0xFF5);
        }
        if(country0.equals(L0.i)) {
            return new J(false, true, false, false, false, false, false, false, false, false, false, 0L, 0xFFD);
        }
        return country0.equals(L0.l) ? new J(false, true, false, true, false, false, false, false, true, false, false, 0L, 0xEF5) : new J(false, false, false, false, false, false, false, false, false, false, false, 0L, 0xFFF);
    }

    public static final Object G(R6 r60, c c0) {
        la.c c1;
        if(c0 instanceof la.c) {
            c1 = (la.c)c0;
            int v = c1.c0;
            if((v & 0x80000000) == 0) {
                c1 = new la.c(c0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
            }
            else {
                c1.c0 = v ^ 0x80000000;
            }
        }
        else {
            c1 = new la.c(c0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
        }
        Object object0 = c1.b0;
        Object object1 = Eb.a.X;
        switch(c1.c0) {
            case 0: {
                f.b0(object0);
                p3 p30 = new p3();  // initializer: Ljava/lang/Object;-><init>()V
                c1.c0 = 1;
                object0 = R6.d(r60, p30, null, null, c1, 6);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        o3 o30 = ((k3)((y6)object0).b).a;
        if(o30 == null) {
            throw new V(null);
        }
        m3 m30 = o30.b;
        ArrayList arrayList0 = new ArrayList(r.b0(m30.a));
        for(Object object2: m30.a) {
            arrayList0.add(((n3)object2).b);
        }
        return new k(arrayList0, m30.b.b);
    }

    public static final Method H(Class class0, String s, Class[] arr_class) {
        j.f(arr_class, "parameterTypes");
        try {
            return class0.getMethod(s, ((Class[])Arrays.copyOf(arr_class, arr_class.length)));
        }
        catch(NoSuchMethodException unused_ex) {
            return null;
        }
    }

    public static final Method I(String s, String s1, Class[] arr_class) {
        try {
            return w.H(Class.forName(s), s1, ((Class[])Arrays.copyOf(arr_class, arr_class.length)));
        }
        catch(ClassNotFoundException unused_ex) {
            return null;
        }
    }

    public static final Object J(JSONObject jSONObject0, String s, String s1) {
        Object object0 = jSONObject0.opt(s);
        if(object0 != null && object0 instanceof String) {
            object0 = new JSONTokener(((String)object0)).nextValue();
        }
        if(object0 != null && !(object0 instanceof JSONObject) && !(object0 instanceof JSONArray)) {
            if(s1 == null) {
                throw new h("Got an unexpected non-JSON object.");
            }
            JSONObject jSONObject1 = new JSONObject();
            jSONObject1.putOpt(s1, object0);
            return jSONObject1;
        }
        return object0;
    }

    public static String K(String s, byte[] arr_b) {
        MessageDigest messageDigest0;
        try {
            messageDigest0 = MessageDigest.getInstance(s);
        }
        catch(NoSuchAlgorithmException unused_ex) {
            return null;
        }
        j.e(messageDigest0, "hash");
        messageDigest0.update(arr_b);
        byte[] arr_b1 = messageDigest0.digest();
        StringBuilder stringBuilder0 = new StringBuilder();
        j.e(arr_b1, "digest");
        int v = 0;
        while(v < arr_b1.length) {
            int v1 = arr_b1[v];
            ++v;
            stringBuilder0.append(Integer.toHexString(v1 >> 4 & 15));
            stringBuilder0.append(Integer.toHexString(v1 & 15));
        }
        String s1 = stringBuilder0.toString();
        j.e(s1, "builder.toString()");
        return s1;
    }

    public static final Object L(Object object0, Method method0, Object[] arr_object) {
        try {
            return method0.invoke(object0, Arrays.copyOf(arr_object, arr_object.length));
        }
        catch(IllegalAccessException | InvocationTargetException unused_ex) {
            return null;
        }
    }

    public static final boolean M() {
        try {
            Intent intent0 = new Intent("android.intent.action.VIEW");
            intent0.setData(Uri.parse(String.format("fb%s://applinks", Arrays.copyOf(new Object[]{l.b()}, 1))));
            List list0 = l.a().getPackageManager().queryIntentActivities(intent0, 0x10000);
            j.e(list0, "packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
            for(Object object0: list0) {
                if(!j.a("com.wave.personal", ((ResolveInfo)object0).activityInfo.packageName)) {
                    continue;
                }
                return true;
            }
        }
        catch(Exception unused_ex) {
        }
        return false;
    }

    public static final boolean N() {
        JSONObject jSONObject0;
        Class class0 = w.class;
        if(f5.a.b(class0)) {
            return false;
        }
        try {
            jSONObject0 = w.E();
            if(jSONObject0 == null) {
                return false;
            }
            goto label_6;
        }
        catch(Throwable throwable0) {
            f5.a.a(throwable0, class0);
        }
        return false;
        try {
        label_6:
            JSONArray jSONArray0 = jSONObject0.getJSONArray("data_processing_options");
            int v = jSONArray0.length();
            if(v > 0) {
                for(int v1 = 0; true; ++v1) {
                    String s = jSONArray0.getString(v1);
                    j.e(s, "options.getString(i)");
                    String s1 = s.toLowerCase();
                    j.e(s1, "(this as java.lang.String).toLowerCase()");
                    if(s1.equals("ldu")) {
                        return true;
                    }
                    if(v1 + 1 >= v) {
                        break;
                    }
                }
            }
            return false;
        }
        catch(Exception unused_ex) {
            return false;
        }
        catch(Throwable throwable0) {
        }
        f5.a.a(throwable0, class0);
        return false;
    }

    public static boolean O(Context context0) {
        Method method0 = w.I("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", new Class[]{Context.class});
        if(method0 == null) {
            return false;
        }
        Object object0 = w.L(null, method0, new Object[]{context0});
        return object0 instanceof Integer && j.a(object0, 0);
    }

    public static final boolean P(String s) {
        return s == null || s.length() == 0;
    }

    public static final ArrayList Q(JSONArray jSONArray0) {
        ArrayList arrayList0 = new ArrayList();
        int v = jSONArray0.length();
        if(v > 0) {
            for(int v1 = 0; true; ++v1) {
                arrayList0.add(jSONArray0.getString(v1));
                if(v1 + 1 >= v) {
                    break;
                }
            }
        }
        return arrayList0;
    }

    public static final HashMap R(String s) {
        if(s.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap hashMap0 = new HashMap();
            JSONObject jSONObject0 = new JSONObject(s);
            Iterator iterator0 = jSONObject0.keys();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                j.e(((String)object0), "key");
                String s1 = jSONObject0.getString(((String)object0));
                j.e(s1, "jsonObject.getString(key)");
                hashMap0.put(((String)object0), s1);
            }
            return hashMap0;
        }
        catch(JSONException unused_ex) {
            return new HashMap();
        }
    }

    public static void S(String s) {
        if(Log.isLoggable("InstallReferrerClient", 2)) {
            Log.v("InstallReferrerClient", s);
        }
    }

    public static void T(String s) {
        if(Log.isLoggable("InstallReferrerClient", 5)) {
            Log.w("InstallReferrerClient", s);
        }
    }

    public static final o U(Context context0, q q0, String s) {
        if(q0 instanceof p) {
            if(j.a(s, "__LottieInternalDefaultCacheKey__")) {
                String s1 = m5.b.w("url_", ((p)q0).a);
                return d.a(s1, new r3.b(context0, ((p)q0).a, s1, 0), null);
            }
            return d.a(s, new r3.b(context0, ((p)q0).a, s, 0), null);
        }
        if(!(q0 instanceof v3.o)) {
            throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
        }
        if(j.a(s, "__LottieInternalDefaultCacheKey__")) {
            String s2 = "asset_" + ((v3.o)q0).a;
            return d.a(s2, new r3.b(context0.getApplicationContext(), ((v3.o)q0).a, s2, 1), null);
        }
        return d.a(s, new r3.b(context0.getApplicationContext(), ((v3.o)q0).a, s, 1), null);
    }

    public static final String V(Map map0) {
        j.f(map0, "map");
        String s = "";
        if(!map0.isEmpty()) {
            try {
                JSONObject jSONObject0 = new JSONObject();
                for(Object object0: map0.entrySet()) {
                    jSONObject0.put(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
                }
                s = jSONObject0.toString();
            }
            catch(JSONException unused_ex) {
            }
            j.e(s, "{\n      try {\n        val jsonObject = JSONObject()\n        for ((key, value) in map) {\n          jsonObject.put(key, value)\n        }\n        jsonObject.toString()\n      } catch (_e: JSONException) {\n        \"\"\n      }\n    }");
        }
        return s;
    }

    public static String W(ArrayList arrayList0) {
        return arrayList0.isEmpty() ? null : Bb.p.v0(arrayList0, "|", null, null, null, 62);
    }

    public static final Ja.g X(B9.b b0) {
        return new Ja.g(new s(1, b0, B9.b.class, "userPrefs", "userPrefs(Lcom/sendwave/util/LocalStorage$Group;)Lcom/sendwave/util/LocalStorage;", 0, 10));
    }

    public abstract int Y(int arg1);

    public static pc.p Z(String[] arr_s) {
        if(arr_s.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] arr_s1 = (String[])arr_s.clone();
        for(int v1 = 0; v1 < arr_s1.length; ++v1) {
            String s = arr_s1[v1];
            if(s == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            arr_s1[v1] = Vb.j.z0(s).toString();
        }
        int v2 = Bb.q.z(0, arr_s1.length - 1, 2);
        if(v2 >= 0) {
            for(int v = 0; true; v += 2) {
                String s1 = arr_s1[v];
                String s2 = arr_s1[v + 1];
                w.m(s1);
                w.n(s2, s1);
                if(v == v2) {
                    break;
                }
            }
        }
        return new pc.p(arr_s1);
    }

    public static final void a(Function0 function00, e1.q q0, c0.b b0, U.p p0, int v, int v1) {
        int v3;
        e1.q q1;
        p0.S(-2032877254);
        int v2 = (v & 6) == 0 ? (p0.h(function00) ? 4 : 2) | v : v;
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            q1 = q0;
        }
        else if((v & 0x30) == 0) {
            q1 = q0;
            v2 |= (p0.f(q1) ? 0x20 : 16);
        }
        else {
            q1 = q0;
        }
        if((v & 0x180) == 0) {
            v2 |= (p0.h(b0) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) != 0x92 || !p0.x()) {
            e1.q q2 = (v1 & 2) == 0 ? q1 : new e1.q(7, false);
            Object object0 = p0.k(AndroidCompositionLocals_androidKt.f);
            Object object1 = p0.k(f0.f);
            Object object2 = p0.k(f0.l);
            n n0 = U.d.F(p0);
            MutableState mutableState0 = U.d.G(b0, p0);
            UUID uUID0 = (UUID)R2.f.y(new Object[0], null, e1.d.Y, p0, 0xC00, 6);
            boolean z = p0.f(((View)object0));
            boolean z1 = p0.f(((Density)object1));
            Object object3 = p0.G();
            Z z2 = U.l.a;
            if((z | z1) != 0 || object3 == z2) {
                v3 = v2;
                object3 = new e1.s(function00, q2, ((View)object0), ((LayoutDirection)object2), ((Density)object1), uUID0);
                c0.b b1 = new c0.b(0x1D1A4619, new j0(mutableState0, 2), true);
                object3.e0.setParentCompositionContext(n0);
                object3.e0.k0.setValue(b1);
                object3.e0.m0 = true;
                object3.e0.d();
                p0.a0(object3);
            }
            else {
                v3 = v2;
            }
            boolean z3 = p0.h(((e1.s)object3));
            Object object4 = p0.G();
            if(z3 || object4 == z2) {
                object4 = new e1.b(((e1.s)object3), 0);
                p0.a0(object4);
            }
            H.b(((e1.s)object3), ((Function1)object4), p0);
            boolean z4 = p0.h(((e1.s)object3));
            boolean z5 = p0.f(((LayoutDirection)object2));
            Object object5 = p0.G();
            if((z4 | (v3 & 14) == 4 | ((v3 & 0x70) == 0x20 ? 1 : 0) | z5) != 0 || object5 == z2) {
                object5 = new O(((e1.s)object3), function00, q2, ((LayoutDirection)object2), 3);
                p0.a0(object5);
            }
            H.g(((Function0)object5), p0);
            q1 = q2;
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new F(function00, q1, b0, v, v1, 3);
        }
    }

    public static final Object a0(V8.c c0, T7 t70, E9.a a0, Function0 function00, s9.a a1, String s, String s1, c c1) {
        Uri uri1;
        String s2;
        s9.b b0;
        if(c1 instanceof s9.b) {
            b0 = (s9.b)c1;
            int v = b0.i0;
            if((v & 0x80000000) == 0) {
                b0 = new s9.b(c1);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
            }
            else {
                b0.i0 = v ^ 0x80000000;
            }
        }
        else {
            b0 = new s9.b(c1);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
        }
        Object object0 = b0.h0;
        Object object1 = Eb.a.X;
        switch(b0.i0) {
            case 0: {
                f.b0(object0);
                switch(a1.ordinal()) {
                    case 0: {
                        s2 = t70.f.d;
                        break;
                    }
                    case 1: {
                        s2 = t70.f.d;
                        break;
                    }
                    case 2: {
                        s2 = t70.f.a;
                        break;
                    }
                    case 3: {
                        s2 = t70.f.a;
                        break;
                    }
                    case 4: {
                        S7 s70 = t70.f;
                        s2 = s70.b;
                        if(s2 == null) {
                            s2 = s70.a;
                        }
                        break;
                    }
                    case 5: {
                        s2 = t70.f.c;
                        break;
                    }
                    case 6: {
                        s2 = t70.f.e;
                        break;
                    }
                    case 7: {
                        s2 = t70.f.d;
                        break;
                    }
                    case 8: {
                        String s3 = t70.f.f;
                        if(s1 == null) {
                            s1 = "";
                        }
                        s2 = s3 + s1;
                        break;
                    }
                    case 9: {
                        S7 s71 = t70.f;
                        s2 = s71.g;
                        if(s2 == null) {
                            s2 = s71.d;
                        }
                        break;
                    }
                    default: {
                        throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                    }
                }
                String s4 = URLEncoder.encode(s2, "UTF-8");
                Uri uri0 = Uri.parse((t70.e + "&text=" + s4));
                try {
                    b0.b0 = t70;
                    b0.c0 = a0;
                    b0.d0 = function00;
                    b0.e0 = a1;
                    b0.f0 = s;
                    b0.g0 = uri0;
                    b0.i0 = 1;
                    object0 = c0.e(b0);
                }
                catch(p1 p10) {
                    uri1 = uri0;
                    break;
                }
                if(object0 == object1) {
                    return object1;
                }
                uri1 = uri0;
                goto label_69;
            }
            case 1: {
                try {
                    uri1 = b0.g0;
                    s = b0.f0;
                    a1 = b0.e0;
                    function00 = b0.d0;
                    a0 = b0.c0;
                    t70 = b0.b0;
                    f.b0(object0);
                label_69:
                    j.c(uri1);
                    ((V8.d)object0).o(uri1);
                    a0.a("support channels modal - channel clicked", new Ab.k[]{new Ab.k("supportChannel", t70.a), new Ab.k("flowName", a1.X), new Ab.k("screenName", s)});
                    function00.invoke();
                    return t.a;
                }
                catch(p1 p10) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        hd.c.a.n(a1 + "ViewModel");
        hd.c.a.e(p10, "Failed to open support channel uri: " + uri1, new Object[0]);
        return t.a;
    }

    @Override  // Q0.e
    public int b(int v) {
        return this.b0(v);
    }

    public abstract int b0(int arg1);

    @Override  // Q0.e
    public int c(int v) {
        return this.Y(v);
    }

    public static final String c0(InputStream inputStream0) {
        String s;
        InputStreamReader inputStreamReader0;
        Throwable throwable1;
        BufferedInputStream bufferedInputStream0;
        try {
            bufferedInputStream0 = new BufferedInputStream(inputStream0);
        }
        catch(Throwable throwable0) {
            bufferedInputStream0 = null;
            throwable1 = throwable0;
            inputStreamReader0 = null;
            w.p(bufferedInputStream0);
            w.p(inputStreamReader0);
            throw throwable1;
        }
        try {
            inputStreamReader0 = new InputStreamReader(bufferedInputStream0);
        }
        catch(Throwable throwable2) {
            throwable1 = throwable2;
            inputStreamReader0 = null;
            w.p(bufferedInputStream0);
            w.p(inputStreamReader0);
            throw throwable1;
        }
        try {
            StringBuilder stringBuilder0 = new StringBuilder();
            char[] arr_c = new char[0x800];
            int v;
            while((v = inputStreamReader0.read(arr_c)) != -1) {
                stringBuilder0.append(arr_c, 0, v);
            }
            s = stringBuilder0.toString();
            j.e(s, "{\n      bufferedInputStream = BufferedInputStream(inputStream)\n      reader = InputStreamReader(bufferedInputStream)\n      val stringBuilder = StringBuilder()\n      val bufferSize = 1024 * 2\n      val buffer = CharArray(bufferSize)\n      var n = 0\n      while (reader.read(buffer).also { n = it } != -1) {\n        stringBuilder.append(buffer, 0, n)\n      }\n      stringBuilder.toString()\n    }");
        }
        catch(Throwable throwable1) {
            w.p(bufferedInputStream0);
            w.p(inputStreamReader0);
            throw throwable1;
        }
        w.p(bufferedInputStream0);
        w.p(inputStreamReader0);
        return s;
    }

    public static final void d(z1 z10, Modifier modifier0, Function3 function30, U.p p0, int v) {
        p0.S(0x795CF2BD);
        int v1 = (v & 6) == 0 ? (((v & 8) == 0 ? p0.f(z10) : p0.h(z10)) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.f(modifier0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.h(function30) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) != 0x92 || !p0.x()) {
            Object object0 = p0.G();
            if(object0 == U.l.a) {
                object0 = new H0();  // initializer: Ljava/lang/Object;-><init>()V
                object0.a = new Object();
                object0.b = new ArrayList();
                p0.a0(object0);
            }
            boolean z = j.a(z10, ((H0)object0).a);
            ArrayList arrayList0 = ((H0)object0).b;
            if(z) {
                p0.Q(1524065801);
            }
            else {
                p0.Q(0x5AB654FA);
                ((H0)object0).a = z10;
                ArrayList arrayList1 = new ArrayList(arrayList0.size());
                int v2 = arrayList0.size();
                for(int v3 = 0; v3 < v2; ++v3) {
                    arrayList1.add(((G0)arrayList0.get(v3)).a);
                }
                ArrayList arrayList2 = Bb.p.R0(arrayList1);
                if(!arrayList2.contains(z10)) {
                    arrayList2.add(z10);
                }
                arrayList0.clear();
                ArrayList arrayList3 = hb.h.N(arrayList2);
                int v4 = arrayList3.size();
                int v5 = 0;
                while(v5 < v4) {
                    Object object1 = arrayList3.get(v5);
                    arrayList0.add(new G0(((z1)object1), c0.c.c(1471040642, new y0(((z1)object1), z10, arrayList2, ((H0)object0), 1), p0)));
                    ++v5;
                    v4 = v4;
                }
            }
            p0.p(false);
            K k0 = B.r.e(g0.b.a, false);
            int v6 = p0.P;
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
            U.d.K(p0, k0, F0.j.f);
            U.d.K(p0, g00, F0.j.e);
            F0.h h0 = F0.j.g;
            if(p0.O || !j.a(p0.G(), v6)) {
                m5.b.F(v6, p0, v6, h0);
            }
            U.d.K(p0, modifier1, F0.j.d);
            ((H0)object0).c = U.d.y(p0);
            p0.Q(1801432280);
            int v7 = arrayList0.size();
            for(int v8 = 0; v8 < v7; ++v8) {
                G0 g01 = (G0)arrayList0.get(v8);
                p0.O(0x7E995040, g01.a);
                c0.b b0 = c0.c.c(2041982076, new B.w(function30, 13, g01.a), p0);
                g01.b.h(b0, p0, 6);
                p0.p(false);
            }
            p0.p(false);
            p0.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new u(z10, modifier0, function30, v, 7, false);
        }
    }

    public static final v3.n d0(q q0, U.p p0, int v) {
        p0.R(0xB595CDFE);
        K9.h h0 = new K9.h(3, null, 2);
        Context context0 = (Context)p0.k(AndroidCompositionLocals_androidKt.b);
        p0.R(0x52C617C2);
        int v1 = v & 14 ^ 6;
        int v2 = 1;
        boolean z = v1 <= 4 && p0.f(q0) || (v & 6) == 4;
        Object object0 = p0.G();
        Z z1 = U.l.a;
        if(z || object0 == z1) {
            object0 = U.d.D(new v3.n(), Z.e);
            p0.a0(object0);
        }
        p0.p(false);
        p0.R(0x52C618E5);
        int v3 = (v1 <= 4 || !p0.f(q0)) && (v & 6) != 4 ? 0 : 1;
        if(((0xE000 & v ^ 0x6000) <= 0x4000 || !p0.f("__LottieInternalDefaultCacheKey__")) && (v & 0x6000) != 0x4000) {
            v2 = 0;
        }
        Object object1 = p0.G();
        if((v3 | v2) != 0 || object1 == z1) {
            object1 = w.U(context0, q0, "__LottieInternalDefaultCacheKey__");
            p0.a0(object1);
        }
        o o0 = (o)object1;
        p0.p(false);
        H.e(q0, "__LottieInternalDefaultCacheKey__", new v(h0, context0, q0, null, "fonts/", ".ttf", "__LottieInternalDefaultCacheKey__", ((MutableState)object0), null), p0);
        v3.n n0 = (v3.n)((MutableState)object0).getValue();
        p0.p(false);
        return n0;
    }

    @Override  // Q0.e
    public int e(int v) {
        int v1 = this.Y(v);
        if(v1 == -1) {
            return -1;
        }
        return this.Y(v1) == -1 ? -1 : v1;
    }

    public static void e0(Object object0, String s) {
        if(object0 == null) {
            throw new IllegalArgumentException(s);
        }
    }

    @Override  // Q0.e
    public int f(int v) {
        int v1 = this.b0(v);
        if(v1 == -1) {
            return -1;
        }
        return this.b0(v1) == -1 ? -1 : v1;
    }

    public static final Drawable f0(Drawable drawable0, Context context0, Integer integer0, Integer integer1) {
        if(integer0 != null && integer1 != null) {
            Bitmap bitmap0 = Bitmap.createBitmap(((int)integer0), ((int)integer1), Bitmap.Config.ARGB_8888);
            j.e(bitmap0, "createBitmap(...)");
            Canvas canvas0 = new Canvas(bitmap0);
            drawable0.setBounds(0, 0, ((int)integer0), ((int)integer1));
            drawable0.draw(canvas0);
            return new BitmapDrawable(context0.getResources(), bitmap0);
        }
        return drawable0;
    }

    public static final void g(B1 b10, Modifier modifier0, Function3 function30, U.p p0, int v) {
        p0.S(0x19B0B9FC);
        int v1 = (v & 6) == 0 ? (p0.f(b10) ? 4 : 2) | v : v;
        if(((v1 | 0x1B0) & 0x93) != 0x92 || !p0.x()) {
            modifier0 = g0.l.X;
            function30 = Y.a;
            z1 z10 = (z1)b10.b.getValue();
            AccessibilityManager accessibilityManager0 = (AccessibilityManager)p0.k(f0.a);
            boolean z = p0.h(z10);
            boolean z1 = p0.h(accessibilityManager0);
            Object object0 = p0.G();
            if((z | z1) != 0 || object0 == U.l.a) {
                object0 = new w1(z10, accessibilityManager0, null);
                p0.a0(object0);
            }
            H.d(p0, z10, ((Function2)object0));
            w.d(((z1)b10.b.getValue()), modifier0, function30, p0, (v1 | 0x1B0) & 0x3F0);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new u(b10, modifier0, function30, v, 8, false);
        }
    }

    public static final void g0(Runnable runnable0) {
        try {
            l.c().execute(runnable0);
        }
        catch(Exception unused_ex) {
        }
    }

    public static final void h(Modifier modifier0, c0.b b0, U.p p0, int v) {
        p0.S(0xB9CB0778);
        int v1 = (v & 6) == 0 ? (p0.f(modifier0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.h(b0) ? 0x20 : 16);
        }
        if((v1 & 19) != 18 || !p0.x()) {
            e1.e e0 = e1.e.b;
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
            U.d.K(p0, e0, F0.j.f);
            U.d.K(p0, g00, F0.j.e);
            F0.h h0 = F0.j.g;
            if(p0.O || !j.a(p0.G(), v2)) {
                m5.b.F(v2, p0, v2, h0);
            }
            U.d.K(p0, modifier1, F0.j.d);
            b0.j(p0, ((int)(((v1 << 3 & 0x70 | (v1 >> 3 & 14 | 0x180)) << 6 & 0x380 | 6) >> 6 & 14)));
            p0.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new M.v(modifier0, b0, v, 2);
        }
    }

    public static final void h0(JSONObject jSONObject0, Context context0) {
        int v2;
        Locale locale0;
        int v1;
        JSONArray jSONArray0 = new JSONArray();
        jSONArray0.put("a2");
        int v = 0;
        if(Long.compare(w.Y, -1L) == 0 || System.currentTimeMillis() - w.Y >= 1800000L) {
            try {
                w.Y = System.currentTimeMillis();
                TimeZone timeZone0 = TimeZone.getDefault();
                String s = timeZone0.getDisplayName(timeZone0.inDaylightTime(new Date()), 0);
                j.e(s, "tz.getDisplayName(tz.inDaylightTime(Date()), TimeZone.SHORT)");
                w.c0 = s;
                String s1 = timeZone0.getID();
                j.e(s1, "tz.id");
                w.d0 = s1;
            }
            catch(AssertionError | Exception unused_ex) {
            }
            if("NoCarrier".equals("NoCarrier")) {
                try {
                    Object object0 = context0.getSystemService("phone");
                    if(object0 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
                    }
                    String s2 = ((TelephonyManager)object0).getNetworkOperatorName();
                    j.e(s2, "telephonyManager.networkOperatorName");
                    w.e0 = s2;
                }
                catch(Exception unused_ex) {
                }
            }
            try {
                if("mounted".equals(Environment.getExternalStorageState())) {
                    StatFs statFs0 = new StatFs(Environment.getExternalStorageDirectory().getPath());
                    w.Z = ((long)statFs0.getBlockCount()) * ((long)statFs0.getBlockSize());
                }
                w.Z = Math.round(((double)w.Z) / 1073741824.0);
            }
            catch(Exception unused_ex) {
            }
            try {
                if("mounted".equals(Environment.getExternalStorageState())) {
                    StatFs statFs1 = new StatFs(Environment.getExternalStorageDirectory().getPath());
                    w.b0 = ((long)statFs1.getAvailableBlocks()) * ((long)statFs1.getBlockSize());
                }
                w.b0 = Math.round(((double)w.b0) / 1073741824.0);
            }
            catch(Exception unused_ex) {
            }
        }
        try {
            v1 = -1;
            PackageInfo packageInfo0 = context0.getPackageManager().getPackageInfo("com.wave.personal", 0);
            if(packageInfo0 == null) {
                return;
            }
            v1 = packageInfo0.versionCode;
            w.f0 = packageInfo0.versionName;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        jSONArray0.put("com.wave.personal");
        jSONArray0.put(v1);
        jSONArray0.put("");
        jSONArray0.put(Build.VERSION.RELEASE);
        jSONArray0.put(Build.MODEL);
        try {
            locale0 = context0.getResources().getConfiguration().locale;
        }
        catch(Exception unused_ex) {
            locale0 = Locale.getDefault();
        }
        w.g0 = locale0;
        StringBuilder stringBuilder0 = new StringBuilder();
        Locale locale1 = w.g0;
        String s3 = "";
        if(locale1 != null) {
            boolean z = locale1.getLanguage() != null;
        }
        stringBuilder0.append("");
        stringBuilder0.append('_');
        Locale locale2 = w.g0;
        if(locale2 != null) {
            String s4 = locale2.getCountry();
            if(s4 != null) {
                s3 = s4;
            }
        }
        stringBuilder0.append(s3);
        jSONArray0.put(stringBuilder0.toString());
        jSONArray0.put("");
        jSONArray0.put("NoCarrier");
        double f = 0.0;
        try {
            Object object1 = context0.getSystemService("display");
            Display display0 = null;
            DisplayManager displayManager0 = object1 instanceof DisplayManager ? ((DisplayManager)object1) : null;
            if(displayManager0 != null) {
                display0 = displayManager0.getDisplay(0);
            }
            if(display0 == null) {
            label_71:
                v2 = 0;
            }
            else {
                DisplayMetrics displayMetrics0 = new DisplayMetrics();
                display0.getMetrics(displayMetrics0);
                f = (double)displayMetrics0.density;
                v2 = displayMetrics0.heightPixels;
                v = displayMetrics0.widthPixels;
            }
        }
        catch(Exception unused_ex) {
            goto label_71;
        }
        jSONArray0.put(v);
        jSONArray0.put(v2);
        jSONArray0.put(new DecimalFormat("#.##").format(f));
        int v3 = w.X;
        if(v3 <= 0) {
            try {
                File[] arr_file = new File("/sys/devices/system/cpu/").listFiles(new a5.v(0));
                if(arr_file != null) {
                    w.X = arr_file.length;
                }
            }
            catch(Exception unused_ex) {
            }
            if(w.X <= 0) {
                w.X = Math.max(Runtime.getRuntime().availableProcessors(), 1);
            }
            v3 = w.X;
        }
        jSONArray0.put(v3);
        jSONArray0.put(w.Z);
        jSONArray0.put(w.b0);
        jSONArray0.put("");
        jSONObject0.put("extinfo", jSONArray0.toString());
    }

    public static final void i(int v, List list0) {
        int v1 = list0.size();
        if(v < 0 || v >= v1) {
            throw new IndexOutOfBoundsException(A3.e.u(v, v1, "Index ", " is out of bounds. The list has ", " elements."));
        }
    }

    public static void i0(View view0, CharSequence charSequence0) {
        if(Build.VERSION.SDK_INT >= 26) {
            K0.a(view0, charSequence0);
            return;
        }
        if(M0.i0 != null && M0.i0.X == view0) {
            M0.b(null);
        }
        if(TextUtils.isEmpty(charSequence0)) {
            M0 m00 = M0.j0;
            if(m00 != null && m00.X == view0) {
                m00.a();
            }
            view0.setOnLongClickListener(null);
            view0.setLongClickable(false);
            view0.setOnHoverListener(null);
            return;
        }
        new M0(view0, charSequence0);
    }

    public static final void j(List list0, int v, int v1) {
        int v2 = list0.size();
        if(v > v1) {
            throw new IllegalArgumentException(A3.e.u(v, v1, "Indices are out of order. fromIndex (", ") is greater than toIndex (", ")."));
        }
        if(v < 0) {
            throw new IndexOutOfBoundsException(M.J.d(v, "fromIndex (", ") is less than 0."));
        }
        if(v1 > v2) {
            throw new IndexOutOfBoundsException("toIndex (" + v1 + ") is more than than the list size (" + v2 + ')');
        }
    }

    public static final String j0(String s) {
        if(s == null) {
            return null;
        }
        byte[] arr_b = s.getBytes(Vb.a.a);
        j.e(arr_b, "(this as java.lang.String).getBytes(charset)");
        return w.K("SHA-256", arr_b);
    }

    public static final Object k(Context context0, q q0, String s, String s1, String s2, String s3, c c0) {
        r3.a a0;
        String s10;
        Object object3;
        String s6;
        Context context1;
        String s5;
        String s4;
        v3.u u0;
        if(c0 instanceof v3.u) {
            u0 = (v3.u)c0;
            int v = u0.g0;
            if((v & 0x80000000) == 0) {
                u0 = new v3.u(c0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
            }
            else {
                u0.g0 = v ^ 0x80000000;
            }
        }
        else {
            u0 = new v3.u(c0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
        }
        Object object0 = u0.f0;
        Object object1 = Eb.a.X;
        Object object2 = t.a;
        switch(u0.g0) {
            case 0: {
                f.b0(object0);
                o o0 = w.U(context0, q0, s3);
                u0.b0 = context0;
                s4 = s;
                u0.c0 = s4;
                u0.d0 = s1;
                s5 = s2;
                u0.e0 = s5;
                u0.g0 = 1;
                Xb.k k0 = new Xb.k(1, N4.j.w(u0));
                k0.v();
                o0.b(new v3.r(k0, 0));
                o0.a(new v3.r(k0, 1));
                object0 = k0.u();
                if(object0 == object1) {
                    return object1;
                }
                context1 = context0;
                s6 = s1;
                goto label_40;
            }
            case 1: {
                String s7 = (String)u0.e0;
                String s8 = u0.d0;
                String s9 = u0.c0;
                context1 = (Context)u0.b0;
                f.b0(object0);
                s5 = s7;
                s6 = s8;
                s4 = s9;
            label_40:
                u0.b0 = context1;
                u0.c0 = s6;
                u0.d0 = s5;
                u0.e0 = (r3.a)object0;
                u0.g0 = 2;
                if(((r3.a)object0).d.isEmpty()) {
                    object3 = object2;
                }
                else {
                    v3.t t0 = new v3.t(((r3.a)object0), context1, s4, null);
                    object3 = Xb.J.y(Xb.V.c, t0, u0);
                    if(object3 != object1) {
                        object3 = object2;
                    }
                }
                if(object3 == object1) {
                    return object1;
                }
                s10 = s6;
                a0 = (r3.a)object0;
                goto label_63;
            }
            case 2: {
                a0 = (r3.a)u0.e0;
                String s11 = u0.d0;
                s10 = u0.c0;
                Context context2 = (Context)u0.b0;
                f.b0(object0);
                s5 = s11;
                context1 = context2;
            label_63:
                u0.b0 = a0;
                u0.c0 = null;
                u0.d0 = null;
                u0.e0 = null;
                u0.g0 = 3;
                if(!a0.f.isEmpty()) {
                    v3.s s12 = new v3.s(a0, context1, s10, s5, null);
                    Object object4 = Xb.J.y(Xb.V.c, s12, u0);
                    if(object4 == object1) {
                        object2 = object4;
                    }
                }
                return object2 == object1 ? object1 : a0;
            }
            case 3: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        a0 = (r3.a)u0.b0;
        f.b0(object0);
        return a0;
    }

    public static final void k0(String s) {
        throw new IllegalArgumentException(s);
    }

    public static void l(L l0, LifecycleOwner lifecycleOwner0, Function1 function10, int v) {
        if((v & 1) != 0) {
            lifecycleOwner0 = null;
        }
        j.f(l0, "<this>");
        M m0 = new M(function10, true);
        if(lifecycleOwner0 != null) {
            l0.a(lifecycleOwner0, m0);
            return;
        }
        l0.b(m0);
    }

    public static final void l0(Drawable drawable0, Integer integer0) {
        if(integer0 != null) {
            drawable0.setTintList(ColorStateList.valueOf(integer0.intValue()));
        }
    }

    public static void m(String s) {
        if(s.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int v = s.length();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = s.charAt(v1);
            if(33 > v2 || v2 >= 0x7F) {
                throw new IllegalArgumentException(rc.b.i("Unexpected char %#04x at %d in header name: %s", new Object[]{v2, v1, s}).toString());
            }
        }
    }

    public static final LinkedHashMap m0(JSONObject jSONObject0) {
        j.f(jSONObject0, "<this>");
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        Iterator iterator0 = jSONObject0.keys();
        j.e(iterator0, "this.keys()");
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            j.e(((String)object0), "key");
            linkedHashMap0.put(((String)object0), w.B(jSONObject0.get(((String)object0))));
        }
        return linkedHashMap0;
    }

    public static void n(String s, String s1) {
        int v = s.length();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = s.charAt(v1);
            if(v2 != 9 && (0x20 > v2 || v2 >= 0x7F)) {
                throw new IllegalArgumentException((rc.b.i("Unexpected char %#04x at %d in %s value", new Object[]{v2, v1, s1}) + (rc.b.q(s1) ? "" : ": " + s)).toString());
            }
        }
    }

    public static final LinkedHashMap n0(JSONObject jSONObject0) {
        LinkedHashMap linkedHashMap1;
        j.f(jSONObject0, "<this>");
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        Iterator iterator0 = jSONObject0.keys();
        j.e(iterator0, "this.keys()");
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            j.e(((String)object0), "key");
            Object object1 = jSONObject0.get(((String)object0));
            if(object1 instanceof JSONObject) {
                linkedHashMap1 = w.m0(((JSONObject)object1));
            }
            else {
                A a0 = A.X;
                if(!(object1 instanceof JSONArray)) {
                    j.a(object1, JSONObject.NULL);
                }
                linkedHashMap1 = a0;
            }
            linkedHashMap0.put(((String)object0), linkedHashMap1);
        }
        return linkedHashMap0;
    }

    public static void o(Context context0, String s) {
        CookieSyncManager.createInstance(context0).sync();
        CookieManager cookieManager0 = CookieManager.getInstance();
        String s1 = cookieManager0.getCookie(s);
        if(s1 == null) {
            return;
        }
        Object[] arr_object = Vb.j.p0(s1, new String[]{";"}, 0, 6).toArray(new String[0]);
        if(arr_object == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        int v = 0;
        while(v < ((String[])arr_object).length) {
            String s2 = ((String[])arr_object)[v];
            ++v;
            Object[] arr_object1 = Vb.j.p0(s2, new String[]{"="}, 0, 6).toArray(new String[0]);
            if(arr_object1 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            if(((String[])arr_object1).length > 0) {
                String s3 = ((String[])arr_object1)[0];
                int v1 = s3.length() - 1;
                int v2 = 0;
                boolean z = false;
                while(v2 <= v1) {
                    boolean z1 = j.h(s3.charAt((z ? v1 : v2)), 0x20) <= 0;
                    if(z) {
                        if(!z1) {
                            break;
                        }
                        --v1;
                    }
                    else if(z1) {
                        ++v2;
                    }
                    else {
                        z = true;
                    }
                }
                cookieManager0.setCookie(s, s3.subSequence(v2, v1 + 1).toString() + "=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
            }
        }
        cookieManager0.removeExpiredCookie();
    }

    public static void o0(Ec.h h0, byte[] arr_b) {
        j.f(h0, "cursor");
        j.f(arr_b, "key");
        while(true) {
            byte[] arr_b1 = h0.c0;
            int v1 = h0.d0;
            int v2 = h0.e0;
            if(arr_b1 != null) {
                for(int v = 0; v1 < v2; v = v3 + 1) {
                    int v3 = v % arr_b.length;
                    arr_b1[v1] = (byte)(arr_b1[v1] ^ arr_b[v3]);
                    ++v1;
                }
            }
            long v4 = h0.b0;
            Ec.j j0 = h0.X;
            j.c(j0);
            if(v4 == j0.Y) {
                break;
            }
            if(h0.b((h0.b0 == -1L ? 0L : h0.b0 + ((long)(h0.e0 - h0.d0)))) == -1) {
                return;
            }
        }
        throw new IllegalStateException("no more bytes");
    }

    public static final void p(Closeable closeable0) {
        if(closeable0 != null) {
            try {
                closeable0.close();
            }
            catch(IOException unused_ex) {
            }
        }
    }

    public static Map p0(String s, String s1, String s2, boolean z, boolean z1) {
        Ab.k k0 = new Ab.k("committed first try", String.valueOf(z));
        Ab.k k1 = new Ab.k("committed second try", String.valueOf(z1));
        if(s == null) {
            s = "";
        }
        Ab.k k2 = new Ab.k("expected", s);
        if(s1 == null) {
            s1 = "";
        }
        Ab.k k3 = new Ab.k("actual first", s1);
        if(s2 == null) {
            s2 = "";
        }
        return Bb.F.K(new Ab.k[]{k0, k1, k2, k3, new Ab.k("actual second", s2)});
    }

    // Deobfuscation rating: LOW(20)
    public static final String q(String s) {
        return w.P(s) ? "" : s;
    }

    public static final Modifier r(Modifier modifier0) {
        j.f(modifier0, "<this>");
        Xa.a a0 = new Xa.a(2, null);  // initializer: LFb/j;-><init>(ILkotlin/coroutines/g;)V
        return modifier0.d(new SuspendPointerInputElement(t.a, null, a0, 6));
    }

    public static final HashSet s(JSONArray jSONArray0) {
        if(jSONArray0 != null && jSONArray0.length() != 0) {
            HashSet hashSet0 = new HashSet();
            int v = jSONArray0.length();
            if(v > 0) {
                for(int v1 = 0; true; ++v1) {
                    String s = jSONArray0.getString(v1);
                    j.e(s, "jsonArray.getString(i)");
                    hashSet0.add(s);
                    if(v1 + 1 >= v) {
                        break;
                    }
                }
            }
            return hashSet0;
        }
        return null;
    }

    public static final ArrayList t(JSONArray jSONArray0) {
        try {
            ArrayList arrayList0 = new ArrayList();
            int v = jSONArray0.length();
            if(v > 0) {
                for(int v1 = 0; true; ++v1) {
                    String s = jSONArray0.getString(v1);
                    j.e(s, "jsonArray.getString(i)");
                    arrayList0.add(s);
                    if(v1 + 1 >= v) {
                        break;
                    }
                }
            }
            return arrayList0;
        }
        catch(JSONException unused_ex) {
            return new ArrayList();
        }
    }

    public static final HashMap u(JSONObject jSONObject0) {
        j.f(jSONObject0, "jsonObject");
        HashMap hashMap0 = new HashMap();
        JSONArray jSONArray0 = jSONObject0.names();
        if(jSONArray0 == null) {
            return hashMap0;
        }
        int v = jSONArray0.length();
        if(v > 0) {
            for(int v1 = 0; true; ++v1) {
                try {
                    String s = jSONArray0.getString(v1);
                    j.e(s, "keys.getString(i)");
                    Object object0 = jSONObject0.get(s);
                    if(object0 instanceof JSONObject) {
                        object0 = w.u(((JSONObject)object0));
                    }
                    j.e(object0, "value");
                    hashMap0.put(s, object0);
                }
                catch(JSONException unused_ex) {
                }
                if(v1 + 1 >= v) {
                    break;
                }
            }
        }
        return hashMap0;
    }

    public static final HashMap v(JSONObject jSONObject0) {
        HashMap hashMap0 = new HashMap();
        Iterator iterator0 = jSONObject0.keys();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            String s = (String)object0;
            String s1 = jSONObject0.optString(s);
            if(s1 != null) {
                j.e(s, "key");
                hashMap0.put(s, s1);
            }
        }
        return hashMap0;
    }

    public static final int w(InputStream inputStream0, FilterOutputStream filterOutputStream0) {
        int v;
        BufferedInputStream bufferedInputStream0 = null;
        try {
            bufferedInputStream0 = new BufferedInputStream(inputStream0);
            byte[] arr_b = new byte[0x2000];
            v = 0;
            int v1;
            while((v1 = bufferedInputStream0.read(arr_b)) != -1) {
                filterOutputStream0.write(arr_b, 0, v1);
                v += v1;
            }
        }
        catch(Throwable throwable0) {
            if(bufferedInputStream0 != null) {
                bufferedInputStream0.close();
            }
            if(inputStream0 != null) {
                inputStream0.close();
            }
            throw throwable0;
        }
        bufferedInputStream0.close();
        if(inputStream0 != null) {
            inputStream0.close();
        }
        return v;
    }

    public static b x(String s, String s1) {
        U7.a a0 = new U7.a(s, s1);
        a a1 = b.a(U7.a.class);
        a1.c = 1;
        a1.g = new E7.w(23, a0);
        return a1.b();
    }

    public static final void y(HttpURLConnection httpURLConnection0) {
        if(httpURLConnection0 != null) {
            httpURLConnection0.disconnect();
        }
    }

    // Deobfuscation rating: LOW(20)
    public static boolean z(Object object0, Object object1) {
        return object0 == object1 || object0 != null && object0.equals(object1);
    }
}

