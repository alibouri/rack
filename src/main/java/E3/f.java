package E3;

import android.animation.Animator.AnimatorListener;
import android.animation.Animator.AnimatorPauseListener;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.os.Build.VERSION;
import android.view.Choreographer.FrameCallback;
import android.view.Choreographer;
import java.util.concurrent.CopyOnWriteArraySet;
import r3.a;

public final class f extends ValueAnimator implements Choreographer.FrameCallback {
    public final CopyOnWriteArraySet X;
    public final CopyOnWriteArraySet Y;
    public final CopyOnWriteArraySet Z;
    public float b0;
    public boolean c0;
    public long d0;
    public float e0;
    public float f0;
    public int g0;
    public float h0;
    public float i0;
    public a j0;
    public boolean k0;

    public f() {
        this.X = new CopyOnWriteArraySet();
        this.Y = new CopyOnWriteArraySet();
        this.Z = new CopyOnWriteArraySet();
        this.b0 = 1.0f;
        this.c0 = false;
        this.d0 = 0L;
        this.e0 = 0.0f;
        this.f0 = 0.0f;
        this.g0 = 0;
        this.h0 = -2147483648.0f;
        this.i0 = 2147483648.0f;
        this.k0 = false;
    }

    @Override  // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animator$AnimatorListener0) {
        this.Y.add(animator$AnimatorListener0);
    }

    @Override  // android.animation.Animator
    public final void addPauseListener(Animator.AnimatorPauseListener animator$AnimatorPauseListener0) {
        this.Z.add(animator$AnimatorPauseListener0);
    }

    @Override  // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener valueAnimator$AnimatorUpdateListener0) {
        this.X.add(valueAnimator$AnimatorUpdateListener0);
    }

    public final float b() {
        return this.j0 == null ? 0.0f : (this.f0 - this.j0.l) / (this.j0.m - this.j0.l);
    }

    public final float c() {
        a a0 = this.j0;
        if(a0 == null) {
            return 0.0f;
        }
        return this.i0 == 2147483648.0f ? a0.m : this.i0;
    }

    @Override  // android.animation.ValueAnimator
    public final void cancel() {
        for(Object object0: this.Y) {
            ((Animator.AnimatorListener)object0).onAnimationCancel(this);
        }
        this.f(this.e());
        this.h(true);
    }

    public final float d() {
        a a0 = this.j0;
        if(a0 == null) {
            return 0.0f;
        }
        return this.h0 == -2147483648.0f ? a0.l : this.h0;
    }

    @Override  // android.view.Choreographer$FrameCallback
    public final void doFrame(long v) {
        if(this.k0) {
            this.h(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        a a0 = this.j0;
        if(a0 != null && this.k0) {
            float f = ((float)(this.d0 == 0L ? 0L : v - this.d0)) / (1000000000.0f / a0.n / Math.abs(this.b0));
            float f1 = this.e0;
            if(this.e()) {
                f = -f;
            }
            float f2 = f1 + f;
            boolean z = f2 < this.d() && f2 > this.c();
            float f3 = g.b(f2, this.d(), this.c());
            this.e0 = f3;
            this.f0 = f3;
            this.d0 = v;
            if(z) {
                this.g();
            }
            else if(this.getRepeatCount() != -1 && this.g0 >= this.getRepeatCount()) {
                float f4 = this.b0 < 0.0f ? this.d() : this.c();
                this.e0 = f4;
                this.f0 = f4;
                this.h(true);
                this.g();
                this.f(this.e());
            }
            else {
                if(this.getRepeatMode() == 2) {
                    this.c0 = !this.c0;
                    this.b0 = -this.b0;
                }
                else {
                    float f5 = this.e() ? this.c() : this.d();
                    this.e0 = f5;
                    this.f0 = f5;
                }
                this.d0 = v;
                this.g();
                for(Object object0: this.Y) {
                    ((Animator.AnimatorListener)object0).onAnimationRepeat(this);
                }
                ++this.g0;
            }
            if(this.j0 != null && (this.f0 < this.h0 || this.f0 > this.i0)) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", ((float)this.h0), ((float)this.i0), ((float)this.f0)));
            }
        }
    }

    public final boolean e() {
        return this.b0 < 0.0f;
    }

    public final void f(boolean z) {
        for(Object object0: this.Y) {
            Animator.AnimatorListener animator$AnimatorListener0 = (Animator.AnimatorListener)object0;
            if(Build.VERSION.SDK_INT >= 26) {
                animator$AnimatorListener0.onAnimationEnd(this, z);
            }
            else {
                animator$AnimatorListener0.onAnimationEnd(this);
            }
        }
    }

    public final void g() {
        for(Object object0: this.X) {
            ((ValueAnimator.AnimatorUpdateListener)object0).onAnimationUpdate(this);
        }
    }

    @Override  // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float f1;
        float f;
        if(this.j0 == null) {
            return 0.0f;
        }
        if(this.e()) {
            f = this.c();
            f1 = this.d();
            return (this.c() - this.f0) / (f - f1);
        }
        float f2 = this.d();
        f = this.c();
        f1 = this.d();
        return (this.f0 - f2) / (f - f1);
    }

    @Override  // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return this.b();
    }

    @Override  // android.animation.ValueAnimator
    public final long getDuration() {
        return this.j0 == null ? 0L : ((long)this.j0.b());
    }

    @Override  // android.animation.ValueAnimator
    public final long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public final void h(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if(z) {
            this.k0 = false;
        }
    }

    public final void i(float f) {
        if(this.e0 == f) {
            return;
        }
        float f1 = g.b(f, this.d(), this.c());
        this.e0 = f1;
        this.f0 = f1;
        this.d0 = 0L;
        this.g();
    }

    @Override  // android.animation.ValueAnimator
    public final boolean isRunning() {
        return this.k0;
    }

    public final void j(float f, float f1) {
        if(f > f1) {
            throw new IllegalArgumentException("minFrame (" + f + ") must be <= maxFrame (" + f1 + ")");
        }
        float f2 = this.j0 == null ? -3.402823E+38f : this.j0.l;
        float f3 = this.j0 == null ? 3.402823E+38f : this.j0.m;
        float f4 = g.b(f, f2, f3);
        float f5 = g.b(f1, f2, f3);
        if(f4 == this.h0 || f5 != this.i0) {
            this.h0 = f4;
            this.i0 = f5;
            this.i(((float)(((int)g.b(this.f0, f4, f5)))));
        }
    }

    @Override  // android.animation.Animator
    public final void removeAllListeners() {
        this.Y.clear();
    }

    @Override  // android.animation.ValueAnimator
    public final void removeAllUpdateListeners() {
        this.X.clear();
    }

    @Override  // android.animation.Animator
    public final void removeListener(Animator.AnimatorListener animator$AnimatorListener0) {
        this.Y.remove(animator$AnimatorListener0);
    }

    @Override  // android.animation.Animator
    public final void removePauseListener(Animator.AnimatorPauseListener animator$AnimatorPauseListener0) {
        this.Z.remove(animator$AnimatorPauseListener0);
    }

    @Override  // android.animation.ValueAnimator
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener valueAnimator$AnimatorUpdateListener0) {
        this.X.remove(valueAnimator$AnimatorUpdateListener0);
    }

    @Override  // android.animation.ValueAnimator
    public final Animator setDuration(long v) {
        this.setDuration(v);
        throw null;
    }

    @Override  // android.animation.ValueAnimator
    public final ValueAnimator setDuration(long v) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    @Override  // android.animation.ValueAnimator
    public final void setInterpolator(TimeInterpolator timeInterpolator0) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override  // android.animation.ValueAnimator
    public final void setRepeatMode(int v) {
        super.setRepeatMode(v);
        if(v != 2 && this.c0) {
            this.c0 = false;
            this.b0 = -this.b0;
        }
    }

    @Override  // android.animation.ValueAnimator
    public final void setStartDelay(long v) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }
}

