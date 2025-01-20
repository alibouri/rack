package Y8;

import Nb.j;
import Nb.x;
import Z8.M3;
import c9.q0;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.R2;

public final class t6 implements Query {
    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(M3.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query RefreshAppRemoteConfigQuery { appProps { appPerformanceMonitoringEnabled appFileLoggingEnabled appReportApolloInternalErrors } }";
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 != null && object0.getClass() == t6.class;
    }

    @Override
    public final int hashCode() {
        return x.a(t6.class).hashCode();
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "61e6685417d7ec8df9dc49f986166008ee6ccdd4bbc5205fc780dca8caa26c5f";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "RefreshAppRemoteConfigQuery";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", R2.t).selections(q0.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
    }
}

