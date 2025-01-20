package d6;

import T4.l;
import java.util.List;

public final class n extends o {
    public final transient int Z;
    public final transient int b0;
    public final o c0;

    public n(o o0, int v, int v1) {
        this.c0 = o0;
        super();
        this.Z = v;
        this.b0 = v1;
    }

    @Override  // d6.l
    public final Object[] a() {
        return this.c0.a();
    }

    @Override  // d6.l
    public final int c() {
        return this.c0.c() + this.Z;
    }

    @Override  // d6.l
    public final int d() {
        return this.c0.c() + this.Z + this.b0;
    }

    @Override  // d6.l
    public final boolean e() {
        return true;
    }

    @Override
    public final Object get(int v) {
        l.U(v, this.b0);
        return this.c0.get(v + this.Z);
    }

    @Override  // d6.o
    public final o i(int v, int v1) {
        l.V(v, v1, this.b0);
        return this.c0.i(v + this.Z, v1 + this.Z);
    }

    @Override
    public final int size() {
        return this.b0;
    }

    @Override  // d6.o
    public final List subList(int v, int v1) {
        return this.i(v, v1);
    }
}

