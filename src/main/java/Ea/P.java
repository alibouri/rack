package Ea;

import Ab.t;
import Bb.F;
import I2.J;
import U5.a;
import androidx.compose.ui.Modifier;
import com.wave.customer.scratchCardRewards.ScratchCard.Award.Known;
import com.wave.customer.scratchCardRewards.d;
import hb.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import oa.b;
import ra.S0;

public final class p implements Function2 {
    public final int X;
    public final boolean Y;
    public final int Z;
    public final Object b0;
    public final Object c0;

    public p(Object object0, Object object1, boolean z, int v, int v1) {
        this.X = v1;
        this.b0 = object0;
        this.c0 = object1;
        this.Y = z;
        this.Z = v;
        super();
    }

    public p(S0 s00, boolean z, Function0 function00, int v) {
        this.X = 4;
        super();
        this.b0 = s00;
        this.Y = z;
        this.c0 = function00;
        this.Z = v;
    }

    public p(boolean z, Object object0, Object object1, int v, int v1) {
        this.X = v1;
        this.Y = z;
        this.b0 = object0;
        this.c0 = object1;
        this.Z = v;
        super();
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        switch(this.X) {
            case 0: {
                ((Integer)object1).getClass();
                d.j(this.Y, ((ScratchCard.Award.Known)this.b0), ((Modifier)this.c0), ((U.p)object0), U.d.O(this.Z | 1));
                return t.a;
            }
            case 1: {
                ((Integer)object1).getClass();
                h.k(this.Y, ((String)this.b0), ((String)this.c0), ((U.p)object0), U.d.O(this.Z | 1));
                return t.a;
            }
            case 2: {
                ((Integer)object1).getClass();
                F.e(((v3.p)this.b0), ((Modifier)this.c0), this.Y, ((U.p)object0), U.d.O(this.Z | 1));
                return t.a;
            }
            case 3: {
                J.e(((b)this.b0), ((Function0)this.c0), this.Y, ((U.p)object0), U.d.O(this.Z | 1));
                return t.a;
            }
            default: {
                a.p(((S0)this.b0), this.Y, ((Function0)this.c0), ((U.p)object0), U.d.O(this.Z | 1));
                return t.a;
            }
        }
    }
}

