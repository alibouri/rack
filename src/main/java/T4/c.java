package T4;

import M4.B;
import Nb.j;
import a5.m;
import a5.p;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {
    public static final AtomicBoolean a;
    public static Boolean b;
    public static Boolean c;
    public static a d;
    public static b e;
    public static Intent f;
    public static Object g;

    static {
        c.a = new AtomicBoolean(false);
    }

    public static final void a(Context context0, ArrayList arrayList0, boolean z) {
        if(!arrayList0.isEmpty()) {
            HashMap hashMap0 = new HashMap();
            ArrayList arrayList1 = new ArrayList();
            for(Object object0: arrayList0) {
                String s = (String)object0;
                try {
                    String s1 = new JSONObject(s).getString("productId");
                    j.e(s1, "sku");
                    j.e(s, "purchase");
                    hashMap0.put(s1, s);
                    arrayList1.add(s1);
                }
                catch(JSONException jSONException0) {
                    Log.e("T4.c", "Error parsing in-app purchase data.", jSONException0);
                }
            }
            Object object1 = c.g;
            Class class0 = h.class;
            Map map0 = null;
            if(!f5.a.b(class0)) {
                try {
                    h h0 = h.a;
                    LinkedHashMap linkedHashMap0 = h0.j(arrayList1);
                    ArrayList arrayList2 = new ArrayList();
                    for(Object object2: arrayList1) {
                        String s2 = (String)object2;
                        if(!linkedHashMap0.containsKey(s2)) {
                            arrayList2.add(s2);
                        }
                    }
                    linkedHashMap0.putAll(h0.g(context0, arrayList2, object1, z));
                    map0 = linkedHashMap0;
                    goto label_35;
                }
                catch(Throwable throwable0) {
                }
                f5.a.a(throwable0, class0);
            }
        label_35:
            for(Object object3: map0.entrySet()) {
                String s3 = (String)((Map.Entry)object3).getKey();
                String s4 = (String)((Map.Entry)object3).getValue();
                String s5 = (String)hashMap0.get(s3);
                if(s5 != null) {
                    V4.j.a(s5, s4, z);
                }
            }
        }
    }

    public static final void b() {
        if(c.b == null) {
            Boolean boolean0 = Boolean.valueOf(l.I("com.android.vending.billing.IInAppBillingService$Stub") != null);
            c.b = boolean0;
            if(!boolean0.equals(Boolean.FALSE)) {
                c.c = Boolean.valueOf(l.I("com.android.billingclient.api.ProxyBillingActivity") != null);
                Class class0 = h.class;
                if(!f5.a.b(class0)) {
                    try {
                        long v = System.currentTimeMillis();
                        SharedPreferences sharedPreferences0 = h.e;
                        long v1 = sharedPreferences0.getLong("LAST_CLEARED_TIME", 0L);
                        if(v1 == 0L) {
                            sharedPreferences0.edit().putLong("LAST_CLEARED_TIME", v / 1000L).apply();
                        }
                        else if(v / 1000L - v1 > 604800L) {
                            sharedPreferences0.edit().clear().putLong("LAST_CLEARED_TIME", v / 1000L).apply();
                        }
                        goto label_18;
                    }
                    catch(Throwable throwable0) {
                    }
                    f5.a.a(throwable0, class0);
                }
            label_18:
                Intent intent0 = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
                j.e(intent0, "Intent(\"com.android.vending.billing.InAppBillingService.BIND\")\n            .setPackage(\"com.android.vending\")");
                c.f = intent0;
                c.d = new a();  // initializer: Ljava/lang/Object;-><init>()V
                c.e = new b();  // initializer: Ljava/lang/Object;-><init>()V
            }
        }
        if(j.a(c.b, Boolean.FALSE)) {
            return;
        }
        m m0 = p.b(M4.l.b());
        if(m0 != null && B.c() && m0.e && c.a.compareAndSet(false, true)) {
            Context context0 = M4.l.a();
            if(context0 instanceof Application) {
                b b0 = c.e;
                if(b0 != null) {
                    ((Application)context0).registerActivityLifecycleCallbacks(b0);
                    Intent intent1 = c.f;
                    if(intent1 != null) {
                        a a0 = c.d;
                        if(a0 != null) {
                            context0.bindService(intent1, a0, 1);
                            return;
                        }
                        j.p("serviceConnection");
                        throw null;
                    }
                    j.p("intent");
                    throw null;
                }
                j.p("callbacks");
                throw null;
            }
        }
    }
}

