package d1;

import B.m0;
import B8.c;
import Bb.F;
import E7.D;
import F0.i0;
import F0.j0;
import I.U0;
import I2.J;
import J1.n;
import M0.k;
import T0.G;
import U.j;
import Z6.b;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.Region;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.unit.Density;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import g0.l;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import s.y;
import yc.d;
import z0.r;

public abstract class h extends ViewGroup implements j0, n, j {
    public final NestedScrollDispatcher b0;
    public final View c0;
    public final i0 d0;
    public Function0 e0;
    public boolean f0;
    public Function0 g0;
    public Function0 h0;
    public Modifier i0;
    public Function1 j0;
    public Density k0;
    public Function1 l0;
    public LifecycleOwner m0;
    public SavedStateRegistryOwner n0;
    public final g o0;
    public final g p0;
    public Function1 q0;
    public final int[] r0;
    public int s0;
    public int t0;
    public final c u0;
    public boolean v0;
    public final LayoutNode w0;

    public h(Context context0, CompositionContext compositionContext0, int v, NestedScrollDispatcher nestedScrollDispatcher0, View view0, i0 i00) {
        super(context0);
        this.b0 = nestedScrollDispatcher0;
        this.c0 = view0;
        this.d0 = i00;
        if(compositionContext0 != null) {
            this.setTag(0x7F0A006C, compositionContext0);  // id:androidx_compose_ui_view_composition_context
        }
        this.setSaveFromParentEnabled(false);
        this.addView(view0);
        this.e0 = f.b0;
        this.g0 = f.Z;
        this.h0 = f.Y;
        this.i0 = l.X;
        this.k0 = b.b();
        this.o0 = new g(((o)this), 1);
        this.p0 = new g(((o)this), 0);
        this.r0 = new int[2];
        this.s0 = 0x80000000;
        this.t0 = 0x80000000;
        this.u0 = new c(1);
        LayoutNode layoutNode0 = new LayoutNode(3, 0, false);
        layoutNode0.h0 = (o)this;
        Modifier modifier0 = k.a(a.a(l.X, d1.j.a, nestedScrollDispatcher0), true, d1.a.b0);
        r r0 = new r();
        r0.X = new d1.c(((o)this), 1);
        Y3.o o0 = new Y3.o();
        Y3.o o1 = r0.Y;
        if(o1 != null) {
            o1.Y = null;
        }
        r0.Y = o0;
        o0.Y = r0;
        this.setOnRequestDisallowInterceptTouchEvent$ui_release(o0);
        Modifier modifier1 = androidx.compose.ui.layout.a.d(androidx.compose.ui.draw.a.a(modifier0.d(r0), new m0(((o)this), layoutNode0, ((o)this), 15)), new d1.b(((o)this), layoutNode0, 2));
        layoutNode0.Z(this.i0.d(modifier1));
        this.j0 = new G(layoutNode0, 8, modifier1);
        layoutNode0.W(this.k0);
        this.l0 = new V2.a(6, layoutNode0);
        layoutNode0.B0 = new d1.b(((o)this), layoutNode0, 0);
        layoutNode0.C0 = new d1.c(((o)this), 0);
        layoutNode0.Y(new U0(((o)this), 1, layoutNode0));
        this.w0 = layoutNode0;
    }

    @Override  // J1.m
    public final void a(View view0, View view1, int v, int v1) {
        c c0 = this.u0;
        if(v1 == 1) {
            c0.c = v;
            return;
        }
        c0.b = v;
    }

    @Override  // J1.m
    public final void b(View view0, int v) {
        c c0 = this.u0;
        if(v == 1) {
            c0.c = 0;
            return;
        }
        c0.b = 0;
    }

    @Override  // J1.m
    public final void c(View view0, int v, int v1, int[] arr_v, int v2) {
        if(!this.c0.isNestedScrollingEnabled()) {
            return;
        }
        y0.f f0 = this.b0.a;
        y0.f f1 = f0 == null || !f0.k0 ? null : ((y0.f)F0.f.k(f0));
        long v3 = f1 == null ? 0L : f1.e0((v2 == 0 ? 1 : 2), d.d(((float)v) * -1.0f, ((float)v1) * -1.0f));
        arr_v[0] = G0.G.d(m0.b.d(v3));
        arr_v[1] = G0.G.d(m0.b.e(v3));
    }

    @Override  // U.j
    public final void d() {
        View view0 = this.c0;
        if(view0.getParent() != this) {
            this.addView(view0);
            return;
        }
        this.g0.invoke();
    }

    @Override  // U.j
    public final void e() {
        this.h0.invoke();
    }

    @Override  // U.j
    public final void f() {
        this.g0.invoke();
        this.removeAllViewsInLayout();
    }

