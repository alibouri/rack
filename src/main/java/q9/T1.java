package q9;

import Gb.b;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class t1 extends Enum {
    public final String X;
    public final boolean Y;
    public static final enum t1 Z;
    public static final enum t1 b0;
    public static final enum t1 c0;
    public static final enum t1 d0;
    public static final enum t1 e0;
    public static final enum t1 f0;
    public static final enum t1 g0;
    public static final enum t1 h0;
    public static final enum t1 i0;
    public static final enum t1 j0;
    public static final enum t1 k0;
    public static final t1[] l0;
    public static final b m0;

    static {
        t1 t10 = new t1(0, "ANNOUNCEMENTS", "Announcements", true);
        t1 t11 = new t1(1, "AGENT_HISTORY_SCREEN_OVERDRAFT_POPUPS", "AgentHistoryScreenOverdraftPopups", true);
        t1 t12 = new t1(2, "AGENT_OVERDRAFT_SCREEN_BANNERS", "AgentOverdraftScreenBanners", true);
        t1 t13 = new t1(3, "DEVICE", "DEVICE_UUID", true);
        t1 t14 = new t1(4, "HIDDEN_HISTORY_ITEMS", "HiddenHistoryItems", true);
        t1 t15 = new t1(5, "BALANCE_VISIBLE", "BalanceVisible", true);
        t1.Z = new t1(6, "BIOMETRIC_ENROLLED", "BiometricEnrolled", true);
        t1.b0 = new t1(7, "PERSONAL_HOME_NAV_BAR_CONFIG", "PersonalHomeNavBarConfig", false);
        t1.c0 = new t1(8, "NEW_TERMS_AND_CONDITIONS", "NewTermsAndConditions", false);
        t1 t16 = new t1(9, "MERCHANT_EVENTS", "MerchantEvents", false);
        t1 t17 = new t1(10, "CUSTOMER_APP_VERSION", "CustomerAppVersion", true);
        t1.d0 = new t1(11, "LOGIN", "DBLogin", false);
        t1 t18 = new t1(12, "NETWORKING", "Networking", true);
        t1.e0 = new t1(13, "PHOTO", "licensePhoto", false);
        t1 t19 = new t1(14, "PIN", "PinStore", true);
        t1 t110 = new t1(15, "QR", "qrScan", true);
        t1 t111 = new t1(16, "RAPID_SCAN", "rapidScan", false);
        t1 t112 = new t1(17, "SENT", "Sent", true);
        t1 t113 = new t1(18, "TIME_OFFSET", "TIME_OFFSET", true);
        t1 t114 = new t1(19, "EVENTS", "Events", true);
        t1.f0 = new t1(20, "SCRATCH_CARDS", "ScratchCards", false);
        t1 t115 = new t1(21, "LINKED_ACCOUNT_TRANSFER", "LinkedAccountTransfer", true);
        t1 t116 = new t1(22, "AMPLITUDE_USER_PROPS", "AmplitudeUserProps", true);
        t1.g0 = new t1(23, "LOCK_SCREEN", "LockScreen", false);
        t1 t117 = new t1(24, "LAST_REVIEW_DATE", "LastReviewDate", true);
        t1 t118 = new t1(25, "CONTACT_LIST_FINGERPRINT", "ContactListFingerprint", true);
        t1 t119 = new t1(26, "CONTACTS_WAVE_INFO", "ContactsWaveInfo", false);
        t1.h0 = new t1(27, "DEVICE_APPROVAL", "DeviceApproval", false);
        t1.i0 = new t1(28, "TRANSACTION_HISTORY_SYNC_STATE", "TransactionHistorySyncState", false);
        t1.j0 = new t1(29, "SHOW_USER_CAN_REVERSE_TX_ANNOUNCEMENT", "ShowUserCanReverseTxAnnouncement", false);
        t1 t120 = new t1(30, "TIMES_USER_SEEN_REVERSE_TX_ANNOUNCEMENT", "TimesUserSeenReverseTxAnnouncement", true);
        t1 t121 = new t1(0x1F, "CRASH_LOOP_DETECTOR", "CrashLoopDetector", true);
        t1 t122 = new t1(0x20, "BOTTOM_SHEET_ANNOUNCEMENTS", "BottomSheetAnnouncements", true);
        t1.k0 = new t1(33, "APP_PREFS", "AppPrefs", true);
        t1[] arr_t1 = {t10, t11, t12, t13, t14, t15, t1.Z, t1.b0, t1.c0, t16, t17, t1.d0, t18, t1.e0, t19, t110, t111, t112, t113, t114, t1.f0, t115, t116, t1.g0, t117, t118, t119, t1.h0, t1.i0, t1.j0, t120, t121, t122, t1.k0, new t1(34, "FIELD_USER_PREFS", "FieldUserPrefs", false)};
        t1.l0 = arr_t1;
        t1.m0 = new b(arr_t1);
    }

    public t1(int v, String s, String s1, boolean z) {
        super(s, v);
        this.X = s1;
        this.Y = z;
    }

    public static t1 valueOf(String s) {
        return (t1)Enum.valueOf(t1.class, s);
    }

    public static t1[] values() {
        return (t1[])t1.l0.clone();
    }
}

