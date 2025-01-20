package Y8;

import A3.e;
import M.J;
import Nb.j;
import Z8.v0;
import c9.w;
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
import e9.a;
import java.util.ArrayList;
import java.util.List;

public final class t1 implements Mutation {
    public final String a;
    public final String b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final Optional f;
    public final Optional g;
    public final Optional h;
    public final ArrayList i;
    public final Object j;

    public t1(String s, String s1, Optional optional0, Optional optional1, Optional optional2, Optional optional3, Optional optional4, Optional optional5, ArrayList arrayList0, List list0) {
        j.f(s, "tokenId");
        j.f(s1, "code");
        j.f(optional0, "name");
        j.f(optional1, "pin");
        j.f(optional2, "qrText");
        j.f(optional3, "partner_org");
        j.f(optional4, "autofilled");
        j.f(optional5, "contactListFingerprint");
        super();
        this.a = s;
        this.b = s1;
        this.c = optional0;
        this.d = optional1;
        this.e = optional2;
        this.f = optional3;
        this.g = optional4;
        this.h = optional5;
        this.i = arrayList0;
        this.j = list0;
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(v0.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation CustomerVerifyAuthCode($tokenId: String!, $code: String!, $name: String, $pin: String, $qrText: String, $partner_org: PartnerOrg, $autofilled: Boolean, $contactListFingerprint: String, $insecureCurrentlyLoggedInUserSessionIds: [ID!]!, $insecureCurrentlyLoggedInUserMobiles: [String!]!) { verifyAuthCode(tokenId: $tokenId, code: $code, name: $name, pin: $pin, qrText: $qrText, partnerOrg: $partner_org, autofilled: $autofilled, contactListFingerprint: $contactListFingerprint, insecureCurrentlyLoggedInUserSessionIds: $insecureCurrentlyLoggedInUserSessionIds, insecureCurrentlyLoggedInUserMobiles: $insecureCurrentlyLoggedInUserMobiles) { session { __typename id opaqueId ...CustomerHomeFragment } } }  fragment ScratchCardBottomSheetAnnouncementFragment on User { id scratchCardBottomSheetAnnouncement { title body lottieAnimationUrl } }  fragment LockScreenPropsFragment on User { id appProps { maxLockscreenUnlockAttempts shouldLogLockscreenEvents shouldLogFingerprintEvents enableBiometricFraudPrevention canResetOwnPinOnLockscreen } }  fragment UserAppPropsFragment on User { __typename id appProps { qrRefreshInterval restrictScreenshots linkedAccountsEnabled qrScanEnabled useQrTimeOffset convertCiNumbersTo10Digits undoSentTransfersTimeWindowSeconds appUpdaterParams { minDaysBetweenUpdateAttempts minDaysBetweenUpdateRequests } promptForAppReview indicateContactsWithWaveAccount paymentCardsEnabled ostrichEasterEggs showScratchCardRewards savingsWalletEnabled showSavingsBottomSheetAnnouncement showTransportPlaceholder deviceApprovalRecentAutofill txHistoryOfflineSyncProps { firstPageSize subsequentPagesSize whenShouldDoFullResync } canScanQrSendScreen countryIso2FromIp enabledTravelerCorridorNotificationList { customerCountryIso2 traveledToCountryIso2 } receiptHistoryEntryIdForCieMigration accountSwitcherEnabled pricePromoBottomSheet { version title body lottieAnimationUrl showScanButton } showBusinessSearch isOverdraftEnabled txHistoryOfflineSyncProps { firstPageSize subsequentPagesSize whenShouldDoFullResync } appUpdaterParams { minDaysBetweenUpdateAttempts minDaysBetweenUpdateRequests } } ...LockScreenPropsFragment }  fragment TooltipFragment on Tooltip { id target text backgroundColor showCount }  fragment TooltipsFragment on User { tooltips { __typename ...TooltipFragment } }  fragment BillFieldsFragment on BillField { __typename name displayName defaultValue isProvidedByConfirmation isSavedInFavorites isAccountIdentifier ... on TextField { minLength maxLength formatter { __typename ... on TextFieldGroupedFormatter { groupSize separator } } inputType } ... on AmountField { feeFormula minimum maximum requiresRounding } ... on MultiChoiceField { choices { value displayName } } ... on AddOnsField { choices { value displayName price } incompatibleChoices { choiceValue1 choiceValue2 } shouldEnableToggle description toggleText descriptionToggleOff } }  fragment BillFavoriteFragment on BillFavorite { id name fields { name value } balance { balanceText } }  fragment DealDetailFragment on DealDetail { id description animationUrl imageUrl terms { iconUrl term } actions { __typename ... on DealUriAction { name uri } } }  fragment PayableWalletFragment on PayableWallet { id name icon hasServerSideConfirmationMessage hasBillInvoiceList fields(capabilities: [\"AIRTIME\",\"AIRTIME_INTERNATIONAL\",\"ADDONS_FIELDS\",\"MULTISELECT_FIELDS\",\"SERVER_CONFIRMATION_MESSAGES\"]) { __typename ...BillFieldsFragment } disableInfo { message } requiredCapabilities favorites { __typename ...BillFavoriteFragment } hasBalanceInfo pollForPayment searchCategory { name displayName } deal { __typename id shortDescription ... on DealWithDetail { detail { __typename ...DealDetailFragment } } } iconUrl allowsAdvancePayments allowsPartialPayments hasPromotionInfo billsFooter }  fragment TransportFragment on User { transportPartners { __typename ...PayableWalletFragment } }  fragment LimitFragment on Wallet { id balance limitBalMin perTransferLimit dayLimit { total remaining } monthLimit { total remaining } overdraftMaxLimit }  fragment TransferAmountFieldFragment on Wallet { __typename id balance transferDescription { sendMoneyScreen { feeNotice } } sendFeeFormula receiveFeeFormula internationalFeeFormulas { transferDescription { sendMoneyScreen { feeNotice } } destCountry sendFeeFormula receiveFeeFormula partnerOrgs } multicurrencyFeeFormulas { transferDescription { sendMoneyScreen { feeNotice } confirmationDialog { fxRateLabel fxRateDescription feeLabel } } destCountry sendFeeFormula receiveFeeFormula exchangeToForeignFormula exchangeFromForeignFormula partnerOrgs destCurrency fxRate } aimedPartnerOrg ...LimitFragment }  fragment SendMoneyDialogFragment on Wallet { __typename id country partnerOrg shouldBlockUntilPartnerOrgMigrated shouldResendOnPreviouslyFailedTx ...TransferAmountFieldFragment }  fragment FavoriteRecipientsFragment on Wallet { id favoriteRecipients { name mobile } }  fragment SendMoneySelectFragment on Wallet { __typename id country ...SendMoneyDialogFragment ...FavoriteRecipientsFragment user { __typename id ...UserAppPropsFragment ...TooltipsFragment } }  fragment PayMerchantFragment on Wallet { id balance currency }  fragment FavoriteBuyAirtimeRecipientsFragment on Wallet { id favoriteBuyAirtimeRecipients { name mobile isSelf } }  fragment CustomerHistoryNodeFragment on HistoryEntry { __typename id whenEntered amount summary isPending isCancelled canBeUsedForAppReview shouldDisplayDate statusDescription userFacingTransactionId walletId baseReceiptFields { label value formatType internalValue templateSlot } ... on AgentTransactionEntry { id } ... on TransferReceivedEntry { senderName senderMobile isRefunded } ... on TransferSentEntry { transferId recipientName recipientMobile isUserReversible isRefunded } ... on TransferReceivedReversalEntry { senderName senderMobile isFreezingFunds } ... on TransferSentReversalEntry { recipientName recipientMobile isFreezingFunds } ... on BillPaymentEntry { billId icon billName billAccount meterNumber receiptTemplateId historyEntryButtonInfo { text color colorPressed } } ... on UserLinkedAccountTransferB2WEntry { partnerName } ... on UserLinkedAccountTransferW2BEntry { partnerName } ... on PurchaseEntry { merchantName qrUrl iconUrl } ... on MerchantSaleEntry { nullableMerchantName: merchantName } ... on ReversalDisputeEntry { isFreezingFunds } ... on TransferToSavingsEntry { id } ... on TransferFromSavingsEntry { id } ... on PaymentCardTransferEntry { id } }  fragment CustomerMostRecentTxHistoryFragment on Wallet { id historyConnection(last: 20) { edges { cursor node { __typename ...CustomerHistoryNodeFragment } } } }  fragment BillPayAmountFieldFragment on Wallet { __typename id currency country ...LimitFragment }  fragment PayBillDialogFragment on Wallet { __typename id currency ...BillPayAmountFieldFragment }  fragment BillTypeFragment on BillType { __typename ...PayableWalletFragment disableDetails { __typename ... on AirtimeDisableDetails { disabledTelcos { name numberFormatRe } } } }  fragment BuyAirtimeSelectFragment on Session { id user { airtimeBillType(capabilities: [\"AIRTIME\",\"AIRTIME_INTERNATIONAL\",\"MULTISELECT_FIELDS\",\"SERVER_CONFIRMATION_MESSAGES\"]) { __typename ...BillTypeFragment } } wallet { __typename id ...FavoriteBuyAirtimeRecipientsFragment ...PayBillDialogFragment } }  fragment KycLimitFragment on UserKycLimit { description value }  fragment IdPhotoStatusFragment on UserKycIdPhotoStatus { __typename button ... on UserKycIdPhotoStatusWithSimpleText { text } ... on UserKycIdPhotoStatusWithTextWithIcon { text icon } ... on UserKycIdPhotoStatusWithTextInRectangle { title text icon rectangle } }  fragment KycInfoFragment on User { id kycInfo { kycTier limits { __typename ...KycLimitFragment } idStatus { __typename ...IdPhotoStatusFragment } } }  fragment ReferralFragment on Referral { channel url inviteCopy }  fragment SupportCallingFragment on User { appProps { askBackendHowToCallSupport reportVoipCallAppMetrics voipCallsFromLockscreen } contactMobile }  fragment SupportChannelsFragment on Support { supportChannels { id description subText iconUrl deepLink message { forgotPin accountAccess accountClosure settings smsCodeHelp reverseTx unlockVault } } }  fragment SupportHoursFragment on Support { supportHours { monday { openingTime closingTime } tuesday { openingTime closingTime } wednesday { openingTime closingTime } thursday { openingTime closingTime } friday { openingTime closingTime } saturday { openingTime closingTime } sunday { openingTime closingTime } } }  fragment SettingsFragment on Session { id user { __typename id ...KycInfoFragment contactMobile inviteInfo { __typename ...ReferralFragment } referralInfo { __typename ...ReferralFragment } promoCode nearbyAgentsMapUrl appProps { nearbyAgentsInAppEnabled showDeviceManagementSection accountSwitcherEnabled } ...SupportCallingFragment } wallet { id partnerOrg } support { __typename supportNumber supportNumberIsFree ...SupportChannelsFragment ...SupportHoursFragment } }  fragment QrScanOrCardFragment on Session { id opaqueId wallet { __typename country ...SendMoneySelectFragment ...PayMerchantFragment ...PayBillDialogFragment } }  fragment SavingsWalletFragment on SavingsWallet { id balance state whenUnlocks shouldRestrictFromLocking restrictFromLockingBottomSheetMessage numRemainingLocksAllowedInMonth introScreen { icon text } historyConnection(last: 25) { edges { node { __typename ...CustomerHistoryNodeFragment } } } }  fragment WalletFragment on Wallet { id balance currency }  fragment SavingsFragment on Session { id user { __typename id savingsWallet { __typename ...SavingsWalletFragment } appProps { lockedVaultFeatureEnabled } ...TooltipsFragment } wallet { __typename ...WalletFragment } support { supportNumber } }  fragment SupportFragment on Session { id support { __typename supportNumber supportNumberIsFree ...SupportChannelsFragment ...SupportHoursFragment } user { __typename ...SupportCallingFragment } }  fragment CustomerHomeFragment on Session { __typename id opaqueId user { __typename id verifiedMobile mobile needsNewPin hasUnseenScratchCards ...ScratchCardBottomSheetAnnouncementFragment ...UserAppPropsFragment ...TooltipsFragment ...TransportFragment } wallet { __typename id balance country partnerOrg aimedPartnerOrg shouldBlockUntilPartnerOrgMigrated ...SendMoneySelectFragment ...PayMerchantFragment ...FavoriteRecipientsFragment ...FavoriteBuyAirtimeRecipientsFragment ...CustomerMostRecentTxHistoryFragment ...PayBillDialogFragment } ...BuyAirtimeSelectFragment ...SettingsFragment ...QrScanOrCardFragment support { __typename supportNumber supportNumberIsFree ...SupportChannelsFragment ...SupportHoursFragment } ...SavingsFragment ...SupportFragment }";
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof t1)) {
            return false;
        }
        if(!j.a(this.a, ((t1)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((t1)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((t1)object0).c)) {
            return false;
        }
        if(!j.a(this.d, ((t1)object0).d)) {
            return false;
        }
        if(!j.a(this.e, ((t1)object0).e)) {
            return false;
        }
        if(!j.a(this.f, ((t1)object0).f)) {
            return false;
        }
        if(!j.a(this.g, ((t1)object0).g)) {
            return false;
        }
        if(!j.a(this.h, ((t1)object0).h)) {
            return false;
        }
        return this.i.equals(((t1)object0).i) ? this.j.equals(((t1)object0).j) : false;
    }

    @Override
    public final int hashCode() {
        return this.j.hashCode() + (this.i.hashCode() + o.m(this.h, o.m(this.g, o.m(this.f, o.m(this.e, o.m(this.d, o.m(this.c, e.s(this.a.hashCode() * 0x1F, 0x1F, this.b), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F)) * 0x1F;
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "392a0869369956588e25cf71393c7279167ca2a910b0c4a26fcc3f05a9ef7e22";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "CustomerVerifyAuthCode";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", i2.p2).selections(w.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        J.m(jsonWriter0, "writer", customScalarAdapters0, "customScalarAdapters", "tokenId");
        Adapter adapter0 = Adapters.StringAdapter;
        adapter0.toJson(jsonWriter0, customScalarAdapters0, this.a);
        jsonWriter0.name("code");
        adapter0.toJson(jsonWriter0, customScalarAdapters0, this.b);
        Optional optional0 = this.c;
        if(optional0 instanceof Present) {
            jsonWriter0.name("name");
            Adapters.-present(Adapters.NullableStringAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional0));
        }
        Optional optional1 = this.d;
        if(optional1 instanceof Present) {
            jsonWriter0.name("pin");
            Adapters.-present(Adapters.NullableStringAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional1));
        }
        Optional optional2 = this.e;
        if(optional2 instanceof Present) {
            jsonWriter0.name("qrText");
            Adapters.-present(Adapters.NullableStringAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional2));
        }
        Optional optional3 = this.f;
        if(optional3 instanceof Present) {
            jsonWriter0.name("partner_org");
            Adapters.-present(Adapters.-nullable(a.o)).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional3));
        }
        Optional optional4 = this.g;
        if(optional4 instanceof Present) {
            jsonWriter0.name("autofilled");
            Adapters.-present(Adapters.NullableBooleanAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional4));
        }
        Optional optional5 = this.h;
        if(optional5 instanceof Present) {
            jsonWriter0.name("contactListFingerprint");
            Adapters.-present(Adapters.NullableStringAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional5));
        }
        jsonWriter0.name("insecureCurrentlyLoggedInUserSessionIds");
        Adapters.-list(adapter0).toJson(jsonWriter0, customScalarAdapters0, this.i);
        jsonWriter0.name("insecureCurrentlyLoggedInUserMobiles");
        Adapters.-list(adapter0).toJson(jsonWriter0, customScalarAdapters0, ((List)this.j));
    }

    @Override
    public final String toString() {
        return "CustomerVerifyAuthCodeMutation(tokenId=" + this.a + ", code=" + this.b + ", name=" + this.c + ", pin=" + this.d + ", qrText=" + this.e + ", partner_org=" + this.f + ", autofilled=" + this.g + ", contactListFingerprint=" + this.h + ", insecureCurrentlyLoggedInUserSessionIds=" + this.i + ", insecureCurrentlyLoggedInUserMobiles=" + this.j + ")";
    }
}

