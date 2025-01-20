package s;

import Bb.n;
import I2.J;
import Nb.j;
import Sb.d;
import V2.a;
import java.util.Arrays;
import m5.b;

public final class z {
    public Object[] a;
    public int b;

    public z() {
        this(16);
    }

    public z(int v) {
        this.a = v == 0 ? p.b : new Object[v];
    }

    public final void a(Object object0) {
        int v = this.b + 1;
        Object[] arr_object = this.a;
        if(arr_object.length < v) {
            Object[] arr_object1 = Arrays.copyOf(arr_object, Math.max(v, arr_object.length * 3 / 2));
            j.e(arr_object1, "copyOf(this, newSize)");
            this.a = arr_object1;
        }
        int v1 = this.b;
        this.a[v1] = object0;
        this.b = v1 + 1;
    }

    public final int b(Object object0) {
        int v = 0;
        if(object0 == null) {
            Object[] arr_object = this.a;
            int v1 = this.b;
            while(v < v1) {
                if(arr_object[v] == null) {
                    return v;
                }
                ++v;
            }
            return -1;
        }
        Object[] arr_object1 = this.a;
        int v2 = this.b;
        while(v < v2) {
            if(object0.equals(arr_object1[v])) {
                return v;
            }
            ++v;
        }
        return -1;
    }

    public final void c(A.j j0) {
        int v = this.b(j0);
        if(v >= 0) {
            int v1 = this.b;
            if(v < v1) {
                Object[] arr_object = this.a;
                Object object0 = arr_object[v];
                if(v != v1 - 1) {
                    n.i0(v, v + 1, v1, arr_object, arr_object);
                }
                int v2 = this.b - 1;
                this.b = v2;
                arr_object[v2] = null;
                return;
            }
            StringBuilder stringBuilder0 = b.A(v, "Index ", " must be in 0..");
            stringBuilder0.append(this.b - 1);
            throw new IndexOutOfBoundsException(stringBuilder0.toString());
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 instanceof z) {
            int v = this.b;
            if(((z)object0).b == v) {
                Object[] arr_object = this.a;
                Object[] arr_object1 = ((z)object0).a;
                d d0 = J.R(0, v);
                int v1 = d0.X;
                int v2 = d0.Y;
                if(v1 <= v2) {
                    while(true) {
                        if(!j.a(arr_object[v1], arr_object1[v1])) {
                            return false;
                        }
                        if(v1 == v2) {
                            break;
                        }
                        ++v1;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        Object[] arr_object = this.a;
        int v = this.b;
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = arr_object[v1];
            v2 += (object0 == null ? 0 : object0.hashCode()) * 0x1F;
        }
        return v2;
    }

    @Override
    public final String toString() {
        a a0 = new a(19, this);
        StringBuilder stringBuilder0 = new StringBuilder("[");
        Object[] arr_object = this.a;
        int v = this.b;
        for(int v1 = 0; true; ++v1) {
            if(v1 >= v) {
                stringBuilder0.append("]");
                break;
            }
            Object object0 = arr_object[v1];
            if(v1 == -1) {
                stringBuilder0.append("...");
                break;
            }
            if(v1 != 0) {
                stringBuilder0.append(", ");
            }
            stringBuilder0.append(((CharSequence)a0.n(object0)));
        }
        String s = stringBuilder0.toString();
        j.e(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }
}

