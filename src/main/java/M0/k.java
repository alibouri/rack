package M0;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;

public abstract class k {
    public static final AtomicInteger a;

    static {
        k.a = new AtomicInteger(0);
    }

    public static final Modifier a(Modifier modifier0, boolean z, Function1 function10) {
        return modifier0.d(new AppendedSemanticsElement(function10, z));
    }
}

