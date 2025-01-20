package U;

import Fb.c;
import Xb.J;
import dc.o;
import kotlin.coroutines.CoroutineContext.Element.DefaultImpls;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext.Key;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class w0 implements T {
    public static final w0 X;

    static {
        w0.X = new w0();  // initializer: Ljava/lang/Object;-><init>()V
    }

    @Override  // kotlin.coroutines.CoroutineContext
    public final CoroutineContext S(Key coroutineContext$Key0) {
        return DefaultImpls.c(this, coroutineContext$Key0);
    }

    @Override  // kotlin.coroutines.CoroutineContext
    public final Object fold(Object object0, Function2 function20) {
        return DefaultImpls.a(this, object0, function20);
    }

    @Override  // kotlin.coroutines.CoroutineContext$Element
    public final Key getKey() {
        return S.X;
    }

    @Override  // kotlin.coroutines.CoroutineContext
    public final Element l(Key coroutineContext$Key0) {
        return DefaultImpls.b(this, coroutineContext$Key0);
    }

    @Override  // kotlin.coroutines.CoroutineContext
    public final CoroutineContext r(CoroutineContext coroutineContext0) {
        return DefaultImpls.d(this, coroutineContext0);
    }

    @Override  // U.T
    public final Object v(Function1 function10, c c0) {
        v0 v00 = new v0(function10, null);
        return J.y(o.a, v00, c0);
    }
}

