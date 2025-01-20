package Q4;

import E7.D;
import M4.h;
import Nb.j;
import V4.e;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import f5.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.WeakHashMap;

public final class g {
    public final Handler a;
    public final Set b;
    public final LinkedHashSet c;
    public HashSet d;
    public final HashMap e;
    public static final c f;
    public static g g;

    static {
        g.f = new c();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public g() {
        this.a = new Handler(Looper.getMainLooper());
        Set set0 = Collections.newSetFromMap(new WeakHashMap());
        j.e(set0, "newSetFromMap(WeakHashMap())");
        this.b = set0;
        this.c = new LinkedHashSet();
        this.d = new HashSet();
        this.e = new HashMap();
    }

    public final void a(Activity activity0) {
        if(a.b(this)) {
            return;
        }
        try {
            j.f(activity0, "activity");
            if(j.a(null, Boolean.TRUE)) {
                return;
            }
            if(Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new h("Can\'t add activity to CodelessMatcher on non-UI thread");
            }
            this.b.add(activity0);
            this.d.clear();
            HashSet hashSet0 = (HashSet)this.e.get(activity0.hashCode());
            if(hashSet0 != null) {
                this.d = hashSet0;
            }
            if(!a.b(this)) {
                goto label_13;
            }
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
        }
        return;
        try {
        label_13:
            if(Thread.currentThread() == Looper.getMainLooper().getThread()) {
                this.b();
                return;
            }
            D d0 = new D(10, this);
            this.a.post(d0);
            return;
        }
        catch(Throwable throwable1) {
        }
        try {
            a.a(throwable1, this);
            return;
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, this);
    }

    public final void b() {
        if(a.b(this)) {
            return;
        }
        try {
            for(Object object0: this.b) {
                Activity activity0 = (Activity)object0;
                if(activity0 != null) {
                    View view0 = e.b(activity0);
                    String s = activity0.getClass().getSimpleName();
                    f f0 = new f(view0, this.a, this.d, s);
                    this.c.add(f0);
                }
            }
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
        }
    }

    public final void c(Activity activity0) {
        if(a.b(this)) {
            return;
        }
        try {
            j.f(activity0, "activity");
            if(j.a(null, Boolean.TRUE)) {
                return;
            }
            if(Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new h("Can\'t remove activity from CodelessMatcher on non-UI thread");
            }
            this.b.remove(activity0);
            this.c.clear();
            HashSet hashSet0 = (HashSet)this.d.clone();
            this.e.put(activity0.hashCode(), hashSet0);
            this.d.clear();
            return;
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, this);
    }
}

