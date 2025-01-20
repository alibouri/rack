package Y8;

import Nb.j;
import Nb.x;
import Z8.c1;
import c9.H;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.R2;

public final class u2 implements Query {
    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(c1.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query FrequentlyChangingDataHomeRefreshQuery { me { __typename ...LinkedAccountsFragment ...PendingDeviceApprovalFragment } }  fragment LinkedAccountFieldFragment on LinkedAccountField { __typename name displayName ... on LinkedAccountTextField { minLength maxLength formatter { __typename ... on TextFieldGroupedFormatter { groupSize separator } } inputType } }  fragment LinkedAccountTypeFragment on LinkedAccountType { id name kind icon linkFields { __typename ...LinkedAccountFieldFragment } initialLinkStep transferFields { __typename ...LinkedAccountFieldFragment } fromWalletFee { formula label } fromWalletFeeWithoutPromos { formula label } toWalletFee { formula label } toWalletFeeWithoutPromos { formula label } features terms { id url } minAmount maxAmount overallFeeDescription hasBalanceInfo partnerCollectsB2wFees }  fragment LinkedAccountFragment on LinkedAccount { id label categoryLabel accountType { __typename ...LinkedAccountTypeFragment } state { __typename ... on Linking { __typename } ... on LinkingFailed { ufeCode ufeMessage } ... on Linked { __typename } ... on NeedsValidation { __typename otpMobileSuffix } ... on Validating { __typename } ... on ValidationFailed { ufeCode ufeMessage } } }  fragment LinkedAccountsFragment on User { id linkedAccountTransferCounts { toWallet fromWallet } linkedAccounts { __typename ...LinkedAccountFragment } }  fragment PendingDeviceApprovalFragment on User { pendingDeviceApproval { id deviceModel whenExpires } }";
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 != null && object0.getClass() == u2.class;
    }

    @Override
    public final int hashCode() {
        return x.a(u2.class).hashCode();
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "d26856cd554c6e1e4e5e446a692d9344a812ca2de086c17483e62be8c00e0705";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "FrequentlyChangingDataHomeRefreshQuery";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", R2.t).selections(H.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
    }
}

