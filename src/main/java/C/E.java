package c;

import Nb.j;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import c2.x;
import v2.d;

public final class e implements LifecycleEventObserver {
    public final int X;
    public final Object Y;

    public e(int v, Object object0) {
        this.X = v;
        this.Y = object0;
        super();
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public final void b(LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) {
        switch(this.X) {
            case 0: {
                x x0 = (x)this.Y;
                if(lifecycle$Event0 == Event.ON_STOP) {
                    Window window0 = x0.getWindow();
                    if(window0 != null) {
                        View view0 = window0.peekDecorView();
                        if(view0 != null) {
                            view0.cancelPendingInputEvents();
                        }
                    }
                }
                return;
            }
            case 1: {
                x x1 = (x)this.Y;
                if(lifecycle$Event0 == Event.ON_DESTROY) {
                    x1.Y.b = null;
                    if(!x1.isChangingConfigurations()) {
                        x1.q().a();
                    }
                    x1.d0.b0.getWindow().getDecorView().removeCallbacks(x1.d0);
                    x1.d0.b0.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(x1.d0);
                }
                return;
            }
            default: {
                d d0 = (d)this.Y;
                j.f(d0, "this$0");
                if(lifecycle$Event0 == Event.ON_START) {
                    d0.f = true;
                    return;
                }
                if(lifecycle$Event0 == Event.ON_STOP) {
                    d0.f = false;
                }
            }
        }
    }
}

