package g0;

import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class l implements Modifier {
    public static final l X;

    static {
        l.X = new l();  // initializer: Ljava/lang/Object;-><init>()V
    }

    @Override  // androidx.compose.ui.Modifier
    public final Modifier d(Modifier modifier0) {
        return modifier0;
    }

    @Override  // androidx.compose.ui.Modifier
    public final boolean i(Function1 function10) {
        return true;
    }

    @Override  // androidx.compose.ui.Modifier
    public final Object l(Object object0, Function2 function20) {
        return object0;
    }

    @Override
    public final String toString() {
        return "Modifier";
    }
}

