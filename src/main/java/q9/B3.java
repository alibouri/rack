package q9;

import Eb.a;
import W5.f;
import Xb.Q;
import ac.h;
import ac.i;
import kotlin.coroutines.g;

public final class b3 implements h {
    public final long X;

    public b3(long v) {
        this.X = v;
    }

    @Override  // ac.h
    public final Object d(i i0, g g0) {
        long v2;
        b3 b30;
        a3 a30;
        if(g0 instanceof a3) {
            a30 = (a3)g0;
            int v = a30.g0;
            if((v & 0x80000000) == 0) {
                a30 = new a3(this, g0);
            }
            else {
                a30.g0 = v ^ 0x80000000;
            }
        }
        else {
            a30 = new a3(this, g0);
        }
        Object object0 = a30.e0;
        Object object1 = a.X;
        switch(a30.g0) {
            case 0: {
                f.b0(object0);
                long v1 = System.currentTimeMillis();
                a30.b0 = this;
                a30.c0 = i0;
                a30.d0 = v1;
                a30.g0 = 1;
                if(i0.c(new Long(v1), a30) == object1) {
                    return object1;
                }
                b30 = this;
                v2 = v1;
                goto label_39;
            }
            case 2: {
                i0 = a30.c0;
                b30 = a30.b0;
                f.b0(object0);
                break;
            }
            case 1: 
            case 3: {
                v2 = a30.d0;
                i0 = a30.c0;
                b30 = a30.b0;
                f.b0(object0);
                goto label_39;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            v2 = System.currentTimeMillis();
            a30.b0 = b30;
            a30.c0 = i0;
            a30.d0 = v2;
            a30.g0 = 3;
            if(i0.c(new Long(v2), a30) == object1) {
                return object1;
            }
        label_39:
            a30.b0 = b30;
            a30.c0 = i0;
            a30.g0 = 2;
        }
        while(Q.b((v2 + b30.X) / b30.X * b30.X - System.currentTimeMillis(), a30) != object1);
        return object1;
    }
}

