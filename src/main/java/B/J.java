package B;

import Nb.k;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function2;

public final class j extends k implements Function2 {
    public static final j X;

    static {
        j.X = new j(2);  // initializer: LNb/k;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        int v = ((Number)object0).intValue();
        return Math.round((1.0f + (((LayoutDirection)object1) == LayoutDirection.X ? -1.0f : 1.0f)) * (((float)v) / 2.0f));
    }
}

