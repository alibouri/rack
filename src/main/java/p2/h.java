package p2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

public final class h extends AnimatorListenerAdapter {
    public final int a;
    public final i b;
    public final ViewPropertyAnimator c;
    public final View d;
    public final k e;

    public h(k k0, i i0, ViewPropertyAnimator viewPropertyAnimator0, View view0, int v) {
        this.a = v;
        this.e = k0;
        this.b = i0;
        this.c = viewPropertyAnimator0;
        this.d = view0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        if(this.a != 0) {
            this.c.setListener(null);
            this.d.setAlpha(1.0f);
            this.d.setTranslationX(0.0f);
            this.d.setTranslationY(0.0f);
            this.e.h(this.b.b);
            this.e.r.remove(this.b.b);
            this.e.o();
            return;
        }
        this.c.setListener(null);
        this.d.setAlpha(1.0f);
        this.d.setTranslationX(0.0f);
        this.d.setTranslationY(0.0f);
        this.e.h(this.b.a);
        this.e.r.remove(this.b.a);
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

