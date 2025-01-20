package M4;

import P4.c;
import Vb.j;
import android.content.SharedPreferences;
import com.facebook.FacebookRequestError;
import f5.a;
import io.sentry.hints.i;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class q implements p {
    public final int a;

    public q(int v) {
        this.a = v;
        super();
    }

    @Override  // M4.p
    public final void a(w w0) {
        String s5;
        String s4;
        String s3;
        HashMap hashMap0;
        Object object0;
        y y0 = y.b0;
        boolean z = false;
        switch(this.a) {
            case 0: {
                break;
            }
            case 1: {
                Map map0 = null;
                FacebookRequestError facebookRequestError0 = w0.c;
                if(facebookRequestError0 == null) {
                    goto label_31;
                }
                i.D(y0, "P4.c", " \n\nGraph Response Error: \n================\nResponse Error: %s\nResponse Error Exception: %s\n\n ", new Object[]{facebookRequestError0.toString(), String.valueOf(facebookRequestError0.g0)});
                Class class0 = c.class;
                if(!a.b(class0)) {
                    try {
                        SharedPreferences sharedPreferences0 = l.a().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
                        if(sharedPreferences0 != null) {
                            String s = sharedPreferences0.getString("dataset_id", null);
                            String s1 = sharedPreferences0.getString("endpoint", null);
                            String s2 = sharedPreferences0.getString("access_key", null);
                            if(s != null && !j.c0(s) && s1 != null && !j.c0(s1) && s2 != null && !j.c0(s2)) {
                                LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                                linkedHashMap0.put("endpoint", s1);
                                linkedHashMap0.put("dataset_id", s);
                                linkedHashMap0.put("access_key", s2);
                                i.D(y0, "P4.c".toString(), " \n\nLoading Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", new Object[]{s, s1, s2});
                                map0 = linkedHashMap0;
                            }
                        }
                    }
                    catch(Throwable throwable0) {
                        a.a(throwable0, class0);
                    }
                }
                if(map0 != null) {
                    URL uRL0 = new URL(String.valueOf(map0.get("endpoint")));
                    P4.j.a(String.valueOf(map0.get("dataset_id")), uRL0.getProtocol() + "://" + uRL0.getHost(), String.valueOf(map0.get("access_key")));
                    c.a = true;
                    return;
                label_31:
                    i.D(y0, "P4.c", " \n\nGraph Response Received: \n================\n%s\n\n ", new Object[]{w0});
                    JSONObject jSONObject0 = w0.b;
                    if(jSONObject0 == null) {
                        object0 = null;
                    }
                    else {
                        try {
                            object0 = jSONObject0.get("data");
                        label_37:
                            if(object0 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
                            }
                            hashMap0 = a5.w.u(new JSONObject(((String)Bb.p.q0(a5.w.t(((JSONArray)object0))))));
                            s3 = (String)hashMap0.get("endpoint");
                            s4 = (String)hashMap0.get("dataset_id");
                            s5 = (String)hashMap0.get("access_key");
                            goto label_50;
                        }
                        catch(JSONException jSONException0) {
                            i.D(y0, "P4.c", "CloudBridge Settings API response is not a valid json: \n%s ", new Object[]{U5.a.U(jSONException0)});
                            break;
                        }
                        catch(NullPointerException nullPointerException0) {
                            i.D(y0, "P4.c", "CloudBridge Settings API response is not a valid json: \n%s ", new Object[]{U5.a.U(nullPointerException0)});
                            return;
                        }
                    }
                    goto label_37;
                }
                break;
            }
            default: {
                i.C(y0, Q4.l.a(), "App index sent to FB!");
                return;
            }
        }
        return;
    label_50:
        if(s3 != null && s4 != null && s5 != null) {
            try {
                P4.j.a(s4, s3, s5);
                c.U(hashMap0);
            }
            catch(MalformedURLException malformedURLException0) {
                i.D(y0, "P4.c", "CloudBridge Settings API response doesn\'t have valid url\n %s ", new Object[]{U5.a.U(malformedURLException0)});
                return;
            }
            if(hashMap0.get("is_enabled") != null) {
                Object object1 = hashMap0.get("is_enabled");
                if(object1 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
                z = ((Boolean)object1).booleanValue();
            }
            c.a = z;
            return;
        }
        i.C(y0, "P4.c", "CloudBridge Settings API response doesn\'t have valid data");
    }

    private final void b(w w0) {
    }
}

