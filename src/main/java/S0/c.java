package S0;

import Bb.n;
import Nb.j;
import T0.h;
import T0.i;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

public final class c {
    public int[] a;
    public Object[] b;
    public int c;

    public final Object a(Object object0) {
        int v = object0 == null ? this.c() : this.b(object0.hashCode(), object0);
        return v < 0 ? null : this.b[(v << 1) + 1];
    }

    public final int b(int v, Object object0) {
        int v1 = this.c;
        if(v1 == 0) {
            return -1;
        }
        int v2 = a.a(v1, v, this.a);
        if(v2 < 0) {
            return v2;
        }
        if(j.a(object0, this.b[v2 << 1])) {
            return v2;
        }
        int v3;
        for(v3 = v2 + 1; v3 < v1 && this.a[v3] == v; ++v3) {
            if(j.a(object0, this.b[v3 << 1])) {
                return v3;
            }
        }
        for(int v4 = v2 - 1; v4 >= 0 && this.a[v4] == v; --v4) {
            if(j.a(object0, this.b[v4 << 1])) {
                return v4;
            }
        }
        return ~v3;
    }

    public final int c() {
        int v = this.c;
        if(v == 0) {
            return -1;
        }
        int v1 = a.a(v, 0, this.a);
        if(v1 < 0) {
            return v1;
        }
        if(this.b[v1 << 1] == null) {
            return v1;
        }
        int v2;
        for(v2 = v1 + 1; v2 < v && this.a[v2] == 0; ++v2) {
            if(this.b[v2 << 1] == null) {
                return v2;
            }
        }
        for(int v3 = v1 - 1; v3 >= 0 && this.a[v3] == 0; --v3) {
            if(this.b[v3 << 1] == null) {
                return v3;
            }
        }
        return ~v2;
    }

    public final Object d(i i0, h h0) {
        int v2;
        int v1;
        int v = this.c;
        if(i0 == null) {
            v1 = this.c();
            v2 = 0;
        }
        else {
            v2 = i0.hashCode();
            v1 = this.b(v2, i0);
        }
        if(v1 >= 0) {
            int v3 = (v1 << 1) + 1;
            Object[] arr_object = this.b;
            Object object0 = arr_object[v3];
            arr_object[v3] = h0;
            return object0;
        }
        int v4 = 8;
        int[] arr_v = this.a;
        if(v >= arr_v.length) {
            if(v >= 8) {
                v4 = (v >> 1) + v;
            }
            else if(v < 4) {
                v4 = 4;
            }
            int[] arr_v1 = Arrays.copyOf(arr_v, v4);
            j.e(arr_v1, "copyOf(this, newSize)");
            this.a = arr_v1;
            Object[] arr_object1 = Arrays.copyOf(this.b, v4 << 1);
            j.e(arr_object1, "copyOf(this, newSize)");
            this.b = arr_object1;
            if(v != this.c) {
                throw new ConcurrentModificationException();
            }
        }
        if(~v1 < v) {
            n.h0(-v1, ~v1, v, this.a, this.a);
            n.i0(-v1 << 1, ~v1 << 1, this.c << 1, this.b, this.b);
        }
        int v5 = this.c;
        if(v == v5) {
            int[] arr_v2 = this.a;
            if(~v1 < arr_v2.length) {
                arr_v2[~v1] = v2;
                Object[] arr_object2 = this.b;
                arr_object2[~v1 << 1] = i0;
                arr_object2[(~v1 << 1) + 1] = h0;
                this.c = v5 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        try {
            if(object0 instanceof c) {
                int v = this.c;
                if(v != ((c)object0).c) {
                    return false;
                }
                for(int v1 = 0; v1 < v; ++v1) {
                    Object[] arr_object = this.b;
                    Object object1 = arr_object[v1 << 1];
                    Object object2 = arr_object[(v1 << 1) + 1];
                    Object object3 = ((c)object0).a(object1);
                    if(object2 == null) {
                        if(object3 != null || (object1 == null ? ((c)object0).c() : ((c)object0).b(object1.hashCode(), object1)) < 0) {
                            return false;
                        }
                    }
                    else if(!object2.equals(object3)) {
                        return false;
                    }
                }
                return true;
            }
            if(!(object0 instanceof Map) || this.c != ((Map)object0).size()) {
                return false;
            }
            int v2 = this.c;
            for(int v3 = 0; v3 < v2; ++v3) {
                Object[] arr_object1 = this.b;
                Object object4 = arr_object1[v3 << 1];
                Object object5 = arr_object1[(v3 << 1) + 1];
                Object object6 = ((Map)object0).get(object4);
                if(object5 == null) {
                    if(object6 != null || !((Map)object0).containsKey(object4)) {
                        return false;
                    }
                }
                else if(!object5.equals(object6)) {
                    return false;
                }
            }
            return true;
        }
        catch(NullPointerException | ClassCastException unused_ex) {
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int[] arr_v = this.a;
        Object[] arr_object = this.b;
        int v = this.c;
        int v2 = 0;
        int v3 = 0;
        for(int v1 = 1; v2 < v; v1 += 2) {
            Object object0 = arr_object[v1];
            v3 += (object0 == null ? 0 : object0.hashCode()) ^ arr_v[v2];
            ++v2;
        }
        return v3;
    }

    @Override
    public final String toString() {
        int v = this.c;
        if(v <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder0 = new StringBuilder(v * 28);
        stringBuilder0.append('{');
        int v1 = this.c;
        for(int v2 = 0; v2 < v1; ++v2) {
            if(v2 > 0) {
                stringBuilder0.append(", ");
            }
            Object object0 = this.b[v2 << 1];
            if(object0 == this) {
                stringBuilder0.append("(this Map)");
            }
            else {
                stringBuilder0.append(object0);
            }
            stringBuilder0.append('=');
            Object object1 = this.b[(v2 << 1) + 1];
            if(object1 == this) {
                stringBuilder0.append("(this Map)");
            }
            else {
                stringBuilder0.append(object1);
            }
        }
        stringBuilder0.append('}');
        return stringBuilder0.toString();
    }
}

