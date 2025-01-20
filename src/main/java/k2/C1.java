package k2;

import Bb.p;
import Bb.v;
import C3.m;
import I2.J;
import Nb.j;
import Xb.A;
import Xb.i0;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;
import m5.b;

public abstract class c1 extends AbstractList {
    public final y1 X;
    public final i0 Y;
    public final A Z;
    public final e1 b0;
    public final m c0;
    public final ArrayList d0;
    public final ArrayList e0;
    public static final int f0;

    public c1(y1 y10, i0 i00, A a0, e1 e10, m m0) {
        j.f(y10, "pagingSource");
        j.f(i00, "coroutineScope");
        j.f(a0, "notifyDispatcher");
        j.f(m0, "config");
        super();
        this.X = y10;
        this.Y = i00;
        this.Z = a0;
        this.b0 = e10;
        this.c0 = m0;
        this.d0 = new ArrayList();
        this.e0 = new ArrayList();
    }

    public final void a(X0 x00) {
        j.f(x00, "callback");
        v.i0(this.d0, k2.v.Z);
        WeakReference weakReference0 = new WeakReference(x00);
        this.d0.add(weakReference0);
    }

    public abstract void c(Function2 arg1);

    public abstract Object d();

    public y1 e() {
        return this.X;
    }

    public abstract boolean g();

    @Override
    public final Object get(int v) {
        return this.b0.get(v);
    }

    public boolean i() {
        return this.g();
    }

    public final void l(int v) {
        e1 e10 = this.b0;
        if(v >= 0 && v < e10.e()) {
            e10.e0 = J.r(v - e10.Y, 0, e10.d0 - 1);
            this.o(v);
            return;
        }
        StringBuilder stringBuilder0 = b.A(v, "Index: ", ", Size: ");
        stringBuilder0.append(e10.e());
        throw new IndexOutOfBoundsException(stringBuilder0.toString());
    }

    public abstract void o(int arg1);

    public final void r(int v, int v1) {
        if(v1 == 0) {
            return;
        }
        for(Object object0: p.H0(this.d0)) {
            X0 x00 = (X0)((WeakReference)object0).get();
            if(x00 != null) {
                x00.a(v, v1);
            }
        }
    }

    public final void s(int v, int v1) {
        if(v1 == 0) {
            return;
        }
        for(Object object0: p.H0(this.d0)) {
            X0 x00 = (X0)((WeakReference)object0).get();
            if(x00 != null) {
                x00.b(v, v1);
            }
        }
    }

    @Override
    public final int size() {
        return this.b0.e();
    }

    public void t(e0 e00) {
    }
}

