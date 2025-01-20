package c9;

import Bb.q;
import Y8.o;
import b9.h;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import d9.Q;
import d9.R2;
import d9.r1;
import java.util.List;

public abstract class i {
    public static final List a;

    static {
        List list0 = q.K(new Builder("clientId", r1.a).build());
        List list1 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("BillInvoiceListActual", q.K("BillInvoiceListActual")).selections(h.a).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("AsyncPending", q.K("AsyncPending")).selections(list0).build()});
        Builder compiledField$Builder0 = new Builder("billInvoiceListPolling", CompiledGraphQL.-notNull(Q.a));
        i.a = o.C(new CompiledArgument[]{o.r("billTypeId", new com.apollographql.apollo.api.CompiledArgument.Builder(R2.j)), o.r("capabilities", new com.apollographql.apollo.api.CompiledArgument.Builder(R2.k)), o.r("partialFields", new com.apollographql.apollo.api.CompiledArgument.Builder(R2.l)), o.r("partnerQueryId", new com.apollographql.apollo.api.CompiledArgument.Builder(R2.m))}, compiledField$Builder0, list1);
    }
}

