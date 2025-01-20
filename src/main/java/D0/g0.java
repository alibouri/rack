package D0;

import Nb.i;
import Ob.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;

public final class g0 implements a, Collection {
    public final Set X;

    public g0() {
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        super();
        this.X = linkedHashSet0;
    }

    @Override
    public final boolean add(Object object0) {
        return this.X.add(object0);
    }

    @Override
    public final boolean addAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void clear() {
        this.X.clear();
    }

    @Override
    public final boolean contains(Object object0) {
        return this.X.contains(object0);
    }

    @Override
    public final boolean containsAll(Collection collection0) {
        return this.X.containsAll(collection0);
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
        return this.X.remove(object0);
    }

    @Override
    public final boolean removeAll(Collection collection0) {
        return this.X.remove(collection0);
    }

    @Override
    public final boolean removeIf(Predicate predicate0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean retainAll(Collection collection0) {
        return this.X.retainAll(collection0);
    }

    @Override
    public final int size() {
        return this.X.size();
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