    @Override  // J1.n
    public final void g(View view0, int v, int v1, int v2, int v3, int v4, int[] arr_v) {
        if(!this.c0.isNestedScrollingEnabled()) {
            return;
        }
        y0.f f0 = this.b0.a;
        y0.f f1 = f0 == null || !f0.k0 ? null : ((y0.f)F0.f.k(f0));
        long v5 = f1 == null ? 0L : f1.Q(d.d(((float)v) * -1.0f, ((float)v1) * -1.0f), d.d(((float)v2) * -1.0f, ((float)v3) * -1.0f), (v4 == 0 ? 1 : 2));
        arr_v[0] = G0.G.d(m0.b.d(v5));
        arr_v[1] = G0.G.d(m0.b.e(v5));
    }

    @Override  // android.view.ViewGroup
    public final boolean gatherTransparentRegion(Region region0) {
        if(region0 == null) {
            return true;
        }
        this.getLocationInWindow(this.r0);
        int v = this.r0[0];
        int v1 = this.r0[1];
        int v2 = this.getWidth();
        int v3 = this.r0[1];
        region0.op(v, v1, v2 + v, this.getHeight() + v3, Region.Op.DIFFERENCE);
        return true;
    }

    @Override  // android.view.ViewGroup
    public CharSequence getAccessibilityClassName() {
        return this.getClass().getName();
    }

    public final Density getDensity() {
        return this.k0;
    }

    public final View getInteropView() {
        return this.c0;
    }

    public final LayoutNode getLayoutNode() {
        return this.w0;
    }

