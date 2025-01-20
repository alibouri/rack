package q9;

import Gb.b;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class m2 extends Enum {
    public static final m2[] X;

    static {
        m2[] arr_m2 = {new m2("PERSONAL", 0, "p"), new m2("CREDIT", 1, "c"), new m2("BUSINESS", 2, "b")};
        m2.X = arr_m2;
        new b(arr_m2);
    }

    public m2(String s, int v, String s1) {
        super(s, v);
    }

    public static m2 valueOf(String s) {
        return (m2)Enum.valueOf(m2.class, s);
    }

    public static m2[] values() {
        return (m2[])m2.X.clone();
    }
}

