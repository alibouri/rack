package la;

import Ab.t;
import Bb.r;
import Bb.z;
import E9.a;
import V8.c;
import V8.e;
import Xb.J;
import Y8.N;
import Y8.R6;
import Y8.m2;
import a9.q3;
import ac.B0;
import ac.j0;
import ac.o0;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.sendwave.backend.fragment.KycInfoFragment;
import com.wave.customer.limits.AccountLimitsParams;
import java.util.ArrayList;
import java.util.Map;
import ra.O0;

public final class j extends ViewModel {
    public final R6 Y;
    public final AccountLimitsParams Z;
    public final a b0;
    public final c c0;
    public final B0 d0;
    public final j0 e0;
    public final B0 f0;
    public final j0 g0;

    public j(R6 r60, AccountLimitsParams accountLimitsParams0, a a0) {
        Nb.j.f(r60, "repo");
        Nb.j.f(a0, "analytics");
        super();
        this.Y = r60;
        this.Z = accountLimitsParams0;
        this.b0 = a0;
        this.c0 = new c(new e());  // initializer: Ljava/lang/Object;-><init>()V
        B0 b00 = o0.c(Boolean.FALSE);
        this.d0 = b00;
        this.e0 = new j0(b00);
        B0 b01 = o0.c(new d(new k(z.X, null), l.X, false));
        this.f0 = b01;
        this.g0 = new j0(b01);
        J.q(ViewModelKt.a(this), null, null, new la.e(this, null), 3);
    }

    public static final Object o(j j0, Fb.c c0) {
        f f0;
        j0.getClass();
        if(c0 instanceof f) {
            f0 = (f)c0;
            int v = f0.e0;
            if((v & 0x80000000) == 0) {
                f0 = new f(j0, c0);
            }
            else {
                f0.e0 = v ^ 0x80000000;
            }
        }
        else {
            f0 = new f(j0, c0);
        }
        Object object0 = f0.c0;
        Object object1 = Eb.a.X;
        switch(f0.e0) {
            case 0: {
                W5.f.b0(object0);
                f0.b0 = j0;
                f0.e0 = 1;
                object0 = j0.Y.e(j0.Z.Y, KycInfoFragment.class, f0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                j0 = f0.b0;
                W5.f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        O0 o00 = W5.f.Z(((KycInfoFragment)((m2)object0).a));
        Nb.j.f(j0.b0, "<this>");
        Map map0 = a.a.s(o00);
        j0.b0.d("view account limits screen", map0);
        do {
            B0 b00 = j0.f0;
            Object object2 = b00.getValue();
            Nb.j.f(((d)object2), "$this$updateState");
            Iterable iterable0 = ((KycInfoFragment)((m2)object0).a).b.b;
            ArrayList arrayList0 = new ArrayList(r.b0(iterable0));
            for(Object object3: iterable0) {
                arrayList0.add(((q3)object3).b);
            }
            d d0 = d.a(((d)object2), new k(arrayList0, null), l.Y, false, 4);
            hd.c.a.n("AccountLimitsViewModel");
            hd.c.a.a("update() called with: newState = " + d0, new Object[0]);
        }
        while(!b00.j(object2, d0));
        h h0 = new h(false, j0, null);
        N.k(j0, j0.c0, true, h0);
        return t.a;
    }
}

