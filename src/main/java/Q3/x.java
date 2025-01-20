package Q3;

import Ha.S;
import N2.l;
import N3.T;
import N3.b;
import Nb.j;
import Nb.w;
import O3.k;
import V3.a;
import ac.G0;
import ac.h;
import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.ExecutionContext.Element;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.Query.Data;
import com.apollographql.apollo.api.Query;
import java.util.Set;

public final class x implements b, a {
    public final q a;

    public x(q q0) {
        this.a = q0;
    }

    @Override  // V3.a
    public final h a(ApolloRequest apolloRequest0, V3.b b0) {
        Set set0;
        j.f(apolloRequest0, "request");
        T t0 = (T)apolloRequest0.getExecutionContext().get(T.b);
        if(t0 == null) {
            return b0.a(apolloRequest0);
        }
        if(!(apolloRequest0.getOperation() instanceof Query)) {
            throw new IllegalStateException("It\'s impossible to watch a mutation or subscription");
        }
        Element executionContext$Element0 = apolloRequest0.getExecutionContext().get(CustomScalarAdapters.Key);
        j.c(executionContext$Element0);
        w w0 = new w();  // initializer: Ljava/lang/Object;-><init>()V
        q q0 = this.a;
        Data query$Data0 = t0.a;
        if(query$Data0 == null) {
            set0 = null;
        }
        else {
            Operation operation0 = apolloRequest0.getOperation();
            j.f(operation0, "operation");
            set0 = k.a(k.c(operation0, query$Data0, ((CustomScalarAdapters)executionContext$Element0), q0.a).values());
        }
        w0.X = set0;
        j.d(q0.d, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlow<kotlin.Any>");
        v v0 = new v(2, null);  // initializer: LFb/j;-><init>(ILkotlin/coroutines/g;)V
        return new l(new y(new u(new S(new G0(q0.d, v0), 4, w0), apolloRequest0, b0, w0, this, ((CustomScalarAdapters)executionContext$Element0)), null));
    }
}

