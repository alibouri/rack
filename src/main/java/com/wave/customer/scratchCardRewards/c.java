package com.wave.customer.scratchCardRewards;

import Ab.t;
import B.q0;
import D0.K;
import D0.b0;
import Ea.v;
import Ea.w;
import G0.f0;
import M0.k;
import Nb.j;
import U.Z;
import U.d;
import U.p;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import g0.l;
import g1.g;
import g1.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

public final class c implements Function3 {
    public final e X;
    public final ScratchCard.Award.Known Y;
    public final Function0 Z;
    public final MutableState b0;
    public final Function1 c0;

    public c(e e0, ScratchCard.Award.Known scratchCard$Award$Known0, Function0 function00, MutableState mutableState0, Function1 function10) {
        this.X = e0;
        this.Y = scratchCard$Award$Known0;
        this.Z = function00;
        this.b0 = mutableState0;
        this.c0 = function10;
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        j.f(((q0)object0), "it");
        Object object3 = t.a;
        if((v & 17) == 16 && ((p)object1).x()) {
            ((p)object1).K();
            return object3;
        }
        Modifier modifier0 = androidx.compose.foundation.layout.c.c(a.l(l.X, 16.0f, 0.0f, 2), 1.0f);
        ((p)object1).Q(-1003410150);
        ((p)object1).Q(212064437);
        ((p)object1).p(false);
        Density density0 = (Density)((p)object1).k(f0.f);
        Object object4 = ((p)object1).G();
        Z z0 = U.l.a;
        if(object4 == z0) {
            object4 = new g1.j(density0);
            ((p)object1).a0(object4);
        }
        Object object5 = ((p)object1).G();
        if(object5 == z0) {
            object5 = new g();
            ((p)object1).a0(object5);
        }
        Object object6 = ((p)object1).G();
        if(object6 == z0) {
            object6 = d.D(Boolean.FALSE, Z.e);
            ((p)object1).a0(object6);
        }
        Object object7 = ((p)object1).G();
        if(object7 == z0) {
            object7 = new i(((g)object5));
            ((p)object1).a0(object7);
        }
        Object object8 = ((p)object1).G();
        if(object8 == z0) {
            object8 = d.D(object3, Z.b);
            ((p)object1).a0(object8);
        }
        boolean z1 = ((p)object1).h(((g1.j)object4));
        boolean z2 = ((p)object1).d(0x101);
        Object object9 = ((p)object1).G();
        if((z1 | z2) != 0 || object9 == z0) {
            object9 = new v(((MutableState)object8), ((g1.j)object4), ((i)object7), ((MutableState)object6));
            ((p)object1).a0(object9);
        }
        Object object10 = ((p)object1).G();
        if(object10 == z0) {
            object10 = new D.j(((MutableState)object6), 1, ((i)object7));
            ((p)object1).a0(object10);
        }
        boolean z3 = ((p)object1).h(((g1.j)object4));
        Object object11 = ((p)object1).G();
        if(z3 || object11 == z0) {
            object11 = new Bb.a(7, ((g1.j)object4));
            ((p)object1).a0(object11);
        }
        b0.a(k.a(modifier0, false, ((Function1)object11)), c0.c.c(1200550679, new w(((MutableState)object8), ((g)object5), ((Function0)object10), this.X, this.Y, this.Z, this.b0, this.c0), ((p)object1)), ((K)object9), ((p)object1), 0x30);
        ((p)object1).p(false);
        com.wave.customer.scratchCardRewards.d.e(0, ((p)object1), this.X.a && this.Y != null);
        return object3;
    }
}

