package Y8;

import M.J;
import Nb.j;
import Z8.F5;
import c9.X0;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.i2;
import m5.b;

public final class m9 implements Mutation {
    public final String a;
    public final String b;

    public m9(String s, String s1) {
        j.f(s, "billFavoriteOpaqueId");
        j.f(s1, "name");
        super();
        this.a = s;
        this.b = s1;
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(F5.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation UpdateBillFavoriteName($billFavoriteOpaqueId: ID!, $name: String!) { updateBillFavoriteName(billFavoriteOpaqueId: $billFavoriteOpaqueId, name: $name) { favorite { id name } } }";
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof m9)) {
            return false;
        }
        return j.a(this.a, ((m9)object0).a) ? j.a(this.b, ((m9)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "e20f08d343a059b88287cd6a1457780503fbdc98b94e98cf27ece358a952c419";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "UpdateBillFavoriteName";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", i2.p2).selections(X0.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        J.m(jsonWriter0, "writer", customScalarAdapters0, "customScalarAdapters", "billFavoriteOpaqueId");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, this.a);
        jsonWriter0.name("name");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, this.b);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("UpdateBillFavoriteNameMutation(billFavoriteOpaqueId=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", name=");
        return b.y(stringBuilder0, this.b, ")");
    }
}

