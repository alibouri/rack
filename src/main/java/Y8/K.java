package Y8;

import M.J;
import Nb.j;
import Z8.g;
import c9.c;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.i2;
import m5.b;

public final class k implements Mutation {
    public final String a;

    public k(String s) {
        this.a = s;
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(g.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation AcknowledgePushNotification($pushNotificationAttemptOpaqueId: ID!) { acknowledgePushNotification(pushNotificationAttemptOpaqueId: $pushNotificationAttemptOpaqueId) { succeeded } }";
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof k ? j.a(this.a, ((k)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "44a55b621eba28fa3ca088c21db169d72951dadca4477335694eccb80c3ef003";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "AcknowledgePushNotification";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", i2.p2).selections(c.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        J.m(jsonWriter0, "writer", customScalarAdapters0, "customScalarAdapters", "pushNotificationAttemptOpaqueId");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, this.a);
    }

    @Override
    public final String toString() {
        return b.y(new StringBuilder("AcknowledgePushNotificationMutation(pushNotificationAttemptOpaqueId="), this.a, ")");
    }
}

