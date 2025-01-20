package c9;

import Bb.q;
import Y8.o;
import b9.l;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import d9.M3;
import d9.k0;
import d9.p1;
import d9.r1;
import d9.x3;
import d9.x4;
import java.util.List;

public abstract class k {
    public static final List a;

    static {
        List list0 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("ClaimedScratchCardConnection", q.K("ClaimedScratchCardConnection")).selections(l.a).build()});
        Builder compiledField$Builder0 = new Builder("claimedCards", k0.a);
        List list1 = o.C(new CompiledArgument[]{o.r("before", new com.apollographql.apollo.api.CompiledArgument.Builder(x3.a)), new com.apollographql.apollo.api.CompiledArgument.Builder(x3.b).value(Boolean.TRUE).build(), o.r("last", new com.apollographql.apollo.api.CompiledArgument.Builder(x3.c))}, compiledField$Builder0, list0);
        List list2 = q.L(new CompiledField[]{new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("scratchCards", x3.d).selections(list1).build()});
        List list3 = o.A(new Builder("user", CompiledGraphQL.-notNull(x4.h)), list2);
        k.a = o.A(new Builder("session", CompiledGraphQL.-notNull(M3.a)), list3);
    }
}

