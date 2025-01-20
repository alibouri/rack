package Y8;

import M.J;
import Nb.j;
import Z8.w1;
import c9.M;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.R2;
import m5.b;

public final class f3 implements Query {
    public final String a;

    public f3(String s) {
        j.f(s, "entryId");
        super();
        this.a = s;
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(w1.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query HistoryEntryQuery($entryId: String!) { session { id wallet { id historyEntry(entryId: $entryId) { __typename ...CustomerHistoryNodeFragment } } } }  fragment CustomerHistoryNodeFragment on HistoryEntry { __typename id whenEntered amount summary isPending isCancelled canBeUsedForAppReview shouldDisplayDate statusDescription userFacingTransactionId walletId baseReceiptFields { label value formatType internalValue templateSlot } ... on AgentTransactionEntry { id } ... on TransferReceivedEntry { senderName senderMobile isRefunded } ... on TransferSentEntry { transferId recipientName recipientMobile isUserReversible isRefunded } ... on TransferReceivedReversalEntry { senderName senderMobile isFreezingFunds } ... on TransferSentReversalEntry { recipientName recipientMobile isFreezingFunds } ... on BillPaymentEntry { billId icon billName billAccount meterNumber receiptTemplateId historyEntryButtonInfo { text color colorPressed } } ... on UserLinkedAccountTransferB2WEntry { partnerName } ... on UserLinkedAccountTransferW2BEntry { partnerName } ... on PurchaseEntry { merchantName qrUrl iconUrl } ... on MerchantSaleEntry { nullableMerchantName: merchantName } ... on ReversalDisputeEntry { isFreezingFunds } ... on TransferToSavingsEntry { id } ... on TransferFromSavingsEntry { id } ... on PaymentCardTransferEntry { id } }";
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof f3 ? j.a(this.a, ((f3)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "d796ad30decaf58fe2771a8605054a8af9d47322bb3f0b0deb2f4087fa411ee8";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "HistoryEntryQuery";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", R2.t).selections(M.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        J.m(jsonWriter0, "writer", customScalarAdapters0, "customScalarAdapters", "entryId");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, this.a);
    }

    @Override
    public final String toString() {
        return b.y(new StringBuilder("HistoryEntryQuery(entryId="), this.a, ")");
    }
}

