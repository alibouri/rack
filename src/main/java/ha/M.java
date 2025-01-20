package Ha;

import Ab.t;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function0;

public final class m implements Function0 {
    public final int X;
    public final MutableState Y;

    public m(MutableState mutableState0, int v) {
        this.X = v;
        this.Y = mutableState0;
        super();
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.X != 0) {
            this.Y.setValue(Boolean.FALSE);
            return t.a;
        }
        this.Y.setValue(Boolean.TRUE);
        return t.a;
    }
}

