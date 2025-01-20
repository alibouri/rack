package q0;

import Bb.F;
import V2.a;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build.VERSION;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import n0.M;
import n0.o;
import n0.t;
import n0.v;
import p0.b;

public final class g implements d {
    public final CanvasHolder b;
    public final b c;
    public final RenderNode d;
    public long e;
    public Matrix f;
    public boolean g;
    public float h;
    public final int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public long o;
    public long p;
    public float q;
    public float r;
    public float s;
    public float t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;

    public g() {
        CanvasHolder canvasHolder0 = new CanvasHolder();
        b b0 = new b();
        super();
        this.b = canvasHolder0;
        this.c = b0;
        RenderNode renderNode0 = f.d();
        this.d = renderNode0;
        this.e = 0L;
        o.B(renderNode0);
        g.M(renderNode0, 0);
        this.h = 1.0f;
        this.i = 3;
        this.j = 1.0f;
        this.k = 1.0f;
        this.o = v.b;
        this.p = v.b;
        this.t = 8.0f;
        this.x = 0;
    }

    @Override  // q0.d
    public final float A() {
        return this.q;
    }

    @Override  // q0.d
    public final void B(int v) {
        this.x = v;
        if(!F.p(v, 1) && this.i == 3) {
            g.M(this.d, this.x);
            return;
        }
        g.M(this.d, 1);
    }

    @Override  // q0.d
    public final void C(long v) {
        this.p = v;
        int v1 = M.G(v);
        this.d.setSpotShadowColor(v1);
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
        return this.r;
    }

    @Override  // q0.d
    public final float F() {
        return this.n;
    }

    @Override  // q0.d
    public final float G() {
        return this.k;
    }

    @Override  // q0.d
    public final float H() {
        return this.s;
    }

    @Override  // q0.d
    public final int I() {
        return this.i;
    }

    @Override  // q0.d
    public final void J(long v) {
        if(yc.d.q(v)) {
            this.d.resetPivot();
            return;
        }
        this.d.setPivotX(m0.b.d(v));
        this.d.setPivotY(m0.b.e(v));
    }

    @Override  // q0.d
    public final long K() {
        return this.o;
    }

    public final void L() {
        boolean z = false;
        boolean z1 = this.u && !this.g;
        if(this.u && this.g) {
            z = true;
        }
        if(z1 != this.v) {
            this.v = z1;
            this.d.setClipToBounds(z1);
        }
        if(z != this.w) {
            this.w = z;
            this.d.setClipToOutline(z);
        }
    }

    public static void M(RenderNode renderNode0, int v) {
        switch(v) {
            case 1: {
                o.p(renderNode0);
                o.s(renderNode0);
                return;
            }
            case 2: {
                o.v(renderNode0);
                o.x(renderNode0);
                return;
            }
            default: {
                o.v(renderNode0);
                o.s(renderNode0);
            }
        }
    }

    @Override  // q0.d
    public final float a() {
        return this.h;
    }

    @Override  // q0.d
    public final void b(float f) {
        this.r = f;
        this.d.setRotationY(f);
    }

    @Override  // q0.d
    public final void c(float f) {
        this.h = f;
        this.d.setAlpha(f);
    }

    @Override  // q0.d
    public final void d() {
        if(Build.VERSION.SDK_INT >= 0x1F) {
            q0.o.a.a(this.d, null);
        }
    }

    @Override  // q0.d
    public final void e(Density density0, LayoutDirection layoutDirection0, q0.b b0, a a0) {
        RecordingCanvas recordingCanvas0 = this.d.beginRecording();
        try {
            Canvas canvas0 = this.b.a.a;
            this.b.a.a = recordingCanvas0;
            this.c.Y.Q(density0);
            this.c.Y.S(layoutDirection0);
            this.c.Y.Z = b0;
            this.c.Y.T(this.e);
            this.c.Y.P(this.b.a);
            a0.n(this.c);
            this.b.a.a = canvas0;
        }
        finally {
            this.d.endRecording();
        }
    }

    @Override  // q0.d
    public final void f(float f) {
        this.s = f;
        this.d.setRotationZ(f);
    }

    @Override  // q0.d
    public final void g(float f) {
        this.m = f;
        this.d.setTranslationY(f);
    }

    @Override  // q0.d
    public final void h(float f) {
        this.j = f;
        this.d.setScaleX(f);
    }

    @Override  // q0.d
    public final void i() {
        this.d.discardDisplayList();
    }

    @Override  // q0.d
    public final void j(float f) {
        this.l = f;
        this.d.setTranslationX(f);
    }

    @Override  // q0.d
    public final void k(float f) {
        this.k = f;
        this.d.setScaleY(f);
    }

    @Override  // q0.d
    public final float l() {
        return this.j;
    }

    @Override  // q0.d
    public final void m(float f) {
        this.t = f;
        this.d.setCameraDistance(f);
    }

    @Override  // q0.d
    public final boolean n() {
        return this.d.hasDisplayList();
    }

    @Override  // q0.d
    public final void o(float f) {
        this.q = f;
        this.d.setRotationX(f);
    }

    @Override  // q0.d
    public final void p(t t0) {
        n0.d.a(t0).drawRenderNode(this.d);
    }

    @Override  // q0.d
    public final void q(float f) {
        this.n = f;
        this.d.setElevation(f);
    }

    @Override  // q0.d
    public final float r() {
        return this.m;
    }

    @Override  // q0.d
    public final long s() {
        return this.p;
    }

    @Override  // q0.d
    public final void t(long v) {
        this.o = v;
        int v1 = M.G(v);
        this.d.setAmbientShadowColor(v1);
    }

    @Override  // q0.d
    public final void u(Outline outline0, long v) {
        this.d.setOutline(outline0);
        this.g = outline0 != null;
        this.L();
    }

    @Override  // q0.d
    public final float v() {
        return this.t;
    }

    @Override  // q0.d
    public final void w(int v, long v1, int v2) {
        this.d.setPosition(v, v2, ((int)(v1 >> 0x20)) + v, ((int)(0xFFFFFFFFL & v1)) + v2);
        this.e = io.sentry.config.a.a0(v1);
    }

    @Override  // q0.d
    public final float x() {
        return this.l;
    }

    @Override  // q0.d
    public final void y(boolean z) {
        this.u = z;
        this.L();
    }

    @Override  // q0.d
    public final int z() {
        return this.x;
    }
}

