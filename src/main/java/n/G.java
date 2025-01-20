package n;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager.LayoutParams;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.view.menu.MenuItemImpl;
import i.c;

public final class g implements AdapterView.OnItemClickListener, u {
    public Context X;
    public LayoutInflater Y;
    public j Z;
    public ExpandedMenuView b0;
    public t c0;
    public f d0;

    public g(ContextWrapper contextWrapper0) {
        this.X = contextWrapper0;
        this.Y = LayoutInflater.from(contextWrapper0);
    }

    @Override  // n.u
    public final void b(j j0, boolean z) {
        t t0 = this.c0;
        if(t0 != null) {
            t0.b(j0, z);
        }
    }

    @Override  // n.u
    public final boolean c(MenuItemImpl menuItemImpl0) {
        return false;
    }

    @Override  // n.u
    public final void d() {
        f f0 = this.d0;
        if(f0 != null) {
            f0.notifyDataSetChanged();
        }
    }

    @Override  // n.u
    public final void f(Context context0, j j0) {
        if(this.X != null) {
            this.X = context0;
            if(this.Y == null) {
                this.Y = LayoutInflater.from(context0);
            }
        }
        this.Z = j0;
        f f0 = this.d0;
        if(f0 != null) {
            f0.notifyDataSetChanged();
        }
    }

    @Override  // n.u
    public final boolean h(A a0) {
        if(!a0.hasVisibleItems()) {
            return false;
        }
        k k0 = new k();  // initializer: Ljava/lang/Object;-><init>()V
        k0.X = a0;
        i.f f0 = new i.f(a0.a);
        c c0 = f0.a;
        g g0 = new g(c0.a);
        k0.Z = g0;
        g0.c0 = k0;
        a0.b(g0, a0.a);
        g g1 = k0.Z;
        if(g1.d0 == null) {
            g1.d0 = new f(g1);
        }
        c0.q = g1.d0;
        c0.r = k0;
        View view0 = a0.o;
        if(view0 == null) {
            c0.c = a0.n;
            c0.d = a0.m;
        }
        else {
            c0.e = view0;
        }
        c0.o = k0;
        i.g g2 = f0.a();
        k0.Y = g2;
        g2.setOnDismissListener(k0);
        WindowManager.LayoutParams windowManager$LayoutParams0 = k0.Y.getWindow().getAttributes();
        windowManager$LayoutParams0.type = 1003;
        windowManager$LayoutParams0.flags |= 0x20000;
        k0.Y.show();
        t t0 = this.c0;
        if(t0 != null) {
            t0.j(a0);
        }
        return true;
    }

    @Override  // n.u
    public final boolean i() {
        return false;
    }

    @Override  // n.u
    public final void j(t t0) {
        throw null;
    }

    @Override  // n.u
    public final boolean k(MenuItemImpl menuItemImpl0) {
        return false;
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        this.Z.q(this.d0.b(v), this, 0);
    }
}

