package ra;

import Ab.t;
import C.c;
import J2.w;
import Mb.e;
import N.m2;
import N4.o;
import Nb.k;
import O0.O;
import T4.l;
import U.p;
import U5.a;
import Z0.i;
import Z0.j;
import androidx.compose.ui.Modifier;
import db.b;
import ha.l0;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import yc.d;

public final class v extends k implements e {
    public final ArrayList X;
    public final Function0 Y;
    public final Function0 Z;
    public final Function0 b0;
    public final Function0 c0;
    public final Function0 d0;
    public final Function0 e0;
    public final Function0 f0;
    public final Function1 g0;
    public final Function1 h0;
    public final Function1 i0;
    public final Function0 j0;

    public v(ArrayList arrayList0, Function0 function00, Function0 function01, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Function1 function10, Function1 function11, Function1 function12, Function0 function07) {
        this.X = arrayList0;
        this.Y = function00;
        this.Z = function01;
        this.b0 = function02;
        this.c0 = function03;
        this.d0 = function04;
        this.e0 = function05;
        this.f0 = function06;
        this.g0 = function10;
        this.h0 = function11;
        this.i0 = function12;
        this.j0 = function07;
        super(4);
    }

    @Override  // Mb.e
    public final Object r(Object object0, Object object1, Object object2, Object object3) {
        p p0;
        int v = ((Number)object1).intValue();
        int v1 = ((Number)object3).intValue();
        int v2 = (v1 & 6) == 0 ? (((p)object2).f(((c)object0)) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (((p)object2).d(v) ? 0x20 : 16);
        }
        if((v2 & 0x93) == 0x92 && ((p)object2).x()) {
            ((p)object2).K();
            return t.a;
        }
        K k0 = (K)this.X.get(v);
        ((p)object2).Q(2026060871);
        if(k0 instanceof G) {
            ((p)object2).Q(2005018723);
            l.q(((G)k0), this.Y, this.Z, this.b0, this.c0, this.d0, ((p)object2), 8);
            ((p)object2).p(false);
            p0 = (p)object2;
            p0.p(false);
            return t.a;
        }
        if(k0 instanceof E) {
            ((p)object2).Q(2005034217);
            a.q(((E)k0).a, ((E)k0).b, this.e0, this.f0, null, ((p)object2), 0);
            ((p)object2).p(false);
            p0 = (p)object2;
            p0.p(false);
            return t.a;
        }
        g0.l l0 = g0.l.X;
        if(k0 instanceof F) {
            ((p)object2).Q(2005047270);
            Pb.a.m(w.S(0x7F120317, ((p)object2)), androidx.compose.foundation.layout.a.m(l0, 16.0f, 8.0f, 16.0f, 16.0f), ((p)object2), 0);  // string:payment_cards_offline_message "No Internet. Connect to see Virtual Visa."
            ((p)object2).p(false);
            p0 = (p)object2;
            p0.p(false);
            return t.a;
        }
        if(k0 instanceof D) {
            ((p)object2).Q(2005068337);
            Modifier modifier0 = androidx.compose.foundation.layout.a.k(l0, 16.0f, 8.0f);
            l.d(((D)k0).a, modifier0, ((p)object2), 0);
            ((p)object2).p(false);
            p0 = (p)object2;
            p0.p(false);
            return t.a;
        }
        if(k0 instanceof J) {
            ((p)object2).Q(2005078443);
            String s = ((J)k0).b.a(0, ((p)object2));
            String s1 = ((J)k0).c.a(0, ((p)object2));
            Modifier modifier1 = androidx.compose.foundation.layout.a.l(l0, 16.0f, 0.0f, 2);
            o.b(((int)((J)k0).a), s, s1, ((J)k0).d, modifier1, false, null, null, ((p)object2), 0x6000);
            ((p)object2).p(false);
            p0 = (p)object2;
            p0.p(false);
            return t.a;
        }
        boolean z = false;
        if(k0 instanceof C) {
            z = true;
            ((p)object2).Q(2028297334);
            Modifier modifier2 = androidx.compose.foundation.layout.a.n(l0, 16.0f, 16.0f, 16.0f, 0.0f, 8);
            l.h(((C)k0).a, modifier2, ((C)k0).b, this.g0, ((p)object2), 0);
            B.e.b(((p)object2), androidx.compose.foundation.layout.c.e(l0, 16.0f));
            ((p)object2).p(false);
        }
        else if(k0 instanceof I) {
            z = true;
            ((p)object2).Q(2005118650);
            Modifier modifier3 = ((c)object0).a(l0, l0.a);
            l.w(((I)k0), this.h0, this.i0, modifier3, ((p)object2), 0);
            ((p)object2).p(false);
        }
        if(z) {
            p0 = (p)object2;
        }
        else if(k0 instanceof H) {
            ((p)object2).Q(0x78FA488F);
            String s2 = w.S(0x7F12048E, ((p)object2));  // string:view_past_card_transactions "View past card transactions"
            Modifier modifier4 = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.a.d(androidx.compose.foundation.layout.a.n(androidx.compose.foundation.layout.a.l(androidx.compose.foundation.layout.c.d(l0, 1.0f), 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 20.0f, 7), false, null, this.j0, 7), 16.0f);
            i i0 = new i(3);
            O o0 = O.a(((db.a)((p)object2).k(b.d)).i, d.h(0x7F060042, ((p)object2)), 0L, null, null, 0L, j.c, 0L, null, null, 0xFFEFFE);  // color:WaveBlue
            p0 = (p)object2;
            m2.b(s2, modifier4, 0L, 0L, null, null, null, 0L, null, i0, 0L, 0, false, 0, 0, null, o0, p0, 0, 0, 0xFDFC);
            p0.p(false);
        }
        else {
            throw M.J.c(2005019452, ((p)object2), false);
        }
        p0.p(false);
        return t.a;
    }
}

