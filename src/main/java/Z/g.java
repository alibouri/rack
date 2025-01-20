package Z;

import Bb.j;
import java.util.Iterator;
import java.util.Map.Entry;

public final class g extends j {
    public final int X;
    public final e Y;

    public g(int v, e e0) {
        this.X = v;
        super();
        this.Y = e0;
    }

    @Override  // Bb.j
    public final int a() {
        if(this.X != 0) {
            this.Y.getClass();
            return this.Y.c0;
        }
        this.Y.getClass();
        return this.Y.c0;
    }

    @Override
    public final boolean add(Object object0) {
        if(this.X != 0) {
            throw new UnsupportedOperationException();
        }
        Map.Entry map$Entry0 = (Map.Entry)object0;
        throw new UnsupportedOperationException();
    }

    @Override
    public final void clear() {
        if(this.X != 0) {
            this.Y.clear();
            return;
        }
        this.Y.clear();
    }

    @Override
    public final boolean contains(Object object0) {
        if(this.X != 0) {
            return this.Y.containsKey(object0);
        }
        if(object0 instanceof Map.Entry && (((Map.Entry)object0) instanceof Object ? ((Map.Entry)object0) : null) instanceof Map.Entry) {
            Object object1 = ((Map.Entry)object0).getKey();
            Object object2 = this.Y.get(object1);
            return object2 == null ? ((Map.Entry)object0).getValue() == null && this.Y.containsKey(((Map.Entry)object0).getKey()) : object2.equals(((Map.Entry)object0).getValue());
        }
        return false;
    }

    @Override
    public final Iterator iterator() {
        if(this.X != 0) {
            n[] arr_n = new n[8];
            for(int v = 0; v < 8; ++v) {
                arr_n[v] = new o(1);
            }
            return new i(this.Y, arr_n);  // initializer: LZ/f;-><init>(LZ/e;[LZ/n;)V
        }
        return new h(this.Y);
    }

    @Override
    public final boolean remove(Object object0) {
        if(this.X != 0) {
            e e0 = this.Y;
            if(e0.containsKey(object0)) {
                e0.remove(object0);
                return true;
            }
            return false;
        }
        if(object0 instanceof Map.Entry && (((Map.Entry)object0) instanceof Object ? ((Map.Entry)object0) : null) instanceof Map.Entry) {
            Object object1 = ((Map.Entry)object0).getKey();
            Object object2 = ((Map.Entry)object0).getValue();
            return this.Y.remove(object1, object2);
        }
        return false;
    }
}

