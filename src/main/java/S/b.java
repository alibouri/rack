package s;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class b implements Set {
    public final e X;

    public b(e e0) {
        this.X = e0;
    }

    @Override
    public final boolean add(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean addAll(Collection collection0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void clear() {
        this.X.clear();
    }

    @Override
    public final boolean contains(Object object0) {
        return this.X.containsKey(object0);
    }

    @Override
    public final boolean containsAll(Collection collection0) {
        return this.X.i(collection0);
    }

    @Override
    public final boolean equals(Object object0) {
        e e0 = this.X;
        if(this == object0) {
            return true;
        }
        if(object0 instanceof Set) {
            Set set0 = (Set)object0;
            try {
                return e0.Z == set0.size() && e0.i(set0);
            }
            catch(NullPointerException | ClassCastException unused_ex) {
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        e e0 = this.X;
        int v = e0.Z - 1;
        int v1 = 0;
        while(v >= 0) {
            Object object0 = e0.e(v);
            v1 += (object0 == null ? 0 : object0.hashCode());
            --v;
        }
        return v1;
    }

    @Override
    public final boolean isEmpty() {
        return this.X.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new a(this.X, 0);
    }

    @Override
    public final boolean remove(Object object0) {
        e e0 = this.X;
        int v = e0.c(object0);
        if(v >= 0) {
            e0.f(v);
            return true;
        }
        return false;
    }

    @Override
    public final boolean removeAll(Collection collection0) {
        return this.X.j(collection0);
    }

    @Override
    public final boolean retainAll(Collection collection0) {
        e e0 = this.X;
        int v = e0.Z;
        for(int v1 = v - 1; v1 >= 0; --v1) {
            if(!collection0.contains(e0.e(v1))) {
                e0.f(v1);
            }
        }
        return v != e0.Z;
    }

    @Override
    public final int size() {
        return this.X.Z;
    }

    @Override
    public final Object[] toArray() {
        e e0 = this.X;
        int v = e0.Z;
        Object[] arr_object = new Object[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_object[v1] = e0.e(v1);
        }
        return arr_object;
    }

    @Override
    public final Object[] toArray(Object[] arr_object) {
        e e0 = this.X;
        int v = e0.Z;
        if(arr_object.length < v) {
            arr_object = (Object[])Array.newInstance(arr_object.getClass().getComponentType(), v);
        }
        for(int v1 = 0; v1 < v; ++v1) {
            arr_object[v1] = e0.e(v1);
        }
        if(arr_object.length > v) {
            arr_object[v] = null;
        }
        return arr_object;
    }
}

