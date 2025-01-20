package p9;

import Ab.t;
import Eb.a;
import K9.M;
import Nb.j;
import Nb.p;
import Nb.x;
import Tb.e;
import V8.c;
import W5.f;
import Y8.G6;
import Y8.N;
import Y8.R6;
import Y8.m9;
import Y8.y6;
import ac.B0;
import ac.d0;
import ac.i0;
import ac.o0;
import ac.r0;
import androidx.lifecycle.FlowWatcherKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.WatchedProperty;
import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import com.sendwave.backend.fragment.PayableWalletFragment;
import com.sendwave.shared.paybill.SelectFavoriteParams;
import com.sendwave.shared.paybill.SelectFavoriteResult;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import m5.b;
import o9.U0;

public final class j0 extends ViewModel {
    public final R6 Y;
    public final SelectFavoriteParams Z;
    public final c b0;
    public final B0 c0;
    public final ac.j0 d0;
    public final B0 e0;
    public final WatchedProperty f0;
    public final O g0;
    public final d0 h0;
    public static final e[] i0;

    static {
        p p0 = new p(j0.class, "wSelectedFavoriteId", "getWSelectedFavoriteId()Ljava/lang/String;", 0);
        x.a.getClass();
        j0.i0 = new e[]{p0};
    }

    public j0(R6 r60, SelectFavoriteParams selectFavoriteParams0) {
        j.f(r60, "repo");
        super();
        this.Y = r60;
        this.Z = selectFavoriteParams0;
        c c0 = new c(b0.a);
        this.b0 = c0;
        CloseableCoroutineScope closeableCoroutineScope0 = ViewModelKt.a(this);
        i0 i00 = o0.B(r60.h(selectFavoriteParams0.X, PayableWalletFragment.class), closeableCoroutineScope0, r0.a(2, 5000L), 1);
        U0 u00 = new U0(i00, 13);
        U0 u01 = new U0(i00, 14);
        B0 b00 = o0.c(Boolean.FALSE);
        this.c0 = b00;
        this.d0 = new ac.j0(b00);
        B0 b01 = o0.c(selectFavoriteParams0.Y);
        this.e0 = b01;
        this.f0 = FlowWatcherKt.b(b01).b(this, j0.i0[0]);
        this.g0 = new O(this, i00, c0);
        this.h0 = o0.j(u01, b01, u00, new M(this, null, 2));
    }

    public static final Object o(j0 j00, String s, String s1, Fb.c c0) {
        B0 b01;
        AtomicInteger atomicInteger1;
        Object object4;
        m9 m90;
        p9.i0 i00;
        j00.getClass();
        if(c0 instanceof p9.i0) {
            i00 = (p9.i0)c0;
            int v = i00.f0;
            if((v & 0x80000000) == 0) {
                i00 = new p9.i0(j00, c0);
            }
            else {
                i00.f0 = v ^ 0x80000000;
            }
        }
        else {
            i00 = new p9.i0(j00, c0);
        }
        Object object0 = i00.d0;
        Object object1 = a.X;
        switch(i00.f0) {
            case 0: {
                f.b0(object0);
                Map map0 = N.a;
                B0 b00 = j00.c0;
                Object object2 = map0.get(b00);
                if(object2 == null) {
                    object2 = b.E(0, map0, b00);
                }
                AtomicInteger atomicInteger0 = (AtomicInteger)object2;
                do {
                    Object object3 = b00.getValue();
                    ((Boolean)object3).getClass();
                }
                while(!b00.j(object3, Boolean.valueOf(atomicInteger0.incrementAndGet() > 0)));
                try {
                    m90 = new m9(s, s1);
                    i00.b0 = b00;
                    i00.c0 = atomicInteger0;
                    i00.f0 = 1;
                }
                catch(Throwable throwable0) {
                    atomicInteger1 = atomicInteger0;
                    b01 = b00;
                    break;
                }
                try {
                    object4 = j00.Y.f(m90, G6.X, i00);
                }
                catch(Throwable throwable1) {
                    throwable0 = throwable1;
                    atomicInteger1 = atomicInteger0;
                    b01 = b00;
                    break;
                }
                if(object4 != object1) {
                    b01 = b00;
                    object0 = object4;
                    atomicInteger1 = atomicInteger0;
                    goto label_47;
                }
                return object1;
            }
            case 1: {
                try {
                    atomicInteger1 = i00.c0;
                    b01 = i00.b0;
                    f.b0(object0);
                label_47:
                    y6 y60 = (y6)object0;
                    goto label_54;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            Object object5 = b01.getValue();
            ((Boolean)object5).getClass();
        }
        while(!b01.j(object5, Boolean.valueOf(atomicInteger1.decrementAndGet() > 0)));
        throw throwable0;
        do {
        label_54:
            Object object6 = b01.getValue();
            ((Boolean)object6).getClass();
        }
        while(!b01.j(object6, Boolean.valueOf(atomicInteger1.decrementAndGet() > 0)));
        return t.a;
    }

    public final void p() {
        V v0 = (V)this.b0.a();
        if(v0 != null) {
            v0.Y(new SelectFavoriteResult(((String)this.f0.a(j0.i0[0], this))));
        }
    }
}

