package Y8;

import Nb.j;
import Nb.x;
import Z8.I1;
import c9.P;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.R2;

public final class s3 implements Query {
    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(I1.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query LinkedAccountTypesQuery { me { __typename ...LinkedAccountTypesFragment } }  fragment LinkedAccountFieldFragment on LinkedAccountField { __typename name displayName ... on LinkedAccountTextField { minLength maxLength formatter { __typename ... on TextFieldGroupedFormatter { groupSize separator } } inputType } }  fragment LinkedAccountTypeFragment on LinkedAccountType { id name kind icon linkFields { __typename ...LinkedAccountFieldFragment } initialLinkStep transferFields { __typename ...LinkedAccountFieldFragment } fromWalletFee { formula label } fromWalletFeeWithoutPromos { formula label } toWalletFee { formula label } toWalletFeeWithoutPromos { formula label } features terms { id url } minAmount maxAmount overallFeeDescription hasBalanceInfo partnerCollectsB2wFees }  fragment LinkedAccountTypesFragment on User { id linkedAccountTypes { __typename ...LinkedAccountTypeFragment } }";
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 != null && object0.getClass() == s3.class;
    }

    @Override
    public final int hashCode() {
        return x.a(s3.class).hashCode();
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "2529717f7a7e7d4aafc4add9b4a375841dfa6f1adc28b08ba3a076ad2f075faf";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "LinkedAccountTypesQuery";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", R2.t).selections(P.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
    }
}

