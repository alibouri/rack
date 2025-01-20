package F0;

import Bb.q;
import Nb.i;
import Nb.j;
import Ob.a;
import g0.n;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.functions.Function0;

public final class r implements a, List {
    public Object[] X;
    public long[] Y;
    public int Z;
    public int b0;
    public boolean c0;

    public r() {
        this.X = new Object[16];
        this.Y = new long[16];
        this.Z = -1;
        this.c0 = true;
    }

    public final long a() {
        long v = f.a(Infinityf, false);
        int v1 = this.Z + 1;
        int v2 = q.y(this);
        if(v1 <= v2) {
            while(true) {
                long v3 = this.Y[v1];
                if(f.h(v3, v) < 0) {
                    v = v3;
                }
                if(Float.intBitsToFloat(((int)(v >> 0x20))) >= 0.0f && ((int)(0xFFFFFFFFL & v)) != 0) {
                    return v;
                }
                if(v1 == v2) {
                    break;
                }
                ++v1;
            }
        }
        return v;
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

    public final void c(n n0, float f, boolean z, Function0 function00) {
        int v = this.Z;
        this.Z = v + 1;
        Object[] arr_object = this.X;
        if(v + 1 >= arr_object.length) {
            Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length + 16);
            j.e(arr_object1, "copyOf(this, newSize)");
            this.X = arr_object1;
            long[] arr_v = Arrays.copyOf(this.Y, arr_object.length + 16);
            j.e(arr_v, "copyOf(this, newSize)");
            this.Y = arr_v;
        }
        int v1 = this.Z;
        this.X[v1] = n0;
        this.Y[v1] = f.a(f, z);
        this.d();
        function00.invoke();
        this.Z = v;
    }

    @Override
    public final void clear() {
        this.Z = -1;
        this.d();
        this.c0 = true;
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

    public final void d() {
        int v = this.Z + 1;
        int v1 = q.y(this);
        if(v <= v1) {
            while(true) {
                this.X[v] = null;
                if(v == v1) {
                    break;
                }
                ++v;
            }
        }
        this.b0 = this.Z + 1;
    }

    @Override
    public final Object get(int v) {
        Object object0 = this.X[v];
        j.d(object0, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (n)object0;
    }

    @Override
    public final int indexOf(Object object0) {
        if(!(object0 instanceof n)) {
            return -1;
        }
        int v = q.y(this);
        if(v >= 0) {
            for(int v1 = 0; true; ++v1) {
                if(j.a(this.X[v1], ((n)object0))) {
                    return v1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return -1;
    }

    @Override
    public final boolean isEmpty() {
        return this.b0 == 0;
    }

    @Override
    public final Iterator iterator() {
        return new Cb.a(this, 0, 7);
    }

    @Override
    public final int lastIndexOf(Object object0) {
        if(!(object0 instanceof n)) {
            return -1;
        }
        for(int v = q.y(this); -1 < v; --v) {
            if(j.a(this.X[v], ((n)object0))) {
                return v;
            }
        }
        return -1;
    }

    @Override
    public final ListIterator listIterator() {
        return new Cb.a(this, 0, 7);
    }

    @Override
    public final ListIterator listIterator(int v) {
        return new Cb.a(this, v, 6);
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
        return this.b0;
    }

    @Override
    public final void sort(Comparator comparator0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final List subList(int v, int v1) {
        return new F0.q(this, v, v1);
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

