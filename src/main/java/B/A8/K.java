package a8;

import s7.f;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class k extends Enum implements f {
    public final int X;
    public static final enum k Y;
    public static final k[] Z;

    static {
        k k0 = new k("EVENT_TYPE_UNKNOWN", 0, 0);
        k.Y = new k("SESSION_START", 1, 1);
        k.Z = new k[]{k0, k.Y};
    }

    public k(String s, int v, int v1) {
        super(s, v);
        this.X = v1;
    }

    @Override  // s7.f
    public final int a() {
        return this.X;
    }

    public static k valueOf(String s) {
        return (k)Enum.valueOf(k.class, s);
    }

    public static k[] values() {
        return (k[])k.Z.clone();
    }
}

