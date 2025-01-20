package R4;

import Nb.j;
import org.json.JSONObject;

public final class e {
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;

    public e(JSONObject jSONObject0) {
        String s = jSONObject0.getString("class_name");
        j.e(s, "component.getString(PATH_CLASS_NAME_KEY)");
        this.a = s;
        this.b = jSONObject0.optInt("index", -1);
        this.c = jSONObject0.optInt("id");
        String s1 = jSONObject0.optString("text");
        j.e(s1, "component.optString(PATH_TEXT_KEY)");
        this.d = s1;
        String s2 = jSONObject0.optString("tag");
        j.e(s2, "component.optString(PATH_TAG_KEY)");
        this.e = s2;
        String s3 = jSONObject0.optString("description");
        j.e(s3, "component.optString(PATH_DESCRIPTION_KEY)");
        this.f = s3;
        String s4 = jSONObject0.optString("hint");
        j.e(s4, "component.optString(PATH_HINT_KEY)");
        this.g = s4;
        this.h = jSONObject0.optInt("match_bitmask");
    }
}

