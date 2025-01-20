package ea;

import Bb.z;
import E9.a;
import N2.l;
import Nb.j;
import V8.c;
import V8.e;
import Y8.H6;
import Y8.R1;
import Y8.R6;
import ac.B0;
import ac.j0;
import ac.o0;
import ac.w;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import kotlin.jvm.functions.Function1;

public final class k extends ViewModel {
    public final R6 Y;
    public final a Z;
    public final c b0;
    public final j0 c0;
    public final B0 d0;
    public final j0 e0;

    public k(R6 r60, a a0) {
        j.f(r60, "repo");
        j.f(a0, "analytics");
        super();
        this.Y = r60;
        this.Z = a0;
        this.b0 = new c(new e());  // initializer: Ljava/lang/Object;-><init>()V
        this.c0 = new j0(o0.c(Boolean.FALSE));
        l l0 = R6.g(r60, new R1(), H6.d0);  // initializer: Ljava/lang/Object;-><init>()V
        B0 b00 = o0.c(new f(z.X, false, false, false, false, null));
        this.d0 = b00;
        this.e0 = new j0(b00);
        o0.y(new w(l0, new g(this, null), 4), ViewModelKt.a(this));
        a0.d("view device management screen", null);
    }

    public final void o(Function1 function10) {
        do {
            Object object0 = this.d0.getValue();
            f f0 = (f)function10.n(((f)object0));
            hd.c.a.n("DeviceManagementViewModel");
            hd.c.a.a("update() called with: newState = " + f0, new Object[0]);
        }
        while(!this.d0.j(object0, f0));
    }
}

