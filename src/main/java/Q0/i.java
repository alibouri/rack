package q0;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import n0.M;
import n0.t;
import n0.v;
import p0.b;
import r0.a;

public final class i implements d {
    public static final h A;
    public final a b;
    public final CanvasHolder c;
    public final p d;
    public final Resources e;
    public final Rect f;
    public int g;
    public int h;
    public long i;
    public boolean j;
    public boolean k;
    public boolean l;
    public final int m;
    public int n;
    public float o;
    public boolean p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public long v;
    public long w;
    public float x;
    public float y;
    public float z;

    static {
        i.A = new h();  // initializer: Landroid/graphics/Canvas;-><init>()V
    }

    public i(a a0) {
        CanvasHolder canvasHolder0 = new CanvasHolder();
        b b0 = new b();
        super();
        this.b = a0;
        this.c = canvasHolder0;
        p p0 = new p(a0, canvasHolder0, b0);
        this.d = p0;
        this.e = a0.getResources();
        this.f = new Rect();
        a0.addView(p0);
        p0.setClipBounds(null);
        this.i = 0L;
        View.generateViewId();
        this.m = 3;
        this.n = 0;
        this.o = 1.0f;
        this.q = 1.0f;
        this.r = 1.0f;
        this.v = v.b;
        this.w = v.b;
    }

    @Override  // q0.d
    public final float A() {
        return this.x;
    }

    @Override  // q0.d
    public final void B(int v) {
        this.n = v;
        if(v != 1 && this.m == 3) {
            this.L(this.n);
            return;
        }
        this.L(1);
    }

    @Override  // q0.d
    public final void C(long v) {
        if(Build.VERSION.SDK_INT >= 28) {
            this.w = v;
            int v1 = M.G(v);
            this.d.setOutlineSpotShadowColor(v1);
        }
    }

    @Override  // q0.d
    public final Matrix D() {
        return this.d.getMatrix();
    }

    @Override  // q0.d
    public final float E() {
        return this.y;
    }

    @Override  // q0.d
    public final float F() {
        return this.u;
    }

    @Override  // q0.d
    public final float G() {
        return this.r;
    }

    @Override  // q0.d
    public final float H() {
        return this.z;
    }

    @Override  // q0.d
    public final int I() {
        return this.m;
    }

    @Override  // q0.d
    public final void J(long v) {
        p p0 = this.d;
        if(yc.d.q(v)) {
            if(Build.VERSION.SDK_INT >= 28) {
                p0.resetPivot();
                return;
            }
            this.p = true;
            p0.setPivotX(((float)(((int)(this.i >> 0x20)))) / 2.0f);
            p0.setPivotY(((float)(((int)(this.i & 0xFFFFFFFFL)))) / 2.0f);
            return;
        }
        this.p = false;
        p0.setPivotX(m0.b.d(v));
        p0.setPivotY(m0.b.e(v));
    }

    @Override  // q0.d
    public final long K() {
        return this.v;
    }

    public final void L(int v) {
        boolean z = true;
        p p0 = this.d;
        if(v == 1) {
            p0.setLayerType(2, null);
        }
        else if(v == 2) {
            p0.setLayerType(0, null);
            z = false;
        }
        else {
            p0.setLayerType(0, null);
        }
        p0.setCanUseCompositingLayer$ui_graphics_release(z);
    }

    // Deobfuscation rating: LOW(20)
    public final boolean M() {
        return this.l || this.d.getClipToOutline();
    }

    @Override  // q0.d
    public final float a() {
        return this.o;
    }

    @Override  // q0.d
    public final void b(float f) {
        this.y = f;
        this.d.setRotationY(f);
    }

    @Override  // q0.d
    public final void c(float f) {
        this.o = f;
        this.d.setAlpha(f);
    }

    @Override  // q0.d
    public final void d() {
        if(Build.VERSION.SDK_INT >= 0x1F) {
            i0.a.h(this.d);
        }
    }

