package E;

import Ab.t;
import Eb.a;
import Fb.c;
import N4.j;
import W5.f;
import androidx.compose.ui.Modifier;
import com.apollographql.apollo.api.b;
import g0.m;
import kotlin.coroutines.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class d implements m {
    public boolean X;
    public k Y;

    @Override  // androidx.compose.ui.Modifier
    public final Modifier d(Modifier modifier0) {
        return b.c(this, modifier0);
    }

    @Override  // androidx.compose.ui.Modifier
    public final boolean i(Function1 function10) {
        return ((Boolean)function10.n(this)).booleanValue();
    }

    public final Object k(c c0) {
        k k2;
        E.c c1;
        if(c0 instanceof E.c) {
            c1 = (E.c)c0;
            int v = c1.e0;
            if((v & 0x80000000) == 0) {
                c1 = new E.c(this, c0);
            }
            else {
                c1.e0 = v ^ 0x80000000;
            }
        }
        else {
            c1 = new E.c(this, c0);
        }
        Object object0 = c1.c0;
        Object object1 = a.X;
        Object object2 = t.a;
        switch(c1.e0) {
            case 0: {
                f.b0(object0);
                if(!this.X) {
                    k k0 = this.Y;
                    c1.b0 = k0;
                    c1.e0 = 1;
                    k k1 = new k(j.w(c1));
                    this.Y = k1;
                    if(k1.c() == object1) {
                        return object1;
                    }
                    k2 = k0;
                    goto label_27;
                }
                break;
            }
            case 1: {
                k2 = c1.b0;
                f.b0(object0);
            label_27:
                if(k2 != null) {
                    k2.i(object2);
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return object2;
    }

    @Override  // androidx.compose.ui.Modifier
    public final Object l(Object object0, Function2 function20) {
        return function20.j(object0, this);
    }
}

