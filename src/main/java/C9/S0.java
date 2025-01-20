package c9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledGraphQL;
import d9.a3;
import d9.i2;
import d9.n1;
import java.util.List;

public abstract class s0 {
    public static final List a;

    static {
        List list0 = q.K(new Builder("succeeded", CompiledGraphQL.-notNull(n1.a)).build());
        Builder compiledField$Builder0 = new Builder("reportClientInfo", a3.a);
        s0.a = o.B("info", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.l0), compiledField$Builder0, list0);
    }
}

