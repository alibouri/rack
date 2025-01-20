package c9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import d9.F2;
import d9.i2;
import d9.m1;
import d9.r1;
import java.util.List;

public abstract class e0 {
    public static final List a;

    static {
        List list0 = q.K(new Builder("idempotencyKey", CompiledGraphQL.-notNull(r1.a)).build());
        List list1 = q.L(new CompiledField[]{new Builder("encryptedPan", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("encryptedCvv", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("iv", CompiledGraphQL.-notNull(r1.a)).build()});
        List list2 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("PaymentCardRestrictedDataPending", q.K("PaymentCardRestrictedDataPending")).selections(list0).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("PaymentCardRestrictedData", q.K("PaymentCardRestrictedData")).selections(list1).build()});
        List list3 = o.A(new Builder("response", F2.a), list2);
        Builder compiledField$Builder0 = new Builder("getPaymentCardRestrictedData", m1.a);
        e0.a = o.C(new CompiledArgument[]{o.r("encryptedSessionKey", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.o1)), o.r("idempotencyKey", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.p1)), o.r("paymentCardId", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.q1))}, compiledField$Builder0, list3);
    }
}

