package Y8;

import M.J;
import Nb.j;
import Z8.a4;
import c9.x0;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.i2;
import m5.b;

public final class f7 implements Mutation {
    public final String a;

    public f7(String s) {
        j.f(s, "smsTokenId");
        super();
        this.a = s;
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(a4.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation ResendMagicLinkSecurityChallengeSmsOnLogin($smsTokenId: String!) { resendMagicLinkSecurityChallengeSMSOnLogin(smsTokenId: $smsTokenId) { success } }";
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof f7 ? j.a(this.a, ((f7)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "7bf9f3acd1cb0a16aa1fe680d29c5b551e520c976f589b25114427e22b83cc52";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "ResendMagicLinkSecurityChallengeSmsOnLogin";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", i2.p2).selections(x0.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        J.m(jsonWriter0, "writer", customScalarAdapters0, "customScalarAdapters", "smsTokenId");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, this.a);
    }

    @Override
    public final String toString() {
        return b.y(new StringBuilder("ResendMagicLinkSecurityChallengeSmsOnLoginMutation(smsTokenId="), this.a, ")");
    }
}

