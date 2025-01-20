package Fb;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.coroutines.j;

public abstract class h extends a {
    public h(g g0) {
        super(g0);
        if(g0 != null && g0.a() != j.X) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override  // kotlin.coroutines.g
    public final CoroutineContext a() {
        return j.X;
    }
}

