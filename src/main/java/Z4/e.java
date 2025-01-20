package Z4;

import E7.D;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import f5.a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public final class e implements ViewTreeObserver.OnGlobalLayoutListener {
    public final WeakReference X;
    public final Handler Y;
    public final AtomicBoolean Z;
    public static final HashMap b0;

    static {
        e.b0 = new HashMap();
    }

    public e(Activity activity0) {
        this.X = new WeakReference(activity0);
        this.Y = new Handler(Looper.getMainLooper());
        this.Z = new AtomicBoolean(false);
    }

    public final void a() {
        if(a.b(this)) {
            return;
        }
        try {
            D d0 = new D(16, this);
            if(Thread.currentThread() == Looper.getMainLooper().getThread()) {
                d0.run();
                return;
            }
            this.Y.post(d0);
            return;
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, this);
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if(a.b(this)) {
            return;
        }
        try {
            this.a();
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
        }
    }
}

