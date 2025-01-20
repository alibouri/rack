package a5;

import Bb.q;
import L7.b;
import M4.l;
import M4.t;
import Nb.j;
import R2.c;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import io.sentry.hints.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class p {
    public static final p a;
    public static final List b;
    public static final ConcurrentHashMap c;
    public static final AtomicReference d;
    public static final ConcurrentLinkedQueue e;
    public static boolean f;

    static {
        p.a = new p();  // initializer: Ljava/lang/Object;-><init>()V
        p.b = q.L(new String[]{"supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting", "protected_mode_rules", "auto_log_app_events_default", "auto_log_app_events_enabled"});
        p.c = new ConcurrentHashMap();
        p.d = new AtomicReference(o.X);
        p.e = new ConcurrentLinkedQueue();
    }

    public static JSONObject a() {
        Bundle bundle0 = new Bundle();
        ArrayList arrayList0 = new ArrayList();
        arrayList0.addAll(p.b);
        bundle0.putString("fields", TextUtils.join(",", arrayList0));
        t t0 = i.F(null, "app", null);
        t0.i = true;
        t0.d = bundle0;
        JSONObject jSONObject0 = t0.c().d;
        return jSONObject0 == null ? new JSONObject() : jSONObject0;
    }

    public static final m b(String s) {
        return (m)p.c.get(s);
    }

    public static final HashMap c() {
        JSONObject jSONObject0;
        Context context0 = l.a();
        String s = String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{l.b()}, 1));
        String s1 = context0.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0).getString(s, null);
        if(!w.P(s1)) {
            if(s1 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            try {
                jSONObject0 = null;
                jSONObject0 = new JSONObject(s1);
            }
            catch(JSONException unused_ex) {
            }
            return jSONObject0 == null ? null : p.f(jSONObject0);
        }
        return null;
    }

    public static final void d() {
        Context context0 = l.a();
        String s = l.b();
        boolean z = w.P(s);
        o o0 = o.b0;
        p p0 = p.a;
        AtomicReference atomicReference0 = p.d;
        if(z) {
            atomicReference0.set(o0);
            p0.g();
            return;
        }
        if(p.c.containsKey(s)) {
            atomicReference0.set(o.Z);
            p0.g();
            return;
        }
        o o1 = o.X;
        o o2 = o.Y;
    alab1:
        while(!atomicReference0.compareAndSet(o1, o2)) {
            if(atomicReference0.get() != o1) {
                while(true) {
                    if(atomicReference0.compareAndSet(o0, o2)) {
                        break alab1;
                    }
                    if(atomicReference0.get() == o0) {
                        continue;
                    }
                    p0.g();
                    return;
                }
            }
            if(false) {
                break;
            }
        }
        String s1 = String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{s}, 1));
        l.c().execute(new k(context0, s1, s));
    }

    public static m e(String s, JSONObject jSONObject0) {
        JSONArray jSONArray4;
        int v10;
        String s7;
        String s6;
        String s5;
        HashMap hashMap5;
        HashMap hashMap4;
        HashMap hashMap3;
        JSONArray jSONArray1;
        e e0;
        j.f(s, "applicationId");
        JSONArray jSONArray0 = jSONObject0.optJSONArray("android_sdk_error_categories");
        b b0 = e.d;
        if(jSONArray0 == null) {
            e0 = null;
        }
        else {
            int v = jSONArray0.length();
            if(v > 0) {
                int v1 = 0;
                HashMap hashMap0 = null;
                HashMap hashMap1 = null;
                HashMap hashMap2 = null;
                String s1 = null;
                String s2 = null;
                String s3 = null;
                while(true) {
                    JSONObject jSONObject1 = jSONArray0.optJSONObject(v1);
                    if(jSONObject1 == null) {
                        jSONArray1 = jSONArray0;
                    }
                    else {
                        String s4 = jSONObject1.optString("name");
                        if(s4 == null) {
                            jSONArray1 = jSONArray0;
                        }
                        else {
                            jSONArray1 = jSONArray0;
                            if(s4.equalsIgnoreCase("other")) {
                                s1 = jSONObject1.optString("recovery_message", null);
                                hashMap0 = b.s(jSONObject1);
                            }
                            else if(s4.equalsIgnoreCase("transient")) {
                                s2 = jSONObject1.optString("recovery_message", null);
                                hashMap1 = b.s(jSONObject1);
                            }
                            else if(s4.equalsIgnoreCase("login_recoverable")) {
                                s3 = jSONObject1.optString("recovery_message", null);
                                hashMap2 = b.s(jSONObject1);
                            }
                        }
                    }
                    if(v1 + 1 >= v) {
                        break;
                    }
                    ++v1;
                    jSONArray0 = jSONArray1;
                }
                hashMap3 = hashMap0;
                hashMap4 = hashMap1;
                hashMap5 = hashMap2;
                s5 = s1;
                s6 = s2;
                s7 = s3;
            }
            else {
                hashMap3 = null;
                hashMap4 = null;
                hashMap5 = null;
                s5 = null;
                s6 = null;
                s7 = null;
            }
            e0 = new e(hashMap3, hashMap4, hashMap5, s5, s6, s7);
        }
        if(e0 == null) {
            e0 = b0.l();
        }
        int v2 = jSONObject0.optInt("app_events_feature_bitmask", 0);
        Object object0 = null;
        JSONArray jSONArray2 = jSONObject0.optJSONArray("auto_event_mapping_android");
        if(jSONArray2 != null && j.a(null, Boolean.TRUE)) {
            N4.j.K("OnReceiveMapping", jSONArray2.toString());
        }
        boolean z = jSONObject0.optBoolean("supports_implicit_sdk_logging", false);
        String s8 = jSONObject0.optString("gdpv4_nux_content", "");
        j.e(s8, "settingsJSON.optString(APP_SETTING_NUX_CONTENT, \"\")");
        jSONObject0.optBoolean("gdpv4_nux_enabled", false);
        int v3 = jSONObject0.optInt("app_events_session_timeout", 60);
        long v4 = jSONObject0.optLong("seamless_login");
        EnumSet enumSet0 = EnumSet.noneOf(u.class);
        for(Object object1: u.Y) {
            u u0 = (u)object1;
            if((u0.X & v4) != 0L) {
                enumSet0.add(u0);
            }
        }
        j.e(enumSet0, "result");
        JSONObject jSONObject2 = jSONObject0.optJSONObject("android_dialog_configs");
        HashMap hashMap6 = new HashMap();
        if(jSONObject2 != null) {
            JSONArray jSONArray3 = jSONObject2.optJSONArray("data");
            if(jSONArray3 != null) {
                int v5 = jSONArray3.length();
                if(v5 > 0) {
                    int v6 = 0;
                    while(true) {
                        JSONObject jSONObject3 = jSONArray3.optJSONObject(v6);
                        j.e(jSONObject3, "dialogConfigData.optJSONObject(i)");
                        String s9 = jSONObject3.optString("name");
                        if(w.P(s9)) {
                            jSONArray4 = jSONArray3;
                        }
                        else {
                            j.e(s9, "dialogNameWithFeature");
                            List list0 = Vb.j.p0(s9, new String[]{"|"}, 0, 6);
                            if(list0.size() == 2) {
                                String s10 = (String)Bb.p.p0(list0);
                                String s11 = (String)Bb.p.w0(list0);
                                if(!w.P(s10) && !w.P(s11)) {
                                    String s12 = jSONObject3.optString("url");
                                    if(!w.P(s12)) {
                                        Uri.parse(s12);
                                    }
                                    JSONArray jSONArray5 = jSONObject3.optJSONArray("versions");
                                    if(jSONArray5 != null) {
                                        int v7 = jSONArray5.length();
                                        int[] arr_v = new int[v7];
                                        if(v7 > 0) {
                                            jSONArray4 = jSONArray3;
                                            int v8 = 0;
                                            while(true) {
                                                int v9 = jSONArray5.optInt(v8, -1);
                                                if(v9 == -1) {
                                                    String s13 = jSONArray5.optString(v8);
                                                    if(!w.P(s13)) {
                                                        try {
                                                            j.e(s13, "versionString");
                                                            v10 = -1;
                                                            v10 = Integer.parseInt(s13);
                                                        }
                                                        catch(NumberFormatException unused_ex) {
                                                        }
                                                        v9 = v10;
                                                    }
                                                }
                                                arr_v[v8] = v9;
                                                if(v8 + 1 >= v7) {
                                                    goto label_118;
                                                }
                                                ++v8;
                                            }
                                        }
                                    }
                                    jSONArray4 = jSONArray3;
                                label_118:
                                    object0 = new c(9, s10, s11, false);
                                }
                                else {
                                    jSONArray4 = jSONArray3;
                                }
                            }
                        }
                        if(object0 != null) {
                            String s14 = (String)object0.Y;
                            Map map0 = (Map)hashMap6.get(s14);
                            if(map0 == null) {
                                map0 = new HashMap();
                                hashMap6.put(s14, map0);
                            }
                            map0.put(((String)object0.Z), object0);
                        }
                        if(v6 + 1 >= v5) {
                            break;
                        }
                        object0 = null;
                        ++v6;
                        jSONArray3 = jSONArray4;
                    }
                }
            }
        }
        String s15 = jSONObject0.optString("smart_login_bookmark_icon_url");
        j.e(s15, "settingsJSON.optString(SMART_LOGIN_BOOKMARK_ICON_URL)");
        String s16 = jSONObject0.optString("smart_login_menu_icon_url");
        j.e(s16, "settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL)");
        String s17 = jSONObject0.optString("sdk_update_message");
        j.e(s17, "settingsJSON.optString(SDK_UPDATE_MESSAGE)");
        String s18 = jSONObject0.optString("aam_rules");
        String s19 = jSONObject0.optString("suggested_events_setting");
        String s20 = jSONObject0.optString("restrictive_data_filter_params");
        JSONObject jSONObject4 = jSONObject0.optJSONObject("protected_mode_rules");
        JSONArray jSONArray6 = jSONObject4 == null ? null : jSONObject4.optJSONArray("standard_params");
        JSONObject jSONObject5 = jSONObject0.optJSONObject("protected_mode_rules");
        JSONArray jSONArray7 = jSONObject5 == null ? null : jSONObject5.optJSONArray("maca_rules");
        p.f(jSONObject0);
        JSONObject jSONObject6 = jSONObject0.optJSONObject("protected_mode_rules");
        JSONArray jSONArray8 = jSONObject6 == null ? null : jSONObject6.optJSONArray("blocklist_events");
        JSONObject jSONObject7 = jSONObject0.optJSONObject("protected_mode_rules");
        JSONArray jSONArray9 = jSONObject7 == null ? null : jSONObject7.optJSONArray("redacted_events");
        JSONObject jSONObject8 = jSONObject0.optJSONObject("protected_mode_rules");
        m m0 = new m(z, s8, v3, enumSet0, hashMap6, (v2 & 8) != 0, e0, s15, s16, (v2 & 16) != 0, (v2 & 0x20) != 0, jSONArray2, s17, s18, s19, s20, jSONArray6, jSONArray7, jSONArray8, jSONArray9, (jSONObject8 == null ? null : jSONObject8.optJSONArray("sensitive_params")));
        p.c.put(s, m0);
        return m0;
    }

    public static HashMap f(JSONObject jSONObject0) {
        HashMap hashMap0 = new HashMap();
        if(!jSONObject0.isNull("auto_log_app_events_default")) {
            try {
                hashMap0.put("auto_log_app_events_default", Boolean.valueOf(jSONObject0.getBoolean("auto_log_app_events_default")));
            }
            catch(JSONException unused_ex) {
            }
        }
        if(!jSONObject0.isNull("auto_log_app_events_enabled")) {
            try {
                hashMap0.put("auto_log_app_events_enabled", Boolean.valueOf(jSONObject0.getBoolean("auto_log_app_events_enabled")));
            }
            catch(JSONException unused_ex) {
            }
        }
        return hashMap0.isEmpty() ? null : hashMap0;
    }

    public final void g() {
        synchronized(this) {
            o o0 = (o)p.d.get();
            if(o.X != o0 && o.Y != o0) {
                String s = l.b();
                m m0 = (m)p.c.get(s);
                Handler handler0 = new Handler(Looper.getMainLooper());
                if(o.b0 == o0) {
                    while(true) {
                        ConcurrentLinkedQueue concurrentLinkedQueue0 = p.e;
                        if(concurrentLinkedQueue0.isEmpty()) {
                            break;
                        }
                        handler0.post(new n(((N4.n)concurrentLinkedQueue0.poll())));
                    }
                    return;
                }
                while(true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue1 = p.e;
                    if(concurrentLinkedQueue1.isEmpty()) {
                        break;
                    }
                    handler0.post(new n(((N4.n)concurrentLinkedQueue1.poll()), m0));
                }
            }
        }
    }

    public static final m h(String s, boolean z) {
        j.f(s, "applicationId");
        if(!z) {
            ConcurrentHashMap concurrentHashMap0 = p.c;
            if(concurrentHashMap0.containsKey(s)) {
                return (m)concurrentHashMap0.get(s);
            }
        }
        p p0 = p.a;
        m m0 = p.e(s, p.a());
        if(s.equals(l.b())) {
            p.d.set(o.Z);
            p0.g();
        }
        return m0;
    }
}

