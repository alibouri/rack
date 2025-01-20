package Y8;

import M.J;
import Nb.j;
import Z8.I3;
import c9.p0;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.i2;
import m5.b;

public final class q6 implements Mutation {
    public final String a;

    public q6(String s) {
        j.f(s, "promoCode");
        super();
        this.a = s;
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(I3.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation RedeemPromoCodeMutation($promoCode: String!) { redeemPromoCode2(promoCode: $promoCode) { detail { __typename ...DealDetailFragment } } }  fragment DealDetailFragment on DealDetail { id description animationUrl imageUrl terms { iconUrl term } actions { __typename ... on DealUriAction { name uri } } }";
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof q6 ? j.a(this.a, ((q6)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "2c10984031d6831f3e232ca9cc13ad0f8b11c7b14c300f1072092d236567e68b";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "RedeemPromoCodeMutation";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", i2.p2).selections(p0.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        J.m(jsonWriter0, "writer", customScalarAdapters0, "customScalarAdapters", "promoCode");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, this.a);
    }

    @Override
    public final String toString() {
        return b.y(new StringBuilder("RedeemPromoCodeMutation(promoCode="), this.a, ")");
    }
}

