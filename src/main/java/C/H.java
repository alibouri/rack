package c;

import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import c2.x;

public final class h implements LifecycleEventObserver {
    public final x X;

    public h(x x0) {
        this.X = x0;
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public final void b(LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) {
        x x0 = this.X;
        if(x0.c0 == null) {
            j j0 = (j)x0.getLastNonConfigurationInstance();
            if(j0 != null) {
                x0.c0 = j0.a;
            }
            if(x0.c0 == null) {
                x0.c0 = new ViewModelStore();
            }
        }
        x0.X.c(this);
    }
}

