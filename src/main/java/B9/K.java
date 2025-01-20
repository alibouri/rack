package b9;

import Bb.q;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import d9.V;
import d9.Y4;
import d9.p1;
import d9.r1;
import d9.x4;
import java.util.List;

public abstract class k {
    public static final List a;

    static {
        List list0 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("BillType", q.K("BillType")).selections(j.a).build()});
        List list1 = q.K(new Builder("airtimeBillType", V.a).arguments(q.K(new com.apollographql.apollo.api.CompiledArgument.Builder(x4.a).value(q.L(new String[]{"AIRTIME", "AIRTIME_INTERNATIONAL", "MULTISELECT_FIELDS", "SERVER_CONFIRMATION_MESSAGES"})).build())).selections(list0).build());
        List list2 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Wallet", q.K("Wallet")).selections(x.a).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Wallet", q.K("Wallet")).selections(Q.a).build()});
        k.a = q.L(new CompiledField[]{new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("user", CompiledGraphQL.-notNull(x4.h)).selections(list1).build(), new Builder("wallet", CompiledGraphQL.-notNull(Y4.h)).selections(list2).build()});
    }
}

