package R2;

import Ab.t;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;

public final class s implements Function1 {
    public final int X;
    public final u Y;

    public s(u u0, int v) {
        this.X = v;
        this.Y = u0;
        super();
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        if(this.X != 0) {
            this.Y.a(((HashMap)object0));
            return t.a;
        }
        this.Y.b(((HashMap)object0));
        return t.a;
    }
}

