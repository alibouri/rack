package Z4;

import Ab.k;
import Bb.F;
import E7.n;
import M4.l;
import M4.t;
import N4.m;
import Nb.j;
import R4.g;
import a5.w;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import io.sentry.hints.i;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {
    public static final a a;
    public static Object b;
    public static Object c;
    public static Object d;
    public static JSONObject e;
    public static boolean f;

    static {
        a.a = new a();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public static final boolean a(String s, String s1) {
        Class class0 = b.class;
        Object object0 = null;
        if(!f5.a.b(class0)) {
            try {
                LinkedHashMap linkedHashMap0 = b.b;
                if(linkedHashMap0.containsKey(s)) {
                    object0 = (String)linkedHashMap0.get(s);
                }
            }
            catch(Throwable throwable0) {
                f5.a.a(throwable0, class0);
            }
        }
        if(object0 == null) {
            return false;
        }
        if(!object0.equals("other")) {
            w.g0(new n(object0, 22, s1));
        }
        return true;
    }

    public static void b(View view0, View view1, String s) {
        Object object0;
        Field field1;
        Field field0;
        j.f(view0, "hostView");
        int v = view0.hashCode();
        Class class0 = f.class;
        HashSet hashSet0 = null;
        if(!(f5.a.b(class0) ? null : f.c0).contains(v)) {
            f f0 = new f(view0, view1, s);
            Class class1 = g.class;
            if(!f5.a.b(class1)) {
                try {
                    try {
                        field0 = View.class.getDeclaredField("mListenerInfo");
                    }
                    catch(ClassNotFoundException | NoSuchFieldException unused_ex) {
                        field0 = null;
                        goto label_14;
                    }
                    try {
                        field1 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                        goto label_15;
                    }
                    catch(ClassNotFoundException | NoSuchFieldException unused_ex) {
                    }
                label_14:
                    field1 = null;
                label_15:
                    if(field0 == null || field1 == null) {
                        view0.setOnClickListener(f0);
                    }
                    else {
                        field0.setAccessible(true);
                        field1.setAccessible(true);
                        try {
                            field0.setAccessible(true);
                            object0 = null;
                            object0 = field0.get(view0);
                        }
                        catch(IllegalAccessException unused_ex) {
                        }
                        if(object0 == null) {
                            view0.setOnClickListener(f0);
                        }
                        else {
                            field1.set(object0, f0);
                        }
                    }
                    goto label_30;
                }
                catch(Exception throwable0) {
                }
                catch(Throwable unused_ex) {
                    goto label_30;
                }
                f5.a.a(throwable0, class1);
            }
        label_30:
            if(!f5.a.b(class0)) {
                hashSet0 = f.c0;
            }
            hashSet0.add(v);
        }
    }

    public static final float[] c(String s, JSONObject jSONObject0) {
        Class class0 = a.class;
        if(f5.a.b(class0)) {
            return null;
        }
        try {
            if(!a.f) {
                return null;
            }
            float[] arr_f = new float[30];
            for(int v = 0; v < 30; ++v) {
                arr_f[v] = 0.0f;
            }
            try {
                String s1 = s.toLowerCase();
                j.e(s1, "(this as java.lang.String).toLowerCase()");
                JSONObject jSONObject1 = new JSONObject(jSONObject0.optJSONObject("view").toString());
                String s2 = jSONObject0.optString("screenname");
                JSONArray jSONArray0 = new JSONArray();
                a a0 = a.a;
                a0.k(jSONObject1, jSONArray0);
                a0.n(arr_f, a0.i(jSONObject1));
                JSONObject jSONObject2 = a0.d(jSONObject1);
                if(jSONObject2 == null) {
                    return null;
                }
                j.e(s2, "screenName");
                String s3 = jSONObject1.toString();
                j.e(s3, "viewTree.toString()");
                a0.n(arr_f, a0.h(jSONObject2, jSONArray0, s2, s3, s1));
            }
            catch(JSONException unused_ex) {
            }
            return arr_f;
        }
        catch(Throwable throwable0) {
            f5.a.a(throwable0, class0);
            return null;
        }
    }

    public JSONObject d(JSONObject jSONObject0) {
        if(f5.a.b(this)) {
            return null;
        }
        try {
            if(jSONObject0.optBoolean("is_interacted")) {
                return jSONObject0;
            }
            JSONArray jSONArray0 = jSONObject0.optJSONArray("childviews");
            if(jSONArray0 == null) {
                return null;
            }
            int v = jSONArray0.length();
            if(v > 0) {
                for(int v1 = 0; true; ++v1) {
                    JSONObject jSONObject1 = jSONArray0.getJSONObject(v1);
                    j.e(jSONObject1, "children.getJSONObject(i)");
                    JSONObject jSONObject2 = this.d(jSONObject1);
                    if(jSONObject2 != null) {
                        return jSONObject2;
                    }
                    if(v1 + 1 >= v) {
                        break;
                    }
                }
            }
        }
        catch(JSONException throwable0) {
            f5.a.a(throwable0, this);
        }
        catch(Throwable unused_ex) {
        }
        return null;
    }

    public static final String e(String s, String s1, String s2) {
        Class class0 = a.class;
        if(f5.a.b(class0)) {
            return null;
        }
        try {
            j.f(s, "buttonText");
            j.f(s1, "activityName");
            String s3 = s2 + " | " + s1 + ", " + s;
            if(s3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String s4 = s3.toLowerCase();
            j.e(s4, "(this as java.lang.String).toLowerCase()");
            return s4;
        }
        catch(Throwable throwable0) {
        }
        f5.a.a(throwable0, class0);
        return null;
    }

    public static final void f(File file0) {
        Class class0 = a.class;
        if(f5.a.b(class0)) {
            return;
        }
        try {
            try {
                a.e = new JSONObject();
                FileInputStream fileInputStream0 = new FileInputStream(file0);
                byte[] arr_b = new byte[fileInputStream0.available()];
                fileInputStream0.read(arr_b);
                fileInputStream0.close();
                a.e = new JSONObject(new String(arr_b, Vb.a.a));
            }
            catch(Exception unused_ex) {
                return;
            }
            a.b = F.K(new k[]{new k("ENGLISH", "1"), new k("GERMAN", "2"), new k("SPANISH", "3"), new k("JAPANESE", "4")});
            a.c = F.K(new k[]{new k("VIEW_CONTENT", "0"), new k("SEARCH", "1"), new k("ADD_TO_CART", "2"), new k("ADD_TO_WISHLIST", "3"), new k("INITIATE_CHECKOUT", "4"), new k("ADD_PAYMENT_INFO", "5"), new k("PURCHASE", "6"), new k("LEAD", "7"), new k("COMPLETE_REGISTRATION", "8")});
            a.d = F.K(new k[]{new k("BUTTON_TEXT", "1"), new k("PAGE_TITLE", "2"), new k("RESOLVED_DOCUMENT_LINK", "3"), new k("BUTTON_ID", "4")});
            a.f = true;
        }
        catch(Throwable throwable0) {
            f5.a.a(throwable0, class0);
        }
    }

    public boolean g(String[] arr_s, String[] arr_s1) {
        int v1;
        if(f5.a.b(this)) {
            return false;
        }
        try {
            int v = 0;
            do {
                if(v >= arr_s.length) {
                    return false;
                }
                String s = arr_s[v];
                ++v;
                v1 = 0;
            label_8:
            }
            while(v1 >= arr_s1.length);
            String s1 = arr_s1[v1];
            ++v1;
            if(!Vb.j.R(s1, s, false)) {
                goto label_8;
            }
            return true;
        }
        catch(Throwable throwable0) {
            f5.a.a(throwable0, this);
            return false;
        }
    }

    public float[] h(JSONObject jSONObject0, JSONArray jSONArray0, String s, String s1, String s2) {
        int v3;
        float[] arr_f;
        if(f5.a.b(this)) {
            return null;
        }
        try {
            arr_f = new float[30];
            for(int v = 0; v < 30; ++v) {
                arr_f[v] = 0.0f;
            }
            int v1 = jSONArray0.length();
            arr_f[3] = v1 <= 1 ? 0.0f : ((float)v1) - 1.0f;
            try {
                int v2 = jSONArray0.length();
                if(v2 > 0) {
                    v3 = 0;
                    while(true) {
                    label_13:
                        JSONObject jSONObject1 = jSONArray0.getJSONObject(v3);
                        j.e(jSONObject1, "siblings.getJSONObject(i)");
                        if(!f5.a.b(this)) {
                            goto label_16;
                        }
                        goto label_22;
                    }
                }
            }
            catch(JSONException unused_ex) {
            }
            goto label_25;
        }
        catch(Throwable throwable0) {
            f5.a.a(throwable0, this);
            return null;
        }
        try {
        label_16:
            if((jSONObject1.optInt("classtypebitmask") & 1) << 5 > 0) {
                goto label_21;
            }
            goto label_22;
        }
        catch(Throwable throwable1) {
            try {
                f5.a.a(throwable1, this);
                goto label_22;
            label_21:
                ++arr_f[9];
            label_22:
                if(v3 + 1 >= v2) {
                    goto label_25;
                }
                try {
                    try {
                        ++v3;
                        goto label_13;
                    }
                    catch(JSONException unused_ex) {
                    label_25:
                        arr_f[13] = -1.0f;
                        arr_f[14] = -1.0f;
                        String s3 = s + '|' + s2;
                        StringBuilder stringBuilder0 = new StringBuilder();
                        StringBuilder stringBuilder1 = new StringBuilder();
                        this.o(jSONObject0, stringBuilder1, stringBuilder0);
                        String s4 = stringBuilder0.toString();
                        j.e(s4, "hintSB.toString()");
                        String s5 = stringBuilder1.toString();
                        j.e(s5, "textSB.toString()");
                        arr_f[15] = this.m("COMPLETE_REGISTRATION", "BUTTON_TEXT", s5) ? 1.0f : 0.0f;
                        arr_f[16] = this.m("COMPLETE_REGISTRATION", "PAGE_TITLE", s3) ? 1.0f : 0.0f;
                        arr_f[17] = this.m("COMPLETE_REGISTRATION", "BUTTON_ID", s4) ? 1.0f : 0.0f;
                        arr_f[18] = Vb.j.R(s1, "password", false) ? 1.0f : 0.0f;
                        arr_f[19] = this.l("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", s1) ? 1.0f : 0.0f;
                        arr_f[20] = this.l("(?i)(sign in)|login|signIn", s1) ? 1.0f : 0.0f;
                        arr_f[21] = this.l("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", s1) ? 1.0f : 0.0f;
                        arr_f[22] = this.m("PURCHASE", "BUTTON_TEXT", s5) ? 1.0f : 0.0f;
                        arr_f[24] = this.m("PURCHASE", "PAGE_TITLE", s3) ? 1.0f : 0.0f;
                        arr_f[25] = this.l("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", s5) ? 1.0f : 0.0f;
                        arr_f[27] = this.l("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", s3) ? 1.0f : 0.0f;
                        arr_f[28] = this.m("LEAD", "BUTTON_TEXT", s5) ? 1.0f : 0.0f;
                        arr_f[29] = this.m("LEAD", "PAGE_TITLE", s3) ? 1.0f : 0.0f;
                        return arr_f;
                    }
                }
                catch(Throwable throwable0) {
                }
            }
            catch(JSONException unused_ex) {
                goto label_25;
            }
            catch(Throwable throwable0) {
            }
        }
        f5.a.a(throwable0, this);
        return null;
    }

    public float[] i(JSONObject jSONObject0) {
        if(f5.a.b(this)) {
            return null;
        }
        try {
            float[] arr_f = new float[30];
            for(int v1 = 0; v1 < 30; ++v1) {
                arr_f[v1] = 0.0f;
            }
            String s = jSONObject0.optString("text");
            j.e(s, "node.optString(TEXT_KEY)");
            String s1 = s.toLowerCase();
            j.e(s1, "(this as java.lang.String).toLowerCase()");
            String s2 = jSONObject0.optString("hint");
            j.e(s2, "node.optString(HINT_KEY)");
            String s3 = s2.toLowerCase();
            j.e(s3, "(this as java.lang.String).toLowerCase()");
            String s4 = jSONObject0.optString("classname");
            j.e(s4, "node.optString(CLASS_NAME_KEY)");
            String s5 = s4.toLowerCase();
            j.e(s5, "(this as java.lang.String).toLowerCase()");
            int v2 = jSONObject0.optInt("inputtype", -1);
            String[] arr_s = {s1, s3};
            if(this.g(new String[]{"$", "amount", "price", "total"}, arr_s)) {
                ++arr_f[0];
            }
            if(this.g(new String[]{"password", "pwd"}, arr_s)) {
                ++arr_f[1];
            }
            if(this.g(new String[]{"tel", "phone"}, arr_s)) {
                ++arr_f[2];
            }
            if(this.g(new String[]{"search"}, arr_s)) {
                ++arr_f[4];
            }
            if(v2 >= 0) {
                ++arr_f[5];
            }
            if(v2 == 2 || v2 == 3) {
                ++arr_f[6];
            }
            if(v2 == 0x20 || Patterns.EMAIL_ADDRESS.matcher(s1).matches()) {
                ++arr_f[7];
            }
            if(Vb.j.R(s5, "checkbox", false)) {
                ++arr_f[8];
            }
            if(this.g(new String[]{"complete", "confirm", "done", "submit"}, new String[]{s1})) {
                ++arr_f[10];
            }
            if(Vb.j.R(s5, "radio", false) && Vb.j.R(s5, "button", false)) {
                ++arr_f[12];
            }
            try {
                JSONArray jSONArray0 = jSONObject0.optJSONArray("childviews");
                int v3 = jSONArray0.length();
                if(v3 > 0) {
                    for(int v = 0; true; ++v) {
                        JSONObject jSONObject1 = jSONArray0.getJSONObject(v);
                        j.e(jSONObject1, "childViews.getJSONObject(i)");
                        this.n(arr_f, this.i(jSONObject1));
                        if(v + 1 >= v3) {
                            break;
                        }
                    }
                }
            }
            catch(JSONException unused_ex) {
            }
            return arr_f;
        }
        catch(Throwable throwable0) {
        }
        f5.a.a(throwable0, this);
        return null;
    }

    public static void j(String s, String s1, float[] arr_f) {
        boolean z1;
        boolean z;
        Class class0 = d.class;
        if(f5.a.b(class0)) {
            z = false;
        }
        else {
            try {
                j.f(s, "event");
                z = d.c.contains(s);
            }
            catch(Throwable throwable0) {
                f5.a.a(throwable0, class0);
                z = false;
            }
        }
        if(z) {
            m m0 = new m(l.a(), null);
            if(!f5.a.b(m0)) {
                try {
                    Bundle bundle0 = new Bundle();
                    bundle0.putString("_is_suggested_event", "1");
                    bundle0.putString("_button_text", s1);
                    m0.e(s, bundle0);
                }
                catch(Throwable throwable1) {
                    f5.a.a(throwable1, m0);
                }
            }
        }
        else {
            if(f5.a.b(class0)) {
                z1 = false;
            }
            else {
                try {
                    j.f(s, "event");
                    z1 = d.d.contains(s);
                }
                catch(Throwable throwable2) {
                    f5.a.a(throwable2, class0);
                    z1 = false;
                }
            }
            if(z1) {
                Bundle bundle1 = new Bundle();
                try {
                    bundle1.putString("event_name", s);
                    JSONObject jSONObject0 = new JSONObject();
                    StringBuilder stringBuilder0 = new StringBuilder();
                    int v = 0;
                    while(v < arr_f.length) {
                        float f = arr_f[v];
                        ++v;
                        stringBuilder0.append(f);
                        stringBuilder0.append(",");
                    }
                    jSONObject0.put("dense", stringBuilder0.toString());
                    jSONObject0.put("button_text", s1);
                    bundle1.putString("metadata", jSONObject0.toString());
                    t t0 = i.G(null, String.format(Locale.US, "%s/suggested_events", Arrays.copyOf(new Object[]{l.b()}, 1)), null, null);
                    t0.d = bundle1;
                    t0.c();
                }
                catch(JSONException unused_ex) {
                }
            }
        }
    }

    public boolean k(JSONObject jSONObject0, JSONArray jSONArray0) {
        boolean z;
        if(f5.a.b(this)) {
            return false;
        }
        try {
            if(jSONObject0.optBoolean("is_interacted")) {
                return true;
            }
            JSONArray jSONArray1 = jSONObject0.optJSONArray("childviews");
            int v = jSONArray1.length();
            if(v > 0) {
                z = true;
                int v1 = 0;
                while(true) {
                    if(jSONArray1.getJSONObject(v1).optBoolean("is_interacted")) {
                        goto label_14;
                    }
                    if(v1 + 1 >= v) {
                        break;
                    }
                    ++v1;
                }
            }
            z = false;
        label_14:
            boolean z1 = z;
            JSONArray jSONArray2 = new JSONArray();
            if(!z) {
                int v2 = jSONArray1.length();
                if(v2 > 0) {
                    for(int v3 = 0; true; ++v3) {
                        JSONObject jSONObject1 = jSONArray1.getJSONObject(v3);
                        j.e(jSONObject1, "child");
                        if(this.k(jSONObject1, jSONArray0)) {
                            jSONArray2.put(jSONObject1);
                            z1 = true;
                        }
                        if(v3 + 1 >= v2) {
                            break;
                        }
                    }
                }
                jSONObject0.put("childviews", jSONArray2);
                return z1;
            }
            int v4 = jSONArray1.length();
            if(v4 > 0) {
                for(int v5 = 0; true; ++v5) {
                    jSONArray0.put(jSONArray1.getJSONObject(v5));
                    if(v5 + 1 >= v4) {
                        break;
                    }
                }
            }
            return z1;
        }
        catch(JSONException unused_ex) {
            return false;
        }
        catch(Throwable throwable0) {
        }
        f5.a.a(throwable0, this);
        return false;
    }

    public boolean l(String s, String s1) {
        if(f5.a.b(this)) {
            return false;
        }
        try {
            return Pattern.compile(s).matcher(s1).find();
        }
        catch(Throwable throwable0) {
            f5.a.a(throwable0, this);
            return false;
        }
    }

    public boolean m(String s, String s1, String s2) {
        JSONObject jSONObject4;
        JSONObject jSONObject2;
        if(f5.a.b(this)) {
            return false;
        }
        try {
            JSONObject jSONObject0 = a.e;
            String s3 = null;
            if(jSONObject0 != null) {
                JSONObject jSONObject1 = jSONObject0.optJSONObject("rulesForLanguage");
                if(jSONObject1 == null) {
                    jSONObject2 = null;
                    goto label_12;
                }
                Object object0 = a.b;
                if(object0 != null) {
                    jSONObject2 = jSONObject1.optJSONObject(((String)((Map)object0).get("ENGLISH")));
                label_12:
                    if(jSONObject2 == null) {
                        jSONObject4 = null;
                    }
                    else {
                        JSONObject jSONObject3 = jSONObject2.optJSONObject("rulesForEvent");
                        if(jSONObject3 == null) {
                            jSONObject4 = null;
                        }
                        else {
                            Object object1 = a.c;
                            if(object1 != null) {
                                jSONObject4 = jSONObject3.optJSONObject(((String)((Map)object1).get(s)));
                                goto label_24;
                            }
                            j.p("eventInfo");
                            throw null;
                        }
                    }
                label_24:
                    if(jSONObject4 != null) {
                        JSONObject jSONObject5 = jSONObject4.optJSONObject("positiveRules");
                        if(jSONObject5 != null) {
                            Object object2 = a.d;
                            if(object2 != null) {
                                s3 = jSONObject5.optString(((String)((Map)object2).get(s1)));
                                return s3 == null ? false : this.l(s3, s2);
                            }
                            j.p("textTypeInfo");
                            throw null;
                        }
                    }
                    return s3 == null ? false : this.l(s3, s2);
                }
                j.p("languageInfo");
                throw null;
            }
            j.p("rules");
            throw null;
        }
        catch(Throwable throwable0) {
        }
        f5.a.a(throwable0, this);
        return false;
    }

    public void n(float[] arr_f, float[] arr_f1) {
        if(f5.a.b(this)) {
            return;
        }
        try {
            int v = arr_f.length - 1;
            if(v >= 0) {
                for(int v1 = 0; true; ++v1) {
                    arr_f[v1] += arr_f1[v1];
                    if(v1 + 1 > v) {
                        break;
                    }
                }
            }
        }
        catch(Throwable throwable0) {
            f5.a.a(throwable0, this);
        }
    }

    public void o(JSONObject jSONObject0, StringBuilder stringBuilder0, StringBuilder stringBuilder1) {
        int v1;
        if(f5.a.b(this)) {
            return;
        }
        try {
            String s = jSONObject0.optString("text", "");
            j.e(s, "view.optString(TEXT_KEY, \"\")");
            String s1 = s.toLowerCase();
            j.e(s1, "(this as java.lang.String).toLowerCase()");
            String s2 = jSONObject0.optString("hint", "");
            j.e(s2, "view.optString(HINT_KEY, \"\")");
            String s3 = s2.toLowerCase();
            j.e(s3, "(this as java.lang.String).toLowerCase()");
            if(s1.length() > 0) {
                stringBuilder0.append(s1);
                stringBuilder0.append(" ");
            }
            if(s3.length() > 0) {
                stringBuilder1.append(s3);
                stringBuilder1.append(" ");
            }
            JSONArray jSONArray0 = jSONObject0.optJSONArray("childviews");
            if(jSONArray0 == null) {
                return;
            }
            int v = jSONArray0.length();
            if(v > 0) {
                v1 = 0;
                while(true) {
                    try {
                    label_22:
                        JSONObject jSONObject1 = jSONArray0.getJSONObject(v1);
                        j.e(jSONObject1, "currentChildView");
                        this.o(jSONObject1, stringBuilder0, stringBuilder1);
                    }
                    catch(JSONException unused_ex) {
                    }
                    goto label_29;
                }
            }
            return;
        }
        catch(Throwable throwable0) {
        }
        f5.a.a(throwable0, this);
        return;
    label_29:
        if(v1 + 1 < v) {
            ++v1;
            goto label_22;
        }
    }
}

