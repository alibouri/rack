package T4;

import E7.n;
import Nb.j;
import f5.a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

public final class f implements InvocationHandler {
    public final int a;
    public final g b;
    public final Runnable c;

    public f(g g0, n n0) {
        this.a = 0;
        super();
        j.f(g0, "this$0");
        this.b = g0;
        this.c = n0;
    }

    public f(g g0, Runnable runnable0) {
        this.a = 1;
        super();
        j.f(g0, "this$0");
        this.b = g0;
        this.c = runnable0;
    }

    public void a(List list0) {
        CopyOnWriteArraySet copyOnWriteArraySet0;
        g g0;
        Object object0;
        Class class0 = g.class;
        if(a.b(this)) {
            return;
        }
        try {
            Iterator iterator0 = list0.iterator();
            while(true) {
            label_4:
                if(!iterator0.hasNext()) {
                    ((n)this.c).run();
                    return;
                }
                object0 = iterator0.next();
                try {
                    boolean z = a.b(class0);
                    g0 = this.b;
                    copyOnWriteArraySet0 = null;
                    if(z) {
                        break;
                    }
                    else {
                        goto label_14;
                    }
                    goto label_15;
                }
                catch(Exception unused_ex) {
                }
            }
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
            return;
        }
        Class class1 = null;
        goto label_15;
    label_14:
        class1 = g0.g;
        try {
        label_15:
            Method method0 = a.b(class0) ? null : g0.n;
            Object object1 = l.O(class1, method0, object0, new Object[0]);
            String s = object1 instanceof String ? ((String)object1) : null;
            if(s == null) {
                goto label_4;
            }
            JSONObject jSONObject0 = new JSONObject(s);
            a.b(class0);
            jSONObject0.put("packageName", "com.wave.personal");
            if(!jSONObject0.has("productId")) {
                goto label_4;
            }
            String s1 = jSONObject0.getString("productId");
            if(!a.b(class0)) {
                copyOnWriteArraySet0 = g0.r;
            }
            copyOnWriteArraySet0.add(s1);
            ConcurrentHashMap concurrentHashMap0 = d.b();
            j.e(s1, "skuID");
            concurrentHashMap0.put(s1, jSONObject0);
            goto label_4;
        }
        catch(Exception unused_ex) {
            goto label_4;
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, this);
    }

    public void b(List list0) {
        g g0;
        ConcurrentHashMap concurrentHashMap0;
        Object object0;
        Class class0 = g.class;
        if(a.b(this)) {
            return;
        }
        try {
            Iterator iterator0 = list0.iterator();
            while(true) {
            label_4:
                if(!iterator0.hasNext()) {
                    this.c.run();
                    return;
                }
                object0 = iterator0.next();
                try {
                    boolean z = a.b(class0);
                    concurrentHashMap0 = null;
                    g0 = this.b;
                    if(z) {
                        break;
                    }
                    else {
                        goto label_14;
                    }
                    goto label_15;
                }
                catch(Exception unused_ex) {
                }
            }
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
            return;
        }
        Class class1 = null;
        goto label_15;
    label_14:
        class1 = g0.f;
        try {
        label_15:
            Method method0 = a.b(class0) ? null : g0.m;
            Object object1 = l.O(class1, method0, object0, new Object[0]);
            String s = object1 instanceof String ? ((String)object1) : null;
            if(s == null) {
                goto label_4;
            }
            JSONObject jSONObject0 = new JSONObject(s);
            if(!jSONObject0.has("productId")) {
                goto label_4;
            }
            String s1 = jSONObject0.getString("productId");
            if(!a.b(class0)) {
                concurrentHashMap0 = g.x;
            }
            j.e(s1, "skuID");
            concurrentHashMap0.put(s1, jSONObject0);
            goto label_4;
        }
        catch(Exception unused_ex) {
            goto label_4;
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, this);
    }

    @Override
    public final Object invoke(Object object0, Method method0, Object[] arr_object) {
        if(this.a != 0) {
            if(!a.b(this)) {
                try {
                    j.f(object0, "proxy");
                    j.f(method0, "m");
                    if(j.a(method0.getName(), "onSkuDetailsResponse")) {
                        Object object1 = arr_object == null ? null : arr_object[1];
                        if(object1 != null && object1 instanceof List) {
                            this.b(((List)object1));
                            return null;
                        }
                    }
                }
                catch(Throwable throwable0) {
                    a.a(throwable0, this);
                }
            }
            return null;
        }
        if(!a.b(this)) {
            try {
                j.f(object0, "proxy");
                j.f(method0, "method");
                if(j.a(method0.getName(), "onPurchaseHistoryResponse")) {
                    Object object2 = arr_object == null ? null : arr_object[1];
                    if(object2 != null && object2 instanceof List) {
                        this.a(((List)object2));
                        return null;
                    }
                }
            }
            catch(Throwable throwable1) {
                a.a(throwable1, this);
            }
        }
        return null;
    }
}

