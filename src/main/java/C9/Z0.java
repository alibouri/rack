package c9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledGraphQL;
import d9.g3;
import d9.i2;
import d9.n1;
import java.util.List;

public abstract class z0 {
    public static final List a;

    static {
        List list0 = q.K(new Builder("hadPinBefore", CompiledGraphQL.-notNull(n1.a)).build());
        Builder compiledField$Builder0 = new Builder("resetPin", g3.a);
        z0.a = o.C(new CompiledArgument[]{o.r("device", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.P1)), o.r("pin", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.Q1)), o.r("previousPin", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.R1))}, compiledField$Builder0, list0);
    }
}

