package Y8;

import Nb.j;
import Nb.x;
import Z8.X0;
import c9.F;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.R2;

public final class i2 implements Query {
    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(X0.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query FavoriteRecipientsQuery { me { id primaryWallet { __typename ...FavoriteRecipientsFragment } } }  fragment FavoriteRecipientsFragment on Wallet { id favoriteRecipients { name mobile } }";
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 != null && object0.getClass() == i2.class;
    }

    @Override
    public final int hashCode() {
        return x.a(i2.class).hashCode();
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "28c3dad4d3fe9df37302386121f8251880b4c696a4af7d4bcafe1392f95016f2";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "FavoriteRecipientsQuery";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", R2.t).selections(F.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
    }
}

