package X8;

import Gb.b;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class h extends Enum {
    public static final enum h X;
    public static final enum h Y;
    public static final enum h Z;
    public static final enum h b0;
    public static final h[] c0;

    static {
        h.X = new h("QR_SCAN", 0);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        h h0 = new h("PASTED", 1);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        h.Y = new h("TYPED", 2);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        h.Z = new h("CONTACT_LIST", 3);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        h h1 = new h("FAVORITE_LIST", 4);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        h.b0 = new h("DEEP_LINK", 5);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        h[] arr_h = {h.X, h0, h.Y, h.Z, h1, h.b0};
        h.c0 = arr_h;
        new b(arr_h);
    }

    public static h valueOf(String s) {
        return (h)Enum.valueOf(h.class, s);
    }

    public static h[] values() {
        return (h[])h.c0.clone();
    }
}

