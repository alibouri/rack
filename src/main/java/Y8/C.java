package Y8;

import M.J;
import Nb.j;
import Z8.b;
import c9.a;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.i2;

public final class c implements Mutation {
    public final String a;

    public c(String s) {
        j.f(s, "termsId");
        super();
        this.a = s;
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(b.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation AcceptLinkedAccountTermsMutation($termsId: ID!) { acceptLinkedAccountTerms(termsId: $termsId) { id } }";
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof c ? j.a(this.a, ((c)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "cc82d1f1c1642be56f196cea84f2b57a59acdfc73df8225a0679b0ce177f17cc";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "AcceptLinkedAccountTermsMutation";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", i2.p2).selections(a.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        J.m(jsonWriter0, "writer", customScalarAdapters0, "customScalarAdapters", "termsId");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, this.a);
    }

    @Override
    public final String toString() {
        return m5.b.y(new StringBuilder("AcceptLinkedAccountTermsMutation(termsId="), this.a, ")");
    }
}

