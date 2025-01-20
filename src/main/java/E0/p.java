package e0;

import C.y;
import Cb.a;
import Nb.j;
import Ob.c;
import U.d;
import Y.b;
import Y.f;
import Y.i;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.functions.Function1;

public final class p implements c, t, List, RandomAccess {
    public o X;

    public p() {
        i i0 = i.Y;
        o o0 = new o(i0);
        if(m.a.p() != null) {
            o o1 = new o(i0);
            o1.a = 1;
            o0.b = o1;
        }
        this.X = o0;
    }

    public final o a() {
        o o0 = this.X;
        j.d(o0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (o)m.u(o0, this);
    }

    @Override
    public final void add(int v, Object object0) {
        g g0;
        boolean z;
        Y.c c0;
        do {
            Object object1 = q.a;
            synchronized(object1) {
                o o0 = this.X;
                j.d(o0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                o o1 = (o)m.i(o0);
                int v1 = o1.d;
                c0 = o1.c;
            }
            j.c(c0);
            Y.c c1 = c0.c(v, object0);
            if(c1.equals(c0)) {
                break;
            }
            o o2 = this.X;
            j.d(o2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized(m.b) {
                g0 = m.k();
                o o3 = (o)m.x(o2, this, g0);
                synchronized(object1) {
                    int v3 = o3.d;
                    if(v3 == v1) {
                        o3.c = c1;
                        z = true;
                        ++o3.e;
                        o3.d = v3 + 1;
                    }
                    else {
                        z = false;
                    }
                }
            }
            m.o(g0, this);
        }
        while(!z);
    }

    @Override
    public final boolean add(Object object0) {
        g g0;
        Y.c c0;
        while(true) {
            Object object1 = q.a;
            synchronized(object1) {
                o o0 = this.X;
                j.d(o0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                o o1 = (o)m.i(o0);
                int v = o1.d;
                c0 = o1.c;
            }
            j.c(c0);
            Y.c c1 = c0.d(object0);
            boolean z = false;
            if(c1.equals(c0)) {
                break;
            }
            o o2 = this.X;
            j.d(o2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized(m.b) {
                g0 = m.k();
                o o3 = (o)m.x(o2, this, g0);
                synchronized(object1) {
                    int v2 = o3.d;
                    if(v2 == v) {
                        o3.c = c1;
                        ++o3.e;
                        o3.d = v2 + 1;
                        z = true;
                    }
                }
            }
            m.o(g0, this);
            if(z) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean addAll(int v, Collection collection0) {
        return this.e(new y(v, collection0));
    }

    @Override
    public final boolean addAll(Collection collection0) {
        g g0;
        Y.c c0;
        while(true) {
            Object object0 = q.a;
            synchronized(object0) {
                o o0 = this.X;
                j.d(o0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                o o1 = (o)m.i(o0);
                int v = o1.d;
                c0 = o1.c;
            }
            j.c(c0);
            Y.c c1 = c0.e(collection0);
            boolean z = false;
            if(j.a(c1, c0)) {
                break;
            }
            o o2 = this.X;
            j.d(o2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized(m.b) {
                g0 = m.k();
                o o3 = (o)m.x(o2, this, g0);
                synchronized(object0) {
                    int v2 = o3.d;
                    if(v2 == v) {
                        o3.c = c1;
                        ++o3.e;
                        o3.d = v2 + 1;
                        z = true;
                    }
                }
            }
            m.o(g0, this);
            if(z) {
                return true;
            }
        }
        return false;
    }

    @Override  // e0.t
    public final v c() {
        return this.X;
    }

    @Override
    public final void clear() {
        g g0;
        o o0 = this.X;
        j.d(o0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        synchronized(m.b) {
            g0 = m.k();
            o o1 = (o)m.x(o0, this, g0);
            synchronized(q.a) {
                o1.c = i.Y;
                ++o1.d;
                ++o1.e;
            }
        }
        m.o(g0, this);
    }

    @Override
    public final boolean contains(Object object0) {
        return this.a().c.contains(object0);
    }

    @Override
    public final boolean containsAll(Collection collection0) {
        return this.a().c.containsAll(collection0);
    }

    public final int d() {
        o o0 = this.X;
        j.d(o0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((o)m.i(o0)).e;
    }

    public final boolean e(Function1 function10) {
        g g0;
        boolean z;
        Object object1;
        Y.c c0;
        while(true) {
            Object object0 = q.a;
            synchronized(object0) {
                o o0 = this.X;
                j.d(o0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                o o1 = (o)m.i(o0);
                int v = o1.d;
                c0 = o1.c;
            }
            j.c(c0);
            f f0 = c0.g();
            object1 = function10.n(f0);
            Y.c c1 = f0.d();
            if(j.a(c1, c0)) {
                break;
            }
            o o2 = this.X;
            j.d(o2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized(m.b) {
                g0 = m.k();
                o o3 = (o)m.x(o2, this, g0);
                synchronized(object0) {
                    int v2 = o3.d;
                    if(v2 == v) {
                        o3.c = c1;
                        o3.d = v2 + 1;
                        z = true;
                        ++o3.e;
                    }
                    else {
                        z = false;
                    }
                }
            }
            m.o(g0, this);
            if(z) {
                return ((Boolean)object1).booleanValue();
            }
        }
        return ((Boolean)object1).booleanValue();
    }

    @Override  // e0.t
    public final v g(v v0, v v1, v v2) {
        return null;
    }

    @Override
    public final Object get(int v) {
        return this.a().c.get(v);
    }

    @Override
    public final int indexOf(Object object0) {
        return this.a().c.indexOf(object0);
    }

    @Override
    public final boolean isEmpty() {
        return this.a().c.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return this.listIterator();
    }

    @Override  // e0.t
    public final void l(v v0) {
        v0.b = this.X;
        this.X = (o)v0;
    }

    @Override
    public final int lastIndexOf(Object object0) {
        return this.a().c.lastIndexOf(object0);
    }

    @Override
    public final ListIterator listIterator() {
        return new a(this, 0);
    }

    @Override
    public final ListIterator listIterator(int v) {
        return new a(this, v);
    }

    @Override
    public final Object remove(int v) {
        g g0;
        boolean z;
        Y.c c0;
        Object object0 = this.get(v);
        do {
            Object object1 = q.a;
            synchronized(object1) {
                o o0 = this.X;
                j.d(o0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                o o1 = (o)m.i(o0);
                int v1 = o1.d;
                c0 = o1.c;
            }
            j.c(c0);
            Y.c c1 = c0.l(v);
            if(j.a(c1, c0)) {
                break;
            }
            o o2 = this.X;
            j.d(o2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized(m.b) {
                g0 = m.k();
                o o3 = (o)m.x(o2, this, g0);
                synchronized(object1) {
                    int v3 = o3.d;
                    if(v3 == v1) {
                        o3.c = c1;
                        z = true;
                        ++o3.e;
                        o3.d = v3 + 1;
                    }
                    else {
                        z = false;
                    }
                }
            }
            m.o(g0, this);
        }
        while(!z);
        return object0;
    }

    @Override
    public final boolean remove(Object object0) {
        g g0;
        Y.c c0;
        while(true) {
            Object object1 = q.a;
            synchronized(object1) {
                o o0 = this.X;
                j.d(o0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                o o1 = (o)m.i(o0);
                int v = o1.d;
                c0 = o1.c;
            }
            j.c(c0);
            int v1 = c0.indexOf(object0);
            Y.c c1 = v1 == -1 ? c0 : c0.l(v1);
            boolean z = false;
            if(j.a(c1, c0)) {
                break;
            }
            o o2 = this.X;
            j.d(o2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized(m.b) {
                g0 = m.k();
                o o3 = (o)m.x(o2, this, g0);
                synchronized(object1) {
                    int v3 = o3.d;
                    if(v3 == v) {
                        o3.c = c1;
                        ++o3.e;
                        o3.d = v3 + 1;
                        z = true;
                    }
                }
            }
            m.o(g0, this);
            if(z) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean removeAll(Collection collection0) {
        g g0;
        Y.c c0;
        while(true) {
            Object object0 = q.a;
            synchronized(object0) {
                o o0 = this.X;
                j.d(o0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                o o1 = (o)m.i(o0);
                int v = o1.d;
                c0 = o1.c;
            }
            j.c(c0);
            Y.c c1 = c0.i(new b(0, collection0));
            boolean z = false;
            if(j.a(c1, c0)) {
                break;
            }
            o o2 = this.X;
            j.d(o2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized(m.b) {
                g0 = m.k();
                o o3 = (o)m.x(o2, this, g0);
                synchronized(object0) {
                    int v2 = o3.d;
                    if(v2 == v) {
                        o3.c = c1;
                        ++o3.e;
                        o3.d = v2 + 1;
                        z = true;
                    }
                }
            }
            m.o(g0, this);
            if(z) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean retainAll(Collection collection0) {
        return this.e(new b(2, collection0));
    }

    @Override
    public final Object set(int v, Object object0) {
        g g0;
        boolean z;
        Y.c c0;
        Object object1 = this.get(v);
        do {
            Object object2 = q.a;
            synchronized(object2) {
                o o0 = this.X;
                j.d(o0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                o o1 = (o)m.i(o0);
                int v1 = o1.d;
                c0 = o1.c;
            }
            j.c(c0);
            Y.c c1 = c0.o(v, object0);
            if(c1.equals(c0)) {
                break;
            }
            o o2 = this.X;
            j.d(o2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized(m.b) {
                g0 = m.k();
                o o3 = (o)m.x(o2, this, g0);
                synchronized(object2) {
                    int v3 = o3.d;
                    if(v3 == v1) {
                        o3.c = c1;
                        o3.d = v3 + 1;
                        z = true;
                    }
                    else {
                        z = false;
                    }
                }
            }
            m.o(g0, this);
        }
        while(!z);
        return object1;
    }

    @Override
    public final int size() {
        return this.a().c.size();
    }

    @Override
    public final List subList(int v, int v1) {
        if(v >= 0 && v <= v1 && v1 <= this.size()) {
            return new w(this, v, v1);
        }
        d.M("fromIndex or toIndex are out of bounds");
        throw null;
    }

    @Override
    public final Object[] toArray() {
        return Nb.i.a(this);
    }

    @Override
    public final Object[] toArray(Object[] arr_object) {
        return Nb.i.b(this, arr_object);
    }

    @Override
    public final String toString() {
        o o0 = this.X;
        j.d(o0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((o)m.i(o0)).c + ")@" + this.hashCode();
    }
}

