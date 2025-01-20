package T4;

import E7.n;
import N4.c;
import Nb.j;
import android.content.Context;
import f5.a;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public final class g {
    public final Context a;
    public final Object b;
    public final Class c;
    public final Class d;
    public final Class e;
    public final Class f;
    public final Class g;
    public final Class h;
    public final Class i;
    public final Method j;
    public final Method k;
    public final Method l;
    public final Method m;
    public final Method n;
    public final Method o;
    public final Method p;
    public final k q;
    public final CopyOnWriteArraySet r;
    public static final d s;
    public static final AtomicBoolean t;
    public static g u;
    public static final AtomicBoolean v;
    public static final ConcurrentHashMap w;
    public static final ConcurrentHashMap x;

    static {
        g.s = new d();  // initializer: Ljava/lang/Object;-><init>()V
        g.t = new AtomicBoolean(false);
        g.v = new AtomicBoolean(false);
        g.w = new ConcurrentHashMap();
        g.x = new ConcurrentHashMap();
    }

    public g(Context context0, Object object0, Class class0, Class class1, Class class2, Class class3, Class class4, Class class5, Class class6, Method method0, Method method1, Method method2, Method method3, Method method4, Method method5, Method method6, k k0) {
        this.a = context0;
        this.b = object0;
        this.c = class0;
        this.d = class1;
        this.e = class2;
        this.f = class3;
        this.g = class4;
        this.h = class5;
        this.i = class6;
        this.j = method0;
        this.k = method1;
        this.l = method2;
        this.m = method3;
        this.n = method4;
        this.o = method5;
        this.p = method6;
        this.q = k0;
        this.r = new CopyOnWriteArraySet();
    }

    // Deobfuscation rating: LOW(20)
    public static final g a() {
        return a.b(g.class) ? null : g.u;
    }

    public final void b(c c0) {
        if(a.b(this)) {
            return;
        }
        try {
            Object object0 = l.O(this.c, this.j, this.b, new Object[]{"inapp"});
            Object object1 = l.O(this.d, this.k, object0, new Object[0]);
            List list0 = object1 instanceof List ? ((List)object1) : null;
            if(list0 == null) {
                return;
            }
            try {
                ArrayList arrayList0 = new ArrayList();
                for(Object object2: list0) {
                    Object object3 = l.O(this.e, this.l, object2, new Object[0]);
                    String s = object3 instanceof String ? ((String)object3) : null;
                    if(s != null) {
                        JSONObject jSONObject0 = new JSONObject(s);
                        if(jSONObject0.has("productId")) {
                            String s1 = jSONObject0.getString("productId");
                            arrayList0.add(s1);
                            j.e(s1, "skuID");
                            g.w.put(s1, jSONObject0);
                        }
                    }
                }
                this.d(arrayList0, c0);
            }
            catch(JSONException unused_ex) {
            }
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
        }
    }

    public final void c(c c0) {
        if(a.b(this)) {
            return;
        }
        try {
            n n0 = new n(this, 19, c0);
            Class class0 = this.i;
            if(!a.b(this)) {
                try {
                    l.O(this.c, this.p, this.b, new Object[]{"inapp", Proxy.newProxyInstance(class0.getClassLoader(), new Class[]{class0}, new f(this, n0))});
                }
                catch(Throwable throwable1) {
                    a.a(throwable1, this);
                }
            }
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
        }
    }

    public final void d(ArrayList arrayList0, Runnable runnable0) {
        Class class0 = this.h;
        if(a.b(this)) {
            return;
        }
        try {
            Object[] arr_object = {this.q.a(arrayList0), Proxy.newProxyInstance(class0.getClassLoader(), new Class[]{class0}, new f(this, runnable0))};
            l.O(this.c, this.o, this.b, arr_object);
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
        }
    }

    public final void e() {
        Class class0 = this.c;
        if(a.b(this)) {
            return;
        }
        try {
            Class class1 = l.I("com.android.billingclient.api.BillingClientStateListener");
            if(class1 == null) {
                return;
            }
            Method method0 = l.L(class0, "startConnection", new Class[]{class1});
            if(method0 == null) {
                return;
            }
            l.O(class0, method0, this.b, new Object[]{Proxy.newProxyInstance(class1.getClassLoader(), new Class[]{class1}, new e(0))});
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
        }
    }
}

