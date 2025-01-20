package U;

import Fb.c;
import kotlin.jvm.functions.Function1;

public final class d0 extends c {
    public e0 b0;
    public Function1 c0;
    public Object d0;
    public final e0 e0;
    public int f0;

    public d0(e0 e00, c c0) {
        this.e0 = e00;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.d0 = object0;
        this.f0 |= 0x80000000;
        return this.e0.v(null, this);
    }
}

