package c2;

import Nb.j;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import io.sentry.internal.debugmeta.c;

public final class d extends W {
    public final e c;

    public d(e e0) {
        this.c = e0;
    }

    @Override  // c2.W
    public final void a(ViewGroup viewGroup0) {
        j.f(viewGroup0, "container");
        X x0 = (X)this.c.Y;
        View view0 = x0.c.F0;
        view0.clearAnimation();
        viewGroup0.endViewTransition(view0);
        ((X)this.c.Y).c(this);
        if(Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + x0 + " has been cancelled.");
        }
    }

    @Override  // c2.W
    public final void b(ViewGroup viewGroup0) {
        j.f(viewGroup0, "container");
        e e0 = this.c;
        boolean z = e0.m();
        X x0 = (X)e0.Y;
        if(z) {
            x0.c(this);
            return;
        }
        Context context0 = viewGroup0.getContext();
        View view0 = x0.c.F0;
        j.e(context0, "context");
        c c0 = e0.r(context0);
        if(c0 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Animation animation0 = (Animation)c0.Y;
        if(animation0 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if(x0.a != 1) {
            view0.startAnimation(animation0);
            x0.c(this);
            return;
        }
        viewGroup0.startViewTransition(view0);
        y y0 = new y(animation0, viewGroup0, view0);
        y0.setAnimationListener(new c2.c(x0, viewGroup0, view0, this));
        view0.startAnimation(y0);
        if(Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + x0 + " has started.");
        }
    }
}

