package j6;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class f extends Enum {
    public final char X;
    public static final enum f Y;
    public static final enum f Z;
    public static final enum f b0;
    public static final enum f c0;
    public static final enum f d0;
    public static final enum f e0;
    public static final enum f f0;
    public static final enum f g0;
    public static final enum f h0;
    public static final f[] i0;

    static {
        f.Y = new f("UNSET", 0, '0');
        f.Z = new f("REMOTE_DEFAULT", 1, '1');
        f.b0 = new f("REMOTE_DELEGATION", 2, '2');
        f.c0 = new f("MANIFEST", 3, '3');
        f.d0 = new f("INITIALIZATION", 4, '4');
        f.e0 = new f("API", 5, '5');
        f f0 = new f("CHILD_ACCOUNT", 6, '6');
        f.f0 = new f("TCF", 7, '7');
        f.g0 = new f("REMOTE_ENFORCED_DEFAULT", 8, '8');
        f.h0 = new f("FAILSAFE", 9, '9');
        f.i0 = new f[]{f.Y, f.Z, f.b0, f.c0, f.d0, f.e0, f0, f.f0, f.g0, f.h0};
    }

    public f(String s, int v, char c) {
        super(s, v);
        this.X = c;
    }

    public static f[] values() {
        return (f[])f.i0.clone();
    }
}

