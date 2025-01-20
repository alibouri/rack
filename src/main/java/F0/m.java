package F0;

import D0.L;
import java.util.Map;
import kotlin.jvm.functions.Function1;

public final class M implements L {
    public final int a;
    public final int b;
    public final Map c;
    public final Function1 d;
    public final O e;

    public M(int v, int v1, Map map0, Function1 function10, O o0) {
        this.a = v;
        this.b = v1;
        this.c = map0;
        this.d = function10;
        this.e = o0;
    }

    @Override  // D0.L
    public final int e() {
        return this.b;
    }

    @Override  // D0.L
    public final int l() {
        return this.a;
    }

    @Override  // D0.L
    public final Map m() {
        return this.c;
    }

    @Override  // D0.L
    public final void n() {
        this.d.n(this.e.g0);
    }

    @Override  // D0.L
    public final Function1 o() {
        return null;
    }
}

