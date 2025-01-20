package b9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import com.sendwave.backend.type.PartnerOrg;
import com.sendwave.backend.type.n2;
import d9.Y4;
import d9.f2;
import d9.n1;
import d9.p1;
import d9.r1;
import d9.x4;
import java.util.List;

public abstract class t0 {
    public static final List a;

    static {
        List list0 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), o.s("verifiedMobile", r1.a), o.s("mobile", r1.a), new Builder("needsNewPin", CompiledGraphQL.-notNull(n1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("User", q.K("User")).selections(C0.a).build()});
        CompiledField compiledField0 = new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build();
        CompiledField compiledField1 = new Builder("id", CompiledGraphQL.-notNull(p1.a)).build();
        CompiledField compiledField2 = new Builder("balance", CompiledGraphQL.-notNull(f2.a)).build();
        CompiledField compiledField3 = new Builder("country", CompiledGraphQL.-notNull(r1.a)).build();
        PartnerOrg.B.getClass();
        List list1 = q.L(new CompiledSelection[]{compiledField0, compiledField1, compiledField2, compiledField3, new Builder("partnerOrg", n2.b).build(), new Builder("aimedPartnerOrg", CompiledGraphQL.-notNull(n2.b)).build(), new Builder("shouldBlockUntilPartnerOrgMigrated", CompiledGraphQL.-notNull(n1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Wallet", q.K("Wallet")).selections(l0.a).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Wallet", q.K("Wallet")).selections(y.a).build()});
        t0.a = q.L(new CompiledField[]{new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("opaqueId", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("user", CompiledGraphQL.-notNull(x4.h)).selections(list0).build(), new Builder("wallet", CompiledGraphQL.-notNull(Y4.h)).selections(list1).build()});
    }
}

