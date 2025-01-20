package b9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import com.sendwave.backend.type.PartnerOrg;
import com.sendwave.backend.type.n2;
import d9.n1;
import d9.p1;
import d9.r1;
import java.util.List;

public abstract class k0 {
    public static final List a;

    static {
        CompiledField compiledField0 = new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build();
        CompiledField compiledField1 = new Builder("id", CompiledGraphQL.-notNull(p1.a)).build();
        CompiledField compiledField2 = new Builder("country", CompiledGraphQL.-notNull(r1.a)).build();
        PartnerOrg.B.getClass();
        k0.a = q.L(new CompiledSelection[]{compiledField0, compiledField1, compiledField2, new Builder("partnerOrg", n2.b).build(), new Builder("shouldBlockUntilPartnerOrgMigrated", CompiledGraphQL.-notNull(n1.a)).build(), o.s("shouldResendOnPreviouslyFailedTx", n1.a), new com.apollographql.apollo.api.CompiledFragment.Builder("Wallet", q.K("Wallet")).selections(z0.a).build()});
    }
}

