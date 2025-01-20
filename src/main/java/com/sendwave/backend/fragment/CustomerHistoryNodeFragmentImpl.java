package com.sendwave.backend.fragment;

import Nb.j;
import Nb.x;
import b9.q;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Fragment;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.w1;

public final class CustomerHistoryNodeFragmentImpl implements Fragment {
    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj(CustomerHistoryNodeFragmentImpl_ResponseAdapter.CustomerHistoryNodeFragment.a, true);
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 != null && object0.getClass() == CustomerHistoryNodeFragmentImpl.class;
    }

    @Override
    public final int hashCode() {
        return x.a(CustomerHistoryNodeFragmentImpl.class).hashCode();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", w1.a).selections(q.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
    }
}

