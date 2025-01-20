package V4;

import Ab.k;
import Bb.F;
import M4.B;
import M4.y;
import N4.d;
import N4.v;
import a5.b;
import a5.h;
import a5.j;
import a5.w;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import f5.a;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

public abstract class g {
    public static final HashMap a;

    static {
        g.a = F.D(new k[]{new k(f.X, "MOBILE_APP_INSTALL"), new k(f.Y, "CUSTOM_APP_EVENTS")});
    }

    public static final JSONObject a(f f0, b b0, String s, boolean z, Context context0) {
        String s3;
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("event", g.a.get(f0));
        if(!d.c) {
            Log.w("d", "initStore should have been called before calling setUserID");
            d.a();
        }
        d.a.readLock().lock();
        String s1 = d.b;
        d.a.readLock().unlock();
        if(s1 != null) {
            jSONObject0.put("app_user_id", s1);
        }
        h h0 = h.B0;
        if(!j.b(h0)) {
            jSONObject0.put("anon_id", s);
        }
        jSONObject0.put("application_tracking_enabled", !z);
        jSONObject0.put("advertiser_id_collection_enabled", B.b());
        String s2 = null;
        if(b0 != null) {
            if(j.b(h0)) {
                if(Build.VERSION.SDK_INT < 0x1F || !w.O(context0)) {
                    jSONObject0.put("anon_id", s);
                }
                else if(!b0.e) {
                    jSONObject0.put("anon_id", s);
                }
            }
            if(b0.c != null) {
                if(!j.b(h0)) {
                    jSONObject0.put("attribution", b0.c);
                }
                else if(Build.VERSION.SDK_INT < 0x1F || !w.O(context0)) {
                    jSONObject0.put("attribution", b0.c);
                }
                else if(!b0.e) {
                    jSONObject0.put("attribution", b0.c);
                }
            }
            if(b0.a() != null) {
                jSONObject0.put("advertiser_id", b0.a());
                jSONObject0.put("advertiser_tracking_enabled", !b0.e);
            }
            if(!b0.e) {
                Class class0 = v.class;
                if(!a.b(class0)) {
                    try {
                        boolean z1 = v.c.get();
                        v v0 = v.a;
                        if(!z1) {
                            v0.b();
                        }
                        HashMap hashMap0 = new HashMap();
                        hashMap0.putAll(v.d);
                        hashMap0.putAll(v0.a());
                        s3 = w.V(hashMap0);
                        goto label_52;
                    }
                    catch(Throwable throwable0) {
                    }
                    a.a(throwable0, class0);
                }
                s3 = null;
            label_52:
                if(s3.length() != 0) {
                    jSONObject0.put("ud", s3);
                }
            }
            String s4 = b0.d;
            if(s4 != null) {
                jSONObject0.put("installer_package", s4);
            }
        }
        i i0 = i.b.b();
        if(i0 != null && !a.b(i0)) {
            try {
                s2 = i0.a().getString("campaign_ids", null);
            }
            catch(Throwable throwable1) {
                a.a(throwable1, i0);
            }
        }
        if(s2 != null) {
            jSONObject0.put("campaign_ids", s2);
        }
        try {
            w.h0(jSONObject0, context0);
        }
        catch(Exception exception0) {
            io.sentry.hints.i.D(y.b0, "AppEvents", "Fetching extended device info parameters failed: \'%s\'", new Object[]{exception0.toString()});
        }
        JSONObject jSONObject1 = w.E();
        if(jSONObject1 != null) {
            Iterator iterator0 = jSONObject1.keys();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                jSONObject0.put(((String)object0), jSONObject1.get(((String)object0)));
            }
        }
        jSONObject0.put("application_package_name", "com.wave.personal");
        return jSONObject0;
    }
}

