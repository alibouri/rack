package Y8;

import Nb.j;
import Nb.x;
import Z8.K5;
import c9.Z0;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.R2;

public final class t9 implements Query {
    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(K5.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query UserHistoryMostRecentPageQuery { session { id wallet { __typename id balance ...CustomerMostRecentTxHistoryFragment } } }  fragment CustomerHistoryNodeFragment on HistoryEntry { __typename id whenEntered amount summary isPending isCancelled canBeUsedForAppReview shouldDisplayDate statusDescription userFacingTransactionId walletId baseReceiptFields { label value formatType internalValue templateSlot } ... on AgentTransactionEntry { id } ... on TransferReceivedEntry { senderName senderMobile isRefunded } ... on TransferSentEntry { transferId recipientName recipientMobile isUserReversible isRefunded } ... on TransferReceivedReversalEntry { senderName senderMobile isFreezingFunds } ... on TransferSentReversalEntry { recipientName recipientMobile isFreezingFunds } ... on BillPaymentEntry { billId icon billName billAccount meterNumber receiptTemplateId historyEntryButtonInfo { text color colorPressed } } ... on UserLinkedAccountTransferB2WEntry { partnerName } ... on UserLinkedAccountTransferW2BEntry { partnerName } ... on PurchaseEntry { merchantName qrUrl iconUrl } ... on MerchantSaleEntry { nullableMerchantName: merchantName } ... on ReversalDisputeEntry { isFreezingFunds } ... on TransferToSavingsEntry { id } ... on TransferFromSavingsEntry { id } ... on PaymentCardTransferEntry { id } }  fragment CustomerMostRecentTxHistoryFragment on Wallet { id historyConnection(last: 20) { edges { cursor node { __typename ...CustomerHistoryNodeFragment } } } }";
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 != null && object0.getClass() == t9.class;
    }

    @Override
    public final int hashCode() {
        return x.a(t9.class).hashCode();
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "d7ec85c1e6fad8720c39d1d6bf0bdf8009dae526f371c5a5ccd39e30b947ad5f";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "UserHistoryMostRecentPageQuery";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", R2.t).selections(Z0.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
    }
}

