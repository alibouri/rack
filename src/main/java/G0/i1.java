package G0;

import U.q;
import U.s;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.e;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import c0.b;
import kotlin.jvm.functions.Function2;

public final class i1 implements q, LifecycleEventObserver {
    public final AndroidComposeView X;
    public final s Y;
    public boolean Z;
    public Lifecycle b0;
    public b c0;

    public i1(AndroidComposeView androidComposeView0, s s0) {
        this.X = androidComposeView0;
        this.Y = s0;
        this.c0 = d0.a;
    }

    public final void a() {
        if(!this.Z) {
            this.Z = true;
            this.X.setTag(0x7F0A0332, null);  // id:wrapped_composition_tag
            Lifecycle lifecycle0 = this.b0;
            if(lifecycle0 != null) {
                lifecycle0.c(this);
            }
        }
        this.Y.l();
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public final void b(LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) {
        if(lifecycle$Event0 == Event.ON_DESTROY) {
            this.a();
            return;
        }
        if(lifecycle$Event0 == Event.ON_CREATE && !this.Z) {
            this.c(this.c0);
        }
    }

    public final void c(Function2 function20) {
        e e0 = new e(this, ((b)function20));
        this.X.setOnViewTreeOwnersAvailable(e0);
    }
}

