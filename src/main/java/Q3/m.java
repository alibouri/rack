package Q3;

import O3.a;
import java.util.Collection;
import kotlin.jvm.functions.Function0;

public final class m implements Function0 {
    public final int X;
    public final q Y;
    public final Collection Z;
    public final a b0;

    public m(q q0, Collection collection0, a a0, int v) {
        this.X = v;
        this.Y = q0;
        this.Z = collection0;
        this.b0 = a0;
        super();
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.Y.a().d(this.Z, this.b0);
    }
}

