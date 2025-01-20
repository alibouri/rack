package Y8;

import Nb.j;
import Z8.T4;
import c9.L0;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional.Present;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.R2;
import e9.a;

public final class o8 implements Query {
    public final Present a;

    public o8(Present optional$Present0) {
        this.a = optional$Present0;
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(T4.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query SecurityChallengeQuery($securityFormPurpose: SecurityQuestionFormPurpose) { securityChallenge(securityFormPurpose: $securityFormPurpose) { __typename ... on SecurityQuestionForm { __typename ...SecurityQuestionFragment } ... on SMSToken { __typename ...SmsTokenFragment } } }  fragment SecurityQuestionFragment on SecurityQuestionForm { id questionLabel whenExpires isCorrectlyAnswered fields { id fieldFormat fieldLabel fieldQuery answerOptions } }  fragment SmsTokenFragment on SMSToken { id mobile length robocallsEnabled resendSmsDelaySeconds shouldUseOldSmsUserConsentAutofill attachLogs }";
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof o8 ? this.a.equals(((o8)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "26233572097c624de921d3fefa4d2fd5a6a68c41abc1660d51b96d2de9b48771";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "SecurityChallengeQuery";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", R2.t).selections(L0.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        jsonWriter0.name("securityFormPurpose");
        Adapters.-present(Adapters.-nullable(a.v)).toJson(jsonWriter0, customScalarAdapters0, this.a);
    }

    @Override
    public final String toString() {
        return "SecurityChallengeQuery(securityFormPurpose=" + this.a + ")";
    }
}

