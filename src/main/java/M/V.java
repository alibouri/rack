package M;

import Ab.t;
import Nb.k;
import U.d;
import U.p;
import a5.w;
import androidx.compose.ui.Modifier;
import c0.b;
import kotlin.jvm.functions.Function2;

public final class v extends k implements Function2 {
    public final int X;
    public final Modifier Y;
    public final b Z;
    public final int b0;

    public v(Modifier modifier0, b b0, int v, int v1) {
        this.X = v1;
        this.Y = modifier0;
        this.Z = b0;
        this.b0 = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((Number)object1).intValue();
        switch(this.X) {
            case 0: {
                c0.c(this.Y, this.Z, ((p)object0), d.O(this.b0 | 1));
                return t.a;
            }
            case 1: {
                c0.f(this.Y, this.Z, ((p)object0), d.O(this.b0 | 1));
                return t.a;
            }
            default: {
                w.h(this.Y, this.Z, ((p)object0), d.O(this.b0 | 1));
                return t.a;
            }
        }
    }
}

