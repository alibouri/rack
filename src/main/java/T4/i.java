package T4;

import Bb.F;
import M4.l;
import Nb.j;
import android.content.SharedPreferences;
import f5.a;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

public final class i {
    public static final i a;
    public static SharedPreferences b;
    public static final CopyOnWriteArraySet c;
    public static final ConcurrentHashMap d;

    static {
        i.a = new i();  // initializer: Ljava/lang/Object;-><init>()V
        i.c = new CopyOnWriteArraySet();
        i.d = new ConcurrentHashMap();
    }

    public final HashMap a(ConcurrentHashMap concurrentHashMap0) {
        if(a.b(this)) {
            return null;
        }
        try {
            j.f(concurrentHashMap0, "purchaseDetailsMap");
            long v = System.currentTimeMillis();
            Iterator iterator0 = F.X(concurrentHashMap0).entrySet().iterator();
            while(true) {
                boolean z = iterator0.hasNext();
                CopyOnWriteArraySet copyOnWriteArraySet0 = i.c;
                if(!z) {
                    SharedPreferences sharedPreferences0 = i.b;
                    if(sharedPreferences0 != null) {
                        sharedPreferences0.edit().putStringSet("PURCHASE_DETAILS_SET", copyOnWriteArraySet0).apply();
                        return new HashMap(concurrentHashMap0);
                    }
                    j.p("sharedPreferences");
                    throw null;
                }
                Object object0 = iterator0.next();
                String s = (String)((Map.Entry)object0).getKey();
                JSONObject jSONObject0 = (JSONObject)((Map.Entry)object0).getValue();
                try {
                    if(!jSONObject0.has("purchaseToken")) {
                        continue;
                    }
                    String s1 = jSONObject0.getString("purchaseToken");
                    if(i.d.containsKey(s1)) {
                        concurrentHashMap0.remove(s);
                        continue;
                    }
                    copyOnWriteArraySet0.add(s1 + ';' + v / 1000L);
                }
                catch(Exception unused_ex) {
                }
            }
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, this);
        return null;
    }

    public final void b() {
        CopyOnWriteArraySet copyOnWriteArraySet0;
        if(a.b(this)) {
            return;
        }
        try {
            long v = System.currentTimeMillis();
            SharedPreferences sharedPreferences0 = i.b;
            if(sharedPreferences0 == null) {
                j.p("sharedPreferences");
                throw null;
            }
            long v1 = sharedPreferences0.getLong("LAST_CLEARED_TIME", 0L);
            if(v1 == 0L) {
                SharedPreferences sharedPreferences1 = i.b;
                if(sharedPreferences1 != null) {
                    sharedPreferences1.edit().putLong("LAST_CLEARED_TIME", v / 1000L).apply();
                    return;
                }
                j.p("sharedPreferences");
                throw null;
            }
            if(v / 1000L - v1 > 604800L) {
                ConcurrentHashMap concurrentHashMap0 = i.d;
                Iterator iterator0 = F.X(concurrentHashMap0).entrySet().iterator();
                while(true) {
                    boolean z = iterator0.hasNext();
                    copyOnWriteArraySet0 = i.c;
                    if(!z) {
                        break;
                    }
                    Object object0 = iterator0.next();
                    String s = (String)((Map.Entry)object0).getKey();
                    long v2 = ((Number)((Map.Entry)object0).getValue()).longValue();
                    if(v / 1000L - v2 > 86400L) {
                        copyOnWriteArraySet0.remove(s + ';' + v2);
                        concurrentHashMap0.remove(s);
                    }
                }
                SharedPreferences sharedPreferences2 = i.b;
                if(sharedPreferences2 != null) {
                    sharedPreferences2.edit().putStringSet("PURCHASE_DETAILS_SET", copyOnWriteArraySet0).putLong("LAST_CLEARED_TIME", v / 1000L).apply();
                    return;
                }
                j.p("sharedPreferences");
                throw null;
            }
            return;
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, this);
    }

