package kb;

import Ab.t;
import androidx.compose.ui.focus.FocusOwner;
import kotlin.jvm.functions.Function0;

public final class y implements Function0 {
    public final int X;
    public final FocusOwner Y;
    public final Function0 Z;

    public y(FocusOwner focusOwner0, Function0 function00, int v) {
        this.X = v;
        this.Y = focusOwner0;
        this.Z = function00;
        super();
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.X != 0) {
            this.Y.n(false);
            this.Z.invoke();
            return t.a;
        }
        this.Y.n(false);
        this.Z.invoke();
        return t.a;
    }
}

