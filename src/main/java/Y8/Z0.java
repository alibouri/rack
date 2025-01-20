package Y8;

import M.J;
import Nb.j;
import Z8.M;
import c9.m;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.Optional.Present;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.i2;

public final class z0 implements Mutation {
    public final String a;
    public final boolean b;
    public final Optional c;

    public z0(String s, boolean z, Optional optional0) {
        j.f(s, "magicLinkSecret");
        j.f(optional0, "referrer");
        super();
        this.a = s;
        this.b = z;
        this.c = optional0;
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(M.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation ConfirmMagicLinkSecurityChallenge($magicLinkSecret: String!, $autofilled: Boolean!, $referrer: String) { confirmMagicLinkSecurityChallenge(magicLinkSecret: $magicLinkSecret, autofilled: $autofilled, referrer: $referrer) { success } }";
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof z0)) {
            return false;
        }
        if(!j.a(this.a, ((z0)object0).a)) {
            return false;
        }
        return this.b == ((z0)object0).b ? j.a(this.c, ((z0)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return this.b ? this.c.hashCode() + (v * 0x1F + 0x4CF) * 0x1F : this.c.hashCode() + (v * 0x1F + 0x4D5) * 0x1F;
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "69d930779a9636a6a220bafa6ba73723529b0e33b2ce35cbad1ba3e337d461ea";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "ConfirmMagicLinkSecurityChallenge";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", i2.p2).selections(m.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        J.m(jsonWriter0, "writer", customScalarAdapters0, "customScalarAdapters", "magicLinkSecret");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, this.a);
        jsonWriter0.name("autofilled");
        Adapters.BooleanAdapter.toJson(jsonWriter0, customScalarAdapters0, Boolean.valueOf(this.b));
        Optional optional0 = this.c;
        if(optional0 instanceof Present) {
            jsonWriter0.name("referrer");
            Adapters.-present(Adapters.NullableStringAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional0));
        }
    }

    @Override
    public final String toString() {
        return "ConfirmMagicLinkSecurityChallengeMutation(magicLinkSecret=" + this.a + ", autofilled=" + this.b + ", referrer=" + this.c + ")";
    }
}

