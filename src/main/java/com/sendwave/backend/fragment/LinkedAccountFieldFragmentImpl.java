package com.sendwave.backend.fragment;

import Nb.j;
import Nb.x;
import b9.G;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Fragment;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.I1;

public final class LinkedAccountFieldFragmentImpl implements Fragment {
    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj(LinkedAccountFieldFragmentImpl_ResponseAdapter.LinkedAccountFieldFragment.a, true);
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 != null && object0.getClass() == LinkedAccountFieldFragmentImpl.class;
    }

    @Override
    public final int hashCode() {
        return x.a(LinkedAccountFieldFragmentImpl.class).hashCode();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", I1.a).selections(G.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
    }
}

