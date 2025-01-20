package Y8;

import M.J;
import Nb.j;
import Z8.z0;
import c9.x;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.i2;
import m5.b;

public final class z1 implements Mutation {
    public final String a;

    public z1(String s) {
        j.f(s, "qrValue");
        super();
        this.a = s;
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(z0.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation DecodeWaveQrMutation($qrValue: String!) { decodeWaveQr(qrValue: $qrValue) { action { __typename ...AppActionFragment } } }  fragment DealDetailFragment on DealDetail { id description animationUrl imageUrl terms { iconUrl term } actions { __typename ... on DealUriAction { name uri } } }  fragment BillFieldsFragment on BillField { __typename name displayName defaultValue isProvidedByConfirmation isSavedInFavorites isAccountIdentifier ... on TextField { minLength maxLength formatter { __typename ... on TextFieldGroupedFormatter { groupSize separator } } inputType } ... on AmountField { feeFormula minimum maximum requiresRounding } ... on MultiChoiceField { choices { value displayName } } ... on AddOnsField { choices { value displayName price } incompatibleChoices { choiceValue1 choiceValue2 } shouldEnableToggle description toggleText descriptionToggleOff } }  fragment BillFavoriteFragment on BillFavorite { id name fields { name value } balance { balanceText } }  fragment PayableWalletFragment on PayableWallet { id name icon hasServerSideConfirmationMessage hasBillInvoiceList fields(capabilities: [\"AIRTIME\",\"AIRTIME_INTERNATIONAL\",\"ADDONS_FIELDS\",\"MULTISELECT_FIELDS\",\"SERVER_CONFIRMATION_MESSAGES\"]) { __typename ...BillFieldsFragment } disableInfo { message } requiredCapabilities favorites { __typename ...BillFavoriteFragment } hasBalanceInfo pollForPayment searchCategory { name displayName } deal { __typename id shortDescription ... on DealWithDetail { detail { __typename ...DealDetailFragment } } } iconUrl allowsAdvancePayments allowsPartialPayments hasPromotionInfo billsFooter }  fragment AppActionFragment on AppAction { __typename ... on ShowDealAction { detail { __typename ...DealDetailFragment } } ... on MerchantPaymentAction { merchant { id } payableBusiness { __typename ...PayableWalletFragment } prefilledFields { fieldName fieldValue } } ... on P2PTransferAction { mobile name } ... on LaunchUriAction { uri } }";
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof z1 ? j.a(this.a, ((z1)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "ddd1ed77446f66d9de903fcea406a7ed6b61ce311fe7bcf6d4e48c07ace77f7a";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "DecodeWaveQrMutation";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", i2.p2).selections(x.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        J.m(jsonWriter0, "writer", customScalarAdapters0, "customScalarAdapters", "qrValue");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, this.a);
    }

    @Override
    public final String toString() {
        return b.y(new StringBuilder("DecodeWaveQrMutation(qrValue="), this.a, ")");
    }
}

