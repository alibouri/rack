package M4;

import N4.b;
import N4.i;
import Nb.j;
import android.util.Log;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a implements p {
    public final int a;
    public final Serializable b;
    public final Object c;
    public final Object d;
    public final Object e;

    public a(Serializable serializable0, Object object0, Object object1, Object object2, int v) {
        this.a = v;
        this.b = serializable0;
        this.c = object0;
        this.d = object1;
        this.e = object2;
        super();
    }

    @Override  // M4.p
    public final void a(w w0) {
        if(this.a != 0) {
            b b0 = (b)this.b;
            t t0 = (t)this.c;
            N4.t t1 = (N4.t)this.d;
            A0.b b1 = (A0.b)this.e;
            Class class0 = i.class;
            if(!f5.a.b(class0)) {
                try {
                    i.e(b0, t0, w0, t1, b1);
                    return;
                }
                catch(Throwable throwable0) {
                    f5.a.a(throwable0, class0);
                }
            }
            return;
        }
        AtomicBoolean atomicBoolean0 = (AtomicBoolean)this.b;
        HashSet hashSet0 = (HashSet)this.c;
        HashSet hashSet1 = (HashSet)this.d;
        HashSet hashSet2 = (HashSet)this.e;
        JSONObject jSONObject0 = w0.d;
        if(jSONObject0 != null) {
            JSONArray jSONArray0 = jSONObject0.optJSONArray("data");
            if(jSONArray0 != null) {
                atomicBoolean0.set(true);
                int v = jSONArray0.length();
                if(v > 0) {
                    for(int v1 = 0; true; ++v1) {
                        JSONObject jSONObject1 = jSONArray0.optJSONObject(v1);
                        if(jSONObject1 != null) {
                            String s = jSONObject1.optString("permission");
                            String s1 = jSONObject1.optString("status");
                            if(!a5.w.P(s) && !a5.w.P(s1)) {
                                j.e(s1, "status");
                                Locale locale0 = Locale.US;
                                j.e(locale0, "US");
                                String s2 = s1.toLowerCase(locale0);
                                j.e(s2, "(this as java.lang.String).toLowerCase(locale)");
                                switch(s2) {
                                    case "declined": {
                                        hashSet1.add(s);
                                        break;
                                    }
                                    case "expired": {
                                        hashSet2.add(s);
                                        break;
                                    }
                                    case "granted": {
                                        hashSet0.add(s);
                                        break;
                                    }
                                    default: {
                                        Log.w("AccessTokenManager", "Unexpected status: " + s2);
                                    }
                                }
                            }
                        }
                        if(v1 + 1 >= v) {
                            break;
                        }
                    }
                }
            }
        }
    }
}

