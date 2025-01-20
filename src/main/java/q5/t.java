package q5;

import android.util.SparseArray;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class t extends Enum {
    public static final SparseArray X;
    public static final t[] Y;

    static {
        t t0 = new t("UNKNOWN_MOBILE_SUBTYPE", 0);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        t t1 = new t("GPRS", 1);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        t t2 = new t("EDGE", 2);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        t t3 = new t("UMTS", 3);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        t t4 = new t("CDMA", 4);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        t t5 = new t("EVDO_0", 5);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        t t6 = new t("EVDO_A", 6);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        t t7 = new t("RTT", 7);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        t t8 = new t("HSDPA", 8);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        t t9 = new t("HSUPA", 9);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        t t10 = new t("HSPA", 10);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        t t11 = new t("IDEN", 11);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        t t12 = new t("EVDO_B", 12);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        t t13 = new t("LTE", 13);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        t t14 = new t("EHRPD", 14);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        t t15 = new t("HSPAP", 15);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        t t16 = new t("GSM", 16);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        t t17 = new t("TD_SCDMA", 17);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        t t18 = new t("IWLAN", 18);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        t t19 = new t("LTE_CA", 19);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        t.Y = new t[]{t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, new t("COMBINED", 20)};  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        SparseArray sparseArray0 = new SparseArray();
        t.X = sparseArray0;
        sparseArray0.put(0, t0);
        sparseArray0.put(1, t1);
        sparseArray0.put(2, t2);
        sparseArray0.put(3, t3);
        sparseArray0.put(4, t4);
        sparseArray0.put(5, t5);
        sparseArray0.put(6, t6);
        sparseArray0.put(7, t7);
        sparseArray0.put(8, t8);
        sparseArray0.put(9, t9);
        sparseArray0.put(10, t10);
        sparseArray0.put(11, t11);
        sparseArray0.put(12, t12);
        sparseArray0.put(13, t13);
        sparseArray0.put(14, t14);
        sparseArray0.put(15, t15);
        sparseArray0.put(16, t16);
        sparseArray0.put(17, t17);
        sparseArray0.put(18, t18);
        sparseArray0.put(19, t19);
    }

    public static t valueOf(String s) {
        return (t)Enum.valueOf(t.class, s);
    }

    public static t[] values() {
        return (t[])t.Y.clone();
    }
}

