package Z;

import Nb.j;
import Ob.a;
import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class d implements a, Iterator {
    public final n[] X;
    public int Y;
    public boolean Z;

    public d(m m0, n[] arr_n) {
        this.X = arr_n;
        this.Z = true;
        arr_n[0].a(m0.d, Integer.bitCount(m0.a) * 2, 0);
        this.Y = 0;
        this.a();
    }

    public final void a() {
        int v = this.Y;
        n[] arr_n = this.X;
        n n0 = arr_n[v];
        if(n0.Z < n0.Y) {
            return;
        }
        while(-1 < v) {
            int v1 = this.b(v);
            if(v1 == -1) {
                n n1 = arr_n[v];
                int v2 = n1.Z;
                if(v2 < n1.X.length) {
                    n1.Z = v2 + 1;
                    v1 = this.b(v);
                }
            }
            if(v1 != -1) {
                this.Y = v1;
                return;
            }
            if(v > 0) {
                n n2 = arr_n[v - 1];
                ++n2.Z;
            }
            arr_n[v].a(m.e.d, 0, 0);
            --v;
        }
        this.Z = false;
    }

    public final int b(int v) {
        n[] arr_n = this.X;
        n n0 = arr_n[v];
        int v1 = n0.Z;
        if(v1 < n0.Y) {
            return v;
        }
        Object[] arr_object = n0.X;
        if(v1 < arr_object.length) {
            Object object0 = arr_object[v1];
            j.d(object0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
            if(v == 6) {
                arr_n[7].a(((m)object0).d, ((m)object0).d.length, 0);
                return this.b(7);
            }
            arr_n[v + 1].a(((m)object0).d, Integer.bitCount(((m)object0).a) * 2, 0);
            return this.b(v + 1);
        }
        return -1;
    }

    @Override
    public final boolean hasNext() {
        return this.Z;
    }

    @Override
    public Object next() {
        if(!this.Z) {
            throw new NoSuchElementException();
        }
        Object object0 = this.X[this.Y].next();
        this.a();
        return object0;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

