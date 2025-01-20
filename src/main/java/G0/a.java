package g0;

import B.L0;
import U.p;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexElement;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

public abstract class a {
    public static final d a;
    public static final d b;
    public static final StackTraceElement[] c;

    static {
        a.a = new d(-1.0f);
        a.b = new d(1.0f);
        a.c = new StackTraceElement[0];
    }

    public static final boolean a(Object object0, Object object1) {
        return object0.getClass() == object1.getClass();
    }

    public static final Modifier b(Modifier modifier0, Function1 function10, Function3 function30) {
        return modifier0.d(new j(function10, function30));
    }

    public static final Modifier c(p p0, Modifier modifier0) {
        if(modifier0.i(k.X)) {
            return modifier0;
        }
        p0.R(1219399079);
        L0 l00 = new L0(17, p0);
        Modifier modifier1 = (Modifier)modifier0.l(l.X, l00);
        p0.p(false);
        return modifier1;
    }

    public static final Modifier d(p p0, Modifier modifier0) {
        p0.Q(0x1A365F2C);
        Modifier modifier1 = a.c(p0, modifier0);
        p0.p(false);
        return modifier1;
    }

    public static final Modifier e(Modifier modifier0, float f) {
        return modifier0.d(new ZIndexElement(f));
    }
}

