package Eb;

import Nb.j;
import Nb.z;
import W5.f;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class c extends Fb.c {
    public int b0;
    public final Function2 c0;
    public final g d0;

    public c(g g0, CoroutineContext coroutineContext0, Function2 function20, g g1) {
        this.c0 = function20;
        this.d0 = g1;
        super(g0, coroutineContext0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        switch(this.b0) {
            case 0: {
                this.b0 = 1;
                f.b0(object0);
                j.d(this.c0, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                z.d(2, this.c0);
                return this.c0.j(this.d0, this);
            }
            case 1: {
                this.b0 = 2;
                f.b0(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("This coroutine had already completed");
            }
        }
    }
}

