package E7;

import B9.f;
import Bb.p;
import N3.I;
import N5.r;
import Nb.h;
import Nb.j;
import R9.J2;
import R9.V0;
import R9.Z0;
import V4.k;
import V4.l;
import Xb.J;
import Xb.q;
import Y8.N;
import Y8.e6;
import a8.E;
import a8.F;
import a8.Q;
import android.content.ClipData.Item;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.format.Formatter;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.widget.AppCompatEditText;
import b4.A0;
import c2.x;
import com.sendwave.backend.fragment.CustomerHomeFragment;
import com.sendwave.backend.type.PartnerOrg;
import com.sendwave.shared.ExtraSecurityChallengeActivity;
import com.sendwave.shared.PhotoActivity;
import com.sendwave.shared.VerifyToken;
import com.sendwave.util.LauncherFragment;
import com.sendwave.util.LockScreenActivity;
import com.wave.customer.RecoverPinActivity;
import com.wave.customer.RecoverPinResult;
import com.wave.customer.RecoverPinWorkflow.StepConfirmPin;
import com.wave.customer.RecoverPinWorkflow.StepVerifyAuthCode;
import com.wave.customer.RootActivity;
import com.wave.customer.SignupSuccess;
import com.wave.customer.home.PersonalHomeActivity;
import com.wave.customer.home.PersonalHomeParams;
import com.wave.customer.n;
import com.wave.voip.VoipCallActivity;
import f.a;
import hb.A;
import hb.u;
import io.sentry.D1;
import io.sentry.E1;
import io.sentry.G1;
import io.sentry.H1;
import io.sentry.I0;
import io.sentry.J1;
import io.sentry.M0;
import io.sentry.M;
import io.sentry.S1;
import io.sentry.T1;
import io.sentry.android.core.L;
import io.sentry.d1;
import io.sentry.q1;
import io.sentry.util.b;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import jeb.synthetic.TWR;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m7.e;
import o6.c;
import o6.g;
import o9.X;
import org.json.JSONArray;
import org.json.JSONObject;
import p5.d;
import q5.m;
import q9.C3;
import q9.W0;
import q9.o0;
import q9.r1;

public final class w implements k, a, I0, J1, M0, q1, b, e, o5.e, o6.a, c, o6.e, g {
    public final int X;
    public final Object Y;

    public w(int v, Object object0) {
        this.X = v;
        this.Y = object0;
        super();
    }

    public w(Function1 function10) {
        this.X = 4;
        super();
        this.Y = (h)function10;
    }

    public w(Function2 function20) {
        this.X = 12;
        super();
        this.Y = (Nb.k)function20;
    }

