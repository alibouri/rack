package n;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View.OnKeyListener;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import i.s;
import java.lang.reflect.Method;
import java.util.ArrayList;
import m5.b;
import o.f0;
import o.p0;
import o.q0;
import o.s0;

public final class e extends q implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public final Context Y;
    public final int Z;
    public final int b0;
    public final boolean c0;
    public final Handler d0;
    public final ArrayList e0;
    public final ArrayList f0;
    public final c g0;
    public final G0.q h0;
    public final s i0;
    public int j0;
    public int k0;
    public View l0;
    public View m0;
    public int n0;
    public boolean o0;
    public boolean p0;
    public int q0;
    public int r0;
    public boolean s0;
    public boolean t0;
    public t u0;
    public ViewTreeObserver v0;
    public r w0;
    public boolean x0;

    public e(Context context0, View view0, int v, boolean z) {
        this.e0 = new ArrayList();
        this.f0 = new ArrayList();
        this.g0 = new c(0, this);
        this.h0 = new G0.q(6, this);
        this.i0 = new s(this);
        int v1 = 0;
        this.j0 = 0;
        this.k0 = 0;
        this.Y = context0;
        this.l0 = view0;
        this.b0 = v;
        this.c0 = z;
        this.s0 = false;
        if(view0.getLayoutDirection() != 1) {
            v1 = 1;
        }
        this.n0 = v1;
        Resources resources0 = context0.getResources();
        this.Z = Math.max(resources0.getDisplayMetrics().widthPixels / 2, resources0.getDimensionPixelSize(0x7F070017));  // dimen:abc_config_prefDialogWidth
        this.d0 = new Handler();
    }

    @Override  // n.y
    public final void a() {
        if(this.e()) {
            return;
        }
        ArrayList arrayList0 = this.e0;
        for(Object object0: arrayList0) {
            this.v(((j)object0));
        }
        arrayList0.clear();
        View view0 = this.l0;
        this.m0 = view0;
        if(view0 != null) {
            boolean z = this.v0 == null;
            ViewTreeObserver viewTreeObserver0 = view0.getViewTreeObserver();
            this.v0 = viewTreeObserver0;
            if(z) {
                viewTreeObserver0.addOnGlobalLayoutListener(this.g0);
            }
            this.m0.addOnAttachStateChangeListener(this.h0);
        }
    }

    @Override  // n.u
    public final void b(j j0, boolean z) {
        ArrayList arrayList0 = this.f0;
        int v = arrayList0.size();
        int v1;
        for(v1 = 0; true; ++v1) {
            if(v1 >= v) {
                v1 = -1;
                break;
            }
            if(j0 == ((d)arrayList0.get(v1)).b) {
                break;
            }
        }
        if(v1 < 0) {
            return;
        }
        if(v1 + 1 < arrayList0.size()) {
            ((d)arrayList0.get(v1 + 1)).b.c(false);
        }
        d d0 = (d)arrayList0.remove(v1);
        d0.b.r(this);
        s0 s00 = d0.a;
        if(this.x0) {
            p0.b(s00.w0, null);
            s00.w0.setAnimationStyle(0);
        }
        s00.dismiss();
        int v2 = arrayList0.size();
        if(v2 > 0) {
            this.n0 = ((d)arrayList0.get(v2 - 1)).c;
        }
        else {
            this.n0 = this.l0.getLayoutDirection() == 1 ? 0 : 1;
        }
        if(v2 == 0) {
            this.dismiss();
            t t0 = this.u0;
            if(t0 != null) {
                t0.b(j0, true);
            }
            ViewTreeObserver viewTreeObserver0 = this.v0;
            if(viewTreeObserver0 != null) {
                if(viewTreeObserver0.isAlive()) {
                    this.v0.removeGlobalOnLayoutListener(this.g0);
                }
                this.v0 = null;
            }
            this.m0.removeOnAttachStateChangeListener(this.h0);
            this.w0.onDismiss();
            return;
        }
        if(z) {
            ((d)arrayList0.get(0)).b.c(false);
        }
    }

    @Override  // n.u
    public final void d() {
        for(Object object0: this.f0) {
            ListAdapter listAdapter0 = ((d)object0).a.Z.getAdapter();
            (listAdapter0 instanceof HeaderViewListAdapter ? ((h)((HeaderViewListAdapter)listAdapter0).getWrappedAdapter()) : ((h)listAdapter0)).notifyDataSetChanged();
        }
    }

    @Override  // n.y
    public final void dismiss() {
        ArrayList arrayList0 = this.f0;
        int v = arrayList0.size();
        if(v > 0) {
            d[] arr_d = (d[])arrayList0.toArray(new d[v]);
            for(int v1 = v - 1; v1 >= 0; --v1) {
                d d0 = arr_d[v1];
                if(d0.a.w0.isShowing()) {
                    d0.a.dismiss();
                }
            }
        }
    }

    @Override  // n.y
    public final boolean e() {
        return this.f0.size() > 0 && ((d)this.f0.get(0)).a.w0.isShowing();
    }

    // Deobfuscation rating: LOW(20)
    @Override  // n.y
    public final f0 g() {
        return this.f0.isEmpty() ? null : ((d)b.r(1, this.f0)).a.Z;
    }

    @Override  // n.u
    public final boolean h(A a0) {
        for(Object object0: this.f0) {
            d d0 = (d)object0;
            if(a0 == d0.b) {
                d0.a.Z.requestFocus();
                return true;
            }
            if(false) {
                break;
            }
        }
        if(a0.hasVisibleItems()) {
            this.l(a0);
            t t0 = this.u0;
            if(t0 != null) {
                t0.j(a0);
            }
            return true;
        }
        return false;
    }

    @Override  // n.u
    public final boolean i() {
        return false;
    }

    @Override  // n.u
    public final void j(t t0) {
        this.u0 = t0;
    }

    @Override  // n.q
    public final void l(j j0) {
        j0.b(this, this.Y);
        if(this.e()) {
            this.v(j0);
            return;
        }
        this.e0.add(j0);
    }

    @Override  // n.q
    public final void n(View view0) {
        if(this.l0 != view0) {
            this.l0 = view0;
            this.k0 = Gravity.getAbsoluteGravity(this.j0, view0.getLayoutDirection());
        }
    }

    @Override  // n.q
    public final void o(boolean z) {
        this.s0 = z;
    }

    @Override  // android.widget.PopupWindow$OnDismissListener
    public final void onDismiss() {
        d d0;
        ArrayList arrayList0 = this.f0;
        int v = arrayList0.size();
        for(int v1 = 0; true; ++v1) {
            d0 = null;
            if(v1 >= v) {
                break;
            }
            d d1 = (d)arrayList0.get(v1);
            if(!d1.a.w0.isShowing()) {
                d0 = d1;
                break;
            }
        }
        if(d0 != null) {
            d0.b.c(false);
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
        if(this.j0 != v) {
            this.j0 = v;
            this.k0 = Gravity.getAbsoluteGravity(v, this.l0.getLayoutDirection());
        }
    }

    @Override  // n.q
    public final void q(int v) {
        this.o0 = true;
        this.q0 = v;
    }

    @Override  // n.q
    public final void r(PopupWindow.OnDismissListener popupWindow$OnDismissListener0) {
        this.w0 = (r)popupWindow$OnDismissListener0;
    }

    @Override  // n.q
    public final void s(boolean z) {
        this.t0 = z;
    }

    @Override  // n.q
    public final void t(int v) {
        this.p0 = true;
        this.r0 = v;
    }

    public final void v(j j0) {
        int v13;
        int v10;
        int v9;
        int v8;
        h h1;
        int v3;
        View view0;
        d d0;
        Context context0 = this.Y;
        LayoutInflater layoutInflater0 = LayoutInflater.from(context0);
        h h0 = new h(j0, layoutInflater0, this.c0, 0x7F0D000B);  // layout:abc_cascading_menu_item_layout
        if(!this.e() && this.s0) {
            h0.Z = true;
        }
        else if(this.e()) {
            h0.Z = q.u(j0);
        }
        int v = q.m(h0, context0, this.Z);
        s0 s00 = new s0(context0, null, this.b0);  // initializer: Lo/o0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
        o.r r0 = s00.w0;
        s00.A0 = this.i0;
        s00.n0 = this;
        r0.setOnDismissListener(this);
        s00.m0 = this.l0;
        s00.j0 = this.k0;
        s00.v0 = true;
        r0.setFocusable(true);
        r0.setInputMethodMode(2);
        s00.q(h0);
        s00.c(v);
        s00.j0 = this.k0;
        ArrayList arrayList0 = this.f0;
        if(arrayList0.size() > 0) {
            d0 = (d)b.r(1, arrayList0);
            j j1 = d0.b;
            int v1 = j1.f.size();
            for(int v2 = 0; true; ++v2) {
                MenuItem menuItem0 = null;
                if(v2 >= v1) {
                    break;
                }
                MenuItem menuItem1 = j1.getItem(v2);
                if(menuItem1.hasSubMenu() && j0 == menuItem1.getSubMenu()) {
                    menuItem0 = menuItem1;
                    break;
                }
            }
            if(menuItem0 == null) {
                view0 = null;
            }
            else {
                f0 f00 = d0.a.Z;
                ListAdapter listAdapter0 = f00.getAdapter();
                if(listAdapter0 instanceof HeaderViewListAdapter) {
                    v3 = ((HeaderViewListAdapter)listAdapter0).getHeadersCount();
                    h1 = (h)((HeaderViewListAdapter)listAdapter0).getWrappedAdapter();
                }
                else {
                    h1 = (h)listAdapter0;
                    v3 = 0;
                }
                int v4 = h1.getCount();
                int v5;
                for(v5 = 0; true; ++v5) {
                    if(v5 >= v4) {
                        v5 = -1;
                        break;
                    }
                    if(menuItem0 == h1.b(v5)) {
                        break;
                    }
                }
                if(v5 == -1) {
                    view0 = null;
                }
                else {
                    int v6 = v5 + v3 - f00.getFirstVisiblePosition();
                    view0 = v6 < 0 || v6 >= f00.getChildCount() ? null : f00.getChildAt(v6);
                }
            }
        }
        else {
            view0 = null;
            d0 = null;
        }
        if(view0 == null) {
            if(this.o0) {
                s00.d0 = this.q0;
            }
            if(this.p0) {
                s00.j(this.r0);
            }
            s00.u0 = this.X == null ? null : new Rect(this.X);
        }
        else {
            if(Build.VERSION.SDK_INT <= 28) {
                Method method0 = s0.B0;
                if(method0 != null) {
                    try {
                        method0.invoke(r0, Boolean.FALSE);
                    }
                    catch(Exception unused_ex) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            }
            else {
                q0.a(r0, false);
            }
            p0.a(r0, null);
            f0 f01 = ((d)arrayList0.get(arrayList0.size() - 1)).a.Z;
            int[] arr_v = new int[2];
            f01.getLocationOnScreen(arr_v);
            Rect rect0 = new Rect();
            this.m0.getWindowVisibleDisplayFrame(rect0);
            if(this.n0 == 1) {
                int v7 = arr_v[0];
                v8 = f01.getWidth() + v7 + v > rect0.right ? 0 : 1;
            }
            else {
                v8 = arr_v[0] - v < 0 ? 1 : 0;
            }
            this.n0 = v8;
            if(Build.VERSION.SDK_INT >= 26) {
                s00.m0 = view0;
                v9 = 0;
                v10 = 0;
            }
            else {
                int[] arr_v1 = new int[2];
                this.l0.getLocationOnScreen(arr_v1);
                int[] arr_v2 = new int[2];
                view0.getLocationOnScreen(arr_v2);
                if((this.k0 & 7) == 5) {
                    int v11 = arr_v1[0];
                    arr_v1[0] = this.l0.getWidth() + v11;
                    int v12 = arr_v2[0];
                    arr_v2[0] = view0.getWidth() + v12;
                }
                v10 = arr_v2[0] - arr_v1[0];
                v9 = arr_v2[1] - arr_v1[1];
            }
            if((this.k0 & 5) != 5) {
                v13 = v8 == 1 ? v10 - v : v10 + view0.getWidth();
            }
            else if(v8 == 1) {
                v13 = v10 + v;
            }
            else {
                v13 = v10 - view0.getWidth();
            }
            s00.d0 = v13;
            s00.i0 = true;
            s00.h0 = true;
            s00.j(v9);
        }
        arrayList0.add(new d(s00, j0, this.n0));
        s00.a();
        f0 f02 = s00.Z;
        f02.setOnKeyListener(this);
        if(d0 == null && this.t0 && j0.m != null) {
            FrameLayout frameLayout0 = (FrameLayout)layoutInflater0.inflate(0x7F0D0012, f02, false);  // layout:abc_popup_menu_header_item_layout
            TextView textView0 = (TextView)frameLayout0.findViewById(0x1020016);
            frameLayout0.setEnabled(false);
            textView0.setText(j0.m);
            f02.addHeaderView(frameLayout0, null, false);
            s00.a();
        }
    }
}

