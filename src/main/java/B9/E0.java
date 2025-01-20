package b9;

import Bb.q;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import d9.T3;
import d9.Y4;
import d9.n1;
import d9.p1;
import d9.r1;
import d9.t3;
import d9.x4;
import d9.y4;
import java.util.List;

public abstract class e0 {
    public static final List a;

    static {
        List list0 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("SavingsWallet", q.K("SavingsWallet")).selections(f0.a).build()});
        List list1 = q.K(new Builder("lockedVaultFeatureEnabled", n1.a).build());
        List list2 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("savingsWallet", CompiledGraphQL.-notNull(t3.b)).selections(list0).build(), new Builder("appProps", CompiledGraphQL.-notNull(y4.a)).selections(list1).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("User", q.K("User")).selections(y0.a).build()});
        List list3 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Wallet", q.K("Wallet")).selections(D0.a).build()});
        List list4 = q.K(new Builder("supportNumber", CompiledGraphQL.-notNull(r1.a)).build());
        e0.a = q.L(new CompiledField[]{new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("user", CompiledGraphQL.-notNull(x4.h)).selections(list2).build(), new Builder("wallet", CompiledGraphQL.-notNull(Y4.h)).selections(list3).build(), new Builder("support", CompiledGraphQL.-notNull(T3.a)).selections(list4).build()});
    }
}

