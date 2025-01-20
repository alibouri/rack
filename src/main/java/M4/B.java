package M4;

import E.f0;
import Nb.j;
import a5.t;
import android.util.Log;
import c5.c;
import com.facebook.FacebookRequestError;
import g5.a;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import v7.d;

public final class b implements p {
    public final int a;
    public final Object b;

    public b(int v, Object object0) {
        this.a = v;
        this.b = object0;
        super();
    }

    public b(d d0, String s) {
        this.a = 1;
        super();
        this.b = s;
    }

    @Override  // M4.p
    public final void a(w w0) {
        Boolean boolean0 = null;
        Object object0 = this.b;
        switch(this.a) {
            case 0: {
                JSONObject jSONObject1 = w0.d;
                if(jSONObject1 != null) {
                    ((f0)object0).d = jSONObject1.optString("access_token");
                    ((f0)object0).b = jSONObject1.optInt("expires_at");
                    ((f0)object0).c = jSONObject1.optInt("expires_in");
                    ((f0)object0).e = jSONObject1.optLong("data_access_expiration_time");
                    ((f0)object0).f = jSONObject1.optString("graph_domain", null);
                }
                return;
            }
            case 1: {
                j.f(((String)object0), "$accessToken");
                FacebookRequestError facebookRequestError0 = w0.c;
                if(facebookRequestError0 != null) {
                    Log.e("Profile", "Got unexpected exception: " + facebookRequestError0.g0);
                    return;
                }
                JSONObject jSONObject2 = w0.d;
                if(jSONObject2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                t.a.put(((String)object0), jSONObject2);
                d.v(jSONObject2);
                return;
            }
            case 2: {
                c c0 = (c)object0;
                try {
                    if(w0.c == null) {
                        JSONObject jSONObject3 = w0.d;
                        if(jSONObject3 != null) {
                            boolean0 = Boolean.valueOf(jSONObject3.getBoolean("success"));
                        }
                        if(j.a(boolean0, Boolean.TRUE)) {
                            J2.w.x(c0.a);
                        }
                    }
                }
                catch(JSONException unused_ex) {
                }
                return;
            }
            default: {
                ArrayList arrayList0 = (ArrayList)object0;
                try {
                    if(w0.c == null) {
                        JSONObject jSONObject0 = w0.d;
                        if(jSONObject0 != null) {
                            boolean0 = Boolean.valueOf(jSONObject0.getBoolean("success"));
                        }
                        if(j.a(boolean0, Boolean.TRUE)) {
                            for(Object object1: arrayList0) {
                                J2.w.x(((a)object1).a);
                            }
                        }
                    }
                }
                catch(JSONException unused_ex) {
                }
            }
        }
    }
}

