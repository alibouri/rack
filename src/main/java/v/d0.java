package v;

import Nb.k;
import U.N0;
import kotlin.jvm.functions.Function1;

public final class d0 implements N0 {
    public final h0 X;
    public k Y;
    public k Z;
    public final e0 b0;

    public d0(e0 e00, h0 h00, Function1 function10, Function1 function11) {
        this.b0 = e00;
        this.X = h00;
        this.Y = (k)function10;
        this.Z = (k)function11;
    }

    public final void a(f0 f00) {
        Object object0 = ((Function1)this.Z).n(f00.c());
        boolean z = this.b0.c.g();
        h0 h00 = this.X;
        if(z) {
            h00.e(((Function1)this.Z).n(f00.b()), object0, ((A)((Function1)this.Y).n(f00)));
            return;
        }
        h00.g(object0, ((A)((Function1)this.Y).n(f00)));
    }

    @Override  // U.N0
    public final Object getValue() {
        this.a(this.b0.c.f());
        return this.X.f0.getValue();
    }
}

