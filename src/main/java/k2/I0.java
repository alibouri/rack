package k2;

import A7.b;
import C3.i;
import Nb.j;
import Xb.I0;
import Xb.I;
import Xb.J;
import Zb.a;
import ac.G0;
import ac.n0;
import ac.o0;
import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;

public final class i0 {
    public final h1 a;
    public final i b;

    public i0(CloseableCoroutineScope closeableCoroutineScope0, h1 h10) {
        j.f(h10, "parent");
        super();
        this.a = h10;
        j.f(h10.a, "src");
        i i0 = new i();  // initializer: Ljava/lang/Object;-><init>()V
        i0.X = new b(8);
        n0 n00 = o0.a(1, 0x7FFFFFFF, a.X);
        i0.Y = n00;
        i0.Z = new G0(n00, new m(i0, null));
        l l0 = new l(h10.a, i0, null);
        I0 i00 = J.q(closeableCoroutineScope0, null, I.Y, l0, 1);
        i00.q(new V2.a(14, i0));
        i0.b0 = i00;
        i0.c0 = new N2.l(new k2.j(i0, null));
        this.b = i0;
    }
}

