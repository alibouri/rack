package X6;

import java.util.Iterator;

public final class k extends g {
    public final transient Object b0;

    public k(Object object0) {
        object0.getClass();
        this.b0 = object0;
    }

    @Override  // X6.a
    public final int a(Object[] arr_object) {
        arr_object[0] = this.b0;
        return 1;
    }

    @Override  // X6.a
    public final boolean contains(Object object0) {
        return this.b0.equals(object0);
    }

    @Override  // X6.g
    public final int hashCode() {
        return this.b0.hashCode();
    }

    @Override
    public final Iterator iterator() {
        return new h(this.b0);
    }

    @Override
    public final int size() {
        return 1;
    }

    @Override
    public final String toString() {
        return '[' + this.b0.toString() + ']';
    }
}

