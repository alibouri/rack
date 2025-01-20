package J1;

import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.ViewTreeObserver;

public final class q implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {
    public final View X;
    public ViewTreeObserver Y;
    public final Runnable Z;

    public q(View view0, Runnable runnable0) {
        this.X = view0;
        this.Y = view0.getViewTreeObserver();
        this.Z = runnable0;
    }

    public static void a(View view0, Runnable runnable0) {
        if(view0 == null) {
            throw new NullPointerException("view == null");
        }
        q q0 = new q(view0, runnable0);
        view0.getViewTreeObserver().addOnPreDrawListener(q0);
        view0.addOnAttachStateChangeListener(q0);
    }

    @Override  // android.view.ViewTreeObserver$OnPreDrawListener
    public final boolean onPreDraw() {
        boolean z = this.Y.isAlive();
        View view0 = this.X;
        if(z) {
            this.Y.removeOnPreDrawListener(this);
        }
        else {
            view0.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view0.removeOnAttachStateChangeListener(this);
        this.Z.run();
        return true;
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view0) {
        this.Y = view0.getViewTreeObserver();
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view0) {
        boolean z = this.Y.isAlive();
        View view1 = this.X;
        if(z) {
            this.Y.removeOnPreDrawListener(this);
        }
        else {
            view1.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view1.removeOnAttachStateChangeListener(this);
    }
}

