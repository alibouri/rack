package E7;

import Bb.F;
import Bb.q;
import E.f0;
import I3.g;
import I5.h;
import I7.v;
import J2.b;
import J2.e;
import J2.u;
import K2.d;
import M4.c;
import M4.w;
import N4.f;
import N4.k;
import N4.m;
import N4.p;
import N4.t;
import Nb.j;
import R2.i;
import T7.A;
import T8.r;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.os.Bundle;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.Pair;
import android.view.View;
import android.widget.EditText;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.lifecycle.DispatchQueue;
import c.L;
import com.facebook.AccessToken;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.journeyapps.barcodescanner.CaptureActivity;
import f5.a;
import io.sentry.E1;
import io.sentry.O;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class n implements Runnable {
    public final int X;
    public final Object Y;
    public final Object Z;

    public n(Object object0, int v, Object object1) {
        this.X = v;
        this.Y = object0;
        this.Z = object1;
        super();
    }

    private final void a() {
        i i0 = (i)this.Z;
        synchronized(((e)this.Y).k) {
            for(Object object1: ((e)this.Y).j) {
                ((b)object1).d(i0, false);
            }
        }
    }

    private final void b() {
        N4.b b0 = (N4.b)this.Y;
        f f0 = (f)this.Z;
        if(!a.b(N4.i.class)) {
            try {
                j.f(b0, "$accessTokenAppId");
                h h0 = N4.i.a;
                synchronized(h0) {
                    t t0 = h0.o(b0);
                    if(t0 != null) {
                        t0.a(f0);
                    }
                }
                if(io.sentry.hints.i.u() != k.Y && N4.i.a.m() > 100) {
                    N4.i.d(p.Z);
                    return;
                }
                if(N4.i.c == null) {
                    N4.i.c = N4.i.b.schedule(N4.i.d, 15L, TimeUnit.SECONDS);
                    return;
                }
                return;
            }
            catch(Throwable throwable0) {
            }
            a.a(throwable0, N4.i.class);
        }
    }

    @Override
    public final void run() {
        String s1;
        Class class7;
        List list1;
        String s5;
        Date date1;
        int v = 2;
        String s = null;
        int v1 = 0;
        switch(this.X) {
            case 0: {
                ((o)this.Y).a(((Intent)this.Z));
                return;
            }
            case 1: {
                o6.i i0 = (o6.i)this.Z;
                x x0 = (x)this.Y;
                try {
                    i0.b(x0.a());
                }
                catch(Exception exception0) {
                    i0.a(exception0);
                }
                return;
            }
            case 2: {
                g g0 = (g)this.Y;
                g g1 = (g)this.Z;
                if(!g0.h) {
                    try {
                        l l0 = new l(5);
                        J3.a a0 = new J3.a();  // initializer: Ljava/lang/Object;-><init>()V
                        a0.Y = J3.a.Z;
                        a0.X = l0;
                        g0.b = new I3.b(a0);
                        Context context0 = g0.a;
                        boolean z = g0.l;
                        boolean z1 = g0.j.a("adid");
                        I3.n n0 = new I3.n();  // initializer: Ljava/lang/Object;-><init>()V
                        n0.Z = context0;
                        n0.X = z;
                        n0.Y = z1;
                        g0.u = n0;
                        g0.g = g0.e();
                        I3.l l1 = g0.c;
                        synchronized(l1) {
                            s1 = (String)l1.c0("store", "user_id");
                        }
                        g1.f = s1;
                        g0.m = new I3.o(g0.c, g0.I, g0.z, g0);
                        Ba.l l2 = new Ba.l(5, g0);
                        g0.K.b.n(l2);
                        String s2 = g0.g;
                        G3.b b0 = new G3.b(new HashMap(), null, s2);
                        g0.K.a.P(b0);
                        g0.u.e();
                        Long long0 = g0.c.U("opt_out");
                        g0.i = long0 != null && ((long)long0) == 1L;
                        long v3 = g0.b(-1L, "previous_session_id");
                        g0.t = v3;
                        if(v3 >= 0L) {
                            g0.o = v3;
                        }
                        g0.p = g0.b(0L, "sequence_number");
                        g0.q = g0.b(-1L, "last_event_id");
                        g0.r = g0.b(-1L, "last_identify_id");
                        g0.s = g0.b(-1L, "last_event_time");
                        I3.l l3 = g0.c;
                        l3.Z = new R2.k(3, g0, g1, false);
                        g0.h = true;
                        return;
                    }
                    catch(I3.k k0) {
                    }
                    g.M.getClass();
                    Log.e("I3.g", "Failed to initialize Amplitude SDK due to: " + k0.getMessage());
                    g1.d = null;
                }
                return;
            }
            case 3: {
                v v4 = (v)this.Y;
                Context context1 = (Context)this.Z;
                if(v4.a == null && context1 != null) {
                    v4.a = context1.getSharedPreferences("FirebasePerfSharedPrefs", 0);
                }
                return;
            }
            case 4: {
                this.a();
                return;
            }
            case 5: {
                ((K.v)((d)this.Y).c).x(((J2.k)this.Z), 3);
                return;
            }
            case 6: {
                M4.v v5 = (M4.v)this.Z;
                j.f(v5, "$requests");
                for(Object object0: ((ArrayList)this.Y)) {
                    M4.p p0 = (M4.p)((Pair)object0).first;
                    Object object1 = ((Pair)object0).second;
                    j.e(object1, "pair.second");
                    p0.a(((w)object1));
                }
                for(Object object2: v5.b0) {
                    AccessToken accessToken0 = ((c)object2).b;
                    f0 f00 = ((c)object2).a;
                    AtomicBoolean atomicBoolean0 = ((c)object2).c;
                    Set set0 = ((c)object2).d;
                    Set set1 = ((c)object2).e;
                    Set set2 = ((c)object2).f;
                    j.f(((c)object2).g, "this$0");
                    AtomicBoolean atomicBoolean1 = ((c)object2).g.d;
                    String s3 = (String)f00.d;
                    int v6 = f00.b;
                    Long long1 = (Long)f00.e;
                    String s4 = (String)f00.f;
                    try {
                        io.sentry.hints.i i1 = M4.e.f;
                        if(i1.w().c != null) {
                            AccessToken accessToken1 = i1.w().c;
                            if((accessToken1 == null ? null : accessToken1.g0) == accessToken0.g0) {
                                if(atomicBoolean0.get() || s3 != null || v6 != 0) {
                                    Date date0 = accessToken0.X;
                                    if(f00.b == 0) {
                                        s5 = s4;
                                        if(f00.c != 0) {
                                            long v7 = new Date().getTime();
                                            date1 = new Date(((long)f00.c) * 1000L + v7);
                                            goto label_116;
                                        }
                                    }
                                    else {
                                        s5 = s4;
                                        date0 = new Date(((long)f00.b) * 1000L);
                                    }
                                    date1 = date0;
                                label_116:
                                    if(s3 == null) {
                                        s3 = accessToken0.c0;
                                    }
                                    String s6 = accessToken0.f0;
                                    String s7 = accessToken0.g0;
                                    if(!atomicBoolean0.get()) {
                                        set0 = accessToken0.Y;
                                    }
                                    if(!atomicBoolean0.get()) {
                                        set1 = accessToken0.Z;
                                    }
                                    if(!atomicBoolean0.get()) {
                                        set2 = accessToken0.b0;
                                    }
                                    Date date2 = new Date();
                                    i1.w().c(new AccessToken(s3, s6, s7, set0, set1, set2, accessToken0.d0, date1, date2, (long1 == null ? accessToken0.h0 : new Date(((long)long1) * 1000L)), (s5 == null ? accessToken0.i0 : s5)), true);
                                }
                                else {
                                    goto label_132;
                                }
                            }
                        }
                        goto label_134;
                    }
                    catch(Throwable throwable0) {
                        atomicBoolean1.set(0);
                        throw throwable0;
                    }
                label_132:
                    atomicBoolean1.set(((boolean)0));
                    continue;
                label_134:
                    atomicBoolean1.set(0);
                }
                return;
            }
            case 7: {
                ((AppStartTrace)this.Y).getClass();
                A a1 = (A)((T7.x)this.Z).h();
                ((AppStartTrace)this.Y).Y.c(a1, T7.i.c0);
                return;
            }
            case 8: {
                this.b();
                return;
            }
            case 9: {
                N4.b b1 = (N4.b)this.Y;
                t t0 = (t)this.Z;
                Class class0 = N4.i.class;
                if(!a.b(class0)) {
                    try {
                        N4.j.H(b1, t0);
                        return;
                    }
                    catch(Throwable throwable1) {
                        a.a(throwable1, class0);
                    }
                }
                return;
            }
            case 10: {
                Context context2 = (Context)this.Y;
                m m0 = (m)this.Z;
                Bundle bundle0 = new Bundle();
                int v9 = 0;
                for(int v8 = 0; true; ++v8) {
                    String s8 = new String[]{"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"}[v8];
                    String s9 = new String[]{"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"}[v8];
                    try {
                        Class.forName(s8);
                        bundle0.putInt(s9, 1);
                        v9 |= 1 << v8;
                    }
                    catch(ClassNotFoundException unused_ex) {
                    }
                    if(v8 + 1 > 10) {
                        break;
                    }
                }
                SharedPreferences sharedPreferences0 = context2.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                if(sharedPreferences0.getInt("kitsBitmask", 0) != v9) {
                    sharedPreferences0.edit().putInt("kitsBitmask", v9).apply();
                    if(!a.b(m0)) {
                        try {
                            m0.f("fb_sdk_initialize", null, bundle0, true, V4.d.b());
                            return;
                        }
                        catch(Throwable throwable2) {
                            a.a(throwable2, m0);
                        }
                    }
                }
                return;
            }
            case 11: {
                View view0 = (View)this.Y;
                O4.d d0 = (O4.d)this.Z;
                Class class1 = O4.d.class;
                if(!a.b(class1)) {
                    try {
                        j.f(view0, "$view");
                        j.f(d0, "this$0");
                        if(view0 instanceof EditText) {
                            d0.b(view0);
                            return;
                        }
                    }
                    catch(Throwable throwable3) {
                        a.a(throwable3, class1);
                    }
                }
                return;
            }
            case 12: {
                for(Object object3: ((List)this.Y)) {
                    ((O2.a)object3).a(((P2.f)this.Z).e);
                }
                return;
            }
            case 13: {
                List list0 = (List)this.Z;
                Integer integer0 = (Integer)this.Y;
                if(!Bb.p.k0(P4.j.a, integer0) && Bb.p.k0(P4.j.b, integer0)) {
                    if(P4.j.e >= 5) {
                        P4.j.b().clear();
                        P4.j.e = 0;
                        return;
                    }
                    P4.j.b().addAll(0, list0);
                    ++P4.j.e;
                }
                return;
            }
            case 14: {
                String s10 = (String)this.Y;
                Bundle bundle1 = (Bundle)this.Z;
                Class class2 = Q4.c.class;
                if(!a.b(class2)) {
                    try {
                        new m(M4.l.a(), null).e(s10, bundle1);
                        return;
                    }
                    catch(Throwable throwable4) {
                        a.a(throwable4, class2);
                    }
                }
                return;
            }
            case 15: {
                Q4.l l4 = (Q4.l)this.Y;
                Q4.k k1 = (Q4.k)this.Z;
                Class class3 = Q4.l.class;
                if(!a.b(class3)) {
                    try {
                        j.f(l4, "this$0");
                        try {
                            Timer timer0 = l4.c;
                            if(timer0 != null) {
                                timer0.cancel();
                            }
                            l4.d = null;
                            Timer timer1 = new Timer();
                            timer1.scheduleAtFixedRate(k1, 0L, 1000L);
                            l4.c = timer1;
                        }
                        catch(Exception exception1) {
                            Log.e(Q4.l.e, "Error scheduling indexing job", exception1);
                        }
                        return;
                    }
                    catch(Throwable throwable5) {
                        a.a(throwable5, class3);
                    }
                }
                return;
            }
            case 16: {
                String s11 = (String)this.Y;
                Q4.l l5 = (Q4.l)this.Z;
                Class class4 = Q4.l.class;
                if(!a.b(class4)) {
                    try {
                        j.f(l5, "this$0");
                        byte[] arr_b = s11.getBytes(Vb.a.a);
                        j.e(arr_b, "(this as java.lang.String).getBytes(charset)");
                        String s12 = a5.w.K("MD5", arr_b);
                        AccessToken accessToken2 = M6.b.A();
                        if(s12 != null && s12.equals(l5.d)) {
                            return;
                        }
                        l5.b(F.k(s11, accessToken2, M4.l.b()), s12);
                        return;
                    }
                    catch(Throwable throwable6) {
                    }
                    a.a(throwable6, class4);
                }
                return;
            }
            case 17: {
                ((R7.f)this.Y).getClass();
                ((R7.f)this.Y).d(((R7.b)this.Z).a, ((R7.b)this.Z).b);
                return;
            }
            case 18: {
                String s13 = ((UUID)this.Z).toString();
                j.e(s13, "id.toString()");
                W5.f.n(((u)this.Y), s13);
                return;
            }
            case 19: {
                T4.g g2 = (T4.g)this.Y;
                N4.c c0 = (N4.c)this.Z;
                Class class5 = T4.g.class;
                if(!a.b(class5)) {
                    try {
                        j.f(g2, "this$0");
                        g2.d(new ArrayList(g2.r), c0);
                        return;
                    }
                    catch(Throwable throwable7) {
                        a.a(throwable7, class5);
                    }
                }
                return;
            }
            case 20: {
                T8.j j0 = (T8.j)((B3.c)this.Y).Y;
                boolean z2 = j0.d;
                T8.b b2 = (T8.b)this.Z;
                CaptureActivity captureActivity0 = j0.a;
                if(z2) {
                    r r0 = b2.b;
                    Rect rect0 = new Rect(0, 0, r0.a.b, r0.a.c);
                    YuvImage yuvImage0 = new YuvImage(r0.a.a, r0.b, r0.a.b, r0.a.c, null);
                    ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                    yuvImage0.compressToJpeg(rect0, 90, byteArrayOutputStream0);
                    byte[] arr_b1 = byteArrayOutputStream0.toByteArray();
                    BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
                    bitmapFactory$Options0.inSampleSize = 2;
                    Bitmap bitmap0 = BitmapFactory.decodeByteArray(arr_b1, 0, arr_b1.length, bitmapFactory$Options0);
                    int v10 = r0.c;
                    if(v10 != 0) {
                        Matrix matrix0 = new Matrix();
                        matrix0.postRotate(((float)v10));
                        bitmap0 = Bitmap.createBitmap(bitmap0, 0, 0, bitmap0.getWidth(), bitmap0.getHeight(), matrix0, false);
                    }
                    try {
                        File file0 = File.createTempFile("barcodeimage", ".jpg", captureActivity0.getCacheDir());
                        FileOutputStream fileOutputStream0 = new FileOutputStream(file0);
                        bitmap0.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream0);
                        fileOutputStream0.close();
                        s = file0.getAbsolutePath();
                    }
                    catch(IOException iOException0) {
                        Log.w("j", "Unable to create temporary file and store bitmap! " + iOException0);
                    }
                }
                Intent intent0 = new Intent("com.google.zxing.client.android.SCAN");
                intent0.addFlags(0x80000);
                intent0.putExtra("SCAN_RESULT", b2.a.a);
                r8.m m1 = b2.a;
                intent0.putExtra("SCAN_RESULT_FORMAT", m1.d.toString());
                byte[] arr_b2 = m1.b;
                if(arr_b2 != null && arr_b2.length > 0) {
                    intent0.putExtra("SCAN_RESULT_BYTES", arr_b2);
                }
                EnumMap enumMap0 = m1.e;
                if(enumMap0 != null) {
                    r8.n n1 = r8.n.e0;
                    if(enumMap0.containsKey(n1)) {
                        intent0.putExtra("SCAN_RESULT_UPC_EAN_EXTENSION", enumMap0.get(n1).toString());
                    }
                    Number number0 = (Number)enumMap0.get(r8.n.X);
                    if(number0 != null) {
                        intent0.putExtra("SCAN_RESULT_ORIENTATION", number0.intValue());
                    }
                    String s14 = (String)enumMap0.get(r8.n.Z);
                    if(s14 != null) {
                        intent0.putExtra("SCAN_RESULT_ERROR_CORRECTION_LEVEL", s14);
                    }
                    Iterable iterable0 = (Iterable)enumMap0.get(r8.n.Y);
                    if(iterable0 != null) {
                        for(Object object4: iterable0) {
                            intent0.putExtra("SCAN_RESULT_BYTE_SEGMENTS_" + v1, ((byte[])object4));
                            ++v1;
                        }
                    }
                }
                if(s != null) {
                    intent0.putExtra("SCAN_RESULT_IMAGE_PATH", s);
                }
                captureActivity0.setResult(-1, intent0);
                j0.a();
                return;
            }
            case 21: {
                String s15 = (String)this.Y;
                f f0 = (f)this.Z;
                Class class6 = X4.a.class;
                if(!a.b(class6)) {
                    try {
                        j.f(s15, "$applicationId");
                        j.f(f0, "$event");
                        list1 = q.K(f0);
                        class7 = X4.f.class;
                        if(!a.b(class7)) {
                            goto label_331;
                        }
                    }
                    catch(Throwable throwable8) {
                        a.a(throwable8, class6);
                    }
                    return;
                    try {
                    label_331:
                        X4.f.a.b(X4.c.Z, s15, list1);
                        return;
                    }
                    catch(Throwable throwable9) {
                        try {
                            a.a(throwable9, class7);
                            return;
                        }
                        catch(Throwable throwable8) {
                        }
                    }
                    a.a(throwable8, class6);
                }
                return;
            }
            case 22: {
                j.f(((String)this.Z), "$buttonText");
                Z4.a.j(((String)this.Y), ((String)this.Z), new float[0]);
                return;
            }
            case 23: {
                DispatchQueue dispatchQueue0 = (DispatchQueue)this.Y;
                j.f(dispatchQueue0, "this$0");
                j.f(((Runnable)this.Z), "$runnable");
                if(!dispatchQueue0.d.offer(((Runnable)this.Z))) {
                    throw new IllegalStateException("cannot enqueue any more runnables");
                }
                dispatchQueue0.a();
                return;
            }
            case 24: {
                androidx.lifecycle.c c1 = new androidx.lifecycle.c(((L)this.Z), 2, ((c2.x)this.Y));
                ((c2.x)this.Y).X.a(c1);
                return;
            }
            case 25: {
                ((h7.c)this.Y).getClass();
                String s16 = h7.e.b.a;
                m7.m m2 = ((h7.c)this.Y).c.a;
                String s17 = ((SharedPreferences)m2.get()).getString("com.google.firebase.appcheck.TOKEN_TYPE", null);
                String s18 = ((SharedPreferences)m2.get()).getString("com.google.firebase.appcheck.APP_CHECK_TOKEN", null);
                if(s17 != null && s18 != null) {
                    try {
                        if(s17 == null) {
                            throw new NullPointerException("Name is null");
                        }
                        if(s17.equals("DEFAULT_APP_CHECK_TOKEN")) {
                            v = 1;
                        }
                        else if(!s17.equals("UNKNOWN_APP_CHECK_TOKEN")) {
                            throw new IllegalArgumentException("No enum constant com.google.firebase.appcheck.internal.StorageHelper.TokenType." + s17);
                        }
                        switch(v.h.d(v)) {
                            case 0: {
                                goto label_368;
                            }
                            case 1: {
                                goto label_370;
                            }
                        }
                    }
                    catch(IllegalArgumentException illegalArgumentException0) {
                        goto label_376;
                    }
                    Log.e(s16, "Reached unreachable section in #retrieveAppCheckToken()", null);
                    goto label_380;
                    try {
                    label_368:
                        h7.b.a(s18);
                        goto label_380;
                    label_370:
                        N5.r.j(s18);
                        Map map0 = F.O(s18);
                        long v11 = h7.b.b("iat", map0);
                        new h7.b(s18, (h7.b.b("exp", map0) - v11) * 1000L, 1000L * v11);
                        goto label_380;
                    }
                    catch(IllegalArgumentException illegalArgumentException0) {
                    }
                label_376:
                    StringBuilder stringBuilder0 = com.apollographql.apollo.api.b.s("Failed to parse TokenType of stored token  with type [", s17, "] with exception: ");
                    stringBuilder0.append(illegalArgumentException0.getMessage());
                    Log.e(s16, stringBuilder0.toString(), null);
                    ((SharedPreferences)m2.get()).edit().remove("com.google.firebase.appcheck.APP_CHECK_TOKEN").remove("com.google.firebase.appcheck.TOKEN_TYPE").apply();
                }
            label_380:
                ((o6.i)this.Z).b(null);
                return;
            }
            case 26: {
                ((S2.h)this.Y).getClass();
                try {
                    ((Runnable)this.Z).run();
                }
                finally {
                    ((S2.h)this.Y).d();
                }
                return;
            }
            case 27: {
                i0.b.a(((AndroidContentCaptureManager)this.Y), ((LongSparseArray)this.Z));
                return;
            }
            case 28: {
                ((io.sentry.k)this.Y).g(((E1)this.Z));
                return;
            }
            default: {
                ((O)this.Z).i(((io.sentry.A)this.Y).a.getShutdownTimeoutMillis());
            }
        }
    }
}

