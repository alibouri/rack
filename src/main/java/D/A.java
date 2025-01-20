package d;

import androidx.compose.runtime.MutableState;
import c.D;
import kotlin.jvm.functions.Function0;

public final class a extends D {
    public final MutableState d;

    public a(boolean z, MutableState mutableState0) {
        this.d = mutableState0;
        super(z);
    }

    @Override  // c.D
    public final void b() {
        ((Function0)this.d.getValue()).invoke();
    }
}

