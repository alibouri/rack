package g1;

import Ab.t;
import Ea.Q0;
import Nb.j;
import Nb.k;
import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

public final class h extends k implements Function1 {
    public final int X;
    public final i Y;

    public h(i i0, int v) {
        this.X = v;
        this.Y = i0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        if(this.X != 0) {
            t t0 = (t)object0;
            this.Y.b0 = true;
            return t.a;
        }
        if(j.a(Looper.myLooper(), Looper.getMainLooper())) {
            ((Function0)object0).invoke();
            return t.a;
        }
        i i0 = this.Y;
        Handler handler0 = i0.Y;
        if(handler0 == null) {
            handler0 = new Handler(Looper.getMainLooper());
            i0.Y = handler0;
        }
        handler0.post(new Q0(((Function0)object0), 3));
        return t.a;
    }
}

