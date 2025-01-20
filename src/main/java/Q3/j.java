package Q3;

import Ab.t;
import N3.I;
import W5.f;
import ac.i;
import com.apollographql.apollo.api.ApolloResponse.Builder;
import com.apollographql.apollo.api.ApolloResponse;
import kotlin.coroutines.g;
import rb.a;

public final class j implements i {
    public final int X;
    public final i Y;
    public final long Z;

    public j(i i0, long v, int v1) {
        this.X = v1;
        this.Y = i0;
        this.Z = v;
        super();
    }

    @Override  // ac.i
    public final Object c(Object object0, g g0) {
        Q3.i i0;
        a a0;
        if(this.X != 0) {
            if(g0 instanceof a) {
                a0 = (a)g0;
                int v = a0.c0;
                if((v & 0x80000000) == 0) {
                    a0 = new a(this, g0);
                }
                else {
                    a0.c0 = v ^ 0x80000000;
                }
            }
            else {
                a0 = new a(this, g0);
            }
            Object object1 = a0.b0;
            Object object2 = Eb.a.X;
            switch(a0.c0) {
                case 0: {
                    f.b0(object1);
                    Integer integer0 = new Integer(((int)(((Number)object0).longValue() - this.Z)) / 1000);
                    a0.c0 = 1;
                    return this.Y.c(integer0, a0) != object2 ? t.a : object2;
                }
                case 1: {
                    f.b0(object1);
                    return t.a;
                }
                default: {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
            }
        }
        if(g0 instanceof Q3.i) {
            i0 = (Q3.i)g0;
            int v1 = i0.c0;
            if((v1 & 0x80000000) == 0) {
                i0 = new Q3.i(this, g0);
            }
            else {
                i0.c0 = v1 ^ 0x80000000;
            }
        }
        else {
            i0 = new Q3.i(this, g0);
        }
        Object object3 = i0.b0;
        Object object4 = Eb.a.X;
        switch(i0.c0) {
            case 0: {
                f.b0(object3);
                Builder apolloResponse$Builder0 = ((ApolloResponse)object0).newBuilder();
                i0.c0 = 1;
                return this.Y.c(I.a(apolloResponse$Builder0, new N3.f(0L, 0L, this.Z, System.currentTimeMillis(), false, ((ApolloResponse)object0).exception)).build(), i0) != object4 ? t.a : object4;
            }
            case 1: {
                f.b0(object3);
                return t.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

