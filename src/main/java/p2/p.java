package p2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.recyclerview.widget.e;

public final class p extends AnimatorListenerAdapter {
    public boolean a;
    public final e b;

    public p(e e0) {
        this.b = e0;
        super();
        this.a = false;
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationCancel(Animator animator0) {
        this.a = true;
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        if(this.a) {
            this.a = false;
            return;
        }
        e e0 = this.b;
        if(((float)(((Float)e0.z.getAnimatedValue()))) == 0.0f) {
            e0.A = 0;
            e0.l(0);
            return;
        }
        e0.A = 2;
        e0.s.invalidate();
    }
}

