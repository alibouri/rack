package a3;

import Gb.b;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class l extends Enum {
    public static final enum l X;
    public static final l[] Y;

    static {
        l l0 = new l("IGNORE", 0);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        l.X = new l("RESPECT_PERFORMANCE", 1);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        l[] arr_l = {l0, l.X, new l("RESPECT_ALL", 2)};  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        l.Y = arr_l;
        new b(arr_l);
    }

    public static l valueOf(String s) {
        return (l)Enum.valueOf(l.class, s);
    }

    public static l[] values() {
        return (l[])l.Y.clone();
    }
}

