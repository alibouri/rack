package c9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.sendwave.backend.type.PartnerOrg;
import com.sendwave.backend.type.n2;
import d9.Y4;
import d9.i2;
import d9.l;
import d9.n1;
import d9.p1;
import java.util.List;

public abstract class e {
    public static final List a;

    static {
        CompiledField compiledField0 = new Builder("id", CompiledGraphQL.-notNull(p1.a)).build();
        PartnerOrg.B.getClass();
        List list0 = q.L(new CompiledField[]{compiledField0, new Builder("partnerOrg", n2.b).build(), new Builder("aimedPartnerOrg", CompiledGraphQL.-notNull(n2.b)).build(), new Builder("shouldBlockUntilPartnerOrgMigrated", CompiledGraphQL.-notNull(n1.a)).build()});
        List list1 = o.A(new Builder("wallet", Y4.h), list0);
        Builder compiledField$Builder0 = new Builder("agreeToTerms", l.a);
        e.a = o.C(new CompiledArgument[]{o.r("is_new_partner_org", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.m0)), o.r("partner_org", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.n0)), o.r("version", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.o0)), o.r("walletId", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.p0))}, compiledField$Builder0, list1);
    }
}

