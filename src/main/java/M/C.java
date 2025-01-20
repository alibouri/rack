package M;

import Ab.t;
import G0.f0;
import Nb.k;
import U.d;
import U.p;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ViewConfiguration;
import kotlin.jvm.functions.Function2;

public final class c extends k implements Function2 {
    public final ViewConfiguration X;
    public final long Y;
    public final boolean Z;
    public final Modifier b0;
    public final n c0;

    public c(ViewConfiguration viewConfiguration0, long v, boolean z, Modifier modifier0, n n0) {
        this.X = viewConfiguration0;
        this.Y = v;
        this.Z = z;
        this.b0 = modifier0;
        this.c0 = n0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
            ((p)object0).K();
            return t.a;
        }
        d.a(f0.q.a(this.X), c0.c.c(0xAAFA5591, new b(this.Y, this.Z, this.b0, this.c0), ((p)object0)), ((p)object0), 56);
        return t.a;
    }
}

