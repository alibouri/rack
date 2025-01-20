package ma;

import Ab.t;
import Ha.S;
import K9.K;
import K9.U;
import K9.Y;
import N2.l;
import Na.f;
import Nb.j;
import R9.Q1;
import R9.c1;
import V8.c;
import V8.d;
import V8.e;
import Xb.I0;
import Xb.J;
import Y8.N;
import Y8.R6;
import Y8.R9;
import Y8.W;
import Y8.u8;
import Y8.x8;
import Y8.y8;
import ac.B0;
import ac.d0;
import ac.e0;
import ac.i0;
import ac.j0;
import ac.o0;
import ac.r0;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import com.sendwave.backend.fragment.LinkedAccountFragment;
import com.sendwave.backend.fragment.LinkedAccountsFragment;
import com.sendwave.backend.type.LinkedAccountTransferDirection.FROM_WALLET;
import com.sendwave.backend.type.LinkedAccountTransferDirection.TO_WALLET;
import com.sendwave.backend.type.LinkedAccountTransferDirection.UNKNOWN__;
import com.sendwave.backend.type.LinkedAccountTransferDirection;
import com.sendwave.util.UNIT;
import com.wave.customer.linkedaccounts.LinkedAccountTransferParams;
import f9.a;
import f9.n0;
import ha.v2;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import m5.b;
import q9.m;
import q9.n;
import q9.r1;
import q9.x1;

public final class q0 extends ViewModel {
    public final R6 Y;
    public final LinkedAccountTransferParams Z;
    public final n b0;
    public final m c0;
    public final c d0;
    public final B0 e0;
    public final j0 f0;
    public final a g0;
    public final String h0;
    public final String i0;
    public final String j0;
    public final B0 k0;
    public final e0 l0;
    public final Q1 m0;
    public final l0 n0;
    public final e0 o0;
    public final d0 p0;
    public final f0 q0;
    public final B0 r0;
    public I0 s0;
    public final bc.n t0;
    public final d0 u0;
    public final U v0;
    public final Y w0;
    public final e0 x0;
    public final f0 y0;
    public static final x1 z0;

    static {
        q0.z0 = new x1("LastSelectedAccountId");  // initializer: LB4/e;-><init>(Ljava/lang/String;)V
    }

    public q0(R6 r60, LinkedAccountTransferParams linkedAccountTransferParams0, n n0, m m0) {
        j.f(r60, "repo");
        String s1;
        String s;
        super();
        this.Y = r60;
        this.Z = linkedAccountTransferParams0;
        this.b0 = n0;
        this.c0 = m0;
        CloseableCoroutineScope closeableCoroutineScope0 = ViewModelKt.a(this);
        i0 i00 = o0.B(r60.h(linkedAccountTransferParams0.X, LinkedAccountsFragment.class), closeableCoroutineScope0, r0.a(2, 5000L), 1);
        this.d0 = new c(new e());  // initializer: Ljava/lang/Object;-><init>()V
        B0 b00 = o0.c(Boolean.FALSE);
        this.e0 = b00;
        this.f0 = new j0(b00);
        a a0 = new a(this, new l(4, linkedAccountTransferParams0.Y));
        this.g0 = a0;
        v2 v20 = new v2(i00, 21);
        LinkedAccountTransferDirection linkedAccountTransferDirection0 = linkedAccountTransferParams0.Z;
        boolean z = false;
        if(linkedAccountTransferDirection0 instanceof TO_WALLET) {
            z = true;
            s = r1.d(0x7F1201FA, new Object[0]);  // string:linked_account_to_wallet_title "Add money"
        }
        else if(linkedAccountTransferDirection0 instanceof FROM_WALLET) {
            z = true;
            s = r1.d(0x7F1201F2, new Object[0]);  // string:linked_account_from_wallet_title "Withdraw money"
        }
        if(z) {
            this.h0 = s;
            boolean z1 = false;
            if(linkedAccountTransferDirection0 instanceof TO_WALLET) {
                z1 = true;
                s1 = r1.d(0x7F120200, new Object[0]);  // string:linked_account_transfer_confirm_amount_added_wave "Amount added to your\nWave 
                                                       // account"
            }
            else if(linkedAccountTransferDirection0 instanceof FROM_WALLET) {
                z1 = true;
                s1 = r1.d(0x7F1201FF, new Object[0]);  // string:linked_account_transfer_confirm_amount_added_bank "Amount added to your\nbank"
            }
            if(z1) {
                this.i0 = s1;
                this.j0 = m0.a(q0.z0);
                i0 i01 = q9.o0.W(this, new f(5, new S(i00, 21, this)), null, 6);
                B0 b01 = o0.c(null);
                this.k0 = b01;
                e0 e00 = new e0(i01, b01, new K(3, null, 8), 0);
                this.l0 = e00;
                this.m0 = new Q1(e00, 1);
                Q1 q10 = new Q1(e00, 2);
                this.n0 = new l0(q10, 0);
                K k0 = new K(3, null, 9);
                this.o0 = new e0(a0.d0, q10, k0, 0);
                n0 n00 = new n0(4, null, 1);
                this.p0 = o0.j(a0.d0, q10, a0.b0, n00);
                this.q0 = new f0(q10, this, 1);
                l0 l00 = new l0(q10, 1);
                this.r0 = o0.c(null);
                this.t0 = o0.F(l00, new N9.l(null, this, 10));
                V v0 = new V(this, true, null);
                d0 d00 = o0.j(a0.c0, q10, v20, v0);
                this.u0 = d00;
                V v1 = new V(this, false, null);
                d0 d01 = o0.j(a0.c0, q10, v20, v1);
                T t0 = new T(this, null);
                S s2 = o0.i(a0.d0, d00, d01, q10, t0);
                this.v0 = new U(s2, 1);
                this.w0 = new Y(d00, 1);
                this.x0 = new e0(s2, d00, new c1(3, null, 1), 0);
                this.y0 = new f0(q10, this, 0);
                return;
            }
            if(!(linkedAccountTransferDirection0 instanceof UNKNOWN__)) {
                throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
            }
            throw new Y8.V(null);
        }
        if(!(linkedAccountTransferDirection0 instanceof UNKNOWN__)) {
            throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
        }
        throw new Y8.V(null);
    }

