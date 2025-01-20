package i3;

import Nb.j;
import Xb.I0;
import android.os.Looper;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import k3.a;

public final class t implements View.OnAttachStateChangeListener {
    public k X;
    public I0 Y;
    public r Z;
    public boolean b0;

    public final k a() {
        synchronized(this) {
            k k0 = this.X;
            if(k0 != null && j.a(Looper.myLooper(), Looper.getMainLooper()) && this.b0) {
                this.b0 = false;
                return k0;
            }
            I0 i00 = this.Y;
            if(i00 != null) {
                i00.f(null);
            }
            this.Y = null;
            k k1 = new k(2);
            this.X = k1;
            return k1;
        }
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view0) {
        r r0 = this.Z;
        if(r0 == null) {
            return;
        }
        this.b0 = true;
        r0.X.b(r0.Y);
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view0) {
        r r0 = this.Z;
        if(r0 != null) {
            r0.c0.f(null);
            a a0 = r0.Z;
            Lifecycle lifecycle0 = r0.b0;
            if(a0 instanceof LifecycleObserver) {
                lifecycle0.c(a0);
            }
            lifecycle0.c(r0);
        }
    }
}

