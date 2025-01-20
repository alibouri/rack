package c9;

import Bb.q;
import Y8.o;
import b9.N;
import b9.O;
import b9.i0;
import b9.u;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import d9.A0;
import d9.B3;
import d9.H0;
import d9.Y4;
import d9.d2;
import d9.f2;
import d9.i2;
import d9.p1;
import d9.r1;
import d9.w2;
import d9.x4;
import java.util.List;

public abstract class a0 {
    public static final List a;

    static {
        List list0 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("balance", CompiledGraphQL.-notNull(f2.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Wallet", q.K("Wallet")).selections(N.a).build()});
        List list1 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("User", q.K("User")).selections(i0.a).build()});
        List list2 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("DealDetail", q.K("DealDetail")).selections(u.a).build()});
        List list3 = q.L(new CompiledField[]{new Builder("user", x4.h).selections(list1).build(), new Builder("dealDetail", H0.a).selections(list2).build()});
        List list4 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("CustomerAnnouncements", q.K("CustomerAnnouncements")).selections(O.a).build()});
        List list5 = q.L(new CompiledField[]{new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("customerAnnouncements", CompiledGraphQL.-notNull(A0.a)).selections(list4).build()});
        List list6 = q.L(new CompiledField[]{new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("sourceWallet", Y4.h).selections(list0).build(), new Builder("updatedScratchCards", B3.a).selections(list3).build(), new Builder("user", x4.h).selections(list5).build()});
        List list7 = o.A(new Builder("payment", CompiledGraphQL.-notNull(d2.a)), list6);
        Builder compiledField$Builder0 = new Builder("payMerchant", w2.a);
        a0.a = o.C(new CompiledArgument[]{o.r("actionSource", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.X1)), o.r("actionUrl", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.Y1)), o.r("amount", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.Z1)), o.r("fields", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.a2)), o.r("idempotencyKey", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.b2)), o.r("merchantId", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.c2)), new com.apollographql.apollo.api.CompiledArgument.Builder(i2.d2).value("SMARTPHONE_APP").build()}, compiledField$Builder0, list7);
    }
}

