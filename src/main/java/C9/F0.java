package c9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import d9.H2;
import d9.f2;
import d9.p1;
import d9.r1;
import d9.u1;
import d9.v1;
import d9.w1;
import d9.x4;
import java.util.List;

public abstract class f0 {
    public static final List a;

    static {
        List list0 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("HistoryEntry", q.L(new String[]{"AdjustmentEntry", "AgentCommissionPayoutEntry", "AgentCommissionReinvestEntry", "AgentFloatRefundEntry", "AgentParentCommissionPayoutEntry", "AgentRecurringChargeEntry", "AgentTransactionEntry", "AirtimePurchaseEntry", "B2BPaymentEntry", "BillCollectedEntry", "BillPaymentEntry", "CreditEntry", "InterestPaymentEntry", "InteropIncomingTransferEntry", "InteropOutgoingTransferEntry", "MerchantIncentiveEntry", "MerchantRefundEntry", "MerchantRefundUserEntry", "MerchantSaleEntry", "MerchantSubAccountFundingEntry", "MerchantSupervisorSettlementEntry", "MerchantSweepReceivedEntry", "MerchantSweepSentEntry", "MerchantSweepUserEntry", "TransferReceivedEntry", "TransferReceivedReversalEntry", "TransferSentEntry", "TransferSentReversalEntry", "OverdraftFeeEntry", "PaymentCardActivationFeeEntry", "PaymentCardTransferEntry", "PaymentRequestFulfillmentEntry", "PayoutTransferEntry", "PromoEntry", "PurchaseEntry", "ReferralPromoEntry", "RemittanceTransferReceivedEntry", "RemittanceTransferReversalEntry", "ReversalDisputeEntry", "SupportTransferEntry", "TransferFromInteropEntry", "TransferFromPaymentCardWalletEntry", "TransferFromSavingsEntry", "TransferToInteropEntry", "TransferToPaymentCardWalletEntry", "TransferToSavingsEntry", "UserLinkedAccountTransferB2WEntry", "UserLinkedAccountTransferB2WEntryReversal", "UserLinkedAccountTransferEntry", "UserLinkedAccountTransferW2BEntry", "UserLinkedAccountTransferW2BEntryReversal", "UserOverdraftRepaymentEntry", "UserOverdraftUsageEntry"})).selections(b9.q.a).build()});
        List list1 = q.L(new CompiledField[]{new Builder("cursor", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("node", CompiledGraphQL.-notNull(w1.a)).selections(list0).build()});
        List list2 = o.A(new Builder("edges", o.t(v1.a)), list1);
        List list3 = q.L(new CompiledField[]{new Builder("id", p1.a).build(), new Builder("balance", CompiledGraphQL.-notNull(f2.a)).build(), new Builder("historyConnection", u1.a).arguments(q.L(new CompiledArgument[]{o.r("after", new com.apollographql.apollo.api.CompiledArgument.Builder(H2.a)), o.r("before", new com.apollographql.apollo.api.CompiledArgument.Builder(H2.b)), o.r("first", new com.apollographql.apollo.api.CompiledArgument.Builder(H2.c)), o.r("last", new com.apollographql.apollo.api.CompiledArgument.Builder(H2.d))})).selections(list2).build()});
        List list4 = q.L(new CompiledField[]{new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("paymentCardWallet", H2.e).selections(list3).build()});
        f0.a = o.A(new Builder("me", x4.h), list4);
    }
}

