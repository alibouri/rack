package r8;

import java.util.List;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class c extends Enum {
    public final Class X;
    public static final enum c Y;
    public static final enum c Z;
    public static final enum c b0;
    public static final enum c c0;
    public static final enum c d0;
    public static final enum c e0;
    public static final enum c f0;
    public static final enum c g0;
    public static final enum c h0;
    public static final enum c i0;
    public static final c[] j0;

    static {
        c c0 = new c(0, Object.class, "OTHER");
        c.Y = new c(1, Void.class, "PURE_BARCODE");
        c.Z = new c(2, List.class, "POSSIBLE_FORMATS");
        c.b0 = new c(3, Void.class, "TRY_HARDER");
        c.c0 = new c(4, String.class, "CHARACTER_SET");
        c.d0 = new c(5, int[].class, "ALLOWED_LENGTHS");
        c.e0 = new c(6, Void.class, "ASSUME_CODE_39_CHECK_DIGIT");
        c.f0 = new c(7, Void.class, "ASSUME_GS1");
        c.g0 = new c(8, Void.class, "RETURN_CODABAR_START_END");
        c.h0 = new c(9, p.class, "NEED_RESULT_POINT_CALLBACK");
        c.i0 = new c(10, int[].class, "ALLOWED_EAN_EXTENSIONS");
        c.j0 = new c[]{c0, c.Y, c.Z, c.b0, c.c0, c.d0, c.e0, c.f0, c.g0, c.h0, c.i0};
    }

    public c(int v, Class class0, String s) {
        super(s, v);
        this.X = class0;
    }

    public static c valueOf(String s) {
        return (c)Enum.valueOf(c.class, s);
    }

    public static c[] values() {
        return (c[])c.j0.clone();
    }
}

