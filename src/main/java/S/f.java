package s;

import Bb.n;
import Nb.j;
import Ob.b;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import t.a;

public final class f implements b, Ob.f, Collection, Set {
    public int[] X;
    public Object[] Y;
    public int Z;

    public f(int v) {
        this.X = a.a;
        this.Y = a.c;
        if(v > 0) {
            p.a(this, v);
        }
    }

    public final Object a(int v) {
        int v1 = this.Z;
        Object[] arr_object = this.Y;
        Object object0 = arr_object[v];
        if(v1 <= 1) {
            this.clear();
            return object0;
        }
        int[] arr_v = this.X;
        int v2 = 8;
        if(arr_v.length <= 8 || v1 >= arr_v.length / 3) {
            if(v < v1 - 1) {
                n.h0(v, v + 1, v1, arr_v, arr_v);
                n.i0(v, v + 1, v1, this.Y, this.Y);
            }
            this.Y[v1 - 1] = null;
        }
        else {
            if(v1 > 8) {
                v2 = v1 + (v1 >> 1);
            }
            p.a(this, v2);
            if(v > 0) {
                n.k0(0, v, 6, arr_v, this.X);
                n.l0(0, v, 6, arr_object, this.Y);
            }
            if(v < v1 - 1) {
                n.h0(v, v + 1, v1, arr_v, this.X);
                n.i0(v, v + 1, v1, arr_object, this.Y);
            }
        }
        if(v1 != this.Z) {
            throw new ConcurrentModificationException();
        }
        this.Z = v1 - 1;
        return object0;
    }

    @Override
    public final boolean add(Object object0) {
        int v2;
        int v1;
        int v = this.Z;
        if(object0 == null) {
            v1 = p.b(this, null, 0);
            v2 = 0;
        }
        else {
            int v3 = object0.hashCode();
            v2 = v3;
            v1 = p.b(this, object0, v3);
        }
        if(v1 < 0) {
            int v4 = 8;
            int[] arr_v = this.X;
            if(v >= arr_v.length) {
                if(v >= 8) {
                    v4 = (v >> 1) + v;
                }
                else if(v < 4) {
                    v4 = 4;
                }
                Object[] arr_object = this.Y;
                p.a(this, v4);
                if(v != this.Z) {
                    throw new ConcurrentModificationException();
                }
                int[] arr_v1 = this.X;
                if(arr_v1.length != 0) {
                    n.k0(0, arr_v.length, 6, arr_v, arr_v1);
                    n.l0(0, arr_object.length, 6, arr_object, this.Y);
                }
            }
            if(~v1 < v) {
                n.h0(-v1, ~v1, v, this.X, this.X);
                n.i0(-v1, ~v1, v, this.Y, this.Y);
            }
            int v5 = this.Z;
            if(v == v5) {
                int[] arr_v2 = this.X;
                if(~v1 < arr_v2.length) {
                    arr_v2[~v1] = v2;
                    this.Y[~v1] = object0;
                    this.Z = v5 + 1;
                    return true;
                }
            }
            throw new ConcurrentModificationException();
        }
        return false;
    }

    @Override
    public final boolean addAll(Collection collection0) {
        j.f(collection0, "elements");
        int v = collection0.size() + this.Z;
        int v1 = this.Z;
        int[] arr_v = this.X;
        boolean z = false;
        if(arr_v.length < v) {
            Object[] arr_object = this.Y;
            p.a(this, v);
            int v2 = this.Z;
            if(v2 > 0) {
                n.k0(0, v2, 6, arr_v, this.X);
                n.l0(0, this.Z, 6, arr_object, this.Y);
            }
        }
        if(this.Z != v1) {
            throw new ConcurrentModificationException();
        }
        for(Object object0: collection0) {
            z |= this.add(object0);
        }
        return z;
    }

    @Override
    public final void clear() {
        if(this.Z != 0) {
            this.X = a.a;
            this.Y = a.c;
            this.Z = 0;
        }
        if(this.Z != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override
    public final boolean contains(Object object0) {
        return (object0 == null ? p.b(this, null, 0) : p.b(this, object0, object0.hashCode())) >= 0;
    }

    @Override
    public final boolean containsAll(Collection collection0) {
        j.f(collection0, "elements");
        for(Object object0: collection0) {
            if(!this.contains(object0)) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 instanceof Set && this.Z == ((Set)object0).size()) {
            try {
                int v = this.Z;
                for(int v1 = 0; v1 < v; ++v1) {
                    if(!((Set)object0).contains(this.Y[v1])) {
                        return false;
                    }
                }
                return true;
            }
            catch(NullPointerException | ClassCastException unused_ex) {
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int[] arr_v = this.X;
        int v = this.Z;
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += arr_v[v1];
        }
        return v2;
    }

    @Override
    public final boolean isEmpty() {
        return this.Z <= 0;
    }

    @Override
    public final Iterator iterator() {
        return new s.a(this);
    }

    @Override
    public final boolean remove(Object object0) {
        int v = object0 == null ? p.b(this, null, 0) : p.b(this, object0, object0.hashCode());
        if(v >= 0) {
            this.a(v);
            return true;
        }
        return false;
    }

    @Override
    public final boolean removeAll(Collection collection0) {
        j.f(collection0, "elements");
        boolean z = false;
        for(Object object0: collection0) {
            z |= this.remove(object0);
        }
        return z;
    }

    @Override
    public final boolean retainAll(Collection collection0) {
        j.f(collection0, "elements");
        int v = this.Z - 1;
        boolean z = false;
        while(-1 < v) {
            if(!Bb.p.k0(collection0, this.Y[v])) {
                this.a(v);
                z = true;
            }
            --v;
        }
        return z;
    }

    @Override
    public final int size() {
        return this.Z;
    }

    @Override
    public final Object[] toArray() {
        return n.n0(this.Y, 0, this.Z);
    }

    @Override
    public final Object[] toArray(Object[] arr_object) {
        j.f(arr_object, "array");
        int v = this.Z;
        if(arr_object.length < v) {
            arr_object = (Object[])Array.newInstance(arr_object.getClass().getComponentType(), v);
        }
        else if(arr_object.length > v) {
            arr_object[v] = null;
        }
        n.i0(0, 0, this.Z, this.Y, arr_object);
        return arr_object;
    }

    @Override
    public final String toString() {
        if(this.isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder0 = new StringBuilder(this.Z * 14);
        stringBuilder0.append('{');
        int v = this.Z;
        for(int v1 = 0; v1 < v; ++v1) {
            if(v1 > 0) {
                stringBuilder0.append(", ");
            }
            Object object0 = this.Y[v1];
            if(object0 == this) {
                stringBuilder0.append("(this Set)");
            }
            else {
                stringBuilder0.append(object0);
            }
        }
        stringBuilder0.append('}');
        String s = stringBuilder0.toString();
        j.e(s, "StringBuilder(capacity).…builderAction).toString()");
        return s;
    }
}

