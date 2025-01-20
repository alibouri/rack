package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.MenuItemHoverListener;
import n.h;
import n.j;

public final class r0 extends f0 {
    public final int n0;
    public final int o0;
    public MenuItemHoverListener p0;
    public MenuItemImpl q0;

    public r0(Context context0, boolean z) {
        super(context0, z);
        if(1 == context0.getResources().getConfiguration().getLayoutDirection()) {
            this.n0 = 21;
            this.o0 = 22;
            return;
        }
        this.n0 = 22;
        this.o0 = 21;
    }

    @Override  // o.f0
    public final boolean onHoverEvent(MotionEvent motionEvent0) {
        MenuItemImpl menuItemImpl0;
        h h0;
        int v;
        if(this.p0 != null) {
            ListAdapter listAdapter0 = this.getAdapter();
            if(listAdapter0 instanceof HeaderViewListAdapter) {
                v = ((HeaderViewListAdapter)listAdapter0).getHeadersCount();
                h0 = (h)((HeaderViewListAdapter)listAdapter0).getWrappedAdapter();
            }
            else {
                h0 = (h)listAdapter0;
                v = 0;
            }
            if(motionEvent0.getAction() == 10) {
                menuItemImpl0 = null;
            }
            else {
                int v1 = this.pointToPosition(((int)motionEvent0.getX()), ((int)motionEvent0.getY()));
                if(v1 == -1) {
                    menuItemImpl0 = null;
                }
                else {
                    int v2 = v1 - v;
                    menuItemImpl0 = v2 < 0 || v2 >= h0.getCount() ? null : h0.b(v2);
                }
            }
            MenuItemImpl menuItemImpl1 = this.q0;
            if(menuItemImpl1 != menuItemImpl0) {
                j j0 = h0.X;
                if(menuItemImpl1 != null) {
                    this.p0.o(j0, menuItemImpl1);
                }
                this.q0 = menuItemImpl0;
                if(menuItemImpl0 != null) {
                    this.p0.v(j0, menuItemImpl0);
                }
            }
        }
        return super.onHoverEvent(motionEvent0);
    }

    @Override  // android.widget.ListView
    public final boolean onKeyDown(int v, KeyEvent keyEvent0) {
        ListMenuItemView listMenuItemView0 = (ListMenuItemView)this.getSelectedView();
        if(listMenuItemView0 != null && v == this.n0) {
            if(listMenuItemView0.isEnabled() && listMenuItemView0.getItemData().hasSubMenu()) {
                this.performItemClick(listMenuItemView0, this.getSelectedItemPosition(), this.getSelectedItemId());
            }
            return true;
        }
        if(listMenuItemView0 != null && v == this.o0) {
            this.setSelection(-1);
            ListAdapter listAdapter0 = this.getAdapter();
            (listAdapter0 instanceof HeaderViewListAdapter ? ((h)((HeaderViewListAdapter)listAdapter0).getWrappedAdapter()) : ((h)listAdapter0)).X.c(false);
            return true;
        }
        return super.onKeyDown(v, keyEvent0);
    }

    public void setHoverListener(MenuItemHoverListener menuItemHoverListener0) {
        this.p0 = menuItemHoverListener0;
    }

    @Override  // o.f0
    public void setSelector(Drawable drawable0) {
        super.setSelector(drawable0);
    }
}

