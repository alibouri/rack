package a8;

import s7.f;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class r extends Enum implements f {
    public final int X;
    public static final enum r Y;
    public static final r[] Z;

    static {
        r r0 = new r("LOG_ENVIRONMENT_UNKNOWN", 0, 0);
        r r1 = new r("LOG_ENVIRONMENT_AUTOPUSH", 1, 1);
        r r2 = new r("LOG_ENVIRONMENT_STAGING", 2, 2);
        r.Y = new r("LOG_ENVIRONMENT_PROD", 3, 3);
        r.Z = new r[]{r0, r1, r2, r.Y};
    }

    public r(String s, int v, int v1) {
        super(s, v);
        this.X = v1;
    }

    @Override  // s7.f
    public final int a() {
        return this.X;
    }

    public static r valueOf(String s) {
        return (r)Enum.valueOf(r.class, s);
    }

    public static r[] values() {
        return (r[])r.Z.clone();
    }
}

