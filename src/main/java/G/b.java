package G;

import Ab.t;
import Nb.h;
import Nb.k;
import P.n;
import d.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

public final class b extends k implements Function0 {
    public final int X;
    public final boolean Y;
    public final Object Z;

    public b(int v, Object object0, boolean z) {
        this.X = v;
        this.Z = object0;
        this.Y = z;
        super(0);
    }

    public b(n n0, boolean z) {
        this.X = 1;
        this.Y = z;
        this.Z = n0;
        super(0);
    }

    public b(Function0 function00, boolean z) {
        this.X = 3;
        this.Y = z;
        this.Z = (k)function00;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.X) {
            case 0: {
                ((Function1)this.Z).n(Boolean.valueOf(!this.Y));
                return t.a;
            }
            case 1: {
                return this.Y || ((n)this.Z).e.k() > 0.5f ? Boolean.valueOf(true) : Boolean.valueOf(false);
            }
            case 2: {
                ((a)this.Z).a = this.Y;
                h h0 = ((a)this.Z).c;
                if(h0 != null) {
                    ((Function0)h0).invoke();
                }
                return t.a;
            }
            default: {
                if(this.Y) {
                    ((Function0)(((k)this.Z))).invoke();
                }
                return t.a;
            }
        }
    }
}

