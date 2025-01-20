package Aa;

import B.B;
import B.C;
import B.k;
import B.q0;
import B.r;
import B.v0;
import B.x0;
import B.y;
import B.z0;
import B.z;
import Ca.q;
import Ca.t;
import J2.w;
import Mb.e;
import N.m2;
import N4.o;
import Nb.j;
import O0.O;
import U.O0;
import U.d;
import U.g0;
import U.p;
import Z2.f;
import Z2.g;
import Z2.h;
import Z2.i;
import Z2.v;
import a9.T7;
import a9.k6;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.Modifier;
import g0.a;
import g0.b;
import ja.m;
import ja.n;
import java.util.Date;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import n0.M;
import q9.M0;
import ra.L;
import w.C0;

public final class l implements Function3 {
    public final int X;
    public final Object Y;
    public final Object Z;
    public final Object b0;

    public l(Object object0, Object object1, Object object2, int v) {
        this.X = v;
        this.Z = object0;
        this.b0 = object1;
        this.Y = object2;
        super();
    }

    public l(Object object0, Function0 function00, Object object1, int v) {
        this.X = v;
        this.Z = object0;
        this.Y = function00;
        this.b0 = object1;
        super();
    }

    public l(Function0 function00, t t0, Function1 function10) {
        this.X = 3;
        super();
        this.Y = function00;
        this.Z = t0;
        this.b0 = function10;
    }

