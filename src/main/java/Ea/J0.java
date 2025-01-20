package Ea;

import Ab.t;
import M6.b;
import U.d;
import U.p;
import Wa.f;
import androidx.compose.ui.Modifier;
import com.sendwave.models.CurrencyAmount;
import com.wave.customer.scratchCardRewards.j;
import ha.l;
import ha.m;
import io.sentry.config.a;
import io.sentry.g1;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class j0 implements Function2 {
    public final int X;
    public final boolean Y;
    public final int Z;
    public final Object b0;
    public final Object c0;
    public final Object d0;

    public j0(g1 g10, Function0 function00, CurrencyAmount currencyAmount0, boolean z, int v) {
        this.X = 0;
        super();
        this.b0 = g10;
        this.c0 = function00;
        this.d0 = currencyAmount0;
        this.Y = z;
        this.Z = v;
    }

    public j0(List list0, Modifier modifier0, boolean z, Function1 function10, int v) {
        this.X = 3;
        super();
        this.b0 = list0;
        this.c0 = modifier0;
        this.Y = z;
        this.d0 = function10;
        this.Z = v;
    }

    public j0(Function0 function00, Modifier modifier0, boolean z, f f0, int v) {
        this.X = 2;
        super();
        this.c0 = function00;
        this.b0 = modifier0;
        this.Y = z;
        this.d0 = f0;
        this.Z = v;
    }

    public j0(boolean z, l l0, m m0, l l1, int v) {
        this.X = 1;
        super();
        this.Y = z;
        this.b0 = l0;
        this.c0 = m0;
        this.d0 = l1;
        this.Z = v;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        Object object2 = t.a;
        Object object3 = this.c0;
        Object object4 = this.d0;
        Object object5 = this.b0;
        int v = this.Z;
        switch(this.X) {
            case 0: {
                ((Integer)object1).getClass();
                j.b(((g1)object5), ((Function0)object3), ((CurrencyAmount)object4), this.Y, ((p)object0), d.O(v | 1));
                return object2;
            }
            case 1: {
                ((Integer)object1).getClass();
                a.b(this.Y, ((l)object5), ((m)object3), ((l)object4), ((p)object0), d.O(v | 1));
                return object2;
            }
            case 2: {
                ((Integer)object1).getClass();
                b.m(((Function0)object3), ((Modifier)object5), this.Y, ((f)object4), ((p)object0), d.O(v | 1));
                return object2;
            }
            default: {
                ((Integer)object1).getClass();
                T4.l.h(((List)object5), ((Modifier)object3), this.Y, ((Function1)object4), ((p)object0), d.O(v | 1));
                return object2;
            }
        }
    }
}

