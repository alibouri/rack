package y;

import v.c;
import v.k;
import v.n0;
import v.u;

public final class y implements x {
    public final n0 b;

    public y() {
        this.b = c.j(0x7D, 0, new u(0.25f, 0.1f, 0.25f), 2);
    }

    @Override  // y.x
    public final float a(float f, float f1, float f2) {
        float f3 = Math.abs(f1 + f - f);
        return f - (f3 > f2 || f2 - (0.3f * f2 - 0.0f * f3) >= f3 ? 0.3f * f2 - 0.0f * f3 : f2 - f3);
    }

    @Override  // y.x
    public final k b() {
        return this.b;
    }
}

