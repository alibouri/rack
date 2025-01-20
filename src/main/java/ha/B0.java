package ha;

import N9.n;
import Nb.j;
import ac.j0;
import androidx.lifecycle.SubViewModel;
import q9.o0;

public final class b0 extends SubViewModel {
    public final O Y;
    public final S2 Z;
    public final n b0;
    public final j0 c0;

    public b0(O o0, S2 s20, n n0) {
        j.f(o0, "configRepository");
        j.f(s20, "personalHomeViewModel");
        j.f(n0, "tooltips");
        super(s20);
        this.Y = o0;
        this.Z = s20;
        this.b0 = n0;
        J j0 = o0.a();
        this.c0 = o0.b0(this, o0.d, j0);
    }
}

