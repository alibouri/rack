package M;

import Ab.t;
import Nb.k;
import U.d;
import U.p;
import Z0.h;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final class f extends k implements Function2 {
    public final int X;
    public final boolean Y;
    public final int Z;
    public final Object b0;
    public final Object c0;

    public f(Modifier modifier0, Function0 function00, boolean z, int v) {
        this.X = 0;
        this.b0 = modifier0;
        this.c0 = function00;
        this.Y = z;
        this.Z = v;
        super(2);
    }

    public f(boolean z, h h0, o0 o00, int v) {
        this.X = 1;
        this.Y = z;
        this.b0 = h0;
        this.c0 = o00;
        this.Z = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((Number)object1).intValue();
        if(this.X != 0) {
            c0.g(this.Y, ((h)this.b0), ((o0)this.c0), ((p)object0), d.O(this.Z | 1));
            return t.a;
        }
        c0.e(d.O(this.Z | 1), ((p)object0), ((Modifier)this.b0), ((Function0)this.c0), this.Y);
        return t.a;
    }
}

