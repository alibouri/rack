package p2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.I;

public final class f extends AnimatorListenerAdapter {
    public final int a;
    public final I b;
    public final View c;
    public final ViewPropertyAnimator d;
    public final k e;

    public f(k k0, I i0, View view0, ViewPropertyAnimator viewPropertyAnimator0) {
        this.a = 1;
        this.e = k0;
        this.b = i0;
        this.c = view0;
        this.d = viewPropertyAnimator0;
        super();
    }

    public f(k k0, I i0, ViewPropertyAnimator viewPropertyAnimator0, View view0) {
        this.a = 0;
        this.e = k0;
        this.b = i0;
        this.d = viewPropertyAnimator0;
        this.c = view0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public void onAnimationCancel(Animator animator0) {
        if(this.a != 1) {
            super.onAnimationCancel(animator0);
            return;
        }
        this.c.setAlpha(1.0f);
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        if(this.a != 0) {
            this.d.setListener(null);
            this.e.h(this.b);
            this.e.o.remove(this.b);
            this.e.o();
            return;
        }
        this.d.setListener(null);
        this.c.setAlpha(1.0f);
        this.e.h(this.b);
        this.e.q.remove(this.b);
        this.e.o();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationStart(Animator animator0) {
        if(this.a != 0) {
            this.e.getClass();
            return;
        }
        this.e.getClass();
    }
}

