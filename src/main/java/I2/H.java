package I2;

import Nb.j;
import Xb.A;
import Xb.V;
import fc.e;
import kotlin.coroutines.CoroutineContext;

public final class h extends A {
    public static final h Z;
    public static final e b0;

    static {
        h.Z = new h();  // initializer: LXb/A;-><init>()V
        h.b0 = V.a;
    }

    @Override  // Xb.A
    public final void Y(CoroutineContext coroutineContext0, Runnable runnable0) {
        j.f(coroutineContext0, "context");
        j.f(runnable0, "block");
        h.b0.Y(coroutineContext0, runnable0);
    }

    @Override  // Xb.A
    public final boolean a0(CoroutineContext coroutineContext0) {
        j.f(coroutineContext0, "context");
        h.b0.getClass();
        return 1;
    }
}

