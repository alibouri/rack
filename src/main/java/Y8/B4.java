package Y8;

import A3.e;
import M.J;
import Nb.j;
import Z8.W1;
import c9.V;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.i2;
import m5.b;

public final class b4 implements Mutation {
    public final String a;
    public final String b;
    public final String c;

    public b4(String s, String s1, String s2) {
        j.f(s, "linkedAccountId");
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(W1.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation OtpValidateLinkedAccount($linkedAccountId: ID!, $otp: String!, $idempotencyKey: String!) { otpValidateLinkedAccount(linkedAccountId: $linkedAccountId, otp: $otp, idempotencyKey: $idempotencyKey) { account { __typename ...LinkedAccountFragment } } }  fragment LinkedAccountFieldFragment on LinkedAccountField { __typename name displayName ... on LinkedAccountTextField { minLength maxLength formatter { __typename ... on TextFieldGroupedFormatter { groupSize separator } } inputType } }  fragment LinkedAccountTypeFragment on LinkedAccountType { id name kind icon linkFields { __typename ...LinkedAccountFieldFragment } initialLinkStep transferFields { __typename ...LinkedAccountFieldFragment } fromWalletFee { formula label } fromWalletFeeWithoutPromos { formula label } toWalletFee { formula label } toWalletFeeWithoutPromos { formula label } features terms { id url } minAmount maxAmount overallFeeDescription hasBalanceInfo partnerCollectsB2wFees }  fragment LinkedAccountFragment on LinkedAccount { id label categoryLabel accountType { __typename ...LinkedAccountTypeFragment } state { __typename ... on Linking { __typename } ... on LinkingFailed { ufeCode ufeMessage } ... on Linked { __typename } ... on NeedsValidation { __typename otpMobileSuffix } ... on Validating { __typename } ... on ValidationFailed { ufeCode ufeMessage } } }";
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof b4)) {
            return false;
        }
        if(!j.a(this.a, ((b4)object0).a)) {
            return false;
        }
        return j.a(this.b, ((b4)object0).b) ? j.a(this.c, ((b4)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() + e.s(this.a.hashCode() * 0x1F, 0x1F, this.b);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "4db5c4dc2493f00d66e0a87cdb0cc3346d85dc3fe69528d34b4992e7789f6c00";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "OtpValidateLinkedAccount";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", i2.p2).selections(V.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        J.m(jsonWriter0, "writer", customScalarAdapters0, "customScalarAdapters", "linkedAccountId");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, this.a);
        jsonWriter0.name("otp");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, this.b);
        jsonWriter0.name("idempotencyKey");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, this.c);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("OtpValidateLinkedAccountMutation(linkedAccountId=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", otp=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", idempotencyKey=");
        return b.y(stringBuilder0, this.c, ")");
    }
}

