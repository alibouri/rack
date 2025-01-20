package Y8;

import Nb.j;
import Nb.x;
import Z8.U0;
import c9.E;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.R2;

public final class e2 implements Query {
    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(U0.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query FavoriteBuyAirtimeRecipientsQuery { me { id primaryWallet { __typename id ...FavoriteBuyAirtimeRecipientsFragment } } }  fragment FavoriteBuyAirtimeRecipientsFragment on Wallet { id favoriteBuyAirtimeRecipients { name mobile isSelf } }";
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 != null && object0.getClass() == e2.class;
    }

    @Override
    public final int hashCode() {
        return x.a(e2.class).hashCode();
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "29d547eb35d8526df7331e0f365540522b82b5aaff499a171375dfab8485e15f";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "FavoriteBuyAirtimeRecipientsQuery";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", R2.t).selections(E.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
    }
}

