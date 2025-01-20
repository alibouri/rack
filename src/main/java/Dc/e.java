package dc;

import Xb.G;
import kotlin.coroutines.CoroutineContext;

public final class e implements G {
    public final CoroutineContext X;

    public e(CoroutineContext coroutineContext0) {
        this.X = coroutineContext0;
    }

    @Override  // Xb.G
    public final CoroutineContext getCoroutineContext() {
        return this.X;
    }

    @Override
    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.X + ')';
    }
}

