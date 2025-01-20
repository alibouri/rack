package k2;

import Bb.D;
import Fb.c;
import ac.b0;
import kotlin.coroutines.g;

public final class i extends c {
    public b0 b0;
    public D c0;
    public Object d0;
    public final b0 e0;
    public int f0;

    public i(b0 b00, g g0) {
        this.e0 = b00;
        super(g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.d0 = object0;
        this.f0 |= 0x80000000;
        return this.e0.a(null, this);
    }
}

