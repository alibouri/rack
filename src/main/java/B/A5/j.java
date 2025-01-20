package a5;

import java.util.HashMap;

public final class j {
    public static final j a;
    public static final HashMap b;

    static {
        j.a = new j();  // initializer: Ljava/lang/Object;-><init>()V
        j.b = new HashMap();
    }

    public static final void a(g g0, h h0) {
        Nb.j.f(h0, "feature");
        l.c(new i(g0, h0));
    }

    public static final boolean b(h h0) {
        h h1;
        Nb.j.f(h0, "feature");
        boolean z = false;
        if(h.Y == h0) {
            return false;
        }
        if(h.Z == h0) {
            return true;
        }
        String s = M4.l.a().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).getString("FBSDKFeature" + h0, null);
        if(s != null && s.equals("17.0.2")) {
            return false;
        }
        int v = h0.X;
        if((v & 0xFF) > 0) {
            h1 = N4.h.r(v & 0xFFFFFF00);
        }
        else if((0xFF00 & v) > 0) {
            h1 = N4.h.r(v & 0xFFFF0000);
        }
        else {
            h1 = (0xFF0000 & v) <= 0 ? N4.h.r(0) : N4.h.r(v & 0xFF000000);
        }
        if(h1 == h0) {
            switch(h0.ordinal()) {
                case 4: 
                case 5: 
                case 6: 
                case 7: 
                case 8: 
                case 9: 
                case 10: 
                case 11: 
                case 12: 
                case 13: 
                case 14: 
                case 15: 
                case 16: 
                case 17: 
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 0x20: 
                case 33: 
                case 34: {
                    break;
                }
                default: {
                    z = true;
                }
            }
            return l.b(("FBSDKFeature" + h0), M4.l.b(), z);
        }
        if(j.b(h1)) {
            switch(h0.ordinal()) {
                case 4: 
                case 5: 
                case 6: 
                case 7: 
                case 8: 
                case 9: 
                case 10: 
                case 11: 
                case 12: 
                case 13: 
                case 14: 
                case 15: 
                case 16: 
                case 17: 
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 0x20: 
                case 33: 
                case 34: {
                    return l.b(("FBSDKFeature" + h0), M4.l.b(), false);
                }
                default: {
                    return l.b(("FBSDKFeature" + h0), M4.l.b(), true);
                }
            }
        }
        return false;
    }
}

