package n;

import android.view.ActionProvider.VisibilityListener;
import android.view.ActionProvider;
import androidx.appcompat.view.menu.MenuItemImpl;
import g3.b;

public final class l implements ActionProvider.VisibilityListener {
    public b a;
    public final ActionProvider b;
    public final p c;

    public l(p p0, ActionProvider actionProvider0) {
        this.c = p0;
        this.b = actionProvider0;
    }

    @Override  // android.view.ActionProvider$VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        b b0 = this.a;
        if(b0 != null) {
            ((MenuItemImpl)b0.Y).n.h = true;
            ((MenuItemImpl)b0.Y).n.p(true);
        }
    }
}

