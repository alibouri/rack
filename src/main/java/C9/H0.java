package c9;

import Bb.q;
import Y8.o;
import b9.U;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import d9.C2;
import d9.Z2;
import d9.i2;
import d9.r1;
import java.util.List;

public abstract class h0 {
    public static final List a;

    static {
        List list0 = q.K(new Builder("idempotencyKey", CompiledGraphQL.-notNull(r1.a)).build());
        List list1 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("PaymentCardPending", q.K("PaymentCardPending")).selections(list0).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("PaymentCard", q.K("PaymentCard")).selections(U.a).build()});
        List list2 = o.A(new Builder("response", C2.a), list1);
        Builder compiledField$Builder0 = new Builder("renewPaymentCard", Z2.a);
        h0.a = o.C(new CompiledArgument[]{o.r("expectedFee", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.l1)), o.r("idempotencyKey", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.m1)), o.r("paymentCardId", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.n1))}, compiledField$Builder0, list2);
    }
}

