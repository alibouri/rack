package n;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.MenuItemImpl;
import java.util.ArrayList;

public final class f extends BaseAdapter {
    public int X;
    public final g Y;

    public f(g g0) {
        this.Y = g0;
        super();
        this.X = -1;
        this.a();
    }

    public final void a() {
        j j0 = this.Y.Z;
        MenuItemImpl menuItemImpl0 = j0.v;
        if(menuItemImpl0 != null) {
            j0.i();
            ArrayList arrayList0 = j0.j;
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                if(((MenuItemImpl)arrayList0.get(v1)) == menuItemImpl0) {
                    this.X = v1;
                    return;
                }
            }
        }
        this.X = -1;
    }

    public final MenuItemImpl b(int v) {
        j j0 = this.Y.Z;
        j0.i();
        ArrayList arrayList0 = j0.j;
        this.Y.getClass();
        if(this.X >= 0 && v >= this.X) {
            ++v;
        }
        return (MenuItemImpl)arrayList0.get(v);
    }

    @Override  // android.widget.Adapter
    public final int getCount() {
        j j0 = this.Y.Z;
        j0.i();
        int v = j0.j.size();
        this.Y.getClass();
        return this.X >= 0 ? v - 1 : v;
    }

    @Override  // android.widget.Adapter
    public final Object getItem(int v) {
        return this.b(v);
    }

    @Override  // android.widget.Adapter
    public final long getItemId(int v) {
        return (long)v;
    }

    @Override  // android.widget.Adapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        if(view0 == null) {
            view0 = this.Y.Y.inflate(0x7F0D0010, viewGroup0, false);  // layout:abc_list_menu_item_layout
        }
        ((v)view0).c(this.b(v));
        return view0;
    }

    @Override  // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        this.a();
        super.notifyDataSetChanged();
    }
}

