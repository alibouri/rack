package Y3;

import Ab.t;
import Eb.a;
import Fb.j;
import U3.b;
import W5.f;
import ac.i;
import com.apollographql.apollo.api.ApolloResponse.Builder;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.Operation;
import java.util.UUID;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function3;

public final class m extends j implements Function3 {
    public int c0;
    public i d0;
    public Throwable e0;
    public final Operation f0;

    public m(Operation operation0, g g0) {
        this.f0 = operation0;
        super(3, g0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        m m0 = new m(this.f0, ((g)object2));
        m0.d0 = (i)object0;
        m0.e0 = (Throwable)object1;
        return m0.v(t.a);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                i i0 = this.d0;
                Throwable throwable0 = this.e0;
                if(throwable0 instanceof b) {
                    UUID uUID0 = UUID.randomUUID();
                    Nb.j.e(uUID0, "randomUUID(...)");
                    ApolloResponse apolloResponse0 = new Builder(this.f0, uUID0).exception(((b)throwable0)).build();
                    this.d0 = null;
                    this.c0 = 1;
                    if(i0.c(apolloResponse0, this) == object1) {
                        return object1;
                    }
                }
                return t.a;
            }
            case 1: {
                f.b0(object0);
                return t.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

