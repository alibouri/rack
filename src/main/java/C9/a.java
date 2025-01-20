package c9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledGraphQL;
import d9.i2;
import d9.p1;
import java.util.List;

public abstract class a {
    public static final List a;

    static {
        List list0 = q.K(new Builder("id", CompiledGraphQL.-notNull(p1.a)).build());
        Builder compiledField$Builder0 = new Builder("acceptLinkedAccountTerms", d9.a.a);
        a.a = o.B("termsId", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.a1), compiledField$Builder0, list0);
    }
}

