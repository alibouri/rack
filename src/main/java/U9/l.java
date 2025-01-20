package u9;

import Gb.b;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class l extends Enum {
    public static final enum l X;
    public static final enum l Y;
    public static final l[] Z;

    static {
        l l0 = new l("START", 0);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        l.X = new l("END", 1);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        l l1 = new l("TOP", 2);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        l.Y = new l("BOTTOM", 3);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        l[] arr_l = {l0, l.X, l1, l.Y};
        l.Z = arr_l;
        new b(arr_l);
    }

    public static l valueOf(String s) {
        return (l)Enum.valueOf(l.class, s);
    }

    public static l[] values() {
        return (l[])l.Z.clone();
    }
}

