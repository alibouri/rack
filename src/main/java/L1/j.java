package l1;

import java.util.HashMap;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class j extends Enum {
    public static final HashMap X;
    public static final j[] Y;

    static {
        j j0 = new j("NONE", 0);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        j j1 = new j("CHAIN", 1);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        j j2 = new j("ALIGNED", 2);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        j.Y = new j[]{j0, j1, j2};
        HashMap hashMap0 = new HashMap();
        HashMap hashMap1 = new HashMap();
        j.X = hashMap1;
        hashMap0.put("none", j0);
        hashMap0.put("chain", j1);
        hashMap0.put("aligned", j2);
        hashMap1.put("none", 0);
        hashMap1.put("chain", 3);
        hashMap1.put("aligned", 2);
    }

    public static j valueOf(String s) {
        return (j)Enum.valueOf(j.class, s);
    }

    public static j[] values() {
        return (j[])j.Y.clone();
    }
}

