package c9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledGraphQL;
import d9.d3;
import d9.i2;
import d9.p1;
import java.util.List;

public abstract class v0 {
    public static final List a;

    static {
        List list0 = q.K(new Builder("robocallId", CompiledGraphQL.-notNull(p1.a)).build());
        Builder compiledField$Builder0 = new Builder("requestRobocall", d3.a);
        v0.a = o.B("tokenId", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.R0), compiledField$Builder0, list0);
    }
}

