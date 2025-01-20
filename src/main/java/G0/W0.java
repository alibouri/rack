package G0;

import Bb.q;
import I2.J;
import J2.w;
import android.graphics.Outline;
import android.os.Build.VERSION;
import androidx.compose.ui.graphics.Path;
import m0.a;
import m0.b;
import m0.d;
import m0.e;
import n0.H;
import n0.I;
import n0.K;
import n0.M;
import n0.j;
import n0.t;

public final class w0 {
    public boolean a;
    public final Outline b;
    public K c;
    public j d;
    public Path e;
    public boolean f;
    public boolean g;
    public Path h;
    public d i;
    public float j;
    public long k;
    public long l;
    public boolean m;

    public w0() {
        this.a = true;
        Outline outline0 = new Outline();
        outline0.setAlpha(1.0f);
        this.b = outline0;
        this.k = 0L;
        this.l = 0L;
    }

    public final void a(t t0) {
        this.d();
        Path path0 = this.e;
        if(path0 != null) {
            t0.j(path0, 1);
            return;
        }
        float f = this.j;
        if(f > 0.0f) {
            Path path1 = this.h;
            d d0 = this.i;
            if(path1 == null) {
            label_17:
                float f3 = b.d(this.k);
                float f4 = b.e(this.k);
                float f5 = b.d(this.k);
                float f6 = e.d(this.l);
                float f7 = b.e(this.k);
                float f8 = e.b(this.l);
                long v2 = q.a(this.j, this.j);
                long v3 = q.a(a.b(v2), a.c(v2));
                d d1 = new d(f3, f4, f6 + f5, f8 + f7, v3, v3, v3, v3);
                if(path1 == null) {
                    path1 = M.h();
                }
                else {
                    path1.reset();
                }
                path1.m(d1, 1);
                this.i = d1;
                this.h = path1;
            }
            else {
                long v = this.k;
                long v1 = this.l;
                if(d0 == null || !J.F(d0) || d0.a != b.d(v) || d0.b != b.e(v)) {
                    goto label_17;
                }
                else {
                    float f1 = e.d(v1);
                    if(d0.c == f1 + b.d(v)) {
                        float f2 = e.b(v1);
                        if(d0.d == f2 + b.e(v) || a.b(d0.e) == f) {
                            goto label_17;
                        }
                    }
                    else {
                        goto label_17;
                    }
                }
            }
            t0.j(path1, 1);
            return;
        }
        t0.i(b.d(this.k), b.e(this.k), b.d(this.k) + e.d(this.l), b.e(this.k) + e.b(this.l), 1);
    }

    public final Outline b() {
        this.d();
        return !this.m || !this.a ? null : this.b;
    }

    public final boolean c(K k0, float f, boolean z, float f1, long v) {
        this.b.setAlpha(f);
        boolean z1 = Nb.j.a(this.c, k0);
        if(!z1) {
            this.c = k0;
            this.f = true;
        }
        this.l = v;
        boolean z2 = k0 != null && (z || f1 <= 0.0f);
        if(this.m != z2) {
            this.m = z2;
            this.f = true;
        }
        return !z1;
    }

    public final void d() {
        if(this.f) {
            this.k = 0L;
            this.j = 0.0f;
            this.e = null;
            this.f = false;
            this.g = false;
            K k0 = this.c;
            Outline outline0 = this.b;
            if(k0 == null || !this.m || e.d(this.l) <= 0.0f || e.b(this.l) <= 0.0f) {
                outline0.setEmpty();
            }
            else {
                this.a = true;
                if(k0 instanceof I) {
                    this.k = yc.d.d(((I)k0).a.a, ((I)k0).a.b);
                    this.l = w.m(((I)k0).a.d(), ((I)k0).a.c());
                    outline0.setRect(Math.round(((I)k0).a.a), Math.round(((I)k0).a.b), Math.round(((I)k0).a.c), Math.round(((I)k0).a.d));
                    return;
                }
                if(k0 instanceof n0.J) {
                    d d0 = ((n0.J)k0).a;
                    float f = a.b(d0.e);
                    float f1 = d0.a;
                    float f2 = d0.b;
                    this.k = yc.d.d(f1, f2);
                    this.l = w.m(d0.b(), d0.a());
                    if(J.F(d0)) {
                        this.b.setRoundRect(Math.round(f1), Math.round(f2), Math.round(d0.c), Math.round(d0.d), f);
                        this.j = f;
                        return;
                    }
                    j j0 = this.d;
                    if(j0 == null) {
                        j0 = M.h();
                        this.d = j0;
                    }
                    j0.reset();
                    j0.m(d0, 1);
                    this.e(j0);
                    return;
                }
                if(k0 instanceof H) {
                    this.e(((H)k0).a);
                }
            }
        }
    }

    public final void e(Path path0) {
        Outline outline0 = this.b;
        if(Build.VERSION.SDK_INT <= 28 && !path0.e()) {
            this.a = false;
            outline0.setEmpty();
            this.g = true;
        }
        else if(path0 instanceof j) {
            outline0.setConvexPath(((j)path0).a);
            this.g = !outline0.canClip();
        }
        else {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.e = path0;
    }
}

