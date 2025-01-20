package Y8;

import A3.e;
import M.J;
import Nb.j;
import Z8.f4;
import c9.z0;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.R0;
import d9.i2;
import e9.a;

public final class m7 implements Mutation {
    public final String a;
    public final String b;
    public final R0 c;

    public m7(String s, String s1, R0 r00) {
        j.f(s, "pin");
        j.f(s1, "previousPin");
        j.f(r00, "device");
        super();
        this.a = s;
        this.b = s1;
        this.c = r00;
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(f4.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation ResetPinMutation($pin: String!, $previousPin: String!, $device: DeviceInfo!) { resetPin(pin: $pin, previousPin: $previousPin, deviceInfo: $device) { hadPinBefore } }";
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof m7)) {
            return false;
        }
        if(!j.a(this.a, ((m7)object0).a)) {
            return false;
        }
        return j.a(this.b, ((m7)object0).b) ? j.a(this.c, ((m7)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() + e.s(this.a.hashCode() * 0x1F, 0x1F, this.b);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "7c7d49fd4678528660cbb1f9dfb00ab943f4b1ebcfa08aae4b4f8daf9b1b459a";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "ResetPinMutation";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", i2.p2).selections(z0.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        J.m(jsonWriter0, "writer", customScalarAdapters0, "customScalarAdapters", "pin");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, this.a);
        jsonWriter0.name("previousPin");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, this.b);
        jsonWriter0.name("device");
        Adapters.-obj$default(a.h, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, this.c);
    }

    @Override
    public final String toString() {
        return "ResetPinMutation(pin=" + this.a + ", previousPin=" + this.b + ", device=" + this.c + ")";
    }
}

