package a0;

import Bb.k;
import Ub.f;
import Z.c;
import java.util.Iterator;

public final class b extends k implements X.b {
    public final Object X;
    public final Object Y;
    public final c Z;
    public static final b b0;

    static {
        b.b0 = new b(b0.b.a, b0.b.a, c.Z);
    }

    public b(Object object0, Object object1, c c0) {
        this.X = object0;
        this.Y = object1;
        this.Z = c0;
    }

    @Override  // Bb.b
    public final int a() {
        this.Z.getClass();
        return this.Z.Y;
    }

    @Override  // Bb.b
    public final boolean contains(Object object0) {
        return this.Z.containsKey(object0);
    }

    @Override
    public final Iterator iterator() {
        return new f(this.X, this.Z);
    }
}

