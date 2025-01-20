package a5;

import E7.D;
import M4.t;
import Nb.j;
import Nb.x;
import U7.c;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import b5.a;
import io.sentry.hints.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class l {
    public static final AtomicBoolean a;
    public static final ConcurrentLinkedQueue b;
    public static final ConcurrentHashMap c;
    public static Long d;
    public static c e;

    static {
        x.a(l.class).c();
        l.a = new AtomicBoolean(false);
        l.b = new ConcurrentLinkedQueue();
        l.c = new ConcurrentHashMap();
    }

    public static JSONObject a() {
        Bundle bundle0 = new Bundle();
        bundle0.putString("platform", "android");
        bundle0.putString("sdk_version", "17.0.2");
        bundle0.putString("fields", "gatekeepers");
        t t0 = i.F(null, String.format("app/%s", Arrays.copyOf(new Object[]{"mobile_sdk_gk"}, 1)), null);
        t0.d = bundle0;
        JSONObject jSONObject0 = t0.c().d;
        return jSONObject0 == null ? new JSONObject() : jSONObject0;
    }

    public static final boolean b(String s, String s1, boolean z) {
        HashMap hashMap0;
        j.f(s, "name");
        ArrayList arrayList0 = null;
        l.c(null);
        ConcurrentHashMap concurrentHashMap0 = l.c;
        if(concurrentHashMap0.containsKey(s1)) {
            c c0 = l.e;
            if(c0 != null) {
                ConcurrentHashMap concurrentHashMap1 = (ConcurrentHashMap)((ConcurrentHashMap)c0.Y).get(s1);
                if(concurrentHashMap1 != null) {
                    arrayList0 = new ArrayList(concurrentHashMap1.size());
                    for(Object object0: concurrentHashMap1.entrySet()) {
                        arrayList0.add(((a)((Map.Entry)object0).getValue()));
                    }
                }
            }
            if(arrayList0 == null) {
                HashMap hashMap1 = new HashMap();
                JSONObject jSONObject0 = (JSONObject)concurrentHashMap0.get(s1);
                if(jSONObject0 == null) {
                    jSONObject0 = new JSONObject();
                }
                Iterator iterator2 = jSONObject0.keys();
                while(iterator2.hasNext()) {
                    Object object2 = iterator2.next();
                    j.e(((String)object2), "key");
                    hashMap1.put(((String)object2), Boolean.valueOf(jSONObject0.optBoolean(((String)object2))));
                }
                c c1 = l.e == null ? new c(26) : l.e;
                ArrayList arrayList1 = new ArrayList(hashMap1.size());
                for(Object object3: hashMap1.entrySet()) {
                    arrayList1.add(new a(((String)((Map.Entry)object3).getKey()), ((Boolean)((Map.Entry)object3).getValue()).booleanValue()));
                }
                ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                for(Object object4: arrayList1) {
                    concurrentHashMap2.put(((a)object4).a, ((a)object4));
                }
                ((ConcurrentHashMap)c1.Y).put(s1, concurrentHashMap2);
                l.e = c1;
                hashMap0 = hashMap1;
            }
            else {
                hashMap0 = new HashMap();
                for(Object object1: arrayList0) {
                    hashMap0.put(((a)object1).a, Boolean.valueOf(((a)object1).b));
                }
            }
        }
        else {
            hashMap0 = new HashMap();
        }
        if(hashMap0.containsKey(s)) {
            Boolean boolean0 = (Boolean)hashMap0.get(s);
            return boolean0 == null ? z : boolean0.booleanValue();
        }
        return z;
    }

    public static final void c(a5.i i0) {
        synchronized(l.class) {
            if(i0 != null) {
                l.b.add(i0);
            }
            String s = M4.l.b();
            if(l.d != null && System.currentTimeMillis() - ((long)l.d) < 3600000L && l.c.containsKey(s)) {
                l.e();
                return;
            }
            Context context0 = M4.l.a();
            String s1 = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{s}, 1));
            JSONObject jSONObject0 = null;
            String s2 = context0.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(s1, null);
            if(!w.P(s2)) {
                try {
                    jSONObject0 = new JSONObject(s2);
                }
                catch(JSONException unused_ex) {
                }
                if(jSONObject0 != null) {
                    l.d(s, jSONObject0);
                }
            }
            Executor executor0 = M4.l.c();
            if(!l.a.compareAndSet(false, true)) {
                return;
            }
            executor0.execute(new k(s, context0, s1));
        }
    }

    public static final JSONObject d(String s, JSONObject jSONObject0) {
        synchronized(l.class) {
            JSONObject jSONObject1 = (JSONObject)l.c.get(s);
            if(jSONObject1 == null) {
                jSONObject1 = new JSONObject();
            }
            JSONArray jSONArray0 = jSONObject0.optJSONArray("data");
            JSONObject jSONObject2 = jSONArray0 == null ? null : jSONArray0.optJSONObject(0);
            if(jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            JSONArray jSONArray1 = jSONObject2.optJSONArray("gatekeepers");
            if(jSONArray1 == null) {
                jSONArray1 = new JSONArray();
            }
            int v2 = jSONArray1.length();
            if(v2 > 0) {
                for(int v1 = 0; true; ++v1) {
                    try {
                        JSONObject jSONObject3 = jSONArray1.getJSONObject(v1);
                        jSONObject1.put(jSONObject3.getString("key"), jSONObject3.getBoolean("value"));
                    }
                    catch(JSONException unused_ex) {
                    }
                    if(v1 + 1 >= v2) {
                        break;
                    }
                }
            }
            l.c.put(s, jSONObject1);
            return jSONObject1;
        }
    }

    public static void e() {
        Handler handler0 = new Handler(Looper.getMainLooper());
        while(true) {
            ConcurrentLinkedQueue concurrentLinkedQueue0 = l.b;
            if(concurrentLinkedQueue0.isEmpty()) {
                break;
            }
            a5.i i0 = (a5.i)concurrentLinkedQueue0.poll();
            if(i0 != null) {
                handler0.post(new D(17, i0));
            }
        }
    }
}

