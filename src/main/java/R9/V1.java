package R9;

import Ab.t;
import Nb.j;
import Y8.N;
import Y8.o2;
import a9.c6;
import com.sendwave.backend.FragmentHandle;
import kotlin.jvm.functions.Function0;

public final class v1 implements Function0 {
    public final int X;
    public final x1 Y;
    public final o2 Z;
    public final c6 b0;

    public v1(x1 x10, o2 o20, c6 c60, int v) {
        this.X = v;
        this.Y = x10;
        this.Z = o20;
        this.b0 = c60;
        super();
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.X != 0) {
            j.c(this.b0.c);
            FragmentHandle fragmentHandle0 = this.Z.a(this.b0.c.e.b);
            ((X1)this.Y.d).getClass();
            G1 g10 = new G1(((X1)this.Y.d), fragmentHandle0, null);
            N.k(((X1)this.Y.d), ((X1)this.Y.d).d0, true, g10);
            return t.a;
        }
        j.c(this.b0.b);
        FragmentHandle fragmentHandle1 = this.Z.a(this.b0.b.b);
        ((X1)this.Y.d).getClass();
        E1 e10 = new E1(((X1)this.Y.d), fragmentHandle1, null);
        N.k(((X1)this.Y.d), ((X1)this.Y.d).d0, true, e10);
        return t.a;
    }
}

