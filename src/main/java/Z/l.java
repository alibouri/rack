package Z;

import Bb.b;
import java.util.Iterator;

public final class l extends b {
    public final c X;

    public l(c c0) {
        this.X = c0;
    }

    @Override  // Bb.b
    public final int a() {
        this.X.getClass();
        return this.X.Y;
    }

    @Override  // Bb.b
    public final boolean contains(Object object0) {
        return this.X.containsValue(object0);
    }

    @Override
    public final Iterator iterator() {
        c c0 = this.X;
        n[] arr_n = new n[8];
        for(int v = 0; v < 8; ++v) {
            arr_n[v] = new o(2);
        }
        return new k(c0.X, arr_n);  // initializer: LZ/d;-><init>(LZ/m;[LZ/n;)V
    }
}

