package c9;

import Bb.q;
import Y8.o;
import b9.F;
import b9.O;
import b9.P;
import b9.t;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import com.sendwave.backend.type.PartnerOrg;
import com.sendwave.backend.type.n2;
import d9.A0;
import d9.H3;
import d9.Y4;
import d9.f2;
import d9.g1;
import d9.i2;
import d9.n1;
import d9.p1;
import d9.r1;
import d9.x4;
import java.util.List;

public abstract class v {
    public static final List a;

    static {
        CompiledField compiledField0 = new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build();
        CompiledField compiledField1 = new Builder("id", CompiledGraphQL.-notNull(p1.a)).build();
        CompiledField compiledField2 = new Builder("balance", CompiledGraphQL.-notNull(f2.a)).build();
        PartnerOrg.B.getClass();
        List list0 = q.L(new CompiledSelection[]{compiledField0, compiledField1, compiledField2, new Builder("partnerOrg", n2.b).build(), new Builder("sendFeeFormula", g1.a).build(), o.s("sendFeeFormulaDescription", r1.a), new com.apollographql.apollo.api.CompiledFragment.Builder("Wallet", q.K("Wallet")).selections(F.a).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Wallet", q.K("Wallet")).selections(t.a).build()});
        List list1 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("CustomerAnnouncements", q.K("CustomerAnnouncements")).selections(O.a).build()});
        List list2 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("customerAnnouncements", CompiledGraphQL.-notNull(A0.a)).selections(list1).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("User", q.K("User")).selections(P.a).build()});
        List list3 = q.L(new CompiledField[]{new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("sourceWallet", Y4.h).selections(list0).build(), new Builder("user", x4.h).selections(list2).build()});
        List list4 = q.L(new CompiledField[]{new Builder("transfer", d9.n2.a).selections(list3).build(), new Builder("showUserCanReverseTxAnnouncement", CompiledGraphQL.-notNull(n1.a)).build()});
        Builder compiledField$Builder0 = new Builder("send", H3.a);
        v.a = o.C(new CompiledArgument[]{o.r("acceptedPartnerOrg", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.e0)), o.r("contactListFingerprint", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.f0)), o.r("overdraftUsageInput", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.g0)), o.r("pin", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.h0)), o.r("possiblyMistakenTransferConfirmed", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.i0)), o.r("transfer", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.j0))}, compiledField$Builder0, list4);
    }
}

