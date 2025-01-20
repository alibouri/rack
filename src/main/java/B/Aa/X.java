package Aa;

import Ab.t;
import B.B;
import B.F0;
import B.k;
import B.v0;
import B.x0;
import B.z0;
import B.z;
import Ca.g;
import E9.a;
import Ea.X;
import K9.t0;
import N.K0;
import N.m2;
import N4.o;
import N9.n;
import Nb.j;
import O0.O;
import R.E;
import R.J0;
import T0.w;
import U.N0;
import U.g0;
import U.p;
import Xb.G;
import Z0.i;
import a9.f2;
import ac.h;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import com.sendwave.backend.fragment.KycLimitFragment;
import com.sendwave.models.CurrencyAmount;
import com.wave.customer.deviceapproval.DeviceApprovalRequiredActivity;
import com.wave.customer.nearbyagents.NearbyAgentsActivity;
import com.wave.customer.paymentcards.PaymentCardsActivity;
import com.wave.customer.paymentcards.recharge.RechargeCardActivity;
import com.wave.customer.paymentcards.settings.PaymentCardSettingsActivity;
import com.wave.customer.paymentcards.transferout.TransferOutOfCardActivity;
import com.wave.customer.receipts.ReceiptActivity;
import com.wave.customer.savings.SavingsActivity;
import com.wave.customer.savings.lock.LockVaultActivity;
import com.wave.customer.settings.SettingsActivity;
import com.wave.customer.transactions.ui.TransactionsActivity;
import com.wave.paybillinvoice.detail.PayBillInvoiceDetailActivity;
import com.wave.paybillinvoice.list.PayBillInvoiceListActivity;
import com.wave.voip.VoipCallActivity;
import g0.b;
import g0.e;
import g0.f;
import g0.l;
import java.util.List;
import java.util.Locale;
import kb.C;
import kotlin.jvm.functions.Function2;
import lb.r;
import n0.v;
import q8.c;
import q9.M0;
import q9.r1;
import u9.u;
import yc.d;

public final class x implements Function2 {
    public final int X;
    public final Object Y;

