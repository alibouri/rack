package d6;

import V0.a;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;

public abstract class l extends AbstractCollection implements Serializable {
    public static final Object[] X;

    static {
        l.X = new Object[0];
    }

    public abstract Object[] a();

    @Override
    public final boolean add(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean addAll(Collection collection0) {
        throw new UnsupportedOperationException();
    }

    public abstract int c();

    @Override
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract int d();

    public abstract boolean e();

    public abstract int g(Object[] arg1);

    @Override
    public final boolean remove(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean removeAll(Collection collection0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean retainAll(Collection collection0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Spliterator spliterator() {
        return a.p(this);
    }

    @Override
    public final Object[] toArray() {
        return this.toArray(l.X);
    }

    @Override
    public final Object[] toArray(Object[] arr_object) {
        arr_object.getClass();
        int v = this.size();
        if(arr_object.length < v) {
            Object[] arr_object1 = this.a();
            if(arr_object1 == null) {
                if(arr_object.length != 0) {
                    arr_object = Arrays.copyOf(arr_object, 0);
                }
                arr_object = Arrays.copyOf(arr_object, v);
                this.g(arr_object);
                return arr_object;
            }
            return Arrays.copyOfRange(arr_object1, this.c(), this.d(), arr_object.getClass());
        }
        else if(arr_object.length > v) {
            arr_object[v] = null;
        }
        this.g(arr_object);
        return arr_object;
    }
}

