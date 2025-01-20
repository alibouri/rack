package Z;

import J2.w;
import Nb.j;
import Nb.z;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class f extends d {
    public final e b0;
    public Object c0;
    public boolean d0;
    public int e0;

    public f(e e0, n[] arr_n) {
        super(e0.Y, arr_n);
        this.b0 = e0;
        this.e0 = e0.b0;
    }

    public final void c(int v, m m0, Object object0, int v1) {
        n[] arr_n = this.X;
        if(v1 * 5 > 30) {
            arr_n[v1].a(m0.d, m0.d.length, 0);
            while(true) {
                n n0 = arr_n[v1];
                if(j.a(n0.X[n0.Z], object0)) {
                    break;
                }
                n n1 = arr_n[v1];
                n1.Z += 2;
            }
            this.Y = v1;
            return;
        }
        int v2 = w.J(v, v1 * 5);
        if(m0.h(1 << v2)) {
            arr_n[v1].a(m0.d, Integer.bitCount(m0.a) * 2, m0.f(1 << v2));
            this.Y = v1;
            return;
        }
        int v3 = m0.t(1 << v2);
        m m1 = m0.s(v3);
        arr_n[v1].a(m0.d, Integer.bitCount(m0.a) * 2, v3);
        this.c(v, m1, object0, v1 + 1);
    }

    @Override  // Z.d
    public final Object next() {
        if(this.b0.b0 != this.e0) {
            throw new ConcurrentModificationException();
        }
        if(!this.Z) {
            throw new NoSuchElementException();
        }
        n n0 = this.X[this.Y];
        this.c0 = n0.X[n0.Z];
        this.d0 = true;
        return super.next();
    }

    @Override  // Z.d
    public final void remove() {
        if(!this.d0) {
            throw new IllegalStateException();
        }
        e e0 = this.b0;
        if(this.Z) {
            n n0 = this.X[this.Y];
            Object object0 = n0.X[n0.Z];
            Object object1 = this.c0;
            z.c(e0).remove(object1);
            this.c((object0 == null ? 0 : object0.hashCode()), e0.Y, object0, 0);
        }
        else {
            Object object2 = this.c0;
            z.c(e0).remove(object2);
        }
        this.c0 = null;
        this.d0 = false;
        this.e0 = e0.b0;
    }
}

