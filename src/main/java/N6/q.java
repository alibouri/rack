package N6;

import Ab.e;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import o6.i;

public final class q {
    public final Context a;
    public final k b;
    public final String c;
    public final ArrayList d;
    public final HashSet e;
    public final Object f;
    public boolean g;
    public final Intent h;
    public final WeakReference i;
    public final m j;
    public final AtomicInteger k;
    public p l;
    public h m;
    public static final HashMap n;

    static {
        q.n = new HashMap();
    }

    public q(Context context0, k k0, Intent intent0) {
        this.d = new ArrayList();
        this.e = new HashSet();
        this.f = new Object();
        this.j = new m(0, this);
        this.k = new AtomicInteger(0);
        this.a = context0;
        this.b = k0;
        this.c = "AppUpdateService";
        this.h = intent0;
        this.i = new WeakReference(null);
    }

    public final Handler a() {
        HashMap hashMap0 = q.n;
        synchronized(hashMap0) {
            if(!hashMap0.containsKey(this.c)) {
                HandlerThread handlerThread0 = new HandlerThread(this.c, 10);
                handlerThread0.start();
                Handler handler0 = new Handler(handlerThread0.getLooper());
                hashMap0.put(this.c, handler0);
            }
        }
        return (Handler)hashMap0.get(this.c);
    }

    public static void b(q q0, l l0) {
        ArrayList arrayList0 = q0.d;
        k k0 = q0.b;
        if(q0.m == null && !q0.g) {
            k0.e("Initiate binding to the service.", new Object[0]);
            arrayList0.add(l0);
            p p0 = new p(0, q0);
            q0.l = p0;
            q0.g = true;
            if(!q0.a.bindService(q0.h, p0, 1)) {
                k0.e("Failed to bind to the service.", new Object[0]);
                q0.g = false;
                for(Object object0: arrayList0) {
                    e e0 = new e("Failed to bind to the service.");  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                    i i0 = ((l)object0).X;
                    if(i0 != null) {
                        i0.c(e0);
                    }
                }
                arrayList0.clear();
            }
            return;
        }
        if(q0.g) {
            k0.e("Waiting to bind to the service.", new Object[0]);
            arrayList0.add(l0);
            return;
        }
        l0.run();
    }

    public final void c(i i0) {
        synchronized(this.f) {
            this.e.remove(i0);
        }
        n n0 = new n(0, this);
        this.a().post(n0);
    }

    public final void d() {
        HashSet hashSet0 = this.e;
        for(Object object0: hashSet0) {
            ((i)object0).c(new RemoteException(this.c + " : Binder has died."));
        }
        hashSet0.clear();
    }
}

