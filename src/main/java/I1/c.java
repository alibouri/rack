package I1;

import Nb.j;
import h1.b;

public class c {
    public final Object[] a;
    public int b;

    public c() {
        this.a = new Object[0x100];
    }

    public c(int v) {
        if(v <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.a = new Object[v];
    }

    public Object a() {
        int v = this.b;
        if(v > 0) {
            Object object0 = this.a[v - 1];
            j.d(object0, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
            this.a[v - 1] = null;
            --this.b;
            return object0;
        }
        return null;
    }

    public void b(b b0) {
        int v = this.b;
        Object[] arr_object = this.a;
        if(v < arr_object.length) {
            arr_object[v] = b0;
            this.b = v + 1;
        }
    }

    public boolean c(Object object0) {
        Object[] arr_object;
        j.f(object0, "instance");
        int v = this.b;
        for(int v1 = 0; true; ++v1) {
            boolean z = false;
            arr_object = this.a;
            if(v1 >= v) {
                break;
            }
            if(arr_object[v1] == object0) {
                z = true;
                break;
            }
        }
        if(z) {
            throw new IllegalStateException("Already in the pool!");
        }
        int v2 = this.b;
        if(v2 < arr_object.length) {
            arr_object[v2] = object0;
            this.b = v2 + 1;
            return true;
        }
        return false;
    }
}

