package V0;

import Bb.z;
import Nb.i;
import Nb.j;
import Ob.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public final class c implements a, Collection {
    public final List X;
    public final int Y;
    public static final c Z;

    static {
        c.Z = new c(z.X);
    }

    public c(List list0) {
        this.X = list0;
        this.Y = list0.size();
    }

    public final b a() {
        return (b)this.X.get(0);
    }

    @Override
    public final boolean add(Object object0) {
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
        return object0 instanceof b ? this.X.contains(((b)object0)) : false;
    }

    @Override
    public final boolean containsAll(Collection collection0) {
        return this.X.containsAll(collection0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof c ? j.a(this.X, ((c)object0).X) : false;
    }

    @Override
    public final int hashCode() {
        return this.X.hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.X.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return this.X.iterator();
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
    public final boolean removeIf(Predicate predicate0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean retainAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.Y;
    }

    @Override
    public final Object[] toArray() {
        return i.a(this);
    }

    @Override
    public final Object[] toArray(Object[] arr_object) {
        return i.b(this, arr_object);
    }

    @Override
    public final String toString() {
        return "LocaleList(localeList=" + this.X + ')';
    }
}

