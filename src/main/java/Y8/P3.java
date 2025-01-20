package Y8;

import Nb.j;
import Nb.x;
import Z8.D1;
import c9.O;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.R2;

public final class p3 implements Query {
    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(D1.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query KycInfoRefreshQuery { me { id kycInfo { limits(computeRemaining: true) { __typename ...KycLimitFragment } idStatus { __typename ...IdPhotoStatusFragment } } } }  fragment KycLimitFragment on UserKycLimit { description value }  fragment IdPhotoStatusFragment on UserKycIdPhotoStatus { __typename button ... on UserKycIdPhotoStatusWithSimpleText { text } ... on UserKycIdPhotoStatusWithTextWithIcon { text icon } ... on UserKycIdPhotoStatusWithTextInRectangle { title text icon rectangle } }";
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 != null && object0.getClass() == p3.class;
    }

    @Override
    public final int hashCode() {
        return x.a(p3.class).hashCode();
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "ac296ab79462b649f0a9b95e8382ca393ae52458d879279074bc5ee4eb46ac84";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "KycInfoRefreshQuery";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", R2.t).selections(O.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
    }
}

