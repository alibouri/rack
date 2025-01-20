package M4;

import Bb.q;
import Bb.z;
import J2.w;
import V4.g;
import X4.a;
import X4.c;
import X4.f;
import a5.b;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import io.sentry.hints.i;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public final class k implements Runnable {
    public final int X;
    public final Context Y;
    public final String Z;

    public k(int v, Context context0, String s) {
        this.X = v;
        this.Y = context0;
        this.Z = s;
        super();
    }

    @Override
    public final void run() {
        JSONObject jSONObject0;
        Class class1;
        SharedPreferences sharedPreferences0;
        f f0 = f.a;
        String s = this.Z;
        Context context0 = this.Y;
        if(this.X != 0) {
            Class class0 = a.class;
            if(!f5.a.b(class0)) {
                try {
                    sharedPreferences0 = context0.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                    if(sharedPreferences0.getLong(s + "pingForOnDevice", 0L) == 0L) {
                        class1 = f.class;
                        if(!f5.a.b(class1)) {
                            goto label_10;
                        }
                        goto label_14;
                    }
                }
                catch(Throwable throwable0) {
                    f5.a.a(throwable0, class0);
                }
                return;
                try {
                label_10:
                    f0.b(c.Y, s, z.X);
                    goto label_14;
                }
                catch(Throwable throwable1) {
                    try {
                        f5.a.a(throwable1, class1);
                    label_14:
                        SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
                        sharedPreferences$Editor0.putLong(s + "pingForOnDevice", System.currentTimeMillis());
                        sharedPreferences$Editor0.apply();
                        return;
                    }
                    catch(Throwable throwable0) {
                    }
                }
                f5.a.a(throwable0, class0);
            }
            return;
        }
        l l0 = l.a;
        if(!f5.a.b(l0)) {
            try {
                b b0 = w.F(context0);
                SharedPreferences sharedPreferences1 = context0.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                long v = sharedPreferences1.getLong(s + "ping", 0L);
                try {
                    String s1 = q.s(context0);
                    boolean z = l.e(context0);
                    jSONObject0 = g.a(V4.f.X, b0, s1, z, context0);
                }
                catch(JSONException jSONException0) {
                    throw new h("An error occurred while publishing install.", jSONException0);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
                }
                String s2 = i.v();
                if(s2 != null) {
                    jSONObject0.put("install_referrer", s2);
                }
                String s3 = String.format("%s/activities", Arrays.copyOf(new Object[]{s}, 1));
                l.n.getClass();
                if(v == 0L && i.G(null, s3, jSONObject0, null).c().c == null) {
                    SharedPreferences.Editor sharedPreferences$Editor1 = sharedPreferences1.edit();
                    sharedPreferences$Editor1.putLong(s + "ping", System.currentTimeMillis());
                    sharedPreferences$Editor1.apply();
                    i.C(y.b0, "M4.l", "MOBILE_APP_INSTALL has been logged");
                    return;
                }
                return;
            }
            catch(Exception unused_ex) {
                return;
            }
            catch(Throwable throwable2) {
            }
            f5.a.a(throwable2, l0);
        }
    }
}

