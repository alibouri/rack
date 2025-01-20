package Y8;

import M.J;
import Z8.l0;
import c9.t;
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

public final class f1 implements Mutation {
    public final ArrayList a;
    public final Object b;

    public f1(ArrayList arrayList0, List list0) {
        this.a = arrayList0;
        this.b = list0;
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(l0.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation CustomerLogout($reportedOpaqueIDs: [ID!]!, $insecureCurrentlyLoggedInUserMobiles: [String!]!) { logout(insecureCurrentlyLoggedInUserSessionIds: $reportedOpaqueIDs, insecureCurrentlyLoggedInUserMobiles: $insecureCurrentlyLoggedInUserMobiles) { succeeded } }";
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof f1)) {
            return false;
        }
        return this.a.equals(((f1)object0).a) ? this.b.equals(((f1)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "88509fa3962cb83041d434c4885b1f0c4618325435b75334bb65275b7c5cec9b";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "CustomerLogout";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", i2.p2).selections(t.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        J.m(jsonWriter0, "writer", customScalarAdapters0, "customScalarAdapters", "reportedOpaqueIDs");
        Adapters.-list(Adapters.StringAdapter).toJson(jsonWriter0, customScalarAdapters0, this.a);
        jsonWriter0.name("insecureCurrentlyLoggedInUserMobiles");
        Adapters.-list(Adapters.StringAdapter).toJson(jsonWriter0, customScalarAdapters0, ((List)this.b));
    }

    @Override
    public final String toString() {
        return "CustomerLogoutMutation(reportedOpaqueIDs=" + this.a + ", insecureCurrentlyLoggedInUserMobiles=" + this.b + ")";
    }
}

