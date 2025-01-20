package Z2;

import D0.j;
import T3.d;
import U.Z;
import U.t0;
import Xb.H;
import Xb.J;
import Y2.m;
import ac.B0;
import ac.o0;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import dc.e;
import dc.o;
import i3.h;
import kotlin.coroutines.CoroutineContext.Element.DefaultImpls;
import kotlin.jvm.functions.Function1;
import s0.a;
import s0.b;

public final class n extends b implements t0 {
    public e d0;
    public final B0 e0;
    public final ParcelableSnapshotMutableState f0;
    public final ParcelableSnapshotMutableFloatState g0;
    public final ParcelableSnapshotMutableState h0;
    public i i0;
    public b j0;
    public Function1 k0;
    public Function1 l0;
    public j m0;
    public int n0;
    public boolean o0;
    public final ParcelableSnapshotMutableState p0;
    public final ParcelableSnapshotMutableState q0;
    public final ParcelableSnapshotMutableState r0;
    public static final d s0;

    static {
        n.s0 = new d(10);
    }

    public n(i3.i i0, m m0) {
        this.e0 = o0.c(new m0.e(0L));
        this.f0 = U.d.D(null, Z.e);
        this.g0 = U.d.B(1.0f);
        this.h0 = U.d.D(null, Z.e);
        this.i0 = Z2.e.a;
        this.k0 = n.s0;
        this.m0 = D0.i.a;
        this.n0 = 1;
        this.p0 = U.d.D(Z2.e.a, Z.e);
        this.q0 = U.d.D(i0, Z.e);
        this.r0 = U.d.D(m0, Z.e);
    }

    @Override  // U.t0
    public final void a() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            if(this.d0 == null) {
                e e0 = H.a(DefaultImpls.d(J.c(), o.a.d0));
                this.d0 = e0;
                b b0 = null;
                t0 t00 = this.j0 instanceof t0 ? ((t0)this.j0) : null;
                if(t00 != null) {
                    t00.a();
                }
                if(this.o0) {
                    h h0 = i3.i.a(((i3.i)this.q0.getValue()));
                    h0.b = ((m)this.r0.getValue()).b;
                    h0.v = null;
                    i3.i i0 = h0.a();
                    Drawable drawable0 = m3.e.b(i0, i0.A, i0.D.j);
                    if(drawable0 != null) {
                        b0 = this.j(drawable0);
                    }
                    this.k(new g(b0));
                }
                else {
                    J.q(e0, null, null, new l(this, null), 3);
                }
            }
        }
        finally {
            Trace.endSection();
        }
    }

    @Override  // s0.b
    public final boolean b(float f) {
        this.g0.m(f);
        return true;
    }

    @Override  // U.t0
    public final void c() {
        e e0 = this.d0;
        t0 t00 = null;
        if(e0 != null) {
            H.b(e0, null);
        }
        this.d0 = null;
        b b0 = this.j0;
        if(b0 instanceof t0) {
            t00 = (t0)b0;
        }
        if(t00 != null) {
            t00.c();
        }
    }

    @Override  // U.t0
    public final void d() {
        e e0 = this.d0;
        t0 t00 = null;
        if(e0 != null) {
            H.b(e0, null);
        }
        this.d0 = null;
        b b0 = this.j0;
        if(b0 instanceof t0) {
            t00 = (t0)b0;
        }
        if(t00 != null) {
            t00.d();
        }
    }

    @Override  // s0.b
    public final boolean e(n0.n n0) {
        this.h0.setValue(n0);
        return true;
    }

    @Override  // s0.b
    public final long h() {
        b b0 = (b)this.f0.getValue();
        return b0 == null ? 0x7FC000007FC00000L : b0.h();
    }

    @Override  // s0.b
    public final void i(p0.d d0) {
        m0.e e0 = new m0.e(d0.d());
        this.e0.getClass();
        this.e0.l(null, e0);
        Object object0 = this.f0.getValue();
        if(((b)object0) != null) {
            ((b)object0).g(d0, d0.d(), this.g0.k(), ((n0.n)this.h0.getValue()));
        }
    }

    public final b j(Drawable drawable0) {
        if(drawable0 instanceof BitmapDrawable) {
            Bitmap bitmap0 = ((BitmapDrawable)drawable0).getBitmap();
            n0.g g0 = new n0.g(bitmap0);
            int v = this.n0;
            b b0 = new a(g0, 0L, io.sentry.config.a.d(bitmap0.getWidth(), bitmap0.getHeight()));
            b0.g0 = v;
            return b0;
        }
        return new l5.a(drawable0.mutate());
    }

    public final void k(i i0) {
        i i1 = this.i0;
        i i2 = (i)this.k0.n(i0);
        this.i0 = i2;
        this.p0.setValue(i2);
        if(i2 instanceof Z2.h) {
            ((Z2.h)i2).b.a().i.getClass();
        }
        else if(i2 instanceof f) {
            ((f)i2).b.a().i.getClass();
        }
        b b0 = i2.a();
        this.j0 = b0;
        this.f0.setValue(b0);
        if(this.d0 != null && i1.a() != i2.a()) {
            b b1 = i1.a();
            t0 t00 = null;
            t0 t01 = b1 instanceof t0 ? ((t0)b1) : null;
            if(t01 != null) {
                t01.d();
            }
            b b2 = i2.a();
            if(b2 instanceof t0) {
                t00 = (t0)b2;
            }
            if(t00 != null) {
                t00.a();
            }
        }
        Function1 function10 = this.l0;
        if(function10 != null) {
            function10.n(i2);
        }
    }
}

