package c9;

import Bb.q;
import b9.A0;
import b9.C0;
import b9.Q;
import b9.S;
import b9.W;
import b9.a0;
import b9.e0;
import b9.g0;
import b9.k;
import b9.l0;
import b9.m0;
import b9.v;
import b9.y0;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import com.sendwave.backend.type.PartnerOrg;
import com.sendwave.backend.type.n2;
import d9.E0;
import d9.M3;
import d9.T3;
import d9.Y4;
import d9.n1;
import d9.p1;
import d9.r1;
import d9.x4;
import java.util.List;

public abstract class s {
    public static final List a;

    static {
        List list0 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("needsNewPin", CompiledGraphQL.-notNull(n1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("User", q.K("User")).selections(g0.a).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("User", q.K("User")).selections(C0.a).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("User", q.K("User")).selections(y0.a).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("User", q.K("User")).selections(A0.a).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("User", q.K("User")).selections(v.a).build()});
        CompiledField compiledField0 = new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build();
        CompiledField compiledField1 = new Builder("id", CompiledGraphQL.-notNull(p1.a)).build();
        PartnerOrg.B.getClass();
        List list1 = q.L(new CompiledSelection[]{compiledField0, compiledField1, new Builder("partnerOrg", n2.b).build(), new Builder("aimedPartnerOrg", CompiledGraphQL.-notNull(n2.b)).build(), new Builder("shouldBlockUntilPartnerOrgMigrated", CompiledGraphQL.-notNull(n1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Wallet", q.K("Wallet")).selections(l0.a).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Wallet", q.K("Wallet")).selections(S.a).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Wallet", q.K("Wallet")).selections(Q.a).build()});
        List list2 = q.L(new CompiledField[]{new Builder("supportNumber", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("supportNumberIsFree", CompiledGraphQL.-notNull(n1.a)).build()});
        List list3 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("opaqueId", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("user", CompiledGraphQL.-notNull(x4.h)).selections(list0).build(), new Builder("wallet", CompiledGraphQL.-notNull(Y4.h)).selections(list1).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Session", q.K("Session")).selections(m0.a).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Session", q.K("Session")).selections(a0.a).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Session", q.K("Session")).selections(k.a).build(), new Builder("support", CompiledGraphQL.-notNull(T3.a)).selections(list2).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Session", q.K("Session")).selections(e0.a).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Session", q.K("Session")).selections(W.a).build()});
        s.a = q.L(new CompiledField[]{new Builder("session", CompiledGraphQL.-notNull(M3.a)).selections(list3).build(), new Builder("currentTime", CompiledGraphQL.-notNull(E0.a)).build()});
    }
}

