package E7;

import F0.W;
import I2.J;
import Nb.j;
import Z6.g;
import ac.j0;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Intent;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.e0;
import com.google.android.gms.internal.measurement.h0;
import com.wave.customer.CustomerApp;
import com.wave.voip.VoipCallActivity;
import d7.b;
import d7.c;
import e7.a;
import io.sentry.android.core.v;
import j6.L0;
import j6.M0;
import j6.N0;
import j6.a1;
import j6.c1;
import j6.d0;
import j6.r1;
import j6.t;
import j6.w0;
import java.util.ArrayDeque;
import oa.s;
import q9.o0;
import q9.z3;

public final class o implements Application.ActivityLifecycleCallbacks {
    public final int X;
    public final Object Y;

    public o() {
        this.X = 0;
        super();
        this.Y = new ArrayDeque(10);
    }

    public o(CustomerApp customerApp0, W w0) {
        this.X = 2;
        j.f(w0, "voipController");
        super();
        this.Y = w0;
        customerApp0.registerActivityLifecycleCallbacks(this);
    }

    public o(w0 w00) {
        this.X = 1;
        super();
        this.Y = w00;
    }

    public void a(Intent intent0) {
        String s;
        Bundle bundle0;
        BaseBundle baseBundle0 = null;
        try {
            bundle0 = intent0.getExtras();
            if(bundle0 != null) {
                s = bundle0.getString("google.message_id");
                if(s == null) {
                    s = bundle0.getString("message_id");
                }
                if(!TextUtils.isEmpty(s)) {
                    goto label_7;
                }
                goto label_11;
            }
            goto label_15;
        }
        catch(RuntimeException runtimeException0) {
            goto label_14;
        }
    label_7:
        ArrayDeque arrayDeque0 = (ArrayDeque)this.Y;
        try {
            if(arrayDeque0.contains(s)) {
                return;
            }
            arrayDeque0.add(s);
        label_11:
            baseBundle0 = bundle0.getBundle("gcm.n.analytics_data");
        }
        catch(RuntimeException runtimeException0) {
        label_14:
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", runtimeException0);
        }
    label_15:
        if((baseBundle0 == null ? false : "1".equals(baseBundle0.getString("google.c.a.e")))) {
            if(baseBundle0 != null) {
                if("1".equals(baseBundle0.getString("google.c.a.tc"))) {
                    b b0 = (b)g.c().b(b.class);
                    if(Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                    }
                    if(b0 == null) {
                        Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                    }
                    else {
                        String s1 = baseBundle0.getString("google.c.a.c_id");
                        if(!a.b.contains("fcm") && a.b("fcm", "_ln")) {
                            e0 e00 = (e0)((c)b0).a.Y;
                            e00.getClass();
                            e00.e(new h0(e00, "fcm", "_ln", s1, true, 0));
                        }
                        Bundle bundle1 = new Bundle();
                        bundle1.putString("source", "Firebase");
                        bundle1.putString("medium", "notification");
                        bundle1.putString("campaign", s1);
                        ((c)b0).a("fcm", "_cmp", bundle1);
                    }
                }
                else if(Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                }
            }
            J.K("_no", ((Bundle)baseBundle0));
        }
    }

    private final void b(Activity activity0) {
    }

    private final void c(Activity activity0) {
    }

    private final void d(Activity activity0) {
    }

    private final void e(Activity activity0, Bundle bundle0) {
    }

    private final void f(Activity activity0) {
    }

    private final void g(Activity activity0) {
    }

    private final void h(Activity activity0) {
    }

