package M;

import Ab.t;
import Nb.k;
import U.p;
import Z0.h;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import kotlin.jvm.functions.Function2;

public final class d extends k implements Function2 {
    public final n X;
    public final boolean Y;
    public final h Z;
    public final boolean b0;
    public final long c0;
    public final SuspendPointerInputElement d0;
    public final int e0;

    public d(n n0, boolean z, h h0, boolean z1, long v, SuspendPointerInputElement suspendPointerInputElement0, int v1) {
        this.X = n0;
        this.Y = z;
        this.Z = h0;
        this.b0 = z1;
        this.c0 = v;
        this.d0 = suspendPointerInputElement0;
        this.e0 = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((Number)object1).intValue();
        c0.d(this.X, this.Y, this.Z, this.b0, this.c0, this.d0, ((p)object0), U.d.O(this.e0 | 1));
        return t.a;
    }
}

