package o6;

import N5.r;
import U.h0;
import g.a;
import j6.z0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class k {
    public static Object a(h h0) {
        r.i("Must not be called on the main application thread");
        r.h();
        r.k(h0, "Task must not be null");
        if(h0.g()) {
            return k.g(h0);
        }
        a a0 = new a(18, 0);
        h0.c(j.b, a0);
        h0.b(j.b, a0);
        h0.a(j.b, a0);
        ((CountDownLatch)a0.Y).await();
        return k.g(h0);
    }

    public static Object b(p p0, long v, TimeUnit timeUnit0) {
        r.i("Must not be called on the main application thread");
        r.h();
        r.k(p0, "Task must not be null");
        r.k(timeUnit0, "TimeUnit must not be null");
        if(p0.g()) {
            return k.g(p0);
        }
        a a0 = new a(18, 0);
        p0.c(j.b, a0);
        p0.b(j.b, a0);
        p0.a(j.b, a0);
        if(!((CountDownLatch)a0.Y).await(v, timeUnit0)) {
            throw new TimeoutException("Timed out waiting for Task");
        }
        return k.g(p0);
    }

    public static p c(Executor executor0, Callable callable0) {
        r.k(executor0, "Executor must not be null");
        p p0 = new p();
        executor0.execute(new z0(p0, 17, callable0));
        return p0;
    }

    public static p d(Exception exception0) {
        p p0 = new p();
        p0.n(exception0);
        return p0;
    }

    public static p e(Object object0) {
        p p0 = new p();
        p0.o(object0);
        return p0;
    }

    public static p f(h[] arr_h) {
        if(arr_h.length == 0) {
            return k.e(Collections.emptyList());
        }
        List list0 = Arrays.asList(arr_h);
        M5.p p0 = j.a;
        if(list0 != null && !list0.isEmpty()) {
            if(list0.isEmpty()) {
                return k.e(null).d(p0, new h0(list0));
            }
            for(Object object0: list0) {
                if(((h)object0) == null) {
                    throw new NullPointerException("null tasks are not accepted");
                }
                if(false) {
                    break;
                }
            }
            p p1 = new p();
            l l0 = new l(list0.size(), p1);
            for(Object object1: list0) {
                ((h)object1).c(j.b, l0);
                ((h)object1).b(j.b, l0);
                ((h)object1).a(j.b, l0);
            }
            return p1.d(p0, new h0(list0));
        }
        return k.e(Collections.emptyList());
    }

    public static Object g(h h0) {
        if(h0.h()) {
            return h0.f();
        }
        if(!((p)h0).d) {
            throw new ExecutionException(h0.e());
        }
        throw new CancellationException("Task is already canceled");
    }
}

