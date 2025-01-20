package b9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import d9.H0;
import d9.a2;
import d9.d0;
import d9.p1;
import d9.r1;
import d9.x2;
import java.util.List;

public abstract class d {
    public static final List a;

    static {
        List list0 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("DealDetail", q.K("DealDetail")).selections(u.a).build()});
        List list1 = o.A(new Builder("detail", CompiledGraphQL.-notNull(H0.a)), list0);
        List list2 = q.K(new Builder("id", CompiledGraphQL.-notNull(p1.a)).build());
        List list3 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("PayableWallet", q.L(new String[]{"BillType", "PayableBusiness"})).selections(T.a).build()});
        List list4 = q.L(new CompiledField[]{new Builder("fieldName", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("fieldValue", CompiledGraphQL.-notNull(r1.a)).build()});
        List list5 = q.L(new CompiledField[]{new Builder("merchant", CompiledGraphQL.-notNull(a2.b)).selections(list2).build(), new Builder("payableBusiness", CompiledGraphQL.-notNull(x2.a)).selections(list3).build(), new Builder("prefilledFields", o.t(d0.a)).selections(list4).build()});
        List list6 = q.L(new CompiledField[]{new Builder("mobile", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("name", CompiledGraphQL.-notNull(r1.a)).build()});
        List list7 = q.K(new Builder("uri", CompiledGraphQL.-notNull(r1.a)).build());
        d.a = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("ShowDealAction", q.K("ShowDealAction")).selections(list1).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("MerchantPaymentAction", q.K("MerchantPaymentAction")).selections(list5).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("P2PTransferAction", q.K("P2PTransferAction")).selections(list6).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("LaunchUriAction", q.K("LaunchUriAction")).selections(list7).build()});
    }
}

