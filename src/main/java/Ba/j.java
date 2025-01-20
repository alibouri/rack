package Ba;

import Aa.N;
import Ab.t;
import B.B;
import B.k;
import B.q0;
import B.r0;
import B.r;
import B.y;
import B.z;
import C.E;
import D0.K;
import F0.h;
import F0.i;
import Ha.n;
import I2.J;
import J2.w;
import N.Q;
import N.R1;
import N.T;
import N.a0;
import N.k0;
import N.m2;
import O0.O;
import P.g;
import R9.g3;
import R9.w2;
import U.Z;
import U.d;
import U.g0;
import U.p;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.Modifier;
import com.sendwave.backend.fragment.IdPhotoStatusFragment;
import com.sendwave.backend.type.PartnerOrg;
import com.sendwave.models.CurrencyAmount;
import g0.b;
import g0.e;
import g0.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import la.l;
import n0.M;
import n0.v;
import q9.M0;

public final class j implements Function3 {
    public final int X;
    public final Object Y;
    public final Object Z;
    public final Object b0;
    public final Object c0;

    public j(PartnerOrg partnerOrg0, PartnerOrg partnerOrg1, Function0 function00, Function0 function01) {
        this.X = 2;
        super();
        this.c0 = partnerOrg0;
        this.Z = partnerOrg1;
        this.Y = function00;
        this.b0 = function01;
    }

    public j(Object object0, Object object1, Object object2, Object object3, int v) {
        this.X = v;
        this.c0 = object0;
        this.Y = object1;
        this.b0 = object2;
        this.Z = object3;
        super();
    }

