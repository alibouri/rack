package W7;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class e {
    public final JSONObject a;
    public final JSONObject b;
    public final Date c;
    public final JSONArray d;
    public final JSONObject e;
    public final long f;
    public final JSONArray g;
    public static final Date h;

    static {
        e.h = new Date(0L);
    }

    public e(JSONObject jSONObject0, Date date0, JSONArray jSONArray0, JSONObject jSONObject1, long v, JSONArray jSONArray1) {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("configs_key", jSONObject0);
        jSONObject2.put("fetch_time_key", date0.getTime());
        jSONObject2.put("abt_experiments_key", jSONArray0);
        jSONObject2.put("personalization_metadata_key", jSONObject1);
        jSONObject2.put("template_version_number_key", v);
        jSONObject2.put("rollout_metadata_key", jSONArray1);
        this.b = jSONObject0;
        this.c = date0;
        this.d = jSONArray0;
        this.e = jSONObject1;
        this.f = v;
        this.g = jSONArray1;
        this.a = jSONObject2;
    }

    public static e a(JSONObject jSONObject0) {
        JSONObject jSONObject1 = jSONObject0.optJSONObject("personalization_metadata_key");
        if(jSONObject1 == null) {
            jSONObject1 = new JSONObject();
        }
        JSONArray jSONArray0 = jSONObject0.optJSONArray("rollout_metadata_key");
        if(jSONArray0 == null) {
            jSONArray0 = new JSONArray();
        }
        return new e(jSONObject0.getJSONObject("configs_key"), new Date(jSONObject0.getLong("fetch_time_key")), jSONObject0.getJSONArray("abt_experiments_key"), jSONObject1, jSONObject0.optLong("template_version_number_key"), jSONArray0);
    }

    public final HashMap b() {
        HashMap hashMap0 = new HashMap();
        for(int v = 0; true; ++v) {
            JSONArray jSONArray0 = this.g;
            if(v >= jSONArray0.length()) {
                break;
            }
            JSONObject jSONObject0 = jSONArray0.getJSONObject(v);
            String s = jSONObject0.getString("rolloutId");
            String s1 = jSONObject0.getString("variantId");
            JSONArray jSONArray1 = jSONObject0.getJSONArray("affectedParameterKeys");
            for(int v1 = 0; v1 < jSONArray1.length(); ++v1) {
                String s2 = jSONArray1.getString(v1);
                if(!hashMap0.containsKey(s2)) {
                    hashMap0.put(s2, new HashMap());
                }
                Map map0 = (Map)hashMap0.get(s2);
                if(map0 != null) {
                    map0.put(s, s1);
                }
            }
        }
        return hashMap0;
    }

    public static d c() {
        d d0 = new d();  // initializer: Ljava/lang/Object;-><init>()V
        d0.a = new JSONObject();
        d0.b = e.h;
        d0.c = new JSONArray();
        d0.d = new JSONObject();
        d0.e = 0L;
        d0.f = new JSONArray();
        return d0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof e ? this.a.toString().equals(((e)object0).a.toString()) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return this.a.toString();
    }
}

