package o;

import Bb.q;
import J1.N;
import J1.V;
import a8.Q;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window.Callback;
import androidx.appcompat.view.i;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.DecorToolbar;
import androidx.appcompat.widget.Toolbar;
import h.a;
import n.j;
import n.t;

public final class J0 implements DecorToolbar {
    public final Toolbar a;
    public int b;
    public final View c;
    public Drawable d;
    public Drawable e;
    public final Drawable f;
    public final boolean g;
    public CharSequence h;
    public final CharSequence i;
    public final CharSequence j;
    public Window.Callback k;
    public boolean l;
    public ActionMenuPresenter m;
    public final int n;
    public final Drawable o;

    public J0(Toolbar toolbar0, boolean z) {
        this.n = 0;
        this.a = toolbar0;
        this.h = toolbar0.getTitle();
        this.i = toolbar0.getSubtitle();
        this.g = this.h != null;
        this.f = toolbar0.getNavigationIcon();
        String s = null;
        Q q0 = Q.G(toolbar0.getContext(), null, a.a, 0x7F040007);  // attr:actionBarStyle
        int v = 15;
        this.o = q0.t(15);
        if(z) {
            TypedArray typedArray0 = (TypedArray)q0.Z;
            CharSequence charSequence0 = typedArray0.getText(27);
            if(!TextUtils.isEmpty(charSequence0)) {
                this.g = true;
                this.h = charSequence0;
                if((this.b & 8) != 0) {
                    Toolbar toolbar1 = this.a;
                    toolbar1.setTitle(charSequence0);
                    if(this.g) {
                        N.l(toolbar1.getRootView(), charSequence0);
                    }
                }
            }
            CharSequence charSequence1 = typedArray0.getText(25);
            if(!TextUtils.isEmpty(charSequence1)) {
                this.i = charSequence1;
                if((this.b & 8) != 0) {
                    toolbar0.setSubtitle(charSequence1);
                }
            }
            Drawable drawable0 = q0.t(20);
            if(drawable0 != null) {
                this.e = drawable0;
                this.u();
            }
            Drawable drawable1 = q0.t(17);
            if(drawable1 != null) {
                this.setIcon(drawable1);
            }
            if(this.f == null) {
                Drawable drawable2 = this.o;
                if(drawable2 != null) {
                    this.f = drawable2;
                    Toolbar toolbar2 = this.a;
                    if((this.b & 4) == 0) {
                        toolbar2.setNavigationIcon(null);
                    }
                    else {
                        toolbar2.setNavigationIcon(drawable2);
                    }
                }
            }
            this.g(typedArray0.getInt(10, 0));
            int v1 = typedArray0.getResourceId(9, 0);
            if(v1 != 0) {
                View view0 = LayoutInflater.from(toolbar0.getContext()).inflate(v1, toolbar0, false);
                View view1 = this.c;
                if(view1 != null && (this.b & 16) != 0) {
                    toolbar0.removeView(view1);
                }
                this.c = view0;
                if(view0 != null && (this.b & 16) != 0) {
                    toolbar0.addView(view0);
                }
                this.g(this.b | 16);
            }
            int v2 = typedArray0.getLayoutDimension(13, 0);
            if(v2 > 0) {
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = toolbar0.getLayoutParams();
                viewGroup$LayoutParams0.height = v2;
                toolbar0.setLayoutParams(viewGroup$LayoutParams0);
            }
            int v3 = typedArray0.getDimensionPixelOffset(7, -1);
            int v4 = typedArray0.getDimensionPixelOffset(3, -1);
            if(v3 >= 0 || v4 >= 0) {
                toolbar0.d();
                toolbar0.u0.a(Math.max(v3, 0), Math.max(v4, 0));
            }
            int v5 = typedArray0.getResourceId(28, 0);
            if(v5 != 0) {
                Context context0 = toolbar0.getContext();
                toolbar0.m0 = v5;
                o.N n0 = toolbar0.c0;
                if(n0 != null) {
                    n0.setTextAppearance(context0, v5);
                }
            }
            int v6 = typedArray0.getResourceId(26, 0);
            if(v6 != 0) {
                Context context1 = toolbar0.getContext();
                toolbar0.n0 = v6;
                o.N n1 = toolbar0.d0;
                if(n1 != null) {
                    n1.setTextAppearance(context1, v6);
                }
            }
            int v7 = typedArray0.getResourceId(22, 0);
            if(v7 != 0) {
                toolbar0.setPopupTheme(v7);
            }
        }
        else {
            if(toolbar0.getNavigationIcon() == null) {
                v = 11;
            }
            else {
                this.o = toolbar0.getNavigationIcon();
            }
            this.b = v;
        }
        q0.I();
        if(0x7F120002 != this.n) {  // string:abc_action_bar_up_description "Navigate up"
            this.n = 0x7F120002;  // string:abc_action_bar_up_description "Navigate up"
            if(TextUtils.isEmpty(toolbar0.getNavigationContentDescription())) {
                int v8 = this.n;
                if(v8 != 0) {
                    s = toolbar0.getContext().getString(v8);
                }
                this.j = s;
                this.t();
            }
        }
        this.j = toolbar0.getNavigationContentDescription();
        toolbar0.setNavigationOnClickListener(new I0(this));
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public final Context a() {
        return this.a.getContext();
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public final void b() {
        ActionMenuView actionMenuView0 = this.a.b0;
        if(actionMenuView0 != null) {
            ActionMenuPresenter actionMenuPresenter0 = actionMenuView0.u0;
            if(actionMenuPresenter0 != null) {
                actionMenuPresenter0.e();
                e e0 = actionMenuPresenter0.r0;
                if(e0 != null && e0.b()) {
                    e0.i.dismiss();
                }
            }
        }
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public final void c(int v) {
        this.a.setVisibility(v);
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public final void collapseActionView() {
        G0 g00 = this.a.N0;
        MenuItemImpl menuItemImpl0 = g00 == null ? null : g00.Y;
        if(menuItemImpl0 != null) {
            menuItemImpl0.collapseActionView();
        }
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public final boolean d() {
        ActionMenuView actionMenuView0 = this.a.b0;
        return actionMenuView0 != null && (actionMenuView0.u0 != null && actionMenuView0.u0.g());
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public final void e() {
        this.l = true;
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public final boolean f() {
        G0 g00 = this.a.N0;
        return g00 != null && g00.Y != null;
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public final void g(int v) {
        int v1 = this.b ^ v;
        this.b = v;
        if(v1 != 0) {
            if((v1 & 4) != 0) {
                if((v & 4) != 0) {
                    this.t();
                }
                Toolbar toolbar0 = this.a;
                if((this.b & 4) == 0) {
                    toolbar0.setNavigationIcon(null);
                }
                else {
                    toolbar0.setNavigationIcon((this.f == null ? this.o : this.f));
                }
            }
            if((v1 & 3) != 0) {
                this.u();
            }
            Toolbar toolbar1 = this.a;
            if((v1 & 8) != 0) {
                if((v & 8) == 0) {
                    toolbar1.setTitle(null);
                    toolbar1.setSubtitle(null);
                }
                else {
                    toolbar1.setTitle(this.h);
                    toolbar1.setSubtitle(this.i);
                }
            }
            if((v1 & 16) != 0) {
                View view0 = this.c;
                if(view0 != null) {
                    if((v & 16) != 0) {
                        toolbar1.addView(view0);
                        return;
                    }
                    toolbar1.removeView(view0);
                }
            }
        }
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public final CharSequence getTitle() {
        return this.a.getTitle();
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public final void h() {
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public final int i() {
        return this.b;
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public final boolean j() {
        ActionMenuView actionMenuView0 = this.a.b0;
        return actionMenuView0 != null && (actionMenuView0.u0 != null && (actionMenuView0.u0.s0 != null || actionMenuView0.u0.g()));
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public final void k(int v) {
        this.e = v == 0 ? null : q.v(this.a.getContext(), v);
        this.u();
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public final boolean l() {
        ActionMenuView actionMenuView0 = this.a.b0;
        return actionMenuView0 != null && (actionMenuView0.u0 != null && actionMenuView0.u0.e());
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public final boolean m() {
        return this.a.v();
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public final void n(j j0, t t0) {
        Toolbar toolbar0 = this.a;
        if(this.m == null) {
            this.m = new ActionMenuPresenter(toolbar0.getContext());
        }
        ActionMenuPresenter actionMenuPresenter0 = this.m;
        actionMenuPresenter0.c0 = t0;
        if(j0 != null || toolbar0.b0 != null) {
            toolbar0.f();
            j j1 = toolbar0.b0.q0;
            if(j1 != j0) {
                if(j1 != null) {
                    j1.r(toolbar0.M0);
                    j1.r(toolbar0.N0);
                }
                if(toolbar0.N0 == null) {
                    toolbar0.N0 = new G0(toolbar0);
                }
                actionMenuPresenter0.o0 = true;
                if(j0 == null) {
                    actionMenuPresenter0.f(toolbar0.k0, null);
                    toolbar0.N0.f(toolbar0.k0, null);
                    actionMenuPresenter0.d();
                    toolbar0.N0.d();
                }
                else {
                    j0.b(actionMenuPresenter0, toolbar0.k0);
                    j0.b(toolbar0.N0, toolbar0.k0);
                }
                toolbar0.b0.setPopupTheme(toolbar0.l0);
                toolbar0.b0.setPresenter(actionMenuPresenter0);
                toolbar0.M0 = actionMenuPresenter0;
                toolbar0.w();
            }
        }
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public final V o(int v, long v1) {
        V v2 = N.a(this.a);
        v2.a((v == 0 ? 1.0f : 0.0f));
        v2.c(v1);
        v2.d(new i(this, v));
        return v2;
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public final void p() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public final boolean q() {
        return this.a.getVisibility() == 0 && (this.a.b0 != null && this.a.b0.t0);
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public final void r() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public final void s(boolean z) {
        this.a.setCollapsible(z);
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public final void setIcon(int v) {
        this.setIcon((v == 0 ? null : q.v(this.a.getContext(), v)));
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public final void setIcon(Drawable drawable0) {
        this.d = drawable0;
        this.u();
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public final void setWindowCallback(Window.Callback window$Callback0) {
        this.k = window$Callback0;
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public final void setWindowTitle(CharSequence charSequence0) {
        if(!this.g) {
            this.h = charSequence0;
            if((this.b & 8) != 0) {
                Toolbar toolbar0 = this.a;
                toolbar0.setTitle(charSequence0);
                if(this.g) {
                    N.l(toolbar0.getRootView(), charSequence0);
                }
            }
        }
    }

    public final void t() {
        if((this.b & 4) != 0) {
            boolean z = TextUtils.isEmpty(this.j);
            Toolbar toolbar0 = this.a;
            if(z) {
                toolbar0.setNavigationContentDescription(this.n);
                return;
            }
            toolbar0.setNavigationContentDescription(this.j);
        }
    }

    public final void u() {
        Drawable drawable0;
        int v = this.b;
        if((v & 2) == 0) {
            drawable0 = null;
        }
        else if((v & 1) != 0) {
            drawable0 = this.e;
            if(drawable0 == null) {
                drawable0 = this.d;
            }
        }
        else {
            drawable0 = this.d;
        }
        this.a.setLogo(drawable0);
    }
}