    public x(int v, Object object0) {
        this.X = v;
        this.Y = object0;
        super();
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        c c0 = u.a;
        e e0 = b.m;
        z0 z00 = z0.a;
        f f0 = b.j;
        l l0 = l.X;
        Object object2 = t.a;
        Object object3 = this.Y;
        switch(this.X) {
            case 0: {
                j.f(((h)object0), "tooltipsFlow");
                j.f(((G)object1), "scope");
                u u0 = c0.b(((SavingsActivity)object3));
                a a0 = r1.b(((SavingsActivity)object3)).e();
                return new n(N9.a.Z, ((h)object0), u0, a0, ((G)object1));
            }
            case 1: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                androidx.compose.animation.a.b(((Boolean)((N0)object3).getValue()).booleanValue(), null, u.x.a(null, 3), u.x.b(null, 3), null, Aa.j.a, ((p)object0), 200064);
                return object2;
            }
            case 2: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                a.a.g(c0.c.c(0xDE4F50E7, new g(((LockVaultActivity)object3)), ((p)object0)), ((p)object0), 6);
                return object2;
            }
            case 3: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                m2.c(Pb.a.S(((X)object3).a), null, ((X)object3).d, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, ((p)object0), 0, 0, 0x3FFFA);
                return object2;
            }
            case 4: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                O0.f f1 = ((CurrencyAmount)object3) == null ? new O0.f(6, "-", null) : q9.N0.b(((CurrencyAmount)object3));
                O o0 = db.b.a(((db.a)((p)object0).k(db.b.d)).u, ((p)object0));
                m2.c(f1, null, d.h(0x7F06004C, ((p)object0)), 0L, null, null, null, 0L, null, new i(3), 0L, 0, false, 0, 0, null, null, o0, ((p)object0), 0, 0, 0x1FDFA);  // color:WaveBlue900
                return object2;
            }
            case 5: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                a.a.g(c0.c.c(-2070424868, new Ha.g(((SettingsActivity)object3)), ((p)object0)), ((p)object0), 6);
                return object2;
            }
            case 6: {
                j.f(((h)object0), "tooltipsFlow");
                j.f(((G)object1), "scope");
                u u1 = c0.b(((t0)object3));
                a a1 = r1.b(((t0)object3)).e();
                return new n(N9.a.Y, ((h)object0), u1, a1, ((G)object1));
            }
            case 7: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                int v = Vb.j.f0(((N9.d)object3).c).size();
                e e1 = b.n;
                String s = ((N9.d)object3).c;
                if(v > 1) {
                    ((p)object0).Q(0x2D61FED0);
                    Object object4 = Bb.p.p0(Vb.j.f0(s));
                    String s1 = Bb.p.v0(Bb.p.l0(Vb.j.f0(s), 1), "\n", null, null, null, 62);
                    B b0 = z.a(k.c, e1, ((p)object0), 0x30);
                    int v1 = ((p)object0).P;
                    g0 g00 = ((p)object0).m();
                    Modifier modifier0 = g0.a.d(((p)object0), l0);
                    F0.k.a.getClass();
                    F0.i i0 = F0.j.b;
                    ((p)object0).U();
                    if(((p)object0).O) {
                        ((p)object0).l(i0);
                    }
                    else {
                        ((p)object0).d0();
                    }
                    U.d.K(((p)object0), b0, F0.j.f);
                    U.d.K(((p)object0), g00, F0.j.e);
                    F0.h h0 = F0.j.g;
                    if(((p)object0).O || !j.a(((p)object0).G(), v1)) {
                        m5.b.F(v1, ((p)object0), v1, h0);
                    }
                    U.d.K(((p)object0), modifier0, F0.j.d);
                    O o1 = O.a(((db.a)((p)object0).k(db.b.d)).l, v.e, 0L, null, null, 0L, null, 0L, null, null, 0xFFFFFE);
                    m2.b(((String)object4), null, 0L, 0L, null, null, null, 0L, null, new i(3), 0L, 0, false, 0, 0, null, o1, ((p)object0), 0, 0, 0xFDFE);
                    O o2 = O.a(((db.a)((p)object0).k(db.b.d)).h, v.e, 0L, null, null, 0L, null, 0L, null, null, 0xFFFFFE);
                    m2.b(s1, null, 0L, 0L, null, null, null, 0L, null, new i(3), 0L, 0, false, 0, 0, null, o2, ((p)object0), 0, 0, 0xFDFE);
                    ((p)object0).p(true);
                    ((p)object0).p(false);
                    return object2;
                }
                ((p)object0).Q(762130900);
                Modifier modifier1 = androidx.compose.foundation.layout.c.o(l0, 0.0f, 100.0f);
                B b1 = z.a(k.c, e1, ((p)object0), 0x30);
                int v2 = ((p)object0).P;
                g0 g01 = ((p)object0).m();
                Modifier modifier2 = g0.a.d(((p)object0), modifier1);
                F0.k.a.getClass();
                F0.i i1 = F0.j.b;
                ((p)object0).U();
                if(((p)object0).O) {
                    ((p)object0).l(i1);
                }
                else {
                    ((p)object0).d0();
                }
                U.d.K(((p)object0), b1, F0.j.f);
                U.d.K(((p)object0), g01, F0.j.e);
                F0.h h1 = F0.j.g;
                if(((p)object0).O || !j.a(((p)object0).G(), v2)) {
                    m5.b.F(v2, ((p)object0), v2, h1);
                }
                U.d.K(((p)object0), modifier2, F0.j.d);
                O o3 = O.a(((db.a)((p)object0).k(db.b.d)).h, v.e, 0L, null, null, 0L, null, 0L, null, null, 0xFFFFFE);
                i i2 = new i(3);
                m2.b(s, null, 0L, 0L, null, w.m0, null, 0L, null, i2, 0L, 0, false, 0, 0, null, o3, ((p)object0), 0x30000, 0, 0xFDDE);
                ((p)object0).p(true);
                ((p)object0).p(false);
                return object2;
            }
            case 8: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                a.a.g(c0.c.c(0x112D9265, new Qa.j(((TransactionsActivity)object3)), ((p)object0)), ((p)object0), 6);
                return object2;
            }
            case 9: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                String s2 = ((Va.d)object3).a().toUpperCase(Locale.ROOT);
                j.e(s2, "toUpperCase(...)");
                w w0 = ((Va.d)object3).c() ? w.n0 : w.l0;
                m2.b(s2, null, ((Va.d)object3).b(((p)object0)), 0L, null, w0, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, ((p)object0), 0, 0, 0x1FFDA);
                return object2;
            }
            case 10: {
                ((Number)object1).intValue();
                ((p)object0).Q(0x473B23B);
                ((p)object0).p(false);
                return (F0)object3;
            }
            case 11: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                o.g(((Modifier)object3), ((p)object0), 0);
                return object2;
            }
            case 12: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                a.a.g(c0.c.c(0xA06F6746, new da.g(((DeviceApprovalRequiredActivity)object3)), ((p)object0)), ((p)object0), 6);
                return object2;
            }
            case 13: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                a.a.g(c0.c.c(222549990, new ea.d(((ea.k)object3)), ((p)object0)), ((p)object0), 6);
                return object2;
            }
            case 14: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                Modifier modifier3 = androidx.compose.foundation.layout.c.d(l0, 1.0f);
                B b2 = z.a(new B.h(20.0f), e0, ((p)object0), 6);
                int v3 = ((p)object0).P;
                g0 g02 = ((p)object0).m();
                Modifier modifier4 = g0.a.d(((p)object0), modifier3);
                F0.k.a.getClass();
                F0.i i3 = F0.j.b;
                ((p)object0).U();
                if(((p)object0).O) {
                    ((p)object0).l(i3);
                }
                else {
                    ((p)object0).d0();
                }
                U.d.K(((p)object0), b2, F0.j.f);
                U.d.K(((p)object0), g02, F0.j.e);
                F0.h h2 = F0.j.g;
                if(((p)object0).O || !j.a(((p)object0).G(), v3)) {
                    m5.b.F(v3, ((p)object0), v3, h2);
                }
                U.d.K(((p)object0), modifier4, F0.j.d);
                ((p)object0).Q(-2011344349);
                for(Object object5: ((ea.f)object3).a) {
                    hb.h.l(((f2)object5), ((p)object0), 0);
                }
                ((p)object0).p(false);
                ((p)object0).p(true);
                return object2;
            }
            case 15: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                E.e(((J0)object3), null, null, ((p)object0), 6);
                return object2;
            }
            case 16: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                K0.a(((ha.n)object3).a(), null, false, null, ia.g.b, ((p)object0), 0x6000, 14);
                return object2;
            }
            case 17: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                a.a.g(c0.c.c(0xCF5D07BD, new kb.i(((PayBillInvoiceDetailActivity)object3)), ((p)object0)), ((p)object0), 6);
                return object2;
            }
            case 18: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                B b3 = z.a(new B.h(20.0f), e0, ((p)object0), 6);
                int v4 = ((p)object0).P;
                g0 g03 = ((p)object0).m();
                Modifier modifier5 = g0.a.d(((p)object0), l0);
                F0.k.a.getClass();
                F0.i i4 = F0.j.b;
                ((p)object0).U();
                if(((p)object0).O) {
                    ((p)object0).l(i4);
                }
                else {
                    ((p)object0).d0();
                }
                U.d.K(((p)object0), b3, F0.j.f);
                U.d.K(((p)object0), g03, F0.j.e);
                F0.h h3 = F0.j.g;
                if(((p)object0).O || !j.a(((p)object0).G(), v4)) {
                    m5.b.F(v4, ((p)object0), v4, h3);
                }
                U.d.K(((p)object0), modifier5, F0.j.d);
                ((p)object0).Q(-1910218475);
                Ab.k k0 = new Ab.k(J2.w.S(0x7F1201D8, ((p)object0)), ((C)object3).d);  // string:invoice_number "Invoice #"
                ((p)object0).Q(-1910229733);
                String s3 = ((C)object3).o;
                Ab.k k1 = s3 == null ? null : new Ab.k(J2.w.S(0x7F12006B, ((p)object0)), s3);  // string:bill_period "Bill period"
                ((p)object0).p(false);
                for(Object object6: Bb.n.r0(new Ab.k[]{k0, k1, new Ab.k(J2.w.S(0x7F12013A, ((p)object0)), ((C)object3).p), new Ab.k(J2.w.S(0x7F12030A, ((p)object0)), ((C)object3).n)})) {  // string:due_date "Due date"
                    String s4 = (String)((Ab.k)object6).X;
                    String s5 = (String)((Ab.k)object6).Y;
                    x0 x00 = v0.b(k.a, f0, ((p)object0), 0);
                    int v5 = ((p)object0).P;
                    g0 g04 = ((p)object0).m();
                    Modifier modifier6 = g0.a.d(((p)object0), l0);
                    F0.k.a.getClass();
                    F0.i i5 = F0.j.b;
                    ((p)object0).U();
                    if(((p)object0).O) {
                        ((p)object0).l(i5);
                    }
                    else {
                        ((p)object0).d0();
                    }
                    U.d.K(((p)object0), x00, F0.j.f);
                    U.d.K(((p)object0), g04, F0.j.e);
                    F0.h h4 = F0.j.g;
                    if(((p)object0).O || !j.a(((p)object0).G(), v5)) {
                        m5.b.F(v5, ((p)object0), v5, h4);
                    }
                    U.d.K(((p)object0), modifier6, F0.j.d);
                    m2.b(s4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jb.n.e(((p)object0)), ((p)object0), 0, 0, 0xFFFE);
                    B.e.b(((p)object0), z00.a(l0, 1.0f, true));
                    m2.b(s5, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jb.n.g(((p)object0)), ((p)object0), 0, 0, 0xFFFE);
                    ((p)object0).p(true);
                }
                ((p)object0).p(false);
                ((p)object0).p(true);
                return object2;
            }
            case 19: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                Modifier modifier7 = androidx.compose.foundation.layout.c.d(l0, 1.0f);
                B b4 = z.a(new B.h(20.0f), e0, ((p)object0), 6);
                int v6 = ((p)object0).P;
                g0 g05 = ((p)object0).m();
                Modifier modifier8 = g0.a.d(((p)object0), modifier7);
                F0.k.a.getClass();
                F0.i i6 = F0.j.b;
                ((p)object0).U();
                if(((p)object0).O) {
                    ((p)object0).l(i6);
                }
                else {
                    ((p)object0).d0();
                }
                U.d.K(((p)object0), b4, F0.j.f);
                U.d.K(((p)object0), g05, F0.j.e);
                F0.h h5 = F0.j.g;
                if(((p)object0).O || !j.a(((p)object0).G(), v6)) {
                    m5.b.F(v6, ((p)object0), v6, h5);
                }
                U.d.K(((p)object0), modifier8, F0.j.d);
                ((p)object0).Q(0x6EF2FD2F);
                for(Object object7: ((List)object3)) {
                    B.h h6 = new B.h(24.0f);
                    Modifier modifier9 = androidx.compose.foundation.layout.c.d(l0, 1.0f);
                    x0 x01 = v0.b(h6, f0, ((p)object0), 6);
                    int v7 = ((p)object0).P;
                    g0 g06 = ((p)object0).m();
                    Modifier modifier10 = g0.a.d(((p)object0), modifier9);
                    F0.k.a.getClass();
                    F0.i i7 = F0.j.b;
                    ((p)object0).U();
                    if(((p)object0).O) {
                        ((p)object0).l(i7);
                    }
                    else {
                        ((p)object0).d0();
                    }
                    U.d.K(((p)object0), x01, F0.j.f);
                    U.d.K(((p)object0), g06, F0.j.e);
                    F0.h h7 = F0.j.g;
                    if(((p)object0).O || !j.a(((p)object0).G(), v7)) {
                        m5.b.F(v7, ((p)object0), v7, h7);
                    }
                    U.d.K(((p)object0), modifier10, F0.j.d);
                    Modifier modifier11 = z00.a(l0, 1.0f, true);
                    O o4 = ((db.a)((p)object0).k(db.b.d)).h;
                    m2.b(((KycLimitFragment)object7).a, modifier11, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o4, ((p)object0), 0, 0, 0xFFFC);
                    String s6 = M0.a(((KycLimitFragment)object7).b);
                    O o5 = ((db.a)((p)object0).k(db.b.d)).h;
                    m2.b(s6, null, d.h(0x7F060019, ((p)object0)), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o5, ((p)object0), 0, 0, 0xFFFA);  // color:Gray600
                    ((p)object0).p(true);
                }
                ((p)object0).p(false);
                ((p)object0).p(true);
                return object2;
            }
            case 20: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                a.a.g(c0.c.c(0xD46B3D70, new lb.e(((PayBillInvoiceListActivity)object3)), ((p)object0)), ((p)object0), 6);
                return object2;
            }
            case 21: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                x0 x02 = v0.b(k.a, f0, ((p)object0), 0);
                int v8 = ((p)object0).P;
                g0 g07 = ((p)object0).m();
                Modifier modifier12 = g0.a.d(((p)object0), l0);
                F0.k.a.getClass();
                F0.i i8 = F0.j.b;
                ((p)object0).U();
                if(((p)object0).O) {
                    ((p)object0).l(i8);
                }
                else {
                    ((p)object0).d0();
                }
                U.d.K(((p)object0), x02, F0.j.f);
                U.d.K(((p)object0), g07, F0.j.e);
                F0.h h8 = F0.j.g;
                if(((p)object0).O || !j.a(((p)object0).G(), v8)) {
                    m5.b.F(v8, ((p)object0), v8, h8);
                }
                U.d.K(((p)object0), modifier12, F0.j.d);
                m2.b(J2.w.S(0x7F120030, ((p)object0)), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jb.n.e(((p)object0)), ((p)object0), 0, 0, 0xFFFE);  // string:advance_payment "Advance payment"
                B.e.b(((p)object0), z00.a(l0, 1.0f, true));
                CurrencyAmount currencyAmount0 = ((r)object3).d;
                m2.b((currencyAmount0 == null ? "--" : M0.a(currencyAmount0)), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jb.n.g(((p)object0)), ((p)object0), 0, 0, 0xFFFE);
                ((p)object0).p(true);
                return object2;
            }
            case 22: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                a.a.g(c0.c.c(-673629390, new pa.n(((NearbyAgentsActivity)object3)), ((p)object0)), ((p)object0), 6);
                return object2;
            }
            case 23: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                a.a.g(c0.c.c(0x8BAB7401, new pb.k(((VoipCallActivity)object3)), ((p)object0)), ((p)object0), 6);
                return object2;
            }
            case 24: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                a.a.g(c0.c.c(0x2E1B4762, new ra.g0(((PaymentCardsActivity)object3)), ((p)object0)), ((p)object0), 6);
                return object2;
            }
            case 25: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                a.a.g(c0.c.c(0xF344D7A7, new sa.h(((RechargeCardActivity)object3)), ((p)object0)), ((p)object0), 6);
                return object2;
            }
            case 26: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                a.a.g(c0.c.c(0x8C45FA33, new ta.d(((PaymentCardSettingsActivity)object3)), ((p)object0)), ((p)object0), 6);
                return object2;
            }
            case 27: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                a.a.g(c0.c.c(0xEBF0CCD3, new ua.g(((TransferOutOfCardActivity)object3)), ((p)object0)), ((p)object0), 6);
                return object2;
            }
            case 28: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                Function2 function20 = (Function2)((MutableState)object3).getValue();
                if(function20 != null) {
                    function20.j(((p)object0), 0);
                }
                return object2;
            }
            default: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                a.a.g(c0.c.c(-493122097, new va.f(((ReceiptActivity)object3)), ((p)object0)), ((p)object0), 6);
                return object2;
            }
        }
    }
}

