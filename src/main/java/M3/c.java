package m3;

import Ab.t;
import C3.i;
import Nb.j;
import Xb.k;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.a;

public final class c implements DefaultLifecycleObserver {
    public final int X;
    public final Object Y;

    public c(int v, Object object0) {
        this.X = v;
        this.Y = object0;
        super();
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner0) {
        a.a(this, lifecycleOwner0);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner0) {
        if(this.X != 0) {
            j.f(lifecycleOwner0, "owner");
            ((i.j)((i)this.Y).X).unregisterReceiver(((a5.c)((i)this.Y).c0));
            return;
        }
        a.b(this, lifecycleOwner0);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner0) {
        a.c(this, lifecycleOwner0);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner0) {
        a.d(this, lifecycleOwner0);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner0) {
        if(this.X != 0) {
            a.e(this, lifecycleOwner0);
            return;
        }
        ((k)this.Y).i(t.a);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner0) {
        a.f(this, lifecycleOwner0);
    }
}

