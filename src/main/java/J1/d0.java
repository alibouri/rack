package J1;

import android.view.animation.Interpolator;

public abstract class d0 {
    public float a;
    public final Interpolator b;
    public final long c;

    public d0(Interpolator interpolator0, long v) {
        this.b = interpolator0;
        this.c = v;
    }

    public long a() {
        return this.c;
    }

    public float b() {
        return this.b == null ? this.a : this.b.getInterpolation(this.a);
    }

    public void c(float f) {
        this.a = f;
    }
}

