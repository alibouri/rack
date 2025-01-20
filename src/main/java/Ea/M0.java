package Ea;

import Ab.t;
import N4.o;
import Qa.z;
import R9.w2;
import U.d;
import U.p;
import androidx.compose.ui.Modifier;
import com.wave.customer.scratchCardRewards.components.g;
import com.wave.customer.scratchCardRewards.j;
import hb.h;
import kotlin.jvm.functions.Function2;

public final class m0 implements Function2 {
    public final int X;
    public final Modifier Y;
    public final int Z;

    public m0(int v, int v1, Modifier modifier0) {
        this.X = v1;
        this.Y = modifier0;
        this.Z = v;
        super();
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((Integer)object1).getClass();
        switch(this.X) {
            case 0: {
                j.g(this.Y, ((p)object0), d.O(this.Z | 1));
                return t.a;
            }
            case 1: {
                g.u(this.Y, ((p)object0), d.O(this.Z | 1));
                return t.a;
            }
            case 2: {
                g.o(this.Y, ((p)object0), d.O(this.Z | 1));
                return t.a;
            }
            case 3: {
                z.b(this.Y, ((p)object0), d.O(this.Z | 1));
                return t.a;
            }
            case 4: {
                w2.a(this.Y, ((p)object0), d.O(this.Z | 1));
                return t.a;
            }
            case 5: {
                o.g(this.Y, ((p)object0), d.O(this.Z | 1));
                return t.a;
            }
            default: {
                h.o(this.Y, ((p)object0), d.O(this.Z | 1));
                return t.a;
            }
        }
    }
}

