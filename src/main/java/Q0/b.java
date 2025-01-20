package q0;

import Bb.q;
import Nb.k;
import Q.C;
import V2.a;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build.VERSION;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import m0.e;
import n0.H;
import n0.I;
import n0.J;
import n0.K;
import n0.h;
import n0.j;
import p0.c;
import s.E;

public final class b {
    public final d a;
    public Density b;
    public LayoutDirection c;
    public k d;
    public final a e;
    public Outline f;
    public boolean g;
    public long h;
    public long i;
    public float j;
    public K k;
    public j l;
    public j m;
    public boolean n;
    public h o;
    public int p;
    public final C q;
    public boolean r;
    public long s;
    public long t;
    public long u;
    public boolean v;
    public RectF w;

    static {
    }

    public b(d d0) {
        this.a = d0;
        this.b = c.a;
        this.c = LayoutDirection.X;
        this.d = q0.a.Y;
        this.e = new a(18, this);
        this.g = true;
        this.h = 0L;
        this.i = 0x7FC000007FC00000L;
        this.q = new C();  // initializer: Ljava/lang/Object;-><init>()V
        d0.y(false);
        this.s = 0L;
        this.t = 0L;
        this.u = 0x7FC000007FC00000L;
    }

    public final void a() {
        Outline outline2;
        if(this.g) {
            d d0 = this.a;
            Outline outline0 = null;
            if(this.v || d0.F() > 0.0f) {
                j j0 = this.l;
                if(j0 == null) {
                    d0.y(this.v);
                    Outline outline3 = this.f;
                    if(outline3 == null) {
                        outline3 = new Outline();
                        this.f = outline3;
                    }
                    long v1 = this.h;
                    long v2 = this.i == 0x7FC000007FC00000L ? io.sentry.config.a.a0(this.t) : this.i;
                    outline3.setRoundRect(Math.round(m0.b.d(v1)), Math.round(m0.b.e(v1)), Math.round(e.d(v2) + m0.b.d(v1)), Math.round(e.b(v2) + m0.b.e(v1)), this.j);
                    outline3.setAlpha(d0.a());
                    float f = e.d(v2);
                    d0.u(outline3, ((long)Math.round(e.b(v2))) & 0xFFFFFFFFL | ((long)Math.round(f)) << 0x20);
                }
                else {
                    RectF rectF0 = this.w;
                    if(rectF0 == null) {
                        rectF0 = new RectF();
                        this.w = rectF0;
                    }
                    Path path0 = j0.a;
                    path0.computeBounds(rectF0, false);
                    int v = Build.VERSION.SDK_INT;
                    if(v > 28 || path0.isConvex()) {
                        outline2 = this.f;
                        if(outline2 == null) {
                            outline2 = new Outline();
                            this.f = outline2;
                        }
                        if(v >= 30) {
                            q0.k.a.a(outline2, j0);
                        }
                        else {
                            outline2.setConvexPath(path0);
                        }
                        this.n = !outline2.canClip();
                    }
                    else {
                        Outline outline1 = this.f;
                        if(outline1 != null) {
                            outline1.setEmpty();
                        }
                        this.n = true;
                        outline2 = null;
                    }
                    this.l = j0;
                    if(outline2 != null) {
                        outline2.setAlpha(d0.a());
                        outline0 = outline2;
                    }
                    d0.u(outline0, io.sentry.config.a.d(Math.round(rectF0.width()), Math.round(rectF0.height())));
                    if(!this.n || !this.v) {
                        d0.y(this.v);
                    }
                    else {
                        d0.y(false);
                        d0.i();
                    }
                }
            }
            else {
                d0.y(false);
                d0.u(null, 0L);
            }
        }
        this.g = false;
    }

