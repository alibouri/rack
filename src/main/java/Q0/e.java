package q0;

import Nb.j;
import V2.a;
import a8.Q;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build.VERSION;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.concurrent.atomic.AtomicBoolean;
import n0.M;
import n0.c;
import n0.t;
import p0.b;

public final class e implements d {
    public static final AtomicBoolean A;
    public final CanvasHolder b;
    public final b c;
    public final RenderNode d;
    public long e;
    public Matrix f;
    public boolean g;
    public long h;
    public int i;
    public final int j;
    public float k;
    public boolean l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public long r;
    public long s;
    public float t;
    public float u;
    public float v;
    public float w;
    public boolean x;
    public boolean y;
    public boolean z;

    static {
        e.A = new AtomicBoolean(true);
    }

    public e(AndroidComposeView androidComposeView0, CanvasHolder canvasHolder0, b b0) {
        this.b = canvasHolder0;
        this.c = b0;
        RenderNode renderNode0 = RenderNode.create("Compose", androidComposeView0);
        this.d = renderNode0;
        this.e = 0L;
        this.h = 0L;
        if(e.A.getAndSet(false)) {
            renderNode0.setScaleX(renderNode0.getScaleX());
            renderNode0.setScaleY(renderNode0.getScaleY());
            renderNode0.setTranslationX(renderNode0.getTranslationX());
            renderNode0.setTranslationY(renderNode0.getTranslationY());
            renderNode0.setElevation(renderNode0.getElevation());
            renderNode0.setRotation(renderNode0.getRotation());
            renderNode0.setRotationX(renderNode0.getRotationX());
            renderNode0.setRotationY(renderNode0.getRotationY());
            renderNode0.setCameraDistance(renderNode0.getCameraDistance());
            renderNode0.setPivotX(renderNode0.getPivotX());
            renderNode0.setPivotY(renderNode0.getPivotY());
            renderNode0.setClipToOutline(renderNode0.getClipToOutline());
            renderNode0.setClipToBounds(false);
            renderNode0.setAlpha(renderNode0.getAlpha());
            renderNode0.isValid();
            renderNode0.setLeftTopRightBottom(0, 0, 0, 0);
            renderNode0.offsetLeftAndRight(0);
            renderNode0.offsetTopAndBottom(0);
            int v = Build.VERSION.SDK_INT;
            if(v >= 28) {
                int v1 = n.a.a(renderNode0);
                n.a.c(renderNode0, v1);
                int v2 = n.a.b(renderNode0);
                n.a.d(renderNode0, v2);
            }
            if(v >= 24) {
                m.a.a(renderNode0);
            }
            else {
                l.a.a(renderNode0);
            }
            renderNode0.setLayerType(0);
            renderNode0.setHasOverlappingRendering(renderNode0.hasOverlappingRendering());
        }
        renderNode0.setClipToBounds(false);
        this.M(0);
        this.i = 0;
        this.j = 3;
        this.k = 1.0f;
        this.m = 1.0f;
        this.n = 1.0f;
        this.r = 0L;
        this.s = 0L;
        this.w = 8.0f;
    }

    @Override  // q0.d
    public final float A() {
        return this.t;
    }

    @Override  // q0.d
    public final void B(int v) {
        this.i = v;
        if(v != 1 && this.j == 3) {
            this.M(this.i);
            return;
        }
        this.M(1);
    }

    @Override  // q0.d
    public final void C(long v) {
        if(Build.VERSION.SDK_INT >= 28) {
            this.s = v;
            int v1 = M.G(v);
            n.a.d(this.d, v1);
        }
    }

    @Override  // q0.d
    public final Matrix D() {
        Matrix matrix0 = this.f;
        if(matrix0 == null) {
            matrix0 = new Matrix();
            this.f = matrix0;
        }
        this.d.getMatrix(matrix0);
        return matrix0;
    }

    @Override  // q0.d
    public final float E() {
        return this.u;
    }

    @Override  // q0.d
    public final float F() {
        return this.q;
    }

    @Override  // q0.d
    public final float G() {
        return this.n;
    }

    @Override  // q0.d
    public final float H() {
        return this.v;
    }

    @Override  // q0.d
    public final int I() {
        return this.j;
    }

    @Override  // q0.d
    public final void J(long v) {
        if(yc.d.q(v)) {
            this.l = true;
            this.d.setPivotX(((float)IntSize.c(this.e)) / 2.0f);
            this.d.setPivotY(((float)IntSize.b(this.e)) / 2.0f);
            return;
        }
        this.l = false;
        this.d.setPivotX(m0.b.d(v));
        this.d.setPivotY(m0.b.e(v));
    }

    @Override  // q0.d
    public final long K() {
        return this.r;
    }

    public final void L() {
        boolean z = false;
        boolean z1 = this.x && !this.g;
        if(this.x && this.g) {
            z = true;
        }
        if(z1 != this.y) {
            this.y = z1;
            this.d.setClipToBounds(z1);
        }
        if(z != this.z) {
            this.z = z;
            this.d.setClipToOutline(z);
        }
    }

