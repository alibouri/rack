package c2;

import I1.a;
import J1.j;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import c.L;
import c.N;
import f.h;
import f.i;
import v1.x;
import v1.y;
import v2.d;
import w1.f;
import w1.g;

public final class w extends B implements j, ViewModelStoreOwner, SavedStateRegistryOwner, N, Q, i, x, y, f, g {
    public final c2.x c0;

    public w(c2.x x0) {
        this.c0 = x0;
        super(x0);
    }

    @Override  // androidx.lifecycle.LifecycleOwner
    public final Lifecycle a() {
        return this.c0.t0;
    }

    @Override  // v1.x
    public final void b(E e0) {
        this.c0.b(e0);
    }

    @Override  // c.N
    public final L c() {
        return this.c0.c();
    }

    @Override  // androidx.savedstate.SavedStateRegistryOwner
    public final d d() {
        return this.c0.b0.b;
    }

    @Override  // w1.g
    public final void e(E e0) {
        this.c0.e(e0);
    }

    @Override  // w1.g
    public final void f(E e0) {
        this.c0.f(e0);
    }

    @Override  // v1.x
    public final void g(E e0) {
        this.c0.g(e0);
    }

    @Override  // c2.Q
    public final void h() {
    }

    @Override  // w1.f
    public final void i(a a0) {
        this.c0.i(a0);
    }

    @Override  // w1.f
    public final void j(E e0) {
        this.c0.j(e0);
    }

    @Override  // c2.z
    public final View k(int v) {
        return this.c0.findViewById(v);
    }

    @Override  // c2.z
    public final boolean l() {
        Window window0 = this.c0.getWindow();
        return window0 != null && window0.peekDecorView() != null;
    }

    @Override  // f.i
    public final h m() {
        return this.c0.g0;
    }

    @Override  // v1.y
    public final void n(E e0) {
        this.c0.n(e0);
    }

    @Override  // J1.j
    public final void o(F f0) {
        this.c0.o(f0);
    }

    @Override  // J1.j
    public final void p(F f0) {
        this.c0.p(f0);
    }

    @Override  // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore q() {
        return this.c0.q();
    }

    @Override  // v1.y
    public final void r(E e0) {
        this.c0.r(e0);
    }
}

