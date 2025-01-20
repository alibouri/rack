package i3;

import Xb.I0;
import Xb.J;
import Xb.i0;
import Xb.r0;
import Y2.m;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.concurrent.CancellationException;
import k3.a;
import m3.g;

public final class r implements o {
    public final m X;
    public final i Y;
    public final a Z;
    public final Lifecycle b0;
    public final r0 c0;

    public r(m m0, i i0, a a0, Lifecycle lifecycle0, r0 r00) {
        this.X = m0;
        this.Y = i0;
        this.Z = a0;
        this.b0 = lifecycle0;
        this.c0 = r00;
    }

    @Override  // i3.o
    public final void f() {
    }

    @Override  // i3.o
    public final void h() {
        a a0 = this.Z;
        if(a0.Y.isAttachedToWindow()) {
            return;
        }
        t t0 = g.c(a0.Y);
        r r0 = t0.Z;
        if(r0 != null) {
            r0.c0.f(null);
            a a1 = r0.Z;
            Lifecycle lifecycle0 = r0.b0;
            if(a1 instanceof LifecycleObserver) {
                lifecycle0.c(a1);
            }
            lifecycle0.c(r0);
        }
        t0.Z = this;
        throw new CancellationException("\'ViewTarget.view\' must be attached to a window.");
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner0) {
        androidx.lifecycle.a.a(this, lifecycleOwner0);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner0) {
        t t0 = g.c(this.Z.Y);
        synchronized(t0) {
            I0 i00 = t0.Y;
            if(i00 != null) {
                i00.f(null);
            }
            s s0 = new s(t0, null);
            t0.Y = J.q(i0.X, dc.o.a.d0, null, s0, 2);
            t0.X = null;
        }
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner0) {
        androidx.lifecycle.a.c(this, lifecycleOwner0);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner0) {
        androidx.lifecycle.a.d(this, lifecycleOwner0);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner0) {
        androidx.lifecycle.a.e(this, lifecycleOwner0);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner0) {
        androidx.lifecycle.a.f(this, lifecycleOwner0);
    }

    @Override  // i3.o
    public final void start() {
        Lifecycle lifecycle0 = this.b0;
        lifecycle0.a(this);
        a a0 = this.Z;
        if(a0 instanceof LifecycleObserver) {
            lifecycle0.c(a0);
            lifecycle0.a(a0);
        }
        t t0 = g.c(a0.Y);
        r r0 = t0.Z;
        if(r0 != null) {
            r0.c0.f(null);
            a a1 = r0.Z;
            Lifecycle lifecycle1 = r0.b0;
            if(a1 instanceof LifecycleObserver) {
                lifecycle1.c(a1);
            }
            lifecycle1.c(r0);
        }
        t0.Z = this;
    }
}