    public final void M(int v) {
        RenderNode renderNode0 = this.d;
        if(v == 1) {
            renderNode0.setLayerType(2);
            renderNode0.setLayerPaint(null);
            renderNode0.setHasOverlappingRendering(true);
            return;
        }
        if(v == 2) {
            renderNode0.setLayerType(0);
            renderNode0.setLayerPaint(null);
            renderNode0.setHasOverlappingRendering(false);
            return;
        }
        renderNode0.setLayerType(0);
        renderNode0.setLayerPaint(null);
        renderNode0.setHasOverlappingRendering(true);
    }

    @Override  // q0.d
    public final float a() {
        return this.k;
    }

    @Override  // q0.d
    public final void b(float f) {
        this.u = f;
        this.d.setRotationY(f);
    }

    @Override  // q0.d
    public final void c(float f) {
        this.k = f;
        this.d.setAlpha(f);
    }

    @Override  // q0.d
    public final void d() {
    }

    @Override  // q0.d
    public final void e(Density density0, LayoutDirection layoutDirection0, q0.b b0, a a0) {
        DisplayListCanvas displayListCanvas0 = this.d.start(Math.max(IntSize.c(this.e), IntSize.c(this.h)), Math.max(IntSize.b(this.e), IntSize.b(this.h)));
        try {
            CanvasHolder canvasHolder0 = this.b;
            Canvas canvas0 = canvasHolder0.a().v();
            canvasHolder0.a().w(((Canvas)displayListCanvas0));
            c c0 = canvasHolder0.a();
            b b1 = this.c;
            long v1 = io.sentry.config.a.a0(this.e);
            Density density1 = b1.A().q();
            LayoutDirection layoutDirection1 = b1.A().z();
            t t0 = b1.A().o();
            long v2 = b1.A().A();
            q0.b b2 = b1.A().y();
            Q q0 = b1.A();
            q0.Q(density0);
            q0.S(layoutDirection0);
            q0.P(c0);
            q0.T(v1);
            q0.R(b0);
            c0.n();
            try {
                a0.n(b1);
            }
            catch(Throwable throwable0) {
                c0.l();
                Q q1 = b1.A();
                q1.Q(density1);
                q1.S(layoutDirection1);
                q1.P(t0);
                q1.T(v2);
                q1.R(b2);
                throw throwable0;
            }
            c0.l();
            Q q2 = b1.A();
            q2.Q(density1);
            q2.S(layoutDirection1);
            q2.P(t0);
            q2.T(v2);
            q2.R(b2);
            canvasHolder0.a().w(canvas0);
        }
        finally {
            this.d.end(displayListCanvas0);
        }
    }

    @Override  // q0.d
    public final void f(float f) {
        this.v = f;
        this.d.setRotation(f);
    }

    @Override  // q0.d
    public final void g(float f) {
        this.p = f;
        this.d.setTranslationY(f);
    }

    @Override  // q0.d
    public final void h(float f) {
        this.m = f;
        this.d.setScaleX(f);
    }

    @Override  // q0.d
    public final void i() {
        if(Build.VERSION.SDK_INT >= 24) {
            m.a.a(this.d);
            return;
        }
        l.a.a(this.d);
    }

    @Override  // q0.d
    public final void j(float f) {
        this.o = f;
        this.d.setTranslationX(f);
    }

    @Override  // q0.d
    public final void k(float f) {
        this.n = f;
        this.d.setScaleY(f);
    }

    @Override  // q0.d
    public final float l() {
        return this.m;
    }

    @Override  // q0.d
    public final void m(float f) {
        this.w = f;
        this.d.setCameraDistance(-f);
    }

    @Override  // q0.d
    public final boolean n() {
        return this.d.isValid();
    }

    @Override  // q0.d
    public final void o(float f) {
        this.t = f;
        this.d.setRotationX(f);
    }

    @Override  // q0.d
    public final void p(t t0) {
        Canvas canvas0 = n0.d.a(t0);
        j.d(canvas0, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        ((DisplayListCanvas)canvas0).drawRenderNode(this.d);
    }

    @Override  // q0.d
    public final void q(float f) {
        this.q = f;
        this.d.setElevation(f);
    }

    @Override  // q0.d
    public final float r() {
        return this.p;
    }

    @Override  // q0.d
    public final long s() {
        return this.s;
    }

    @Override  // q0.d
    public final void t(long v) {
        if(Build.VERSION.SDK_INT >= 28) {
            this.r = v;
            int v1 = M.G(v);
            n.a.c(this.d, v1);
        }
    }

    @Override  // q0.d
    public final void u(Outline outline0, long v) {
        this.h = v;
        this.d.setOutline(outline0);
        this.g = outline0 != null;
        this.L();
    }

    @Override  // q0.d
    public final float v() {
        return this.w;
    }

    @Override  // q0.d
    public final void w(int v, long v1, int v2) {
        this.d.setLeftTopRightBottom(v, v2, IntSize.c(v1) + v, IntSize.b(v1) + v2);
        if(!IntSize.a(this.e, v1)) {
            if(this.l) {
                this.d.setPivotX(((float)IntSize.c(v1)) / 2.0f);
                this.d.setPivotY(((float)IntSize.b(v1)) / 2.0f);
            }
            this.e = v1;
        }
    }

    @Override  // q0.d
    public final float x() {
        return this.o;
    }

    @Override  // q0.d
    public final void y(boolean z) {
        this.x = z;
        this.L();
    }

    @Override  // q0.d
    public final int z() {
        return this.i;
    }
}