    @Override  // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.c0.getLayoutParams();
        return viewGroup$LayoutParams0 == null ? new ViewGroup.LayoutParams(-1, -1) : viewGroup$LayoutParams0;
    }

    public final LifecycleOwner getLifecycleOwner() {
        return this.m0;
    }

    public final Modifier getModifier() {
        return this.i0;
    }

    @Override  // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.u0.c | this.u0.b;
    }

    public final Function1 getOnDensityChanged$ui_release() {
        return this.l0;
    }

    public final Function1 getOnModifierChanged$ui_release() {
        return this.j0;
    }

    public final Function1 getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.q0;
    }

    public final Function0 getRelease() {
        return this.h0;
    }

    public final Function0 getReset() {
        return this.g0;
    }

    public final SavedStateRegistryOwner getSavedStateRegistryOwner() {
        return this.n0;
    }

    private final OwnerSnapshotObserver getSnapshotObserver() {
        if(this.isAttachedToWindow()) {
            return this.d0.getSnapshotObserver();
        }
        M6.b.T("Expected AndroidViewHolder to be attached when observing reads.");
        throw null;
    }

    public final Function0 getUpdate() {
        return this.e0;
    }

    public final View getView() {
        return this.c0;
    }

    @Override  // J1.m
    public final void h(View view0, int v, int v1, int v2, int v3, int v4) {
        if(!this.c0.isNestedScrollingEnabled()) {
            return;
        }
        long v5 = d.d(((float)v) * -1.0f, ((float)v1) * -1.0f);
        long v6 = d.d(((float)v2) * -1.0f, ((float)v3) * -1.0f);
        y0.f f0 = this.b0.a;
        y0.f f1 = f0 == null || !f0.k0 ? null : ((y0.f)F0.f.k(f0));
        if(f1 != null) {
            f1.Q(v5, v6, (v4 == 0 ? 1 : 2));
        }
    }

    @Override  // J1.m
    public final boolean i(View view0, View view1, int v, int v1) {
        return (v & 2) != 0 || (v & 1) != 0;
    }

    @Override  // android.view.ViewGroup
    public final ViewParent invalidateChildInParent(int[] arr_v, Rect rect0) {
        super.invalidateChildInParent(arr_v, rect0);
        if(this.v0) {
            D d0 = new D(24, this.p0);
            this.c0.postOnAnimation(d0);
            return null;
        }
        this.w0.z();
        return null;
    }

    @Override  // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.c0.isNestedScrollingEnabled();
    }

    public static final OwnerSnapshotObserver j(o o0) {
        return o0.getSnapshotObserver();
    }

    public static final int k(o o0, int v, int v1, int v2) {
        if(v2 < 0 && v != v1) {
            if(v2 == -2 && v1 != 0x7FFFFFFF) {
                return View.MeasureSpec.makeMeasureSpec(v1, 0x80000000);
            }
            return v2 != -1 || v1 == 0x7FFFFFFF ? 0 : View.MeasureSpec.makeMeasureSpec(v1, 0x40000000);
        }
        return View.MeasureSpec.makeMeasureSpec(J.r(v2, v, v1), 0x40000000);
    }

    @Override  // android.view.ViewGroup
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.o0.invoke();
    }

    @Override  // android.view.ViewGroup
    public final void onDescendantInvalidated(View view0, View view1) {
        super.onDescendantInvalidated(view0, view1);
        if(this.v0) {
            D d0 = new D(24, this.p0);
            this.c0.postOnAnimation(d0);
            return;
        }
        this.w0.z();
    }

    @Override  // android.view.ViewGroup
    public final void onDetachedFromWindow() {
        int v7;
        super.onDetachedFromWindow();
        OwnerSnapshotObserver ownerSnapshotObserver0 = this.getSnapshotObserver();
        synchronized(ownerSnapshotObserver0.a.f) {
            W.d d1 = ownerSnapshotObserver0.a.f;
            int v1 = d1.Z;
            int v2 = 0;
            int v3 = 0;
            while(v2 < v1) {
                e0.r r0 = (e0.r)d1.X[v2];
                y y0 = (y)r0.f.g(this);
                if(y0 == null) {
                    v7 = v2;
                }
                else {
                    Object[] arr_object = y0.b;
                    int[] arr_v = y0.c;
                    long[] arr_v1 = y0.a;
                    int v4 = arr_v1.length - 2;
                    if(v4 >= 0) {
                        int v5 = 0;
                        while(true) {
                            long v6 = arr_v1[v5];
                            v7 = v2;
                            if((~v6 << 7 & v6 & 0x8080808080808080L) == 0x8080808080808080L) {
                                goto label_34;
                            }
                            int v8 = 8 - (~(v5 - v4) >>> 0x1F);
                            for(int v9 = 0; v9 < v8; ++v9) {
                                if((v6 & 0xFFL) < 0x80L) {
                                    int v10 = (v5 << 3) + v9;
                                    Object object0 = arr_object[v10];
                                    int v11 = arr_v[v10];
                                    r0.d(this, object0);
                                }
                                v6 >>= 8;
                            }
                            if(v8 == 8) {
                            label_34:
                                if(v5 != v4) {
                                    ++v5;
                                    v2 = v7;
                                    continue;
                                }
                            }
                            break;
                        }
                    }
                    else {
                        v7 = v2;
                    }
                }
                if(r0.f.e == 0) {
                    ++v3;
                }
                else if(v3 > 0) {
                    d1.X[v7 - v3] = d1.X[v7];
                }
                v2 = v7 + 1;
            }
            int v12 = v1 - v3;
            Arrays.fill(d1.X, v12, v1, null);
            d1.Z = v12;
        }
    }

    @Override  // android.view.ViewGroup
    public final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        this.c0.layout(0, 0, v2 - v, v3 - v1);
    }

    @Override  // android.view.View
    public final void onMeasure(int v, int v1) {
        View view0 = this.c0;
        if(view0.getParent() != this) {
            this.setMeasuredDimension(View.MeasureSpec.getSize(v), View.MeasureSpec.getSize(v1));
            return;
        }
        if(view0.getVisibility() == 8) {
            this.setMeasuredDimension(0, 0);
            return;
        }
        view0.measure(v, v1);
        this.setMeasuredDimension(view0.getMeasuredWidth(), view0.getMeasuredHeight());
        this.s0 = v;
        this.t0 = v1;
    }

    @Override  // android.view.ViewGroup
    public final boolean onNestedFling(View view0, float f, float f1, boolean z) {
        if(!this.c0.isNestedScrollingEnabled()) {
            return false;
        }
        Xb.J.q(this.b0.c(), null, null, new d1.d(z, this, F.f(f * -1.0f, f1 * -1.0f), null), 3);
        return false;
    }

    @Override  // android.view.ViewGroup
    public final boolean onNestedPreFling(View view0, float f, float f1) {
        if(!this.c0.isNestedScrollingEnabled()) {
            return false;
        }
        Xb.J.q(this.b0.c(), null, null, new e(this, F.f(f * -1.0f, f1 * -1.0f), null), 3);
        return false;
    }

    @Override  // android.view.View
    public final void onWindowVisibilityChanged(int v) {
        super.onWindowVisibilityChanged(v);
    }

    @Override  // android.view.ViewGroup
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        Function1 function10 = this.q0;
        if(function10 != null) {
            function10.n(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(Density density0) {
        if(density0 != this.k0) {
            this.k0 = density0;
            Function1 function10 = this.l0;
            if(function10 != null) {
                function10.n(density0);
            }
        }
    }

    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner0) {
        if(lifecycleOwner0 != this.m0) {
            this.m0 = lifecycleOwner0;
            ViewTreeLifecycleOwner.b(this, lifecycleOwner0);
        }
    }

    public final void setModifier(Modifier modifier0) {
        if(modifier0 != this.i0) {
            this.i0 = modifier0;
            Function1 function10 = this.j0;
            if(function10 != null) {
                function10.n(modifier0);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(Function1 function10) {
        this.l0 = function10;
    }

    public final void setOnModifierChanged$ui_release(Function1 function10) {
        this.j0 = function10;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(Function1 function10) {
        this.q0 = function10;
    }

    public final void setRelease(Function0 function00) {
        this.h0 = function00;
    }

    public final void setReset(Function0 function00) {
        this.g0 = function00;
    }

    public final void setSavedStateRegistryOwner(SavedStateRegistryOwner savedStateRegistryOwner0) {
        if(savedStateRegistryOwner0 != this.n0) {
            this.n0 = savedStateRegistryOwner0;
            W5.f.U(this, savedStateRegistryOwner0);
        }
    }

    public final void setUpdate(Function0 function00) {
        this.e0 = function00;
        this.f0 = true;
        this.o0.invoke();
    }

    @Override  // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override  // F0.j0
    public final boolean y() {
        return this.isAttachedToWindow();
    }
}

