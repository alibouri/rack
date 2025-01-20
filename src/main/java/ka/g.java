package ka;

import Ab.t;
import C3.i;
import Eb.a;
import Fb.c;
import Ha.S;
import K9.K;
import Ma.b;
import N9.l;
import Nb.j;
import Y8.O;
import Y8.R6;
import Y8.t3;
import Y8.t9;
import ac.B0;
import ac.d0;
import ac.e0;
import ac.h;
import ac.i0;
import ac.j0;
import ac.o0;
import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import com.wave.customer.transactions.persistence.TransactionHistoryDatabase;

public final class g {
    public final R6 a;
    public final B0 b;
    public final i0 c;
    public final e0 d;
    public final e0 e;
    public final S f;
    public final d0 g;

    public g(R6 r60, i0 i00, b b0, TransactionHistoryDatabase transactionHistoryDatabase0, i i0, B0 b00, j0 j00, h h0, CloseableCoroutineScope closeableCoroutineScope0) {
        j.f(r60, "repo");
        j.f(i00, "homeFragmentData");
        j.f(b0, "hiddenUserHistoryRepo");
        j.f(i0, "deviceTimeOffsetStore");
        j.f(j00, "fullScreenLoading");
        j.f(h0, "walletCountry");
        super();
        this.a = r60;
        B0 b01 = o0.c(t3.c0);
        this.b = b01;
        l l0 = new l(null, transactionHistoryDatabase0, 9);
        i0 i01 = q9.o0.V(o0.F(b0.c, l0), closeableCoroutineScope0);
        f f0 = new f(this, null);
        i0 i02 = q9.o0.V(o0.i(i00, b0.c, h0, ((B0)i0.b0), f0), closeableCoroutineScope0);
        this.c = i02;
        e0 e00 = new e0(i02, i01, new d(3, null, 0), 0);
        this.d = e00;
        this.e = new e0(i02, i01, new d(3, null, 1), 0);
        this.f = o0.i(i02, b01, b00, e00, new ka.b(5, null));  // initializer: LFb/j;-><init>(ILkotlin/coroutines/g;)V
        this.g = o0.j(b00, new e0(i02, b01, new K(3, null, 7), 0), j00, new e(4, null));  // initializer: LFb/j;-><init>(ILkotlin/coroutines/g;)V
    }

    public final Object a(c c0) {
        g g0;
        ka.c c1;
        if(c0 instanceof ka.c) {
            c1 = (ka.c)c0;
            int v = c1.e0;
            if((v & 0x80000000) == 0) {
                c1 = new ka.c(this, c0);
            }
            else {
                c1.e0 = v ^ 0x80000000;
            }
        }
        else {
            c1 = new ka.c(this, c0);
        }
        Object object0 = c1.c0;
        Object object1 = a.X;
        switch(c1.e0) {
            case 0: {
                W5.f.b0(object0);
                try {
                    this.b.getClass();
                    this.b.l(null, t3.Y);
                    t9 t90 = new t9();  // initializer: Ljava/lang/Object;-><init>()V
                    c1.b0 = this;
                    c1.e0 = 1;
                    if(R6.d(this.a, t90, null, null, c1, 6) == object1) {
                        return object1;
                    }
                }
                catch(O o0) {
                    g0 = this;
                    break;
                }
                g0 = this;
                goto label_29;
            }
            case 1: {
                try {
                    g0 = c1.b0;
                    W5.f.b0(object0);
                label_29:
                    g0.b.getClass();
                    g0.b.l(null, t3.c0);
                    return t.a;
                }
                catch(O o0) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        g0.b.getClass();
        g0.b.l(null, t3.b0);
        throw o0;
    }
}

