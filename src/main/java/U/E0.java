package U;

import Ab.t;
import E7.u;
import Eb.a;
import Fb.c;
import N4.j;
import T0.G;
import W5.f;
import Xb.k;
import java.util.ArrayList;
import kotlin.coroutines.CoroutineContext.Element.DefaultImpls;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext.Key;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class e0 implements T {
    public final T X;
    public final u Y;

    public e0(T t0) {
        this.X = t0;
        u u0 = new u();  // initializer: Ljava/lang/Object;-><init>()V
        u0.b = new Object();
        u0.c = new ArrayList();
        u0.d = new ArrayList();
        u0.a = true;
        this.Y = u0;
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
        e0 e00;
        Object object2;
        d0 d00;
        if(c0 instanceof d0) {
            d00 = (d0)c0;
            int v = d00.f0;
            if((v & 0x80000000) == 0) {
                d00 = new d0(this, c0);
            }
            else {
                d00.f0 = v ^ 0x80000000;
            }
        }
        else {
            d00 = new d0(this, c0);
        }
        Object object0 = d00.d0;
        Object object1 = a.X;
        switch(d00.f0) {
            case 0: {
                f.b0(object0);
                u u0 = this.Y;
                d00.b0 = this;
                d00.c0 = function10;
                d00.f0 = 1;
                if(u0.j()) {
                    object2 = t.a;
                }
                else {
                    k k0 = new k(1, j.w(d00));
                    k0.v();
                    synchronized(u0.b) {
                        ((ArrayList)u0.c).add(k0);
                    }
                    k0.y(new G(u0, 3, k0));
                    object2 = k0.u();
                    if(object2 != object1) {
                        object2 = t.a;
                    }
                }
                if(object2 == object1) {
                    return object1;
                }
                e00 = this;
                break;
            }
            case 1: {
                function10 = d00.c0;
                e00 = d00.b0;
                f.b0(object0);
                break;
            }
            case 2: {
                f.b0(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        d00.b0 = null;
        d00.c0 = null;
        d00.f0 = 2;
        object0 = e00.X.v(function10, d00);
        return object0 == object1 ? object1 : object0;
    }
}

