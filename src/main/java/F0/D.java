package F0;

import E0.f;
import E0.g;
import kotlin.jvm.functions.Function0;

public final class d implements f {
    public final int X;

    public d(int v) {
        this.X = v;
        super();
    }

    @Override  // E0.f
    public Object X(g g0) {
        return ((Function0)g0.a).invoke();
    }

    public int a() {
        return this.X == 1 ? 16 : 8;
    }
}

