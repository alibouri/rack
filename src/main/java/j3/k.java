package j3;

import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.ViewTreeObserver;
import com.apollographql.apollo.api.b;

public final class k implements ViewTreeObserver.OnPreDrawListener {
    public boolean X;
    public final f Y;
    public final ViewTreeObserver Z;
    public final Xb.k b0;

    public k(f f0, ViewTreeObserver viewTreeObserver0, Xb.k k0) {
        this.Y = f0;
        this.Z = viewTreeObserver0;
        this.b0 = k0;
    }

    @Override  // android.view.ViewTreeObserver$OnPreDrawListener
    public final boolean onPreDraw() {
        f f0 = this.Y;
        h h0 = b.e(f0);
        if(h0 != null) {
            ViewTreeObserver viewTreeObserver0 = this.Z;
            if(viewTreeObserver0.isAlive()) {
                viewTreeObserver0.removeOnPreDrawListener(this);
            }
            else {
                f0.X.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            if(!this.X) {
                this.X = true;
                this.b0.i(h0);
            }
        }
        return true;
    }
}

