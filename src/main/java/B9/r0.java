package b9;

import Bb.q;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import d9.T3;
import d9.n1;
import d9.p1;
import d9.r1;
import d9.x4;
import java.util.List;

public abstract class r0 {
    public static final List a;

    static {
        List list0 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("supportNumber", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("supportNumberIsFree", CompiledGraphQL.-notNull(n1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Support", q.K("Support")).selections(q0.a).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Support", q.K("Support")).selections(s0.a).build()});
        List list1 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("User", q.K("User")).selections(p0.a).build()});
        r0.a = q.L(new CompiledField[]{new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("support", CompiledGraphQL.-notNull(T3.a)).selections(list0).build(), new Builder("user", CompiledGraphQL.-notNull(x4.h)).selections(list1).build()});
    }
}

