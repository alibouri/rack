package y;

import Ab.t;
import W.d;
import Xb.j;
import androidx.compose.ui.layout.LayoutCoordinates;
import d6.a;
import java.util.concurrent.CancellationException;
import s.o;
import z0.e;

public class u {
    public final d a;

    public u(int v) {
        if(v != 1) {
            super();
            this.a = new d(new A[16]);
            return;
        }
        super();
        this.a = new d(new e[16]);
    }

    public boolean a(o o0, LayoutCoordinates layoutCoordinates0, a a0, boolean z) {
        d d0 = this.a;
        int v = d0.Z;
        if(v > 0) {
            Object[] arr_object = d0.X;
            int v1 = 0;
            boolean z1 = false;
            do {
                z1 = ((e)arr_object[v1]).a(o0, layoutCoordinates0, a0, z) || z1;
                ++v1;
            }
            while(v1 < v);
            return z1;
        }
        return false;
    }

    public void b(CancellationException cancellationException0) {
        d d0 = this.a;
        int v = d0.Z;
        j[] arr_j = new j[v];
        for(int v2 = 0; v2 < v; ++v2) {
            arr_j[v2] = ((A)d0.X[v2]).b;
        }
        for(int v1 = 0; v1 < v; ++v1) {
            arr_j[v1].o(cancellationException0);
        }
        if(!d0.m()) {
            throw new IllegalStateException("uncancelled requests present");
        }
    }

    public void c(a a0) {
        d d0 = this.a;
        for(int v = d0.Z - 1; -1 < v; --v) {
            if(((e)d0.X[v]).c.X == 0) {
                d0.p(v);
            }
        }
    }

    public void d() {
        int v = 0;
        while(true) {
            d d0 = this.a;
            if(v >= d0.Z) {
                break;
            }
            e e0 = (e)d0.X[v];
            if(e0.b.k0) {
                ++v;
                e0.d();
            }
            else {
                e0.f();
                d0.p(v);
            }
        }
    }

    public void e() {
        d d0 = this.a;
        int v1 = new Sb.d(0, d0.Z - 1, 1).Y;  // initializer: LSb/b;-><init>(III)V
        if(v1 >= 0) {
            for(int v = 0; true; ++v) {
                ((A)d0.X[v]).b.i(t.a);
                if(v == v1) {
                    break;
                }
            }
        }
        d0.i();
    }
}

