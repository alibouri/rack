package U;

import Xb.G;
import androidx.compose.runtime.MutableState;
import kotlin.coroutines.CoroutineContext;

public final class i0 implements G, MutableState {
    public final CoroutineContext X;
    public final MutableState Y;

    public i0(MutableState mutableState0, CoroutineContext coroutineContext0) {
        this.X = coroutineContext0;
        this.Y = mutableState0;
    }

    @Override  // Xb.G
    public final CoroutineContext getCoroutineContext() {
        return this.X;
    }

    @Override  // U.N0
    public final Object getValue() {
        return this.Y.getValue();
    }

    @Override  // androidx.compose.runtime.MutableState
    public final void setValue(Object object0) {
        this.Y.setValue(object0);
    }
}

