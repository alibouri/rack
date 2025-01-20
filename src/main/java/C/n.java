package c;

import Ab.t;
import Nb.j;
import Nb.k;
import android.app.Application;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.c;
import c2.x;
import kotlin.jvm.functions.Function0;

public final class n extends k implements Function0 {
    public final int X;
    public final x Y;

    public n(x x0, int v) {
        this.X = v;
        this.Y = x0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.X) {
            case 0: {
                Application application0 = this.Y.getApplication();
                return this.Y.getIntent() == null ? new SavedStateViewModelFactory(application0, this.Y, null) : new SavedStateViewModelFactory(application0, this.Y, this.Y.getIntent().getExtras());
            }
            case 1: {
                this.Y.reportFullyDrawn();
                return t.a;
            }
            case 2: {
                n n0 = new n(this.Y, 1);
                return new c.x(this.Y.d0, n0);
            }
            default: {
                x x0 = this.Y;
                Object object0 = new L(new d(x0, 1));
                if(Build.VERSION.SDK_INT >= 33) {
                    if(!j.a(Looper.myLooper(), Looper.getMainLooper())) {
                        new Handler(Looper.getMainLooper()).post(new E7.n(x0, 24, object0));
                        return object0;
                    }
                    c c0 = new c(object0, 2, x0);
                    x0.X.a(c0);
                }
                return object0;
            }
        }
    }
}

