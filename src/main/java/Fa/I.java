package Fa;

import Ab.t;
import U.d;
import U.p;
import androidx.compose.ui.Modifier;
import com.sendwave.models.CurrencyAmount;
import hb.h;
import ia.c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import lb.r;

public final class i implements Function2 {
    public final int X;
    public final long Y;
    public final int Z;
    public final Object b0;
    public final Object c0;
    public final Object d0;

    public i(e e0, String s, String s1, long v, int v1) {
        this.X = 0;
        super();
        this.b0 = e0;
        this.c0 = s;
        this.d0 = s1;
        this.Y = v;
        this.Z = v1;
    }

    public i(CurrencyAmount currencyAmount0, Modifier modifier0, long v, Z0.i i0, int v1) {
        this.X = 1;
        super();
        this.b0 = currencyAmount0;
        this.c0 = modifier0;
        this.Y = v;
        this.d0 = i0;
        this.Z = v1;
    }

    public i(r r0, long v, Function1 function10, Function0 function00, int v1) {
        this.X = 2;
        super();
        this.b0 = r0;
        this.Y = v;
        this.c0 = function10;
        this.d0 = function00;
        this.Z = v1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        switch(this.X) {
            case 0: {
                Integer integer1 = (Integer)object1;
                m.a(((e)this.b0), ((String)this.c0), ((String)this.d0), this.Y, ((p)object0), d.O(this.Z | 1));
                return t.a;
            }
            case 1: {
                ((Integer)object1).getClass();
                c.b(((CurrencyAmount)this.b0), ((Modifier)this.c0), this.Y, ((Z0.i)this.d0), ((p)object0), d.O(this.Z | 1));
                return t.a;
            }
            default: {
                Integer integer0 = (Integer)object1;
                h.f(((r)this.b0), this.Y, ((Function1)this.c0), ((Function0)this.d0), ((p)object0), d.O(this.Z | 1));
                return t.a;
            }
        }
    }
}

