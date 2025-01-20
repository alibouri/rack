package c9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledGraphQL;
import d9.i2;
import d9.r1;
import d9.x0;
import java.util.List;

public abstract class p {
    public static final List a;

    static {
        List list0 = q.K(new Builder("key", CompiledGraphQL.-notNull(r1.a)).build());
        Builder compiledField$Builder0 = new Builder("createLinkedAccountActivationKey", x0.a);
        p.a = o.B("accountTypeId", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.F0), compiledField$Builder0, list0);
    }
}

