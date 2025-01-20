package t1;

import android.view.ViewTreeObserver.OnPreDrawListener;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public final class b implements ViewTreeObserver.OnPreDrawListener {
    public final CoordinatorLayout X;

    public b(CoordinatorLayout coordinatorLayout0) {
        this.X = coordinatorLayout0;
    }

    @Override  // android.view.ViewTreeObserver$OnPreDrawListener
    public final boolean onPreDraw() {
        this.X.p(0);
        return true;
    }
}

