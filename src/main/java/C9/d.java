package c9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import d9.R2;
import d9.i;
import d9.p1;
import d9.r1;
import java.util.List;

public abstract class d {
    public static final List a;

    static {
        List list0 = q.L(new CompiledField[]{new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("mobile", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("name", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("city", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("subcity", CompiledGraphQL.-notNull(r1.a)).build()});
        Builder compiledField$Builder0 = new Builder("agentList2", o.t(i.a));
        d.a = o.B("country", new com.apollographql.apollo.api.CompiledArgument.Builder(R2.f), compiledField$Builder0, list0);
    }
}

