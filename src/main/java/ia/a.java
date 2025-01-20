package ia;

import Ab.t;
import U.d;
import U.p;
import androidx.compose.ui.Modifier;
import com.sendwave.models.CurrencyAmount;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final class a implements Function2 {
    public final CurrencyAmount X;
    public final boolean Y;
    public final Function0 Z;
    public final Modifier b0;
    public final long c0;
    public final int d0;

    public a(CurrencyAmount currencyAmount0, boolean z, Function0 function00, Modifier modifier0, long v, int v1) {
        this.X = currencyAmount0;
        this.Y = z;
        this.Z = function00;
        this.b0 = modifier0;
        this.c0 = v;
        this.d0 = v1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((Integer)object1).getClass();
        c.a(this.X, this.Y, this.Z, this.b0, this.c0, ((p)object0), d.O(this.d0 | 1));
        return t.a;
    }
}

