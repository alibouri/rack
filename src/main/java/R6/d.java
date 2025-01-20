package r6;

import U0.l;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public abstract class d extends Behavior {
    public l a;
    public int b;

    public d() {
        this.b = 0;
    }

    public d(int v) {
        this.b = 0;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean h(CoordinatorLayout coordinatorLayout0, View view0, int v) {
        this.t(coordinatorLayout0, view0, v);
        if(this.a == null) {
            this.a = new l(3, view0);
        }
        l l0 = this.a;
        View view1 = (View)l0.e;
        l0.b = view1.getTop();
        l0.c = view1.getLeft();
        this.a.a();
        int v1 = this.b;
        if(v1 != 0) {
            l l1 = this.a;
            if(l1.d != v1) {
                l1.d = v1;
                l1.a();
            }
            this.b = 0;
        }
        return true;
    }

    public final int s() {
        return this.a == null ? 0 : this.a.d;
    }

    public void t(CoordinatorLayout coordinatorLayout0, View view0, int v) {
        coordinatorLayout0.q(view0, v);
    }
}

