package c9;

import Bb.q;
import Y8.o;
import b9.Y;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import d9.J2;
import d9.K2;
import d9.M3;
import d9.p1;
import d9.r1;
import d9.x4;
import java.util.List;

public abstract class m0 {
    public static final List a;

    static {
        List list0 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("PaymentOptionsEdge", q.K("PaymentOptionsEdge")).selections(Y.a).build()});
        List list1 = o.A(new Builder("edges", o.t(K2.a)), list0);
        List list2 = q.L(new CompiledField[]{new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("paymentOptions", CompiledGraphQL.-notNull(J2.a)).arguments(q.L(new CompiledArgument[]{o.r("after", new com.apollographql.apollo.api.CompiledArgument.Builder(x4.c)), new com.apollographql.apollo.api.CompiledArgument.Builder(x4.d).value(q.L(new String[]{"MULTISELECT_FIELDS", "SERVER_CONFIRMATION_MESSAGES"})).build(), o.r("categoryId", new com.apollographql.apollo.api.CompiledArgument.Builder(x4.e)), o.r("first", new com.apollographql.apollo.api.CompiledArgument.Builder(x4.f)), o.r("searchQuery", new com.apollographql.apollo.api.CompiledArgument.Builder(x4.g))})).selections(list1).build()});
        List list3 = q.L(new CompiledField[]{new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("user", CompiledGraphQL.-notNull(x4.h)).selections(list2).build()});
        m0.a = o.A(new Builder("session", CompiledGraphQL.-notNull(M3.a)), list3);
    }
}

