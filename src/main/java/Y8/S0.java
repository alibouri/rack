package Y8;

import Nb.j;
import Z8.F;
import c9.k;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional.Present;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.R2;

public final class s0 implements Query {
    public final Optional a;
    public final Present b;

    public s0(Present optional$Present0, Optional optional0) {
        j.f(optional0, "before");
        super();
        this.a = optional0;
        this.b = optional$Present0;
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(F.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query ClaimedScratchCardsQuery($before: ID, $last: Int) { session { user { id scratchCards { claimedCards(before: $before, last: $last, includeExpired: true) { __typename ...ClaimedScratchCardsFragment } } } } }  fragment ScratchCardDetailsFragment on ScratchCardDetails { iconUrl title body }  fragment ClaimedScratchCardsFragment on ClaimedScratchCardConnection { pageInfo { hasNextPage } edges { node { id whenExpires iconUrl awardText awardSubtext details { __typename ...ScratchCardDetailsFragment } } } }";
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof s0)) {
            return false;
        }
        return j.a(this.a, ((s0)object0).a) ? this.b.equals(((s0)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "ea301a41bf1220b133ae2ddfa91a69c31ce94239629c08a6e46e2bdfb4754939";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "ClaimedScratchCardsQuery";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", R2.t).selections(k.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        Optional optional0 = this.a;
        if(optional0 instanceof Present) {
            jsonWriter0.name("before");
            Adapters.-present(Adapters.NullableStringAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional0));
        }
        jsonWriter0.name("last");
        Adapters.-present(Adapters.NullableIntAdapter).toJson(jsonWriter0, customScalarAdapters0, this.b);
    }

    @Override
    public final String toString() {
        return "ClaimedScratchCardsQuery(before=" + this.a + ", last=" + this.b + ")";
    }
}

