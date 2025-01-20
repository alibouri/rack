package Y8;

import M.J;
import Nb.j;
import Z8.q0;
import c9.v;
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
import d9.i2;
import d9.p2;
import e9.a;
import e9.f;

public final class p1 implements Mutation {
    public final p2 a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final Optional f;

    public p1(p2 p20, Optional optional0, Optional optional1, Optional optional2, Optional optional3) {
        j.f(p20, "transfer");
        j.f(Absent.INSTANCE, "pin");
        j.f(optional0, "acceptedPartnerOrg");
        j.f(optional1, "contactListFingerprint");
        j.f(optional2, "possiblyMistakenTransferConfirmed");
        j.f(optional3, "overdraftUsageInput");
        super();
        this.a = p20;
        this.b = Absent.INSTANCE;
        this.c = optional0;
        this.d = optional1;
        this.e = optional2;
        this.f = optional3;
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(q0.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation CustomerSendMutation($transfer: P2PTransferInput!, $pin: String, $acceptedPartnerOrg: PartnerOrg, $contactListFingerprint: String, $possiblyMistakenTransferConfirmed: Boolean, $overdraftUsageInput: UserOverdraftUsageInput) { send(transfer: $transfer, pin: $pin, acceptedPartnerOrg: $acceptedPartnerOrg, contactListFingerprint: $contactListFingerprint, possiblyMistakenTransferConfirmed: $possiblyMistakenTransferConfirmed, overdraftUsageInput: $overdraftUsageInput) { transfer { id sourceWallet { __typename id balance partnerOrg sendFeeFormula sendFeeFormulaDescription ...LimitFragment ...CustomerMostRecentTxHistoryFragment } user { __typename id customerAnnouncements { __typename ...NonTimelyAnnouncementsFragment } ...OverdraftFragment } } showUserCanReverseTxAnnouncement } }  fragment LimitFragment on Wallet { id balance limitBalMin perTransferLimit dayLimit { total remaining } monthLimit { total remaining } overdraftMaxLimit }  fragment CustomerHistoryNodeFragment on HistoryEntry { __typename id whenEntered amount summary isPending isCancelled canBeUsedForAppReview shouldDisplayDate statusDescription userFacingTransactionId walletId baseReceiptFields { label value formatType internalValue templateSlot } ... on AgentTransactionEntry { id } ... on TransferReceivedEntry { senderName senderMobile isRefunded } ... on TransferSentEntry { transferId recipientName recipientMobile isUserReversible isRefunded } ... on TransferReceivedReversalEntry { senderName senderMobile isFreezingFunds } ... on TransferSentReversalEntry { recipientName recipientMobile isFreezingFunds } ... on BillPaymentEntry { billId icon billName billAccount meterNumber receiptTemplateId historyEntryButtonInfo { text color colorPressed } } ... on UserLinkedAccountTransferB2WEntry { partnerName } ... on UserLinkedAccountTransferW2BEntry { partnerName } ... on PurchaseEntry { merchantName qrUrl iconUrl } ... on MerchantSaleEntry { nullableMerchantName: merchantName } ... on ReversalDisputeEntry { isFreezingFunds } ... on TransferToSavingsEntry { id } ... on TransferFromSavingsEntry { id } ... on PaymentCardTransferEntry { id } }  fragment CustomerMostRecentTxHistoryFragment on Wallet { id historyConnection(last: 20) { edges { cursor node { __typename ...CustomerHistoryNodeFragment } } } }  fragment NonTimelyAnnouncementsFragment on CustomerAnnouncements { nonTimelyAnnouncement { id announcement { __typename ... on BottomSheetAnnouncement { id title message voiceMessageUrl iconUrl animationUrl button { text actionUri } frequencySeconds } ... on HeaderAnnouncement { id title titleColor icon button { text style { color colorPressed textColor } actionUri } background { __typename ... on AnnouncementSolidColorBackground { color } ... on TwoColorGradient { colorStart colorEnd } } balanceTextColor } } expireOnDatetime expireOnTimesSeen } }  fragment OverdraftFragment on User { id overdraftPolicy { termsAndConditions { id acceptedVersion latestVersion url } maxLimit usedLimit maxDurationDays chargesFormula setupFee { type frequency } lateFee { type frequency } interest { type frequency } availableLimitMessage feesMessage interestMessage optInMessage acceptTermsMessage introAudioUrl termsSummary { icon text } } overdraftWallet { id dueDateInfo { icon title text } } unpaidOverdraftUsages { principalTotalAmount principalOwedAmount chargesOwedAmount dueDate } }";
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof p1)) {
            return false;
        }
        if(!j.a(this.a, ((p1)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((p1)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((p1)object0).c)) {
            return false;
        }
        if(!j.a(this.d, ((p1)object0).d)) {
            return false;
        }
        return j.a(this.e, ((p1)object0).e) ? j.a(this.f, ((p1)object0).f) : false;
    }

    @Override
    public final int hashCode() {
        return this.f.hashCode() + o.m(this.e, o.m(this.d, o.m(this.c, o.m(this.b, this.a.hashCode() * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "bb07697fca855e3868e9b57db1586aefe4e856a86e2fa04d47b5fb7133f8df59";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "CustomerSendMutation";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", i2.p2).selections(v.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        J.m(jsonWriter0, "writer", customScalarAdapters0, "customScalarAdapters", "transfer");
        Adapters.-obj$default(f.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, this.a);
        Optional optional0 = this.b;
        if(optional0 instanceof Present) {
            jsonWriter0.name("pin");
            Adapters.-present(Adapters.NullableStringAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional0));
        }
        Optional optional1 = this.c;
        if(optional1 instanceof Present) {
            jsonWriter0.name("acceptedPartnerOrg");
            Adapters.-present(Adapters.-nullable(a.o)).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional1));
        }
        Optional optional2 = this.d;
        if(optional2 instanceof Present) {
            jsonWriter0.name("contactListFingerprint");
            Adapters.-present(Adapters.NullableStringAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional2));
        }
        Optional optional3 = this.e;
        if(optional3 instanceof Present) {
            jsonWriter0.name("possiblyMistakenTransferConfirmed");
            Adapters.-present(Adapters.NullableBooleanAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional3));
        }
        Optional optional4 = this.f;
        if(optional4 instanceof Present) {
            jsonWriter0.name("overdraftUsageInput");
            Adapters.-present(Adapters.-nullable(Adapters.-obj$default(e9.j.a, false, 1, null))).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional4));
        }
    }

    @Override
    public final String toString() {
        return "CustomerSendMutation(transfer=" + this.a + ", pin=" + this.b + ", acceptedPartnerOrg=" + this.c + ", contactListFingerprint=" + this.d + ", possiblyMistakenTransferConfirmed=" + this.e + ", overdraftUsageInput=" + this.f + ")";
    }
}

