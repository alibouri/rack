package h7;

import N5.r;
import android.util.Log;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {
    public final String a;
    public static final int b;

    public b(String s, long v, long v1) {
        r.f(s);
        this.a = s;
    }

    public static b a(String s) {
        try {
            JSONObject jSONObject0 = new JSONObject(s);
            String s1 = jSONObject0.getString("token");
            long v = jSONObject0.getLong("receivedAt");
            return new b(s1, jSONObject0.getLong("expiresIn"), v);
        }
        catch(JSONException jSONException0) {
            Log.e("h7.b", "Could not deserialize token: " + jSONException0.getMessage());
            return null;
        }
    }

    public static long b(String s, Map map0) {
        r.j(map0);
        r.f(s);
        Integer integer0 = (Integer)map0.get(s);
        return integer0 == null ? 0L : integer0.longValue();
    }
}

