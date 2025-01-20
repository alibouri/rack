package Y8;

import Nb.j;
import Z8.X2;
import c9.f0;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional.Absent;
import com.apollographql.apollo.api.Optional.Present;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.R2;

public final class q5 implements Query {
    public final Optional a;
    public final Optional b;
    public final Optional c;
    public final Optional d;

    public q5(Present optional$Present0, Optional optional0) {
        j.f(Absent.INSTANCE, "last");
        j.f(Absent.INSTANCE, "before");
        j.f(optional0, "after");
        super();
        this.a = Absent.INSTANCE;
        this.b = Absent.INSTANCE;
        this.c = optional$Present0;
        this.d = optional0;
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(X2.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query PaymentCardHistoryConnectionQuery($last: Int, $before: ID, $first: Int, $after: ID) { me { id paymentCardWallet { id balance historyConnection(last: $last, before: $before, first: $first, after: $after) { edges { cursor node { __typename ...CustomerHistoryNodeFragment } } } } } }  fragment CustomerHistoryNodeFragment on HistoryEntry { __typename id whenEntered amount summary isPending isCancelled canBeUsedForAppReview shouldDisplayDate statusDescription userFacingTransactionId walletId baseReceiptFields { label value formatType internalValue templateSlot } ... on AgentTransactionEntry { id } ... on TransferReceivedEntry { senderName senderMobile isRefunded } ... on TransferSentEntry { transferId recipientName recipientMobile isUserReversible isRefunded } ... on TransferReceivedReversalEntry { senderName senderMobile isFreezingFunds } ... on TransferSentReversalEntry { recipientName recipientMobile isFreezingFunds } ... on BillPaymentEntry { billId icon billName billAccount meterNumber receiptTemplateId historyEntryButtonInfo { text color colorPressed } } ... on UserLinkedAccountTransferB2WEntry { partnerName } ... on UserLinkedAccountTransferW2BEntry { partnerName } ... on PurchaseEntry { merchantName qrUrl iconUrl } ... on MerchantSaleEntry { nullableMerchantName: merchantName } ... on ReversalDisputeEntry { isFreezingFunds } ... on TransferToSavingsEntry { id } ... on TransferFromSavingsEntry { id } ... on PaymentCardTransferEntry { id } }";
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof q5)) {
            return false;
        }
        if(!j.a(this.a, ((q5)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((q5)object0).b)) {
            return false;
        }
        return j.a(this.c, ((q5)object0).c) ? j.a(this.d, ((q5)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode() + o.m(this.c, o.m(this.b, this.a.hashCode() * 0x1F, 0x1F), 0x1F);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "75c0e0308410a556921e8e0435ba9bcdcbb3ba74b269fe98acf1919c5d7875a3";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "PaymentCardHistoryConnectionQuery";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", R2.t).selections(f0.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        Optional optional0 = this.a;
        if(optional0 instanceof Present) {
            jsonWriter0.name("last");
            Adapters.-present(Adapters.NullableIntAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional0));
        }
        Optional optional1 = this.b;
        if(optional1 instanceof Present) {
            jsonWriter0.name("before");
            Adapters.-present(Adapters.NullableStringAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional1));
        }
        Optional optional2 = this.c;
        if(optional2 instanceof Present) {
            jsonWriter0.name("first");
            Adapters.-present(Adapters.NullableIntAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional2));
        }
        Optional optional3 = this.d;
        if(optional3 instanceof Present) {
            jsonWriter0.name("after");
            Adapters.-present(Adapters.NullableStringAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional3));
        }
    }

    @Override
    public final String toString() {
        return "PaymentCardHistoryConnectionQuery(last=" + this.a + ", before=" + this.b + ", first=" + this.c + ", after=" + this.d + ")";
    }
}

