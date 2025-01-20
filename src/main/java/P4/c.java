package p4;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class c extends Enum {
    public final long X;
    public static final c[] Y;

    static {
        c.Y = new c[]{new c(0, 0L, "LCS_CALIBRATED_RGB"), new c(1, 1934772034L, "LCS_sRGB"), new c(2, 0x57696E20L, "LCS_WINDOWS_COLOR_SPACE"), new c(3, 0x4C494E4BL, "PROFILE_LINKED"), new c(4, 1296188740L, "PROFILE_EMBEDDED")};
    }

    public c(int v, long v1, String s) {
        super(s, v);
        this.X = v1;
    }

    @Override
    public final String toString() {
        switch(this.ordinal()) {
            case 0: {
                return "Calibrated RGB";
            }
            case 1: {
                return "sRGB Color Space";
            }
            case 2: {
                return "System Default Color Space, sRGB";
            }
            case 3: {
                return "Linked Profile";
            }
            case 4: {
                return "Embedded Profile";
            }
            default: {
                throw new IllegalStateException("Unimplemented color space type " + super.toString());
            }
        }
    }

    public static c valueOf(String s) {
        return (c)Enum.valueOf(c.class, s);
    }

    public static c[] values() {
        return (c[])c.Y.clone();
    }
}

