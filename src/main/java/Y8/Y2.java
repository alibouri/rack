package Y8;

import M.J;
import Nb.j;
import Z8.e1;
import c9.I;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.Optional.Absent;
import com.apollographql.apollo.api.Optional.Present;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.type.SecurityQuestionFormPurpose.SELF_SERVE_PIN_RECOVERY;
import d9.i2;
import e9.a;

public final class y2 implements Mutation {
    public final SELF_SERVE_PIN_RECOVERY a;
    public final Optional b;

    public y2(SELF_SERVE_PIN_RECOVERY securityQuestionFormPurpose$SELF_SERVE_PIN_RECOVERY0) {
        j.f(securityQuestionFormPurpose$SELF_SERVE_PIN_RECOVERY0, "formPurpose");
        j.f(Absent.INSTANCE, "formContent");
        super();
        this.a = securityQuestionFormPurpose$SELF_SERVE_PIN_RECOVERY0;
        this.b = Absent.INSTANCE;
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(e1.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation GenerateSecurityQuestionFormMutation($formPurpose: SecurityQuestionFormPurpose!, $formContent: SecurityQuestionFormContent) { generateSecurityQuestionForm(formPurpose: $formPurpose, formContent: $formContent) { questionForm { __typename ...SecurityQuestionFragment } } }  fragment SecurityQuestionFragment on SecurityQuestionForm { id questionLabel whenExpires isCorrectlyAnswered fields { id fieldFormat fieldLabel fieldQuery answerOptions } }";
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof y2)) {
            return false;
        }
        return j.a(this.a, ((y2)object0).a) ? j.a(this.b, ((y2)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "73a3f62f5c08117389293d4542a2f325d10650f52f9d6c0f8b0b666072122d1f";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "GenerateSecurityQuestionFormMutation";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", i2.p2).selections(I.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        J.m(jsonWriter0, "writer", customScalarAdapters0, "customScalarAdapters", "formPurpose");
        j.f(this.a, "value");
        jsonWriter0.value(SELF_SERVE_PIN_RECOVERY.Y);
        Optional optional0 = this.b;
        if(optional0 instanceof Present) {
            jsonWriter0.name("formContent");
            Adapters.-present(Adapters.-nullable(a.u)).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional0));
        }
    }

    @Override
    public final String toString() {
        return "GenerateSecurityQuestionFormMutation(formPurpose=" + this.a + ", formContent=" + this.b + ")";
    }
}

