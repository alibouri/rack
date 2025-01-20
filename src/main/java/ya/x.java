package Ya;

import Ab.t;
import bb.e;
import kotlin.jvm.functions.Function0;

public final class x implements Function0 {
    public final int X;
    public final float Y;
    public final Object Z;

    public x(float f, int v, Object object0) {
        this.X = v;
        this.Z = object0;
        this.Y = f;
        super();
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.X != 0) {
            ((e)this.Z).a.m(this.Y);
            return t.a;
        }
        return ((z)this.Z).a.w(this.Y);
    }
}

