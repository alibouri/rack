package c;

import E7.D;
import Nb.j;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver.OnDrawListener;
import c2.x;
import java.util.concurrent.Executor;

public final class k implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public final long X;
    public Runnable Y;
    public boolean Z;
    public final x b0;

    public k(x x0) {
        this.b0 = x0;
        this.X = SystemClock.uptimeMillis() + 10000L;
    }

    public final void a(View view0) {
        if(!this.Z) {
            this.Z = true;
            view0.getViewTreeObserver().addOnDrawListener(this);
        }
    }

    @Override
    public final void execute(Runnable runnable0) {
        j.f(runnable0, "runnable");
        this.Y = runnable0;
        View view0 = this.b0.getWindow().getDecorView();
        j.e(view0, "window.decorView");
        if(this.Z) {
            if(j.a(Looper.myLooper(), Looper.getMainLooper())) {
                view0.invalidate();
                return;
            }
            view0.postInvalidate();
            return;
        }
        view0.postOnAnimation(new D(20, this));
    }

    @Override  // android.view.ViewTreeObserver$OnDrawListener
    public final void onDraw() {
        Runnable runnable0 = this.Y;
        if(runnable0 != null) {
            runnable0.run();
            this.Y = null;
            if(((c.x)this.b0.e0.getValue()).c) {
                this.Z = false;
                this.b0.getWindow().getDecorView().post(this);
            }
        }
        else if(SystemClock.uptimeMillis() > this.X) {
            this.Z = false;
            this.b0.getWindow().getDecorView().post(this);
        }
    }

    @Override
    public final void run() {
        this.b0.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

