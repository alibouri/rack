package i;

import E7.C;
import J1.N;
import J1.V;
import R2.c;
import android.content.Context;
import android.content.res.Resources.Theme;
import android.util.TypedValue;
import android.view.ActionMode.Callback;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.Window.Callback;
import android.widget.PopupWindow;
import androidx.appcompat.view.WindowCallbackWrapper;
import androidx.appcompat.view.a;
import androidx.appcompat.view.d;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import hb.h;
import java.util.ArrayList;
import java.util.List;
import n.j;

public final class x extends WindowCallbackWrapper {
    public J X;
    public boolean Y;
    public boolean Z;
    public boolean b0;
    public final B c0;

    public x(B b0, Window.Callback window$Callback0) {
        this.c0 = b0;
        super(window$Callback0);
    }

    public final void b(Window.Callback window$Callback0) {
        try {
            this.Y = true;
            window$Callback0.onContentChanged();
            this.Y = false;
        }
        catch(Throwable throwable0) {
            this.Y = false;
            throw throwable0;
        }
    }

    // Deobfuscation rating: LOW(40)
    @Override  // androidx.appcompat.view.WindowCallbackWrapper
    public final boolean dispatchKeyEvent(KeyEvent keyEvent0) {
        return this.Z ? this.a().dispatchKeyEvent(keyEvent0) : this.c0.u(keyEvent0) || super.dispatchKeyEvent(keyEvent0);
    }

