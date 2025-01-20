package c2;

import Nb.j;
import Y8.o;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

public final class f extends AnimatorListenerAdapter {
    public final ViewGroup a;
    public final View b;
    public final boolean c;
    public final X d;
    public final g e;

    public f(ViewGroup viewGroup0, View view0, boolean z, X x0, g g0) {
        this.a = viewGroup0;
        this.b = view0;
        this.c = z;
        this.d = x0;
        this.e = g0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        j.f(animator0, "anim");
        ViewGroup viewGroup0 = this.a;
        View view0 = this.b;
        viewGroup0.endViewTransition(view0);
        X x0 = this.d;
        if(this.c) {
            int v = x0.a;
            j.e(view0, "viewToAnimate");
            o.k(v, view0, viewGroup0);
        }
        ((X)this.e.c.Y).c(this.e);
        if(Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + x0 + " has ended.");
        }
    }
}