    public p5.c a(Object object0) {
        p5.c c0;
        p5.b b0 = (p5.b)object0;
        d d0 = (d)this.Y;
        URL uRL0 = b0.a;
        String s = android.support.v4.media.session.a.F("CctTransportBackend");
        if(Log.isLoggable(s, 4)) {
            Log.i(s, String.format("Making request to: %s", uRL0));
        }
        HttpURLConnection httpURLConnection0 = (HttpURLConnection)b0.a.openConnection();
        httpURLConnection0.setConnectTimeout(30000);
        httpURLConnection0.setReadTimeout(d0.g);
        httpURLConnection0.setDoOutput(true);
        httpURLConnection0.setInstanceFollowRedirects(false);
        httpURLConnection0.setRequestMethod("POST");
        httpURLConnection0.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection0.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection0.setRequestProperty("Content-Type", "application/json");
        httpURLConnection0.setRequestProperty("Accept-Encoding", "gzip");
        String s1 = b0.c;
        if(s1 != null) {
            httpURLConnection0.setRequestProperty("X-Goog-Api-Key", s1);
        }
        try(OutputStream outputStream0 = httpURLConnection0.getOutputStream(); GZIPOutputStream gZIPOutputStream0 = new GZIPOutputStream(outputStream0)) {
            s7.e e0 = new s7.e(new BufferedWriter(new OutputStreamWriter(gZIPOutputStream0)), ((s7.d)d0.a.Y).a, ((s7.d)d0.a.Y).b, ((s7.d)d0.a.Y).c, ((s7.d)d0.a.Y).d);
            e0.h(b0.b);
            e0.j();
            e0.b.flush();
        }
        catch(ConnectException | UnknownHostException connectException0) {
            android.support.v4.media.session.a.y("CctTransportBackend", "Couldn\'t open connection, returning with 500", connectException0);
            return new p5.c(500, null, 0L);
        }
        catch(q7.b | IOException b1) {
            android.support.v4.media.session.a.y("CctTransportBackend", "Couldn\'t encode request, returning with 400", b1);
            return new p5.c(400, null, 0L);
        }
        int v = httpURLConnection0.getResponseCode();
        Integer integer0 = v;
        String s2 = android.support.v4.media.session.a.F("CctTransportBackend");
        if(Log.isLoggable(s2, 4)) {
            Log.i(s2, String.format("Status Code: %d", integer0));
        }
        android.support.v4.media.session.a.w("CctTransportBackend", "Content-Type: %s", httpURLConnection0.getHeaderField("Content-Type"));
        android.support.v4.media.session.a.w("CctTransportBackend", "Content-Encoding: %s", httpURLConnection0.getHeaderField("Content-Encoding"));
        switch(v) {
            case 200: {
                InputStream inputStream0 = httpURLConnection0.getInputStream();
                try {
                    InputStream inputStream1 = "gzip".equals(httpURLConnection0.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream0) : inputStream0;
                    try {
                        c0 = new p5.c(200, null, m.a(new BufferedReader(new InputStreamReader(inputStream1))).a);
                    }
                    catch(Throwable throwable1) {
                        TWR.safeClose$NT(inputStream1, throwable1);
                        throw throwable1;
                    }
                    if(inputStream1 != null) {
                        inputStream1.close();
                    }
                }
                catch(Throwable throwable0) {
                    TWR.safeClose$NT(inputStream0, throwable0);
                    throw throwable0;
                }
                if(inputStream0 != null) {
                    inputStream0.close();
                }
                return c0;
            }
            case 301: 
            case 302: 
            case 307: {
                return new p5.c(v, new URL(httpURLConnection0.getHeaderField("Location")), 0L);
            }
            default: {
                return new p5.c(v, null, 0L);
            }
        }
    }

