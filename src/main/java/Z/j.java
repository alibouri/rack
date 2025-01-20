package Z;

import Bb.k;
import java.util.Iterator;
import java.util.Map.Entry;

public final class j extends k {
    public final int X;
    public final c Y;

    public j(c c0, int v) {
        this.X = v;
        this.Y = c0;
        super();
    }

    @Override  // Bb.b
    public final int a() {
        if(this.X != 0) {
            this.Y.getClass();
            return this.Y.Y;
        }
        this.Y.getClass();
        return this.Y.Y;
    }

    @Override  // Bb.b
    public final boolean contains(Object object0) {
        if(this.X != 0) {
            return this.Y.containsKey(object0);
        }
        if(object0 instanceof Map.Entry && ((Map.Entry)object0) instanceof Map.Entry) {
            Object object1 = ((Map.Entry)object0).getKey();
            Object object2 = this.Y.get(object1);
            return object2 == null ? ((Map.Entry)object0).getValue() == null && this.Y.containsKey(((Map.Entry)object0).getKey()) : object2.equals(((Map.Entry)object0).getValue());
        }
        return false;
    }

    @Override
    public final Iterator iterator() {
        if(this.X != 0) {
            c c0 = this.Y;
            n[] arr_n = new n[8];
            for(int v = 0; v < 8; ++v) {
                arr_n[v] = new o(1);
            }
            return new Z.k(c0.X, arr_n);  // initializer: LZ/d;-><init>(LZ/m;[LZ/n;)V
        }
        c c1 = this.Y;
        n[] arr_n1 = new n[8];
        for(int v1 = 0; v1 < 8; ++v1) {
            arr_n1[v1] = new o(0);
        }
        return new Z.k(c1.X, arr_n1);  // initializer: LZ/d;-><init>(LZ/m;[LZ/n;)V
    }
}

