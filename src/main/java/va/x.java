package va;

import Aa.v;
import Aa.w;
import Ab.t;
import Ba.n;
import Bb.F;
import E9.a;
import N2.l;
import Nb.j;
import Nb.p;
import Tb.e;
import V8.c;
import V8.d;
import W5.f;
import Y8.R6;
import ac.B0;
import ac.e0;
import ac.j0;
import androidx.lifecycle.FlowWatcherKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.WatchedProperty;
import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import com.apollographql.apollo.api.b;
import com.sendwave.backend.fragment.SupportFragment;
import com.sendwave.util.Country;
import com.wave.customer.receipts.ReceiptParams;
import com.wave.customer.transactions.persistence.TransactionHistoryDatabase;
import java.util.Map;
import pb.E;
import q9.X0;
import q9.o0;
import q9.r1;

public final class x extends ViewModel {
    public final R6 Y;
    public final a Z;
    public final w b0;
    public final boolean c0;
    public final c d0;
    public final Country e0;
    public final j0 f0;
    public final B0 g0;
    public final j0 h0;
    public final B0 i0;
    public final X0 j0;
    public final e0 k0;
    public final n l0;
    public final E m0;
    public final B0 n0;
    public final WatchedProperty o0;
    public static final e[] p0;

    static {
        p p0 = new p(x.class, "wSupportCallingParams", "getWSupportCallingParams()Lcom/wave/voip/SupportCallingParams;", 0);
        Nb.x.a.getClass();
        x.p0 = new e[]{p0};
    }

    public x(R6 r60, TransactionHistoryDatabase transactionHistoryDatabase0, ReceiptParams receiptParams0, q9.n n0, Country country0, a a0, w w0, boolean z, v v0) {
        j.f(r60, "repo");
        j.f(a0, "analytics");
        super();
        this.Y = r60;
        this.Z = a0;
        this.b0 = w0;
        this.c0 = z;
        this.d0 = new c(new V8.e());  // initializer: Ljava/lang/Object;-><init>()V
        this.e0 = country0;
        this.f0 = o0.d0(this, va.E.a(r60, transactionHistoryDatabase0.s(), receiptParams0.X, country0, receiptParams0.Y, n0, receiptParams0.Z), null);
        Boolean boolean0 = Boolean.FALSE;
        B0 b00 = ac.o0.c(boolean0);
        this.g0 = b00;
        this.h0 = new j0(b00);
        this.i0 = ac.o0.c(boolean0);
        l l0 = r60.h(receiptParams0.b0, SupportFragment.class);
        this.j0 = new X0(new n(l0, 10), 2, this);
        this.k0 = new e0(l0, country0, this, 3);
        this.l0 = new n(l0, 11);
        CloseableCoroutineScope closeableCoroutineScope0 = ViewModelKt.a(this);
        this.m0 = (E)v0.h(b00, s9.a.h0, closeableCoroutineScope0);
        this.n0 = ac.o0.c(boolean0);
        this.o0 = FlowWatcherKt.b(new n(l0, 12)).b(this, x.p0[0]);
    }

    public final Object o(boolean z, Fb.c c0) {
        String s;
        x x0;
        x x1;
        c c1;
        va.l l0;
        if(c0 instanceof va.l) {
            l0 = (va.l)c0;
            int v = l0.g0;
            if((v & 0x80000000) == 0) {
                l0 = new va.l(this, c0);
            }
            else {
                l0.g0 = v ^ 0x80000000;
            }
        }
        else {
            l0 = new va.l(this, c0);
        }
        Object object0 = l0.e0;
        Object object1 = Eb.a.X;
        Object object2 = t.a;
        switch(l0.g0) {
            case 0: {
                f.b0(object0);
                l0.b0 = this;
                c1 = this.d0;
                l0.c0 = c1;
                l0.d0 = z;
                l0.g0 = 1;
                object0 = ac.o0.v(this.k0, l0);
                if(object0 == object1) {
                    return object1;
                }
                x1 = this;
                break;
            }
            case 1: {
                z = l0.d0;
                c1 = l0.c0;
                x1 = (x)l0.b0;
                f.b0(object0);
                break;
            }
            case 2: {
                z = l0.d0;
                x0 = (x)l0.b0;
                f.b0(object0);
                goto label_46;
            }
            case 3: {
                f.b0(object0);
                return object2;
            }
            case 4: {
                s = (String)l0.b0;
                f.b0(object0);
                ((d)object0).F(s);
                return object2;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        l0.b0 = x1;
        l0.c0 = null;
        l0.d0 = z;
        l0.g0 = 2;
        object0 = F.N(c1, ((t9.a)object0), l0);
        if(object0 == object1) {
            return object1;
        }
        x0 = x1;
    label_46:
        if(((Boolean)object0).booleanValue()) {
            return object2;
        }
        x0.getClass();
        pb.f f0 = (pb.f)x0.o0.a(x.p0[0], x0);
        c c2 = x0.d0;
        if(f0 != null) {
            l0.b0 = null;
            l0.g0 = 3;
            return x0.m0.a(l0, c2, f0, z) == object1 ? object1 : object2;
        }
        String s1 = x0.e0.j0;
        R2.f.u(x0.Z, s9.a.h0, z);
        l0.b0 = s1;
        l0.g0 = 4;
        Object object3 = c2.e(l0);
        if(object3 == object1) {
            return object1;
        }
        object0 = object3;
        s = s1;
        ((d)object0).F(s);
        return object2;
    }

    public final Object p(c c0, String s, String s1, Fb.c c1) {
        Object object2;
        String s3;
        String s2;
        m m0;
        boolean z = true;
        if(c1 instanceof m) {
            m0 = (m)c1;
            int v = m0.f0;
            if((v & 0x80000000) == 0) {
                m0 = new m(this, c1);
            }
            else {
                m0.f0 = v ^ 0x80000000;
            }
        }
        else {
            m0 = new m(this, c1);
        }
        Object object0 = m0.d0;
        Object object1 = Eb.a.X;
        switch(m0.f0) {
            case 0: {
                f.b0(object0);
                s2 = s;
                m0.b0 = s2;
                s3 = s1;
                m0.c0 = s3;
                m0.f0 = 1;
                object2 = c0.e(m0);
                if(object2 == object1) {
                    return object1;
                }
                goto label_28;
            }
            case 1: {
                s3 = m0.c0;
                String s4 = m0.b0;
                f.b0(object0);
                object2 = object0;
                s2 = s4;
            label_28:
                String s5 = r1.d(0x7F120388, new Object[]{s2});  // string:reverse_confirmation_title "Reverse %s?"
                String s6 = r1.d(0x7F120387, new Object[]{s2, s3});  // string:reverse_confirmation_message "This will reverse %s from %s to you"
                String s7 = r1.d(0x7F1201B1, new Object[0]);  // string:go_back "Go back"
                String s8 = r1.d(0x7F1200E0, new Object[0]);  // string:confirm "Confirm"
                m0.b0 = null;
                m0.c0 = null;
                m0.f0 = 2;
                object0 = Pb.a.O(((d)object2), s5, s6, s8, s7, false, null, null, m0, 488);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 2: {
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((Integer)object0) == null || ((int)(((Integer)object0))) != -1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final void q() {
        k k0 = (k)((B0)this.f0.X).getValue();
        Map map0 = b.t("reason", (k0 == null || (k0.g == null || !k0.g.e) ? "transfer ineligible for reversal" : "reversal window closed"));
        this.Z.d("show reversal unavailable modal", map0);
        Boolean boolean0 = Boolean.TRUE;
        this.i0.getClass();
        this.i0.l(null, boolean0);
    }
}

