package P;

import Nb.k;
import kotlin.jvm.functions.Function0;

public final class d extends k implements Function0 {
    public final int X;
    public final n Y;

    public d(n n0, int v) {
        this.X = v;
        this.Y = n0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float f = 1.0f;
        if(this.X != 0) {
            return (float)(this.Y.f.k() * 0.5f);
        }
        if(this.Y.a() / this.Y.g.k() < 1.0f) {
            f = 0.3f;
        }
        return f;
    }
}

