package Y8;

import Nb.j;
import Nb.x;
import Z8.Y3;
import c9.w0;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.i2;

public final class c7 implements Mutation {
    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(Y3.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation ResendMagicLinkSecurityChallengeSms { resendMagicLinkSecurityChallengeSMS { success } }";
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 != null && object0.getClass() == c7.class;
    }

    @Override
    public final int hashCode() {
        return x.a(c7.class).hashCode();
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "fcb488244dda5440f2fa85558862935f52035c4f2fe84eb8a793e7a1ef2495a2";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "ResendMagicLinkSecurityChallengeSms";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", i2.p2).selections(w0.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
    }
}

