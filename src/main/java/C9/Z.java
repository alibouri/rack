package c9;

import Bb.q;
import Y8.o;
import b9.f;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import d9.J;
import d9.N0;
import d9.V;
import d9.i2;
import d9.p1;
import d9.r1;
import java.util.List;

public abstract class z {
    public static final List a;

    static {
        List list0 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("BillFavorite", q.K("BillFavorite")).selections(f.a).build()});
        List list1 = q.L(new CompiledField[]{new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("favorites", o.t(J.a)).selections(list0).build()});
        List list2 = o.A(new Builder("billType", CompiledGraphQL.-notNull(V.a)), list1);
        Builder compiledField$Builder0 = new Builder("deleteBillFavorite", N0.a);
        z.a = o.B("input", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.B0), compiledField$Builder0, list2);
    }
}

