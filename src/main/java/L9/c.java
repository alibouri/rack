package l9;

import Ab.t;
import Eb.a;
import Fb.j;
import I2.B;
import W5.f;
import Xb.G;
import ac.h;
import ac.w;
import java.io.File;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class c extends j implements Function2 {
    public int c0;
    public final h d0;
    public final String e0;
    public final String f0;
    public final String g0;
    public final String h0;
    public final File i0;
    public final B j0;

    public c(h h0, String s, String s1, String s2, String s3, File file0, B b0, g g0) {
        this.d0 = h0;
        this.e0 = s;
        this.f0 = s1;
        this.g0 = s2;
        this.h0 = s3;
        this.i0 = file0;
        this.j0 = b0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((c)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new c(this.d0, this.e0, this.f0, this.g0, this.h0, this.i0, this.j0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                b b0 = new b(this.e0, null);
                w w0 = new w(this.d0, b0, 3);
                Q3.t t0 = new Q3.t(this.e0, this.f0, this.g0, this.h0, this.i0, this.j0, 2);
                this.c0 = 1;
                return w0.d(t0, this) == object1 ? object1 : t.a;
            }
            case 1: {
                f.b0(object0);
                return t.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

