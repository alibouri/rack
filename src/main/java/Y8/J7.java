package Y8;

import M.J;
import Nb.j;
import Z8.c4;
import c9.y0;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.i2;
import m5.b;

public final class j7 implements Mutation {
    public final String a;

    public j7(String s) {
        this.a = s;
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(c4.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation ResendSMS($id: String!) { resendSMS(tokenId: $id) { token { __typename ...SmsTokenFragment } } }  fragment SmsTokenFragment on SMSToken { id mobile length robocallsEnabled resendSmsDelaySeconds shouldUseOldSmsUserConsentAutofill attachLogs }";
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof j7 ? j.a(this.a, ((j7)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "68da9c28d753b219c5cb073998359413267954a83605879059bea5dc90ce56ca";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "ResendSMS";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", i2.p2).selections(y0.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        J.m(jsonWriter0, "writer", customScalarAdapters0, "customScalarAdapters", "id");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, this.a);
    }

    @Override
    public final String toString() {
        return b.y(new StringBuilder("ResendSMSMutation(id="), this.a, ")");
    }
}

