package M4;

import Nb.j;
import java.util.Arrays;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class f extends Enum {
    public final boolean X;
    public static final enum f Y;
    public static final enum f Z;
    public static final enum f b0;
    public static final enum f c0;
    public static final f[] d0;

    static {
        f f0 = new f("NONE", false, 0);
        f.Y = new f("FACEBOOK_APPLICATION_WEB", true, 1);
        f f1 = new f("FACEBOOK_APPLICATION_NATIVE", true, 2);
        f f2 = new f("FACEBOOK_APPLICATION_SERVICE", true, 3);
        f f3 = new f("WEB_VIEW", true, 4);
        f f4 = new f("CHROME_CUSTOM_TAB", true, 5);
        f f5 = new f("TEST_USER", true, 6);
        f f6 = new f("CLIENT_TOKEN", true, 7);
        f f7 = new f("DEVICE_AUTH", true, 8);
        f.Z = new f("INSTAGRAM_APPLICATION_WEB", true, 9);
        f.b0 = new f("INSTAGRAM_CUSTOM_CHROME_TAB", true, 10);
        f.c0 = new f("INSTAGRAM_WEB_VIEW", true, 11);
        f.d0 = new f[]{f0, f.Y, f1, f2, f3, f4, f5, f6, f7, f.Z, f.b0, f.c0};
    }

    public f(String s, boolean z, int v) {
        super(s, v);
        this.X = z;
    }

    public static f valueOf(String s) {
        j.f(s, "value");
        return (f)Enum.valueOf(f.class, s);
    }

    public static f[] values() {
        return (f[])Arrays.copyOf(f.d0, 12);
    }
}

