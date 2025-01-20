package ra;

import Ab.t;
import R2.f;
import U.d;
import U.p;
import androidx.compose.ui.Modifier;
import c0.b;
import kotlin.jvm.functions.Function2;
import v9.h;

public final class i implements Function2 {
    public final int X;
    public final Modifier Y;
    public final b Z;
    public final int b0;

    public i(Modifier modifier0, b b0, int v, int v1) {
        this.X = v1;
        this.Y = modifier0;
        this.Z = b0;
        this.b0 = v;
        super();
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((Integer)object1).getClass();
        if(this.X != 0) {
            h.b(this.Y, this.Z, ((p)object0), d.O(this.b0 | 1));
            return t.a;
        }
        f.h(this.Y, this.Z, ((p)object0), d.O(this.b0 | 1));
        return t.a;
    }
}

