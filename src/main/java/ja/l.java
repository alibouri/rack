package ja;

import E9.b;
import Nb.j;
import V8.c;
import Xb.J;
import Y8.R6;
import ac.B0;
import ac.j0;
import ac.o0;
import androidx.lifecycle.FlowWatcherKt;
import androidx.lifecycle.SubViewModel;
import ha.S2;
import q9.w;

public final class l extends SubViewModel {
    public final R6 Y;
    public final b Z;
    public final w b0;
    public final c c0;
    public final B0 d0;
    public final j0 e0;

    public l(S2 s20, R6 r60, b b0, w w0) {
        j.f(s20, "parent");
        j.f(r60, "repo");
        j.f(b0, "analytics");
        j.f(w0, "audioPlayer");
        super(s20);
        this.Y = r60;
        this.Z = b0;
        this.b0 = w0;
        this.c0 = s20.r0;
        B0 b00 = o0.c(new d(null, null, false, new f9.b()));
        this.d0 = b00;
        this.e0 = new j0(b00);
        J.q(FlowWatcherKt.a(this), null, null, new f(this, null), 3);
        J.q(FlowWatcherKt.a(this), null, null, new g(this, null), 3);
    }
}

