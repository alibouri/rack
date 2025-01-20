package M;

import C.t;
import Nb.k;
import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build.VERSION;
import k0.c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m0.e;
import n0.M;
import n0.n;
import n0.p;

public final class g extends k implements Function1 {
    public final long X;
    public final Function0 Y;
    public final boolean Z;

    public g(long v, Function0 function00, boolean z) {
        this.X = v;
        this.Y = function00;
        this.Z = z;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        n0.g g0 = c0.q(((c)object0), e.d(((c)object0).X.d()) / 2.0f);
        long v = this.X;
        BlendModeColorFilter blendModeColorFilter0 = Build.VERSION.SDK_INT >= 29 ? p.a.a(v, 5) : new PorterDuffColorFilter(M.G(v), M.J(5));
        n n0 = new n(v, 5, blendModeColorFilter0);
        return ((c)object0).a(new t(2, this.Y, g0, n0, this.Z));
    }
}

