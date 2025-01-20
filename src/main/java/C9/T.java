package c9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledGraphQL;
import d9.Z1;
import d9.i2;
import d9.n1;
import java.util.List;

public abstract class t {
    public static final List a;

    static {
        List list0 = q.K(new Builder("succeeded", CompiledGraphQL.-notNull(n1.a)).build());
        Builder compiledField$Builder0 = new Builder("logout", Z1.a);
        t.a = o.C(new CompiledArgument[]{o.r("insecureCurrentlyLoggedInUserMobiles", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.c0)), o.r("reportedOpaqueIDs", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.d0))}, compiledField$Builder0, list0);
    }
}

