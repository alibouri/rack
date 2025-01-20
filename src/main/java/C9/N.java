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

public abstract class n {
    public static final List a;

    static {
        List list0 = q.K(new Builder("success", CompiledGraphQL.-notNull(n1.a)).build());
        Builder compiledField$Builder0 = new Builder("confirmMagicLinkSecurityChallengeOnLogin", r0.a);
        n.a = o.C(new CompiledArgument[]{o.r("autofilled", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.L1)), o.r("magicLinkSecret", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.M1)), o.r("referrer", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.N1)), o.r("smsTokenId", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.O1))}, compiledField$Builder0, list0);
    }
}

