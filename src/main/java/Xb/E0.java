package Xb;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;

public abstract class e0 extends f0 implements O {
    private volatile Object _delayed$volatile;
    private volatile int _isCompleted$volatile;
    private volatile Object _queue$volatile;
    public static final AtomicReferenceFieldUpdater e0;
    public static final AtomicReferenceFieldUpdater f0;
    public static final AtomicIntegerFieldUpdater g0;

    static {
    }

    @Override  // Xb.A
    public final void Y(CoroutineContext coroutineContext0, Runnable runnable0) {
    }

    @Override  // Xb.O
    public X a(long v, Runnable runnable0, CoroutineContext coroutineContext0) {
    }

    @Override  // Xb.f0
    public final long h0() {
    }

    public void k0(Runnable runnable0) {
    }

    public final boolean l0(Runnable runnable0) {
    }

    public final boolean m0() {
    }

    public final void n0(long v, c0 c00) {
    }

    @Override  // Xb.f0
    public void shutdown() {
    }

    @Override  // Xb.O
    public final void z(long v, k k0) {
    }
}

