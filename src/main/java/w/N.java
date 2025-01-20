package w;

import Ab.t;
import Bb.F;
import Eb.a;
import Fb.c;
import J2.w;
import U.Z;
import U.d;
import W5.f;
import a1.l;
import android.content.Context;
import android.os.Build.VERSION;
import android.widget.EdgeEffect;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m0.b;
import m0.e;
import n0.M;
import z0.m;

public final class n implements p0 {
    public b X;
    public final E Y;
    public final ParcelableSnapshotMutableState Z;
    public final boolean b0;
    public boolean c0;
    public long d0;
    public m e0;
    public final Modifier f0;

    public n(Context context0, n0 n00) {
        E e0 = new E(context0, M.G(n00.a));
        this.Y = e0;
        this.Z = d.D(t.a, Z.b);
        this.b0 = true;
        this.d0 = 0L;
        w.m m0 = new w.m(this, null);
        this.f0 = com.apollographql.apollo.api.b.c(new SuspendPointerInputElement(t.a, null, m0, 6), (Build.VERSION.SDK_INT < 0x1F ? new D(this, e0, n00) : new D(this, e0)));
    }

    @Override  // w.p0
    public final boolean a() {
        E e0 = this.Y;
        o o0 = o.a;
        if(e0.d != null && (Build.VERSION.SDK_INT < 0x1F ? 0.0f : o0.b(e0.d)) == 0.0f) {
            return true;
        }
        if(e0.e != null && (Build.VERSION.SDK_INT < 0x1F ? 0.0f : o0.b(e0.e)) == 0.0f) {
            return true;
        }
        if(e0.f != null && (Build.VERSION.SDK_INT < 0x1F ? 0.0f : o0.b(e0.f)) == 0.0f) {
            return true;
        }
        return e0.g == null ? false : (Build.VERSION.SDK_INT < 0x1F ? 0.0f : o0.b(e0.g)) != 0.0f;
    }

    public final void b() {
        boolean z1;
        E e0 = this.Y;
        EdgeEffect edgeEffect0 = e0.d;
        boolean z = false;
        if(edgeEffect0 == null) {
            z1 = false;
        }
        else {
            edgeEffect0.onRelease();
            z1 = edgeEffect0.isFinished();
        }
        EdgeEffect edgeEffect1 = e0.e;
        if(edgeEffect1 != null) {
            edgeEffect1.onRelease();
            z1 = edgeEffect1.isFinished() || z1;
        }
        EdgeEffect edgeEffect2 = e0.f;
        if(edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z1 = edgeEffect2.isFinished() || z1;
        }
        EdgeEffect edgeEffect3 = e0.g;
        if(edgeEffect3 != null) {
            edgeEffect3.onRelease();
            if(edgeEffect3.isFinished() || z1) {
                z = true;
            }
            z1 = z;
        }
        if(z1) {
            this.g();
        }
    }

    @Override  // w.p0
    public final Modifier c() {
        return this.f0;
    }

    public final long d() {
        b b0 = this.X;
        if(b0 != null) {
            return yc.d.d(b.d(b0.a) / e.d(this.d0), b.e(b0.a) / e.b(this.d0));
        }
        long v = w.G(this.d0);
        return yc.d.d(b.d(v) / e.d(this.d0), b.e(v) / e.b(this.d0));
    }

