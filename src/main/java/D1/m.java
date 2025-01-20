package d1;

import Aa.s;
import Ab.e;
import F0.f;
import F0.i0;
import M6.b;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalFocusChangeListener;
import androidx.compose.ui.focus.FocusOwner;
import d6.a;
import g0.n;
import l0.d;
import l0.h;
import l0.k;
import l0.q;

public final class m extends n implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalFocusChangeListener, k {
    public View l0;

    @Override  // l0.k
    public final void l(h h0) {
        h0.c(false);
        h0.d(new s(1, this, m.class, "onEnter", "onEnter-3ESFkO8(I)Landroidx/compose/ui/focus/FocusRequester;", 0, 24));
        h0.a(new s(1, this, m.class, "onExit", "onExit-3ESFkO8(I)Landroidx/compose/ui/focus/FocusRequester;", 0, 25));
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view0, View view1) {
        if(f.v(this).g0 == null) {
            return;
        }
        View view2 = j.c(this);
        FocusOwner focusOwner0 = f.w(this).getFocusOwner();
        i0 i00 = f.w(this);
        boolean z = view0 != null && !view0.equals(i00) && j.a(view2, view0);
        boolean z1 = view1 != null && !view1.equals(i00) && j.a(view2, view1);
        if(z && z1) {
            this.l0 = view1;
            return;
        }
        if(z1) {
            this.l0 = view1;
            q q0 = this.x0();
            int v = q0.y0().ordinal();
            if(v != 0 && v != 1 && v != 2) {
                if(v != 3) {
                    throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                }
                a a0 = focusOwner0.b();
                try {
                    if(a0.X) {
                        a.a(a0);
                    }
                    a0.X = true;
                    d.w(q0);
                }
                finally {
                    a.b(a0);
                }
            }
        }
        else if(z) {
            this.l0 = null;
            if(this.x0().y0().a()) {
                focusOwner0.e(8, false, false);
            }
        }
        else {
            this.l0 = null;
        }
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view0) {
        view0.getViewTreeObserver().addOnGlobalFocusChangeListener(this);
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view0) {
        view0.getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
    }

    @Override  // g0.n
    public final void p0() {
        j.c(this).addOnAttachStateChangeListener(this);
    }

    @Override  // g0.n
    public final void q0() {
        j.c(this).removeOnAttachStateChangeListener(this);
        this.l0 = null;
    }

    public final q x0() {
        n n0 = this.X;
        if(n0.k0) {
            if((n0.b0 & 0x400) != 0) {
                n n1 = n0.d0;
                boolean z = false;
                while(n1 != null) {
                    if((n1.Z & 0x400) != 0) {
                        n n2 = n1;
                        W.d d0 = null;
                        while(n2 != null) {
                            if(n2 instanceof q) {
                                if(z) {
                                    return (q)n2;
                                }
                                z = true;
                            }
                            else if((n2.Z & 0x400) != 0 && n2 instanceof F0.n) {
                                n n3 = ((F0.n)n2).m0;
                                int v = 0;
                                while(n3 != null) {
                                    if((n3.Z & 0x400) != 0) {
                                        ++v;
                                        if(v == 1) {
                                            n2 = n3;
                                        }
                                        else {
                                            if(d0 == null) {
                                                d0 = new W.d(new n[16]);
                                            }
                                            if(n2 != null) {
                                                d0.c(n2);
                                                n2 = null;
                                            }
                                            d0.c(n3);
                                        }
                                    }
                                    n3 = n3.d0;
                                }
                                if(v != 1) {
                                    goto label_33;
                                }
                                continue;
                            }
                        label_33:
                            n2 = f.f(d0);
                        }
                    }
                    n1 = n1.d0;
                }
            }
            throw new IllegalStateException("Could not find focus target of embedded view wrapper");
        }
        b.T("visitLocalDescendants called on an unattached node");
        throw null;
    }
}

