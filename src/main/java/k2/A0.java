package k2;

import C3.m;
import Nb.j;
import U0.D;
import Xb.A;
import Xb.I0;
import Xb.J;
import Xb.i0;
import androidx.lifecycle.LiveData;

public final class a0 extends LiveData {
    public final i0 l;
    public final m m;
    public final S1 n;
    public final A o;
    public final A p;
    public c1 q;
    public I0 r;
    public final D s;
    public final io.sentry.android.core.m t;

    public a0(m m0, S1 s10, A a0, A a1) {
        j.f(s10, "pagingSourceFactory");
        X x0 = new X(a0, new L(2));  // initializer: Lk2/w;-><init>(I)V
        j.d(w1.d0, "null cannot be cast to non-null type androidx.paging.PagingSource.LoadResult.Page<Key of androidx.paging.PagingSource.LoadResult.Page.Companion.empty, Value of androidx.paging.PagingSource.LoadResult.Page.Companion.empty>");
        super(new M(x0, i0.X, a0, a1, m0, w1.d0, null));  // initializer: Lk2/t;-><init>(Lk2/y1;LXb/i0;LXb/A;LXb/A;LC3/m;Lk2/w1;Ljava/lang/Object;)V
        this.l = i0.X;
        this.m = m0;
        this.n = s10;
        this.o = a0;
        this.p = a1;
        this.s = new D(12, this);
        this.t = new io.sentry.android.core.m(2, this);
        Object object0 = this.e == LiveData.k ? null : this.e;
        j.c(object0);
        this.q = (c1)object0;
    }

    @Override  // androidx.lifecycle.LiveData
    public final void f() {
        this.k(false);
    }

    public final void k(boolean z) {
        I0 i00 = this.r;
        if(i00 != null && !z) {
            return;
        }
        if(i00 != null) {
            i00.f(null);
        }
        Z z1 = new Z(this, null);
        this.r = J.q(this.l, this.p, null, z1, 2);
    }
}

