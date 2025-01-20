package X6;

import W5.f;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

public abstract class g extends a implements Set {
    public transient e Y;
    public static final int Z;

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof g && this instanceof j) {
            ((g)object0).getClass();
            if(((g)object0) instanceof j && this.hashCode() != object0.hashCode()) {
                return false;
            }
        }
        if(this == object0) {
            return true;
        }
        if(object0 instanceof Set) {
            Set set0 = (Set)object0;
            try {
                return this.size() == set0.size() && this.containsAll(set0);
            }
            catch(NullPointerException | ClassCastException unused_ex) {
            }
        }
        return false;
    }

    public static int g(int v) {
        int v1 = Math.max(v, 2);
        boolean z = true;
        if(v1 < 0x2CCCCCCC) {
            int v2;
            for(v2 = Integer.highestOneBit(v1 - 1) << 1; ((double)v2) * 0.7 < ((double)v1); v2 <<= 1) {
            }
            return v2;
        }
        if(v1 >= 0x40000000) {
            z = false;
        }
        if(!z) {
            throw new IllegalArgumentException("collection too large");
        }
        return 0x40000000;
    }

    @Override
    public abstract int hashCode();

    public static g i(int v, Object[] arr_object) {
        switch(v) {
            case 0: {
                return j.h0;
            }
            case 1: {
                Object object3 = arr_object[0];
                Objects.requireNonNull(object3);
                return new k(object3);
            }
            default: {
                int v1 = g.g(v);
                Object[] arr_object1 = new Object[v1];
                int v3 = 0;
                int v4 = 0;
                for(int v2 = 0; v2 < v; ++v2) {
                    Object object0 = arr_object[v2];
                    if(object0 == null) {
                        throw new NullPointerException("at index " + v2);
                    }
                    int v5 = object0.hashCode();
                    for(int v6 = f.a0(v5); true; ++v6) {
                        int v7 = v6 & v1 - 1;
                        Object object1 = arr_object1[v7];
                        if(object1 == null) {
                            arr_object[v4] = object0;
                            arr_object1[v7] = object0;
                            v3 += v5;
                            ++v4;
                            break;
                        }
                        if(object1.equals(object0)) {
                            break;
                        }
                    }
                }
                Arrays.fill(arr_object, v4, v, null);
                if(v4 == 1) {
                    Object object2 = arr_object[0];
                    Objects.requireNonNull(object2);
                    return new k(object2);
                }
                if(g.g(v4) < v1 / 2) {
                    return g.i(v4, arr_object);
                }
                if(v4 < (arr_object.length >> 1) + (arr_object.length >> 2)) {
                    arr_object = Arrays.copyOf(arr_object, v4);
                }
                return new j(v3, v1 - 1, v4, arr_object, arr_object1);
            }
        }
    }

    @Override  // X6.a
    public Object writeReplace() {
        return new X6.f(this.toArray(a.X));
    }
}

