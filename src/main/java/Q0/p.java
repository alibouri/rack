package q0;

import G0.N0;
import J2.w;
import Nb.k;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function1;
import n0.t;
import p0.b;
import p0.c;
import r0.a;

public final class p extends View {
    public final a b0;
    public final CanvasHolder c0;
    public final b d0;
    public boolean e0;
    public Outline f0;
    public boolean g0;
    public Density h0;
    public LayoutDirection i0;
    public k j0;
    public q0.b k0;
    public static final N0 l0;

    static {
        p.l0 = new N0(4);
    }

    public p(a a0, CanvasHolder canvasHolder0, b b0) {
        super(a0.getContext());
        this.b0 = a0;
        this.c0 = canvasHolder0;
        this.d0 = b0;
        this.setOutlineProvider(p.l0);
        this.g0 = true;
        this.h0 = c.a;
        this.i0 = LayoutDirection.X;
        d.a.getClass();
        this.j0 = q0.a.Z;
        this.setWillNotDraw(false);
        this.setClipBounds(null);
    }

    @Override  // android.view.View
    public final void dispatchDraw(Canvas canvas0) {
        Canvas canvas1 = this.c0.a.a;
        this.c0.a.a = canvas0;
        Density density0 = this.h0;
        LayoutDirection layoutDirection0 = this.i0;
        long v = w.m(this.getWidth(), this.getHeight());
        q0.b b0 = this.k0;
        k k0 = this.j0;
        Density density1 = this.d0.Y.q();
        LayoutDirection layoutDirection1 = this.d0.Y.z();
        t t0 = this.d0.Y.o();
        long v1 = this.d0.Y.A();
        q0.b b1 = (q0.b)this.d0.Y.Z;
        this.d0.Y.Q(density0);
        this.d0.Y.S(layoutDirection0);
        this.d0.Y.P(this.c0.a);
        this.d0.Y.T(v);
        this.d0.Y.Z = b0;
        this.c0.a.n();
        try {
            ((Function1)k0).n(this.d0);
        }
        finally {
            this.c0.a.l();
            this.d0.Y.Q(density1);
            this.d0.Y.S(layoutDirection1);
            this.d0.Y.P(t0);
            this.d0.Y.T(v1);
            this.d0.Y.Z = b1;
        }
        this.c0.a.a = canvas1;
        this.e0 = false;
    }

    @Override  // android.view.View
    public final void forceLayout() {
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.g0;
    }

    public final CanvasHolder getCanvasHolder() {
        return this.c0;
    }

    public final View getOwnerView() {
        return this.b0;
    }

    @Override  // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.g0;
    }

    @Override  // android.view.View
    public final void invalidate() {
        if(!this.e0) {
            this.e0 = true;
            super.invalidate();
        }
    }

    @Override  // android.view.View
    public final void onLayout(boolean z, int v, int v1, int v2, int v3) {
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z) {
        if(this.g0 != z) {
            this.g0 = z;
            this.invalidate();
        }
    }

    public final void setInvalidated(boolean z) {
        this.e0 = z;
    }
}

