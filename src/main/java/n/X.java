package n;

import G0.a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import s.J;

public class x extends a implements Menu {
    public final j c;

    public x(Context context0, j j0) {
        super(context0);
        if(j0 == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.c = j0;
    }

    @Override  // android.view.Menu
    public final MenuItem add(int v) {
        return this.j(this.c.add(v));
    }

    @Override  // android.view.Menu
    public final MenuItem add(int v, int v1, int v2, int v3) {
        return this.j(this.c.add(v, v1, v2, v3));
    }

    @Override  // android.view.Menu
    public final MenuItem add(int v, int v1, int v2, CharSequence charSequence0) {
        return this.j(this.c.a(v, v1, v2, charSequence0));
    }

    @Override  // android.view.Menu
    public final MenuItem add(CharSequence charSequence0) {
        return this.j(this.c.a(0, 0, 0, charSequence0));
    }

    @Override  // android.view.Menu
    public final int addIntentOptions(int v, int v1, int v2, ComponentName componentName0, Intent[] arr_intent, Intent intent0, int v3, MenuItem[] arr_menuItem) {
        MenuItem[] arr_menuItem1 = arr_menuItem == null ? null : new MenuItem[arr_menuItem.length];
        int v4 = this.c.addIntentOptions(v, v1, v2, componentName0, arr_intent, intent0, v3, arr_menuItem1);
        if(arr_menuItem1 != null) {
            for(int v5 = 0; v5 < arr_menuItem1.length; ++v5) {
                arr_menuItem[v5] = this.j(arr_menuItem1[v5]);
            }
        }
        return v4;
    }

    @Override  // android.view.Menu
    public final SubMenu addSubMenu(int v) {
        return this.c.addSubMenu(v);
    }

    @Override  // android.view.Menu
    public final SubMenu addSubMenu(int v, int v1, int v2, int v3) {
        return this.c.addSubMenu(v, v1, v2, v3);
    }

    @Override  // android.view.Menu
    public final SubMenu addSubMenu(int v, int v1, int v2, CharSequence charSequence0) {
        return this.c.addSubMenu(v, v1, v2, charSequence0);
    }

    @Override  // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence0) {
        return this.c.addSubMenu(0, 0, 0, charSequence0);
    }

    @Override  // android.view.Menu
    public final void clear() {
        J j0 = (J)this.b;
        if(j0 != null) {
            j0.clear();
        }
        this.c.clear();
    }

    @Override  // android.view.Menu
    public final void close() {
        this.c.close();
    }

    @Override  // android.view.Menu
    public final MenuItem findItem(int v) {
        return this.j(this.c.findItem(v));
    }

    @Override  // android.view.Menu
    public final MenuItem getItem(int v) {
        return this.j(this.c.getItem(v));
    }

    @Override  // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.c.hasVisibleItems();
    }

    @Override  // android.view.Menu
    public final boolean isShortcutKey(int v, KeyEvent keyEvent0) {
        return this.c.isShortcutKey(v, keyEvent0);
    }

    @Override  // android.view.Menu
    public final boolean performIdentifierAction(int v, int v1) {
        return this.c.performIdentifierAction(v, v1);
    }

    @Override  // android.view.Menu
    public final boolean performShortcut(int v, KeyEvent keyEvent0, int v1) {
        return this.c.performShortcut(v, keyEvent0, v1);
    }

    @Override  // android.view.Menu
    public final void removeGroup(int v) {
        if(((J)this.b) != null) {
            for(int v1 = 0; true; ++v1) {
                J j0 = (J)this.b;
                if(v1 >= j0.Z) {
                    break;
                }
                if(((C1.a)j0.e(v1)).getGroupId() == v) {
                    ((J)this.b).f(v1);
                    --v1;
                }
            }
        }
        this.c.removeGroup(v);
    }

    @Override  // android.view.Menu
    public final void removeItem(int v) {
        if(((J)this.b) != null) {
            for(int v1 = 0; true; ++v1) {
                J j0 = (J)this.b;
                if(v1 >= j0.Z) {
                    break;
                }
                if(((C1.a)j0.e(v1)).getItemId() == v) {
                    ((J)this.b).f(v1);
                    break;
                }
            }
        }
        this.c.removeItem(v);
    }

    @Override  // android.view.Menu
    public final void setGroupCheckable(int v, boolean z, boolean z1) {
        this.c.setGroupCheckable(v, z, z1);
    }

    @Override  // android.view.Menu
    public final void setGroupEnabled(int v, boolean z) {
        this.c.setGroupEnabled(v, z);
    }

    @Override  // android.view.Menu
    public final void setGroupVisible(int v, boolean z) {
        this.c.setGroupVisible(v, z);
    }

    @Override  // android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.c.setQwertyMode(z);
    }

    @Override  // android.view.Menu
    public final int size() {
        return this.c.size();
    }
}