    @Override  // q0.d
    public final void e(Density density0, LayoutDirection layoutDirection0, q0.b b0, V2.a a0) {
        p p0 = this.d;
        ViewParent viewParent0 = p0.getParent();
        a a1 = this.b;
        if(viewParent0 == null) {
            a1.addView(p0);
        }
        p0.h0 = density0;
        p0.i0 = layoutDirection0;
        p0.j0 = a0;
        p0.k0 = b0;
        if(p0.isAttachedToWindow()) {
            p0.setVisibility(4);
            p0.setVisibility(0);
            try {
                Canvas canvas0 = this.c.a.a;
                this.c.a.a = i.A;
                long v = p0.getDrawingTime();
                a1.a(this.c.a, p0, v);
                this.c.a.a = canvas0;
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    @Override  // q0.d
    public final void f(float f) {
        this.z = f;
        this.d.setRotation(f);
    }

    @Override  // q0.d
    public final void g(float f) {
        this.t = f;
        this.d.setTranslationY(f);
    }

    @Override  // q0.d
    public final void h(float f) {
        this.q = f;
        this.d.setScaleX(f);
    }

    @Override  // q0.d
    public final void i() {
        this.b.removeViewInLayout(this.d);
    }

    @Override  // q0.d
    public final void j(float f) {
        this.s = f;
        this.d.setTranslationX(f);
    }

    @Override  // q0.d
    public final void k(float f) {
        this.r = f;
        this.d.setScaleY(f);
    }

    @Override  // q0.d
    public final float l() {
        return this.q;
    }

    @Override  // q0.d
    public final void m(float f) {
        DisplayMetrics displayMetrics0 = this.e.getDisplayMetrics();
        this.d.setCameraDistance(f * ((float)displayMetrics0.densityDpi));
    }

    @Override  // q0.d
    public final boolean n() {
        return true;
    }

    @Override  // q0.d
    public final void o(float f) {
        this.x = f;
        this.d.setRotationX(f);
    }

    @Override  // q0.d
    public final void p(t t0) {
        Rect rect0;
        p p0 = this.d;
        if(this.j) {
            if(!this.M() || this.k) {
                rect0 = null;
            }
            else {
                rect0 = this.f;
                rect0.left = 0;
                rect0.top = 0;
                rect0.right = p0.getWidth();
                rect0.bottom = p0.getHeight();
            }
            p0.setClipBounds(rect0);
        }
        if(n0.d.a(t0).isHardwareAccelerated()) {
            long v = p0.getDrawingTime();
            this.b.a(t0, p0, v);
        }
    }

    @Override  // q0.d
    public final void q(float f) {
        this.u = f;
        this.d.setElevation(f);
    }

    @Override  // q0.d
    public final float r() {
        return this.t;
    }

    @Override  // q0.d
    public final long s() {
        return this.w;
    }

    @Override  // q0.d
    public final void t(long v) {
        if(Build.VERSION.SDK_INT >= 28) {
            this.v = v;
            int v1 = M.G(v);
            this.d.setOutlineAmbientShadowColor(v1);
        }
    }

    @Override  // q0.d
    public final void u(Outline outline0, long v) {
        p p0 = this.d;
        p0.f0 = outline0;
        p0.invalidateOutline();
        boolean z = false;
        if(this.M() && outline0 != null) {
            p0.setClipToOutline(true);
            if(this.l) {
                this.l = false;
                this.j = true;
            }
        }
        if(outline0 != null) {
            z = true;
        }
        this.k = z;
    }

    @Override  // q0.d
    public final float v() {
        return this.d.getCameraDistance() / ((float)this.e.getDisplayMetrics().densityDpi);
    }

    @Override  // q0.d
    public final void w(int v, long v1, int v2) {
        p p0 = this.d;
        if(IntSize.a(this.i, v1)) {
            int v3 = this.g;
            if(v3 != v) {
                p0.offsetLeftAndRight(v - v3);
            }
            int v4 = this.h;
            if(v4 != v2) {
                p0.offsetTopAndBottom(v2 - v4);
            }
        }
        else {
            if(this.M()) {
                this.j = true;
            }
            p0.layout(v, v2, v + ((int)(v1 >> 0x20)), v2 + ((int)(0xFFFFFFFFL & v1)));
            this.i = v1;
            if(this.p) {
                p0.setPivotX(((float)(((int)(v1 >> 0x20)))) / 2.0f);
                p0.setPivotY(((float)(((int)(0xFFFFFFFFL & v1)))) / 2.0f);
            }
        }
        this.g = v;
        this.h = v2;
    }

    @Override  // q0.d
    public final float x() {
        return this.s;
    }

    @Override  // q0.d
    public final void y(boolean z) {
        boolean z1 = false;
        this.l = z && !this.k;
        this.j = true;
        if(z && this.k) {
            z1 = true;
        }
        this.d.setClipToOutline(z1);
    }

    @Override  // q0.d
    public final int z() {
        return this.n;
    }
}

