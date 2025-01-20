package u9;

import Gb.b;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class m extends Enum {
    public static final enum m X;
    public static final enum m Y;
    public static final enum m Z;
    public static final m[] b0;

    static {
        m.X = new m("NONE", 0);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        m m0 = new m("ELASTIC", 1);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        m.Y = new m("FADE", 2);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        m.Z = new m("CIRCULAR", 3);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        m[] arr_m = {m.X, m0, m.Y, m.Z, new m("OVERSHOOT", 4)};  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        m.b0 = arr_m;
        new b(arr_m);
    }

    public static m valueOf(String s) {
        return (m)Enum.valueOf(m.class, s);
    }

    public static m[] values() {
        return (m[])m.b0.clone();
    }
}

