package f1;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class l implements ListenableFuture {
    public final WeakReference X;
    public final k Y;

    public l(i i0) {
        this.Y = new k(this);
        this.X = new WeakReference(i0);
    }

    @Override  // com.google.common.util.concurrent.ListenableFuture
    public final void a(Runnable runnable0, Executor executor0) {
        this.Y.a(runnable0, executor0);
    }

    @Override
    public final boolean cancel(boolean z) {
        i i0 = (i)this.X.get();
        boolean z1 = this.Y.cancel(z);
        if(z1 && i0 != null) {
            i0.a = null;
            i0.b = null;
            i0.c.j(null);
        }
        return z1;
    }

    @Override
    public final Object get() {
        return this.Y.get();
    }

    @Override
    public final Object get(long v, TimeUnit timeUnit0) {
        return this.Y.get(v, timeUnit0);
    }

    @Override
    public final boolean isCancelled() {
        return this.Y.X instanceof a;
    }

    @Override
    public final boolean isDone() {
        return this.Y.isDone();
    }

    @Override
    public final String toString() {
        return this.Y.toString();
    }
}