    @Override  // o5.e
    public Object apply(Object object0) {
        E e0 = (E)object0;
        ((B3.c)this.Y).getClass();
        F.b.getClass();
        StringWriter stringWriter0 = new StringWriter();
        try {
            s7.e e1 = new s7.e(stringWriter0, ((s7.d)F.b.Y).a, ((s7.d)F.b.Y).b, ((s7.d)F.b.Y).c, ((s7.d)F.b.Y).d);
            e1.h(e0);
            e1.j();
            e1.b.flush();
        }
        catch(IOException unused_ex) {
        }
        String s = stringWriter0.toString();
        j.e(s, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: " + s);
        byte[] arr_b = s.getBytes(Vb.a.a);
        j.e(arr_b, "this as java.lang.String).getBytes(charset)");
        return arr_b;
    }

    @Override  // f.a
    public void b(Object object0) {
        pb.e e0;
        SignupSuccess signupSuccess0 = null;
        Object object1 = this.Y;
        switch(this.X) {
            case 4: {
                j.f(((ActivityResult)object0), "activityResult");
                Intent intent0 = ((ActivityResult)object0).Y;
                if(intent0 != null) {
                    signupSuccess0 = (SignupSuccess)intent0.getParcelableExtra("com.wave.typeSafeExtras");
                }
                ((Function1)(((h)object1))).n(signupSuccess0);
                return;
            }
            case 6: {
                j.f(((ActivityResult)object0), "activityResult");
                if(((ActivityResult)object0).X == -1) {
                    Intent intent1 = ((ActivityResult)object0).Y;
                    if(intent1 != null) {
                        RecoverPinResult recoverPinResult0 = (RecoverPinResult)intent1.getParcelableExtra("com.wave.typeSafeExtras");
                        if(recoverPinResult0 != null) {
                            Parcelable parcelable0 = intent1.getParcelableExtra("com.wave.workflowState");
                            if(parcelable0 instanceof StepVerifyAuthCode) {
                                mb.a.a(null, null, new n(((RecoverPinActivity)object1), ((StepVerifyAuthCode)parcelable0), recoverPinResult0, null), 3);
                                return;
                            }
                            if(parcelable0 instanceof StepConfirmPin) {
                                o0.T(((RecoverPinActivity)object1), recoverPinResult0, true);
                                return;
                            }
                            new V0(parcelable0);
                        }
                    }
                }
                return;
            }
            case 7: {
                j.f(((ActivityResult)object0), "activityResult");
                if(((ActivityResult)object0).X != -1) {
                    ((RootActivity)object1).finish();
                    return;
                }
                Intent intent2 = ((ActivityResult)object0).Y;
                if(intent2 != null) {
                    SignupSuccess signupSuccess1 = (SignupSuccess)intent2.getParcelableExtra("com.wave.typeSafeExtras");
                    if(signupSuccess1 != null) {
                        ((RootActivity)object1).getClass();
                        J2 j20 = new J2(((RootActivity)object1), signupSuccess1, null);
                        CustomerHomeFragment customerHomeFragment0 = (CustomerHomeFragment)J.t(kotlin.coroutines.j.X, j20);
                        N4.j.h(Z0.b(((RootActivity)object1)).i(), customerHomeFragment0);
                        f f0 = Z0.b(((RootActivity)object1)).d();
                        j.c(customerHomeFragment0.d.c);
                        f0.d(signupSuccess1.Z, customerHomeFragment0, customerHomeFragment0.d.c, customerHomeFragment0.d.b, signupSuccess1.X, signupSuccess1.Y);
                        Z0.b(((RootActivity)object1)).q().b();
                        PartnerOrg partnerOrg0 = signupSuccess1.b0;
                        if(partnerOrg0 != null) {
                            o0.P(Z0.a(((RootActivity)object1)).a(), customerHomeFragment0.e.h.getId(), partnerOrg0);
                        }
                        PersonalHomeParams personalHomeParams0 = new PersonalHomeParams(signupSuccess1.Z, null);
                        Uri uri0 = ((RootActivity)object1).getIntent().getData();
                        ((RootActivity)object1).startActivity(o0.I(((RootActivity)object1), PersonalHomeActivity.class, personalHomeParams0, uri0));
                        ((RootActivity)object1).finish();
                        u u0 = (u)A.b.get("signup_login");
                        if(u0 != null) {
                            u0.b("landing", "root");
                        }
                    }
                }
                return;
            }
            case 10: {
                Uri uri1 = (Uri)object0;
                PhotoActivity photoActivity0 = (PhotoActivity)object1;
                if(uri1 != null) {
                    try {
                        BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
                        bitmapFactory$Options0.inJustDecodeBounds = true;
                        BitmapFactory.decodeStream(photoActivity0.getContentResolver().openInputStream(uri1), null, bitmapFactory$Options0);
                        int v = photoActivity0.I(bitmapFactory$Options0);
                        bitmapFactory$Options0.inJustDecodeBounds = false;
                        bitmapFactory$Options0.inSampleSize = v;
                        photoActivity0.G0 = BitmapFactory.decodeStream(photoActivity0.getContentResolver().openInputStream(uri1), null, bitmapFactory$Options0);
                    }
                    catch(FileNotFoundException fileNotFoundException0) {
                        fileNotFoundException0.printStackTrace();
                        photoActivity0.finish();
                    }
                    photoActivity0.M0 = true;
                    photoActivity0.onSubmit(null);
                }
                return;
            }
            case 15: {
                if(((Boolean)object0).booleanValue()) {
                    ((PersonalHomeActivity)object1).getClass();
                    r1.b(((PersonalHomeActivity)object1)).e().d("push notification permission granted", null);
                    return;
                }
                ((PersonalHomeActivity)object1).getClass();
                r1.b(((PersonalHomeActivity)object1)).e().d("push notification permission denied", null);
                return;
            }
            case 24: {
                j.f(((ActivityResult)object0), "activityResult");
                ((ExtraSecurityChallengeActivity)object1).getClass();
                if(((ActivityResult)object0).X == -1) {
                    Intent intent3 = ((ActivityResult)object0).Y;
                    VerifyToken verifyToken0 = intent3 == null ? null : ((VerifyToken)intent3.getParcelableExtra("com.wave.typeSafeExtras"));
                    if(!(verifyToken0 instanceof VerifyToken)) {
                        verifyToken0 = null;
                    }
                    if(verifyToken0 != null) {
                        X x0 = ((ExtraSecurityChallengeActivity)object1).I();
                        X x1 = ((ExtraSecurityChallengeActivity)object1).I();
                        o9.A a0 = new o9.A(((ExtraSecurityChallengeActivity)object1), verifyToken0, null);
                        N.k(x0, x1.g0, true, a0);
                    }
                }
                return;
            }
            case 26: {
                ((Boolean)object0).getClass();
                ((VoipCallActivity)object1).getClass();
                if(w1.c.a(((VoipCallActivity)object1), "android.permission.RECORD_AUDIO") == 0) {
                    e0 = pb.e.Y;
                }
                else {
                    e0 = v1.b.g(((VoipCallActivity)object1), "android.permission.RECORD_AUDIO") ? pb.e.Z : pb.e.b0;
                }
                q q0 = ((VoipCallActivity)object1).G0;
                if(q0 != null) {
                    q0.b0(e0);
                    return;
                }
                j.p("permissionCompletable");
                throw null;
            }
            case 27: {
                j.f(((ActivityResult)object0), "result");
                kotlin.coroutines.k k0 = ((LauncherFragment)object1).X0;
                if(k0 == null) {
                    hb.n.d("Missing continuation in LauncherFragment", null, null, false, 14);
                    hd.c.a.n("TypeSafeIntents");
                    x x2 = ((LauncherFragment)object1).j();
                    hd.c.a.l("Activity " + x2 + " was killed in background while waiting for a result (was expecting to resume a continuation)", new Object[0]);
                    return;
                }
                k0.i(new Ab.k(((int)((ActivityResult)object0).X), ((ActivityResult)object0).Y));
                return;
            }
            case 28: {
                ((Boolean)object0).getClass();
                ((r1)object1).getClass();
                return;
            }
            default: {
                j.f(((ActivityResult)object0), "activityResult");
                if(((ActivityResult)object0).X == -1) {
                    ((LockScreenActivity)object1).L();
                }
            }
        }
    }

    @Override  // V4.k
    public void c(File file0) {
        HashMap hashMap0;
        int v11;
        JSONObject jSONObject1;
        Map map0;
        ArrayList arrayList0 = (ArrayList)this.Y;
        j.f(file0, "file");
        Class class0 = W4.g.class;
        if(f5.a.b(class0)) {
        label_64:
            map0 = null;
        }
        else {
            try {
                FileInputStream fileInputStream0 = new FileInputStream(file0);
                int v = fileInputStream0.available();
                DataInputStream dataInputStream0 = new DataInputStream(fileInputStream0);
                byte[] arr_b = new byte[v];
                dataInputStream0.readFully(arr_b);
                dataInputStream0.close();
                if(v >= 4) {
                    ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b, 0, 4);
                    byteBuffer0.order(ByteOrder.LITTLE_ENDIAN);
                    int v1 = byteBuffer0.getInt();
                    int v2 = v1 + 4;
                    if(v >= v2) {
                        JSONObject jSONObject0 = new JSONObject(new String(arr_b, 4, v1, Vb.a.a));
                        JSONArray jSONArray0 = jSONObject0.names();
                        int v3 = jSONArray0.length();
                        String[] arr_s = new String[v3];
                        if(v3 - 1 >= 0) {
                            for(int v4 = 0; true; ++v4) {
                                arr_s[v4] = jSONArray0.getString(v4);
                                if(v4 + 1 > v3 - 1) {
                                    break;
                                }
                            }
                        }
                        if(v3 > 1) {
                            Arrays.sort(arr_s);
                        }
                        map0 = new HashMap();
                        int v5 = 0;
                        while(true) {
                            if(v5 >= v3) {
                                break;
                            }
                            String s = arr_s[v5];
                            ++v5;
                            if(s != null) {
                                JSONArray jSONArray1 = jSONObject0.getJSONArray(s);
                                int v6 = jSONArray1.length();
                                int[] arr_v = new int[v6];
                                int v7 = v6 - 1;
                                if(v7 >= 0) {
                                    int v8 = 1;
                                    jSONObject1 = jSONObject0;
                                    for(int v9 = 0; true; ++v9) {
                                        int v10 = jSONArray1.getInt(v9);
                                        arr_v[v9] = v10;
                                        v8 *= v10;
                                        if(v9 + 1 > v7) {
                                            break;
                                        }
                                    }
                                    v11 = v8;
                                }
                                else {
                                    jSONObject1 = jSONObject0;
                                    v11 = 1;
                                }
                                int v12 = v2 + v11 * 4;
                                if(v12 <= v) {
                                    ByteBuffer byteBuffer1 = ByteBuffer.wrap(arr_b, v2, v11 * 4);
                                    byteBuffer1.order(ByteOrder.LITTLE_ENDIAN);
                                    W4.a a0 = new W4.a(arr_v);
                                    byteBuffer1.asFloatBuffer().get(a0.c, 0, v11);
                                    ((HashMap)map0).put(s, a0);
                                    jSONObject0 = jSONObject1;
                                    v2 = v12;
                                    continue;
                                }
                                else {
                                    goto label_64;
                                }
                                break;
                            }
                        }
                    }
                    else {
                        goto label_64;
                    }
                }
                else {
                    goto label_64;
                }
                goto label_65;
            }
            catch(Exception unused_ex) {
                goto label_64;
            }
            catch(Throwable throwable0) {
            }
            f5.a.a(throwable0, class0);
            goto label_64;
        }
    label_65:
        if(map0 == null) {
        label_79:
            hashMap0 = null;
        }
        else {
            hashMap0 = new HashMap();
            HashMap hashMap1 = f5.a.b(W4.b.class) ? null : W4.b.m;
            for(Object object0: map0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                String s1 = (String)map$Entry0.getKey();
                if(hashMap1.containsKey(map$Entry0.getKey())) {
                    s1 = (String)hashMap1.get(map$Entry0.getKey());
                    if(s1 != null) {
                        goto label_76;
                    }
                    goto label_79;
                }
            label_76:
                hashMap0.put(s1, map$Entry0.getValue());
            }
        }
        W4.b b0 = null;
        if(hashMap0 != null) {
            try {
                b0 = new W4.b(hashMap0);
            }
            catch(Exception unused_ex) {
            }
        }
        if(b0 != null) {
            for(Object object1: arrayList0) {
                StringBuilder stringBuilder0 = new StringBuilder();
                stringBuilder0.append(((W4.d)object1).a);
                stringBuilder0.append('_');
                String s2 = M.J.f(stringBuilder0, ((W4.d)object1).d, "_rule");
                E7.g g0 = new E7.g(((W4.d)object1), 5, b0);
                File file1 = new File(W4.g.b(), s2);
                String s3 = ((W4.d)object1).c;
                if(s3 == null || file1.exists()) {
                    g0.c(file1);
                }
                else {
                    new l(s3, file1, g0).execute(new String[0]);
                }
            }
        }
    }

