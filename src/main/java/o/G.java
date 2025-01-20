package o;

import android.view.View;
import androidx.appcompat.widget.ActionMenuPresenter;
import n.i;
import n.j;

public final class g implements Runnable {
    public final e X;
    public final ActionMenuPresenter Y;

    public g(ActionMenuPresenter actionMenuPresenter0, e e0) {
        this.Y = actionMenuPresenter0;
        this.X = e0;
    }

    @Override
    public final void run() {
        ActionMenuPresenter actionMenuPresenter0 = this.Y;
        j j0 = actionMenuPresenter0.Z;
        if(j0 != null) {
            i i0 = j0.e;
            if(i0 != null) {
                i0.m(j0);
            }
        }
        View view0 = (View)actionMenuPresenter0.f0;
        if(view0 != null && view0.getWindowToken() != null) {
            e e0 = this.X;
            if(e0.b()) {
                actionMenuPresenter0.q0 = e0;
            }
            else if(e0.e != null) {
                e0.d(0, 0, false, false);
                actionMenuPresenter0.q0 = e0;
            }
        }
        actionMenuPresenter0.s0 = null;
    }
}

