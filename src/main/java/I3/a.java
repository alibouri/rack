package i3;

import Xb.r0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

public final class a implements o {
    public final Lifecycle X;
    public final r0 Y;

    public a(Lifecycle lifecycle0, r0 r00) {
        this.X = lifecycle0;
        this.Y = r00;
    }

    @Override  // i3.o
    public final void f() {
        this.X.c(this);
    }

    @Override  // i3.o
    public final void h() {
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner0) {
        androidx.lifecycle.a.a(this, lifecycleOwner0);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner0) {
        this.Y.f(null);
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
        this.X.a(this);
    }
}

