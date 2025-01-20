package Y8;

import Nb.j;
import Nb.x;
import Z8.B1;
import c9.N;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.R2;

public final class j3 implements Query {
    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(B1.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query InAppReviewQuery { me { id appProps { promptForAppReview } } }";
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 != null && object0.getClass() == j3.class;
    }

    @Override
    public final int hashCode() {
        return x.a(j3.class).hashCode();
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "4051b54dfaedbe286a5e5a6da8121fcbcce2fbf8f26462b16d2223f167da170b";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "InAppReviewQuery";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", R2.t).selections(N.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
    }
}

