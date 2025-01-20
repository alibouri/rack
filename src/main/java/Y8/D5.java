package Y8;

import M.J;
import Nb.j;
import Z8.P2;
import c9.d0;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.models.CurrencyAmount;
import d9.i2;

public final class d5 implements Mutation {
    public final CurrencyAmount a;
    public final String b;

    public d5(CurrencyAmount currencyAmount0, String s) {
        this.a = currencyAmount0;
        this.b = s;
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(P2.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation PaymentCardCreateMutation($expectedFee: Money!, $idempotencyKey: String!) { createPaymentCard(expectedFee: $expectedFee, idempotencyKey: $idempotencyKey) { response { __typename ... on PaymentCardPending { idempotencyKey } ...PaymentCardFragment } } }  fragment PaymentCardFragment on PaymentCard { id lastFourDigits cardholderName whenExpires state message { title text } partnerPublicKey kind bankPartnerIcon }";
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof d5)) {
            return false;
        }
        return j.a(this.a, ((d5)object0).a) ? j.a(this.b, ((d5)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "98c37b037805a8dfeeb65673059b5be730633fb8ef9fe86637481bf2b91b8d56";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "PaymentCardCreateMutation";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", i2.p2).selections(d0.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        J.m(jsonWriter0, "writer", customScalarAdapters0, "customScalarAdapters", "expectedFee");
        j.f(this.a, "value");
        String s = this.a.k();
        j.e(s, "toSerialized(...)");
        jsonWriter0.value(s);
        jsonWriter0.name("idempotencyKey");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, this.b);
    }

    @Override
    public final String toString() {
        return "PaymentCardCreateMutation(expectedFee=" + this.a + ", idempotencyKey=" + this.b + ")";
    }
}

