package b9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import d9.E0;
import d9.j0;
import d9.l0;
import d9.n1;
import d9.p1;
import d9.q2;
import d9.r1;
import d9.w3;
import java.util.List;

public abstract class l {
    public static final List a;

    static {
        List list0 = q.K(new Builder("hasNextPage", CompiledGraphQL.-notNull(n1.a)).build());
        List list1 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("ScratchCardDetails", q.K("ScratchCardDetails")).selections(h0.a).build()});
        List list2 = q.L(new CompiledField[]{new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("whenExpires", E0.a).build(), o.s("iconUrl", r1.a), o.s("awardText", r1.a), o.s("awardSubtext", r1.a), new Builder("details", w3.a).selections(list1).build()});
        List list3 = o.A(new Builder("node", CompiledGraphQL.-notNull(j0.a)), list2);
        l.a = q.L(new CompiledField[]{new Builder("pageInfo", CompiledGraphQL.-notNull(q2.a)).selections(list0).build(), new Builder("edges", o.t(l0.a)).selections(list3).build()});
    }
}

