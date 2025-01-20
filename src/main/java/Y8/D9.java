package Y8;

import Nb.j;
import Nb.x;
import Z8.z5;
import c9.V0;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.R2;

public final class d9 implements Query {
    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(z5.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query TxHistoryOfflineSyncPropsQuery { session { __typename ...TxHistoryOfflineSyncPropsFragment } }  fragment TxHistoryOfflineSyncPropsFragment on Session { id user { id appProps { txHistoryOfflineSyncProps { firstPageSize subsequentPagesSize whenShouldDoFullResync } } } }";
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 != null && object0.getClass() == d9.class;
    }

    @Override
    public final int hashCode() {
        return x.a(d9.class).hashCode();
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "07939653352869f1c6d21d164ac9d92fabd1897ae650e4804525da549cb18b63";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "TxHistoryOfflineSyncPropsQuery";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", R2.t).selections(V0.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
    }
}

