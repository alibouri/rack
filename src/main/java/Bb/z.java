package Bb;

import A3.e;
import Nb.i;
import Nb.j;
import Ob.a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class z implements a, Serializable, List, RandomAccess {
    public static final z X;

    static {
        z.X = new z();  // initializer: Ljava/lang/Object;-><init>()V
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
        if(!(object0 instanceof Void)) {
            return false;
        }
        j.f(((Void)object0), "element");
        return false;
    }

    @Override
    public final boolean containsAll(Collection collection0) {
        j.f(collection0, "elements");
        return collection0.isEmpty();
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof List && ((List)object0).isEmpty();
    }

    @Override
    public final Object get(int v) {
        throw new IndexOutOfBoundsException("Empty list doesn\'t contain element at index " + v + '.');
    }

    @Override
    public final int hashCode() {
        return 1;
    }

    @Override
    public final int indexOf(Object object0) {
        if(!(object0 instanceof Void)) {
            return -1;
        }
        j.f(((Void)object0), "element");
        return -1;
    }

    @Override
    public final boolean isEmpty() {
        return true;
    }

    @Override
    public final Iterator iterator() {
        return y.X;
    }

    @Override
    public final int lastIndexOf(Object object0) {
        if(!(object0 instanceof Void)) {
            return -1;
        }
        j.f(((Void)object0), "element");
        return -1;
    }

    @Override
    public final ListIterator listIterator() {
        return y.X;
    }

    @Override
    public final ListIterator listIterator(int v) {
        if(v != 0) {
            throw new IndexOutOfBoundsException("Index: " + v);
        }
        return y.X;
    }

    private final Object readResolve() {
        return z.X;
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
    public final boolean retainAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final Object set(int v, Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return 0;
    }

    @Override
    public final List subList(int v, int v1) {
        if(v != 0 || v1 != 0) {
            throw new IndexOutOfBoundsException(e.t(v, v1, "fromIndex: ", ", toIndex: "));
        }
        return this;
    }

    @Override
    public final Object[] toArray() {
        return i.a(this);
    }

    @Override
    public final Object[] toArray(Object[] arr_object) {
        j.f(arr_object, "array");
        return i.b(this, arr_object);
    }

    @Override
    public final String toString() {
        return "[]";
    }
}

