package b9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import com.sendwave.backend.type.Currency;
import com.sendwave.backend.type.N;
import com.sendwave.backend.type.PartnerOrg;
import com.sendwave.backend.type.n2;
import d9.J3;
import d9.K3;
import d9.L0;
import d9.L3;
import d9.f2;
import d9.g1;
import d9.h2;
import d9.p1;
import d9.r1;
import d9.t0;
import java.util.List;

public abstract class z0 {
    public static final List a;

    static {
        List list0 = q.K(new Builder("feeNotice", CompiledGraphQL.-notNull(CompiledGraphQL.-list(CompiledGraphQL.-notNull(r1.a)))).build());
        List list1 = o.A(new Builder("sendMoneyScreen", CompiledGraphQL.-notNull(L3.a)), list0);
        List list2 = q.K(new Builder("feeNotice", CompiledGraphQL.-notNull(CompiledGraphQL.-list(CompiledGraphQL.-notNull(r1.a)))).build());
        List list3 = o.A(new Builder("sendMoneyScreen", CompiledGraphQL.-notNull(L3.a)), list2);
        CompiledField compiledField0 = new Builder("transferDescription", CompiledGraphQL.-notNull(K3.a)).selections(list3).build();
        CompiledField compiledField1 = new Builder("destCountry", CompiledGraphQL.-notNull(r1.a)).build();
        CompiledField compiledField2 = new Builder("sendFeeFormula", g1.a).build();
        CompiledField compiledField3 = o.s("receiveFeeFormula", g1.a);
        PartnerOrg.B.getClass();
        List list4 = q.L(new CompiledField[]{compiledField0, compiledField1, compiledField2, compiledField3, new Builder("partnerOrgs", CompiledGraphQL.-notNull(CompiledGraphQL.-list(CompiledGraphQL.-notNull(n2.b)))).build()});
        List list5 = q.K(new Builder("feeNotice", CompiledGraphQL.-notNull(CompiledGraphQL.-list(CompiledGraphQL.-notNull(r1.a)))).build());
        List list6 = q.L(new CompiledField[]{o.s("fxRateLabel", r1.a), o.s("fxRateDescription", r1.a), o.s("feeLabel", r1.a)});
        List list7 = q.L(new CompiledField[]{new Builder("sendMoneyScreen", CompiledGraphQL.-notNull(L3.a)).selections(list5).build(), new Builder("confirmationDialog", CompiledGraphQL.-notNull(J3.a)).selections(list6).build()});
        CompiledField compiledField4 = new Builder("transferDescription", CompiledGraphQL.-notNull(K3.a)).selections(list7).build();
        CompiledField compiledField5 = new Builder("destCountry", CompiledGraphQL.-notNull(r1.a)).build();
        CompiledField compiledField6 = new Builder("sendFeeFormula", g1.a).build();
        CompiledField compiledField7 = o.s("receiveFeeFormula", g1.a);
        CompiledField compiledField8 = new Builder("exchangeToForeignFormula", CompiledGraphQL.-notNull(g1.a)).build();
        CompiledField compiledField9 = new Builder("exchangeFromForeignFormula", CompiledGraphQL.-notNull(g1.a)).build();
        CompiledField compiledField10 = new Builder("partnerOrgs", CompiledGraphQL.-notNull(CompiledGraphQL.-list(CompiledGraphQL.-notNull(n2.b)))).build();
        Currency.q.getClass();
        List list8 = q.L(new CompiledField[]{compiledField4, compiledField5, compiledField6, compiledField7, compiledField8, compiledField9, compiledField10, new Builder("destCurrency", CompiledGraphQL.-notNull(N.b)).build(), new Builder("fxRate", CompiledGraphQL.-notNull(L0.a)).build()});
        z0.a = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("balance", CompiledGraphQL.-notNull(f2.a)).build(), new Builder("transferDescription", CompiledGraphQL.-notNull(K3.a)).selections(list1).build(), o.s("sendFeeFormula", g1.a), o.s("receiveFeeFormula", g1.a), new Builder("internationalFeeFormulas", o.t(t0.a)).selections(list4).build(), new Builder("multicurrencyFeeFormulas", o.t(h2.a)).selections(list8).build(), new Builder("aimedPartnerOrg", CompiledGraphQL.-notNull(n2.b)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Wallet", q.K("Wallet")).selections(F.a).build()});
    }
}

