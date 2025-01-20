package Y8;

import A3.e;
import M.J;
import Nb.j;
import Z8.K;
import c9.l;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.type.UserInterface.SMARTPHONE_APP;
import com.sendwave.models.CurrencyAmount;
import d9.i2;

public final class w0 implements Mutation {
    public final String a;
    public final CurrencyAmount b;
    public final String c;
    public final String d;
    public final String e;
    public final SMARTPHONE_APP f;

    public w0(String s, CurrencyAmount currencyAmount0, String s1, String s2, String s3, SMARTPHONE_APP userInterface$SMARTPHONE_APP0) {
        j.f(s, "checkoutSessionId");
        j.f(currencyAmount0, "amount");
        j.f(s1, "merchantName");
        j.f(s2, "waveLaunchUrl");
        j.f(s3, "linkSource");
        j.f(userInterface$SMARTPHONE_APP0, "userInterface");
        super();
        this.a = s;
        this.b = currencyAmount0;
        this.c = s1;
        this.d = s2;
        this.e = s3;
        this.f = userInterface$SMARTPHONE_APP0;
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(K.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation CompleteApiCheckout($checkoutSessionId: ID!, $amount: Money!, $merchantName: String!, $waveLaunchUrl: String!, $linkSource: String!, $userInterface: UserInterface!) { completeApiCheckout(checkoutSessionId: $checkoutSessionId, amount: $amount, merchantName: $merchantName, waveLaunchUrl: $waveLaunchUrl, linkSource: $linkSource, userInterface: $userInterface) { resultCode redirectUrl visualResponseType headerText bodyText actionText } }";
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof w0)) {
            return false;
        }
        if(!j.a(this.a, ((w0)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((w0)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((w0)object0).c)) {
            return false;
        }
        if(!j.a(this.d, ((w0)object0).d)) {
            return false;
        }
        return j.a(this.e, ((w0)object0).e) ? j.a(this.f, ((w0)object0).f) : false;
    }

    @Override
    public final int hashCode() {
        return this.f.hashCode() + e.s(e.s(e.s(o.n(this.b, this.a.hashCode() * 0x1F, 0x1F), 0x1F, this.c), 0x1F, this.d), 0x1F, this.e);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "6835abdc0c222cca0c034bd95fe376a55c5361808827cbfd713c45065f73057a";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "CompleteApiCheckout";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", i2.p2).selections(l.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        J.m(jsonWriter0, "writer", customScalarAdapters0, "customScalarAdapters", "checkoutSessionId");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, this.a);
        jsonWriter0.name("amount");
        j.f(this.b, "value");
        String s = this.b.k();
        j.e(s, "toSerialized(...)");
        jsonWriter0.value(s);
        jsonWriter0.name("merchantName");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, this.c);
        jsonWriter0.name("waveLaunchUrl");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, this.d);
        jsonWriter0.name("linkSource");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, this.e);
        jsonWriter0.name("userInterface");
        j.f(this.f, "value");
        jsonWriter0.value(SMARTPHONE_APP.Y);
    }

    @Override
    public final String toString() {
        return "CompleteApiCheckoutMutation(checkoutSessionId=" + this.a + ", amount=" + this.b + ", merchantName=" + this.c + ", waveLaunchUrl=" + this.d + ", linkSource=" + this.e + ", userInterface=" + this.f + ")";
    }
}

