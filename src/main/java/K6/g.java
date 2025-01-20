package K6;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;

public final class g implements ValueAnimator.AnimatorUpdateListener {
    public final int a;
    public final h b;

    public g(h h0, int v) {
        this.a = v;
        this.b = h0;
        super();
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        if(this.a != 0) {
            float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
            this.b.c.setScaleX(f);
            this.b.c.setScaleY(f);
            return;
        }
        float f1 = (float)(((Float)valueAnimator0.getAnimatedValue()));
        this.b.c.setAlpha(f1);
    }
}

