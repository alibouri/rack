package com.sendwave.backend.fragment;

import Nb.j;
import b9.M;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Fragment;
import com.apollographql.apollo.api.Optional.Absent;
import com.apollographql.apollo.api.Optional.Present;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.a2;

public final class MerchantPaymentInfoFragmentImpl implements Fragment {
    public final Optional a;

    public MerchantPaymentInfoFragmentImpl() {
        j.f(Absent.INSTANCE, "devicePixelRatio");
        super();
        this.a = Absent.INSTANCE;
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(MerchantPaymentInfoFragmentImpl_ResponseAdapter.MerchantPaymentInfoFragment.a, false, 1, null);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof MerchantPaymentInfoFragmentImpl ? j.a(this.a, ((MerchantPaymentInfoFragmentImpl)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", a2.b).selections(M.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        Optional optional0 = this.a;
        if(optional0 instanceof Present) {
            jsonWriter0.name("devicePixelRatio");
            Adapters.-present(Adapters.NullableDoubleAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional0));
        }
    }

    @Override
    public final String toString() {
        return "MerchantPaymentInfoFragmentImpl(devicePixelRatio=" + this.a + ")";
    }
}

