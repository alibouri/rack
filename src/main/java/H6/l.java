package H6;

import G6.a;
import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;

public final class l extends r {
    public final ArrayList b;
    public final Matrix c;

    public l(ArrayList arrayList0, Matrix matrix0) {
        this.b = arrayList0;
        this.c = matrix0;
    }

    @Override  // H6.r
    public final void a(Matrix matrix0, a a0, int v, Canvas canvas0) {
        for(Object object0: this.b) {
            ((r)object0).a(this.c, a0, v, canvas0);
        }
    }
}

