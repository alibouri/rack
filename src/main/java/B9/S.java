package b9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import d9.Y4;
import d9.p1;
import d9.r1;
import d9.u1;
import d9.v1;
import d9.w1;
import java.util.List;

public abstract class s {
    public static final List a;

    static {
        List list0 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("HistoryEntry", q.L(new String[]{"AdjustmentEntry", "AgentCommissionPayoutEntry", "AgentCommissionReinvestEntry", "AgentFloatRefundEntry", "AgentParentCommissionPayoutEntry", "AgentRecurringChargeEntry", "AgentTransactionEntry", "AirtimePurchaseEntry", "B2BPaymentEntry", "BillCollectedEntry", "BillPaymentEntry", "CreditEntry", "InterestPaymentEntry", "InteropIncomingTransferEntry", "InteropOutgoingTransferEntry", "MerchantIncentiveEntry", "MerchantRefundEntry", "MerchantRefundUserEntry", "MerchantSaleEntry", "MerchantSubAccountFundingEntry", "MerchantSupervisorSettlementEntry", "MerchantSweepReceivedEntry", "MerchantSweepSentEntry", "MerchantSweepUserEntry", "TransferReceivedEntry", "TransferReceivedReversalEntry", "TransferSentEntry", "TransferSentReversalEntry", "OverdraftFeeEntry", "PaymentCardActivationFeeEntry", "PaymentCardTransferEntry", "PaymentRequestFulfillmentEntry", "PayoutTransferEntry", "PromoEntry", "PurchaseEntry", "ReferralPromoEntry", "RemittanceTransferReceivedEntry", "RemittanceTransferReversalEntry", "ReversalDisputeEntry", "SupportTransferEntry", "TransferFromInteropEntry", "TransferFromPaymentCardWalletEntry", "TransferFromSavingsEntry", "TransferToInteropEntry", "TransferToPaymentCardWalletEntry", "TransferToSavingsEntry", "UserLinkedAccountTransferB2WEntry", "UserLinkedAccountTransferB2WEntryReversal", "UserLinkedAccountTransferEntry", "UserLinkedAccountTransferW2BEntry", "UserLinkedAccountTransferW2BEntryReversal", "UserOverdraftRepaymentEntry", "UserOverdraftUsageEntry"})).selections(b9.q.a).build()});
        List list1 = q.L(new CompiledField[]{new Builder("cursor", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("node", CompiledGraphQL.-notNull(w1.a)).selections(list0).build()});
        List list2 = o.A(new Builder("edges", o.t(v1.a)), list1);
        s.a = q.L(new CompiledField[]{new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("historyConnection", u1.a).alias("customerHistoryConnection").arguments(q.K(new com.apollographql.apollo.api.CompiledArgument.Builder(Y4.a).value(20).build())).selections(list2).build()});
    }
}

