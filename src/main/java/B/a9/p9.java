package a9;

import Bb.q;
import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class p9 implements Adapter {
    public static final p9 a;
    public static final List b;

    static {
        p9.a = new p9();  // initializer: Ljava/lang/Object;-><init>()V
        p9.b = q.L(new String[]{"qrRefreshInterval", "restrictScreenshots", "linkedAccountsEnabled", "qrScanEnabled", "useQrTimeOffset", "convertCiNumbersTo10Digits", "undoSentTransfersTimeWindowSeconds", "appUpdaterParams", "promptForAppReview", "indicateContactsWithWaveAccount", "paymentCardsEnabled", "ostrichEasterEggs", "showScratchCardRewards", "savingsWalletEnabled", "showSavingsBottomSheetAnnouncement", "showTransportPlaceholder", "deviceApprovalRecentAutofill", "txHistoryOfflineSyncProps", "canScanQrSendScreen", "countryIso2FromIp", "enabledTravelerCorridorNotificationList", "receiptHistoryEntryIdForCieMigration", "accountSwitcherEnabled", "pricePromoBottomSheet", "showBusinessSearch", "isOverdraftEnabled"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        Integer integer0 = null;
        Boolean boolean0 = null;
        Boolean boolean1 = null;
        Boolean boolean2 = null;
        Boolean boolean3 = null;
        Boolean boolean4 = null;
        Integer integer1 = null;
        Boolean boolean5 = null;
        Boolean boolean6 = null;
        Boolean boolean7 = null;
        Boolean boolean8 = null;
        Boolean boolean9 = null;
        Boolean boolean10 = null;
        Boolean boolean11 = null;
        Boolean boolean12 = null;
        l9 l90 = null;
        Boolean boolean13 = null;
        List list0 = null;
        Boolean boolean14 = null;
        Boolean boolean15 = null;
        o9 o90 = null;
        String s = null;
        List list1 = null;
        String s1 = null;
        n9 n90 = null;
        Boolean boolean16 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(p9.b)) {
                case 0: {
                    integer0 = (Integer)Adapters.IntAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    boolean1 = boolean1;
                    break;
                }
                case 1: {
                    boolean0 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    boolean1 = boolean1;
                    break;
                }
                case 2: {
                    boolean1 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 3: {
                    boolean2 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    boolean1 = boolean1;
                    break;
                }
                case 4: {
                    boolean3 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    boolean1 = boolean1;
                    break;
                }
                case 5: {
                    boolean4 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    boolean1 = boolean1;
                    break;
                }
                case 6: {
                    integer1 = (Integer)Adapters.IntAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    boolean1 = boolean1;
                    break;
                }
                case 7: {
                    l90 = (l9)Adapters.-obj$default(q9.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
                    integer0 = integer0;
                    boolean0 = boolean0;
                    boolean1 = boolean1;
                    break;
                }
                case 8: {
                    boolean5 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 9: {
                    boolean6 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 10: {
                    boolean7 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 11: {
                    list0 = Adapters.-list(Adapters.StringAdapter).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 12: {
                    boolean14 = (Boolean)Adapters.NullableBooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 13: {
                    boolean8 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 14: {
                    boolean9 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 15: {
                    boolean15 = (Boolean)Adapters.NullableBooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 16: {
                    boolean10 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 17: {
                    o90 = (o9)Adapters.-obj$default(t9.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
                    integer0 = integer0;
                    boolean0 = boolean0;
                    boolean1 = boolean1;
                    break;
                }
                case 18: {
                    boolean11 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 19: {
                    s = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 20: {
                    list1 = Adapters.-list(Adapters.-obj$default(r9.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
                    integer0 = integer0;
                    boolean0 = boolean0;
                    boolean1 = boolean1;
                    break;
                }
                case 21: {
                    s1 = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 22: {
                    boolean12 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 23: {
                    n90 = (n9)Adapters.-nullable(Adapters.-obj$default(s9.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
                    integer0 = integer0;
                    boolean0 = boolean0;
                    boolean1 = boolean1;
                    break;
                }
                case 24: {
                    boolean13 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 25: {
                    boolean16 = (Boolean)Adapters.NullableBooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(integer0 == null) {
            throw o.q(jsonReader0, "qrRefreshInterval");
        }
        int v = (int)integer0;
        if(boolean0 == null) {
            throw o.q(jsonReader0, "restrictScreenshots");
        }
        boolean z = boolean0.booleanValue();
        if(boolean1 == null) {
            throw o.q(jsonReader0, "linkedAccountsEnabled");
        }
        boolean z1 = boolean1.booleanValue();
        if(boolean2 == null) {
            throw o.q(jsonReader0, "qrScanEnabled");
        }
        boolean z2 = boolean2.booleanValue();
        if(boolean3 == null) {
            throw o.q(jsonReader0, "useQrTimeOffset");
        }
        boolean z3 = boolean3.booleanValue();
        if(boolean4 == null) {
            throw o.q(jsonReader0, "convertCiNumbersTo10Digits");
        }
        boolean z4 = boolean4.booleanValue();
        if(integer1 == null) {
            throw o.q(jsonReader0, "undoSentTransfersTimeWindowSeconds");
        }
        int v1 = (int)integer1;
        if(l90 == null) {
            throw o.q(jsonReader0, "appUpdaterParams");
        }
        if(boolean5 == null) {
            throw o.q(jsonReader0, "promptForAppReview");
        }
        boolean z5 = boolean5.booleanValue();
        if(boolean6 == null) {
            throw o.q(jsonReader0, "indicateContactsWithWaveAccount");
        }
        boolean z6 = boolean6.booleanValue();
        if(boolean7 == null) {
            throw o.q(jsonReader0, "paymentCardsEnabled");
        }
        boolean z7 = boolean7.booleanValue();
        if(list0 == null) {
            throw o.q(jsonReader0, "ostrichEasterEggs");
        }
        if(boolean8 == null) {
            throw o.q(jsonReader0, "savingsWalletEnabled");
        }
        boolean z8 = boolean8.booleanValue();
        if(boolean9 == null) {
            throw o.q(jsonReader0, "showSavingsBottomSheetAnnouncement");
        }
        boolean z9 = boolean9.booleanValue();
        if(boolean10 == null) {
            throw o.q(jsonReader0, "deviceApprovalRecentAutofill");
        }
        boolean z10 = boolean10.booleanValue();
        if(o90 == null) {
            throw o.q(jsonReader0, "txHistoryOfflineSyncProps");
        }
        if(boolean11 == null) {
            throw o.q(jsonReader0, "canScanQrSendScreen");
        }
        boolean z11 = boolean11.booleanValue();
        if(list1 == null) {
            throw o.q(jsonReader0, "enabledTravelerCorridorNotificationList");
        }
        if(boolean12 == null) {
            throw o.q(jsonReader0, "accountSwitcherEnabled");
        }
        boolean z12 = boolean12.booleanValue();
        if(boolean13 == null) {
            throw o.q(jsonReader0, "showBusinessSearch");
        }
        return new k9(v, z, z1, z2, z3, z4, v1, l90, z5, z6, z7, list0, boolean14, z8, z9, boolean15, z10, o90, z11, s, list1, s1, z12, n90, boolean13.booleanValue(), boolean16);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((k9)object0), "value");
        jsonWriter0.name("qrRefreshInterval");
        o.D(((k9)object0).a, Adapters.IntAdapter, jsonWriter0, customScalarAdapters0, "restrictScreenshots");
        o.E(((k9)object0).b, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "linkedAccountsEnabled");
        o.E(((k9)object0).c, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "qrScanEnabled");
        o.E(((k9)object0).d, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "useQrTimeOffset");
        o.E(((k9)object0).e, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "convertCiNumbersTo10Digits");
        o.E(((k9)object0).f, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "undoSentTransfersTimeWindowSeconds");
        o.D(((k9)object0).g, Adapters.IntAdapter, jsonWriter0, customScalarAdapters0, "appUpdaterParams");
        Adapters.-obj$default(q9.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((k9)object0).h);
        jsonWriter0.name("promptForAppReview");
        o.E(((k9)object0).i, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "indicateContactsWithWaveAccount");
        o.E(((k9)object0).j, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "paymentCardsEnabled");
        o.E(((k9)object0).k, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "ostrichEasterEggs");
        Adapters.-list(Adapters.StringAdapter).toJson(jsonWriter0, customScalarAdapters0, ((k9)object0).l);
        jsonWriter0.name("showScratchCardRewards");
        Adapters.NullableBooleanAdapter.toJson(jsonWriter0, customScalarAdapters0, ((k9)object0).m);
        jsonWriter0.name("savingsWalletEnabled");
        o.E(((k9)object0).n, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "showSavingsBottomSheetAnnouncement");
        o.E(((k9)object0).o, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "showTransportPlaceholder");
        Adapters.NullableBooleanAdapter.toJson(jsonWriter0, customScalarAdapters0, ((k9)object0).p);
        jsonWriter0.name("deviceApprovalRecentAutofill");
        o.E(((k9)object0).q, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "txHistoryOfflineSyncProps");
        Adapters.-obj$default(t9.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((k9)object0).r);
        jsonWriter0.name("canScanQrSendScreen");
        o.E(((k9)object0).s, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "countryIso2FromIp");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((k9)object0).t);
        jsonWriter0.name("enabledTravelerCorridorNotificationList");
        Adapters.-list(Adapters.-obj$default(r9.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((k9)object0).u);
        jsonWriter0.name("receiptHistoryEntryIdForCieMigration");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((k9)object0).v);
        jsonWriter0.name("accountSwitcherEnabled");
        o.E(((k9)object0).w, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "pricePromoBottomSheet");
        Adapters.-nullable(Adapters.-obj$default(s9.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((k9)object0).x);
        jsonWriter0.name("showBusinessSearch");
        o.E(((k9)object0).y, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "isOverdraftEnabled");
        Adapters.NullableBooleanAdapter.toJson(jsonWriter0, customScalarAdapters0, ((k9)object0).z);
    }
}

