package Y8;

import M.J;
import Nb.j;
import Z8.x5;
import c9.U0;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.type.PartnerOrg;
import d9.R2;

public final class a9 implements Query {
    public final PartnerOrg a;

    public a9(PartnerOrg partnerOrg0) {
        j.f(partnerOrg0, "partnerOrg");
        super();
        this.a = partnerOrg0;
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(x5.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query TermsAndConditionsQuery($partnerOrg: PartnerOrg!) { termsAndConditions(partnerOrg: $partnerOrg) { latestVersion askUserToReaccept terms } }";
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof a9 ? j.a(this.a, ((a9)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "aebde5e7413fdddf0f55657237a566b1c289c7910e33b4f9867efa73d34f472d";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "TermsAndConditionsQuery";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", R2.t).selections(U0.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        J.m(jsonWriter0, "writer", customScalarAdapters0, "customScalarAdapters", "partnerOrg");
        j.f(this.a, "value");
        jsonWriter0.value(this.a.a());
    }

    @Override
    public final String toString() {
        return "TermsAndConditionsQuery(partnerOrg=" + this.a + ")";
    }
}

