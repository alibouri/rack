package o;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.ActionMenuPresenter;
import i.J;
import n.A;
import n.j;
import n.q;
import n.s;

public final class e extends s {
    public final int l;
    public final ActionMenuPresenter m;

    public e(ActionMenuPresenter actionMenuPresenter0, Context context0, A a0, View view0) {
        this.l = 0;
        this.m = actionMenuPresenter0;
        super(0x7F040022, context0, view0, a0, false);  // attr:actionOverflowMenuStyle
        if(!a0.A.f()) {
            View view1 = actionMenuPresenter0.g0;
            if(view1 == null) {
                view1 = (View)actionMenuPresenter0.f0;
            }
            this.e = view1;
        }
        J j0 = actionMenuPresenter0.u0;
        this.h = j0;
        q q0 = this.i;
        if(q0 != null) {
            q0.j(j0);
        }
    }

    public e(ActionMenuPresenter actionMenuPresenter0, Context context0, j j0, View view0) {
        this.l = 1;
        this.m = actionMenuPresenter0;
        super(0x7F040022, context0, view0, j0, true);  // attr:actionOverflowMenuStyle
        this.f = 0x800005;
        J j1 = actionMenuPresenter0.u0;
        this.h = j1;
        q q0 = this.i;
        if(q0 != null) {
            q0.j(j1);
        }
    }

    @Override  // n.s
    public final void c() {
        if(this.l != 0) {
            ActionMenuPresenter actionMenuPresenter0 = this.m;
            j j0 = actionMenuPresenter0.Z;
            if(j0 != null) {
                j0.c(true);
            }
            actionMenuPresenter0.q0 = null;
            super.c();
            return;
        }
        this.m.r0 = null;
        this.m.getClass();
        super.c();
    }
}

