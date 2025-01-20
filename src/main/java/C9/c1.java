package c9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledGraphQL;
import d9.R4;
import d9.i2;
import d9.n1;
import java.util.List;

public abstract class c1 {
    public static final List a;

    static {
        List list0 = q.K(new Builder("ok", CompiledGraphQL.-notNull(n1.a)).build());
        Builder compiledField$Builder0 = new Builder("verifyPinRecoveryAuthCode", R4.a);
        c1.a = o.C(new CompiledArgument[]{o.r("autofilled", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.J)), o.r("code", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.K)), o.r("tokenId", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.L))}, compiledField$Builder0, list0);
    }
}

