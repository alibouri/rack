package c9;

import Bb.q;
import Y8.o;
import b9.D0;
import b9.V;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import d9.H2;
import d9.Y4;
import d9.i2;
import d9.q0;
import d9.r1;
import java.util.List;

public abstract class i0 {
    public static final List a;

    static {
        List list0 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("PaymentCardWallet", q.K("PaymentCardWallet")).selections(V.a).build()});
        List list1 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Wallet", q.K("Wallet")).selections(D0.a).build()});
        List list2 = q.L(new CompiledField[]{new Builder("paymentCardWallet", CompiledGraphQL.-notNull(H2.e)).selections(list0).build(), new Builder("primaryWallet", CompiledGraphQL.-notNull(Y4.h)).selections(list1).build()});
        Builder compiledField$Builder0 = new Builder("completePaymentCardWalletTransfer", q0.a);
        i0.a = o.C(new CompiledArgument[]{o.r("amount", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.x1)), o.r("paymentCardWalletId", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.y1))}, compiledField$Builder0, list2);
    }
}

