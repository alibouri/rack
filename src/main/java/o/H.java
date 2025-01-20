package o;

import androidx.appcompat.widget.ActionMenuPresenter;
import n.y;

public final class h extends h0 {
    public final i h0;

    public h(i i0, i i1) {
        this.h0 = i0;
        super(i1);
    }

    @Override  // o.h0
    public final y b() {
        e e0 = this.h0.e0.q0;
        return e0 == null ? null : e0.a();
    }

    @Override  // o.h0
    public final boolean c() {
        this.h0.e0.l();
        return true;
    }

    @Override  // o.h0
    public final boolean d() {
        ActionMenuPresenter actionMenuPresenter0 = this.h0.e0;
        if(actionMenuPresenter0.s0 != null) {
            return false;
        }
        actionMenuPresenter0.e();
        return true;
    }
}