    public j(Object object0, Function0 function00, Function1 function10, Function0 function01, int v) {
        this.X = v;
        this.c0 = object0;
        this.Y = function00;
        this.Z = function10;
        this.b0 = function01;
        super();
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        l l4;
        e e0 = b.m;
        Z z0 = U.l.a;
        g0.l l0 = g0.l.X;
        Object object3 = t.a;
        Object object4 = this.Y;
        Object object5 = this.b0;
        Object object6 = this.Z;
        Object object7 = this.c0;
        switch(this.X) {
            case 0: {
                int v3 = ((Number)object2).intValue();
                Nb.j.f(((q0)object0), "it");
                if((v3 & 17) == 16 && ((p)object1).x()) {
                    ((p)object1).K();
                    return object3;
                }
                Modifier modifier3 = a.l(l0, 16.0f, 0.0f, 2);
                B b1 = z.a(k.c, e0, ((p)object1), 0);
                int v4 = ((p)object1).P;
                g0 g01 = ((p)object1).m();
                Modifier modifier4 = g0.a.d(((p)object1), modifier3);
                F0.k.a.getClass();
                i i1 = F0.j.b;
                ((p)object1).U();
                if(((p)object1).O) {
                    ((p)object1).l(i1);
                }
                else {
                    ((p)object1).d0();
                }
                h h1 = F0.j.f;
                d.K(((p)object1), b1, h1);
                h h2 = F0.j.e;
                d.K(((p)object1), g01, h2);
                h h3 = F0.j.g;
                if(((p)object1).O || !Nb.j.a(((p)object1).G(), v4)) {
                    m5.b.F(v4, ((p)object1), v4, h3);
                }
                h h4 = F0.j.d;
                d.K(((p)object1), modifier4, h4);
                B.e.b(((p)object1), c.e(l0, 16.0f));
                String s1 = w.S(0x7F120398, ((p)object1));  // string:savings_wallet "Vault"
                Modifier modifier5 = c.d(l0, 1.0f);
                long v5 = ((v)((p)object1).k(a0.a)).a;
                k0 k01 = R1.b(v.b(((Number)((p)object1).k(N.Z.a)).floatValue(), v5), 0L, 0L, 0L, ((p)object1), 0x1FFFFD);
                ((p)object1).Q(-264804011);
                Object object9 = ((p)object1).G();
                if(object9 == z0) {
                    object9 = new Aa.p(1);
                    ((p)object1).a0(object9);
                }
                ((p)object1).p(false);
                N4.j.f(s1, ((Function1)object9), modifier5, false, false, null, Ba.c.a, null, null, null, false, null, null, null, false, 0, null, null, k01, 0.0f, null, ((p)object1), 0x180DB0, 0, 0, 0x1BFFB0);
                B.e.b(((p)object1), c.e(l0, 24.0f));
                P4.c.a(((Ba.k)object7).d, ((Ba.k)object7).h, ((Ba.k)object7).i, ((Function1)object6), ((p)object1), 6);
                ((p)object1).Q(0xF037AA3D);
                g3 g30 = ((Ba.k)object7).k;
                if(g30 != null) {
                    m2.b(w2.b(g30, ((p)object1)), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, O.a(((db.a)((p)object1).k(db.b.d)).d, yc.d.h(0x7F060018, ((p)object1)), 0L, null, null, 0L, null, 0L, null, null, 0xFFFFFE), ((p)object1), 0, 0, 0xFFFE);  // color:Gray500
                }
                ((p)object1).p(false);
                B.e.b(((p)object1), A3.e.D(l0, 1.0f));
                Modifier modifier6 = a.l(c.d(l0, 1.0f), 0.0f, 10.0f, 1);
                K k0 = r.e(b.e, false);
                int v6 = ((p)object1).P;
                g0 g02 = ((p)object1).m();
                Modifier modifier7 = g0.a.d(((p)object1), modifier6);
                ((p)object1).U();
                if(((p)object1).O) {
                    ((p)object1).l(i1);
                }
                else {
                    ((p)object1).d0();
                }
                d.K(((p)object1), k0, h1);
                d.K(((p)object1), g02, h2);
                if(((p)object1).O || !Nb.j.a(((p)object1).G(), v6)) {
                    m5.b.F(v6, ((p)object1), v6, h3);
                }
                d.K(((p)object1), modifier7, h4);
                m2.b(w.S(0x7F1202C5, ((p)object1)), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, O.a(((db.a)((p)object1).k(db.b.d)).f, yc.d.h(0x7F060042, ((p)object1)), 0L, null, null, 0L, null, 0L, null, null, 0xFFFFFE), ((p)object1), 0, 0, 0xFFFE);  // string:no_fees_savings "No fees on deposit or withdrawal!"
                ((p)object1).p(true);
                M6.b.j(((Function0)object5), null, ((Ba.k)object7).l, false, Ba.c.b, ((p)object1), 0x6000, 10);
                B.e.b(((p)object1), c.e(l0, 16.0f));
                ((p)object1).p(true);
                if(((Ba.k)object7).a) {
                    ((p)object1).Q(0x7FD5B765);
                    boolean z1 = ((p)object1).f(((Function0)object4));
                    Object object10 = ((p)object1).G();
                    if(z1 || object10 == z0) {
                        object10 = new N(((Function0)object4), 3);
                        ((p)object1).a0(object10);
                    }
                    ((p)object1).p(false);
                    P4.c.i(((Function0)object10), ((p)object1), 0);
                }
                return object3;
            }
            case 1: {
                int v7 = ((Number)object2).intValue();
                Nb.j.f(((q0)object0), "it");
                if((v7 & 17) == 16 && ((p)object1).x()) {
                    ((p)object1).K();
                    return object3;
                }
                Modifier modifier8 = a.l(l0, 16.0f, 0.0f, 2);
                B b2 = z.a(k.c, e0, ((p)object1), 0);
                int v8 = ((p)object1).P;
                g0 g03 = ((p)object1).m();
                Modifier modifier9 = g0.a.d(((p)object1), modifier8);
                F0.k.a.getClass();
                i i2 = F0.j.b;
                ((p)object1).U();
                if(((p)object1).O) {
                    ((p)object1).l(i2);
                }
                else {
                    ((p)object1).d0();
                }
                h h5 = F0.j.f;
                d.K(((p)object1), b2, h5);
                h h6 = F0.j.e;
                d.K(((p)object1), g03, h6);
                h h7 = F0.j.g;
                if(((p)object1).O || !Nb.j.a(((p)object1).G(), v8)) {
                    m5.b.F(v8, ((p)object1), v8, h7);
                }
                h h8 = F0.j.d;
                d.K(((p)object1), modifier9, h8);
                B.e.b(((p)object1), c.e(l0, 16.0f));
                String s2 = w.S(0x7F120267, ((p)object1));  // string:main_wave_account "Main Wave account"
                Modifier modifier10 = c.d(l0, 1.0f);
                long v9 = ((v)((p)object1).k(a0.a)).a;
                k0 k02 = R1.b(v.b(((Number)((p)object1).k(N.Z.a)).floatValue(), v9), 0L, 0L, 0L, ((p)object1), 0x1FFFFD);
                ((p)object1).Q(0x70654374);
                Object object11 = ((p)object1).G();
                if(object11 == z0) {
                    object11 = new Aa.p(4);
                    ((p)object1).a0(object11);
                }
                ((p)object1).p(false);
                N4.j.f(s2, ((Function1)object11), modifier10, false, false, null, Da.c.a, null, null, null, false, null, null, null, false, 0, null, null, k02, 0.0f, null, ((p)object1), 0x180DB0, 0, 0, 0x1BFFB0);
                B.e.b(((p)object1), c.e(l0, 24.0f));
                P4.c.a(((Da.i)object7).c, ((Da.i)object7).e, ((Da.i)object7).f, ((Function1)object6), ((p)object1), 6);
                ((p)object1).Q(1885701320);
                if(((Da.i)object7).f == null) {
                    CurrencyAmount currencyAmount0 = ((Da.i)object7).d;
                    if(currencyAmount0 != null) {
                        m2.b(w.T(0x7F120395, new Object[]{M0.a(currencyAmount0)}, ((p)object1)), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, O.a(((db.a)((p)object1).k(db.b.d)).d, yc.d.h(0x7F060018, ((p)object1)), 0L, null, null, 0L, null, 0L, null, null, 0xFFFFFE), ((p)object1), 0, 0, 0xFFFE);  // string:savings_balance_x "Vault balance: %s"
                    }
                }
                ((p)object1).p(false);
                B.e.b(((p)object1), A3.e.D(l0, 1.0f));
                Modifier modifier11 = a.l(c.d(l0, 1.0f), 0.0f, 10.0f, 1);
                K k1 = r.e(b.e, false);
                int v10 = ((p)object1).P;
                g0 g04 = ((p)object1).m();
                Modifier modifier12 = g0.a.d(((p)object1), modifier11);
                ((p)object1).U();
                if(((p)object1).O) {
                    ((p)object1).l(i2);
                }
                else {
                    ((p)object1).d0();
                }
                d.K(((p)object1), k1, h5);
                d.K(((p)object1), g04, h6);
                if(((p)object1).O || !Nb.j.a(((p)object1).G(), v10)) {
                    m5.b.F(v10, ((p)object1), v10, h7);
                }
                d.K(((p)object1), modifier12, h8);
                m2.b(w.S(0x7F1202C5, ((p)object1)), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, O.a(((db.a)((p)object1).k(db.b.d)).f, yc.d.h(0x7F060042, ((p)object1)), 0L, null, null, 0L, null, 0L, null, null, 0xFFFFFE), ((p)object1), 0, 0, 0xFFFE);  // string:no_fees_savings "No fees on deposit or withdrawal!"
                ((p)object1).p(true);
                M6.b.j(((Function0)object5), null, ((Da.i)object7).g, false, Da.c.b, ((p)object1), 0x6000, 10);
                B.e.b(((p)object1), c.e(l0, 16.0f));
                ((p)object1).p(true);
                if(((Da.i)object7).a) {
                    ((p)object1).Q(-1370562268);
                    boolean z2 = ((p)object1).f(((Function0)object4));
                    Object object12 = ((p)object1).G();
                    if(z2 || object12 == z0) {
                        object12 = new N(((Function0)object4), 6);
                        ((p)object1).a0(object12);
                    }
                    ((p)object1).p(false);
                    P4.c.i(((Function0)object12), ((p)object1), 0);
                }
                return object3;
            }
            case 2: {
                int v11 = ((Number)object2).intValue();
                Nb.j.f(((q0)object0), "paddingValues");
                if((6 & v11) == 0) {
                    v11 |= (((p)object1).f(((q0)object0)) ? 4 : 2);
                }
                if((v11 & 19) == 18 && ((p)object1).x()) {
                    ((p)object1).K();
                    return object3;
                }
                g0.l l1 = g0.l.X;
                Modifier modifier13 = a.j(a.i(c.c(l1, 1.0f), ((q0)object0)), 16.0f);
                B b3 = z.a(k.c, b.n, ((p)object1), 0x30);
                int v12 = ((p)object1).P;
                g0 g05 = ((p)object1).m();
                Modifier modifier14 = g0.a.d(((p)object1), modifier13);
                F0.k.a.getClass();
                i i3 = F0.j.b;
                ((p)object1).U();
                if(((p)object1).O) {
                    ((p)object1).l(i3);
                }
                else {
                    ((p)object1).d0();
                }
                d.K(((p)object1), b3, F0.j.f);
                d.K(((p)object1), g05, F0.j.e);
                h h9 = F0.j.g;
                if(((p)object1).O || !Nb.j.a(((p)object1).G(), v12)) {
                    m5.b.F(v12, ((p)object1), v12, h9);
                }
                d.K(((p)object1), modifier14, F0.j.d);
                B.e.b(((p)object1), c.e(l1, 8.0f));
                M6.b.d(yc.l.y(0x7F0802B2, ((p)object1), 0), null, c.e(l1, 72.0f), null, null, 0.0f, null, ((p)object1), 0x1B0, 120);  // drawable:ic_wave_penguin
                String s3 = w.S(0x7F12041C, ((p)object1));  // string:terms_changed "Our Terms & Conditions have changed. To continue using Wave, 
                                                            // please read and accept the new Terms & Conditions."
                O o0 = ((db.a)((p)object1).k(db.b.d)).h;
                m2.b(s3, a.n(l1, 0.0f, 48.0f, 0.0f, 0.0f, 13), 0L, 0L, null, null, null, 0L, null, new Z0.i(3), 0L, 0, false, 0, 0, null, o0, ((p)object1), 0x30, 0, 0xFDFC);
                B.e.b(((p)object1), A3.e.D(l1, 1.0f));
                hb.h.n(((PartnerOrg)object7), ((PartnerOrg)object6), ((Function0)object4), ((p)object1), 0);
                B.e.b(((p)object1), c.e(l1, 16.0f));
                M6.b.j(((Function0)object5), null, false, false, Ja.c.b, ((p)object1), 0x6000, 14);
                ((p)object1).p(true);
                return object3;
            }
            case 3: {
                int v13 = ((Number)object2).intValue();
                Nb.j.f(((y)object0), "$this$BoxWithConstraints");
                if((6 & v13) == 0) {
                    v13 |= (((p)object1).f(((y)object0)) ? 4 : 2);
                }
                if((v13 & 19) == 18 && ((p)object1).x()) {
                    ((p)object1).K();
                    return object3;
                }
                Modifier modifier15 = androidx.compose.foundation.a.b(c.d(l0, 1.0f), yc.d.h(0x7F060013, ((p)object1)), M.a);  // color:Gray100
                f f0 = b.k;
                r0 r00 = new r0(8.0f, 0.0f, 8.0f, 0.0f);
                B.h h10 = new B.h(8.0f);
                ((p)object1).Q(0x5D8FAE2D);
                boolean z3 = ((p)object1).f(((X9.j)object5));
                boolean z4 = ((p)object1).h(((C3.i)object6));
                Object object13 = ((p)object1).G();
                if((z3 | z4 | ((v13 & 14) == 4 ? 1 : 0)) != 0 || object13 == z0) {
                    object13 = new n(((X9.j)object5), ((C3.i)object6), ((y)object0), 2);
                    ((p)object1).a0(object13);
                }
                ((p)object1).p(false);
                J.d(modifier15, ((E)object7), r00, false, h10, f0, ((aa.i)object4), false, ((Function1)object13), ((p)object1), 0x36180, 0x88);
                return object3;
            }
            case 4: {
                int v14 = ((Number)object2).intValue();
                Nb.j.f(((q0)object0), "paddingValues");
                if((v14 & 6) == 0) {
                    v14 |= (((p)object1).f(((q0)object0)) ? 4 : 2);
                }
                if((v14 & 19) == 18 && ((p)object1).x()) {
                    ((p)object1).K();
                    return object3;
                }
                la.k k2 = ((la.d)object7).a;
                l l2 = l.Z;
                l l3 = ((la.d)object7).b;
                P.n n0 = W4.f.K(l3 == l2, ((Function0)object4), ((p)object1), 0);
                Modifier modifier16 = U5.a.J(c.c(l0, 1.0f), n0, l3 == l.b0);
                K k3 = r.e(b.a, false);
                int v15 = ((p)object1).P;
                g0 g06 = ((p)object1).m();
                Modifier modifier17 = g0.a.d(((p)object1), modifier16);
                F0.k.a.getClass();
                i i4 = F0.j.b;
                ((p)object1).U();
                if(((p)object1).O) {
                    ((p)object1).l(i4);
                }
                else {
                    ((p)object1).d0();
                }
                h h11 = F0.j.f;
                d.K(((p)object1), k3, h11);
                h h12 = F0.j.e;
                d.K(((p)object1), g06, h12);
                h h13 = F0.j.g;
                if(((p)object1).O) {
                    l4 = l2;
                    m5.b.F(v15, ((p)object1), v15, h13);
                }
                else {
                    l4 = l2;
                    if(!Nb.j.a(((p)object1).G(), v15)) {
                        m5.b.F(v15, ((p)object1), v15, h13);
                    }
                }
                h h14 = F0.j.d;
                d.K(((p)object1), modifier17, h14);
                Modifier modifier18 = a.i(N4.h.P(c.c(l0, 1.0f), N4.h.H(((p)object1))), ((q0)object0));
                androidx.compose.foundation.layout.b b4 = androidx.compose.foundation.layout.b.a;
                B b5 = z.a(k.c, b.n, ((p)object1), 0x30);
                int v16 = ((p)object1).P;
                g0 g07 = ((p)object1).m();
                Modifier modifier19 = g0.a.d(((p)object1), modifier18);
                ((p)object1).U();
                if(((p)object1).O) {
                    ((p)object1).l(i4);
                }
                else {
                    ((p)object1).d0();
                }
                d.K(((p)object1), b5, h11);
                d.K(((p)object1), g07, h12);
                if(((p)object1).O || !Nb.j.a(((p)object1).G(), v16)) {
                    m5.b.F(v16, ((p)object1), v16, h13);
                }
                d.K(((p)object1), modifier19, h14);
                ((p)object1).Q(2024226061);
                if(!k2.a.isEmpty()) {
                    android.support.v4.media.session.a.e(k2.a, ((p)object1), 0);
                }
                ((p)object1).p(false);
                if(((la.d)object7).c) {
                    ((p)object1).Q(0x9C430523);
                    String s4 = w.S(0x7F120169, ((p)object1));  // string:error_general_offline_message "You are currently offline"
                    String s5 = w.S(0x7F120022, ((p)object1));  // string:account_limits_may_be_out_of_date "Account limits may be out of date. Connect 
                                                                // to internet to view account limit status."
                    Pb.a.k(0x180, ((p)object1), a.j(l0, 16.0f), s4, s5);
                }
                else {
                    IdPhotoStatusFragment idPhotoStatusFragment0 = k2.b;
                    if(idPhotoStatusFragment0 == null) {
                        ((p)object1).Q(-1672704320);
                        android.support.v4.media.session.a.j(0, 1, ((p)object1), null);
                    }
                    else {
                        ((p)object1).Q(0x9C488D92);
                        android.support.v4.media.session.a.n(idPhotoStatusFragment0, ((Function0)object5), ((String)object6), ((p)object1), 6);
                    }
                }
                ((p)object1).p(false);
                ((p)object1).p(true);
                g.a(l3 == l4, n0, b4.a(l0, b.b), 0L, ((Q)((p)object1).k(T.a)).e(), true, ((p)object1), 0x30040, 8);
                ((p)object1).p(true);
                return object3;
            }
            case 5: {
                int v17 = ((Number)object2).intValue();
                Nb.j.f(((q0)object0), "it");
                if((v17 & 17) == 16 && ((p)object1).x()) {
                    ((p)object1).K();
                    return object3;
                }
                Modifier modifier20 = a.l(l0, 16.0f, 0.0f, 2);
                B b6 = z.a(k.c, e0, ((p)object1), 0);
                int v18 = ((p)object1).P;
                g0 g08 = ((p)object1).m();
                Modifier modifier21 = g0.a.d(((p)object1), modifier20);
                F0.k.a.getClass();
                i i5 = F0.j.b;
                ((p)object1).U();
                if(((p)object1).O) {
                    ((p)object1).l(i5);
                }
                else {
                    ((p)object1).d0();
                }
                d.K(((p)object1), b6, F0.j.f);
                d.K(((p)object1), g08, F0.j.e);
                h h15 = F0.j.g;
                if(((p)object1).O || !Nb.j.a(((p)object1).G(), v18)) {
                    m5.b.F(v18, ((p)object1), v18, h15);
                }
                d.K(((p)object1), modifier21, F0.j.d);
                B.e.b(((p)object1), c.e(l0, 16.0f));
                String s6 = w.S(0x7F120354, ((p)object1));  // string:prepaid_card "Prepaid Card"
                Modifier modifier22 = c.d(l0, 1.0f);
                long v19 = ((v)((p)object1).k(a0.a)).a;
                k0 k03 = R1.b(v.b(((Number)((p)object1).k(N.Z.a)).floatValue(), v19), 0L, 0L, 0L, ((p)object1), 0x1FFFFD);
                ((p)object1).Q(0x8F638F81);
                Object object14 = ((p)object1).G();
                if(object14 == z0) {
                    object14 = new lb.j(16);
                    ((p)object1).a0(object14);
                }
                ((p)object1).p(false);
                N4.j.f(s6, ((Function1)object14), modifier22, false, false, null, sa.c.a, null, null, null, false, null, null, null, false, 0, null, null, k03, 0.0f, null, ((p)object1), 0x180DB0, 0, 0, 0x1BFFB0);
                B.e.b(((p)object1), c.e(l0, 24.0f));
                P4.c.a(((sa.i)object7).b, ((sa.i)object7).e, ((sa.i)object7).f, ((Function1)object6), ((p)object1), 6);
                ((p)object1).Q(0x8F63D005);
                g3 g31 = ((sa.i)object7).g;
                if(g31 != null) {
                    m2.b(w2.b(g31, ((p)object1)), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, O.a(((db.a)((p)object1).k(db.b.d)).d, yc.d.h(0x7F060018, ((p)object1)), 0L, null, null, 0L, null, 0L, null, null, 0xFFFFFE), ((p)object1), 0, 0, 0xFFFE);  // color:Gray500
                }
                ((p)object1).p(false);
                B.e.b(((p)object1), A3.e.D(l0, 1.0f));
                M6.b.j(((Function0)object5), null, ((sa.i)object7).h, false, sa.c.b, ((p)object1), 0x6000, 10);
                B.e.b(((p)object1), c.e(l0, 16.0f));
                ((p)object1).p(true);
                if(((sa.i)object7).a) {
                    P4.c.i(((Function0)object4), ((p)object1), 0);
                }
                return object3;
            }
            default: {
                int v = ((Number)object2).intValue();
                Nb.j.f(((q0)object0), "it");
                if((v & 17) == 16 && ((p)object1).x()) {
                    ((p)object1).K();
                    return object3;
                }
                Modifier modifier0 = a.l(l0, 16.0f, 0.0f, 2);
                B b0 = z.a(k.c, e0, ((p)object1), 0);
                int v1 = ((p)object1).P;
                g0 g00 = ((p)object1).m();
                Modifier modifier1 = g0.a.d(((p)object1), modifier0);
                F0.k.a.getClass();
                i i0 = F0.j.b;
                ((p)object1).U();
                if(((p)object1).O) {
                    ((p)object1).l(i0);
                }
                else {
                    ((p)object1).d0();
                }
                d.K(((p)object1), b0, F0.j.f);
                d.K(((p)object1), g00, F0.j.e);
                h h0 = F0.j.g;
                if(((p)object1).O || !Nb.j.a(((p)object1).G(), v1)) {
                    m5.b.F(v1, ((p)object1), v1, h0);
                }
                d.K(((p)object1), modifier1, F0.j.d);
                B.e.b(((p)object1), c.e(l0, 16.0f));
                String s = w.S(0x7F120267, ((p)object1));  // string:main_wave_account "Main Wave account"
                Modifier modifier2 = c.d(l0, 1.0f);
                long v2 = ((v)((p)object1).k(a0.a)).a;
                k0 k00 = R1.b(v.b(((Number)((p)object1).k(N.Z.a)).floatValue(), v2), 0L, 0L, 0L, ((p)object1), 0x1FFFFD);
                ((p)object1).Q(0xAFCCC62);
                Object object8 = ((p)object1).G();
                if(object8 == z0) {
                    object8 = new lb.j(18);
                    ((p)object1).a0(object8);
                }
                ((p)object1).p(false);
                N4.j.f(s, ((Function1)object8), modifier2, false, false, null, ua.c.a, null, null, null, false, null, null, null, false, 0, null, null, k00, 0.0f, null, ((p)object1), 0x180DB0, 0, 0, 0x1BFFB0);
                B.e.b(((p)object1), c.e(l0, 24.0f));
                P4.c.a(((ua.h)object7).b, ((ua.h)object7).d, ((ua.h)object7).e, ((Function1)object6), ((p)object1), 6);
                B.e.b(((p)object1), A3.e.D(l0, 1.0f));
                M6.b.j(((Function0)object5), null, ((ua.h)object7).f, false, ua.c.b, ((p)object1), 0x6000, 10);
                B.e.b(((p)object1), c.e(l0, 16.0f));
                ((p)object1).p(true);
                if(((ua.h)object7).a) {
                    P4.c.i(((Function0)object4), ((p)object1), 0);
                }
                return object3;
            }
        }
    }
}

