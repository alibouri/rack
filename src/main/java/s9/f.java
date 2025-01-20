package S9;

import Ab.k;
import Ab.t;
import B9.b;
import Nb.j;
import a9.k9;
import ac.i;
import ha.S2;
import kotlin.coroutines.g;
import q9.t1;

public final class f implements i {
    public final int X;
    public final S2 Y;

    public f(S2 s20, int v) {
        this.X = v;
        this.Y = s20;
        super();
    }

    @Override  // ac.i
    public final Object c(Object object0, g g0) {
        if(this.X != 0) {
            this.Y.j0.c = Boolean.valueOf(((k9)object0).w);
            return t.a;
        }
        String s = (String)((k)object0).Y;
        b b0 = this.Y.p0.a(((String)((k)object0).X));
        Object object1 = t.a;
        if(b0 != null) {
            j.f(s, "userId");
            b0.d(t1.d0).d().putString("user_id", s).apply();
        }
        return object1;
    }
}

