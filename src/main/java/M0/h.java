package M0;

import Nb.k;
import kotlin.jvm.functions.Function0;
import m5.b;

public final class h {
    public final k a;
    public final k b;
    public final boolean c;

    public h(Function0 function00, Function0 function01, boolean z) {
        this.a = (k)function00;
        this.b = (k)function01;
        this.c = z;
    }

    public final Function0 a() {
        return this.b;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ScrollAxisRange(value=");
        stringBuilder0.append(((Number)((Function0)this.a).invoke()).floatValue());
        stringBuilder0.append(", maxValue=");
        stringBuilder0.append(((Number)((Function0)this.b).invoke()).floatValue());
        stringBuilder0.append(", reverseScrolling=");
        return b.z(stringBuilder0, this.c, ')');
    }
}

