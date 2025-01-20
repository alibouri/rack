package I2;

import E7.s;
import Nb.j;
import Xb.I;
import f1.l;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public abstract class u {
    public static final l a(Executor executor0, String s, Function0 function00) {
        j.f(executor0, "<this>");
        return J.C(new s(executor0, s, function00, 1));
    }

    public static l b(CoroutineContext coroutineContext0, Function2 function20) {
        j.f(coroutineContext0, "context");
        return J.C(new s(coroutineContext0, I.X, function20));
    }
}

