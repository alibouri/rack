package f9;

import Nb.j;
import P.i;
import R1.d;
import R9.X1;
import Z2.k;
import ac.B0;
import ac.h0;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.I;
import bc.n;
import com.wave.customer.PaymentListActivity;
import k2.d1;
import q9.o0;

public final class D extends d1 {
    public final PaymentListActivity e;
    public final h0 f;
    public final ViewModel g;

    public D(PaymentListActivity paymentListActivity0, n n0, X1 x10) {
        j.f(n0, "pagedList");
        super();
        this.e = paymentListActivity0;
        this.f = null;
        this.g = x10;
        k k0 = new k(new i(2, this, D.class, "submitList", "submitList(Landroidx/paging/PagedList;)V", 4, 2));
        this.p(true);
        o0.e(n0, paymentListActivity0, k0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final long b(int v) {
        Object object0 = this.q(v);
        j.c(object0);
        return (((long)((f9.j)object0).b) << 0x20) + ((long)((f9.j)object0).a.hashCode());
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final int c(int v) {
        Object object0 = this.q(v);
        j.c(object0);
        return ((f9.j)object0).b;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final void i(I i0, int v) {
        h0 h00 = this.f;
        if(h00 != null) {
            ((B0)h00).l(null, Boolean.TRUE);
        }
        f9.j j0 = (f9.j)this.q(v);
        if(j0 != null) {
            ((g)i0).u.t(16, j0.c);
            ((g)i0).u.t(30, this.g);
            ((g)i0).u.h();
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final I j(ViewGroup viewGroup0, int v) {
        j.f(viewGroup0, "parent");
        R1.g g0 = d.a(LayoutInflater.from(viewGroup0.getContext()), v, viewGroup0);
        g0.r(this.e);
        return new g(g0, v);
    }
}

