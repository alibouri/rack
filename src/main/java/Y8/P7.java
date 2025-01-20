package Y8;

import M.J;
import Nb.j;
import Z8.h4;
import c9.A0;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.i2;
import java.util.List;

public final class p7 implements Mutation {
    public final List a;

    public p7(List list0) {
        this.a = list0;
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(h4.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation RespondOstrichEasterEggsMutation($packageNames: [String!]!) { respondOstrichEasterEggs(ostrichEggs: $packageNames) { acknowledged } }";
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof p7 ? j.a(this.a, ((p7)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "973bb9251e42e3862ca8c674c1b602f0876902f10180c875608cd882e1564589";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "RespondOstrichEasterEggsMutation";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", i2.p2).selections(A0.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        J.m(jsonWriter0, "writer", customScalarAdapters0, "customScalarAdapters", "packageNames");
        Adapters.-list(Adapters.StringAdapter).toJson(jsonWriter0, customScalarAdapters0, this.a);
    }

    @Override
    public final String toString() {
        return J.h(new StringBuilder("RespondOstrichEasterEggsMutation(packageNames="), this.a, ")");
    }
}

