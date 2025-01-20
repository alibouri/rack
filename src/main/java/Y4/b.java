package Y4;

import M4.l;
import Nb.j;
import a5.m;
import a5.p;
import a5.w;
import android.util.Log;
import f5.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

public final class b {
    public static final b a;
    public static boolean b;
    public static final ArrayList c;
    public static final CopyOnWriteArraySet d;

    static {
        b.a = new b();  // initializer: Ljava/lang/Object;-><init>()V
        b.c = new ArrayList();
        b.d = new CopyOnWriteArraySet();
    }

    public final String a(String s, String s1) {
        if(a.b(this)) {
            return null;
        }
        try {
            try {
                Iterator iterator0 = new ArrayList(b.c).iterator();
            alab1:
                while(true) {
                label_3:
                    if(!iterator0.hasNext()) {
                        return null;
                    }
                    Object object0 = iterator0.next();
                    Y4.a a0 = (Y4.a)object0;
                    if(a0 != null && j.a(s, a0.a)) {
                        Iterator iterator1 = a0.b.keySet().iterator();
                        while(true) {
                            if(!iterator1.hasNext()) {
                                break alab1;
                            }
                            Object object1 = iterator1.next();
                            String s2 = (String)object1;
                            if(!j.a(s1, s2)) {
                                continue;
                            }
                            return (String)a0.b.get(s2);
                        }
                    }
                }
            }
            catch(Exception exception0) {
                Log.w("Y4.b", "getMatchedRuleType failed", exception0);
                return null;
            }
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
            return null;
        }
        goto label_3;
    }

    public final void b() {
        if(a.b(this)) {
            return;
        }
        try {
            m m0 = p.h(l.b(), false);
            if(m0 == null) {
                return;
            }
            String s = m0.k;
            if(s == null || s.length() == 0) {
                return;
            }
            JSONObject jSONObject0 = new JSONObject(s);
            ArrayList arrayList0 = b.c;
            arrayList0.clear();
            CopyOnWriteArraySet copyOnWriteArraySet0 = b.d;
            copyOnWriteArraySet0.clear();
            Iterator iterator0 = jSONObject0.keys();
            while(true) {
                if(!iterator0.hasNext()) {
                    return;
                }
                Object object0 = iterator0.next();
                String s1 = (String)object0;
                JSONObject jSONObject1 = jSONObject0.getJSONObject(s1);
                if(jSONObject1 != null) {
                    JSONObject jSONObject2 = jSONObject1.optJSONObject("restrictive_param");
                    j.e(s1, "key");
                    HashMap hashMap0 = new HashMap();
                    Y4.a a0 = new Y4.a();  // initializer: Ljava/lang/Object;-><init>()V
                    a0.a = s1;
                    a0.b = hashMap0;
                    if(jSONObject2 != null) {
                        a0.b = w.v(jSONObject2);
                        arrayList0.add(a0);
                    }
                    if(jSONObject1.has("process_event_name")) {
                        copyOnWriteArraySet0.add(s1);
                    }
                }
            }
        }
        catch(Exception unused_ex) {
            return;
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, this);
    }
}

