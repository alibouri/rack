package M4;

import E7.n;
import M6.b;
import N4.i;
import N4.m;
import N4.p;
import a5.t;
import a5.w;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.Profile;
import f5.a;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.json.JSONException;
import org.json.JSONObject;
import v7.d;

public final class j implements Callable {
    public final int a;

    public j(int v) {
        this.a = v;
        super();
    }

    @Override
    public final Object call() {
        String s3;
        AccessToken accessToken0;
        switch(this.a) {
            case 0: {
                Context context0 = l.h;
                if(context0 != null) {
                    return context0.getCacheDir();
                }
                Nb.j.p("applicationContext");
                throw null;
            }
            case 1: {
                e e0 = e.f.w();
                SharedPreferences sharedPreferences0 = (SharedPreferences)e0.b.Y;
                if(sharedPreferences0.contains("com.facebook.AccessTokenManager.CachedAccessToken")) {
                    String s = sharedPreferences0.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
                    if(s != null) {
                        try {
                            accessToken0 = b.t(new JSONObject(s));
                            goto label_15;
                        }
                        catch(JSONException unused_ex) {
                        }
                    }
                    goto label_14;
                }
                else {
                label_14:
                    accessToken0 = null;
                }
            label_15:
                if(accessToken0 != null) {
                    e0.c(accessToken0, false);
                }
                H6.e e1 = z.d;
                z z0 = e1.o();
                String s1 = z0.b.a.getString("com.facebook.ProfileManager.CachedProfile", null);
                Profile profile0 = null;
                if(s1 != null) {
                    try {
                        profile0 = new Profile(new JSONObject(s1));
                    }
                    catch(JSONException unused_ex) {
                    }
                }
                if(profile0 != null) {
                    z0.a(profile0, false);
                }
                if(b.L() && e1.o().c == null) {
                    AccessToken accessToken1 = b.A();
                    if(accessToken1 != null) {
                        if(b.L()) {
                            d d0 = new d(7);
                            String s2 = accessToken1.c0;
                            Nb.j.f(s2, "accessToken");
                            JSONObject jSONObject0 = (JSONObject)t.a.get(s2);
                            if(jSONObject0 == null) {
                                M4.b b0 = new M4.b(d0, s2);
                                x x0 = x.X;
                                Bundle bundle0 = new Bundle();
                                AccessToken accessToken2 = b.A();
                                if(accessToken2 == null) {
                                    s3 = "facebook";
                                }
                                else {
                                    s3 = accessToken2.i0;
                                    if(s3 == null) {
                                        s3 = "facebook";
                                    }
                                }
                                bundle0.putString("fields", (s3.equals("instagram") ? "id,name,profile_picture" : "id,name,first_name,middle_name,last_name"));
                                bundle0.putString("access_token", s2);
                                M4.t t0 = new M4.t(null, "me", null, null, new q(0));
                                t0.d = bundle0;
                                t0.h = x0;
                                t0.j(b0);
                                t0.d();
                            }
                            else {
                                d.v(jSONObject0);
                            }
                        }
                        else {
                            e1.o().a(null, true);
                        }
                    }
                }
                Context context1 = l.a();
                String s4 = l.d;
                if(B.c()) {
                    m m0 = new m(context1, s4);
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = m.b();
                    if(scheduledThreadPoolExecutor0 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    scheduledThreadPoolExecutor0.execute(new n(context1, 10, m0));
                }
                Class class0 = B.class;
                if(!a.b(class0)) {
                    try {
                        Context context2 = l.a();
                        ApplicationInfo applicationInfo0 = context2.getPackageManager().getApplicationInfo("com.wave.personal", 0x80);
                        Nb.j.e(applicationInfo0, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                        if(applicationInfo0.metaData != null && applicationInfo0.metaData.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                            m m1 = new m(context2, null);
                            Bundle bundle1 = new Bundle();
                            if(!w.M()) {
                                bundle1.putString("SchemeWarning", "You haven\'t set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                                Log.w("M4.B", "You haven\'t set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                            }
                            if(B.c()) {
                                m1.e("fb_auto_applink", bundle1);
                            }
                        }
                        goto label_80;
                    }
                    catch(PackageManager.NameNotFoundException unused_ex) {
                        goto label_80;
                    }
                    catch(Throwable throwable0) {
                    }
                    a.a(throwable0, class0);
                }
            label_80:
                Context context3 = l.a().getApplicationContext();
                Nb.j.e(context3, "getApplicationContext().applicationContext");
                m m2 = new m(context3, null);
                if(!a.b(m2)) {
                    try {
                        i.c(p.X);
                        return null;
                    }
                    catch(Throwable throwable1) {
                        a.a(throwable1, m2);
                    }
                }
                return null;
            }
            case 2: {
                return InetAddress.getLocalHost();
            }
            case 3: {
                return null;
            }
            case 4: {
                return new ArrayList();
            }
            default: {
                return io.sentry.android.core.internal.util.b.b.a();
            }
        }
    }
}

