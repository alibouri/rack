package s;

import Bb.n;
import I2.J;
import Nb.j;
import Sb.d;
import java.util.Arrays;
import m5.b;

public final class r {
    public int[] a;
    public int b;

    public r() {
        this(16);
    }

    public r(int v) {
        this.a = v == 0 ? k.a : new int[v];
    }

    public final void a(int v) {
        this.b(this.b + 1);
        int v1 = this.b;
        this.a[v1] = v;
        this.b = v1 + 1;
    }

    public final void b(int v) {
        int[] arr_v = this.a;
        if(arr_v.length < v) {
            int[] arr_v1 = Arrays.copyOf(arr_v, Math.max(v, arr_v.length * 3 / 2));
            j.e(arr_v1, "copyOf(this, newSize)");
            this.a = arr_v1;
        }
    }

    public final int c(int v) {
        if(v >= 0 && v < this.b) {
            return this.a[v];
        }
        StringBuilder stringBuilder0 = b.A(v, "Index ", " must be in 0..");
        stringBuilder0.append(this.b - 1);
        throw new IndexOutOfBoundsException(stringBuilder0.toString());
    }

    public final int d(int v) {
        if(v >= 0) {
            int v1 = this.b;
            if(v < v1) {
                int[] arr_v = this.a;
                int v2 = arr_v[v];
                if(v != v1 - 1) {
                    n.h0(v, v + 1, v1, arr_v, arr_v);
                }
                --this.b;
                return v2;
            }
        }
        StringBuilder stringBuilder0 = b.A(v, "Index ", " must be in 0..");
        stringBuilder0.append(this.b - 1);
        throw new IndexOutOfBoundsException(stringBuilder0.toString());
    }

    public final void e(int v, int v1) {
        if(v >= 0 && v < this.b) {
            int[] arr_v = this.a;
            int v2 = arr_v[v];
            arr_v[v] = v1;
            return;
        }
        StringBuilder stringBuilder0 = b.A(v, "set index ", " must be between 0 .. ");
        stringBuilder0.append(this.b - 1);
        throw new IndexOutOfBoundsException(stringBuilder0.toString());
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 instanceof r) {
            int v = this.b;
            if(((r)object0).b == v) {
                int[] arr_v = this.a;
                int[] arr_v1 = ((r)object0).a;
                d d0 = J.R(0, v);
                int v1 = d0.X;
                int v2 = d0.Y;
                if(v1 <= v2) {
                    while(true) {
                        if(arr_v[v1] != arr_v1[v1]) {
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
        int[] arr_v = this.a;
        int v = this.b;
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += arr_v[v1] * 0x1F;
        }
        return v2;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("[");
        int[] arr_v = this.a;
        int v = this.b;
        for(int v1 = 0; true; ++v1) {
            if(v1 >= v) {
                stringBuilder0.append("]");
                break;
            }
            int v2 = arr_v[v1];
            if(v1 == -1) {
                stringBuilder0.append("...");
                break;
            }
            if(v1 != 0) {
                stringBuilder0.append(", ");
            }
            stringBuilder0.append(v2);
        }
        String s = stringBuilder0.toString();
        j.e(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }
}

