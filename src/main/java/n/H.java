package n;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.MenuItemImpl;
import java.util.ArrayList;

public final class h extends BaseAdapter {
    public final j X;
    public int Y;
    public boolean Z;
    public final boolean b0;
    public final LayoutInflater c0;
    public final int d0;

    public h(j j0, LayoutInflater layoutInflater0, boolean z, int v) {
        this.Y = -1;
        this.b0 = z;
        this.c0 = layoutInflater0;
        this.X = j0;
        this.d0 = v;
        this.a();
    }

    public final void a() {
        j j0 = this.X;
        MenuItemImpl menuItemImpl0 = j0.v;
        if(menuItemImpl0 != null) {
            j0.i();
            ArrayList arrayList0 = j0.j;
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                if(((MenuItemImpl)arrayList0.get(v1)) == menuItemImpl0) {
                    this.Y = v1;
                    return;
                }
            }
        }
        this.Y = -1;
    }

    public final MenuItemImpl b(int v) {
        ArrayList arrayList0;
        j j0 = this.X;
        if(this.b0) {
            j0.i();
            arrayList0 = j0.j;
        }
        else {
            arrayList0 = j0.l();
        }
        if(this.Y >= 0 && v >= this.Y) {
            ++v;
        }
        return (MenuItemImpl)arrayList0.get(v);
    }

    @Override  // android.widget.Adapter
    public final int getCount() {
        j j0 = this.X;
        if(this.b0) {
            j0.i();
            return this.Y >= 0 ? j0.j.size() - 1 : j0.j.size();
        }
        ArrayList arrayList0 = j0.l();
        return this.Y >= 0 ? arrayList0.size() - 1 : arrayList0.size();
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
        boolean z = false;
        if(view0 == null) {
            view0 = this.c0.inflate(this.d0, viewGroup0, false);
        }
        int v1 = this.b(v).b;
        int v2 = v - 1 < 0 ? v1 : this.b(v - 1).b;
        if(this.X.m() && v1 != v2) {
            z = true;
        }
        ((ListMenuItemView)view0).setGroupDividerEnabled(z);
        if(this.Z) {
            ((ListMenuItemView)view0).setForceShowIcon(true);
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

