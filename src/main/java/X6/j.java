package X6;

import W5.f;
import java.util.Iterator;

public final class j extends g {
    public final transient Object[] b0;
    public final transient int c0;
    public final transient Object[] d0;
    public final transient int e0;
    public final transient int f0;
    public static final Object[] g0;
    public static final j h0;

    static {
        Object[] arr_object = new Object[0];
        j.g0 = arr_object;
        j.h0 = new j(0, 0, 0, arr_object, arr_object);
    }

    public j(int v, int v1, int v2, Object[] arr_object, Object[] arr_object1) {
        this.b0 = arr_object;
        this.c0 = v;
        this.d0 = arr_object1;
        this.e0 = v1;
        this.f0 = v2;
    }

    @Override  // X6.a
    public final int a(Object[] arr_object) {
        System.arraycopy(this.b0, 0, arr_object, 0, this.f0);
        return this.f0;
    }

    @Override  // X6.a
    public final Object[] c() {
        return this.b0;
    }

    @Override  // X6.a
    public final boolean contains(Object object0) {
        if(object0 != null) {
            Object[] arr_object = this.d0;
            if(arr_object.length != 0) {
                for(int v = f.a0((object0 == null ? 0 : object0.hashCode())); true; v = v1 + 1) {
                    int v1 = v & this.e0;
                    Object object1 = arr_object[v1];
                    if(object1 == null) {
                        return false;
                    }
                    if(object1.equals(object0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override  // X6.a
    public final int d() {
        return this.f0;
    }

    @Override  // X6.a
    public final int e() {
        return 0;
    }

    @Override  // X6.g
    public final int hashCode() {
        return this.c0;
    }

    @Override
    public final Iterator iterator() {
        e e0 = this.Y;
        if(e0 == null) {
            e0 = e.g(this.f0, this.b0);
            this.Y = e0;
        }
        return e0.i(0);
    }

    @Override
    public final int size() {
        return this.f0;
    }
}

