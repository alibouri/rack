package N;

import Nb.k;
import a1.g;
import android.support.v4.media.session.a;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function1;

public final class t0 extends k implements Function1 {
    public final int X;
    public final C0 Y;

    public t0(C0 c00, int v) {
        this.X = v;
        this.Y = c00;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        if(this.X != 0) {
            ((Number)object0).floatValue();
            return C0.a(this.Y).w(B0.b);
        }
        Density density0 = (Density)object0;
        return new g(a.i(Pb.a.H(this.Y.a.l()), 0));
    }
}

