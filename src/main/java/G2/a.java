package g2;

import I5.c;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

public final class a extends MutableLiveData {
    public final c l;
    public LifecycleOwner m;
    public b n;

    public a(c c0) {
        this.l = c0;
        if(c0.a != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        c0.a = this;
    }

    @Override  // androidx.lifecycle.LiveData
    public final void f() {
        this.l.b = true;
        this.l.d = false;
        this.l.c = false;
        this.l.i.drainPermits();
        this.l.c();
    }

    @Override  // androidx.lifecycle.LiveData
    public final void g() {
        this.l.b = false;
    }

    @Override  // androidx.lifecycle.LiveData
    public final void i(Observer observer0) {
        super.i(observer0);
        this.m = null;
        this.n = null;
    }

    public final void k() {
        LifecycleOwner lifecycleOwner0 = this.m;
        b b0 = this.n;
        if(lifecycleOwner0 != null && b0 != null) {
            super.i(b0);
            this.d(lifecycleOwner0, b0);
        }
    }

    @Override
    public final String toString() {
        Class class0 = this.l.getClass();
        return "LoaderInfo{" + Integer.toHexString(System.identityHashCode(this)) + " #0 : " + class0.getSimpleName() + "{" + Integer.toHexString(System.identityHashCode(class0)) + "}}";
    }
}

