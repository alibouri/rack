package R9;

import Aa.w;
import E9.a;
import Ha.f;
import Nb.j;
import V8.c;
import Y8.R6;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.wave.customer.CreatePinParams;
import f9.A;
import f9.K;
import q9.v2;

public final class c0 extends ViewModel {
    public final v2 Y;
    public final CreatePinParams Z;
    public final a b0;
    public final c c0;
    public final A d0;

    public c0(R6 r60, v2 v20, CreatePinParams createPinParams0, a a0) {
        j.f(r60, "repo");
        j.f(a0, "analytics");
        super();
        this.Y = v20;
        this.Z = createPinParams0;
        this.b0 = a0;
        this.c0 = new c(new V());
        String s = createPinParams0.Y;
        Y y0 = s == null ? new a0(this) : new Y(this, s);
        this.d0 = new A(y0.a(), new w(2, y0, K.class, "submit", "submit(Ljava/lang/String;Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/Job;", 0, 3), new f(0, this, c0.class, "cancel", "cancel()V", 0, 13), ViewModelKt.a(this));
    }
}

