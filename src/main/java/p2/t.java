package p2;

import J6.b;
import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.I;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.j;

public final class t implements Animator.AnimatorListener {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final I e;
    public final int f;
    public final ValueAnimator g;
    public boolean h;
    public float i;
    public float j;
    public boolean k;
    public boolean l;
    public float m;
    public final int n;
    public final I o;
    public final j p;

    public t(j j0, I i0, int v, float f, float f1, float f2, float f3, int v1, I i1) {
        this.p = j0;
        this.n = v1;
        this.o = i1;
        this.k = false;
        this.l = false;
        this.f = v;
        this.e = i0;
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
        ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.g = valueAnimator0;
        valueAnimator0.addUpdateListener(new b(4, this));
        valueAnimator0.setTarget(i0.a);
        valueAnimator0.addListener(this);
        this.m = 0.0f;
    }

    public final void a(Animator animator0) {
        if(!this.l) {
            this.e.p(true);
        }
        this.l = true;
    }

    @Override  // android.animation.Animator$AnimatorListener
    public final void onAnimationCancel(Animator animator0) {
        this.m = 1.0f;
    }

    @Override  // android.animation.Animator$AnimatorListener
    public final void onAnimationEnd(Animator animator0) {
        this.a(animator0);
        if(this.k) {
            return;
        }
        int v = this.n;
        I i0 = this.o;
        j j0 = this.p;
        if(v <= 0) {
            j0.m.d(j0.r, i0);
        }
        else {
            j0.a.add(i0.a);
            this.h = true;
            j0.r.post(new h(j0, this, v));
        }
        View view0 = i0.a;
        if(j0.w == view0) {
            j0.q(view0);
        }
    }

    @Override  // android.animation.Animator$AnimatorListener
    public final void onAnimationRepeat(Animator animator0) {
    }

    @Override  // android.animation.Animator$AnimatorListener
    public final void onAnimationStart(Animator animator0) {
    }
}

