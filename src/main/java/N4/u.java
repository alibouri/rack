package N4;

import J2.w;
import M4.l;
import M4.t;
import M4.x;
import Nb.j;
import Q4.d;
import V4.e;
import a5.b;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import f5.a;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

public final class u implements Runnable {
    public final int X;
    public final String Y;

    public u(String s, int v) {
        this.X = v;
        this.Y = s;
        super();
    }

    @Override
    public final void run() {
        Locale locale0;
        boolean z = true;
        if(this.X != 0) {
            String s = this.Y;
            String s1 = "0";
            Class class0 = d.class;
            if(!a.b(class0)) {
                try {
                    Bundle bundle0 = new Bundle();
                    b b0 = w.F(l.a());
                    JSONArray jSONArray0 = new JSONArray();
                    jSONArray0.put((Build.MODEL == null ? "" : Build.MODEL));
                    if((b0 == null ? null : b0.a()) == null) {
                        jSONArray0.put("");
                    }
                    else {
                        jSONArray0.put(b0.a());
                    }
                    jSONArray0.put("0");
                    if(e.c()) {
                        s1 = "1";
                    }
                    jSONArray0.put(s1);
                    try {
                        locale0 = null;
                        locale0 = l.a().getResources().getConfiguration().locale;
                    }
                    catch(Exception unused_ex) {
                    }
                    if(locale0 == null) {
                        locale0 = Locale.getDefault();
                        j.e(locale0, "getDefault()");
                    }
                    jSONArray0.put(locale0.getLanguage() + '_' + locale0.getCountry());
                    String s2 = jSONArray0.toString();
                    j.e(s2, "extInfoArray.toString()");
                    bundle0.putString("device_session_id", d.a());
                    bundle0.putString("extinfo", s2);
                    JSONObject jSONObject0 = new t(null, String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[]{s}, 1)), bundle0, x.Y, null).c().b;
                    AtomicBoolean atomicBoolean0 = d.g;
                    if(jSONObject0 == null || !jSONObject0.optBoolean("is_app_indexing_enabled", false)) {
                        z = false;
                    }
                    atomicBoolean0.set(z);
                    if(atomicBoolean0.get()) {
                        Q4.l l0 = d.d;
                        if(l0 != null) {
                            l0.c();
                        }
                    }
                    else {
                        d.e = null;
                    }
                    d.h = false;
                    return;
                }
                catch(Throwable throwable0) {
                }
                a.a(throwable0, class0);
            }
            return;
        }
        String s3 = this.Y;
        Class class1 = v.class;
        if(!a.b(class1)) {
            try {
                if(!v.c.get()) {
                    v.a.b();
                }
                SharedPreferences sharedPreferences0 = v.b;
                if(sharedPreferences0 != null) {
                    sharedPreferences0.edit().putString("com.facebook.appevents.UserDataStore.internalUserData", s3).apply();
                    return;
                }
                j.p("sharedPreferences");
                throw null;
            }
            catch(Throwable throwable1) {
            }
            a.a(throwable1, class1);
        }
    }
}

