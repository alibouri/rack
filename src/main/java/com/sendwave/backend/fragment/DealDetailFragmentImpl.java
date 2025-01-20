package com.sendwave.backend.fragment;

import Nb.j;
import Nb.x;
import b9.u;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Fragment;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.H0;

public final class DealDetailFragmentImpl implements Fragment {
    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(DealDetailFragmentImpl_ResponseAdapter.DealDetailFragment.a, false, 1, null);
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 != null && object0.getClass() == DealDetailFragmentImpl.class;
    }

    @Override
    public final int hashCode() {
        return x.a(DealDetailFragmentImpl.class).hashCode();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", H0.a).selections(u.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
    }
}

