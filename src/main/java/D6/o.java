package d6;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class o extends l implements List, RandomAccess {
    public static final m Y;

    static {
        o.Y = new m(p.c0, 0);
    }

    @Override
    public final void add(int v, Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean addAll(int v, Collection collection0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean contains(Object object0) {
        return this.indexOf(object0) >= 0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 != this) {
            if(object0 instanceof List) {
                int v = this.size();
                if(v == ((List)object0).size()) {
                    if(((List)object0) instanceof RandomAccess) {
                        for(int v1 = 0; v1 < v; ++v1) {
                            Object object1 = this.get(v1);
                            Object object2 = ((List)object0).get(v1);
                            if(object1 != object2 && (object1 == null || !object1.equals(object2))) {
                                return false;
                            }
                        }
                        return true;
                    }
                    else {
                        m m0 = this.l(0);
                        Iterator iterator0 = ((List)object0).iterator();
                        while(m0.hasNext()) {
                            if(!iterator0.hasNext()) {
                                return false;
                            }
                            Object object3 = m0.next();
                            Object object4 = iterator0.next();
                            if(object3 != object4 && (object3 == null || !object3.equals(object4))) {
                                return false;
                            }
                        }
                        return !iterator0.hasNext();
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override  // d6.l
    public int g(Object[] arr_object) {
        int v = this.size();
        for(int v1 = 0; v1 < v; ++v1) {
            arr_object[v1] = this.get(v1);
        }
        return v;
    }

    @Override
    public final int hashCode() {
        int v = this.size();
        int v2 = 1;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 = v2 * 0x1F + this.get(v1).hashCode();
        }
        return v2;
    }

    public o i(int v, int v1) {
        T4.l.V(v, v1, this.size());
        int v2 = v1 - v;
        if(v2 == this.size()) {
            return this;
        }
        return v2 == 0 ? p.c0 : new n(this, v, v2);
    }

    @Override
    public final int indexOf(Object object0) {
        if(object0 == null) {
            return -1;
        }
        int v = this.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(object0.equals(this.get(v1))) {
                return v1;
            }
        }
        return -1;
    }

    @Override
    public final Iterator iterator() {
        return this.l(0);
    }

    public final m l(int v) {
        int v1 = this.size();
        if(v < 0 || v > v1) {
            throw new IndexOutOfBoundsException(T4.l.W(v, v1, "index"));
        }
        return this.isEmpty() ? o.Y : new m(this, v);
    }

    @Override
    public final int lastIndexOf(Object object0) {
        if(object0 == null) {
            return -1;
        }
        for(int v = this.size() - 1; v >= 0; --v) {
            if(object0.equals(this.get(v))) {
                return v;
            }
        }
        return -1;
    }

    @Override
    public final ListIterator listIterator() {
        return this.l(0);
    }

    @Override
    public final ListIterator listIterator(int v) {
        return this.l(v);
    }

    @Override
    public final Object remove(int v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Object set(int v, Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List subList(int v, int v1) {
        return this.i(v, v1);
    }
}