    public final LinkedHashMap c(HashMap hashMap0, ConcurrentHashMap concurrentHashMap0) {
        if(a.b(this)) {
            return null;
        }
        try {
            j.f(hashMap0, "purchaseDetailsMap");
            j.f(concurrentHashMap0, "skuDetailsMap");
            long v = System.currentTimeMillis();
            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
            Iterator iterator0 = hashMap0.entrySet().iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    return linkedHashMap0;
                }
                Object object0 = iterator0.next();
                String s = (String)((Map.Entry)object0).getKey();
                JSONObject jSONObject0 = (JSONObject)((Map.Entry)object0).getValue();
                JSONObject jSONObject1 = (JSONObject)concurrentHashMap0.get(s);
                if(jSONObject0 != null && jSONObject0.has("purchaseTime")) {
                    try {
                        if(v / 1000L - jSONObject0.getLong("purchaseTime") / 1000L > 86400L || jSONObject1 == null) {
                            continue;
                        }
                        String s1 = jSONObject0.toString();
                        j.e(s1, "purchaseDetail.toString()");
                        String s2 = jSONObject1.toString();
                        j.e(s2, "skuDetail.toString()");
                        linkedHashMap0.put(s1, s2);
                    }
                    catch(Exception unused_ex) {
                    }
                }
            }
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
            return null;
        }
    }

    public static final boolean d() {
        Class class0 = i.class;
        if(a.b(class0)) {
            return false;
        }
        try {
            i.a.f();
            long v = System.currentTimeMillis();
            SharedPreferences sharedPreferences0 = i.b;
            if(sharedPreferences0 != null) {
                long v1 = sharedPreferences0.getLong("LAST_QUERY_PURCHASE_HISTORY_TIME", 0L);
                if(v1 != 0L && v / 1000L - v1 < 86400L) {
                    return false;
                }
                SharedPreferences sharedPreferences1 = i.b;
                if(sharedPreferences1 != null) {
                    sharedPreferences1.edit().putLong("LAST_QUERY_PURCHASE_HISTORY_TIME", v / 1000L).apply();
                    return true;
                }
                j.p("sharedPreferences");
                throw null;
            }
            j.p("sharedPreferences");
            throw null;
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, class0);
        return false;
    }

    public static final void e(ConcurrentHashMap concurrentHashMap0, ConcurrentHashMap concurrentHashMap1) {
        Class class0 = i.class;
        if(a.b(class0)) {
            return;
        }
        try {
            j.f(concurrentHashMap0, "purchaseDetailsMap");
            j.f(concurrentHashMap1, "skuDetailsMap");
            i i0 = i.a;
            i0.f();
            LinkedHashMap linkedHashMap0 = i0.c(i0.a(concurrentHashMap0), concurrentHashMap1);
            if(!a.b(i0)) {
                try {
                    for(Object object0: linkedHashMap0.entrySet()) {
                        String s = (String)((Map.Entry)object0).getKey();
                        String s1 = (String)((Map.Entry)object0).getValue();
                        if(s != null && s1 != null) {
                            V4.j.a(s, s1, false);
                        }
                    }
                }
                catch(Throwable throwable1) {
                    a.a(throwable1, i0);
                }
            }
        }
        catch(Throwable throwable0) {
            a.a(throwable0, class0);
        }
    }

    public final void f() {
        if(a.b(this)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences0 = l.a().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
            SharedPreferences sharedPreferences1 = l.a().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
            if(sharedPreferences0.contains("LAST_CLEARED_TIME")) {
                sharedPreferences0.edit().clear().apply();
                sharedPreferences1.edit().clear().apply();
            }
            SharedPreferences sharedPreferences2 = l.a().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
            j.e(sharedPreferences2, "getApplicationContext().getSharedPreferences(PRODUCT_DETAILS_STORE, Context.MODE_PRIVATE)");
            i.b = sharedPreferences2;
            CopyOnWriteArraySet copyOnWriteArraySet0 = i.c;
            Set set0 = sharedPreferences2.getStringSet("PURCHASE_DETAILS_SET", new HashSet());
            Collection collection0 = set0 == null ? new HashSet() : set0;
            copyOnWriteArraySet0.addAll(collection0);
            for(Object object0: copyOnWriteArraySet0) {
                List list0 = Vb.j.p0(((String)object0), new String[]{";"}, 2, 2);
                Object object1 = list0.get(0);
                Long long0 = Long.parseLong(((String)list0.get(1)));
                i.d.put(object1, long0);
            }
            this.b();
            return;
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, this);
    }
}

