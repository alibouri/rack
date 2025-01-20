package M4;

import Nb.j;
import com.apollographql.apollo.api.b;
import com.facebook.FacebookRequestError;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

public final class w {
    public final HttpURLConnection a;
    public final JSONObject b;
    public final FacebookRequestError c;
    public final JSONObject d;
    public static final int e;

    public w(t t0, HttpURLConnection httpURLConnection0, FacebookRequestError facebookRequestError0) {
        j.f(t0, "request");
        this(t0, httpURLConnection0, null, null, facebookRequestError0);
    }

    public w(t t0, HttpURLConnection httpURLConnection0, String s, JSONObject jSONObject0) {
        j.f(t0, "request");
        j.f(s, "rawResponse");
        this(t0, httpURLConnection0, jSONObject0, null, null);
    }

    public w(t t0, HttpURLConnection httpURLConnection0, JSONObject jSONObject0, JSONArray jSONArray0, FacebookRequestError facebookRequestError0) {
        j.f(t0, "request");
        super();
        this.a = httpURLConnection0;
        this.b = jSONObject0;
        this.c = facebookRequestError0;
        this.d = jSONObject0;
    }

    @Override
    public final String toString() {
        String s = "unknown";
        try {
            s = String.format(Locale.US, "%d", Arrays.copyOf(new Object[]{((int)(this.a == null ? 200 : this.a.getResponseCode()))}, 1));
        }
        catch(IOException unused_ex) {
        }
        StringBuilder stringBuilder0 = b.s("{Response:  responseCode: ", s, ", graphObject: ");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", error: ");
        stringBuilder0.append(this.c);
        stringBuilder0.append("}");
        String s1 = stringBuilder0.toString();
        j.e(s1, "StringBuilder()\n        .append(\"{Response: \")\n        .append(\" responseCode: \")\n        .append(responseCode)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", error: \")\n        .append(error)\n        .append(\"}\")\n        .toString()");
        return s1;
    }
}