    @Override  // androidx.appcompat.view.WindowCallbackWrapper
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent0) {
        if(!super.dispatchKeyShortcutEvent(keyEvent0)) {
            int v = keyEvent0.getKeyCode();
            B b0 = this.c0;
            b0.B();
            if(b0.m0 == null || !b0.m0.c0(v, keyEvent0)) {
                if(b0.K0 == null || !b0.G(b0.K0, keyEvent0.getKeyCode(), keyEvent0)) {
                    goto label_10;
                }
                A a0 = b0.K0;
                if(a0 != null) {
                    a0.l = true;
                    return true;
                label_10:
                    if(b0.K0 == null) {
                        A a1 = b0.A(0);
                        b0.H(a1, keyEvent0);
                        boolean z = b0.G(a1, keyEvent0.getKeyCode(), keyEvent0);
                        a1.k = false;
                        return z;
                    }
                    return false;
                }
            }
        }
        return true;
    }

    @Override  // androidx.appcompat.view.WindowCallbackWrapper
    public final void onContentChanged() {
        if(this.Y) {
            this.a().onContentChanged();
        }
    }

    @Override  // androidx.appcompat.view.WindowCallbackWrapper
    public final boolean onCreatePanelMenu(int v, Menu menu0) {
        return v != 0 || menu0 instanceof j ? super.onCreatePanelMenu(v, menu0) : false;
    }

    @Override  // androidx.appcompat.view.WindowCallbackWrapper
    public final View onCreatePanelView(int v) {
        J j0 = this.X;
        if(j0 != null) {
            View view0 = v == 0 ? new View(((K)j0.Y).a.a.getContext()) : null;
            return view0 == null ? super.onCreatePanelView(v) : view0;
        }
        return super.onCreatePanelView(v);
    }

    @Override  // androidx.appcompat.view.WindowCallbackWrapper
    public final boolean onMenuOpened(int v, Menu menu0) {
        super.onMenuOpened(v, menu0);
        B b0 = this.c0;
        if(v == 108) {
            b0.B();
            h h0 = b0.m0;
            if(h0 != null) {
                h0.L(true);
                return true;
            }
        }
        else {
            b0.getClass();
        }
        return true;
    }

    @Override  // androidx.appcompat.view.WindowCallbackWrapper
    public final void onPanelClosed(int v, Menu menu0) {
        if(this.b0) {
            this.a().onPanelClosed(v, menu0);
            return;
        }
        super.onPanelClosed(v, menu0);
        B b0 = this.c0;
        if(v == 108) {
            b0.B();
            h h0 = b0.m0;
            if(h0 != null) {
                h0.L(false);
            }
        }
        else if(v == 0) {
            A a0 = b0.A(0);
            if(a0.m) {
                b0.s(a0, false);
            }
        }
        else {
            b0.getClass();
        }
    }

    @Override  // androidx.appcompat.view.WindowCallbackWrapper
    public final boolean onPreparePanel(int v, View view0, Menu menu0) {
        j j0 = menu0 instanceof j ? ((j)menu0) : null;
        if(v == 0 && j0 == null) {
            return false;
        }
        if(j0 != null) {
            j0.x = true;
        }
        J j1 = this.X;
        if(j1 != null && v == 0) {
            K k0 = (K)j1.Y;
            if(!k0.d) {
                k0.a.l = true;
                k0.d = true;
            }
        }
        boolean z = super.onPreparePanel(v, view0, menu0);
        if(j0 != null) {
            j0.x = false;
        }
        return z;
    }

    @Override  // androidx.appcompat.view.WindowCallbackWrapper
    public final void onProvideKeyboardShortcuts(List list0, Menu menu0, int v) {
        j j0 = this.c0.A(0).h;
        if(j0 != null) {
            super.onProvideKeyboardShortcuts(list0, j0, v);
            return;
        }
        super.onProvideKeyboardShortcuts(list0, menu0, v);
    }

    @Override  // androidx.appcompat.view.WindowCallbackWrapper
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback actionMode$Callback0) {
        return null;
    }

    @Override  // androidx.appcompat.view.WindowCallbackWrapper
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback actionMode$Callback0, int v) {
        B b0 = this.c0;
        b0.getClass();
        if(v != 0) {
            return super.onWindowStartingActionMode(actionMode$Callback0, v);
        }
        C c0 = new C();  // initializer: Ljava/lang/Object;-><init>()V
        c0.Y = b0.i0;
        c0.X = actionMode$Callback0;
        c0.Z = new ArrayList();
        c0.b0 = new s.J(0);
        a a0 = b0.s0;
        if(a0 != null) {
            a0.a();
        }
        c c1 = new c(b0, 12, c0);
        b0.B();
        h h0 = b0.m0;
        if(h0 != null) {
            b0.s0 = h0.l0(c1);
        }
        if(b0.s0 == null) {
            V v1 = b0.w0;
            if(v1 != null) {
                v1.b();
            }
            a a1 = b0.s0;
            if(a1 != null) {
                a1.a();
            }
            if(b0.t0 == null) {
                Context context0 = b0.i0;
                if(b0.G0) {
                    TypedValue typedValue0 = new TypedValue();
                    Resources.Theme resources$Theme0 = context0.getTheme();
                    resources$Theme0.resolveAttribute(0x7F04000B, typedValue0, true);  // attr:actionBarTheme
                    if(typedValue0.resourceId != 0) {
                        Resources.Theme resources$Theme1 = context0.getResources().newTheme();
                        resources$Theme1.setTo(resources$Theme0);
                        resources$Theme1.applyStyle(typedValue0.resourceId, true);
                        androidx.appcompat.view.c c2 = new androidx.appcompat.view.c(context0, 0);
                        c2.getTheme().setTo(resources$Theme1);
                        context0 = c2;
                    }
                    b0.t0 = new ActionBarContextView(context0, null);
                    PopupWindow popupWindow0 = new PopupWindow(context0, null, 0x7F04001A);  // attr:actionModePopupWindowStyle
                    b0.u0 = popupWindow0;
                    popupWindow0.setWindowLayoutType(2);
                    b0.u0.setContentView(b0.t0);
                    b0.u0.setWidth(-1);
                    context0.getTheme().resolveAttribute(0x7F040005, typedValue0, true);  // attr:actionBarSize
                    int v2 = TypedValue.complexToDimensionPixelSize(typedValue0.data, context0.getResources().getDisplayMetrics());
                    b0.t0.setContentHeight(v2);
                    b0.u0.setHeight(-2);
                    b0.v0 = new p(b0, 1);
                }
                else {
                    ViewStubCompat viewStubCompat0 = (ViewStubCompat)b0.y0.findViewById(0x7F0A0045);  // id:action_mode_bar_stub
                    if(viewStubCompat0 != null) {
                        b0.B();
                        Context context1 = b0.m0 == null ? null : b0.m0.T();
                        if(context1 != null) {
                            context0 = context1;
                        }
                        viewStubCompat0.setLayoutInflater(LayoutInflater.from(context0));
                        b0.t0 = (ActionBarContextView)viewStubCompat0.a();
                    }
                }
            }
            if(b0.t0 != null) {
                V v3 = b0.w0;
                if(v3 != null) {
                    v3.b();
                }
                b0.t0.e();
                Context context2 = b0.t0.getContext();
                ActionBarContextView actionBarContextView0 = b0.t0;
                d d0 = new d();  // initializer: Ljava/lang/Object;-><init>()V
                d0.Z = context2;
                d0.b0 = actionBarContextView0;
                d0.c0 = c1;
                j j0 = new j(actionBarContextView0.getContext());
                j0.l = 1;
                d0.f0 = j0;
                j0.e = d0;
                if(((C)c1.Y).I(d0, j0)) {
                    d0.h();
                    b0.t0.c(d0);
                    b0.s0 = d0;
                    if(!b0.x0 || (b0.y0 == null || !b0.y0.isLaidOut())) {
                        b0.t0.setAlpha(1.0f);
                        b0.t0.setVisibility(0);
                        if(b0.t0.getParent() instanceof View) {
                            J1.C.c(((View)b0.t0.getParent()));
                        }
                    }
                    else {
                        b0.t0.setAlpha(0.0f);
                        V v4 = N.a(b0.t0);
                        v4.a(1.0f);
                        b0.w0 = v4;
                        v4.d(new r(1, b0));
                    }
                    if(b0.u0 != null) {
                        b0.j0.getDecorView().post(b0.v0);
                    }
                }
                else {
                    b0.s0 = null;
                }
            }
            b0.J();
            b0.s0 = b0.s0;
        }
        b0.J();
        a a2 = b0.s0;
        return a2 != null ? c0.A(a2) : null;
    }
}

