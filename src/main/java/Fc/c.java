package fc;

import C3.m;
import N6.k;
import dc.r;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public final class c implements Closeable, Executor {
    public final int X;
    public final int Y;
    public final long Z;
    private volatile int _isTerminated$volatile;
    public final String b0;
    public final f c0;
    private volatile long controlState$volatile;
    public final f d0;
    public final r e0;
    public static final AtomicLongFieldUpdater f0;
    public static final AtomicLongFieldUpdater g0;
    public static final AtomicIntegerFieldUpdater h0;
    public static final k i0;
    private volatile long parkedWorkersStack$volatile;

    static {
    }

    public c(int v, int v1, long v2, String s) {
    }

    public final int a() {
    }

    public final void b(Runnable runnable0, m m0, boolean z) {
    }

    @Override
    public final void close() {
    }

    @Override
    public final void execute(Runnable runnable0) {
    }

    public static void f(c c0, Runnable runnable0, boolean z, int v) {
    }

    public final void h(a a0, int v, int v1) {
    }

    public final boolean l(long v) {
    }

    public final boolean q() {
    }

    @Override
    public final String toString() {
    }
}

