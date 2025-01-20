package Y8;

import A3.e;
import M.J;
import Nb.j;
import Z8.I5;
import c9.Y0;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.i2;
import java.util.ArrayList;
import java.util.List;

public final class p9 implements Mutation {
    public final String a;
    public final ArrayList b;
    public final String c;
    public final Object d;

    public p9(String s, ArrayList arrayList0, String s1, List list0) {
        j.f(s, "deviceId");
        super();
        this.a = s;
        this.b = arrayList0;
        this.c = s1;
        this.d = list0;
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(I5.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation UpdateDeviceSessionsMutation($deviceId: String!, $insecureCurrentlyLoggedInUserSessionIds: [ID!]!, $idempotencyKey: String!, $insecureCurrentlyLoggedInUserMobiles: [String!]!) { updateDeviceSessions(deviceId: $deviceId, insecureCurrentlyLoggedInUserSessionIds: $insecureCurrentlyLoggedInUserSessionIds, idempotencyKey: $idempotencyKey, insecureCurrentlyLoggedInUserMobiles: $insecureCurrentlyLoggedInUserMobiles) { succeeded } }";
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof p9)) {
            return false;
        }
        if(!j.a(this.a, ((p9)object0).a)) {
            return false;
        }
        if(!this.b.equals(((p9)object0).b)) {
            return false;
        }
        return this.c.equals(((p9)object0).c) ? this.d.equals(((p9)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode() + e.s((this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F, 0x1F, this.c);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "972a42dcaa0ce5fde84e7240ea8afbdbbe8563c8262d9c5147c742eb4f6539bb";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "UpdateDeviceSessionsMutation";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", i2.p2).selections(Y0.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        J.m(jsonWriter0, "writer", customScalarAdapters0, "customScalarAdapters", "deviceId");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, this.a);
        jsonWriter0.name("insecureCurrentlyLoggedInUserSessionIds");
        Adapters.-list(Adapters.StringAdapter).toJson(jsonWriter0, customScalarAdapters0, this.b);
        jsonWriter0.name("idempotencyKey");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, this.c);
        jsonWriter0.name("insecureCurrentlyLoggedInUserMobiles");
        Adapters.-list(Adapters.StringAdapter).toJson(jsonWriter0, customScalarAdapters0, ((List)this.d));
    }

    @Override
    public final String toString() {
        return "UpdateDeviceSessionsMutation(deviceId=" + this.a + ", insecureCurrentlyLoggedInUserSessionIds=" + this.b + ", idempotencyKey=" + this.c + ", insecureCurrentlyLoggedInUserMobiles=" + this.d + ")";
    }
}

