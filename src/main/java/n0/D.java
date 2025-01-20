package n0;

import Nb.j;
import android.graphics.Canvas;

public abstract class d {
    public static final Canvas a;

    static {
        d.a = new Canvas();
    }

    public static final Canvas a(t t0) {
        j.d(t0, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidCanvas");
        return ((c)t0).a;
    }
}

