package i;

import E7.C;
import R2.c;
import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.a;
import androidx.appcompat.view.h;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionMenuPresenter;
import java.lang.ref.WeakReference;
import n.i;
import n.j;

public final class O extends a implements i {
    public final Context Z;
    public final j b0;
    public c c0;
    public WeakReference d0;
    public final P e0;

    public O(P p0, Context context0, c c0) {
        this.e0 = p0;
        this.Z = context0;
        this.c0 = c0;
        j j0 = new j(context0);
        j0.l = 1;
        this.b0 = j0;
        j0.e = this;
    }

    @Override  // androidx.appcompat.view.a
    public final void a() {
        P p0 = this.e0;
        if(p0.i != this) {
            return;
        }
        if(p0.p) {
            p0.j = this;
            p0.k = this.c0;
        }
        else {
            this.c0.k(this);
        }
        this.c0 = null;
        p0.m0(false);
        ActionBarContextView actionBarContextView0 = p0.f;
        if(actionBarContextView0.l0 == null) {
            actionBarContextView0.e();
        }
        p0.c.setHideOnContentScrollEnabled(p0.u);
        p0.i = null;
    }

    @Override  // androidx.appcompat.view.a
    public final View b() {
        return this.d0 == null ? null : ((View)this.d0.get());
    }

    @Override  // androidx.appcompat.view.a
    public final j c() {
        return this.b0;
    }

    @Override  // androidx.appcompat.view.a
    public final MenuInflater d() {
        return new h(this.Z);
    }

    @Override  // androidx.appcompat.view.a
    public final CharSequence e() {
        return this.e0.f.getSubtitle();
    }

    @Override  // n.i
    public final boolean f(j j0, MenuItem menuItem0) {
        return this.c0 == null ? false : ((C)this.c0.Y).H(this, menuItem0);
    }

    @Override  // androidx.appcompat.view.a
    public final CharSequence g() {
        return this.e0.f.getTitle();
    }

    @Override  // androidx.appcompat.view.a
    public final void h() {
        if(this.e0.i != this) {
            return;
        }
        this.b0.w();
        try {
            this.c0.l(this, this.b0);
        }
        finally {
            this.b0.v();
        }
    }

    @Override  // androidx.appcompat.view.a
    public final boolean i() {
        return this.e0.f.t0;
    }

    @Override  // androidx.appcompat.view.a
    public final void j(View view0) {
        this.e0.f.setCustomView(view0);
        this.d0 = new WeakReference(view0);
    }

    @Override  // androidx.appcompat.view.a
    public final void k(int v) {
        this.l(this.e0.a.getResources().getString(v));
    }

    @Override  // androidx.appcompat.view.a
    public final void l(CharSequence charSequence0) {
        this.e0.f.setSubtitle(charSequence0);
    }

    @Override  // n.i
    public final void m(j j0) {
        if(this.c0 == null) {
            return;
        }
        this.h();
        ActionMenuPresenter actionMenuPresenter0 = this.e0.f.e0;
        if(actionMenuPresenter0 != null) {
            actionMenuPresenter0.l();
        }
    }

    @Override  // androidx.appcompat.view.a
    public final void n(int v) {
        this.o(this.e0.a.getResources().getString(v));
    }

    @Override  // androidx.appcompat.view.a
    public final void o(CharSequence charSequence0) {
        this.e0.f.setTitle(charSequence0);
    }

    @Override  // androidx.appcompat.view.a
    public final void p(boolean z) {
        this.Y = z;
        this.e0.f.setTitleOptional(z);
    }
}

