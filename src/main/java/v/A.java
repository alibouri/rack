package v;

import Ab.t;
import E.J;
import Fb.j;
import Nb.s;
import W5.f;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;

public final class a extends j implements Function1 {
    public l c0;
    public s d0;
    public int e0;
    public final b f0;
    public final Object g0;
    public final c0 h0;
    public final long i0;
    public final Function1 j0;

    public a(b b0, Object object0, c0 c00, long v, Function1 function10, g g0) {
        this.f0 = b0;
        this.g0 = object0;
        this.h0 = c00;
        this.i0 = v;
        this.j0 = function10;
        super(1, g0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        return new a(this.f0, this.g0, this.h0, this.i0, this.j0, ((g)object0)).v(t.a);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = Eb.a.X;
        int v = 1;
        b b0 = this.f0;
        switch(this.e0) {
            case 0: {
                f.b0(object0);
                try {
                    b0.c.Z = (q)b0.a.a.n(this.g0);
                    b0.e.setValue(this.h0.c);
                    b0.d.setValue(Boolean.TRUE);
                    Object object2 = b0.c.Y.getValue();
                    q q0 = c.f(b0.c.Z);
                    l l0 = new l(b0.c.X, object2, q0, b0.c.b0, 0x8000000000000000L, b0.c.d0);
                    s s0 = new s();  // initializer: Ljava/lang/Object;-><init>()V
                    J j0 = new J(b0, l0, this.j0, s0, 2);
                    this.c0 = l0;
                    this.d0 = s0;
                    this.e0 = 1;
                    if(b0.b(l0, this.h0, this.i0, j0, this) == object1) {
                        return object1;
                    }
                    s s1 = s0;
                    l l1 = l0;
                    goto label_25;
                label_22:
                    s1 = this.d0;
                    l1 = this.c0;
                    f.b0(object0);
                label_25:
                    if(!s1.X) {
                        v = 2;
                    }
                    b.b(b0);
                    return new i(l1, v);
                }
                catch(CancellationException cancellationException0) {
                    break;
                }
            }
            case 1: {
                goto label_22;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        b.b(b0);
        throw cancellationException0;
    }
}

