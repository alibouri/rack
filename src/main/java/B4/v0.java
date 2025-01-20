package b4;

import android.graphics.Canvas;
import android.graphics.Path;

public final class v0 extends w0 {
    public final Path f;
    public final A0 g;

    public v0(A0 a00, Path path0, float f) {
        this.g = a00;
        super(a00, f, 0.0f);
        this.f = path0;
    }

    @Override  // b4.w0
    public final void I(String s) {
        A0 a00 = this.g;
        if(a00.j0()) {
            y0 y00 = (y0)a00.d;
            if(y00.b) {
                ((Canvas)a00.b).drawTextOnPath(s, this.f, this.c, this.d, y00.d);
            }
            y0 y01 = (y0)a00.d;
            if(y01.c) {
                ((Canvas)a00.b).drawTextOnPath(s, this.f, this.c, this.d, y01.e);
            }
        }
        float f = this.c;
        this.c = ((y0)a00.d).d.measureText(s) + f;
    }
}

