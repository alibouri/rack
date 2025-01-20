package T4;

import N4.c;
import android.content.Context;
import f5.a;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public final class d {
    public static final d a;

    static {
        d.a = new d();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public static void a(Context context0) {
        Object object4;
        k k0;
        Class class0 = k.class;
        Object object0 = null;
        boolean z = (a.b(class0) ? null : k.h).get();
        Class class1 = String.class;
        if(!z) {
            Class class2 = l.I("com.android.billingclient.api.SkuDetailsParams");
            Class class3 = l.I("com.android.billingclient.api.SkuDetailsParams$Builder");
            if(class2 != null && class3 != null) {
                Method method0 = l.L(class2, "newBuilder", new Class[0]);
                Method method1 = l.L(class3, "setType", new Class[]{class1});
                Method method2 = l.L(class3, "setSkusList", new Class[]{List.class});
                Method method3 = l.L(class3, "build", new Class[0]);
                if(method0 != null && method1 != null && method2 != null && method3 != null) {
                    k k1 = new k(class2, class3, method0, method1, method2, method3);
                    if(!a.b(class0)) {
                        k.g = k1;
                    }
                }
            }
            (a.b(class0) ? null : k.h).set(true);
            k0 = a.b(class0) ? null : k.g;
        }
        else if(!a.b(class0)) {
            k0 = k.g;
        }
        else {
            k0 = null;
        }
        if(k0 == null) {
            return;
        }
        Class class4 = l.I("com.android.billingclient.api.BillingClient");
        Class class5 = l.I("com.android.billingclient.api.Purchase");
        Class class6 = l.I("com.android.billingclient.api.Purchase$PurchasesResult");
        Class class7 = l.I("com.android.billingclient.api.SkuDetails");
        Class class8 = l.I("com.android.billingclient.api.PurchaseHistoryRecord");
        Class class9 = l.I("com.android.billingclient.api.SkuDetailsResponseListener");
        Class class10 = l.I("com.android.billingclient.api.PurchaseHistoryResponseListener");
        if(class4 != null && class6 != null && class5 != null && class7 != null && class9 != null && class8 != null && class10 != null) {
            Method method4 = l.L(class4, "queryPurchases", new Class[]{class1});
            Method method5 = l.L(class6, "getPurchasesList", new Class[0]);
            Method method6 = l.L(class5, "getOriginalJson", new Class[0]);
            Method method7 = l.L(class7, "getOriginalJson", new Class[0]);
            Method method8 = l.L(class8, "getOriginalJson", new Class[0]);
            Method method9 = l.L(class4, "querySkuDetailsAsync", new Class[]{(a.b(k0) ? null : k0.a), class9});
            Method method10 = l.L(class4, "queryPurchaseHistoryAsync", new Class[]{class1, class10});
            if(method4 != null && method5 != null && method6 != null && method7 != null && method8 != null && method9 != null && method10 != null) {
                Class class11 = l.I("com.android.billingclient.api.BillingClient$Builder");
                Class class12 = l.I("com.android.billingclient.api.PurchasesUpdatedListener");
                if(class11 == null || class12 == null) {
                    object4 = null;
                }
                else {
                    Method method11 = l.L(class4, "newBuilder", new Class[]{Context.class});
                    Method method12 = l.L(class11, "enablePendingPurchases", new Class[0]);
                    Method method13 = l.L(class11, "setListener", new Class[]{class12});
                    Method method14 = l.L(class11, "build", new Class[0]);
                    if(method11 == null || method12 == null || method13 == null || method14 == null) {
                        object4 = null;
                    }
                    else {
                        Object object1 = l.O(class4, method11, null, new Object[]{context0});
                        if(object1 == null) {
                            object4 = null;
                        }
                        else {
                            Object object2 = l.O(class11, method13, object1, new Object[]{Proxy.newProxyInstance(class12.getClassLoader(), new Class[]{class12}, new e(1))});
                            if(object2 == null) {
                                object4 = null;
                            }
                            else {
                                Object object3 = l.O(class11, method12, object2, new Object[0]);
                                if(object3 != null) {
                                    object0 = l.O(class11, method14, object3, new Object[0]);
                                }
                                object4 = object0;
                            }
                        }
                    }
                }
                if(object4 == null) {
                    return;
                }
                g g0 = new g(context0, object4, class4, class6, class5, class7, class8, class9, class10, method4, method5, method6, method7, method8, method9, method10, k0);
                Class class13 = g.class;
                if(!a.b(class13)) {
                    g.u = g0;
                }
                g g1 = g.a();
                if(g1 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper");
                }
                if(!a.b(class13)) {
                    try {
                        g1.e();
                    }
                    catch(Throwable throwable0) {
                        a.a(throwable0, class13);
                    }
                }
            }
        }
    }

    public static ConcurrentHashMap b() {
        return a.b(g.class) ? null : g.w;
    }

    public static AtomicBoolean c() {
        return a.b(g.class) ? null : g.v;
    }

    public void d() {
        if(a.b(this)) {
            return;
        }
        try {
            ConcurrentHashMap concurrentHashMap0 = null;
            ConcurrentHashMap concurrentHashMap1 = d.b();
            if(!a.b(g.class)) {
                concurrentHashMap0 = g.x;
            }
            i.e(concurrentHashMap1, concurrentHashMap0);
            d.b().clear();
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
        }
    }

    public static final void e(Context context0) {
        g g0;
        if(a.b(d.class)) {
            return;
        }
        try {
            if(l.I("com.android.billingclient.api.Purchase") == null) {
                return;
            }
            AtomicBoolean atomicBoolean0 = null;
            synchronized(g.s) {
                AtomicBoolean atomicBoolean1 = a.b(g.class) ? null : g.t;
                if(!atomicBoolean1.get()) {
                    d.a(context0);
                    if(!a.b(g.class)) {
                        atomicBoolean0 = g.t;
                    }
                    atomicBoolean0.set(true);
                }
                g0 = g.a();
            }
            if(g0 == null) {
                return;
            }
            if(d.c().get()) {
                if(i.d()) {
                    g0.c(new c(8));
                    return;
                }
                g0.b(new c(9));
            }
            return;
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, d.class);
    }
}

