package com.sendwave.backend.fragment;

import Nb.j;
import Nb.x;
import b9.t;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Fragment;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.Y4;

public final class CustomerMostRecentTxHistoryFragmentImpl implements Fragment {
    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(CustomerMostRecentTxHistoryFragmentImpl_ResponseAdapter.CustomerMostRecentTxHistoryFragment.a, false, 1, null);
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 != null && object0.getClass() == CustomerMostRecentTxHistoryFragmentImpl.class;
    }

    @Override
    public final int hashCode() {
        return x.a(CustomerMostRecentTxHistoryFragmentImpl.class).hashCode();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", Y4.h).selections(t.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
    }
}

