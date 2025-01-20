package H6;

import android.graphics.Matrix;
import android.graphics.Path;

public final class p extends q {
    public float b;
    public float c;

    @Override  // H6.q
    public final void a(Matrix matrix0, Path path0) {
        matrix0.invert(this.a);
        path0.transform(this.a);
        path0.lineTo(this.b, this.c);
        path0.transform(matrix0);
    }
}

