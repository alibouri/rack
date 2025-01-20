package Y8;

import A3.e;
import M.J;
import Nb.j;
import Z8.S2;
import c9.e0;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.i2;
import m5.b;

public final class j5 implements Mutation {
    public final String a;
    public final String b;
    public final String c;

    public j5(String s, String s1, String s2) {
        j.f(s1, "paymentCardId");
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(S2.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation PaymentCardGetRestrictedDataMutation($idempotencyKey: String!, $paymentCardId: ID!, $encryptedSessionKey: String!) { getPaymentCardRestrictedData(idempotencyKey: $idempotencyKey, paymentCardId: $paymentCardId, encryptedSessionKey: $encryptedSessionKey) { response { __typename ... on PaymentCardRestrictedDataPending { idempotencyKey } ... on PaymentCardRestrictedData { encryptedPan encryptedCvv iv } } } }";
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof j5)) {
            return false;
        }
        if(!j.a(this.a, ((j5)object0).a)) {
            return false;
        }
        return j.a(this.b, ((j5)object0).b) ? j.a(this.c, ((j5)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() + e.s(this.a.hashCode() * 0x1F, 0x1F, this.b);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "04ea965acf584ca6f0df954722cf9ffe9bc29b5c7515acad990370e4a726ecf3";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "PaymentCardGetRestrictedDataMutation";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", i2.p2).selections(e0.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        J.m(jsonWriter0, "writer", customScalarAdapters0, "customScalarAdapters", "idempotencyKey");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, this.a);
        jsonWriter0.name("paymentCardId");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, this.b);
        jsonWriter0.name("encryptedSessionKey");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, this.c);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("PaymentCardGetRestrictedDataMutation(idempotencyKey=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", paymentCardId=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", encryptedSessionKey=");
        return b.y(stringBuilder0, this.c, ")");
    }
}

