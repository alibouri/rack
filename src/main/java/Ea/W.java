package Ea;

import Ab.t;
import B.r;
import B3.c;
import D0.K;
import F0.h;
import F0.i;
import F0.j;
import H.f;
import N4.o;
import Nb.k;
import U.Z;
import U.d;
import U.g0;
import U.p;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import com.wave.customer.scratchCardRewards.ScratchCard.Award.Known;
import com.wave.customer.scratchCardRewards.ScratchCard.Unlocked.KnownAward;
import com.wave.customer.scratchCardRewards.e;
import g0.l;
import g1.b;
import g1.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class w extends k implements Function2 {
    public final MutableState X;
    public final g Y;
    public final Function0 Z;
    public final e b0;
    public final ScratchCard.Award.Known c0;
    public final Function0 d0;
    public final MutableState e0;
    public final Function1 f0;

    public w(MutableState mutableState0, g g0, Function0 function00, e e0, ScratchCard.Award.Known scratchCard$Award$Known0, Function0 function01, MutableState mutableState1, Function1 function10) {
        this.X = mutableState0;
        this.Y = g0;
        this.Z = function00;
        this.b0 = e0;
        this.c0 = scratchCard$Award$Known0;
        this.d0 = function01;
        this.e0 = mutableState1;
        this.f0 = function10;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        Object object3;
        int v = ((Number)object1).intValue();
        t t0 = t.a;
        if((v & 3) == 2 && ((p)object0).x()) {
            ((p)object0).K();
            return t0;
        }
        this.X.setValue(t0);
        g g0 = this.Y;
        g0.getClass();
        g0.a.c0.clear();
        g0.c = 0;
        ((p)object0).Q(-2122432805);
        c c0 = g0.b;
        if(c0 == null) {
            c0 = new c(27, g0);
            g0.b = c0;
        }
        g g1 = (g)c0.Y;
        b b0 = g1.a();
        b b1 = g1.a();
        b b2 = g1.a();
        Modifier modifier0 = o.j(a.c(a.l(androidx.compose.foundation.layout.c.d(l.X, 0.8f), 0.0f, 16.0f, 1), 1.0f, false), f.b(18.0f));
        ((p)object0).Q(0x98D2AC81);
        boolean z = ((p)object0).f(b0);
        Object object2 = ((p)object0).G();
        Z z1 = U.l.a;
        if(z || object2 == z1) {
            object2 = new Ea.t(b0, 0);
            ((p)object0).a0(object2);
        }
        ((p)object0).p(false);
        Modifier modifier1 = modifier0.d(new g1.f(b0, ((Function1)object2)));
        g0.g g2 = g0.b.a;
        K k0 = r.e(g2, false);
        int v1 = ((p)object0).P;
        g0 g00 = ((p)object0).m();
        Modifier modifier2 = g0.a.d(((p)object0), modifier1);
        F0.k.a.getClass();
        i i0 = j.b;
        ((p)object0).U();
        if(((p)object0).O) {
            ((p)object0).l(i0);
        }
        else {
            ((p)object0).d0();
        }
        h h0 = j.f;
        d.K(((p)object0), k0, h0);
        h h1 = j.e;
        d.K(((p)object0), g00, h1);
        h h2 = j.g;
        if(((p)object0).O || !Nb.j.a(((p)object0).G(), v1)) {
            m5.b.F(v1, ((p)object0), v1, h2);
        }
        h h3 = j.d;
        d.K(((p)object0), modifier2, h3);
        ((Function2)this.e0.getValue()).j(((p)object0), 0);
        ((p)object0).Q(0x6870960D);
        e e0 = this.b0;
        KnownAward scratchCard$Unlocked$KnownAward0 = e0.b;
        if(e0.a) {
            object3 = t0;
        }
        else {
            object3 = t0;
            com.wave.customer.scratchCardRewards.d.i(scratchCard$Unlocked$KnownAward0, this.d0, ((p)object0), 0);
        }
        ((p)object0).p(false);
        ((p)object0).p(true);
        ((p)object0).Q(-1731004920);
        boolean z2 = ((p)object0).f(b0);
        Object object4 = ((p)object0).G();
        if(z2 || object4 == z1) {
            object4 = new Ea.t(b0, 1);
            ((p)object0).a0(object4);
        }
        ((p)object0).p(false);
        g1.f f0 = new g1.f(b1, ((Function1)object4));
        com.wave.customer.scratchCardRewards.d.j(e0.a, this.c0, f0, ((p)object0), 0);
        ((p)object0).Q(-1731002839);
        if(!e0.a && scratchCard$Unlocked$KnownAward0.c0 != null) {
            ((p)object0).Q(0x98D30BEC);
            Object object5 = ((p)object0).G();
            if(object5 == z1) {
                object5 = u.X;
                ((p)object0).a0(object5);
            }
            ((p)object0).p(false);
            g1.f f1 = new g1.f(b2, ((Function1)object5));
            K k1 = r.e(g2, false);
            int v2 = ((p)object0).P;
            g0 g01 = ((p)object0).m();
            Modifier modifier3 = g0.a.d(((p)object0), f1);
            ((p)object0).U();
            if(((p)object0).O) {
                ((p)object0).l(i0);
            }
            else {
                ((p)object0).d0();
            }
            d.K(((p)object0), k1, h0);
            d.K(((p)object0), g01, h1);
            if(((p)object0).O || !Nb.j.a(((p)object0).G(), v2)) {
                m5.b.F(v2, ((p)object0), v2, h2);
            }
            d.K(((p)object0), modifier3, h3);
            ((p)object0).Q(0x6870D69C);
            Function1 function10 = this.f0;
            boolean z3 = ((p)object0).f(function10);
            boolean z4 = ((p)object0).h(e0);
            Object object6 = ((p)object0).G();
            if((z3 | z4) != 0 || object6 == z1) {
                object6 = new com.wave.customer.scratchCardRewards.b(function10, e0);
                ((p)object0).a0(object6);
            }
            ((p)object0).p(false);
            com.wave.customer.scratchCardRewards.d.k(((Function0)object6), ((p)object0), 0);
            ((p)object0).p(true);
        }
        ((p)object0).p(false);
        ((p)object0).p(false);
        return object3;
    }
}

