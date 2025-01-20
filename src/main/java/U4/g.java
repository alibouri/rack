package U4;

import M4.l;
import a5.m;
import a5.p;
import a5.w;
import f5.a;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

public final class g {
    public static final g a;
    public static boolean b;
    public static HashSet c;
    public static HashMap d;

    static {
        g.a = new g();  // initializer: Ljava/lang/Object;-><init>()V
        g.c = new HashSet();
        g.d = new HashMap();
    }

    public final void a() {
        m m0;
        if(a.b(this)) {
            return;
        }
        try {
            m0 = p.h(l.b(), false);
            if(m0 == null) {
                return;
            }
            goto label_6;
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
            return;
        }
        return;
        try {
        label_6:
            g.c = new HashSet();
            g.d = new HashMap();
            JSONArray jSONArray0 = m0.p;
            if(jSONArray0 != null && jSONArray0.length() != 0) {
                int v1 = jSONArray0.length();
                if(v1 > 0) {
                    for(int v = 0; true; ++v) {
                        JSONObject jSONObject0 = jSONArray0.getJSONObject(v);
                        if(jSONObject0.has("key") && jSONObject0.has("value")) {
                            String s = jSONObject0.getString("key");
                            JSONArray jSONArray1 = jSONObject0.getJSONArray("value");
                            if(s != null && jSONArray1 != null) {
                                HashSet hashSet0 = w.s(jSONArray1);
                                if(hashSet0 != null) {
                                    if(s.equals("_MTSDK_Default_")) {
                                        g.c = hashSet0;
                                    }
                                    else {
                                        g.d.put(s, hashSet0);
                                    }
                                }
                            }
                        }
                        if(v + 1 >= v1) {
                            break;
                        }
                    }
                }
            }
            return;
        }
        catch(Exception unused_ex) {
            return;
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, this);
    }
}

