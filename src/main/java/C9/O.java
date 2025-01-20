package c9;

import Bb.q;
import b9.f;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import d9.J;
import d9.V;
import d9.i2;
import d9.p1;
import d9.r1;
import d9.u0;
import java.util.List;

public abstract class o {
    public static final List a;

    static {
        List list0 = q.K(new Builder("id", CompiledGraphQL.-notNull(p1.a)).build());
        List list1 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("BillFavorite", q.K("BillFavorite")).selections(f.a).build()});
        List list2 = q.L(new CompiledField[]{new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("favorites", Y8.o.t(J.a)).selections(list1).build()});
        List list3 = q.L(new CompiledField[]{new Builder("favorite", CompiledGraphQL.-notNull(J.a)).selections(list0).build(), new Builder("billType", CompiledGraphQL.-notNull(V.a)).selections(list2).build()});
        Builder compiledField$Builder0 = new Builder("createBillFavorite", u0.a);
        o.a = Y8.o.B("input", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.y0), compiledField$Builder0, list3);
    }
}

