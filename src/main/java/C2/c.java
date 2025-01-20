package c2;

import E7.h;
import Nb.j;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Animation;

public final class c implements Animation.AnimationListener {
    public final X a;
    public final ViewGroup b;
    public final View c;
    public final d d;

    public c(X x0, ViewGroup viewGroup0, View view0, d d0) {
        this.a = x0;
        this.b = viewGroup0;
        this.c = view0;
        this.d = d0;
    }

    @Override  // android.view.animation.Animation$AnimationListener
    public final void onAnimationEnd(Animation animation0) {
        j.f(animation0, "animation");
        h h0 = new h(this.b, this.c, this.d, 12);
        this.b.post(h0);
        if(Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.a + " has ended.");
        }
    }

    @Override  // android.view.animation.Animation$AnimationListener
    public final void onAnimationRepeat(Animation animation0) {
        j.f(animation0, "animation");
    }

    @Override  // android.view.animation.Animation$AnimationListener
    public final void onAnimationStart(Animation animation0) {
        j.f(animation0, "animation");
        if(Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.a + " has reached onAnimationStart.");
        }
    }
}

