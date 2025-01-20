package Y8;

import M.J;
import Nb.j;
import Z8.M4;
import c9.J0;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.Optional.Present;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.i2;

public final class f8 implements Mutation {
    public final String a;
    public final Optional b;

    public f8(String s, Optional optional0) {
        j.f(s, "scratchCardId");
        j.f(optional0, "acceptedScratchCardTermsVersion");
        super();
        this.a = s;
        this.b = optional0;
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(M4.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation ScratchCardClaimMutation($scratchCardId: ID!, $acceptedScratchCardTermsVersion: String) { claimScratchCard(scratchCardId: $scratchCardId, acceptedScratchCardTermsVersion: $acceptedScratchCardTermsVersion) { claimedScratchCard { id award { __typename ... on CashScratchCardAward { awardAmount } } } user { __typename id ...ScratchCardsFragment primaryWallet { __typename id balance ...CustomerMostRecentTxHistoryFragment } } } }  fragment RewardsPathRewardFragment on RewardsPathReward { __typename ... on ScratchCardRewardPathReward { background } }  fragment ScratchCardDetailsFragment on ScratchCardDetails { iconUrl title body }  fragment ClaimedScratchCardsFragment on ClaimedScratchCardConnection { pageInfo { hasNextPage } edges { node { id whenExpires iconUrl awardText awardSubtext details { __typename ...ScratchCardDetailsFragment } } } }  fragment ScratchCardsFragment on User { id scratchCards { totalAwardsClaimed banner { text backgroundColor textColor iconUrl } rewardsPath { currentStep maxVisibleStep pastMilestones { edges { node { step reward { __typename ...RewardsPathRewardFragment } } } } upcomingMilestones { step reward { __typename ...RewardsPathRewardFragment } } instructions { currentStepDescription instructionSteps } } lockedCards { id whenExpires unlockInstructions icon background details { __typename ...ScratchCardDetailsFragment } } unlockedCards { id whenExpires award { __typename ... on CashScratchCardAward { awardAmount } ... on CustomScratchCardAward { headerText imageUrl } } unlockedDescription icon background scratchCardTerms { version termsUrl } } claimedCards(last: 8, includeExpired: true) { __typename ...ClaimedScratchCardsFragment } } }  fragment CustomerHistoryNodeFragment on HistoryEntry { __typename id whenEntered amount summary isPending isCancelled canBeUsedForAppReview shouldDisplayDate statusDescription userFacingTransactionId walletId baseReceiptFields { label value formatType internalValue templateSlot } ... on AgentTransactionEntry { id } ... on TransferReceivedEntry { senderName senderMobile isRefunded } ... on TransferSentEntry { transferId recipientName recipientMobile isUserReversible isRefunded } ... on TransferReceivedReversalEntry { senderName senderMobile isFreezingFunds } ... on TransferSentReversalEntry { recipientName recipientMobile isFreezingFunds } ... on BillPaymentEntry { billId icon billName billAccount meterNumber receiptTemplateId historyEntryButtonInfo { text color colorPressed } } ... on UserLinkedAccountTransferB2WEntry { partnerName } ... on UserLinkedAccountTransferW2BEntry { partnerName } ... on PurchaseEntry { merchantName qrUrl iconUrl } ... on MerchantSaleEntry { nullableMerchantName: merchantName } ... on ReversalDisputeEntry { isFreezingFunds } ... on TransferToSavingsEntry { id } ... on TransferFromSavingsEntry { id } ... on PaymentCardTransferEntry { id } }  fragment CustomerMostRecentTxHistoryFragment on Wallet { id historyConnection(last: 20) { edges { cursor node { __typename ...CustomerHistoryNodeFragment } } } }";
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof f8)) {
            return false;
        }
        return j.a(this.a, ((f8)object0).a) ? j.a(this.b, ((f8)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "8184b9f12e5cd252d2456d6f5252aff14497b86d39b629af266c851a7b36df2b";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "ScratchCardClaimMutation";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", i2.p2).selections(J0.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        J.m(jsonWriter0, "writer", customScalarAdapters0, "customScalarAdapters", "scratchCardId");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, this.a);
        Optional optional0 = this.b;
        if(optional0 instanceof Present) {
            jsonWriter0.name("acceptedScratchCardTermsVersion");
            Adapters.-present(Adapters.NullableStringAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional0));
        }
    }

    @Override
    public final String toString() {
        return "ScratchCardClaimMutation(scratchCardId=" + this.a + ", acceptedScratchCardTermsVersion=" + this.b + ")";
    }
}

