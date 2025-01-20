package Y8;

import Nb.j;
import Nb.x;
import Z8.R0;
import c9.D;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.i2;

public final class a2 implements Mutation {
    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(R0.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation EnableDeviceManagementRestrictionMutation { enableDeviceManagementRestriction { user { __typename ...DeviceManagementDevicesFragment } } }  fragment DeviceManagementDevicesFragment on User { id deviceManagementDevices { deviceModel isCurrentDevice whenUsed } appProps { deviceManagementRestrictionEnabled } }";
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 != null && object0.getClass() == a2.class;
    }

    @Override
    public final int hashCode() {
        return x.a(a2.class).hashCode();
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "a576de1da2690c026a14a9542027150f5e10ca2db4ba3f541aeb7e82a2a483c5";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "EnableDeviceManagementRestrictionMutation";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", i2.p2).selections(D.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
    }
}

