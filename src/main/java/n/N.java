package n;

import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem;

public final class n implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener a;
    public final p b;

    public n(p p0, MenuItem.OnActionExpandListener menuItem$OnActionExpandListener0) {
        this.b = p0;
        this.a = menuItem$OnActionExpandListener0;
    }

    @Override  // android.view.MenuItem$OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem0) {
        MenuItem menuItem1 = this.b.j(menuItem0);
        return this.a.onMenuItemActionCollapse(menuItem1);
    }

    @Override  // android.view.MenuItem$OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem0) {
        MenuItem menuItem1 = this.b.j(menuItem0);
        return this.a.onMenuItemActionExpand(menuItem1);
    }
}

