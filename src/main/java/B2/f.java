package B2;

import N4.j;
import android.animation.TypeEvaluator;
import z1.d;

public final class f implements TypeEvaluator {
    public d[] a;

    @Override  // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object object0, Object object1) {
        if(!j.i(((d[])object0), ((d[])object1))) {
            throw new IllegalArgumentException("Can\'t interpolate between two incompatible pathData");
        }
        if(!j.i(this.a, ((d[])object0))) {
            this.a = j.m(((d[])object0));
        }
        for(int v = 0; v < ((d[])object0).length; ++v) {
            d d0 = this.a[v];
            d d1 = ((d[])object0)[v];
            d d2 = ((d[])object1)[v];
            d0.getClass();
            d0.a = d1.a;
            for(int v1 = 0; true; ++v1) {
                float[] arr_f = d1.b;
                if(v1 >= arr_f.length) {
                    break;
                }
                d0.b[v1] = d2.b[v1] * f + (1.0f - f) * arr_f[v1];
            }
        }
        return this.a;
    }
}

