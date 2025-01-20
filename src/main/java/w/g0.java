package w;

import M0.t;
import android.os.Build.VERSION;
import androidx.compose.foundation.MagnifierElement;
import androidx.compose.ui.Modifier;
import g0.l;
import kotlin.jvm.functions.Function1;

public abstract class g0 {
    public static final t a;

    static {
        g0.a = new t("MagnifierPositionInRoot");
    }

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static Modifier b(Function1 function10, Function1 function11, r0 r00) {
        Modifier modifier0 = l.X;
        return g0.a() ? new MagnifierElement(function10, null, function11, NaNf, true, 0x7FC000007FC00000L, NaNf, NaNf, true, r00) : modifier0;
    }
}