    public static final Object o(q0 q00, R9 r90, Fb.c c0) {
        x8 x80;
        AtomicInteger atomicInteger2;
        B0 b01;
        AtomicInteger atomicInteger1;
        X x0;
        q0 q01 = q00;
        q00.getClass();
        if(c0 instanceof X) {
            x0 = (X)c0;
            int v = x0.g0;
            if((v & 0x80000000) == 0) {
                x0 = new X(q01, c0);
            }
            else {
                x0.g0 = v ^ 0x80000000;
            }
        }
        else {
            x0 = new X(q01, c0);
        }
        Object object0 = x0.e0;
        Object object1 = Eb.a.X;
        switch(x0.g0) {
            case 0: {
                W5.f.b0(object0);
                UUID uUID0 = UUID.randomUUID();
                Map map0 = N.a;
                B0 b00 = q01.e0;
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
                    lb.j j0 = new lb.j(3);
                    atomicInteger1 = atomicInteger0;
                    ma.Y y0 = new ma.Y(q01, r90, uUID0, null);
                    x0.b0 = q01;
                    x0.c0 = b00;
                    x0.d0 = atomicInteger0;
                    x0.g0 = 1;
                    atomicInteger1 = atomicInteger0;
                    object0 = N.h(15, 2000L, j0, y0, x0);
                }
                catch(Throwable throwable0) {
                    b01 = b00;
                    atomicInteger2 = atomicInteger1;
                    goto label_51;
                }
                if(object0 == object1) {
                    return object1;
                }
                b01 = b00;
                atomicInteger2 = atomicInteger1;
                x80 = (x8)object0;
                goto label_55;
            }
            case 1: {
                try {
                    atomicInteger2 = x0.d0;
                    b01 = x0.c0;
                    q01 = x0.b0;
                    W5.f.b0(object0);
                    x80 = (x8)object0;
                    goto label_55;
                }
                catch(Throwable throwable0) {
                }
                do {
                label_51:
                    Object object4 = b01.getValue();
                    ((Boolean)object4).getClass();
                }
                while(!b01.j(object4, Boolean.valueOf(atomicInteger2.decrementAndGet() > 0)));
                throw throwable0;
                do {
                label_55:
                    Object object5 = b01.getValue();
                    ((Boolean)object5).getClass();
                }
                while(!b01.j(object5, Boolean.valueOf(atomicInteger2.decrementAndGet() > 0)));
                y8 y80 = x80.a.b;
                if(y80.d != null) {
                    x0.b0 = null;
                    x0.c0 = null;
                    x0.d0 = null;
                    x0.g0 = 2;
                    object0 = q01.d0.e(x0);
                    if(object0 == object1) {
                        return object1;
                    }
                    ((d)object0).Y(UNIT.X);
                    return t.a;
                }
                if(y80.b == null) {
                    goto label_75;
                }
                x0.b0 = null;
                x0.c0 = null;
                x0.d0 = null;
                x0.g0 = 3;
                object0 = q01.d0.e(x0);
                if(object0 == object1) {
                    return object1;
                label_75:
                    u8 u80 = y80.c;
                    if(u80 != null) {
                        throw new W(u80.a, u80.b);
                    }
                    return t.a;
                }
                ((d)object0).Y(UNIT.X);
                return t.a;
            }
            case 2: {
                W5.f.b0(object0);
                ((d)object0).Y(UNIT.X);
                return t.a;
            }
            case 3: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        W5.f.b0(object0);
        ((d)object0).Y(UNIT.X);
        return t.a;
    }

    public static final Object p(q0 q00, Fb.c c0) {
        b0 b00;
        q00.getClass();
        if(c0 instanceof b0) {
            b00 = (b0)c0;
            int v = b00.e0;
            if((v & 0x80000000) == 0) {
                b00 = new b0(q00, c0);
            }
            else {
                b00.e0 = v ^ 0x80000000;
            }
        }
        else {
            b00 = new b0(q00, c0);
        }
        Object object0 = b00.c0;
        Object object1 = Eb.a.X;
        switch(b00.e0) {
            case 0: {
                W5.f.b0(object0);
                b00.b0 = q00;
                b00.e0 = 1;
                object0 = o0.v(q00.l0, b00);
                if(object0 != object1) {
                    goto label_22;
                }
                break;
            }
            case 1: {
                q00 = b00.b0;
                W5.f.b0(object0);
            label_22:
                object1 = t.a;
                if(((LinkedAccountFragment)object0) != null) {
                    String s = ((LinkedAccountFragment)object0).getId();
                    if(s != null) {
                        I0 i00 = q00.s0;
                        if(i00 != null) {
                            i00.f(null);
                        }
                        q00.r0.k(null);
                        q00.s0 = J.q(ViewModelKt.a(q00), null, null, new ma.U(q00, s, null), 3);
                    }
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return object1;
    }
}

