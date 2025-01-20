package R4;

import Nb.j;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final String d;

    public d(JSONObject jSONObject0) {
        String s = jSONObject0.getString("name");
        j.e(s, "component.getString(PARAMETER_NAME_KEY)");
        this.a = s;
        String s1 = jSONObject0.optString("value");
        j.e(s1, "component.optString(PARAMETER_VALUE_KEY)");
        this.b = s1;
        String s2 = jSONObject0.optString("path_type", "absolute");
        j.e(s2, "component.optString(Constants.EVENT_MAPPING_PATH_TYPE_KEY, Constants.PATH_TYPE_ABSOLUTE)");
        this.d = s2;
        ArrayList arrayList0 = new ArrayList();
        JSONArray jSONArray0 = jSONObject0.optJSONArray("path");
        if(jSONArray0 != null) {
            int v = jSONArray0.length();
            if(v > 0) {
                for(int v1 = 0; true; ++v1) {
                    JSONObject jSONObject1 = jSONArray0.getJSONObject(v1);
                    j.e(jSONObject1, "jsonPathArray.getJSONObject(i)");
                    arrayList0.add(new e(jSONObject1));
                    if(v1 + 1 >= v) {
                        break;
                    }
                }
            }
        }
        this.c = arrayList0;
    }
}

