package o;

import androidx.appcompat.view.menu.ActionMenuItemView.PopupCallback;
import androidx.appcompat.widget.ActionMenuPresenter;
import n.q;

public final class f extends PopupCallback {
    public final ActionMenuPresenter a;

    public f(ActionMenuPresenter actionMenuPresenter0) {
        this.a = actionMenuPresenter0;
    }

    @Override  // androidx.appcompat.view.menu.ActionMenuItemView$PopupCallback
    public final q a() {
        e e0 = this.a.r0;
        return e0 == null ? null : e0.a();
    }
}

