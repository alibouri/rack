package c9;

import Y8.o;
import b9.H;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import d9.E1;
import d9.i2;
import d9.r1;
import d9.w0;
import java.util.List;

public abstract class q {
    public static final List a;

    static {
        List list0 = Bb.q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("LinkedAccount", Bb.q.K("LinkedAccount")).selections(H.a).build()});
        List list1 = o.A(new Builder("account", CompiledGraphQL.-notNull(E1.a)), list0);
        Builder compiledField$Builder0 = new Builder("createLinkedAccount", w0.a);
        q.a = o.C(new CompiledArgument[]{o.r("accountFields", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.C0)), o.r("accountTypeId", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.D0)), o.r("idempotencyKey", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.E0))}, compiledField$Builder0, list1);
    }
}

