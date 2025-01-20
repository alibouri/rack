package e2;

import android.view.animation.Interpolator;

public abstract class b implements Interpolator {
    public final float[] a;
    public final float b;

    public b(float[] arr_f) {
        this.a = arr_f;
        this.b = 1.0f / ((float)(arr_f.length - 1));
    }

    @Override  // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if(f >= 1.0f) {
            return 1.0f;
        }
        if(f <= 0.0f) {
            return 0.0f;
        }
        int v = Math.min(((int)(((float)(this.a.length - 1)) * f)), this.a.length - 2);
        float f1 = this.a[v];
        return m5.b.o(this.a[v + 1], f1, (f - ((float)v) * this.b) / this.b, f1);
    }
}

