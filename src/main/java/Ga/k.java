package ga;

import Bb.z;
import E9.a;
import Nb.j;
import V8.c;
import V8.e;
import Y8.R6;
import ac.j0;
import androidx.lifecycle.ViewModel;
import com.sendwave.backend.fragment.DealDetailFragment;
import com.wave.customer.growth.DealDetailParams;
import q9.n;
import q9.o0;

public final class k extends ViewModel {
    public final DealDetailParams Y;
    public final a Z;
    public final j0 b0;
    public final c c0;

    public k(DealDetailParams dealDetailParams0, n n0, R6 r60, a a0) {
        j.f(r60, "repo");
        j.f(a0, "analytics");
        super();
        this.Y = dealDetailParams0;
        this.Z = a0;
        mb.a.a(null, null, new g(this, null), 3);
        this.b0 = o0.d0(this, ac.o0.z(r60.h(dealDetailParams0.X, DealDetailFragment.class), new ga.j(2, null)), new f(null, "", "", z.X, null));  // initializer: LFb/j;-><init>(ILkotlin/coroutines/g;)V
        this.c0 = new c(new e());  // initializer: Ljava/lang/Object;-><init>()V
    }
}

