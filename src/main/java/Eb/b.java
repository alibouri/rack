package Eb;

import Fb.h;
import Nb.j;
import Nb.z;
import W5.f;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class b extends h {
    public int Y;
    public final Function2 Z;
    public final g b0;

    public b(g g0, g g1, Function2 function20) {
        this.Z = function20;
        this.b0 = g1;
        super(g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        switch(this.Y) {
            case 0: {
                this.Y = 1;
                f.b0(object0);
                j.d(this.Z, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                z.d(2, this.Z);
                return this.Z.j(this.b0, this);
            }
            case 1: {
                this.Y = 2;
                f.b0(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("This coroutine had already completed");
            }
        }
    }
}

