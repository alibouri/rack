package f1;

import com.apollographql.apollo.api.b;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import yc.l;

public abstract class h implements ListenableFuture {
    public volatile Object X;
    public volatile d Y;
    public volatile g Z;
    public static final boolean b0;
    public static final Logger c0;
    public static final l d0;
    public static final Object e0;

    static {
        e e0;
        h.b0 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        h.c0 = Logger.getLogger(h.class.getName());
        try {
            e0 = new e(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, g.class, "Z"), AtomicReferenceFieldUpdater.newUpdater(h.class, d.class, "Y"), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "X"));
            throwable0 = null;
        }
        catch(Throwable throwable0) {
            e0 = new f();  // initializer: Ljava/lang/Object;-><init>()V
        }
        h.d0 = e0;
        if(throwable0 != null) {
            h.c0.log(Level.SEVERE, "SafeAtomicHelper is broken!", throwable0);
        }
        h.e0 = new Object();
    }

    @Override  // com.google.common.util.concurrent.ListenableFuture
    public final void a(Runnable runnable0, Executor executor0) {
        executor0.getClass();
        d d0 = this.Y;
        d d1 = d.d;
        if(d0 != d1) {
            d d2 = new d(runnable0, executor0);
            while(true) {
                d2.c = d0;
                if(h.d0.k(this, d0, d2)) {
                    return;
                }
                d0 = this.Y;
                if(d0 == d1) {
                    break;
                }
            }
        }
        h.e(runnable0, executor0);
    }

    public final void b(StringBuilder stringBuilder0) {
        try {
            Object object0 = h.g(this);
            stringBuilder0.append("SUCCESS, result=[");
            stringBuilder0.append((object0 == this ? "this future" : String.valueOf(object0)));
            stringBuilder0.append("]");
        }
        catch(ExecutionException executionException0) {
            stringBuilder0.append("FAILURE, cause=[");
            stringBuilder0.append(executionException0.getCause());
            stringBuilder0.append("]");
        }
        catch(CancellationException unused_ex) {
            stringBuilder0.append("CANCELLED");
        }
        catch(RuntimeException runtimeException0) {
            stringBuilder0.append("UNKNOWN, cause=[");
            stringBuilder0.append(runtimeException0.getClass());
            stringBuilder0.append(" thrown from get()]");
        }
    }

    public void c() {
    }

    @Override
    public final boolean cancel(boolean z) {
        a a0;
        if(this.X == null) {
            if(h.b0) {
                a0 = new a(z, new CancellationException("Future.cancel() was called."));
            }
            else {
                a0 = z ? a.c : a.d;
            }
            if(h.d0.l(this, null, a0)) {
                h.d(this);
                return true;
            }
        }
        return false;
    }

    public static void d(h h0) {
        d d2;
        d d1;
        d d0;
        g g0;
        do {
            g0 = h0.Z;
        }
        while(!h.d0.m(h0, g0, g.c));
        while(true) {
            d0 = null;
            if(g0 == null) {
                break;
            }
            Thread thread0 = g0.a;
            if(thread0 != null) {
                g0.a = null;
                LockSupport.unpark(thread0);
            }
            g0 = g0.b;
        }
        h0.c();
        do {
            d1 = h0.Y;
        }
        while(!h.d0.k(h0, d1, d.d));
        while(true) {
            d2 = d0;
            d0 = d1;
            if(d0 == null) {
                break;
            }
            d1 = d0.c;
            d0.c = d2;
        }
        while(d2 != null) {
            d d3 = d2.c;
            h.e(d2.a, d2.b);
            d2 = d3;
        }
    }

    public static void e(Runnable runnable0, Executor executor0) {
        try {
            executor0.execute(runnable0);
        }
        catch(RuntimeException runtimeException0) {
            h.c0.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable0 + " with executor " + executor0, runtimeException0);
        }
    }

    public static Object f(Object object0) {
        if(!(object0 instanceof a)) {
            if(object0 instanceof c) {
                throw new ExecutionException(((c)object0).a);
            }
            return object0 == h.e0 ? null : object0;
        }
        CancellationException cancellationException0 = new CancellationException("Task was cancelled.");
        cancellationException0.initCause(((a)object0).b);
        throw cancellationException0;
    }

    public static Object g(Future future0) {
        Object object0;
        boolean z = false;
        while(true) {
            try {
                object0 = future0.get();
                break;
            }
            catch(InterruptedException unused_ex) {
                z = true;
            }
            catch(Throwable throwable0) {
                if(z) {
                    Thread.currentThread().interrupt();
                }
                throw throwable0;
            }
        }
        if(z) {
            Thread.currentThread().interrupt();
        }
        return object0;
    }

    @Override
    public final Object get() {
        if(Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object object0 = this.X;
        if(object0 != null) {
            return h.f(object0);
        }
        g g0 = this.Z;
        g g1 = g.c;
        if(g0 != g1) {
            g g2 = new g();
            while(true) {
                h.d0.A(g2, g0);
                if(h.d0.m(this, g0, g2)) {
                    while(true) {
                        LockSupport.park(this);
                        if(Thread.interrupted()) {
                            break;
                        }
                        Object object1 = this.X;
                        if(object1 != null) {
                            return h.f(object1);
                        }
                    }
                    this.i(g2);
                    throw new InterruptedException();
                }
                g0 = this.Z;
                if(g0 == g1) {
                    break;
                }
            }
        }
        return h.f(this.X);
    }

    @Override
    public final Object get(long v, TimeUnit timeUnit0) {
        long v1 = timeUnit0.toNanos(v);
        if(Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object object0 = this.X;
        if(object0 != null) {
            return h.f(object0);
        }
        long v2 = v1 <= 0L ? 0L : System.nanoTime() + v1;
        if(v1 >= 1000L) {
            g g0 = this.Z;
            g g1 = g.c;
            if(g0 != g1) {
                g g2 = new g();
                while(true) {
                    h.d0.A(g2, g0);
                    if(h.d0.m(this, g0, g2)) {
                        do {
                            LockSupport.parkNanos(this, v1);
                            if(Thread.interrupted()) {
                                this.i(g2);
                                throw new InterruptedException();
                            }
                            Object object1 = this.X;
                            if(object1 != null) {
                                return h.f(object1);
                            }
                            v1 = v2 - System.nanoTime();
                        }
                        while(v1 >= 1000L);
                        this.i(g2);
                        goto label_27;
                    }
                    g0 = this.Z;
                    if(g0 == g1) {
                        break;
                    }
                }
            }
            return h.f(this.X);
        }
    label_27:
        while(v1 > 0L) {
            Object object2 = this.X;
            if(object2 != null) {
                return h.f(object2);
            }
            if(Thread.interrupted()) {
                throw new InterruptedException();
            }
            v1 = v2 - System.nanoTime();
        }
        String s = this.toString();
        String s1 = timeUnit0.toString().toLowerCase(Locale.ROOT);
        String s2 = "Waited " + v + " " + timeUnit0.toString().toLowerCase(Locale.ROOT);
        if(v1 + 1000L < 0L) {
            String s3 = s2 + " (plus ";
            long v3 = timeUnit0.convert(-v1, TimeUnit.NANOSECONDS);
            long v4 = -v1 - timeUnit0.toNanos(v3);
            int v5 = Long.compare(v3, 0L);
            boolean z = v5 == 0 || v4 > 1000L;
            if(v5 > 0) {
                s3 = (z ? s3 + v3 + " " + s1 + "," : s3 + v3 + " " + s1) + " ";
            }
            if(z) {
                s3 = s3 + v4 + " nanoseconds ";
            }
            s2 = s3 + "delay)";
        }
        throw this.isDone() ? new TimeoutException(s2 + " but future completed as timeout expired") : new TimeoutException(b.q(s2, " for ", s));
    }

    // Deobfuscation rating: LOW(20)
    public String h() {
        return this instanceof ScheduledFuture ? "remaining delay=[" + ((ScheduledFuture)this).getDelay(TimeUnit.MILLISECONDS) + " ms]" : null;
    }

    public final void i(g g0) {
        g0.a = null;
    alab1:
        while(true) {
            g g1 = this.Z;
            if(g1 == g.c) {
                return;
            }
            g g2 = null;
            while(true) {
                if(g1 == null) {
                    break alab1;
                }
                g g3 = g1.b;
                if(g1.a != null) {
                    g2 = g1;
                }
                else if(g2 == null) {
                    if(h.d0.m(this, g1, g3)) {
                        g1 = g3;
                        continue;
                    }
                    break;
                }
                else {
                    g2.b = g3;
                    if(g2.a == null) {
                        break;
                    }
                }
                g1 = g3;
            }
        }
    }

    @Override
    public final boolean isCancelled() {
        return this.X instanceof a;
    }

    @Override
    public final boolean isDone() {
        return this.X != null;
    }

    public boolean j(Object object0) {
        if(object0 == null) {
            object0 = h.e0;
        }
        if(h.d0.l(this, null, object0)) {
            h.d(this);
            return true;
        }
        return false;
    }

    public boolean k(Throwable throwable0) {
        c c0 = new c(throwable0);
        if(h.d0.l(this, null, c0)) {
            h.d(this);
            return true;
        }
        return false;
    }

    @Override
    public final String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(super.toString());
        stringBuilder0.append("[status=");
        if(this.X instanceof a) {
            stringBuilder0.append("CANCELLED");
        }
        else if(this.isDone()) {
            this.b(stringBuilder0);
        }
        else {
            try {
                s = this.h();
            }
            catch(RuntimeException runtimeException0) {
                s = "Exception thrown from implementation: " + runtimeException0.getClass();
            }
            if(s != null && !s.isEmpty()) {
                stringBuilder0.append("PENDING, info=[");
                stringBuilder0.append(s);
                stringBuilder0.append("]");
            }
            else if(this.isDone()) {
                this.b(stringBuilder0);
            }
            else {
                stringBuilder0.append("PENDING");
            }
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }
}

