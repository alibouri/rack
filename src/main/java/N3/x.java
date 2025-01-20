package N3;

import Ab.t;
import Eb.a;
import Fb.j;
import Nb.w;
import V3.b;
import W5.f;
import ac.H;
import ac.h;
import ac.i;
import ac.o0;
import com.apollographql.apollo.api.ApolloRequest.Builder;
import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.ApolloResponse;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class x extends j implements Function2 {
    public w c0;
    public int d0;
    public Object e0;
    public final b f0;
    public final ApolloRequest g0;

    public x(b b0, ApolloRequest apolloRequest0, g g0) {
        this.f0 = b0;
        this.g0 = apolloRequest0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((x)this.t(((i)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new x(this.f0, this.g0, g0);
        g1.e0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        i i2;
        w w0;
        i i0;
        Object object1 = a.X;
        b b0 = this.f0;
        Object object2 = t.a;
        ApolloRequest apolloRequest0 = this.g0;
        switch(this.d0) {
            case 0: {
                f.b0(object0);
                i0 = (i)this.e0;
                w0 = new w();  // initializer: Ljava/lang/Object;-><init>()V
                h h0 = b0.a(apolloRequest0);
                N3.w w1 = new N3.w(w0, null);
                this.e0 = i0;
                this.c0 = w0;
                this.d0 = 1;
                o0.r(i0);
                Object object3 = h0.d(new H(new v(i0, w0, 0), w1), this);
                if(object3 != object1) {
                    object3 = object2;
                }
                if(object3 != object1) {
                    object3 = object2;
                }
                if(object3 != object1) {
                    object3 = object2;
                }
                if(object3 == object1) {
                    return object1;
                }
                goto label_30;
            }
            case 1: {
                w0 = this.c0;
                i i1 = (i)this.e0;
                f.b0(object0);
                i0 = i1;
            label_30:
                if(w0.X == null) {
                    return object2;
                }
                Builder apolloRequest$Builder0 = apolloRequest0.newBuilder();
                I.b(apolloRequest$Builder0);
                h h1 = b0.a(apolloRequest$Builder0.build());
                this.e0 = i0;
                this.c0 = null;
                this.d0 = 2;
                Object object4 = o0.C(h1, this);
                if(object4 == object1) {
                    return object1;
                }
                i2 = i0;
                object0 = object4;
                break;
            }
            case 2: {
                i2 = (i)this.e0;
                f.b0(object0);
                break;
            }
            case 3: {
                f.b0(object0);
                return object2;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        this.e0 = null;
        this.d0 = 3;
        return i2.c(((ApolloResponse)object0), this) == object1 ? object1 : object2;
    }
}

