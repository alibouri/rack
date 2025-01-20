package Q1;

import android.view.animation.Interpolator;

public final class c implements Interpolator {
    public final int a;

    public c(int v) {
        this.a = v;
        super();
    }

    @Override  // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        switch(this.a) {
            case 0: {
                return (f - 1.0f) * (f - 1.0f) * (f - 1.0f) * (f - 1.0f) * (f - 1.0f) + 1.0f;
            }
            case 1: {
                return f * f * f * f * f;
            }
            case 2: {
                return (f - 1.0f) * (f - 1.0f) * (f - 1.0f) * (f - 1.0f) * (f - 1.0f) + 1.0f;
            }
            default: {
                return (f - 1.0f) * (f - 1.0f) * (f - 1.0f) * (f - 1.0f) * (f - 1.0f) + 1.0f;
            }
        }
    }
}

