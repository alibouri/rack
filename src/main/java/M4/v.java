package M4;

import Bb.n;
import Nb.j;
import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;

public final class v extends AbstractList {
    public Handler X;
    public final String Y;
    public final ArrayList Z;
    public final ArrayList b0;
    public static final AtomicInteger c0;

    static {
        v.c0 = new AtomicInteger();
    }

    public v(Collection collection0) {
        this.Y = String.valueOf(v.c0.incrementAndGet());
        this.b0 = new ArrayList();
        this.Z = new ArrayList(collection0);
    }

    public v(t[] arr_t) {
        this.Y = String.valueOf(v.c0.incrementAndGet());
        this.b0 = new ArrayList();
        this.Z = new ArrayList(n.d0(arr_t));
    }

    @Override
    public final void add(int v, Object object0) {
        j.f(((t)object0), "element");
        this.Z.add(v, ((t)object0));
    }

    @Override
    public final boolean add(Object object0) {
        j.f(((t)object0), "element");
        return this.Z.add(((t)object0));
    }

    @Override
    public final void clear() {
        this.Z.clear();
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final boolean contains(Object object0) {
        return (object0 == null ? true : object0 instanceof t) ? super.contains(((t)object0)) : false;
    }

    @Override
    public final Object get(int v) {
        return (t)this.Z.get(v);
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final int indexOf(Object object0) {
        return (object0 == null ? true : object0 instanceof t) ? super.indexOf(((t)object0)) : -1;
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final int lastIndexOf(Object object0) {
        return (object0 == null ? true : object0 instanceof t) ? super.lastIndexOf(((t)object0)) : -1;
    }

    @Override
    public final Object remove(int v) {
        return (t)this.Z.remove(v);
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final boolean remove(Object object0) {
        return (object0 == null ? true : object0 instanceof t) ? super.remove(((t)object0)) : false;
    }

    @Override
    public final Object set(int v, Object object0) {
        j.f(((t)object0), "element");
        return (t)this.Z.set(v, ((t)object0));
    }

    @Override
    public final int size() {
        return this.Z.size();
    }
}

