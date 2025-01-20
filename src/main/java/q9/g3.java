package q9;

import android.animation.TimeInterpolator;

public final class g3 implements TimeInterpolator {
    @Override  // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return (float)(Math.exp(-f * 2.0f) * Math.sin(3.0 * ((double)f) * 6.283185));
    }
}

