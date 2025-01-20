package W7;

import B3.d;
import android.util.Log;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import n2.b;
import o6.h;
import o6.k;
import o6.p;

public final class c {
    public final Executor a;
    public final n b;
    public p c;
    public static final HashMap d;
    public static final b e;

    static {
        c.d = new HashMap();
        c.e = new b(0);
    }

    public c(Executor executor0, n n0) {
        this.a = executor0;
        this.b = n0;
        this.c = null;
    }

    public static Object a(h h0, TimeUnit timeUnit0) {
        d d0 = new d(20);
        h0.c(c.e, d0);
        h0.b(c.e, d0);
        h0.a(c.e, d0);
        if(!((CountDownLatch)d0.Y).await(5L, timeUnit0)) {
            throw new TimeoutException("Task await timed out.");
        }
        if(!h0.h()) {
            throw new ExecutionException(h0.e());
        }
        return h0.f();
    }

    public final h b() {
        synchronized(this) {
            if(this.c == null || this.c.g() && !this.c.h()) {
                Objects.requireNonNull(this.b);
                S2.d d0 = new S2.d(2, this.b);
                this.c = k.c(this.a, d0);
            }
            return this.c;
        }
    }

    public final e c() {
        synchronized(this) {
            if(this.c != null && this.c.h()) {
                return (e)this.c.f();
            }
        }
        try {
            return (e)c.a(this.b(), TimeUnit.SECONDS);
        }
        catch(InterruptedException | ExecutionException | TimeoutException interruptedException0) {
            Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", interruptedException0);
            return null;
        }
    }

    public static c d(Executor executor0, n n0) {
        synchronized(c.class) {
            String s = n0.b;
            HashMap hashMap0 = c.d;
            if(!hashMap0.containsKey(s)) {
                hashMap0.put(s, new c(executor0, n0));
            }
            return (c)hashMap0.get(s);
        }
    }
}

