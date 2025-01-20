package b3;

import Ab.t;
import Ec.b;
import Fb.j;
import Xb.G;
import java.io.IOException;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class e extends j implements Function2 {
    public final f c0;

    public e(f f0, g g0) {
        this.c0 = f0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((e)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new e(this.c0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        W5.f.b0(object0);
        f f0 = this.c0;
        synchronized(f0) {
            if(f0.j0 && !f0.k0) {
                try {
                    f0.G();
                }
                catch(IOException unused_ex) {
                    f0.l0 = true;
                }
                if(f0.g0 >= 2000) {
                    try {
                        f0.N();
                    }
                    catch(IOException unused_ex) {
                        f0.m0 = true;
                        f0.h0 = b.b(new Ec.g());  // initializer: Ljava/lang/Object;-><init>()V
                    }
                }
                return t.a;
            }
            return t.a;
        }
    }
}

