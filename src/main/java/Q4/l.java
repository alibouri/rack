package Q4;

import E7.n;
import M4.t;
import M4.w;
import M4.y;
import Nb.j;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import f5.a;
import io.sentry.hints.i;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

public final class l {
    public final Handler a;
    public final WeakReference b;
    public Timer c;
    public String d;
    public static final String e;

    static {
        l.e = l.class.getCanonicalName() == null ? "" : l.class.getCanonicalName();
    }

    public l(Activity activity0) {
        j.f(activity0, "activity");
        super();
        this.b = new WeakReference(activity0);
        this.d = null;
        this.a = new Handler(Looper.getMainLooper());
    }

    // Deobfuscation rating: LOW(20)
    public static final String a() {
        return a.b(l.class) ? null : l.e;
    }

    public final void b(t t0, String s) {
        Class class0;
        boolean z;
        String s1 = l.e;
        if(a.b(this)) {
            return;
        }
        if(t0 == null) {
            return;
        }
        try {
            w w0 = t0.c();
            try {
                JSONObject jSONObject0 = w0.b;
                if(jSONObject0 == null) {
                    Log.e(s1, "Error sending UI component tree to Facebook: " + w0.c);
                    return;
                }
                if("true".equals(jSONObject0.optString("success"))) {
                    i.C(y.b0, s1, "Successfully send UI component tree to server");
                    this.d = s;
                }
                if(jSONObject0.has("is_app_indexing_enabled")) {
                    z = jSONObject0.getBoolean("is_app_indexing_enabled");
                    class0 = d.class;
                    if(!a.b(class0)) {
                        goto label_17;
                    }
                }
                return;
            }
            catch(JSONException jSONException0) {
                goto label_25;
            }
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
            return;
        }
        try {
        label_17:
            d.g.set(z);
            return;
        }
        catch(Throwable throwable1) {
            try {
                try {
                    a.a(throwable1, class0);
                    return;
                }
                catch(JSONException jSONException0) {
                }
            label_25:
                Log.e(s1, "Error decoding server response.", jSONException0);
                return;
            }
            catch(Throwable throwable0) {
            }
        }
        a.a(throwable0, this);
    }

    public final void c() {
        if(a.b(this)) {
            return;
        }
        try {
            k k0 = new k(0, this);
            try {
                M4.l.c().execute(new n(this, 15, k0));
            }
            catch(RejectedExecutionException rejectedExecutionException0) {
                Log.e(l.e, "Error scheduling indexing job", rejectedExecutionException0);
            }
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
        }
    }
}