    @Override  // m7.e
    public Object d(C c0) {
        return this.Y;
    }

    @Override  // io.sentry.M0
    public void e(M m0) {
        switch(this.X) {
            case 18: {
                L l0 = (L)this.Y;
                AtomicLong atomicLong0 = l0.X;
                if(atomicLong0.get() == 0L) {
                    G1 g10 = m0.p();
                    if(g10 != null) {
                        Date date0 = null;
                        Date date1 = g10.X;
                        if((date1 == null ? null : ((Date)date1.clone())) != null) {
                            if(date1 != null) {
                                date0 = (Date)date1.clone();
                            }
                            atomicLong0.set(date0.getTime());
                            l0.Y.set(true);
                        }
                    }
                }
                return;
            }
            case 19: {
                G1 g11 = m0.p();
                if(g11 != null && (g11.X == null ? null : ((Date)g11.X.clone())) != null) {
                    ((AtomicBoolean)this.Y).set(true);
                }
                return;
            }
            default: {
                ((io.sentry.android.core.internal.gestures.f)this.Y).getClass();
                m0.m(new E7.g(((io.sentry.android.core.internal.gestures.f)this.Y), 18, m0));
            }
        }
    }

    public void f() {
        synchronized(e0.m.b) {
            e0.m.g = p.D0(((Iterable)e0.m.g), ((Nb.k)this.Y));
        }
    }