    private final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        if((v & 14) == 0) {
            v |= (((p)object1).f(((v)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && ((p)object1).x()) {
            ((p)object1).K();
            return Ab.t.a;
        }
        i i0 = (i)((v)object0).b.p0.getValue();
        boolean z = true;
        if(i0 instanceof g) {
            ((p)object1).R(0x67AED995);
            e e0 = (e)this.Z;
            if(e0 != null) {
                e0.r(((v)object0), i0, ((p)object1), ((int)(v & 14 | 0x40)));
                z = false;
            }
            ((p)object1).p(false);
            goto label_35;
        }
        if(i0 instanceof h) {
            ((p)object1).R(0x67B045D5);
            e e1 = (e)this.b0;
            if(e1 != null) {
                e1.r(((v)object0), i0, ((p)object1), ((int)(v & 14 | 0x40)));
                z = false;
            }
            ((p)object1).p(false);
            goto label_35;
        }
        boolean z1 = false;
        if(i0 instanceof f) {
            z1 = true;
            ((p)object1).R(1739696601);
            e e2 = (e)this.Y;
            if(e2 != null) {
                e2.r(((v)object0), i0, ((p)object1), ((int)(v & 14 | 0x40)));
                z = false;
            }
            ((p)object1).p(false);
        }
        else if(i0 instanceof Z2.e) {
            z1 = true;
            ((p)object1).R(0x67B2F8AC);
            ((p)object1).p(false);
        }
        if(z1) {
        label_35:
            if(z) {
                Z2.t.g(((v)object0), null, null, null, null, null, 0.0f, null, false, ((p)object1), v & 14);
            }
            return Ab.t.a;
        }
        ((p)object1).R(0xFB162089);
        ((p)object1).p(false);
        throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
    }

    private final Object b(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        j.f(((q0)object0), "it");
        if((v & 17) == 16 && ((p)object1).x()) {
            ((p)object1).K();
            return Ab.t.a;
        }
        g0.l l0 = g0.l.X;
        Modifier modifier0 = c.c(l0, 1.0f);
        B b0 = z.a(k.g, b.m, ((p)object1), 6);
        int v1 = ((p)object1).P;
        g0 g00 = ((p)object1).m();
        Modifier modifier1 = a.d(((p)object1), modifier0);
        F0.k.a.getClass();
        F0.i i0 = F0.j.b;
        ((p)object1).U();
        if(((p)object1).O) {
            ((p)object1).l(i0);
        }
        else {
            ((p)object1).d0();
        }
        F0.h h0 = F0.j.f;
        d.K(((p)object1), b0, h0);
        F0.h h1 = F0.j.e;
        d.K(((p)object1), g00, h1);
        F0.h h2 = F0.j.g;
        if(((p)object1).O || !j.a(((p)object1).G(), v1)) {
            m5.b.F(v1, ((p)object1), v1, h2);
        }
        F0.h h3 = F0.j.d;
        d.K(((p)object1), modifier1, h3);
        Modifier modifier2 = N4.h.P(androidx.compose.foundation.layout.a.l(A3.e.D(c.d(l0, 1.0f), 1.0f), 16.0f, 0.0f, 2), ((C0)this.Z));
        B b1 = z.a(new B.h(16.0f), b.n, ((p)object1), 54);
        int v2 = ((p)object1).P;
        g0 g01 = ((p)object1).m();
        Modifier modifier3 = a.d(((p)object1), modifier2);
        ((p)object1).U();
        if(((p)object1).O) {
            ((p)object1).l(i0);
        }
        else {
            ((p)object1).d0();
        }
        d.K(((p)object1), b1, h0);
        d.K(((p)object1), g01, h1);
        if(((p)object1).O || !j.a(((p)object1).G(), v2)) {
            m5.b.F(v2, ((p)object1), v2, h2);
        }
        d.K(((p)object1), modifier3, h3);
        Modifier modifier4 = androidx.compose.foundation.layout.a.c(c.d(l0, 0.55f), 1.0f, false);
        ga.c.b(((ga.f)this.b0), modifier4, ((p)object1), 0x30);
        O o0 = ((db.a)((p)object1).k(db.b.d)).p;
        Modifier modifier5 = androidx.compose.foundation.layout.a.l(l0, 0.0f, 10.0f, 1);
        Z0.i i1 = new Z0.i(3);
        m2.b(((ga.f)this.b0).c, modifier5, 0L, 0L, null, null, null, 0L, null, i1, 0L, 0, false, 0, 0, null, o0, ((p)object1), 0x30, 0, 0xFDFC);
        ((p)object1).Q(0xDC1A30FD);
        ga.f f0 = (ga.f)this.b0;
        for(Object object3: f0.d) {
            ga.c.c(((ga.e)object3), ((p)object1), 0);
        }
        ((p)object1).p(false);
        ((p)object1).p(true);
        ((p)object1).Q(0xE25A7FDD);
        if(f0.e != null) {
            ((p)object1).Q(0xE25A8A2F);
            Function1 function10 = (Function1)this.Y;
            boolean z = ((p)object1).f(function10);
            boolean z1 = ((p)object1).h(f0);
            Object object4 = ((p)object1).G();
            if((z | z1) != 0 || object4 == U.l.a) {
                object4 = new Ca.j(function10, 11, f0);
                ((p)object1).a0(object4);
            }
            ((p)object1).p(false);
            M6.b.j(((Function0)object4), androidx.compose.foundation.layout.a.n(androidx.compose.foundation.layout.a.l(l0, 16.0f, 0.0f, 2), 0.0f, 16.0f, 0.0f, 32.0f, 5), false, false, c0.c.c(0x4E282F01, new K(7, f0), ((p)object1)), ((p)object1), 0x6030, 12);
        }
        ((p)object1).p(false);
        ((p)object1).p(true);
        return Ab.t.a;
    }

    private final Object c(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        j.f(((C)object0), "$this$BottomSheetLayout");
        if((v & 17) == 16 && ((p)object1).x()) {
            ((p)object1).K();
            return Ab.t.a;
        }
        w.j(((m)this.Z), ((Function0)this.Y), ((Function3)this.b0), ((p)object1), 0);
        return Ab.t.a;
    }

    private final Object g(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        j.f(((C)object0), "$this$BottomSheetLayout");
        if((v & 17) == 16 && ((p)object1).x()) {
            ((p)object1).K();
            return Ab.t.a;
        }
        M6.b.g(((n)this.Z), ((Function0)this.Y), ((Function0)this.b0), ((p)object1), 0);
        return Ab.t.a;
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        String s14;
        switch(this.X) {
            case 0: {
                int v1 = ((Number)object2).intValue();
                j.f(((C)object0), "$this$BottomSheetLayout");
                if((v1 & 17) == 16 && ((p)object1).x()) {
                    ((p)object1).K();
                    return Ab.t.a;
                }
                g0.l l0 = g0.l.X;
                Modifier modifier1 = androidx.compose.foundation.layout.a.n(androidx.compose.foundation.layout.a.l(l0, 20.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 20.0f, 7);
                B b1 = z.a(new B.h(16.0f), b.n, ((p)object1), 54);
                int v2 = ((p)object1).P;
                g0 g00 = ((p)object1).m();
                Modifier modifier2 = a.d(((p)object1), modifier1);
                F0.k.a.getClass();
                F0.i i0 = F0.j.b;
                ((p)object1).U();
                if(((p)object1).O) {
                    ((p)object1).l(i0);
                }
                else {
                    ((p)object1).d0();
                }
                d.K(((p)object1), b1, F0.j.f);
                d.K(((p)object1), g00, F0.j.e);
                F0.h h0 = F0.j.g;
                if(((p)object1).O || !j.a(((p)object1).G(), v2)) {
                    m5.b.F(v2, ((p)object1), v2, h0);
                }
                d.K(((p)object1), modifier2, F0.j.d);
                String s = w.S(0x7F120206, ((p)object1));  // string:lock_abuser_title "You can lock your Vault again next month"
                O0 o00 = db.b.d;
                O o0 = ((db.a)((p)object1).k(o00)).n;
                m2.b(s, null, 0L, 0L, null, null, null, 0L, null, new Z0.i(3), 0L, 0, false, 0, 0, null, o0, ((p)object1), 0, 0, 0xFDFE);
                String s1 = (String)this.Z;
                if(s1 == null) {
                    ((p)object1).Q(0x576A70CC);
                    String s2 = w.T(0x7F120205, new Object[]{((String)this.b0)}, ((p)object1));  // string:lock_abuser_message "Sorry, you’ve already unlocked your Vault too many times 
                                                                                                 // by contacting support in %s."
                    O o2 = ((db.a)((p)object1).k(o00)).h;
                    m2.b(s2, null, 0L, 0L, null, null, null, 0L, null, new Z0.i(3), 0L, 0, false, 0, 0, null, o2, ((p)object1), 0, 0, 0xFDFE);
                }
                else {
                    ((p)object1).Q(0x576757FF);
                    O o1 = ((db.a)((p)object1).k(o00)).h;
                    m2.b(s1, null, 0L, 0L, null, null, null, 0L, null, new Z0.i(3), 0L, 0, false, 0, 0, null, o1, ((p)object1), 0, 0, 0xFDFE);
                }
                ((p)object1).p(false);
                B.e.b(((p)object1), c.e(l0, 8.0f));
                M6.b.i(((Function0)this.Y), null, false, false, null, null, null, Aa.i.a, ((p)object1), 0xC00000, 0x7E);
                ((p)object1).p(true);
                return Ab.t.a;
            }
            case 1: {
                int v3 = ((Number)object2).intValue();
                j.f(((C)object0), "$this$BottomSheetLayout");
                if((v3 & 17) == 16 && ((p)object1).x()) {
                    ((p)object1).K();
                    return Ab.t.a;
                }
                g0.l l1 = g0.l.X;
                Modifier modifier3 = androidx.compose.foundation.layout.a.l(l1, 20.0f, 0.0f, 2);
                B b2 = z.a(k.c, b.n, ((p)object1), 0x30);
                int v4 = ((p)object1).P;
                g0 g01 = ((p)object1).m();
                Modifier modifier4 = a.d(((p)object1), modifier3);
                F0.k.a.getClass();
                F0.i i1 = F0.j.b;
                ((p)object1).U();
                if(((p)object1).O) {
                    ((p)object1).l(i1);
                }
                else {
                    ((p)object1).d0();
                }
                d.K(((p)object1), b2, F0.j.f);
                d.K(((p)object1), g01, F0.j.e);
                F0.h h1 = F0.j.g;
                if(((p)object1).O || !j.a(((p)object1).G(), v4)) {
                    m5.b.F(v4, ((p)object1), v4, h1);
                }
                d.K(((p)object1), modifier4, F0.j.d);
                M6.b.d(yc.l.y(0x7F08031B, ((p)object1), 0), null, c.k(l1, 196.0f), null, null, 0.0f, null, ((p)object1), 0x1B0, 120);  // drawable:sad_penguin
                B.e.b(((p)object1), c.e(l1, 16.0f));
                String s3 = w.S(0x7F120052, ((p)object1));  // string:are_you_sure_unlock_early_title "Are you sure you want to unlock your Vault 
                                                            // early?"
                O0 o01 = db.b.d;
                O o3 = ((db.a)((p)object1).k(o01)).n;
                m2.b(s3, null, 0L, 0L, null, null, null, 0L, null, new Z0.i(3), 0L, 0, false, 0, 0, null, o3, ((p)object1), 0, 0, 0xFDFE);
                B.e.b(((p)object1), c.e(l1, 16.0f));
                c0 c00 = (c0)this.Z;
                Integer integer0 = c00.o;
                ((p)object1).Q(1578702386);
                if(integer0 != null) {
                    if(integer0.intValue() > 1) {
                        ((p)object1).Q(943082100);
                        String s4 = w.S(0x7F1201E0, ((p)object1));  // string:last_but_one_chance_to_lock "If you contact support to unlock your Vault 
                                                                    // early twice this month, you won’t be able to lock it again until next month."
                        O o4 = ((db.a)((p)object1).k(o01)).h;
                        m2.b(s4, null, 0L, 0L, null, null, null, 0L, null, new Z0.i(3), 0L, 0, false, 0, 0, null, o4, ((p)object1), 0, 0, 0xFDFE);
                    }
                    else {
                        ((p)object1).Q(0x383A4C5C);
                        String s5 = w.S(0x7F1201E1, ((p)object1));  // string:last_chance_to_lock "If you contact support to unlock your Vault early, you 
                                                                    // won’t be able to lock it again until next month."
                        O o5 = ((db.a)((p)object1).k(o01)).h;
                        m2.b(s5, null, 0L, 0L, null, null, null, 0L, null, new Z0.i(3), 0L, 0, false, 0, 0, null, o5, ((p)object1), 0, 0, 0xFDFE);
                    }
                    ((p)object1).p(false);
                }
                ((p)object1).p(false);
                B.e.b(((p)object1), c.e(l1, 28.0f));
                M6.b.j(((Function0)this.Y), null, false, false, Aa.j.h, ((p)object1), 0x6000, 14);
                B.e.b(((p)object1), c.e(l1, 12.0f));
                T7 t70 = (T7)Bb.p.q0(c00.l.a);
                ((p)object1).Q(0x5E198883);
                Function1 function10 = (Function1)this.b0;
                boolean z = ((p)object1).f(function10);
                boolean z1 = ((p)object1).f(t70);
                Object object3 = ((p)object1).G();
                if((z | z1) != 0 || object3 == U.l.a) {
                    object3 = new V(function10, t70, 0);
                    ((p)object1).a0(object3);
                }
                ((p)object1).p(false);
                M6.b.l(((Function0)object3), null, false, Aa.j.i, ((p)object1), 0xC00, 6);
                B.e.b(((p)object1), c.e(l1, 32.0f));
                ((p)object1).p(true);
                return Ab.t.a;
            }
            case 2: {
                int v5 = ((Number)object2).intValue();
                j.f(((q0)object0), "$unused$var$");
                if((v5 & 17) == 16 && ((p)object1).x()) {
                    ((p)object1).K();
                    return Ab.t.a;
                }
                g0.l l2 = g0.l.X;
                B b3 = z.a(k.c, b.n, ((p)object1), 0x30);
                int v6 = ((p)object1).P;
                g0 g02 = ((p)object1).m();
                Modifier modifier5 = a.d(((p)object1), l2);
                F0.k.a.getClass();
                F0.i i2 = F0.j.b;
                ((p)object1).U();
                if(((p)object1).O) {
                    ((p)object1).l(i2);
                }
                else {
                    ((p)object1).d0();
                }
                F0.h h2 = F0.j.f;
                d.K(((p)object1), b3, h2);
                F0.h h3 = F0.j.e;
                d.K(((p)object1), g02, h3);
                F0.h h4 = F0.j.g;
                if(((p)object1).O || !j.a(((p)object1).G(), v6)) {
                    m5.b.F(v6, ((p)object1), v6, h4);
                }
                F0.h h5 = F0.j.d;
                d.K(((p)object1), modifier5, h5);
                M6.b.d(yc.l.y(0x7F080250, ((p)object1), 0), null, c.k(l2, 48.0f), null, null, 0.0f, null, ((p)object1), 0x1B0, 120);  // drawable:ic_locked_vault
                B.e.b(((p)object1), A3.e.D(l2, 2.0f));
                String s6 = w.S(0x7F1200F0, ((p)object1));  // string:confirm_transfer_locked_vault_title "Confirm transfer into locked Vault"
                Modifier modifier6 = androidx.compose.foundation.layout.a.k(l2, 16.0f, 3.0f);
                O0 o02 = db.b.d;
                O o6 = ((db.a)((p)object1).k(o02)).n;
                m2.b(s6, modifier6, 0L, 0L, null, null, null, 0L, null, new Z0.i(3), 0L, 0, false, 0, 0, null, o6, ((p)object1), 0x30, 0, 0xFDFC);
                B.e.b(((p)object1), A3.e.D(l2, 1.0f));
                Modifier modifier7 = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.a.b(o.j(androidx.compose.foundation.layout.a.l(l2, 16.0f, 0.0f, 2), H.f.b(10.0f)), yc.d.h(0x7F06018F, ((p)object1)), M.a), 16.0f);  // color:white
                B b4 = z.a(new B.h(25.0f), b.m, ((p)object1), 6);
                int v7 = ((p)object1).P;
                g0 g03 = ((p)object1).m();
                Modifier modifier8 = a.d(((p)object1), modifier7);
                ((p)object1).U();
                if(((p)object1).O) {
                    ((p)object1).l(i2);
                }
                else {
                    ((p)object1).d0();
                }
                d.K(((p)object1), b4, h2);
                d.K(((p)object1), g03, h3);
                if(((p)object1).O || !j.a(((p)object1).G(), v7)) {
                    m5.b.F(v7, ((p)object1), v7, h4);
                }
                d.K(((p)object1), modifier8, h5);
                B.f f0 = k.g;
                g0.f f1 = b.j;
                x0 x00 = v0.b(f0, f1, ((p)object1), 6);
                int v8 = ((p)object1).P;
                g0 g04 = ((p)object1).m();
                Modifier modifier9 = a.d(((p)object1), l2);
                ((p)object1).U();
                if(((p)object1).O) {
                    ((p)object1).l(i2);
                }
                else {
                    ((p)object1).d0();
                }
                d.K(((p)object1), x00, h2);
                d.K(((p)object1), g04, h3);
                if(((p)object1).O || !j.a(((p)object1).G(), v8)) {
                    m5.b.F(v8, ((p)object1), v8, h4);
                }
                d.K(((p)object1), modifier9, h5);
                z0 z00 = z0.a;
                String s7 = w.S(0x7F120041, ((p)object1));  // string:amount_transfer_into_locked "Amount to transfer into locked Vault"
                O o7 = O.a(((db.a)((p)object1).k(o02)).h, yc.d.h(0x7F060019, ((p)object1)), 0L, null, null, 0L, null, 0L, null, null, 0xFFFFFE);  // color:Gray600
                m2.b(s7, z00.a(l2, 10.0f, true), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o7, ((p)object1), 0, 0, 0xFFFC);
                B.e.b(((p)object1), z00.a(l2, 6.0f, true));
                Ba.k k0 = (Ba.k)this.Z;
                j.c(k0.h);
                String s8 = M0.a(k0.h);
                O o8 = O.a(((db.a)((p)object1).k(o02)).h, yc.d.h(0x7F06001C, ((p)object1)), 0L, null, null, 0L, null, 0L, null, null, 0xFFFFFE);  // color:Gray900
                m2.b(s8, null, 0L, 0L, null, null, null, 0L, null, new Z0.i(6), 0L, 0, false, 0, 0, null, o8, ((p)object1), 0, 0, 0xFDFE);
                ((p)object1).p(true);
                x0 x01 = v0.b(f0, f1, ((p)object1), 6);
                int v9 = ((p)object1).P;
                g0 g05 = ((p)object1).m();
                Modifier modifier10 = a.d(((p)object1), l2);
                ((p)object1).U();
                if(((p)object1).O) {
                    ((p)object1).l(i2);
                }
                else {
                    ((p)object1).d0();
                }
                d.K(((p)object1), x01, h2);
                d.K(((p)object1), g05, h3);
                if(((p)object1).O || !j.a(((p)object1).G(), v9)) {
                    m5.b.F(v9, ((p)object1), v9, h4);
                }
                d.K(((p)object1), modifier10, h5);
                String s9 = w.S(0x7F1202C1, ((p)object1));  // string:new_vault_balance "New Vault balance"
                O o9 = O.a(((db.a)((p)object1).k(o02)).h, yc.d.h(0x7F060019, ((p)object1)), 0L, null, null, 0L, null, 0L, null, null, 0xFFFFFE);  // color:Gray600
                m2.b(s9, z00.a(l2, 10.0f, true), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o9, ((p)object1), 0, 0, 0xFFFC);
                B.e.b(((p)object1), z00.a(l2, 6.0f, true));
                j.c(k0.h);
                j.c(k0.f);
                String s10 = M0.a(k0.h.j(k0.f));
                O o10 = O.a(((db.a)((p)object1).k(o02)).h, yc.d.h(0x7F06001C, ((p)object1)), 0L, null, null, 0L, null, 0L, null, null, 0xFFFFFE);  // color:Gray900
                m2.b(s10, null, 0L, 0L, null, null, null, 0L, null, new Z0.i(6), 0L, 0, false, 0, 0, null, o10, ((p)object1), 0, 0, 0xFDFE);
                ((p)object1).p(true);
                x0 x02 = v0.b(f0, f1, ((p)object1), 6);
                int v10 = ((p)object1).P;
                g0 g06 = ((p)object1).m();
                Modifier modifier11 = a.d(((p)object1), l2);
                ((p)object1).U();
                if(((p)object1).O) {
                    ((p)object1).l(i2);
                }
                else {
                    ((p)object1).d0();
                }
                d.K(((p)object1), x02, h2);
                d.K(((p)object1), g06, h3);
                if(((p)object1).O || !j.a(((p)object1).G(), v10)) {
                    m5.b.F(v10, ((p)object1), v10, h4);
                }
                d.K(((p)object1), modifier11, h5);
                String s11 = w.S(0x7F12020E, ((p)object1));  // string:lock_until "Locked until"
                O o11 = O.a(((db.a)((p)object1).k(o02)).h, yc.d.h(0x7F060019, ((p)object1)), 0L, null, null, 0L, null, 0L, null, null, 0xFFFFFE);  // color:Gray600
                m2.b(s11, z00.a(l2, 3.0f, true), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o11, ((p)object1), 0, 0, 0xFFFC);
                B.e.b(((p)object1), z00.a(l2, 2.0f, true));
                j.c(k0.g);
                String s12 = w.T(0x7F12045B, new Object[]{T4.l.H(k0.g, true)}, ((p)object1));  // string:unlock_timestamp "⚠️ %s at 12:01am"
                O o12 = O.a(((db.a)((p)object1).k(o02)).i, yc.d.h(0x7F06001C, ((p)object1)), 0L, null, null, 0L, null, 0L, null, null, 0xFFFFFE);  // color:Gray900
                m2.b(s12, z00.a(l2, 4.0f, true), 0L, 0L, null, null, null, 0L, null, new Z0.i(6), 0L, 0, false, 0, 0, null, o12, ((p)object1), 0, 0, 0xFDFC);
                ((p)object1).p(true);
                ((p)object1).p(true);
                B.e.b(((p)object1), A3.e.D(l2, 20.0f));
                Modifier modifier12 = androidx.compose.foundation.layout.a.j(l2, 16.0f);
                M6.b.j(((Function0)this.b0), modifier12, false, false, Ba.c.c, ((p)object1), 0x6030, 12);
                ((p)object1).p(true);
                if(k0.a) {
                    ((p)object1).Q(0x6324CA47);
                    Function0 function00 = (Function0)this.Y;
                    boolean z2 = ((p)object1).f(function00);
                    Object object4 = ((p)object1).G();
                    if(z2 || object4 == U.l.a) {
                        object4 = new N(function00, 4);
                        ((p)object1).a0(object4);
                    }
                    ((p)object1).p(false);
                    P4.c.i(((Function0)object4), ((p)object1), 0);
                }
                return Ab.t.a;
            }
            case 3: {
                int v11 = ((Number)object2).intValue();
                j.f(((q0)object0), "$unused$var$");
                if((v11 & 17) == 16 && ((p)object1).x()) {
                    ((p)object1).K();
                    return Ab.t.a;
                }
                g0.l l3 = g0.l.X;
                B.d d0 = k.c;
                B b5 = z.a(d0, b.n, ((p)object1), 0x30);
                int v12 = ((p)object1).P;
                g0 g07 = ((p)object1).m();
                Modifier modifier13 = a.d(((p)object1), l3);
                F0.k.a.getClass();
                F0.i i3 = F0.j.b;
                ((p)object1).U();
                if(((p)object1).O) {
                    ((p)object1).l(i3);
                }
                else {
                    ((p)object1).d0();
                }
                F0.h h6 = F0.j.f;
                d.K(((p)object1), b5, h6);
                F0.h h7 = F0.j.e;
                d.K(((p)object1), g07, h7);
                F0.h h8 = F0.j.g;
                if(((p)object1).O || !j.a(((p)object1).G(), v12)) {
                    m5.b.F(v12, ((p)object1), v12, h8);
                }
                F0.h h9 = F0.j.d;
                d.K(((p)object1), modifier13, h9);
                M6.b.d(yc.l.y(0x7F080250, ((p)object1), 0), null, c.k(l3, 48.0f), null, null, 0.0f, null, ((p)object1), 0x1B0, 120);  // drawable:ic_locked_vault
                B.e.b(((p)object1), A3.e.D(l3, 16.0f));
                String s13 = w.S(0x7F12049C, ((p)object1));  // string:when_unlock_vault_q "When do you want your Vault to unlock?"
                Modifier modifier14 = androidx.compose.foundation.layout.a.l(l3, 24.0f, 0.0f, 2);
                O0 o03 = db.b.d;
                O o13 = ((db.a)((p)object1).k(o03)).n;
                m2.b(s13, modifier14, 0L, 0L, null, null, null, 0L, null, new Z0.i(3), 0L, 0, false, 0, 0, null, o13, ((p)object1), 0x30, 0, 0xFDFC);
                B.e.b(((p)object1), A3.e.D(l3, 72.0f));
                Modifier modifier15 = androidx.compose.foundation.layout.a.j(l3, 16.0f);
                B.h h10 = new B.h(24.0f);
                g0.e e0 = b.m;
                B b6 = z.a(h10, e0, ((p)object1), 6);
                int v13 = ((p)object1).P;
                g0 g08 = ((p)object1).m();
                Modifier modifier16 = a.d(((p)object1), modifier15);
                ((p)object1).U();
                if(((p)object1).O) {
                    ((p)object1).l(i3);
                }
                else {
                    ((p)object1).d0();
                }
                d.K(((p)object1), b6, h6);
                d.K(((p)object1), g08, h7);
                if(((p)object1).O || !j.a(((p)object1).G(), v13)) {
                    m5.b.F(v13, ((p)object1), v13, h8);
                }
                d.K(((p)object1), modifier16, h9);
                B.h h11 = new B.h(20.0f);
                g0.f f2 = b.j;
                x0 x03 = v0.b(h11, f2, ((p)object1), 6);
                int v14 = ((p)object1).P;
                g0 g09 = ((p)object1).m();
                Modifier modifier17 = a.d(((p)object1), l3);
                ((p)object1).U();
                if(((p)object1).O) {
                    ((p)object1).l(i3);
                }
                else {
                    ((p)object1).d0();
                }
                d.K(((p)object1), x03, h6);
                d.K(((p)object1), g09, h7);
                if(((p)object1).O || !j.a(((p)object1).G(), v14)) {
                    m5.b.F(v14, ((p)object1), v14, h8);
                }
                d.K(((p)object1), modifier17, h9);
                z0 z01 = z0.a;
                t t0 = (t)this.Z;
                Modifier modifier18 = z01.a(l3, 1.0f, true);
                Function1 function11 = (Function1)this.b0;
                P4.c.l(q.Y, t0.b, modifier18, function11, ((p)object1), 6);
                Modifier modifier19 = z01.a(l3, 1.0f, true);
                P4.c.l(q.Z, t0.b, modifier19, function11, ((p)object1), 6);
                Modifier modifier20 = z01.a(l3, 1.0f, true);
                P4.c.l(q.b0, t0.b, modifier20, function11, ((p)object1), 6);
                ((p)object1).p(true);
                x0 x04 = v0.b(new B.h(20.0f), f2, ((p)object1), 6);
                int v15 = ((p)object1).P;
                g0 g010 = ((p)object1).m();
                Modifier modifier21 = a.d(((p)object1), l3);
                ((p)object1).U();
                if(((p)object1).O) {
                    ((p)object1).l(i3);
                }
                else {
                    ((p)object1).d0();
                }
                d.K(((p)object1), x04, h6);
                d.K(((p)object1), g010, h7);
                if(((p)object1).O || !j.a(((p)object1).G(), v15)) {
                    m5.b.F(v15, ((p)object1), v15, h8);
                }
                d.K(((p)object1), modifier21, h9);
                Modifier modifier22 = z01.a(l3, 1.0f, true);
                P4.c.l(q.c0, t0.b, modifier22, function11, ((p)object1), 6);
                Modifier modifier23 = z01.a(l3, 1.0f, true);
                P4.c.l(q.d0, t0.b, modifier23, function11, ((p)object1), 6);
                Modifier modifier24 = z01.a(l3, 1.0f, true);
                P4.c.e(t0.b, modifier24, function11, ((p)object1), 6);
                ((p)object1).p(true);
                ((p)object1).p(true);
                Modifier modifier25 = A3.e.D(l3, 143.0f);
                B b7 = z.a(d0, e0, ((p)object1), 0);
                int v16 = ((p)object1).P;
                g0 g011 = ((p)object1).m();
                Modifier modifier26 = a.d(((p)object1), modifier25);
                ((p)object1).U();
                if(((p)object1).O) {
                    ((p)object1).l(i3);
                }
                else {
                    ((p)object1).d0();
                }
                d.K(((p)object1), b7, h6);
                d.K(((p)object1), g011, h7);
                if(((p)object1).O || !j.a(((p)object1).G(), v16)) {
                    m5.b.F(v16, ((p)object1), v16, h8);
                }
                d.K(((p)object1), modifier26, h9);
                ((p)object1).Q(-856825066);
                Wc.b b8 = t0.c;
                if(b8 != null) {
                    B.e.b(((p)object1), A3.e.D(l3, 8.0f));
                    m2.b(w.T(0x7F120214, new Object[]{T4.l.H(new Date(b8.X), false)}, ((p)object1)), androidx.compose.foundation.layout.a.k(androidx.compose.foundation.a.b(l3, 0xFFFFE1F300000000L, H.f.b(4.0f)), 8.0f, 6.0f), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, O.a(((db.a)((p)object1).k(o03)).i, 0xFF71005100000000L, 0L, null, null, 0L, null, 0L, null, null, 0xFFFFFE), ((p)object1), 0, 0, 0xFFFC);  // string:locked_until_x "The Vault will be locked until %s"
                    B.e.b(((p)object1), A3.e.D(l3, 88.0f));
                }
                ((p)object1).p(false);
                ((p)object1).p(true);
                Modifier modifier27 = androidx.compose.foundation.layout.a.j(l3, 16.0f);
                M6.b.j(((Function0)this.Y), modifier27, t0.j, false, Ca.c.c, ((p)object1), 0x6030, 8);
                ((p)object1).p(true);
                return Ab.t.a;
            }
            case 4: {
                int v17 = ((Number)object2).intValue();
                j.f(((y)object0), "$this$BoxWithConstraints");
                if((v17 & 6) == 0) {
                    v17 |= (((p)object1).f(((y)object0)) ? 4 : 2);
                }
                if((v17 & 19) == 18 && ((p)object1).x()) {
                    ((p)object1).K();
                    return Ab.t.a;
                }
                ((Function3)this.Z).h(((y)object0), ((p)object1), ((int)(v17 & 14)));
                g0.l l4 = g0.l.X;
                Modifier modifier28 = c.c(l4, 0.9f);
                D0.K k1 = r.e(b.a, false);
                int v18 = ((p)object1).P;
                g0 g012 = ((p)object1).m();
                Modifier modifier29 = a.d(((p)object1), modifier28);
                F0.k.a.getClass();
                F0.i i4 = F0.j.b;
                ((p)object1).U();
                if(((p)object1).O) {
                    ((p)object1).l(i4);
                }
                else {
                    ((p)object1).d0();
                }
                d.K(((p)object1), k1, F0.j.f);
                d.K(((p)object1), g012, F0.j.e);
                F0.h h12 = F0.j.g;
                if(((p)object1).O || !j.a(((p)object1).G(), v18)) {
                    m5.b.F(v18, ((p)object1), v18, h12);
                }
                d.K(((p)object1), modifier29, F0.j.d);
                androidx.compose.foundation.layout.b b9 = androidx.compose.foundation.layout.b.a;
                ((p)object1).Q(-398175930);
                R2.w w0 = (R2.w)this.b0;
                if(w0 != null) {
                    Modifier modifier30 = b9.a(l4, b.c);
                    Fa.m.e(w0, ((Fa.e)this.Y), modifier30, ((p)object1), 0);
                }
                ((p)object1).p(false);
                ((p)object1).p(true);
                return Ab.t.a;
            }
            case 5: {
                int v19 = ((Number)object2).intValue();
                j.f(((C)object0), "$this$BottomSheetLayout");
                if((v19 & 17) == 16 && ((p)object1).x()) {
                    ((p)object1).K();
                    return Ab.t.a;
                }
                Sa.c c0 = (Sa.c)this.Z;
                if(c0 != null) {
                    ((p)object1).Q(0xAFD75BAF);
                    s0.b b10 = (s0.b)this.Y;
                    if(b10 == null) {
                        b10 = yc.l.y(0x7F0802C4, ((p)object1), 0);  // drawable:logo_blank
                    }
                    ((p)object1).p(false);
                    Sa.b.b(null, c0.a, ((ha.m)this.b0), b10, ((p)object1), 0);
                }
                return Ab.t.a;
            }
            case 6: {
                return this.a(object0, object1, object2);
            }
            case 7: {
                int v20 = ((Number)object2).intValue();
                j.f(((C)object0), "$this$BottomSheetLayout");
                if((v20 & 17) == 16 && ((p)object1).x()) {
                    ((p)object1).K();
                    return Ab.t.a;
                }
                k6 k60 = (k6)this.Z;
                if(k60 == null) {
                    s14 = "";
                }
                else {
                    s14 = k60.b;
                    if(s14 == null) {
                        s14 = "";
                    }
                }
                W5.f.e(0, 0, ((p)object1), s14, ((Function0)this.Y), ((Function0)this.b0));
                return Ab.t.a;
            }
            case 8: {
                return this.b(object0, object1, object2);
            }
            case 9: {
                return this.c(object0, object1, object2);
            }
            case 10: {
                return this.g(object0, object1, object2);
            }
            default: {
                int v = ((Number)object2).intValue();
                j.f(((C)object0), "$this$ActivateCardSurface");
                if((v & 17) == 16 && ((p)object1).x()) {
                    ((p)object1).K();
                    return Ab.t.a;
                }
                Modifier modifier0 = c.d(((Modifier)this.b0), 1.0f);
                c0.b b0 = c0.c.c(0xD5732AF4, new pb.v((((ra.N)this.Z).f == ra.O0.Y ? 0x7F1203D2 : 0x7F120488), 1), ((p)object1));  // string:see_account_limits "See Account Limits"
                M6.b.j(((Function0)this.Y), modifier0, ((ra.N)this.Z).a != L.Z, false, b0, ((p)object1), 0x6000, 8);
                return Ab.t.a;
            }
        }
    }
}

