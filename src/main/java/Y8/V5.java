package Y8;

import M.J;
import Nb.j;
import Z8.d3;
import c9.g0;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.i2;
import m5.b;

public final class v5 implements Mutation {
    public final String a;
    public final String b;

    public v5(String s, String s1) {
        j.f(s, "paymentCardId");
        super();
        this.a = s;
        this.b = s1;
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(d3.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation PaymentCardLockMutation($paymentCardId: ID!, $idempotencyKey: String!) { pausePaymentCard(paymentCardId: $paymentCardId, idempotencyKey: $idempotencyKey) { response { __typename ... on PaymentCardPending { idempotencyKey } ...PaymentCardFragment } } }  fragment PaymentCardFragment on PaymentCard { id lastFourDigits cardholderName whenExpires state message { title text } partnerPublicKey kind bankPartnerIcon }";
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof v5)) {
            return false;
        }
        return j.a(this.a, ((v5)object0).a) ? j.a(this.b, ((v5)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "00058c3cf0b6f9380c9b63903b8a2c1df3361a59aeba68b5231ef3d59b7d15e8";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "PaymentCardLockMutation";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", i2.p2).selections(g0.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        J.m(jsonWriter0, "writer", customScalarAdapters0, "customScalarAdapters", "paymentCardId");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, this.a);
        jsonWriter0.name("idempotencyKey");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, this.b);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("PaymentCardLockMutation(paymentCardId=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", idempotencyKey=");
        return b.y(stringBuilder0, this.b, ")");
    }
}

