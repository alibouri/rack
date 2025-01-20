package p4;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class e extends Enum {
    public final int X;
    public static final e[] Y;

    static {
        e.Y = new e[]{new e("NONE", 0, 0), new e("ERROR_DIFFUSION", 1, 1), new e("PANDA", 2, 2), new e("SUPER_CIRCLE", 3, 3)};
    }

    public e(String s, int v, int v1) {
        super(s, v);
        this.X = v1;
    }

    @Override
    public final String toString() {
        switch(this.ordinal()) {
            case 0: {
                return "No Halftoning Algorithm";
            }
            case 1: {
                return "Error Diffusion Halftoning";
            }
            case 2: {
                return "Processing Algorithm for Noncoded Document Acquisition";
            }
            case 3: {
                return "Super-circle Halftoning";
            }
            default: {
                throw new IllegalStateException("Unimplemented rendering halftoning algorithm type " + super.toString());
            }
        }
    }

    public static e valueOf(String s) {
        return (e)Enum.valueOf(e.class, s);
    }

    public static e[] values() {
        return (e[])e.Y.clone();
    }
}

