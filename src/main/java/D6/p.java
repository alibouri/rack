package d6;

import T4.l;
import java.util.Objects;

public final class p extends o {
    public final transient Object[] Z;
    public final transient int b0;
    public static final p c0;

    static {
        p.c0 = new p(0, new Object[0]);
    }

    public p(int v, Object[] arr_object) {
        this.Z = arr_object;
        this.b0 = v;
    }

    @Override  // d6.l
    public final Object[] a() {
        return this.Z;
    }

    @Override  // d6.l
    public final int c() {
        return 0;
    }

    @Override  // d6.l
    public final int d() {
        return this.b0;
    }

    @Override  // d6.l
    public final boolean e() {
        return false;
    }

    @Override  // d6.o
    public final int g(Object[] arr_object) {
        System.arraycopy(this.Z, 0, arr_object, 0, this.b0);
        return this.b0;
    }

    @Override
    public final Object get(int v) {
        l.U(v, this.b0);
        Object object0 = this.Z[v];
        Objects.requireNonNull(object0);
        return object0;
    }

    @Override
    public final int size() {
        return this.b0;
    }
}

