package da;

import Ab.t;
import O0.O;
import T4.l;
import U.d;
import U.p;
import androidx.compose.ui.Modifier;
import c0.b;
import com.sendwave.models.CurrencyAmount;
import g0.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import t9.a;
import wa.j;

public final class f implements Function2 {
    public final int X;
    public final Object Y;
    public final Object Z;
    public final int b0;
    public final int c0;
    public final Object d0;

    public f(int v, Modifier modifier0, Function0 function00, b b0, int v1) {
        this.X = 0;
        super();
        this.b0 = v;
        this.Z = modifier0;
        this.Y = function00;
        this.d0 = b0;
        this.c0 = v1;
    }

    public f(O0.f f0, Function0 function00, Modifier modifier0, int v, int v1) {
        this.X = 1;
        super();
        this.d0 = f0;
        this.Y = function00;
        this.Z = modifier0;
        this.b0 = v;
        this.c0 = v1;
    }

    public f(Object object0, Object object1, Object object2, int v, int v1, int v2) {
        this.X = v2;
        this.Z = object0;
        this.Y = object1;
        this.d0 = object2;
        this.b0 = v;
        this.c0 = v1;
        super();
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        switch(this.X) {
            case 0: {
                ((Integer)object1).getClass();
                W5.f.a(this.b0, ((Modifier)this.Z), ((Function0)this.Y), ((b)this.d0), ((p)object0), d.O(this.c0 | 1));
                return t.a;
            }
            case 1: {
                ((Integer)object1).getClass();
                M6.b.c(((O0.f)this.d0), ((Function0)this.Y), ((Modifier)this.Z), ((p)object0), d.O(this.b0 | 1), this.c0);
                return t.a;
            }
            case 2: {
                ((Integer)object1).getClass();
                l.f(((CurrencyAmount)this.Z), ((Function0)this.Y), ((Function0)this.d0), ((p)object0), d.O(this.b0 | 1), this.c0);
                return t.a;
            }
            case 3: {
                ((Integer)object1).getClass();
                yc.d.e(((a)this.Z), ((O)this.Y), ((e)this.d0), ((p)object0), d.O(this.b0 | 1), this.c0);
                return t.a;
            }
            default: {
                ((Integer)object1).getClass();
                j.a(((Modifier)this.Z), ((String)this.Y), ((s0.b)this.d0), ((p)object0), d.O(this.b0 | 1), this.c0);
                return t.a;
            }
        }
    }
}