    @Override  // w.p0
    public final long e(long v, int v1, Function1 function10) {
        int v6;
        boolean z3;
        boolean z2;
        boolean z1;
        float f1;
        float f;
        if(e.e(this.d0)) {
            return ((b)function10.n(new b(v))).a;
        }
        boolean z = true;
        E e0 = this.Y;
        if(!this.c0) {
            if(E.g(e0.f)) {
                this.i(0L);
            }
            if(E.g(e0.g)) {
                this.j(0L);
            }
            if(E.g(e0.d)) {
                this.k(0L);
            }
            if(E.g(e0.e)) {
                this.h(0L);
            }
            this.c0 = true;
        }
        if(b.e(v) == 0.0f) {
            f = 0.0f;
        }
        else if(E.g(e0.d)) {
            f = this.k(v);
            if(!E.g(e0.d)) {
                e0.e().onRelease();
            }
        }
        else if(E.g(e0.e)) {
            f = this.h(v);
            if(!E.g(e0.e)) {
                e0.b().onRelease();
            }
        }
        else {
            f = 0.0f;
        }
        if(b.d(v) == 0.0f) {
            f1 = 0.0f;
        }
        else if(E.g(e0.f)) {
            f1 = this.i(v);
            if(!E.g(e0.f)) {
                e0.c().onRelease();
            }
        }
        else if(E.g(e0.g)) {
            f1 = this.j(v);
            if(!E.g(e0.g)) {
                e0.d().onRelease();
            }
        }
        else {
            f1 = 0.0f;
        }
        long v2 = yc.d.d(f1, f);
        if(!b.b(v2, 0L)) {
            this.g();
        }
        long v3 = b.h(v, v2);
        long v4 = ((b)function10.n(new b(v3))).a;
        long v5 = b.h(v3, v4);
        if(v1 == 1) {
            if(Float.compare(b.d(v5), 0.5f) > 0) {
                this.i(v5);
                z1 = true;
            }
            else if(b.d(v5) < -0.5f) {
                this.j(v5);
                z1 = true;
            }
            else {
                z1 = false;
            }
            if(b.e(v5) > 0.5f) {
                this.k(v5);
                z2 = true;
            }
            else if(b.e(v5) < -0.5f) {
                this.h(v5);
                z2 = true;
            }
            else {
                z2 = false;
            }
            z3 = !z1 && !z2 ? false : true;
        }
        else {
            z3 = false;
        }
        if(!E.f(e0.f) || b.d(v) >= 0.0f) {
            v6 = 0;
        }
        else {
            EdgeEffect edgeEffect0 = e0.c();
            float f2 = b.d(v);
            if(edgeEffect0 instanceof O) {
                float f3 = ((O)edgeEffect0).b + f2;
                ((O)edgeEffect0).b = f3;
                if(Math.abs(f3) > ((O)edgeEffect0).a) {
                    ((O)edgeEffect0).onRelease();
                }
            }
            else {
                edgeEffect0.onRelease();
            }
            v6 = !E.f(e0.f);
        }
        if(E.f(e0.g) && b.d(v) <= 0.0f) {
            EdgeEffect edgeEffect1 = e0.d();
            float f4 = b.d(v);
            if(edgeEffect1 instanceof O) {
                float f5 = ((O)edgeEffect1).b + f4;
                ((O)edgeEffect1).b = f5;
                if(Math.abs(f5) > ((O)edgeEffect1).a) {
                    ((O)edgeEffect1).onRelease();
                }
            }
            else {
                edgeEffect1.onRelease();
            }
            v6 = v6 != 0 || !E.f(e0.g) ? 1 : 0;
        }
        if(E.f(e0.d) && b.e(v) >= 0.0f) {
            EdgeEffect edgeEffect2 = e0.e();
            float f6 = b.e(v);
            if(edgeEffect2 instanceof O) {
                float f7 = ((O)edgeEffect2).b + f6;
                ((O)edgeEffect2).b = f7;
                if(Math.abs(f7) > ((O)edgeEffect2).a) {
                    ((O)edgeEffect2).onRelease();
                }
            }
            else {
                edgeEffect2.onRelease();
            }
            v6 = v6 != 0 || !E.f(e0.d) ? 1 : 0;
        }
        if(E.f(e0.e) && b.e(v) <= 0.0f) {
            EdgeEffect edgeEffect3 = e0.b();
            float f8 = b.e(v);
            if(edgeEffect3 instanceof O) {
                float f9 = ((O)edgeEffect3).b + f8;
                ((O)edgeEffect3).b = f9;
                if(Math.abs(f9) > ((O)edgeEffect3).a) {
                    ((O)edgeEffect3).onRelease();
                }
            }
            else {
                edgeEffect3.onRelease();
            }
            v6 = v6 != 0 || !E.f(e0.e) ? 1 : 0;
        }
        if(v6 == 0 && !z3) {
            z = false;
        }
        if(z) {
            this.g();
        }
        return b.i(v2, v4);
    }

