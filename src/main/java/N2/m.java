package N2;

import Bb.n;
import Bb.r;
import I2.A;
import Nb.j;
import O2.d;
import O2.e;
import O2.f;
import R2.p;
import ac.h;
import ac.o0;
import android.net.ConnectivityManager;
import android.os.Build.VERSION;
import java.util.ArrayList;
import p3.a;
import t0.l;

public final class m {
    public final int a;
    public final ArrayList b;

    public m(int v) {
        this.a = v;
        if(v != 2) {
            super();
            this.b = new ArrayList(5);
            return;
        }
        super();
        this.b = new ArrayList(0x20);
    }

    public m(P2.m m0) {
        g g1;
        this.a = 0;
        j.f(m0, "trackers");
        d d0 = new d(m0.b, 0);
        d d1 = new d(m0.c);
        d d2 = new d(m0.e, 4);
        d d3 = new d(m0.d, 2);
        d d4 = new d(m0.d, 3);
        O2.g g0 = new O2.g(m0.d);
        f f0 = new f(m0.d);
        if(Build.VERSION.SDK_INT >= 28) {
            j.f(m0.a, "context");
            Object object0 = m0.a.getSystemService("connectivity");
            j.d(object0, "null cannot be cast to non-null type android.net.ConnectivityManager");
            g1 = new g(((ConnectivityManager)object0));
        }
        else {
            g1 = null;
        }
        ArrayList arrayList0 = n.r0(new e[]{d0, d1, d2, d3, d4, g0, f0, g1});
        super();
        this.b = arrayList0;
    }

    public void a(a a0) {
        this.b.add(a0);
    }

    public boolean b(p p0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.b) {
            if(((e)object0).b(p0)) {
                arrayList0.add(object0);
            }
        }
        if(!arrayList0.isEmpty()) {
            A.e().a(o.a, "Work " + p0.a + " constrained by " + Bb.p.v0(arrayList0, null, null, null, N2.j.X, 0x1F));
        }
        return arrayList0.isEmpty();
    }

    public a c(int v) {
        return (a)this.b.get(v);
    }

    public void d(float f, float f1) {
        l l0 = new l(f, f1);
        this.b.add(l0);
    }

    public h e(p p0) {
        j.f(p0, "spec");
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.b) {
            if(((e)object0).c(p0)) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList(r.b0(arrayList0));
        for(Object object1: arrayList0) {
            arrayList1.add(((e)object1).a(p0.j));
        }
        return o0.n(new N2.l(0, ((h[])Bb.p.Q0(arrayList1).toArray(new h[0]))));
    }

    @Override
    public String toString() {
        if(this.a != 1) {
            return super.toString();
        }
        StringBuffer stringBuffer0 = new StringBuffer();
        for(int v = 1; v < this.b.size(); ++v) {
            stringBuffer0.append(this.c(v));
            if(v < this.b.size() - 1) {
                switch(this.c(v + 1).b) {
                    case 1: 
                    case 2: {
                        stringBuffer0.append('/');
                    }
                }
            }
        }
        return stringBuffer0.toString();
    }
}

