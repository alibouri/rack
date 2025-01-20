package c5;

import J2.w;
import Nb.j;
import android.os.Build.VERSION;
import android.os.Build;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {
    public String a;
    public a b;
    public JSONArray c;
    public String d;
    public String e;
    public String f;
    public Long g;

    public final boolean a() {
        int v = this.b == null ? -1 : b.a[this.b.ordinal()];
        Long long0 = this.g;
        if(v != 1) {
            String s = this.f;
            switch(v) {
                case 2: {
                    return s != null && this.e != null && long0 != null;
                }
                case 3: 
                case 4: 
                case 5: {
                    return s != null && long0 != null;
                }
                default: {
                    return false;
                }
            }
        }
        return this.c != null && long0 != null;
    }

    public final void b() {
        if(!this.a()) {
            return;
        }
        w.U(this.a, this.toString());
    }

    @Override
    public final String toString() {
        a a0 = this.b;
        Long long0 = this.g;
        JSONObject jSONObject0 = null;
        switch((a0 == null ? -1 : b.a[a0.ordinal()])) {
            case 1: {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    JSONArray jSONArray0 = this.c;
                    if(jSONArray0 != null) {
                        jSONObject2.put("feature_names", jSONArray0);
                    }
                    if(long0 != null) {
                        jSONObject2.put("timestamp", long0);
                    }
                    jSONObject0 = jSONObject2;
                }
                catch(JSONException unused_ex) {
                }
                break;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: {
                JSONObject jSONObject1 = new JSONObject();
                try {
                    jSONObject1.put("device_os_version", Build.VERSION.RELEASE);
                    jSONObject1.put("device_model", Build.MODEL);
                    String s = this.d;
                    if(s != null) {
                        jSONObject1.put("app_version", s);
                    }
                    if(long0 != null) {
                        jSONObject1.put("timestamp", long0);
                    }
                    String s1 = this.e;
                    if(s1 != null) {
                        jSONObject1.put("reason", s1);
                    }
                    String s2 = this.f;
                    if(s2 != null) {
                        jSONObject1.put("callstack", s2);
                    }
                    if(a0 != null) {
                        jSONObject1.put("type", a0);
                    }
                    jSONObject0 = jSONObject1;
                }
                catch(JSONException unused_ex) {
                }
            }
        }
        if(jSONObject0 == null) {
            String s3 = new JSONObject().toString();
            j.e(s3, "JSONObject().toString()");
            return s3;
        }
        String s4 = jSONObject0.toString();
        j.e(s4, "params.toString()");
        return s4;
    }
}