    @Override  // w.p0
    public final Object f(long v, Function2 function20, g g0) {
        n n0;
        long v7;
        float f1;
        float f;
        k k0;
        if(g0 instanceof k) {
            k0 = (k)g0;
            int v1 = k0.f0;
            if((v1 & 0x80000000) == 0) {
                k0 = new k(this, ((c)g0));
            }
            else {
                k0.f0 = v1 ^ 0x80000000;
            }
        }
        else {
            k0 = new k(this, ((c)g0));
        }
        Object object0 = k0.d0;
        Object object1 = a.X;
        Object object2 = t.a;
        switch(k0.f0) {
            case 0: {
                f.b0(object0);
                if(e.e(this.d0)) {
                    l l0 = new l(v);
                    k0.f0 = 1;
                    return function20.j(l0, k0) == object1 ? object1 : object2;
                }
                E e0 = this.Y;
                if(Float.compare(l.b(v), 0.0f) > 0 && E.g(e0.f)) {
                    EdgeEffect edgeEffect0 = e0.c();
                    int v2 = Pb.a.H(l.b(v));
                    if(Build.VERSION.SDK_INT >= 0x1F) {
                        edgeEffect0.onAbsorb(v2);
                    }
                    else if(edgeEffect0.isFinished()) {
                        edgeEffect0.onAbsorb(v2);
                    }
                    f = l.b(v);
                }
                else if(l.b(v) >= 0.0f || !E.g(e0.g)) {
                    f = 0.0f;
                }
                else {
                    EdgeEffect edgeEffect1 = e0.d();
                    int v3 = Pb.a.H(l.b(v));
                    if(Build.VERSION.SDK_INT >= 0x1F) {
                        edgeEffect1.onAbsorb(-v3);
                    }
                    else if(edgeEffect1.isFinished()) {
                        edgeEffect1.onAbsorb(-v3);
                    }
                    f = l.b(v);
                }
                if(l.c(v) > 0.0f && E.g(e0.d)) {
                    EdgeEffect edgeEffect2 = e0.e();
                    int v4 = Pb.a.H(l.c(v));
                    if(Build.VERSION.SDK_INT >= 0x1F) {
                        edgeEffect2.onAbsorb(v4);
                    }
                    else if(edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb(v4);
                    }
                    f1 = l.c(v);
                }
                else if(l.c(v) >= 0.0f || !E.g(e0.e)) {
                    f1 = 0.0f;
                }
                else {
                    EdgeEffect edgeEffect3 = e0.b();
                    int v5 = Pb.a.H(l.c(v));
                    if(Build.VERSION.SDK_INT >= 0x1F) {
                        edgeEffect3.onAbsorb(-v5);
                    }
                    else if(edgeEffect3.isFinished()) {
                        edgeEffect3.onAbsorb(-v5);
                    }
                    f1 = l.c(v);
                }
                long v6 = F.f(f, f1);
                if(v6 != 0L) {
                    this.g();
                }
                v7 = l.d(v, v6);
                l l1 = new l(v7);
                k0.b0 = this;
                k0.c0 = v7;
                k0.f0 = 2;
                object0 = function20.j(l1, k0);
                if(object0 == object1) {
                    return object1;
                }
                n0 = this;
                break;
            }
            case 1: {
                f.b0(object0);
                return object2;
            }
            case 2: {
                v7 = k0.c0;
                n0 = k0.b0;
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        long v8 = l.d(v7, ((l)object0).a);
        n0.c0 = false;
        E e1 = n0.Y;
        if(Float.compare(l.b(v8), 0.0f) > 0) {
            EdgeEffect edgeEffect4 = e1.c();
            int v9 = Pb.a.H(l.b(v8));
            if(Build.VERSION.SDK_INT >= 0x1F) {
                edgeEffect4.onAbsorb(v9);
            }
            else if(edgeEffect4.isFinished()) {
                edgeEffect4.onAbsorb(v9);
            }
        }
        else if(l.b(v8) < 0.0f) {
            EdgeEffect edgeEffect5 = e1.d();
            int v10 = Pb.a.H(l.b(v8));
            if(Build.VERSION.SDK_INT >= 0x1F) {
                edgeEffect5.onAbsorb(-v10);
            }
            else if(edgeEffect5.isFinished()) {
                edgeEffect5.onAbsorb(-v10);
            }
        }
        if(l.c(v8) > 0.0f) {
            EdgeEffect edgeEffect6 = e1.e();
            int v11 = Pb.a.H(l.c(v8));
            if(Build.VERSION.SDK_INT >= 0x1F) {
                edgeEffect6.onAbsorb(v11);
            }
            else if(edgeEffect6.isFinished()) {
                edgeEffect6.onAbsorb(v11);
            }
        }
        else if(l.c(v8) < 0.0f) {
            EdgeEffect edgeEffect7 = e1.b();
            int v12 = Pb.a.H(l.c(v8));
            if(Build.VERSION.SDK_INT >= 0x1F) {
                edgeEffect7.onAbsorb(-v12);
            }
            else if(edgeEffect7.isFinished()) {
                edgeEffect7.onAbsorb(-v12);
            }
        }
        if(v8 != 0L) {
            n0.g();
        }
        n0.b();
        return object2;
    }

    public final void g() {
        if(this.b0) {
            this.Z.setValue(t.a);
        }
    }

    public final float h(long v) {
        float f = b.d(this.d());
        float f1 = e.b(this.d0);
        EdgeEffect edgeEffect0 = this.Y.b();
        float f2 = -(b.e(v) / f1);
        int v1 = Build.VERSION.SDK_INT;
        o o0 = o.a;
        if(v1 >= 0x1F) {
            f2 = o0.c(edgeEffect0, f2, 1.0f - f);
        }
        else {
            edgeEffect0.onPull(f2, 1.0f - f);
        }
        float f3 = e.b(this.d0) * -f2;
        return (v1 < 0x1F ? 0.0f : o0.b(edgeEffect0)) == 0.0f ? f3 : b.e(v);
    }

    public final float i(long v) {
        float f = b.e(this.d());
        float f1 = b.d(v) / e.d(this.d0);
        EdgeEffect edgeEffect0 = this.Y.c();
        int v1 = Build.VERSION.SDK_INT;
        o o0 = o.a;
        if(v1 >= 0x1F) {
            f1 = o0.c(edgeEffect0, f1, 1.0f - f);
        }
        else {
            edgeEffect0.onPull(f1, 1.0f - f);
        }
        float f2 = e.d(this.d0) * f1;
        return (v1 < 0x1F ? 0.0f : o0.b(edgeEffect0)) == 0.0f ? f2 : b.d(v);
    }

    public final float j(long v) {
        float f = b.e(this.d());
        float f1 = e.d(this.d0);
        EdgeEffect edgeEffect0 = this.Y.d();
        float f2 = -(b.d(v) / f1);
        int v1 = Build.VERSION.SDK_INT;
        o o0 = o.a;
        if(v1 >= 0x1F) {
            f2 = o0.c(edgeEffect0, f2, f);
        }
        else {
            edgeEffect0.onPull(f2, f);
        }
        float f3 = e.d(this.d0) * -f2;
        return (v1 < 0x1F ? 0.0f : o0.b(edgeEffect0)) == 0.0f ? f3 : b.d(v);
    }

    public final float k(long v) {
        float f = b.d(this.d());
        float f1 = b.e(v) / e.b(this.d0);
        EdgeEffect edgeEffect0 = this.Y.e();
        int v1 = Build.VERSION.SDK_INT;
        o o0 = o.a;
        if(v1 >= 0x1F) {
            f1 = o0.c(edgeEffect0, f1, f);
        }
        else {
            edgeEffect0.onPull(f1, f);
        }
        float f2 = e.b(this.d0) * f1;
        return (v1 < 0x1F ? 0.0f : o0.b(edgeEffect0)) == 0.0f ? f2 : b.e(v);
    }

    public final void l(long v) {
        boolean z = e.a(this.d0, 0L);
        boolean z1 = e.a(v, this.d0);
        this.d0 = v;
        if(!z1) {
            long v1 = io.sentry.config.a.d(Pb.a.H(e.d(v)), Pb.a.H(e.b(v)));
            E e0 = this.Y;
            e0.c = v1;
            EdgeEffect edgeEffect0 = e0.d;
            if(edgeEffect0 != null) {
                edgeEffect0.setSize(((int)(v1 >> 0x20)), ((int)(v1 & 0xFFFFFFFFL)));
            }
            EdgeEffect edgeEffect1 = e0.e;
            if(edgeEffect1 != null) {
                edgeEffect1.setSize(((int)(v1 >> 0x20)), ((int)(v1 & 0xFFFFFFFFL)));
            }
            EdgeEffect edgeEffect2 = e0.f;
            if(edgeEffect2 != null) {
                edgeEffect2.setSize(((int)(v1 & 0xFFFFFFFFL)), ((int)(v1 >> 0x20)));
            }
            EdgeEffect edgeEffect3 = e0.g;
            if(edgeEffect3 != null) {
                edgeEffect3.setSize(((int)(v1 & 0xFFFFFFFFL)), ((int)(v1 >> 0x20)));
            }
            EdgeEffect edgeEffect4 = e0.h;
            if(edgeEffect4 != null) {
                edgeEffect4.setSize(((int)(v1 >> 0x20)), ((int)(v1 & 0xFFFFFFFFL)));
            }
            EdgeEffect edgeEffect5 = e0.i;
            if(edgeEffect5 != null) {
                edgeEffect5.setSize(((int)(v1 >> 0x20)), ((int)(v1 & 0xFFFFFFFFL)));
            }
            EdgeEffect edgeEffect6 = e0.j;
            if(edgeEffect6 != null) {
                edgeEffect6.setSize(((int)(v1 & 0xFFFFFFFFL)), ((int)(v1 >> 0x20)));
            }
            EdgeEffect edgeEffect7 = e0.k;
            if(edgeEffect7 != null) {
                edgeEffect7.setSize(((int)(v1 & 0xFFFFFFFFL)), ((int)(v1 >> 0x20)));
            }
        }
        if(!z && !z1) {
            this.g();
            this.b();
        }
    }
}

