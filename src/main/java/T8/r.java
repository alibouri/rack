package T8;

import A3.e;
import android.graphics.Rect;

public final class r {
    public final p a;
    public final int b;
    public final int c;
    public Rect d;
    public boolean e;

    public r(byte[] arr_b, int v, int v1, int v2, int v3) {
        this.a = new p(arr_b, v, v1);
        this.c = v3;
        this.b = v2;
        if(v * v1 <= arr_b.length) {
            return;
        }
        StringBuilder stringBuilder0 = e.v(v, v1, "Image data does not match the resolution. ", "x", " > ");
        stringBuilder0.append(arr_b.length);
        throw new IllegalArgumentException(stringBuilder0.toString());
    }
}

