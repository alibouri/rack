package Y8;

import M.J;
import Nb.j;
import Z8.Z1;
import c9.W;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.i2;
import m5.b;

public final class f4 implements Mutation {
    public final String a;
    public final String b;

    public f4(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(Z1.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation OverdraftAcceptTermsMutation($id: ID!, $version: String!) { acceptUserOverdraftTerms(id: $id, version: $version) { termsAndConditions { id acceptedVersion latestVersion url } } }";
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof f4)) {
            return false;
        }
        return j.a(this.a, ((f4)object0).a) ? j.a(this.b, ((f4)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "7173e6e1e3a250f69156dddc3db216c614b4bf21c174f492d682f2dd551442b8";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "OverdraftAcceptTermsMutation";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", i2.p2).selections(W.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        J.m(jsonWriter0, "writer", customScalarAdapters0, "customScalarAdapters", "id");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, this.a);
        jsonWriter0.name("version");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, this.b);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("OverdraftAcceptTermsMutation(id=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", version=");
        return b.y(stringBuilder0, this.b, ")");
    }
}

