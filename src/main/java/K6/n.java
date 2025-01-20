package K6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import o.N;

public final class n extends AnimatorListenerAdapter {
    public final int a;
    public final TextView b;
    public final int c;
    public final TextView d;
    public final o e;

    public n(o o0, int v, TextView textView0, int v1, TextView textView1) {
        this.e = o0;
        this.a = v;
        this.b = textView0;
        this.c = v1;
        this.d = textView1;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        o o0 = this.e;
        o0.h = this.a;
        o0.f = null;
        TextView textView0 = this.b;
        if(textView0 != null) {
            textView0.setVisibility(4);
            if(this.c == 1) {
                N n0 = o0.l;
                if(n0 != null) {
                    n0.setText(null);
                }
            }
        }
        TextView textView1 = this.d;
        if(textView1 != null) {
            textView1.setTranslationY(0.0f);
            textView1.setAlpha(1.0f);
        }
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationStart(Animator animator0) {
        TextView textView0 = this.d;
        if(textView0 != null) {
            textView0.setVisibility(0);
        }
    }
}

