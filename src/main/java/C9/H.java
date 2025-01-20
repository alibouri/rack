package c9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import d9.H;
import d9.N;
import d9.R2;
import d9.X0;
import d9.n1;
import d9.r1;
import java.util.List;

public abstract class h {
    public static final List a;

    static {
        List list0 = q.L(new CompiledField[]{new Builder("label", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("value", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("isDisplayedAfterOtherFields", CompiledGraphQL.-notNull(n1.a)).build()});
        List list1 = q.L(new CompiledField[]{new Builder("name", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("value", CompiledGraphQL.-notNull(r1.a)).build()});
        List list2 = q.L(new CompiledField[]{new Builder("displayFields", o.t(X0.a)).selections(list0).build(), new Builder("confirmedFields", o.t(N.a)).selections(list1).build()});
        List list3 = q.K(new Builder("clientId", r1.a).build());
        List list4 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("BillConfirmationActual", q.K("BillConfirmationActual")).selections(list2).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("AsyncPending", q.K("AsyncPending")).selections(list3).build()});
        Builder compiledField$Builder0 = new Builder("billConfirmationPolling", CompiledGraphQL.-notNull(H.a));
        h.a = o.C(new CompiledArgument[]{o.r("billTypeId", new com.apollographql.apollo.api.CompiledArgument.Builder(R2.g)), o.r("partialFields", new com.apollographql.apollo.api.CompiledArgument.Builder(R2.h)), o.r("partnerQueryId", new com.apollographql.apollo.api.CompiledArgument.Builder(R2.i))}, compiledField$Builder0, list4);
    }
}

