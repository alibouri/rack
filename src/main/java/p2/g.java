package p2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.I;

public final class g extends AnimatorListenerAdapter {
    public final I a;
    public final int b;
    public final View c;
    public final int d;
    public final ViewPropertyAnimator e;
    public final k f;

    public g(k k0, I i0, int v, View view0, int v1, ViewPropertyAnimator viewPropertyAnimator0) {
        this.f = k0;
        this.a = i0;
        this.b = v;
        this.c = view0;
        this.d = v1;
        this.e = viewPropertyAnimator0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationCancel(Animator animator0) {
        View view0 = this.c;
        if(this.b != 0) {
            view0.setTranslationX(0.0f);
        }
        if(this.d != 0) {
            view0.setTranslationY(0.0f);
        }
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        this.e.setListener(null);
        this.f.h(this.a);
        this.f.p.remove(this.a);
        this.f.o();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationStart(Animator animator0) {
        this.f.getClass();
    }
}

