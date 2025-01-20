package q9;

import Gb.b;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class l2 extends Enum {
    public static final l2[] X;

    static {
        l2[] arr_l2 = {new l2("AUTH", 0, "i"), new l2("ID", 1, "s")};
        l2.X = arr_l2;
        new b(arr_l2);
    }

    public l2(String s, int v, String s1) {
        super(s, v);
    }

    public static l2 valueOf(String s) {
        return (l2)Enum.valueOf(l2.class, s);
    }

    public static l2[] values() {
        return (l2[])l2.X.clone();
    }
}

