package c2;

import Nb.j;
import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import c.b;
import io.sentry.internal.debugmeta.c;

public final class g extends W {
    public final e c;
    public AnimatorSet d;

    public g(e e0) {
        this.c = e0;
    }

    @Override  // c2.W
    public final void a(ViewGroup viewGroup0) {
        j.f(viewGroup0, "container");
        AnimatorSet animatorSet0 = this.d;
        e e0 = this.c;
        if(animatorSet0 == null) {
            ((X)e0.Y).c(this);
            return;
        }
        X x0 = (X)e0.Y;
        if(!x0.g) {
            animatorSet0.end();
        }
        else if(Build.VERSION.SDK_INT >= 26) {
            i.a.a(animatorSet0);
        }
        if(Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + x0 + " has been canceled" + (x0.g ? " with seeking." : ".") + ' ');
        }
    }

    @Override  // c2.W
    public final void b(ViewGroup viewGroup0) {
        j.f(viewGroup0, "container");
        X x0 = (X)this.c.Y;
        AnimatorSet animatorSet0 = this.d;
        if(animatorSet0 == null) {
            x0.c(this);
            return;
        }
        animatorSet0.start();
        if(Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + x0 + " has started.");
        }
    }

    @Override  // c2.W
    public final void c(b b0, ViewGroup viewGroup0) {
        j.f(b0, "backEvent");
        j.f(viewGroup0, "container");
        AnimatorSet animatorSet0 = this.d;
        X x0 = (X)this.c.Y;
        if(animatorSet0 == null) {
            x0.c(this);
            return;
        }
        if(Build.VERSION.SDK_INT >= 34 && x0.c.k0) {
            if(Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + x0);
            }
            long v = h.a.a(animatorSet0);
            long v1 = Long.compare(((long)(b0.c * ((float)v))), 0L) == 0 ? 1L : ((long)(b0.c * ((float)v)));
            if(v1 == v) {
                v1 = v - 1L;
            }
            if(Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Setting currentPlayTime to " + v1 + " for Animator " + animatorSet0 + " on operation " + x0);
            }
            i.a.b(animatorSet0, v1);
        }
    }

    @Override  // c2.W
    public final void d(ViewGroup viewGroup0) {
        j.f(viewGroup0, "container");
        e e0 = this.c;
        if(e0.m()) {
            return;
        }
        Context context0 = viewGroup0.getContext();
        j.e(context0, "context");
        c c0 = e0.r(context0);
        this.d = c0 == null ? null : ((AnimatorSet)c0.Z);
        X x0 = (X)e0.Y;
        boolean z = x0.a == 3;
        View view0 = x0.c.F0;
        viewGroup0.startViewTransition(view0);
        AnimatorSet animatorSet0 = this.d;
        if(animatorSet0 != null) {
            animatorSet0.addListener(new f(viewGroup0, view0, z, x0, this));
        }
        AnimatorSet animatorSet1 = this.d;
        if(animatorSet1 != null) {
            animatorSet1.setTarget(view0);
        }
    }
}

