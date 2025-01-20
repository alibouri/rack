package n;

import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;

public final class o implements MenuItem.OnMenuItemClickListener {
    public final MenuItem.OnMenuItemClickListener a;
    public final p b;

    public o(p p0, MenuItem.OnMenuItemClickListener menuItem$OnMenuItemClickListener0) {
        this.b = p0;
        this.a = menuItem$OnMenuItemClickListener0;
    }

    @Override  // android.view.MenuItem$OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem0) {
        MenuItem menuItem1 = this.b.j(menuItem0);
        return this.a.onMenuItemClick(menuItem1);
    }
}

