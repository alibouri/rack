package q0;

import android.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import n0.j;

public final class k {
    public static final k a;

    static {
        k.a = new k();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public final void a(Outline outline0, Path path0) {
        if(!(path0 instanceof j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline0.setPath(((j)path0).a);
    }
}

