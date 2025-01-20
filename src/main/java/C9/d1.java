package c9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledGraphQL;
import d9.S4;
import d9.i2;
import d9.n1;
import java.util.List;

public abstract class d1 {
    public static final List a;

    static {
        List list0 = q.K(new Builder("success", CompiledGraphQL.-notNull(n1.a)).build());
        Builder compiledField$Builder0 = new Builder("verifySMSToken", S4.a);
        d1.a = o.C(new CompiledArgument[]{o.r("autofilled", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.v)), o.r("code", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.w)), o.r("contactListFingerprint", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.x)), o.r("tokenId", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.y))}, compiledField$Builder0, list0);
    }
}

