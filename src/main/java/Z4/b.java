package Z4;

import Bb.F;
import M4.l;
import Nb.j;
import R4.g;
import a5.w;
import android.content.SharedPreferences;
import android.view.View;
import f5.a;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {
    public static final b a;
    public static final LinkedHashMap b;
    public static SharedPreferences c;
    public static final AtomicBoolean d;

    static {
        b.a = new b();  // initializer: Ljava/lang/Object;-><init>()V
        b.b = new LinkedHashMap();
        b.d = new AtomicBoolean(false);
    }

    public static final void a(String s, String s1) {
        Class class0 = b.class;
        if(a.b(class0)) {
            return;
        }
        try {
            j.f(s1, "predictedEvent");
            if(!b.d.get()) {
                b.a.c();
            }
            LinkedHashMap linkedHashMap0 = b.b;
            linkedHashMap0.put(s, s1);
            SharedPreferences sharedPreferences0 = b.c;
            if(sharedPreferences0 != null) {
                sharedPreferences0.edit().putString("SUGGESTED_EVENTS_HISTORY", w.V(F.X(linkedHashMap0))).apply();
                return;
            }
            j.p("shardPreferences");
            throw null;
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, class0);
    }

    public static final String b(View view0, String s) {
        Class class0 = b.class;
        if(a.b(class0)) {
            return null;
        }
        try {
            j.f(s, "text");
            JSONObject jSONObject0 = new JSONObject();
            try {
                jSONObject0.put("text", s);
                JSONArray jSONArray0 = new JSONArray();
                while(view0 != null) {
                    jSONArray0.put(view0.getClass().getSimpleName());
                    view0 = g.h(view0);
                }
                jSONObject0.put("classname", jSONArray0);
            }
            catch(JSONException unused_ex) {
            }
            return w.j0(jSONObject0.toString());
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, class0);
        return null;
    }

    public final void c() {
        String s = "";
        if(a.b(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean0 = b.d;
            if(atomicBoolean0.get()) {
                return;
            }
            SharedPreferences sharedPreferences0 = l.a().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
            j.e(sharedPreferences0, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(CLICKED_PATH_STORE, Context.MODE_PRIVATE)");
            b.c = sharedPreferences0;
            LinkedHashMap linkedHashMap0 = b.b;
            String s1 = sharedPreferences0.getString("SUGGESTED_EVENTS_HISTORY", "");
            if(s1 != null) {
                s = s1;
            }
            linkedHashMap0.putAll(w.R(s));
            atomicBoolean0.set(true);
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
        }
    }
}

