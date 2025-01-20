package L;

import F0.c0;
import O0.L;
import androidx.compose.ui.layout.LayoutCoordinates;

public final class j {
    public final LayoutCoordinates a;
    public final L b;
    public static final j c;

    static {
        j.c = new j(null, null);
    }

    public j(L l0, LayoutCoordinates layoutCoordinates0) {
        this.a = layoutCoordinates0;
        this.b = l0;
    }

    public static j a(j j0, c0 c00, L l0, int v) {
        if((v & 1) != 0) {
            c00 = j0.a;
        }
        if((v & 2) != 0) {
            l0 = j0.b;
        }
        j0.getClass();
        return new j(l0, c00);
    }
}