    public final void b() {
        if(this.r && this.p == 0) {
            C c0 = this.q;
            b b0 = (b)c0.c;
            if(b0 != null) {
                b0.d();
                c0.c = null;
            }
            E e0 = (E)c0.a;
            if(e0 != null) {
                Object[] arr_object = e0.b;
                long[] arr_v = e0.a;
                int v = arr_v.length - 2;
                if(v >= 0) {
                    int v1 = 0;
                    while(true) {
                        long v2 = arr_v[v1];
                        if((~v2 << 7 & v2 & 0x8080808080808080L) == 0x8080808080808080L) {
                            goto label_26;
                        }
                        int v3 = 8 - (~(v1 - v) >>> 0x1F);
                        for(int v4 = 0; v4 < v3; ++v4) {
                            if((0xFFL & v2) < 0x80L) {
                                ((b)arr_object[(v1 << 3) + v4]).d();
                            }
                            v2 >>= 8;
                        }
                        if(v3 == 8) {
                        label_26:
                            if(v1 != v) {
                                ++v1;
                                continue;
                            }
                            break;
                        }
                        else {
                            e0.b();
                        }
                        this.a.i();
                        return;
                    }
                }
                e0.b();
            }
            this.a.i();
        }
    }

    public final K c() {
        K k0 = this.k;
        j j0 = this.l;
        if(k0 == null) {
            if(j0 != null) {
                k0 = new H(j0);
                this.k = k0;
                return k0;
            }
            long v = io.sentry.config.a.a0(this.t);
            long v1 = this.h;
            long v2 = this.i;
            if(v2 != 0x7FC000007FC00000L) {
                v = v2;
            }
            float f = m0.b.d(v1);
            float f1 = m0.b.e(v1);
            float f2 = e.d(v) + f;
            float f3 = e.b(v) + f1;
            float f4 = this.j;
            if(f4 > 0.0f) {
                long v3 = q.a(f4, f4);
                long v4 = q.a(m0.a.b(v3), m0.a.c(v3));
                k0 = new J(new m0.d(f, f1, f2, f3, v4, v4, v4, v4));
            }
            else {
                k0 = new I(new m0.c(f, f1, f2, f3));
            }
            this.k = k0;
        }
        return k0;
    }

    public final void d() {
        --this.p;
        this.b();
    }

    public final void e() {
        C c0 = this.q;
        c0.d = (b)c0.c;
        E e0 = (E)c0.a;
        if(e0 != null && e0.h()) {
            E e1 = (E)c0.e;
            if(e1 == null) {
                e1 = new E();
                c0.e = e1;
            }
            e1.i(e0);
            e0.b();
        }
        c0.b = true;
        this.a.e(this.b, this.c, this, this.e);
        c0.b = false;
        b b0 = (b)c0.d;
        if(b0 != null) {
            b0.d();
        }
        E e2 = (E)c0.e;
        if(e2 != null && e2.h()) {
            Object[] arr_object = e2.b;
            long[] arr_v = e2.a;
            int v = arr_v.length - 2;
            if(v >= 0) {
                for(int v1 = 0; true; ++v1) {
                    long v2 = arr_v[v1];
                    if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                        int v3 = 8 - (~(v1 - v) >>> 0x1F);
                        for(int v4 = 0; v4 < v3; ++v4) {
                            if((0xFFL & v2) < 0x80L) {
                                ((b)arr_object[(v1 << 3) + v4]).d();
                            }
                            v2 >>= 8;
                        }
                        if(v3 != 8) {
                            e2.b();
                            return;
                        }
                    }
                    if(v1 == v) {
                        break;
                    }
                }
                e2.b();
                return;
            }
            e2.b();
        }
    }

    public final void f(float f) {
        d d0 = this.a;
        if(d0.a() != f) {
            d0.c(f);
        }
    }

    public final void g(float f, long v, long v1) {
        if(!m0.b.b(this.h, v) || !e.a(this.i, v1) || this.j == f || this.l != null) {
            this.k = null;
            this.l = null;
            this.g = true;
            this.n = false;
            this.h = v;
            this.i = v1;
            this.j = f;
            this.a();
        }
    }
}

