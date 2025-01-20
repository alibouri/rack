package b9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import d9.G0;
import d9.I0;
import d9.p1;
import d9.r1;
import java.util.List;

public abstract class u {
    public static final List a;

    static {
        List list0 = q.L(new CompiledField[]{new Builder("iconUrl", r1.a).build(), new Builder("term", CompiledGraphQL.-notNull(r1.a)).build()});
        List list1 = q.L(new CompiledField[]{new Builder("name", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("uri", CompiledGraphQL.-notNull(r1.a)).build()});
        List list2 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("DealUriAction", q.K("DealUriAction")).selections(list1).build()});
        u.a = q.L(new CompiledField[]{new Builder("id", p1.a).build(), new Builder("description", CompiledGraphQL.-notNull(r1.a)).build(), o.s("animationUrl", r1.a), new Builder("imageUrl", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("terms", o.t(I0.a)).selections(list0).build(), new Builder("actions", CompiledGraphQL.-notNull(CompiledGraphQL.-list(CompiledGraphQL.-notNull(G0.a)))).selections(list2).build()});
    }
}

