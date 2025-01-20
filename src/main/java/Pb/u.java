package pb;

import Ab.t;
import U.d;
import U.p;
import U5.a;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

public final class u implements Function2 {
    public final int X;
    public final w Y;
    public final Modifier Z;
    public final int b0;

    public u(w w0, Modifier modifier0, int v, int v1) {
        this.X = v1;
        this.Y = w0;
        this.Z = modifier0;
        this.b0 = v;
        super();
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((Integer)object1).getClass();
        if(this.X != 0) {
            a.f(this.Y, this.Z, ((p)object0), d.O(this.b0 | 1));
            return t.a;
        }
        a.b(this.Y, this.Z, ((p)object0), d.O(this.b0 | 1));
        return t.a;
    }
}

