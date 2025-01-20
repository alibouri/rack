package p4;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class a extends Enum {
    public final int X;
    public static final a[] Y;

    static {
        a.Y = new a[]{new a("BITMAP", 0, 0x4D42), new a("OS2_BITMAP_ARRAY", 1, 16706), new a("OS2_ICON", 2, 0x4349), new a("OS2_COLOR_ICON", 3, 0x4943), new a("OS2_COLOR_POINTER", 4, 0x5043), new a("OS2_POINTER", 5, 0x5450)};
    }

    public a(String s, int v, int v1) {
        super(s, v);
        this.X = v1;
    }

    @Override
    public final String toString() {
        switch(this.ordinal()) {
            case 0: {
                return "Standard";
            }
            case 1: {
                return "Bitmap Array";
            }
            case 2: {
                return "Monochrome Icon";
            }
            case 3: {
                return "Color Icon";
            }
            case 4: {
                return "Color Pointer";
            }
            case 5: {
                return "Monochrome Pointer";
            }
            default: {
                throw new IllegalStateException("Unimplemented bitmap type " + super.toString());
            }
        }
    }

    public static a valueOf(String s) {
        return (a)Enum.valueOf(a.class, s);
    }

    public static a[] values() {
        return (a[])a.Y.clone();
    }
}

