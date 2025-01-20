package b4;

import U5.a;
import android.graphics.Canvas;

public class w0 extends a {
    public float c;
    public float d;
    public final A0 e;

    public w0(A0 a00, float f, float f1) {
        this.e = a00;
        this.c = f;
        this.d = f1;
    }

    @Override  // U5.a
    public void I(String s) {
        A0 a00 = this.e;
        if(a00.j0()) {
            y0 y00 = (y0)a00.d;
            if(y00.b) {
                ((Canvas)a00.b).drawText(s, this.c, this.d, y00.d);
            }
            y0 y01 = (y0)a00.d;
            if(y01.c) {
                ((Canvas)a00.b).drawText(s, this.c, this.d, y01.e);
            }
        }
        float f = this.c;
        this.c = ((y0)a00.d).d.measureText(s) + f;
    }
}

