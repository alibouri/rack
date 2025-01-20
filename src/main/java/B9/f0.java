package b9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import com.sendwave.backend.type.LockUnlockState;
import com.sendwave.backend.type.b2;
import d9.A1;
import d9.E0;
import d9.f2;
import d9.n1;
import d9.p1;
import d9.q1;
import d9.r1;
import d9.t3;
import d9.u1;
import d9.v1;
import d9.w1;
import java.util.List;

public abstract class f0 {
    public static final List a;

    static {
        List list0 = q.L(new CompiledField[]{new Builder("icon", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("text", CompiledGraphQL.-notNull(r1.a)).build()});
        List list1 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("HistoryEntry", q.L(new String[]{"AdjustmentEntry", "AgentCommissionPayoutEntry", "AgentCommissionReinvestEntry", "AgentFloatRefundEntry", "AgentParentCommissionPayoutEntry", "AgentRecurringChargeEntry", "AgentTransactionEntry", "AirtimePurchaseEntry", "B2BPaymentEntry", "BillCollectedEntry", "BillPaymentEntry", "CreditEntry", "InterestPaymentEntry", "InteropIncomingTransferEntry", "InteropOutgoingTransferEntry", "MerchantIncentiveEntry", "MerchantRefundEntry", "MerchantRefundUserEntry", "MerchantSaleEntry", "MerchantSubAccountFundingEntry", "MerchantSupervisorSettlementEntry", "MerchantSweepReceivedEntry", "MerchantSweepSentEntry", "MerchantSweepUserEntry", "TransferReceivedEntry", "TransferReceivedReversalEntry", "TransferSentEntry", "TransferSentReversalEntry", "OverdraftFeeEntry", "PaymentCardActivationFeeEntry", "PaymentCardTransferEntry", "PaymentRequestFulfillmentEntry", "PayoutTransferEntry", "PromoEntry", "PurchaseEntry", "ReferralPromoEntry", "RemittanceTransferReceivedEntry", "RemittanceTransferReversalEntry", "ReversalDisputeEntry", "SupportTransferEntry", "TransferFromInteropEntry", "TransferFromPaymentCardWalletEntry", "TransferFromSavingsEntry", "TransferToInteropEntry", "TransferToPaymentCardWalletEntry", "TransferToSavingsEntry", "UserLinkedAccountTransferB2WEntry", "UserLinkedAccountTransferB2WEntryReversal", "UserLinkedAccountTransferEntry", "UserLinkedAccountTransferW2BEntry", "UserLinkedAccountTransferW2BEntryReversal", "UserOverdraftRepaymentEntry", "UserOverdraftUsageEntry"})).selections(b9.q.a).build()});
        List list2 = o.A(new Builder("node", CompiledGraphQL.-notNull(w1.a)), list1);
        List list3 = o.A(new Builder("edges", o.t(v1.a)), list2);
        CompiledField compiledField0 = new Builder("id", p1.a).build();
        CompiledField compiledField1 = new Builder("balance", CompiledGraphQL.-notNull(f2.a)).build();
        LockUnlockState.A.getClass();
        f0.a = q.L(new CompiledField[]{compiledField0, compiledField1, new Builder("state", b2.b).build(), new Builder("whenUnlocks", E0.a).build(), new Builder("shouldRestrictFromLocking", n1.a).build(), o.s("restrictFromLockingBottomSheetMessage", r1.a), new Builder("numRemainingLocksAllowedInMonth", q1.a).build(), new Builder("introScreen", CompiledGraphQL.-list(CompiledGraphQL.-notNull(A1.a))).selections(list0).build(), new Builder("historyConnection", u1.a).arguments(q.K(new com.apollographql.apollo.api.CompiledArgument.Builder(t3.a).value(25).build())).selections(list3).build()});
    }
}

