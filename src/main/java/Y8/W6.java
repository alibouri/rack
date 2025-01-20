package Y8;

import Nb.j;
import Nb.x;
import Z8.O3;
import c9.r0;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.R2;

public final class w6 implements Query {
    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(O3.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query RefreshMinAppVersionQuery { appProps { minAppVersion appSideloadUrl } }";
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 != null && object0.getClass() == w6.class;
    }

    @Override
    public final int hashCode() {
        return x.a(w6.class).hashCode();
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "20a00d65209b9e14e962f6ed05dc5176dfe4ae5a7f952bba44f0750bea577c63";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "RefreshMinAppVersionQuery";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", R2.t).selections(r0.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
    }
}

