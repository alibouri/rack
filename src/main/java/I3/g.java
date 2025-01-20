package i3;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;

public final class g extends Lifecycle {
    public static final g b;
    public static final f c;

    static {
        g.b = new g();  // initializer: Landroidx/lifecycle/Lifecycle;-><init>()V
        g.c = new f();  // initializer: Ljava/lang/Object;-><init>()V
    }

    @Override  // androidx.lifecycle.Lifecycle
    public final void a(LifecycleObserver lifecycleObserver0) {
        if(!(lifecycleObserver0 instanceof DefaultLifecycleObserver)) {
            throw new IllegalArgumentException((lifecycleObserver0 + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        ((DefaultLifecycleObserver)lifecycleObserver0).onCreate(g.c);
        ((DefaultLifecycleObserver)lifecycleObserver0).onStart(g.c);
        ((DefaultLifecycleObserver)lifecycleObserver0).onResume(g.c);
    }

    @Override  // androidx.lifecycle.Lifecycle
    public final State b() {
        return State.c0;
    }

    @Override  // androidx.lifecycle.Lifecycle
    public final void c(LifecycleObserver lifecycleObserver0) {
    }

    @Override
    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }
}

