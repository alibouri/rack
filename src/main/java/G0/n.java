package G0;

import Eb.a;
import Fb.c;
import androidx.compose.ui.platform.AndroidComposeView;

public final class n extends c {
    public Object b0;
    public final AndroidComposeView c0;
    public int d0;

    public n(AndroidComposeView androidComposeView0, c c0) {
        this.c0 = androidComposeView0;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.b0 = object0;
        this.d0 |= 0x80000000;
        this.c0.J(null, this);
        return a.X;
    }
}

