package Y8;

import M.J;
import Nb.j;
import Z8.X4;
import c9.M0;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.R2;
import m5.b;

public final class s8 implements Query {
    public final String a;

    public s8(String s) {
        j.f(s, "securityQuestionFormId");
        super();
        this.a = s;
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(X4.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query SecurityQuestionForm($securityQuestionFormId: String!) { securityQuestionForm(securityQuestionFormId: $securityQuestionFormId) { __typename ...SecurityQuestionFragment } }  fragment SecurityQuestionFragment on SecurityQuestionForm { id questionLabel whenExpires isCorrectlyAnswered fields { id fieldFormat fieldLabel fieldQuery answerOptions } }";
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof s8 ? j.a(this.a, ((s8)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "4ccc267866e1bc702509db9ac4942d21f4da8fb06dce9284955502b3b7cf1ab6";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "SecurityQuestionForm";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", R2.t).selections(M0.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        J.m(jsonWriter0, "writer", customScalarAdapters0, "customScalarAdapters", "securityQuestionFormId");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, this.a);
    }

    @Override
    public final String toString() {
        return b.y(new StringBuilder("SecurityQuestionFormQuery(securityQuestionFormId="), this.a, ")");
    }
}

