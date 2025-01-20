package F0;

import Nb.i;
import Nb.j;
import Ob.a;
import g0.n;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

public final class q implements a, List {
    public final int X;
    public final int Y;
    public final r Z;

    public q(r r0, int v, int v1) {
        this.Z = r0;
        this.X = v;
        this.Y = v1;
    }

    @Override
    public final void add(int v, Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean add(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean addAll(int v, Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean addAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean contains(Object object0) {
        return object0 instanceof n ? this.indexOf(((n)object0)) != -1 : false;
    }

    @Override
    public final boolean containsAll(Collection collection0) {
        for(Object object0: collection0) {
            if(!this.contains(((n)object0))) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    @Override
    public final Object get(int v) {
        Object object0 = this.Z.X[v + this.X];
        j.d(object0, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (n)object0;
    }

    @Override
    public final int indexOf(Object object0) {
        if(!(object0 instanceof n)) {
            return -1;
        }
        int v = this.X;
        int v1 = this.Y;
        if(v <= v1) {
            for(int v2 = v; true; ++v2) {
                if(j.a(this.Z.X[v2], ((n)object0))) {
                    return v2 - v;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return -1;
    }

    @Override
    public final boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public final Iterator iterator() {
        return new Cb.a(this.Z, this.X, this.X, this.Y);
    }

    @Override
    public final int lastIndexOf(Object object0) {
        if(!(object0 instanceof n)) {
            return -1;
        }
        int v = this.Y;
        int v1 = this.X;
        if(v1 <= v) {
            while(true) {
                if(j.a(this.Z.X[v], ((n)object0))) {
                    return v - v1;
                }
                if(v == v1) {
                    break;
                }
                --v;
            }
        }
        return -1;
    }

    @Override
    public final ListIterator listIterator() {
        return new Cb.a(this.Z, this.X, this.X, this.Y);
    }

    @Override
    public final ListIterator listIterator(int v) {
        return new Cb.a(this.Z, v + this.X, this.X, this.Y);
    }

    @Override
    public final Object remove(int v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean remove(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean removeAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void replaceAll(UnaryOperator unaryOperator0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean retainAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final Object set(int v, Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.Y - this.X;
    }

    @Override
    public final void sort(Comparator comparator0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final List subList(int v, int v1) {
        return new q(this.Z, v + this.X, this.X + v1);
    }

    @Override
    public final Object[] toArray() {
        return i.a(this);
    }

    @Override
    public final Object[] toArray(Object[] arr_object) {
        return i.b(this, arr_object);
    }
}

