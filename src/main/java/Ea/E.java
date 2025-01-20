package ea;

import Ab.t;
import B.B;
import B.q0;
import B.r0;
import B.r;
import D0.K;
import F0.h;
import F0.i;
import F0.k;
import I2.J;
import N.Q;
import N.T;
import N.b1;
import N.m2;
import N.q1;
import Nb.j;
import O0.O;
import P.g;
import P.n;
import U.d;
import U.g0;
import U.p;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.Modifier;
import g0.b;
import g0.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import n0.M;
import n0.v;
import pa.s;
import pa.u;
import pa.w;
import pa.x;
import pa.y;
import pa.z;

public final class e implements Function3 {
    public final int X;
    public final Function1 Y;
    public final Function0 Z;
    public final Function0 b0;
    public final Object c0;
    public final Object d0;
    public final Object e0;

    public e(n n0, f f0, Function0 function00, q1 q10, Function0 function01, Function1 function10) {
        this.X = 0;
        super();
        this.c0 = n0;
        this.d0 = f0;
        this.Z = function00;
        this.e0 = q10;
        this.b0 = function01;
        this.Y = function10;
    }

    public e(z z0, Function1 function10, Function0 function00, Function0 function01, Function0 function02, Function0 function03) {
        this.X = 1;
        super();
        this.c0 = z0;
        this.Y = function10;
        this.Z = function00;
        this.b0 = function01;
        this.d0 = function02;
        this.e0 = function03;
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        String s3;
        if(this.X != 0) {
            int v = ((Number)object2).intValue();
            j.f(((q0)object0), "it");
            if((v & 17) == 16 && ((p)object1).x()) {
                ((p)object1).K();
                return t.a;
            }
            l l0 = l.X;
            Modifier modifier0 = a.b(c.c(l0, 1.0f), v.e, M.a);
            K k0 = r.e(b.a, false);
            int v1 = ((p)object1).P;
            g0 g00 = ((p)object1).m();
            Modifier modifier1 = g0.a.d(((p)object1), modifier0);
            k.a.getClass();
            i i0 = F0.j.b;
            ((p)object1).U();
            if(((p)object1).O) {
                ((p)object1).l(i0);
            }
            else {
                ((p)object1).d0();
            }
            d.K(((p)object1), k0, F0.j.f);
            d.K(((p)object1), g00, F0.j.e);
            h h0 = F0.j.g;
            if(((p)object1).O || !j.a(((p)object1).G(), v1)) {
                m5.b.F(v1, ((p)object1), v1, h0);
            }
            d.K(((p)object1), modifier1, F0.j.d);
            androidx.compose.foundation.layout.b b0 = androidx.compose.foundation.layout.b.a;
            z z0 = (z)this.c0;
            if(z0 instanceof pa.t) {
                ((p)object1).Q(0x3F2BED2B);
                b1.b(b0.a(l0, b.e), 0L, 0.0f, 0L, 0, ((p)object1), 0, 30);
                ((p)object1).p(false);
            }
            else {
                if(z0 instanceof s) {
                    ((p)object1).Q(0x3F2BFB53);
                    ((p)object1).Q(0x3F2BFCA8);
                    boolean z1 = ((p)object1).h(z0);
                    Function1 function10 = this.Y;
                    boolean z2 = ((p)object1).f(function10);
                    Object object3 = ((p)object1).G();
                    if((z1 | z2) != 0 || object3 == U.l.a) {
                        object3 = new Ea.r(z0, 16, function10);
                        ((p)object1).a0(object3);
                    }
                    ((p)object1).p(false);
                    J.c(null, null, null, false, null, null, null, false, ((Function1)object3), ((p)object1), 0, 0xFF);
                    ((p)object1).p(false);
                    ((p)object1).p(true);
                    return t.a;
                }
                Function0 function00 = this.Z;
                if(z0 instanceof w) {
                    ((p)object1).Q(0x3F2C1B2C);
                    Pb.a.l(0x7F0802A2, 0x7F1202C3, null, 0x7F120381, function00, ((p)object1), 0, 4);  // drawable:ic_store_48
                    ((p)object1).p(false);
                    ((p)object1).p(true);
                    return t.a;
                }
                if(z0 instanceof y) {
                    ((p)object1).Q(0x3F2C4441);
                    Pb.a.l(0x7F08024C, 0x7F1202B9, 0x7F08024A, 0x7F1201B7, this.b0, ((p)object1), 0, 0);  // drawable:ic_location_pin_48
                    ((p)object1).p(false);
                    ((p)object1).p(true);
                    return t.a;
                }
                if(z0 instanceof x) {
                    ((p)object1).Q(0x3F2C7B74);
                    Pb.a.l(0x7F08024C, 0x7F1202B9, 0x7F08024A, 0x7F1202DF, ((Function0)this.d0), ((p)object1), 0, 0);  // drawable:ic_location_pin_48
                    ((p)object1).p(false);
                    ((p)object1).p(true);
                    return t.a;
                }
                if(z0 instanceof u) {
                    ((p)object1).Q(0x3F2CAF71);
                    Pb.a.l(0x7F08024C, 0x7F120141, 0x7F08024A, 0x7F12013F, ((Function0)this.e0), ((p)object1), 0, 0);  // drawable:ic_location_pin_48
                    ((p)object1).p(false);
                    ((p)object1).p(true);
                    return t.a;
                }
                if(z0 instanceof pa.v) {
                    ((p)object1).Q(1059906101);
                    Pb.a.l(0x7F08022D, 0x7F1201D2, null, 0x7F120381, function00, ((p)object1), 0, 4);  // drawable:ic_error_48
                    ((p)object1).p(false);
                }
                else if(z0 instanceof pa.r) {
                    ((p)object1).Q(0x3F2D08F4);
                    Pb.a.l(0x7F08022D, 0x7F120456, null, 0x7F120381, function00, ((p)object1), 0, 4);  // drawable:ic_error_48
                    ((p)object1).p(false);
                }
                else {
                    throw M.J.c(0x3F2BF06F, ((p)object1), false);
                }
            }
            ((p)object1).p(true);
            return t.a;
        }
        int v2 = ((Number)object2).intValue();
        j.f(((q0)object0), "it");
        if((v2 & 17) == 16 && ((p)object1).x()) {
            ((p)object1).K();
            return t.a;
        }
        l l1 = l.X;
        Modifier modifier2 = c.c(l1, 1.0f);
        f f0 = (f)this.d0;
        Modifier modifier3 = U5.a.J(modifier2, ((n)this.c0), !f0.d);
        K k1 = r.e(b.a, false);
        int v3 = ((p)object1).P;
        g0 g01 = ((p)object1).m();
        Modifier modifier4 = g0.a.d(((p)object1), modifier3);
        k.a.getClass();
        i i1 = F0.j.b;
        ((p)object1).U();
        if(((p)object1).O) {
            ((p)object1).l(i1);
        }
        else {
            ((p)object1).d0();
        }
        h h1 = F0.j.f;
        d.K(((p)object1), k1, h1);
        h h2 = F0.j.e;
        d.K(((p)object1), g01, h2);
        h h3 = F0.j.g;
        if(((p)object1).O || !j.a(((p)object1).G(), v3)) {
            m5.b.F(v3, ((p)object1), v3, h3);
        }
        h h4 = F0.j.d;
        d.K(((p)object1), modifier4, h4);
        androidx.compose.foundation.layout.b b1 = androidx.compose.foundation.layout.b.a;
        Modifier modifier5 = N4.h.P(c.c(l1, 1.0f), N4.h.H(((p)object1)));
        B b2 = B.z.a(B.k.c, b.n, ((p)object1), 0x30);
        int v4 = ((p)object1).P;
        g0 g02 = ((p)object1).m();
        Modifier modifier6 = g0.a.d(((p)object1), modifier5);
        ((p)object1).U();
        if(((p)object1).O) {
            ((p)object1).l(i1);
        }
        else {
            ((p)object1).d0();
        }
        d.K(((p)object1), b2, h1);
        d.K(((p)object1), g02, h2);
        if(((p)object1).O || !j.a(((p)object1).G(), v4)) {
            m5.b.F(v4, ((p)object1), v4, h3);
        }
        d.K(((p)object1), modifier6, h4);
        hb.h.z(f0, this.Y, ((p)object1), 0);
        String s = J2.w.S((f0.b ? 0x7F12020A : 0x7F120209), ((p)object1));  // string:lock_account_explanation "Your Wave account is locked to this device. If 
                                                                            // you want to connect another device to this Wave account, you will have to approve 
                                                                            // the transfer on this device first."
        O o0 = ((db.a)((p)object1).k(db.b.d)).d;
        m2.b(s, androidx.compose.foundation.layout.a.o(androidx.compose.foundation.layout.a.l(l1, 32.0f, 0.0f, 2), NaNf, 32.0f), v.d, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o0, ((p)object1), 0x1B0, 0, 0xFFF8);
        ((p)object1).Q(0xDAEA503E);
        if(f0.c) {
            String s1 = J2.w.S(0x7F120169, ((p)object1));  // string:error_general_offline_message "You are currently offline"
            String s2 = J2.w.S(0x7F120132, ((p)object1));  // string:device_management_may_be_out_of_date "Your connected devices may be out of 
                                                           // date. Connect to the Internet to view connected devices."
            Pb.a.k(0x180, ((p)object1), androidx.compose.foundation.layout.a.j(l1, 16.0f), s1, s2);
        }
        ((p)object1).p(false);
        Modifier modifier7 = androidx.compose.foundation.layout.a.l(l1, 16.0f, 0.0f, 2);
        r0 r00 = new r0(16.0f, 16.0f, 16.0f, 16.0f);
        c0.b b3 = c0.c.c(1481124980, new Aa.x(14, f0), ((p)object1));
        J2.w.l(v.e, modifier7, r00, false, b3, ((p)object1), 25014, 8);
        ((p)object1).p(true);
        Modifier modifier8 = b1.a(l1, b.b);
        long v5 = ((Q)((p)object1).k(T.a)).e();
        g.a(f0.d, ((n)this.c0), modifier8, 0L, v5, true, ((p)object1), 0x30040, 8);
        ((p)object1).p(true);
        ((p)object1).Q(0x7702843);
        if(f0.e) {
            P4.c.i(this.Z, ((p)object1), 0);
        }
        ((p)object1).p(false);
        ((p)object1).Q(1106075406);
        ea.l l2 = f0.f;
        if(l2 == ea.l.X) {
            s3 = J2.w.S(0x7F120130, ((p)object1));  // string:device_management_connect_to_internet "Connect to the Internet to use this 
                                                    // feature"
        }
        else if(l2 == null) {
            s3 = null;
        }
        else {
            throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
        }
        ((p)object1).p(false);
        T4.l.t(s3, ((q1)this.e0).b, this.b0, ((p)object1), 0);
        return t.a;
    }
}

