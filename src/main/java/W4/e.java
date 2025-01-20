package W4;

import Bb.q;
import Bb.r;
import I2.J;
import M4.l;
import M4.t;
import Nb.j;
import a5.h;
import android.os.Bundle;
import android.text.TextUtils;
import f5.a;
import io.sentry.hints.i;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class e {
    public static final e a;
    public static final ConcurrentHashMap b;
    public static final List c;
    public static final List d;

    static {
        e.a = new e();  // initializer: Ljava/lang/Object;-><init>()V
        e.b = new ConcurrentHashMap();
        e.c = q.L(new String[]{"other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout"});
        e.d = q.L(new String[]{"none", "address", "health"});
    }

    public final void a(JSONObject jSONObject0) {
        if(a.b(this)) {
            return;
        }
        try {
            Iterator iterator0 = jSONObject0.keys();
            try {
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    d d0 = android.support.v4.media.session.a.s(jSONObject0.getJSONObject(((String)object0)));
                    if(d0 != null) {
                        e.b.put(d0.a, d0);
                    }
                }
            }
            catch(JSONException unused_ex) {
            }
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
        }
    }

    public final void b() {
        Locale locale0;
        d d0;
        int v;
        String s;
        ArrayList arrayList0;
        if(a.b(this)) {
            return;
        }
        try {
            arrayList0 = new ArrayList();
            Iterator iterator0 = e.b.entrySet().iterator();
            s = null;
            v = 0;
            while(true) {
            label_6:
                if(!iterator0.hasNext()) {
                    if(s != null && v > 0 && !arrayList0.isEmpty()) {
                        android.support.v4.media.session.a.A(new d("MTML", s, null, v, null), arrayList0);
                    }
                    return;
                }
                Object object0 = iterator0.next();
                String s1 = (String)((Map.Entry)object0).getKey();
                d0 = (d)((Map.Entry)object0).getValue();
                if(j.a(s1, c.Y.b())) {
                    s = d0.b;
                    v = Math.max(v, d0.d);
                    if(a5.j.b(h.h0) && !a.b(this)) {
                        break;
                    }
                }
                goto label_29;
            }
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
            return;
        }
        try {
            locale0 = null;
            locale0 = l.a().getResources().getConfiguration().locale;
            goto label_19;
        }
        catch(Exception unused_ex) {
        label_19:
            if(locale0 == null) {
                goto label_27;
            }
            else {
                try {
                    String s2 = locale0.getLanguage();
                    j.e(s2, "locale.language");
                    if(Vb.j.R(s2, "en", false)) {
                        goto label_27;
                    }
                }
                catch(Throwable throwable1) {
                    goto label_25;
                }
            }
            goto label_29;
        }
        catch(Throwable throwable1) {
            try {
            label_25:
                a.a(throwable1, this);
                goto label_29;
            label_27:
                d0.h = new N4.c(12);
                arrayList0.add(d0);
            label_29:
                if(!j.a(s1, c.X.b())) {
                    goto label_6;
                }
                s = d0.b;
                v = Math.max(v, d0.d);
                if(!a5.j.b(h.i0)) {
                    goto label_6;
                }
                d0.h = new N4.c(13);
                arrayList0.add(d0);
                goto label_6;
            }
            catch(Throwable throwable0) {
            }
        }
        a.a(throwable0, this);
    }

    public final JSONObject c() {
        if(a.b(this)) {
            return null;
        }
        try {
            Bundle bundle0 = new Bundle();
            bundle0.putString("fields", TextUtils.join(",", new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
            t t0 = i.F(null, "app/model_asset", null);
            t0.d = bundle0;
            JSONObject jSONObject0 = t0.c().b;
            return jSONObject0 == null ? null : this.e(jSONObject0);
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
            return null;
        }
    }

    public static final File d() {
        c c0 = c.Y;
        Class class0 = e.class;
        if(a.b(class0)) {
            return null;
        }
        try {
            String s = c0.b();
            d d0 = (d)e.b.get(s);
            return d0 == null ? null : d0.f;
        }
        catch(Throwable throwable0) {
            a.a(throwable0, class0);
            return null;
        }
    }

    public final JSONObject e(JSONObject jSONObject0) {
        if(a.b(this)) {
            return null;
        }
        try {
            JSONObject jSONObject1 = new JSONObject();
            try {
                JSONArray jSONArray0 = jSONObject0.getJSONArray("data");
                int v = jSONArray0.length();
                if(v > 0) {
                    for(int v1 = 0; true; ++v1) {
                        JSONObject jSONObject2 = jSONArray0.getJSONObject(v1);
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("version_id", jSONObject2.getString("version_id"));
                        jSONObject3.put("use_case", jSONObject2.getString("use_case"));
                        jSONObject3.put("thresholds", jSONObject2.getJSONArray("thresholds"));
                        jSONObject3.put("asset_uri", jSONObject2.getString("asset_uri"));
                        if(jSONObject2.has("rules_uri")) {
                            jSONObject3.put("rules_uri", jSONObject2.getString("rules_uri"));
                        }
                        jSONObject1.put(jSONObject2.getString("use_case"), jSONObject3);
                        if(v1 + 1 >= v) {
                            break;
                        }
                    }
                }
                return jSONObject1;
            }
            catch(JSONException unused_ex) {
                return new JSONObject();
            }
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, this);
        return null;
    }

    public static final String[] f(c c0, float[][] arr2_f, String[] arr_s) {
        Class class0 = e.class;
        if(a.b(class0)) {
            return null;
        }
        try {
            String s = c0.b();
            d d0 = (d)e.b.get(s);
            b b0 = d0 == null ? null : d0.g;
            if(b0 == null) {
                return null;
            }
            float[] arr_f = d0.e;
            int v = arr2_f[0].length;
            W4.a a0 = new W4.a(new int[]{arr_s.length, v});
            if(arr_s.length > 0) {
                for(int v1 = 0; true; ++v1) {
                    System.arraycopy(arr2_f[v1], 0, a0.c, v1 * v, v);
                    if(v1 + 1 >= arr_s.length) {
                        break;
                    }
                }
            }
            W4.a a1 = b0.a(a0, arr_s, c0.a());
            if(a1 != null && arr_f != null && a1.c.length != 0 && arr_f.length != 0) {
                e e0 = e.a;
                switch(c0.ordinal()) {
                    case 0: {
                        return e0.g(a1, arr_f);
                    }
                    case 1: {
                        return e0.h(a1, arr_f);
                    }
                    default: {
                        throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                    }
                }
            }
            return null;
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, class0);
        return null;
    }

    public final String[] g(W4.a a0, float[] arr_f) {
        if(a.b(this)) {
            return null;
        }
        try {
            int[] arr_v = a0.a;
            int v = arr_v[0];
            int v1 = arr_v[1];
            float[] arr_f1 = a0.c;
            if(v1 != arr_f.length) {
                return null;
            }
            Sb.d d0 = J.R(0, v);
            ArrayList arrayList0 = new ArrayList(r.b0(d0));
            Sb.c c0 = d0.a();
            while(c0.Z) {
                int v2 = c0.a();
                Object object0 = "none";
                int v3 = 0;
                for(int v4 = 0; v3 < arr_f.length; ++v4) {
                    if(arr_f1[v2 * v1 + v4] >= arr_f[v3]) {
                        object0 = e.d.get(v4);
                    }
                    ++v3;
                }
                arrayList0.add(((String)object0));
            }
            Object[] arr_object = arrayList0.toArray(new String[0]);
            if(arr_object == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            return (String[])arr_object;
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, this);
        return null;
    }

    public final String[] h(W4.a a0, float[] arr_f) {
        if(a.b(this)) {
            return null;
        }
        try {
            int[] arr_v = a0.a;
            int v = arr_v[0];
            int v1 = arr_v[1];
            float[] arr_f1 = a0.c;
            if(v1 != arr_f.length) {
                return null;
            }
            Sb.d d0 = J.R(0, v);
            ArrayList arrayList0 = new ArrayList(r.b0(d0));
            Sb.c c0 = d0.a();
            while(c0.Z) {
                int v2 = c0.a();
                Object object0 = "other";
                int v3 = 0;
                for(int v4 = 0; v3 < arr_f.length; ++v4) {
                    if(arr_f1[v2 * v1 + v4] >= arr_f[v3]) {
                        object0 = e.c.get(v4);
                    }
                    ++v3;
                }
                arrayList0.add(((String)object0));
            }
            Object[] arr_object = arrayList0.toArray(new String[0]);
            if(arr_object == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            return (String[])arr_object;
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, this);
        return null;
    }
}

