package q5;

import android.util.SparseArray;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class w extends Enum {
    public static final enum w X;
    public static final w[] Y;

    static {
        w.X = new w("DEFAULT", 0);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        w w0 = new w("UNMETERED_ONLY", 1);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        w w1 = new w("UNMETERED_OR_DAILY", 2);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        w w2 = new w("FAST_IF_RADIO_AWAKE", 3);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        w w3 = new w("NEVER", 4);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        w w4 = new w("UNRECOGNIZED", 5);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        w.Y = new w[]{w.X, w0, w1, w2, w3, w4};
        SparseArray sparseArray0 = new SparseArray();
        sparseArray0.put(0, w.X);
        sparseArray0.put(1, w0);
        sparseArray0.put(2, w1);
        sparseArray0.put(3, w2);
        sparseArray0.put(4, w3);
        sparseArray0.put(-1, w4);
    }

    public static w valueOf(String s) {
        return (w)Enum.valueOf(w.class, s);
    }

    public static w[] values() {
        return (w[])w.Y.clone();
    }
}

