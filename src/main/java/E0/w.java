package e0;

import Bb.G;
import I2.J;
import Nb.i;
import Nb.j;
import Nb.u;
import Ob.c;
import U.d;
import Y.f;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public final class w implements c, List {
    public final p X;
    public final int Y;
    public int Z;
    public int b0;

    public w(p p0, int v, int v1) {
        this.X = p0;
        this.Y = v;
        this.Z = p0.d();
        this.b0 = v1 - v;
    }

    public final void a() {
        if(this.X.d() != this.Z) {
            throw new ConcurrentModificationException();
        }
    }

    @Override
    public final void add(int v, Object object0) {
        this.a();
        this.X.add(this.Y + v, object0);
        ++this.b0;
        this.Z = this.X.d();
    }

    @Override
    public final boolean add(Object object0) {
        this.a();
        this.X.add(this.Y + this.b0, object0);
        ++this.b0;
        this.Z = this.X.d();
        return true;
    }

    @Override
    public final boolean addAll(int v, Collection collection0) {
        this.a();
        p p0 = this.X;
        boolean z = p0.addAll(v + this.Y, collection0);
        if(z) {
            this.b0 = collection0.size() + this.b0;
            this.Z = p0.d();
        }
        return z;
    }

    @Override
    public final boolean addAll(Collection collection0) {
        return this.addAll(this.b0, collection0);
    }

    @Override
    public final void clear() {
        g g0;
        boolean z;
        Y.c c0;
        if(this.b0 > 0) {
            this.a();
            p p0 = this.X;
            int v = this.Y;
            int v1 = this.b0 + v;
            p0.getClass();
            do {
                Object object0 = q.a;
                synchronized(object0) {
                    o o0 = p0.X;
                    j.d(o0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    o o1 = (o)m.i(o0);
                    int v2 = o1.d;
                    c0 = o1.c;
                }
                j.c(c0);
                f f0 = c0.g();
                f0.subList(v, v1).clear();
                Y.c c1 = f0.d();
                if(j.a(c1, c0)) {
                    break;
                }
                o o2 = p0.X;
                j.d(o2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized(m.b) {
                    g0 = m.k();
                    o o3 = (o)m.x(o2, p0, g0);
                    synchronized(object0) {
                        int v4 = o3.d;
                        if(v4 == v2) {
                            o3.c = c1;
                            o3.d = v4 + 1;
                            z = true;
                            ++o3.e;
                        }
                        else {
                            z = false;
                        }
                    }
                }
                m.o(g0, p0);
            }
            while(!z);
            this.b0 = 0;
            this.Z = this.X.d();
        }
    }

    @Override
    public final boolean contains(Object object0) {
        return this.indexOf(object0) >= 0;
    }

    @Override
    public final boolean containsAll(Collection collection0) {
        if(!(collection0 instanceof Collection) || !collection0.isEmpty()) {
            for(Object object0: collection0) {
                if(!this.contains(object0)) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
        }
        return true;
    }

    @Override
    public final Object get(int v) {
        this.a();
        q.a(v, this.b0);
        return this.X.get(this.Y + v);
    }

    @Override
    public final int indexOf(Object object0) {
        this.a();
        int v = this.Y;
        Iterator iterator0 = J.R(v, this.b0 + v).iterator();
        while(iterator0.hasNext()) {
            int v1 = ((Sb.c)iterator0).a();
            if(j.a(object0, this.X.get(v1))) {
                return v1 - v;
            }
            if(false) {
                break;
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
        return this.listIterator(0);
    }

    @Override
    public final int lastIndexOf(Object object0) {
        this.a();
        int v = this.Y;
        for(int v1 = this.b0 + v - 1; v1 >= v; --v1) {
            if(j.a(object0, this.X.get(v1))) {
                return v1 - v;
            }
        }
        return -1;
    }

    @Override
    public final ListIterator listIterator() {
        return this.listIterator(0);
    }

    @Override
    public final ListIterator listIterator(int v) {
        this.a();
        u u0 = new u();  // initializer: Ljava/lang/Object;-><init>()V
        u0.X = v - 1;
        return new G(u0, this);
    }

    @Override
    public final Object remove(int v) {
        this.a();
        Object object0 = this.X.remove(this.Y + v);
        --this.b0;
        this.Z = this.X.d();
        return object0;
    }

    @Override
    public final boolean remove(Object object0) {
        int v = this.indexOf(object0);
        if(v >= 0) {
            this.remove(v);
            return true;
        }
        return false;
    }

    @Override
    public final boolean removeAll(Collection collection0) {
        boolean z;
        Iterator iterator0 = collection0.iterator();
    alab1:
        while(true) {
            for(z = false; true; z = true) {
                if(!iterator0.hasNext()) {
                    break alab1;
                }
                Object object0 = iterator0.next();
                if(!this.remove(object0) && !z) {
                    break;
                }
            }
        }
        return z;
    }

    @Override
    public final boolean retainAll(Collection collection0) {
        g g0;
        boolean z;
        Y.c c0;
        this.a();
        p p0 = this.X;
        int v = this.Y;
        int v1 = this.b0 + v;
        int v2 = p0.size();
        do {
            Object object0 = q.a;
            synchronized(object0) {
                o o0 = p0.X;
                j.d(o0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                o o1 = (o)m.i(o0);
                int v3 = o1.d;
                c0 = o1.c;
            }
            j.c(c0);
            f f0 = c0.g();
            f0.subList(v, v1).retainAll(collection0);
            Y.c c1 = f0.d();
            if(j.a(c1, c0)) {
                break;
            }
            o o2 = p0.X;
            j.d(o2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized(m.b) {
                g0 = m.k();
                o o3 = (o)m.x(o2, p0, g0);
                synchronized(object0) {
                    int v5 = o3.d;
                    if(v5 == v3) {
                        o3.c = c1;
                        o3.d = v5 + 1;
                        ++o3.e;
                        z = true;
                    }
                    else {
                        z = false;
                    }
                }
            }
            m.o(g0, p0);
        }
        while(!z);
        int v6 = v2 - p0.size();
        if(v6 > 0) {
            this.Z = this.X.d();
            this.b0 -= v6;
        }
        return v6 > 0;
    }

    @Override
    public final Object set(int v, Object object0) {
        q.a(v, this.b0);
        this.a();
        Object object1 = this.X.set(v + this.Y, object0);
        this.Z = this.X.d();
        return object1;
    }

    @Override
    public final int size() {
        return this.b0;
    }

    @Override
    public final List subList(int v, int v1) {
        if(v >= 0 && v <= v1 && v1 <= this.b0) {
            this.a();
            return new w(this.X, v + this.Y, v1 + this.Y);
        }
        d.M("fromIndex or toIndex are out of bounds");
        throw null;
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

