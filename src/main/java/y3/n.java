package Y3;

import N2.l;
import Nb.j;
import X3.a;
import ac.h;
import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.ApolloResponse.Builder;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.ExecutionContext.Element;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.http.DefaultHttpRequestComposer;
import com.apollographql.apollo.api.http.HttpRequest;
import java.util.ArrayList;
import java.util.UUID;

public final class n implements a {
    public final DefaultHttpRequestComposer a;
    public final b b;
    public final ArrayList c;
    public final boolean d;
    public final f e;

    public n(DefaultHttpRequestComposer defaultHttpRequestComposer0, b b0, ArrayList arrayList0, boolean z) {
        this.a = defaultHttpRequestComposer0;
        this.b = b0;
        this.c = arrayList0;
        this.d = z;
        this.e = new f(this);
    }

    @Override  // X3.a
    public final void a() {
        for(Object object0: this.c) {
            ((e)object0).getClass();
        }
        this.b.close();
    }

    @Override  // X3.a
    public final h b(ApolloRequest apolloRequest0) {
        j.f(apolloRequest0, "request");
        Element executionContext$Element0 = apolloRequest0.getExecutionContext().get(CustomScalarAdapters.Key);
        j.c(executionContext$Element0);
        HttpRequest httpRequest0 = this.a.compose(apolloRequest0);
        j.f(httpRequest0, "httpRequest");
        return new l(new i(this, httpRequest0, apolloRequest0, ((CustomScalarAdapters)executionContext$Element0), null));
    }

    public static ApolloResponse c(Operation operation0, U3.b b0) {
        UUID uUID0 = UUID.randomUUID();
        j.e(uUID0, "randomUUID(...)");
        return new Builder(operation0, uUID0).exception(b0).isLast(true).build();
    }
}

