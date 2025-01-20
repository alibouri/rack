package T6;

import N6.m;
import N6.p;
import S6.b;
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

public final class i {
    public final Context a;
    public final e b;
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
    public d m;
    public static final HashMap n;

    static {
        i.n = new HashMap();
    }

    public i(Context context0, e e0, Intent intent0) {
        this.d = new ArrayList();
        this.e = new HashSet();
        this.f = new Object();
        this.j = new m(1, this);
        this.k = new AtomicInteger(0);
        this.a = context0;
        this.b = e0;
        this.c = "com.google.android.finsky.inappreviewservice.InAppReviewService";
        this.h = intent0;
        this.i = new WeakReference(null);
    }

    public final Handler a() {
        HashMap hashMap0 = i.n;
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

    public static void b(i i0, b b0) {
        ArrayList arrayList0 = i0.d;
        e e0 = i0.b;
        if(i0.m == null && !i0.g) {
            e0.b("Initiate binding to the service.", new Object[0]);
            arrayList0.add(b0);
            p p0 = new p(1, i0);
            i0.l = p0;
            i0.g = true;
            if(!i0.a.bindService(i0.h, p0, 1)) {
                e0.b("Failed to bind to the service.", new Object[0]);
                i0.g = false;
                for(Object object0: arrayList0) {
                    Ab.e e1 = new Ab.e("Failed to bind to the service.");  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                    o6.i i1 = ((f)object0).X;
                    if(i1 != null) {
                        i1.c(e1);
                    }
                }
                arrayList0.clear();
            }
            return;
        }
        if(i0.g) {
            e0.b("Waiting to bind to the service.", new Object[0]);
            arrayList0.add(b0);
            return;
        }
        b0.run();
    }

    public final void c() {
        HashSet hashSet0 = this.e;
        for(Object object0: hashSet0) {
            ((o6.i)object0).c(new RemoteException(this.c + " : Binder has died."));
        }
        hashSet0.clear();
    }
}

