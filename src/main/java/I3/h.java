package i3;

import Bb.F;
import Bb.z;
import M4.s;
import Xb.A;
import a3.t;
import a8.Q;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap.Config;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import j3.d;
import j3.f;
import j3.g;
import j3.i;
import java.util.LinkedHashMap;
import k3.a;
import k3.b;
import m3.e;
import pc.p;

public final class h {
    public final Context a;
    public c b;
    public Object c;
    public b d;
    public Q e;
    public d f;
    public t g;
    public final z h;
    public final s i;
    public final LinkedHashMap j;
    public final boolean k;
    public final boolean l;
    public i3.b m;
    public i3.b n;
    public final g3.b o;
    public Integer p;
    public Integer q;
    public i r;
    public g s;
    public Lifecycle t;
    public i u;
    public g v;

    public h(Context context0) {
        this.a = context0;
        this.b = e.a;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = z.X;
        this.i = null;
        this.j = null;
        this.k = true;
        this.l = true;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
    }

    public h(i3.i i0, Context context0) {
        this.a = context0;
        this.b = i0.D;
        this.c = i0.b;
        this.d = i0.c;
        this.e = i0.d;
        this.f = i0.C.c;
        this.g = i0.g;
        this.h = i0.h;
        this.i = i0.j.e();
        this.j = F.a0(i0.k.a);
        this.k = i0.l;
        this.l = i0.o;
        this.m = i0.C.d;
        this.n = i0.C.e;
        this.o = new g3.b(i0.z);
        this.p = i0.A;
        this.q = i0.B;
        this.r = i0.C.a;
        this.s = i0.C.b;
        if(i0.a == context0) {
            this.t = i0.w;
            this.u = i0.x;
            this.v = i0.y;
            return;
        }
        this.t = null;
        this.u = null;
        this.v = null;
    }

    public final i3.i a() {
        a a6;
        ImageView imageView1;
        A a5;
        Object object0 = this.c;
        if(object0 == null) {
            object0 = k.b;
        }
        b b0 = this.d;
        Q q0 = this.e;
        Bitmap.Config bitmap$Config0 = this.b.g;
        d d0 = this.f == null ? this.b.f : this.f;
        t t0 = this.g;
        l3.a a0 = this.b.e;
        p p0 = this.i == null ? null : this.i.j();
        if(p0 == null) {
            p0 = m3.g.b;
        }
        q q1 = this.j == null ? null : new q(N4.h.O(this.j));
        q q2 = q1 == null ? q.b : q1;
        boolean z = this.b.h;
        boolean z1 = this.b.i;
        i3.b b1 = this.m == null ? this.b.m : this.m;
        i3.b b2 = this.n == null ? this.b.n : this.n;
        i3.b b3 = this.b.o;
        A a1 = this.b.a;
        A a2 = this.b.b;
        A a3 = this.b.c;
        A a4 = this.b.d;
        Lifecycle lifecycle0 = this.t;
        Context context0 = this.a;
        if(lifecycle0 == null) {
            a5 = a1;
            for(Context context1 = this.d instanceof a ? ((a)this.d).Y.getContext() : context0; true; context1 = ((ContextWrapper)context1).getBaseContext()) {
                if(context1 instanceof LifecycleOwner) {
                    lifecycle0 = ((LifecycleOwner)context1).a();
                }
                else if(context1 instanceof ContextWrapper) {
                    continue;
                }
                else {
                    lifecycle0 = null;
                }
                if(lifecycle0 != null) {
                    break;
                }
                lifecycle0 = i3.g.b;
                break;
            }
        }
        else {
            a5 = a1;
        }
        i i0 = this.r;
        if(i0 == null) {
            i0 = this.u;
            if(i0 == null) {
                b b4 = this.d;
                if(b4 instanceof a) {
                    ImageView imageView0 = ((a)b4).Y;
                    if(imageView0 instanceof ImageView) {
                        ImageView.ScaleType imageView$ScaleType0 = imageView0.getScaleType();
                        i0 = imageView$ScaleType0 != ImageView.ScaleType.CENTER && imageView$ScaleType0 != ImageView.ScaleType.MATRIX ? new f(imageView0, true) : new j3.e();
                    }
                    else {
                        i0 = new f(imageView0, true);
                    }
                }
                else {
                    i0 = new j3.c(context0);
                }
            }
        }
        g g0 = this.s;
        if(g0 == null) {
            g0 = this.v;
            if(g0 == null) {
                f f0 = this.r instanceof f ? ((f)this.r) : null;
                if(f0 == null) {
                    a6 = this.d instanceof a ? ((a)this.d) : null;
                    imageView1 = a6 == null ? null : a6.Y;
                }
                else {
                    imageView1 = f0.X;
                    if(imageView1 == null) {
                        a6 = this.d instanceof a ? ((a)this.d) : null;
                        imageView1 = a6 == null ? null : a6.Y;
                    }
                }
                if(imageView1 instanceof ImageView) {
                    ImageView.ScaleType imageView$ScaleType1 = imageView1.getScaleType();
                    int v = imageView$ScaleType1 == null ? -1 : m3.f.a[imageView$ScaleType1.ordinal()];
                    g0 = v == 1 || v == 2 || v == 3 || v == 4 ? g.Y : g.X;
                }
                else {
                    g0 = g.Y;
                }
            }
        }
        n n0 = this.o == null ? null : new n(N4.h.O(((LinkedHashMap)this.o.Y)));
        if(n0 == null) {
            n0 = n.Y;
        }
        Integer integer0 = this.p;
        Integer integer1 = this.q;
        new i3.d(this.r, this.s, this.f, this.m, this.n);
        return new i3.i(this.a, object0, b0, q0, bitmap$Config0, d0, t0, this.h, a0, p0, q2, this.k, z, z1, this.l, b1, b2, b3, a5, a2, a3, a4, lifecycle0, i0, g0, n0, integer0, integer1, null, this.b);
    }

    public final void b() {
        this.t = null;
        this.u = null;
        this.v = null;
    }
}

