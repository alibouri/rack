package b9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import com.sendwave.backend.type.PartnerOrg;
import com.sendwave.backend.type.n2;
import d9.T3;
import d9.W2;
import d9.Y4;
import d9.n1;
import d9.p1;
import d9.r1;
import d9.x4;
import d9.y4;
import java.util.List;

public abstract class m0 {
    public static final List a;

    static {
        List list0 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Referral", q.K("Referral")).selections(b0.a).build()});
        List list1 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Referral", q.K("Referral")).selections(b0.a).build()});
        List list2 = q.L(new CompiledField[]{new Builder("nearbyAgentsInAppEnabled", CompiledGraphQL.-notNull(n1.a)).build(), new Builder("showDeviceManagementSection", CompiledGraphQL.-notNull(n1.a)).build(), new Builder("accountSwitcherEnabled", CompiledGraphQL.-notNull(n1.a)).build()});
        List list3 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("User", q.K("User")).selections(D.a).build(), new Builder("contactMobile", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("inviteInfo", CompiledGraphQL.-notNull(W2.a)).selections(list0).build(), new Builder("referralInfo", CompiledGraphQL.-notNull(W2.a)).selections(list1).build(), new Builder("promoCode", CompiledGraphQL.-notNull(r1.a)).build(), o.s("nearbyAgentsMapUrl", r1.a), new Builder("appProps", CompiledGraphQL.-notNull(y4.a)).selections(list2).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("User", q.K("User")).selections(p0.a).build()});
        CompiledField compiledField0 = new Builder("id", CompiledGraphQL.-notNull(p1.a)).build();
        PartnerOrg.B.getClass();
        List list4 = q.L(new CompiledField[]{compiledField0, new Builder("partnerOrg", n2.b).build()});
        List list5 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("supportNumber", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("supportNumberIsFree", CompiledGraphQL.-notNull(n1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Support", q.K("Support")).selections(q0.a).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Support", q.K("Support")).selections(s0.a).build()});
        m0.a = q.L(new CompiledField[]{new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("user", CompiledGraphQL.-notNull(x4.h)).selections(list3).build(), new Builder("wallet", CompiledGraphQL.-notNull(Y4.h)).selections(list4).build(), new Builder("support", CompiledGraphQL.-notNull(T3.a)).selections(list5).build()});
    }
}

