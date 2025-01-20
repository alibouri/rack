package K6;

import Bb.q;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.google.android.material.textfield.EndIconDelegate;
import com.google.android.material.textfield.TextInputLayout;

public final class h extends EndIconDelegate {
    public final a d;
    public final b e;
    public final c f;
    public final d g;
    public AnimatorSet h;
    public ValueAnimator i;

    public h(TextInputLayout textInputLayout0) {
        super(textInputLayout0);
        this.d = new a(0, this);
        this.e = new b(0, this);
        this.f = new c(this, 0);
        this.g = new d(this, 0);
    }

    @Override  // com.google.android.material.textfield.EndIconDelegate
    public final void a() {
        Drawable drawable0 = q.v(this.b, 0x7F0802ED);  // drawable:mtrl_ic_cancel
        TextInputLayout textInputLayout0 = this.a;
        textInputLayout0.setEndIconDrawable(drawable0);
        textInputLayout0.setEndIconContentDescription(textInputLayout0.getResources().getText(0x7F1200BC));  // string:clear_text_end_icon_content_description "Clear text"
        textInputLayout0.setEndIconOnClickListener(new e(0, this));
        c c0 = this.f;
        textInputLayout0.c1.add(c0);
        if(textInputLayout0.f0 != null) {
            c0.a(textInputLayout0);
        }
        textInputLayout0.g1.add(this.g);
        ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        valueAnimator0.setInterpolator(q6.a.d);
        valueAnimator0.setDuration(150L);
        valueAnimator0.addUpdateListener(new g(this, 1));
        ValueAnimator valueAnimator1 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        valueAnimator1.setInterpolator(q6.a.a);
        valueAnimator1.setDuration(100L);
        valueAnimator1.addUpdateListener(new g(this, 0));
        AnimatorSet animatorSet0 = new AnimatorSet();
        this.h = animatorSet0;
        animatorSet0.playTogether(new Animator[]{valueAnimator0, valueAnimator1});
        this.h.addListener(new f(this, 0));
        ValueAnimator valueAnimator2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        valueAnimator2.setInterpolator(q6.a.a);
        valueAnimator2.setDuration(100L);
        valueAnimator2.addUpdateListener(new g(this, 0));
        this.i = valueAnimator2;
        valueAnimator2.addListener(new f(this, 1));
    }

    @Override  // com.google.android.material.textfield.EndIconDelegate
    public final void c(boolean z) {
        if(this.a.getSuffixText() == null) {
            return;
        }
        this.d(z);
    }

    public final void d(boolean z) {
        boolean z1 = this.a.g() == z;
        if(z && !this.h.isRunning()) {
            this.i.cancel();
            this.h.start();
            if(z1) {
                this.h.end();
            }
        }
        else if(!z) {
            this.h.cancel();
            this.i.start();
            if(z1) {
                this.i.end();
            }
        }
    }
}

