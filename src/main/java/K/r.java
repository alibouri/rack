package K;

import I.j0;
import M.o0;
import O0.N;
import Xb.I0;
import android.os.CancellationSignal.OnCancelListener;

public final class r implements CancellationSignal.OnCancelListener {
    public final int a;
    public final Object b;

    public r(int v, Object object0) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // android.os.CancellationSignal$OnCancelListener
    public final void onCancel() {
        if(this.a != 0) {
            ((I0)this.b).f(null);
            return;
        }
        o0 o00 = (o0)this.b;
        if(o00 != null) {
            j0 j00 = o00.d;
            if(j00 != null) {
                j00.e(N.b);
            }
            j0 j01 = o00.d;
            if(j01 != null) {
                j01.f(N.b);
            }
        }
    }
}

