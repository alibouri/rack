package i;

import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ContentFrameLayout.OnAttachListener;
import n.j;
import o.V;

public final class q implements OnAttachListener {
    public final B a;

    public q(B b0) {
        this.a = b0;
    }

    @Override  // androidx.appcompat.widget.ContentFrameLayout$OnAttachListener
    public final void onDetachedFromWindow() {
        B b0 = this.a;
        V v0 = b0.p0;
        if(v0 != null) {
            ((ActionBarOverlayLayout)v0).k();
            ((ActionBarOverlayLayout)v0).f0.b();
        }
        if(b0.u0 != null) {
            b0.j0.getDecorView().removeCallbacks(b0.v0);
            if(b0.u0.isShowing()) {
                try {
                    b0.u0.dismiss();
                }
                catch(IllegalArgumentException unused_ex) {
                }
            }
            b0.u0 = null;
        }
        J1.V v1 = b0.w0;
        if(v1 != null) {
            v1.b();
        }
        j j0 = b0.A(0).h;
        if(j0 != null) {
            j0.c(true);
        }
    }
}

