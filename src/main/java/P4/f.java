package p4;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class f extends Enum {
    public final int X;
    public static final f[] Y;

    static {
        f.Y = new f[]{new f("LCS_GM_BUSINESS", 0, 1), new f("LCS_GM_GRAPHICS", 1, 2), new f("LCS_GM_IMAGES", 2, 4), new f("LCS_GM_ABS_COLORIMETRIC", 3, 8)};
    }

    public f(String s, int v, int v1) {
        super(s, v);
        this.X = v1;
    }

    @Override
    public final String toString() {
        switch(this.ordinal()) {
            case 0: {
                return "Graphic, Saturation";
            }
            case 1: {
                return "Proof, Relative Colorimetric";
            }
            case 2: {
                return "Picture, Perceptual";
            }
            case 3: {
                return "Match, Absolute Colorimetric";
            }
            default: {
                throw new IllegalStateException("Unimplemented rendering intent " + super.toString());
            }
        }
    }

    public static f valueOf(String s) {
        return (f)Enum.valueOf(f.class, s);
    }

    public static f[] values() {
        return (f[])f.Y.clone();
    }
}

