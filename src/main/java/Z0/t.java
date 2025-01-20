package z0;

import Bb.z;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import kotlin.jvm.functions.Function2;

public abstract class t {
    public static final f a;

    static {
        t.a = new f(z.X, null);
    }

    public static final Modifier a(Modifier modifier0, Object object0, Function2 function20) {
        return modifier0.d(new SuspendPointerInputElement(object0, null, function20, 6));
    }
}

