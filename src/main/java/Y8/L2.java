package Y8;

import M.J;
import Nb.j;
import Z8.b1;
import c9.G;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.R2;
import m5.b;

public final class l2 implements Query {
    public final String a;

    public l2(String s) {
        this.a = s;
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(b1.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query FetchMagicLinkDescriptionAudioUrlQuery($countryIso2: String!) { appProps { magicLinkDescriptionAudioUrl(countryIso2: $countryIso2) } }";
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof l2 ? j.a(this.a, ((l2)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "189bd22d9251bd5157eb69987ab4b615eb0d028676928ea83e9b8a756280b7e3";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "FetchMagicLinkDescriptionAudioUrlQuery";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", R2.t).selections(G.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        J.m(jsonWriter0, "writer", customScalarAdapters0, "customScalarAdapters", "countryIso2");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, this.a);
    }

    @Override
    public final String toString() {
        return b.y(new StringBuilder("FetchMagicLinkDescriptionAudioUrlQuery(countryIso2="), this.a, ")");
    }
}

