package Z;

import Cb.i;
import Nb.j;
import b0.a;
import b0.b;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public abstract class e extends AbstractMap implements Ob.e, Map {
    public b X;
    public m Y;
    public Object Z;
    public int b0;
    public int c0;

    public final void a(int v) {
        this.c0 = v;
        ++this.b0;
    }

    @Override
    public final void clear() {
        this.Y = m.e;
        this.a(0);
    }

    @Override
    public boolean containsKey(Object object0) {
        m m0 = this.Y;
        return object0 == null ? m0.d(0, 0, null) : m0.d(object0.hashCode(), 0, object0);
    }

    @Override
    public final Set entrySet() {
        return new g(0, this);
    }

    @Override
    public Object get(Object object0) {
        m m0 = this.Y;
        return object0 == null ? m0.g(0, 0, null) : m0.g(object0.hashCode(), 0, object0);
    }

    @Override
    public final Set keySet() {
        return new g(1, this);
    }

    @Override
    public final Object put(Object object0, Object object1) {
        this.Z = null;
        this.Y = this.Y.l((object0 == null ? 0 : object0.hashCode()), object0, object1, 0, this);
        return this.Z;
    }

    @Override
    public final void putAll(Map map0) {
        c c0 = null;
        c c1 = map0 instanceof c ? ((c)map0) : null;
        if(c1 == null) {
            e e0 = map0 instanceof e ? ((e)map0) : null;
            if(e0 != null) {
                c0 = ((c0.e)e0).b();
            }
        }
        else {
            c0 = c1;
        }
        if(c0 == null) {
            super.putAll(map0);
        }
        else {
            a a0 = new a();  // initializer: Ljava/lang/Object;-><init>()V
            a0.a = 0;
            int v = this.c0;
            m m0 = this.Y;
            j.d(c0.X, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
            this.Y = m0.m(c0.X, 0, a0, this);
            int v1 = c0.Y + v - a0.a;
            if(v != v1) {
                this.a(v1);
            }
        }
    }

    @Override
    public Object remove(Object object0) {
        this.Z = null;
        m m0 = this.Y.n((object0 == null ? 0 : object0.hashCode()), object0, 0, this);
        if(m0 == null) {
            m0 = m.e;
        }
        this.Y = m0;
        return this.Z;
    }

    @Override
    public final boolean remove(Object object0, Object object1) {
        int v = this.c0;
        m m0 = this.Y.o((object0 == null ? 0 : object0.hashCode()), object0, object1, 0, this);
        if(m0 == null) {
            m0 = m.e;
        }
        this.Y = m0;
        return v != this.c0;
    }

    @Override
    public final int size() {
        return this.c0;
    }

    @Override
    public final Collection values() {
        return new i(this);
    }
}

