package n0;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import o0.c;
import o0.d;

public abstract class m {
    public static final c a(Bitmap bitmap0) {
        ColorSpace colorSpace0 = bitmap0.getColorSpace();
        if(colorSpace0 != null) {
            c c0 = B.b(colorSpace0);
            if(c0 != null) {
                return c0;
            }
        }
        return d.c;
    }

    public static final Bitmap b(int v, int v1, int v2, boolean z, c c0) {
        return h0.c.h(v, v1, M.H(v2), z, B.a(c0));
    }
}

