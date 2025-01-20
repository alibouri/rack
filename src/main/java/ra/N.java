package ra;

import Ab.t;
import T4.l;
import U.d;
import U.p;
import androidx.compose.ui.Modifier;
import com.sendwave.models.CurrencyAmount;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final class n implements Function2 {
    public final boolean X;
    public final boolean Y;
    public final CurrencyAmount Z;
    public final boolean b0;
    public final String c0;
    public final Function0 d0;
    public final Function0 e0;
    public final Function0 f0;
    public final Modifier g0;
    public final int h0;

    public n(boolean z, boolean z1, CurrencyAmount currencyAmount0, boolean z2, String s, Function0 function00, Function0 function01, Function0 function02, Modifier modifier0, int v) {
        this.X = z;
        this.Y = z1;
        this.Z = currencyAmount0;
        this.b0 = z2;
        this.c0 = s;
        this.d0 = function00;
        this.e0 = function01;
        this.f0 = function02;
        this.g0 = modifier0;
        this.h0 = v;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((Integer)object1).getClass();
        l.b(this.X, this.Y, this.Z, this.b0, this.c0, this.d0, this.e0, this.f0, this.g0, ((p)object0), d.O(this.h0 | 1));
        return t.a;
    }
}

