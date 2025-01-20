package s;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

public final class d implements Collection {
    public final e X;

    public d(e e0) {
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
        return this.X.a(object0) >= 0;
    }

    @Override
    public final boolean containsAll(Collection collection0) {
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
    public final boolean isEmpty() {
        return this.X.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new a(this.X, 1);
    }

    @Override
    public final boolean remove(Object object0) {
        e e0 = this.X;
        int v = e0.a(object0);
        if(v >= 0) {
            e0.f(v);
            return true;
        }
        return false;
    }

    @Override
    public final boolean removeAll(Collection collection0) {
        e e0 = this.X;
        int v = e0.Z;
        boolean z = false;
        for(int v1 = 0; v1 < v; ++v1) {
            if(collection0.contains(e0.h(v1))) {
                e0.f(v1);
                --v1;
                --v;
                z = true;
            }
        }
        return z;
    }

    @Override
    public final boolean retainAll(Collection collection0) {
        e e0 = this.X;
        int v = e0.Z;
        boolean z = false;
        for(int v1 = 0; v1 < v; ++v1) {
            if(!collection0.contains(e0.h(v1))) {
                e0.f(v1);
                --v1;
                --v;
                z = true;
            }
        }
        return z;
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
            arr_object[v1] = e0.h(v1);
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
            arr_object[v1] = e0.h(v1);
        }
        if(arr_object.length > v) {
            arr_object[v] = null;
        }
        return arr_object;
    }
}

