package g5;

import Nb.j;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {
    public String a;
    public String b;
    public Long c;

    public a(String s) {
        Long long0 = (long)(System.currentTimeMillis() / 1000L);
        this.c = long0;
        this.b = s;
        String s1 = "error_log_" + ((long)long0) + ".json";
        j.e(s1, "StringBuffer()\n            .append(InstrumentUtility.ERROR_REPORT_PREFIX)\n            .append(timestamp as Long)\n            .append(\".json\")\n            .toString()");
        this.a = s1;
    }

    @Override
    public final String toString() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            Long long0 = this.c;
            if(long0 != null) {
                jSONObject0.put("timestamp", long0);
            }
            jSONObject0.put("error_message", this.b);
        }
        catch(JSONException unused_ex) {
            jSONObject0 = null;
        }
        if(jSONObject0 == null) {
            return super.toString();
        }
        String s = jSONObject0.toString();
        j.e(s, "params.toString()");
        return s;
    }
}

