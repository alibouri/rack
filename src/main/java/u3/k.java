package u3;

import F3.a;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.ArrayList;

public final class k extends i {
    public final PointF h;
    public final float[] i;
    public final float[] j;
    public final PathMeasure k;
    public j l;

    public k(ArrayList arrayList0) {
        super(arrayList0);
        this.h = new PointF();
        this.i = new float[2];
        this.j = new float[2];
        this.k = new PathMeasure();
    }

    @Override  // u3.e
    public final Object e(a a0, float f) {
        Path path0 = ((j)a0).q;
        if(path0 == null) {
            return (PointF)a0.b;
        }
        PathMeasure pathMeasure0 = this.k;
        if(this.l != ((j)a0)) {
            pathMeasure0.setPath(path0, false);
            this.l = (j)a0;
        }
        float f1 = pathMeasure0.getLength();
        float f2 = f * f1;
        float[] arr_f = this.j;
        pathMeasure0.getPosTan(f2, this.i, arr_f);
        PointF pointF0 = this.h;
        pointF0.set(this.i[0], this.i[1]);
        if(f2 < 0.0f) {
            pointF0.offset(arr_f[0] * f2, arr_f[1] * f2);
            return pointF0;
        }
        if(f2 > f1) {
            pointF0.offset(arr_f[0] * (f2 - f1), arr_f[1] * (f2 - f1));
        }
        return pointF0;
    }
}

