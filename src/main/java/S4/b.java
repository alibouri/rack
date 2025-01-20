package S4;

import M4.l;
import N4.f;
import Nb.j;
import a5.m;
import a5.p;
import a5.w;
import f5.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b {
    public static final b a;
    public static boolean b;
    public static final ArrayList c;
    public static final HashSet d;

    static {
        b.a = new b();  // initializer: Ljava/lang/Object;-><init>()V
        b.c = new ArrayList();
        b.d = new HashSet();
    }

    public final void a() {
        synchronized(this) {
            if(a.b(this)) {
                return;
            }
            goto label_4;
        }
        return;
        try {
        label_4:
            m m0 = p.h(l.b(), false);
            if(m0 != null) {
                String s = m0.k;
                if(s != null && s.length() > 0) {
                    JSONObject jSONObject0 = new JSONObject(s);
                    b.c.clear();
                    Iterator iterator0 = jSONObject0.keys();
                    while(true) {
                        if(!iterator0.hasNext()) {
                            break;
                        }
                        Object object0 = iterator0.next();
                        String s1 = (String)object0;
                        JSONObject jSONObject1 = jSONObject0.getJSONObject(s1);
                        if(jSONObject1 == null) {
                        }
                        else if(jSONObject1.optBoolean("is_deprecated_event")) {
                            j.e(s1, "key");
                            b.d.add(s1);
                        }
                        else {
                            JSONArray jSONArray0 = jSONObject1.optJSONArray("deprecated_param");
                            j.e(s1, "key");
                            ArrayList arrayList0 = new ArrayList();
                            S4.a a0 = new S4.a();  // initializer: Ljava/lang/Object;-><init>()V
                            a0.a = s1;
                            a0.b = arrayList0;
                            if(jSONArray0 != null) {
                                a0.b = w.t(jSONArray0);
                            }
                            b.c.add(a0);
                        }
                    }
                }
                return;
            }
            return;
        }
        catch(Exception unused_ex) {
            return;
        }
        catch(Throwable throwable1) {
        }
        a.a(throwable1, this);
    }

    public static final void b(ArrayList arrayList0) {
        Class class0 = b.class;
        if(a.b(class0)) {
            return;
        }
        try {
            j.f(arrayList0, "events");
            if(!b.b) {
                return;
            }
            Iterator iterator0 = arrayList0.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                if(b.d.contains(((f)object0).b0)) {
                    iterator0.remove();
                }
            }
        }
        catch(Throwable throwable0) {
            a.a(throwable0, class0);
        }
    }
}

