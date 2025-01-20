package a8;

import s7.f;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class i extends Enum implements f {
    public final int X;
    public static final enum i Y;
    public static final i[] Z;

    static {
        i i0 = new i("COLLECTION_UNKNOWN", 0, 0);
        i.Y = new i("COLLECTION_SDK_NOT_INSTALLED", 1, 1);
        i.Z = new i[]{i0, i.Y, new i("COLLECTION_ENABLED", 2, 2), new i("COLLECTION_DISABLED", 3, 3), new i("COLLECTION_DISABLED_REMOTE", 4, 4), new i("COLLECTION_SAMPLED", 5, 5)};
    }

    public i(String s, int v, int v1) {
        super(s, v);
        this.X = v1;
    }

    @Override  // s7.f
    public final int a() {
        return this.X;
    }

    public static i valueOf(String s) {
        return (i)Enum.valueOf(i.class, s);
    }

    public static i[] values() {
        return (i[])i.Z.clone();
    }
}

