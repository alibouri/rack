package n7;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class f implements ScheduledExecutorService {
    public final ExecutorService X;
    public final ScheduledExecutorService Y;

    public f(ExecutorService executorService0, ScheduledExecutorService scheduledExecutorService0) {
        this.X = executorService0;
        this.Y = scheduledExecutorService0;
    }

    @Override
    public final boolean awaitTermination(long v, TimeUnit timeUnit0) {
        return this.X.awaitTermination(v, timeUnit0);
    }

    @Override
    public final void execute(Runnable runnable0) {
        this.X.execute(runnable0);
    }

    @Override
    public final List invokeAll(Collection collection0) {
        return this.X.invokeAll(collection0);
    }

    @Override
    public final List invokeAll(Collection collection0, long v, TimeUnit timeUnit0) {
        return this.X.invokeAll(collection0, v, timeUnit0);
    }

    @Override
    public final Object invokeAny(Collection collection0) {
        return this.X.invokeAny(collection0);
    }

    @Override
    public final Object invokeAny(Collection collection0, long v, TimeUnit timeUnit0) {
        return this.X.invokeAny(collection0, v, timeUnit0);
    }

    @Override
    public final boolean isShutdown() {
        return this.X.isShutdown();
    }

    @Override
    public final boolean isTerminated() {
        return this.X.isTerminated();
    }

    @Override
    public final ScheduledFuture schedule(Runnable runnable0, long v, TimeUnit timeUnit0) {
        return new h(new b(this, runnable0, v, timeUnit0, 0));
    }

    @Override
    public final ScheduledFuture schedule(Callable callable0, long v, TimeUnit timeUnit0) {
        return new h(new b(this, callable0, v, timeUnit0, 1));
    }

    @Override
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable0, long v, long v1, TimeUnit timeUnit0) {
        return new h(new d(this, runnable0, v, v1, timeUnit0, 0));
    }

    @Override
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable0, long v, long v1, TimeUnit timeUnit0) {
        return new h(new d(this, runnable0, v, v1, timeUnit0, 1));
    }

    @Override
    public final void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override
    public final List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override
    public final Future submit(Runnable runnable0) {
        return this.X.submit(runnable0);
    }

    @Override
    public final Future submit(Runnable runnable0, Object object0) {
        return this.X.submit(runnable0, object0);
    }

    @Override
    public final Future submit(Callable callable0) {
        return this.X.submit(callable0);
    }
}

