package Y8;

import Nb.j;
import Nb.x;
import Z8.b2;
import c9.X;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.R2;

public final class j4 implements Query {
    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(b2.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query OverdraftQuery { session { id user { __typename ...OverdraftFragment } } }  fragment OverdraftFragment on User { id overdraftPolicy { termsAndConditions { id acceptedVersion latestVersion url } maxLimit usedLimit maxDurationDays chargesFormula setupFee { type frequency } lateFee { type frequency } interest { type frequency } availableLimitMessage feesMessage interestMessage optInMessage acceptTermsMessage introAudioUrl termsSummary { icon text } } overdraftWallet { id dueDateInfo { icon title text } } unpaidOverdraftUsages { principalTotalAmount principalOwedAmount chargesOwedAmount dueDate } }";
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 != null && object0.getClass() == j4.class;
    }

    @Override
    public final int hashCode() {
        return x.a(j4.class).hashCode();
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "385fb6d12139188406a504dfaf1830bec2b6039ffb80a1ee11215ab3721535dc";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "OverdraftQuery";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", R2.t).selections(X.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
    }
}

