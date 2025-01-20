package a5;

import M4.B;
import M4.h;
import N4.c;
import N4.d;
import N4.v;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import f5.a;
import io.sentry.hints.i;
import java.util.Arrays;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.json.JSONException;
import org.json.JSONObject;

public final class k implements Runnable {
    public final int X;
    public final Context Y;
    public final String Z;
    public final String b0;

    public k(Context context0, String s, String s1) {
        this.X = 1;
        super();
        this.Y = context0;
        this.Z = s;
        this.b0 = s1;
    }

    public k(String s, Context context0, String s1) {
        this.X = 0;
        super();
        this.Z = s;
        this.Y = context0;
        this.b0 = s1;
    }

    @Override
    public final void run() {
        Class class2;
        JSONObject jSONObject0;
        if(this.X != 0) {
            String s = this.Z;
            String s1 = this.b0;
            SharedPreferences sharedPreferences0 = this.Y.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
            m m0 = null;
            String s2 = sharedPreferences0.getString(s, null);
            boolean z = w.P(s2);
            p p0 = p.a;
            if(!z) {
                if(s2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                try {
                    jSONObject0 = null;
                    jSONObject0 = new JSONObject(s2);
                }
                catch(JSONException unused_ex) {
                }
                if(jSONObject0 != null) {
                    m0 = p.e(s1, jSONObject0);
                }
            }
            JSONObject jSONObject1 = p.a();
            p.e(s1, jSONObject1);
            sharedPreferences0.edit().putString(s, jSONObject1.toString()).apply();
            if(m0 != null) {
                String s3 = m0.h;
                if(!p.f && s3.length() > 0) {
                    p.f = true;
                    Log.w("p", s3);
                }
            }
            JSONObject jSONObject2 = l.a();
            Context context0 = M4.l.a();
            String s4 = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{s1}, 1));
            context0.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(s4, jSONObject2.toString()).apply();
            l.d(s1, jSONObject2);
            Context context1 = M4.l.a();
            String s5 = M4.l.b();
            if(B.c()) {
                if(context1 instanceof Application) {
                    Application application0 = (Application)context1;
                    if(!M4.l.l.get()) {
                        throw new h("The Facebook sdk must be initialized before calling activateApp");
                    }
                    if(!d.c) {
                        if(N4.m.b() == null) {
                            i.z();
                        }
                        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = N4.m.b();
                        if(scheduledThreadPoolExecutor0 == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        scheduledThreadPoolExecutor0.execute(new c(0));
                    }
                    Class class0 = v.class;
                    if(!a.b(class0)) {
                        try {
                            if(!v.c.get()) {
                                v.a.b();
                            }
                        }
                        catch(Throwable throwable0) {
                            a.a(throwable0, class0);
                        }
                    }
                    Class class1 = M4.l.class;
                    if(!a.b(class1)) {
                        try {
                            Context context2 = application0.getApplicationContext();
                            if(context2 != null) {
                                if(!l.b("app_events_killswitch", M4.l.b(), false)) {
                                    M4.l.c().execute(new M4.k(0, context2, s5));
                                }
                                if(j.b(a5.h.q0) && X4.a.a()) {
                                    class2 = X4.a.class;
                                    if(!a.b(class2)) {
                                        goto label_59;
                                    }
                                }
                            }
                            goto label_67;
                        }
                        catch(Throwable throwable1) {
                            goto label_66;
                        }
                        try {
                        label_59:
                            Context context3 = M4.l.a();
                            M4.l.c().execute(new M4.k(1, context3, s5));
                            goto label_67;
                        }
                        catch(Throwable throwable2) {
                            try {
                                a.a(throwable2, class2);
                                goto label_67;
                            }
                            catch(Throwable throwable1) {
                            }
                        }
                    label_66:
                        a.a(throwable1, class1);
                    }
                label_67:
                    V4.d.c(application0, s5);
                }
                else {
                    Log.w("V4.j", "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
                }
            }
            o o0 = p.c.containsKey(s1) ? o.Z : o.b0;
            p.d.set(o0);
            p0.g();
            return;
        }
        String s6 = this.Z;
        Context context4 = this.Y;
        String s7 = this.b0;
        JSONObject jSONObject3 = l.a();
        if(jSONObject3.length() != 0) {
            l.d(s6, jSONObject3);
            context4.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(s7, jSONObject3.toString()).apply();
            l.d = System.currentTimeMillis();
        }
        l.e();
        l.a.set(false);
    }
}

