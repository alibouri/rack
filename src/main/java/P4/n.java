package P4;

import Nb.j;
import java.util.Arrays;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class n extends Enum {
    public final String X;
    public static final enum n Y;
    public static final enum n Z;
    public static final enum n b0;
    public static final enum n c0;
    public static final enum n d0;
    public static final enum n e0;
    public static final enum n f0;
    public static final enum n g0;
    public static final enum n h0;
    public static final enum n i0;
    public static final enum n j0;
    public static final enum n k0;
    public static final enum n l0;
    public static final enum n m0;
    public static final enum n n0;
    public static final enum n o0;
    public static final n[] p0;

    static {
        n.Y = new n("ANON_ID", 0, "anon_id");
        n.Z = new n("FB_LOGIN_ID", 1, "fb_login_id");
        n.b0 = new n("MAD_ID", 2, "madid");
        n.c0 = new n("PAGE_ID", 3, "page_id");
        n.d0 = new n("PAGE_SCOPED_USER_ID", 4, "page_scoped_user_id");
        n n0 = new n("USER_DATA", 5, "ud");
        n.e0 = new n("ADV_TE", 6, "advertiser_tracking_enabled");
        n.f0 = new n("APP_TE", 7, "application_tracking_enabled");
        n.g0 = new n("CONSIDER_VIEWS", 8, "consider_views");
        n.h0 = new n("DEVICE_TOKEN", 9, "device_token");
        n.i0 = new n("EXT_INFO", 10, "extInfo");
        n.j0 = new n("INCLUDE_DWELL_DATA", 11, "include_dwell_data");
        n.k0 = new n("INCLUDE_VIDEO_DATA", 12, "include_video_data");
        n.l0 = new n("INSTALL_REFERRER", 13, "install_referrer");
        n.m0 = new n("INSTALLER_PACKAGE", 14, "installer_package");
        n.n0 = new n("RECEIPT_DATA", 15, "receipt_data");
        n.o0 = new n("URL_SCHEMES", 16, "url_schemes");
        n.p0 = new n[]{n.Y, n.Z, n.b0, n.c0, n.d0, n0, n.e0, n.f0, n.g0, n.h0, n.i0, n.j0, n.k0, n.l0, n.m0, n.n0, n.o0};
    }

    public n(String s, int v, String s1) {
        super(s, v);
        this.X = s1;
    }

    public static n valueOf(String s) {
        j.f(s, "value");
        return (n)Enum.valueOf(n.class, s);
    }

    public static n[] values() {
        return (n[])Arrays.copyOf(n.p0, 17);
    }
}

