package G0;

import U.d;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import g0.o;
import g0.p;
import kotlin.coroutines.CoroutineContext.Element.DefaultImpls;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext.Key;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

public final class u0 implements p {
    public final ParcelableSnapshotMutableFloatState X;

    public u0() {
        this.X = d.B(1.0f);
    }

    @Override  // g0.p
    public final float O() {
        return this.X.k();
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
        return o.X;
    }

    @Override  // kotlin.coroutines.CoroutineContext
    public final Element l(Key coroutineContext$Key0) {
        return DefaultImpls.b(this, coroutineContext$Key0);
    }

    @Override  // kotlin.coroutines.CoroutineContext
    public final CoroutineContext r(CoroutineContext coroutineContext0) {
        return DefaultImpls.d(this, coroutineContext0);
    }
}