    private final void i(Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity0, Bundle bundle0) {
        switch(this.X) {
            case 0: {
                Intent intent0 = activity0.getIntent();
                if(intent0 != null) {
                    if(Build.VERSION.SDK_INT <= 25) {
                        new Handler(Looper.getMainLooper()).post(new n(this, 0, intent0));
                        return;
                    }
                    this.a(intent0);
                }
                return;
            }
            case 1: {
                w0 w00 = (w0)this.Y;
                try {
                    try {
                        w00.b().m0.d("onActivityCreated");
                        Intent intent1 = activity0.getIntent();
                        if(intent1 != null) {
                            Uri uri0 = intent1.getData();
                            if(uri0 == null || !uri0.isHierarchical()) {
                                Bundle bundle1 = intent1.getExtras();
                                if(bundle1 == null) {
                                    uri0 = null;
                                }
                                else {
                                    String s = bundle1.getString("com.android.vending.referral_url");
                                    uri0 = TextUtils.isEmpty(s) ? null : Uri.parse(s);
                                }
                            }
                            if(uri0 != null && uri0.isHierarchical()) {
                                w00.p();
                                String s1 = r1.Y(intent1) ? "gs" : "auto";
                                String s2 = uri0.getQueryParameter("referrer");
                                w00.c().z(new J5.g(this, bundle0 == null, uri0, s1, s2));
                                goto label_42;
                            }
                            goto label_44;
                        }
                        goto label_46;
                    }
                    catch(RuntimeException runtimeException0) {
                    }
                    w00.b().e0.b(runtimeException0, "Throwable caught in onActivityCreated");
                }
                catch(Throwable throwable0) {
                    w00.s().z(activity0, bundle0);
                    throw throwable0;
                }
                w00.s().z(activity0, bundle0);
                return;
            label_42:
                w00.s().z(activity0, bundle0);
                return;
            label_44:
                w00.s().z(activity0, bundle0);
                return;
            label_46:
                w00.s().z(activity0, bundle0);
                return;
            }
            default: {
                j.f(activity0, "activity");
                if(!(activity0 instanceof VoipCallActivity) && activity0 instanceof z3) {
                    ((z3)activity0).z0 = true;
                    o0.e(((j0)((W)this.Y).d), ((z3)activity0), new s(this, 3, ((z3)activity0)));
                }
            }
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity0) {
        switch(this.X) {
            case 0: {
                return;
            }
            case 1: {
                L0 l00 = ((w0)this.Y).s();
                Object object0 = l00.k0;
                synchronized(object0) {
                    if(activity0 == l00.f0) {
                        l00.f0 = null;
                    }
                }
                if(((d0)l00.Y).e0.D()) {
                    l00.e0.remove(activity0.hashCode());
                }
                return;
            }
            default: {
                j.f(activity0, "activity");
            }
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity0) {
        switch(this.X) {
            case 0: {
                return;
            }
            case 1: {
                L0 l00 = ((w0)this.Y).s();
                synchronized(l00.k0) {
                    l00.j0 = false;
                    l00.g0 = true;
                }
                ((d0)l00.Y).l0.getClass();
                long v = SystemClock.elapsedRealtime();
                if(((d0)l00.Y).e0.D()) {
                    M0 m00 = l00.D(activity0);
                    l00.c0 = l00.b0;
                    l00.b0 = null;
                    l00.c().z(new v(l00, m00, v));
                }
                else {
                    l00.b0 = null;
                    l00.c().z(new t(l00, v, 1));
                }
                a1 a10 = ((w0)this.Y).t();
                ((d0)a10.Y).l0.getClass();
                long v1 = SystemClock.elapsedRealtime();
                a10.c().z(new c1(a10, v1, 0));
                return;
            }
            default: {
                j.f(activity0, "activity");
            }
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity0) {
        switch(this.X) {
            case 0: {
                return;
            }
            case 1: {
                a1 a10 = ((w0)this.Y).t();
                ((d0)a10.Y).l0.getClass();
                long v = SystemClock.elapsedRealtime();
                a10.c().z(new c1(a10, v, 1));
                L0 l00 = ((w0)this.Y).s();
                Object object0 = l00.k0;
                synchronized(object0) {
                    l00.j0 = true;
                    if(activity0 != l00.f0) {
                        synchronized(l00.k0) {
                            l00.f0 = activity0;
                            l00.g0 = false;
                        }
                        if(((d0)l00.Y).e0.D()) {
                            l00.h0 = null;
                            l00.c().z(new N0(l00, 1));
                        }
                    }
                }
                if(!((d0)l00.Y).e0.D()) {
                    l00.b0 = l00.h0;
                    l00.c().z(new N0(l00, 0));
                    return;
                }
                l00.A(activity0, l00.D(activity0), false);
                j6.n n0 = ((d0)l00.Y).l();
                ((d0)n0.Y).l0.getClass();
                long v2 = SystemClock.elapsedRealtime();
                n0.c().z(new t(n0, v2, 0));
                return;
            }
            default: {
                j.f(activity0, "activity");
            }
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
        switch(this.X) {
            case 0: {
                break;
            }
            case 1: {
                L0 l00 = ((w0)this.Y).s();
                if(((d0)l00.Y).e0.D() && bundle0 != null) {
                    M0 m00 = (M0)l00.e0.get(activity0.hashCode());
                    if(m00 != null) {
                        Bundle bundle1 = new Bundle();
                        bundle1.putLong("id", m00.c);
                        bundle1.putString("name", m00.a);
                        bundle1.putString("referrer_name", m00.b);
                        bundle0.putBundle("com.google.app_measurement.screen_service", bundle1);
                    }
                }
                break;
            }
            default: {
                j.f(activity0, "activity");
                j.f(bundle0, "outState");
            }
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity0) {
        if(this.X != 0 && this.X != 1) {
            j.f(activity0, "activity");
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity0) {
        if(this.X != 0 && this.X != 1) {
            j.f(activity0, "activity");
        }
    }
}