    @Override  // io.sentry.J1
    public void g(H1 h10) {
        E1 e10 = (E1)this.Y;
        T1 t10 = e10.q;
        if(t10 != null) {
            t10.f(h10);
        }
        D1 d10 = e10.f;
        S1 s10 = e10.r;
        if(s10.e != null) {
            if(!s10.d || e10.x()) {
                e10.k();
            }
        }
        else if(d10.a) {
            e10.p(d10.b, null);
        }
    }

    @Override  // io.sentry.util.b
    public Object h() {
        return ((io.sentry.cache.b)this.Y).X.getSerializer();
    }

    @Override  // o6.g
    public o6.p i(Object object0) {
        W7.e e0 = (W7.e)object0;
        return o6.k.e(((W7.g)this.Y));
    }

    @Override  // o6.a
    public Object j(o6.h h0) {
        ((A0)this.Y).getClass();
        Class class0 = IOException.class;
        synchronized(((o6.p)h0).a) {
            r.l("Task is not yet complete", ((o6.p)h0).c);
            if(!((o6.p)h0).d) {
                if(class0.isInstance(((o6.p)h0).f)) {
                    throw (Throwable)class0.cast(((o6.p)h0).f);
                }
                Exception exception0 = ((o6.p)h0).f;
                if(exception0 != null) {
                    throw new o6.f(exception0);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
                }
                Bundle bundle0 = (Bundle)((o6.p)h0).e;
                if(bundle0 == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                Object object1 = bundle0.getString("registration_id");
                if(object1 == null) {
                    object1 = bundle0.getString("unregistered");
                    if(object1 == null) {
                        String s = bundle0.getString("error");
                        if("RST".equals(s)) {
                            throw new IOException("INSTANCE_ID_RESET");
                        }
                        if(s != null) {
                            throw new IOException(s);
                        }
                        Log.w("FirebaseMessaging", "Unexpected response: " + bundle0, new Throwable());
                        throw new IOException("SERVICE_NOT_AVAILABLE");
                    }
                }
                return object1;
            }
        }
        throw new CancellationException("Task is already canceled.");
    }

    @Override  // o6.e
    public void k(Object object0) {
        ((Ba.l)this.Y).n(object0);
    }

    @Override  // io.sentry.I0
    public void l(Q q0) {
        Q q1 = new Q(11);
        ((M)this.Y).u(q1);
    }

    public d1 m(d1 d10, io.sentry.x x0) {
        Runtime runtime0 = Runtime.getRuntime();
        d10.a(Formatter.formatFileSize(((C3)this.Y), runtime0.freeMemory()), "free_memory");
        d10.a(Formatter.formatFileSize(((C3)this.Y), runtime0.totalMemory()), "total_memory");
        d10.a(Formatter.formatFileSize(((C3)this.Y), runtime0.maxMemory()), "max_memory");
        N3.a a0 = I.c(((e6)r1.b(((C3)this.Y)).a()).h);
        Ca.j j0 = new Ca.j(new lb.j(12), 5, ((Q3.q)a0));
        long v = (long)((Number)((Q3.q)a0).f.u(j0)).intValue();
        d10.a(Formatter.formatFileSize(((C3)this.Y), v), "in_memory_cache_size");
        d10.b("device_performance_class", ((W0)r1.b(((C3)this.Y)).e0.getValue()).X);
        d10.a(r1.b(((C3)this.Y)).g().e(), "app_prefs");
        return d10;
    }

    public boolean n(I5.h h0, int v, Bundle bundle0) {
        I5.h h2;
        int v1 = Build.VERSION.SDK_INT;
        if(v1 >= 25 && (v & 1) != 0) {
            try {
                ((L1.h)h0.Y).g();
            }
            catch(Exception exception0) {
                Log.w("InputConnectionCompat", "Can\'t insert content from IME; requestPermission() failed", exception0);
                return false;
            }
            Parcelable parcelable0 = (Parcelable)((L1.h)h0.Y).d();
            bundle0 = bundle0 == null ? new Bundle() : new Bundle(bundle0);
            bundle0.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable0);
        }
        ClipDescription clipDescription0 = ((L1.h)h0.Y).a();
        L1.h h1 = (L1.h)h0.Y;
        ClipData clipData0 = new ClipData(clipDescription0, new ClipData.Item(h1.e()));
        if(v1 >= 0x1F) {
            h2 = new I5.h(clipData0, 2);
        }
        else {
            h2 = new J1.d();
            h2.Y = clipData0;
            h2.Z = 2;
        }
        h2.d(h1.h());
        h2.c(bundle0);
        J1.f f0 = h2.b();
        return J1.N.g(((AppCompatEditText)this.Y), f0) == null;
    }

    public float o(float f) {
        return ((g1.k)this.Y).k.getDensity() * f;
    }

    @Override  // o6.c
    public void s(o6.h h0) {
        switch(this.X) {
            case 1: {
                E7.N.a(((Intent)this.Y));
                return;
            }
            case 2: {
                ((P)this.Y).b.d(null);
                return;
            }
            default: {
                ((ScheduledFuture)this.Y).cancel(false);
            }
        }
    }
}

