package N;

import Nb.k;
import kotlin.jvm.functions.Function0;

public final class s0 extends k implements Function0 {
    public final float X;
    public final C0 Y;

    public s0(float f, C0 c00) {
        this.X = f;
        this.Y = c00;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float f = 0.0f;
        float f1 = (this.Y.a.l() - this.X) / (0.0f - this.X);
        if(f1 >= 0.0f) {
            f = f1;
        }
        if(f > 1.0f) {
            f = 1.0f;
        }
        return f;
    }
}

