package G2;

import R9.k2;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment.SavedState;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.I;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import c2.N;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import s.a;
import s.o;
import v1.r;

public abstract class i extends Adapter implements k {
    public final Lifecycle d;
    public final N e;
    public final o f;
    public final o g;
    public final o h;
    public h i;
    public final d j;
    public boolean k;
    public boolean l;

    public i(N n0, Lifecycle lifecycle0) {
        this.f = new o(null);
        this.g = new o(null);
        this.h = new o(null);
        d d0 = new d();  // initializer: Ljava/lang/Object;-><init>()V
        d0.a = new CopyOnWriteArrayList();
        this.j = d0;
        this.k = false;
        this.l = false;
        this.e = n0;
        this.d = lifecycle0;
        this.p(true);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final long b(int v) {
        return (long)v;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final void h(RecyclerView recyclerView0) {
        if(this.i != null) {
            throw new IllegalArgumentException();
        }
        h h0 = new h(this);
        this.i = h0;
        ViewPager2 viewPager20 = h.a(recyclerView0);
        h0.d = viewPager20;
        e e0 = new e(h0);
        h0.a = e0;
        ((ArrayList)viewPager20.d0.b).add(e0);
        f f0 = new f(0, h0);
        h0.b = f0;
        this.o(f0);
        g g0 = new g(h0);
        h0.c = g0;
        this.d.a(g0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final void i(I i0, int v) {
        Bundle bundle0;
        long v1 = ((j)i0).e;
        FrameLayout frameLayout0 = (FrameLayout)((j)i0).a;
        int v2 = frameLayout0.getId();
        Long long0 = this.t(v2);
        o o0 = this.h;
        if(long0 != null && ((long)long0) != v1) {
            this.v(((long)long0));
            o0.k(((long)long0));
        }
        o0.j(v1, v2);
        o o1 = this.f;
        if(o1.g(((long)v)) < 0) {
            Fragment fragment0 = (Fragment)((Function0)((Ab.k)k2.a.get(v)).Y).invoke();
            SavedState fragment$SavedState0 = (SavedState)this.g.e(((long)v));
            if(fragment0.r0 != null) {
                throw new IllegalStateException("Fragment already added");
            }
            if(fragment$SavedState0 == null) {
                bundle0 = null;
            }
            else {
                bundle0 = fragment$SavedState0.X;
                if(bundle0 == null) {
                    bundle0 = null;
                }
            }
            fragment0.Y = bundle0;
            o1.j(((long)v), fragment0);
        }
        if(frameLayout0.isAttachedToWindow()) {
            this.u(((j)i0));
        }
        this.s();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final I j(ViewGroup viewGroup0, int v) {
        FrameLayout frameLayout0 = new FrameLayout(viewGroup0.getContext());
        frameLayout0.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout0.setId(View.generateViewId());
        frameLayout0.setSaveEnabled(false);
        return new j(frameLayout0);  // initializer: Landroidx/recyclerview/widget/I;-><init>(Landroid/view/View;)V
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final void k(RecyclerView recyclerView0) {
        h h0 = this.i;
        h0.getClass();
        ((ArrayList)h.a(recyclerView0).d0.b).remove(h0.a);
        h0.f.a.unregisterObserver(h0.b);
        h0.f.d.c(h0.c);
        h0.d = null;
        this.i = null;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final boolean l(I i0) {
        j j0 = (j)i0;
        return true;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final void m(I i0) {
        this.u(((j)i0));
        this.s();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final void n(I i0) {
        Long long0 = this.t(((FrameLayout)((j)i0).a).getId());
        if(long0 != null) {
            this.v(((long)long0));
            this.h.k(((long)long0));
        }
    }

    public static void q(View view0, FrameLayout frameLayout0) {
        if(frameLayout0.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if(view0.getParent() == frameLayout0) {
            return;
        }
        if(frameLayout0.getChildCount() > 0) {
            frameLayout0.removeAllViews();
        }
        if(view0.getParent() != null) {
            ((ViewGroup)view0.getParent()).removeView(view0);
        }
        frameLayout0.addView(view0);
    }

    public static boolean r(long v) {
        return v >= 0L && v < ((long)k2.a.size());
    }

    public final void s() {
        o o0;
        if(this.l && !this.e.P()) {
            s.f f0 = new s.f(0);
            for(int v1 = 0; true; ++v1) {
                o0 = this.f;
                int v2 = o0.m();
                o o1 = this.h;
                if(v1 >= v2) {
                    break;
                }
                long v3 = o0.i(v1);
                if(!i.r(v3)) {
                    f0.add(v3);
                    o1.k(v3);
                }
            }
            if(!this.k) {
                this.l = false;
                for(int v = 0; v < o0.m(); ++v) {
                    long v4 = o0.i(v);
                    if(o1.g(v4) < 0) {
                        Fragment fragment0 = (Fragment)o0.e(v4);
                        if(fragment0 == null || (fragment0.F0 == null || fragment0.F0.getParent() == null)) {
                            f0.add(v4);
                        }
                    }
                }
            }
            a a0 = new a(f0);
            while(a0.hasNext()) {
                this.v(((long)(((Long)a0.next()))));
            }
        }
    }

    public final Long t(int v) {
        Long long0 = null;
        for(int v1 = 0; true; ++v1) {
            o o0 = this.h;
            if(v1 >= o0.m()) {
                break;
            }
            if(((int)(((Integer)o0.n(v1)))) == v) {
                if(long0 != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                long0 = o0.i(v1);
                continue;
            }
        }
        return long0;
    }

    public final void u(j j0) {
        Fragment fragment0 = (Fragment)this.f.e(j0.e);
        if(fragment0 == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayout0 = (FrameLayout)j0.a;
        View view0 = fragment0.F0;
        if(!fragment0.u() && view0 != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        N n0 = this.e;
        if(fragment0.u() && view0 == null) {
            n0.V(new b(this, fragment0, frameLayout0), false);
            return;
        }
        if(fragment0.u() && view0.getParent() != null) {
            if(view0.getParent() != frameLayout0) {
                i.q(view0, frameLayout0);
            }
            return;
        }
        if(fragment0.u()) {
            i.q(view0, frameLayout0);
            return;
        }
        if(!n0.P()) {
            n0.V(new b(this, fragment0, frameLayout0), false);
            this.j.getClass();
            ArrayList arrayList0 = new ArrayList();
            Iterator iterator0 = this.j.a.iterator();
            if(iterator0.hasNext()) {
                throw r.e(iterator0);
            }
            try {
                if(fragment0.C0) {
                    fragment0.C0 = false;
                }
                c2.a a0 = new c2.a(n0);
                a0.h(0, fragment0, "f" + j0.e, 1);
                a0.k(fragment0, State.b0);
                a0.g();
                this.i.b(false);
            }
            finally {
                d.a(arrayList0);
            }
            return;
        }
        if(n0.J) {
            return;
        }
        G2.a a1 = new G2.a(this, j0);
        this.d.a(a1);
    }

    public final void v(long v) {
        o o0 = this.f;
        Fragment fragment0 = (Fragment)o0.e(v);
        if(fragment0 == null) {
            return;
        }
        View view0 = fragment0.F0;
        if(view0 != null) {
            ViewParent viewParent0 = view0.getParent();
            if(viewParent0 != null) {
                ((FrameLayout)viewParent0).removeAllViews();
            }
        }
        o o1 = this.g;
        if(!i.r(v)) {
            o1.k(v);
        }
        if(!fragment0.u()) {
            o0.k(v);
            return;
        }
        N n0 = this.e;
        if(n0.P()) {
            this.l = true;
            return;
        }
        d d0 = this.j;
        if(fragment0.u() && i.r(v)) {
            d0.getClass();
            ArrayList arrayList0 = new ArrayList();
            Iterator iterator0 = d0.a.iterator();
            if(iterator0.hasNext()) {
                throw r.e(iterator0);
            }
            androidx.fragment.app.e e0 = (androidx.fragment.app.e)((HashMap)n0.c.Y).get(fragment0.c0);
            SavedState fragment$SavedState0 = null;
            if(e0 != null && e0.c.equals(fragment0)) {
                if(e0.c.X > -1) {
                    fragment$SavedState0 = new SavedState(e0.o());
                }
                d.a(arrayList0);
                o1.j(v, fragment$SavedState0);
                goto label_36;
            }
            n0.h0(new IllegalStateException(Y8.o.y("Fragment ", fragment0, " is not currently in the FragmentManager")));
            throw null;
        }
    label_36:
        d0.getClass();
        ArrayList arrayList1 = new ArrayList();
        Iterator iterator1 = d0.a.iterator();
        if(iterator1.hasNext()) {
            throw r.e(iterator1);
        }
        try {
            c2.a a0 = new c2.a(n0);
            a0.j(fragment0);
            a0.g();
            o0.k(v);
        }
        finally {
            d.a(arrayList1);
        }
    }
}

