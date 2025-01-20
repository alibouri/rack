package c9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledGraphQL;
import d9.i2;
import d9.n1;
import d9.r0;
import java.util.List;

public abstract class m {
    public static final List a;

    static {
        List list0 = q.K(new Builder("success", CompiledGraphQL.-notNull(n1.a)).build());
        Builder compiledField$Builder0 = new Builder("confirmMagicLinkSecurityChallenge", r0.a);
        m.a = o.C(new CompiledArgument[]{o.r("autofilled", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.I1)), o.r("magicLinkSecret", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.J1)), o.r("referrer", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.K1))}, compiledField$Builder0, list0);
    }
}

