package Y8;

import Nb.j;
import Nb.x;
import Z8.d;
import c9.b;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.i2;

public final class h implements Mutation {
    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(d.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation AcknowledgePricePromoBottomSheet { acknowledgePricePromoBottomSheet { user { __typename id ...UserAppPropsFragment } } }  fragment LockScreenPropsFragment on User { id appProps { maxLockscreenUnlockAttempts shouldLogLockscreenEvents shouldLogFingerprintEvents enableBiometricFraudPrevention canResetOwnPinOnLockscreen } }  fragment UserAppPropsFragment on User { __typename id appProps { qrRefreshInterval restrictScreenshots linkedAccountsEnabled qrScanEnabled useQrTimeOffset convertCiNumbersTo10Digits undoSentTransfersTimeWindowSeconds appUpdaterParams { minDaysBetweenUpdateAttempts minDaysBetweenUpdateRequests } promptForAppReview indicateContactsWithWaveAccount paymentCardsEnabled ostrichEasterEggs showScratchCardRewards savingsWalletEnabled showSavingsBottomSheetAnnouncement showTransportPlaceholder deviceApprovalRecentAutofill txHistoryOfflineSyncProps { firstPageSize subsequentPagesSize whenShouldDoFullResync } canScanQrSendScreen countryIso2FromIp enabledTravelerCorridorNotificationList { customerCountryIso2 traveledToCountryIso2 } receiptHistoryEntryIdForCieMigration accountSwitcherEnabled pricePromoBottomSheet { version title body lottieAnimationUrl showScanButton } showBusinessSearch isOverdraftEnabled txHistoryOfflineSyncProps { firstPageSize subsequentPagesSize whenShouldDoFullResync } appUpdaterParams { minDaysBetweenUpdateAttempts minDaysBetweenUpdateRequests } } ...LockScreenPropsFragment }";
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 != null && object0.getClass() == h.class;
    }

    @Override
    public final int hashCode() {
        return x.a(h.class).hashCode();
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "af3b204620bcd5dcf3a1bc568dcb065735804c5619ccf3c47749f5453a0e582a";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "AcknowledgePricePromoBottomSheet";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", i2.p2).selections(b.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
    }
}

