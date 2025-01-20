package n;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View.OnKeyListener;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import o.f0;
import o.s0;

public final class z extends q implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public final Context Y;
    public final j Z;
    public final h b0;
    public final boolean c0;
    public final int d0;
    public final int e0;
    public final s0 f0;
    public final c g0;
    public final G0.q h0;
    public r i0;
    public View j0;
    public View k0;
    public t l0;
    public ViewTreeObserver m0;
    public boolean n0;
    public boolean o0;
    public int p0;
    public int q0;
    public boolean r0;

    public z(int v, Context context0, View view0, j j0, boolean z) {
        this.g0 = new c(1, this);
        this.h0 = new G0.q(7, this);
        this.q0 = 0;
        this.Y = context0;
        this.Z = j0;
        this.c0 = z;
        this.b0 = new h(j0, LayoutInflater.from(context0), z, 0x7F0D0013);  // layout:abc_popup_menu_item_layout
        this.e0 = v;
        Resources resources0 = context0.getResources();
        this.d0 = Math.max(resources0.getDisplayMetrics().widthPixels / 2, resources0.getDimensionPixelSize(0x7F070017));  // dimen:abc_config_prefDialogWidth
        this.j0 = view0;
        this.f0 = new s0(context0, null, v);  // initializer: Lo/o0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
        j0.b(this, context0);
    }

    @Override  // n.y
    public final void a() {
        if(!this.e()) {
            if(!this.n0) {
                View view0 = this.j0;
                if(view0 != null) {
                    this.k0 = view0;
                    s0 s00 = this.f0;
                    s00.w0.setOnDismissListener(this);
                    s00.n0 = this;
                    s00.v0 = true;
                    s00.w0.setFocusable(true);
                    View view1 = this.k0;
                    boolean z = this.m0 == null;
                    ViewTreeObserver viewTreeObserver0 = view1.getViewTreeObserver();
                    this.m0 = viewTreeObserver0;
                    if(z) {
                        viewTreeObserver0.addOnGlobalLayoutListener(this.g0);
                    }
                    view1.addOnAttachStateChangeListener(this.h0);
                    s00.m0 = view1;
                    s00.j0 = this.q0;
                    Context context0 = this.Y;
                    h h0 = this.b0;
                    if(!this.o0) {
                        this.p0 = q.m(h0, context0, this.d0);
                        this.o0 = true;
                    }
                    s00.c(this.p0);
                    s00.w0.setInputMethodMode(2);
                    s00.u0 = this.X == null ? null : new Rect(this.X);
                    s00.a();
                    f0 f00 = s00.Z;
                    f00.setOnKeyListener(this);
                    if(this.r0) {
                        j j0 = this.Z;
                        if(j0.m != null) {
                            FrameLayout frameLayout0 = (FrameLayout)LayoutInflater.from(context0).inflate(0x7F0D0012, f00, false);  // layout:abc_popup_menu_header_item_layout
                            TextView textView0 = (TextView)frameLayout0.findViewById(0x1020016);
                            if(textView0 != null) {
                                textView0.setText(j0.m);
                            }
                            frameLayout0.setEnabled(false);
                            f00.addHeaderView(frameLayout0, null, false);
                        }
                    }
                    s00.q(h0);
                    s00.a();
                    return;
                }
            }
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override  // n.u
    public final void b(j j0, boolean z) {
        if(j0 != this.Z) {
            return;
        }
        this.dismiss();
        t t0 = this.l0;
        if(t0 != null) {
            t0.b(j0, z);
        }
    }

    @Override  // n.u
    public final void d() {
        this.o0 = false;
        h h0 = this.b0;
        if(h0 != null) {
            h0.notifyDataSetChanged();
        }
    }

    @Override  // n.y
    public final void dismiss() {
        if(this.e()) {
            this.f0.dismiss();
        }
    }

    // Deobfuscation rating: LOW(20)
    @Override  // n.y
    public final boolean e() {
        return !this.n0 && this.f0.w0.isShowing();
    }

    @Override  // n.y
    public final f0 g() {
        return this.f0.Z;
    }

    @Override  // n.u
    public final boolean h(A a0) {
        if(a0.hasVisibleItems()) {
            s s0 = new s(this.e0, this.Y, this.k0, a0, this.c0);
            t t0 = this.l0;
            s0.h = t0;
            q q0 = s0.i;
            if(q0 != null) {
                q0.j(t0);
            }
            boolean z = q.u(a0);
            s0.g = z;
            q q1 = s0.i;
            if(q1 != null) {
                q1.o(z);
            }
            s0.j = this.i0;
            this.i0 = null;
            this.Z.c(false);
            int v = this.f0.d0;
            int v1 = this.f0.n();
            if((Gravity.getAbsoluteGravity(this.q0, this.j0.getLayoutDirection()) & 7) == 5) {
                v += this.j0.getWidth();
            }
            boolean z1 = false;
            if(s0.b()) {
                z1 = true;
            }
            else if(s0.e != null) {
                z1 = true;
                s0.d(v, v1, true, true);
            }
            if(z1) {
                t t1 = this.l0;
                if(t1 != null) {
                    t1.j(a0);
                }
                return true;
            }
        }
        return false;
    }

    @Override  // n.u
    public final boolean i() {
        return false;
    }

    @Override  // n.u
    public final void j(t t0) {
        this.l0 = t0;
    }

    @Override  // n.q
    public final void l(j j0) {
    }

    @Override  // n.q
    public final void n(View view0) {
        this.j0 = view0;
    }

    @Override  // n.q
    public final void o(boolean z) {
        this.b0.Z = z;
    }

    @Override  // android.widget.PopupWindow$OnDismissListener
    public final void onDismiss() {
        this.n0 = true;
        this.Z.c(true);
        ViewTreeObserver viewTreeObserver0 = this.m0;
        if(viewTreeObserver0 != null) {
            if(!viewTreeObserver0.isAlive()) {
                this.m0 = this.k0.getViewTreeObserver();
            }
            this.m0.removeGlobalOnLayoutListener(this.g0);
            this.m0 = null;
        }
        this.k0.removeOnAttachStateChangeListener(this.h0);
        r r0 = this.i0;
        if(r0 != null) {
            r0.onDismiss();
        }
    }

    @Override  // android.view.View$OnKeyListener
    public final boolean onKey(View view0, int v, KeyEvent keyEvent0) {
        if(keyEvent0.getAction() == 1 && v == 82) {
            this.dismiss();
            return true;
        }
        return false;
    }

    @Override  // n.q
    public final void p(int v) {
        this.q0 = v;
    }

    @Override  // n.q
    public final void q(int v) {
        this.f0.d0 = v;
    }

    @Override  // n.q
    public final void r(PopupWindow.OnDismissListener popupWindow$OnDismissListener0) {
        this.i0 = (r)popupWindow$OnDismissListener0;
    }

    @Override  // n.q
    public final void s(boolean z) {
        this.r0 = z;
    }

    @Override  // n.q
    public final void t(int v) {
        this.f0.j(v);
    }
}

