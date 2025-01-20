package Y8;

import M.J;
import Nb.j;
import Z8.B5;
import c9.W0;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.i2;
import m5.b;

public final class i9 implements Mutation {
    public final String a;

    public i9(String s) {
        j.f(s, "transferId");
        super();
        this.a = s;
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(B5.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation UndoSentTransferMutation($transferId: ID!) { undoSentTransfer(transferId: $transferId) { transfer { id sourceWallet { __typename id balance ...CustomerMostRecentTxHistoryFragment } } } }  fragment CustomerHistoryNodeFragment on HistoryEntry { __typename id whenEntered amount summary isPending isCancelled canBeUsedForAppReview shouldDisplayDate statusDescription userFacingTransactionId walletId baseReceiptFields { label value formatType internalValue templateSlot } ... on AgentTransactionEntry { id } ... on TransferReceivedEntry { senderName senderMobile isRefunded } ... on TransferSentEntry { transferId recipientName recipientMobile isUserReversible isRefunded } ... on TransferReceivedReversalEntry { senderName senderMobile isFreezingFunds } ... on TransferSentReversalEntry { recipientName recipientMobile isFreezingFunds } ... on BillPaymentEntry { billId icon billName billAccount meterNumber receiptTemplateId historyEntryButtonInfo { text color colorPressed } } ... on UserLinkedAccountTransferB2WEntry { partnerName } ... on UserLinkedAccountTransferW2BEntry { partnerName } ... on PurchaseEntry { merchantName qrUrl iconUrl } ... on MerchantSaleEntry { nullableMerchantName: merchantName } ... on ReversalDisputeEntry { isFreezingFunds } ... on TransferToSavingsEntry { id } ... on TransferFromSavingsEntry { id } ... on PaymentCardTransferEntry { id } }  fragment CustomerMostRecentTxHistoryFragment on Wallet { id historyConnection(last: 20) { edges { cursor node { __typename ...CustomerHistoryNodeFragment } } } }";
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof i9 ? j.a(this.a, ((i9)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "96c8abab4dc65bdaae6ae00ac2d20e8cab55cd4ab616f826158c2d78b7bc6c4c";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "UndoSentTransferMutation";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", i2.p2).selections(W0.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        J.m(jsonWriter0, "writer", customScalarAdapters0, "customScalarAdapters", "transferId");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, this.a);
    }

    @Override
    public final String toString() {
        return b.y(new StringBuilder("UndoSentTransferMutation(transferId="), this.a, ")");
    }
}

