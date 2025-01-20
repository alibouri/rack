package c2;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

public final class r implements LifecycleEventObserver {
    public final Fragment X;

    public r(Fragment fragment0) {
        this.X = fragment0;
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public final void b(LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) {
        if(lifecycle$Event0 == Event.ON_STOP) {
            View view0 = this.X.F0;
            if(view0 != null) {
                view0.cancelPendingInputEvents();
            }
        }
    }
}

