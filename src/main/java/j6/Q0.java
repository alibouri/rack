package j6;

import android.os.Bundle;
import java.util.EnumMap;

public final class q0 {
    public final EnumMap a;
    public final int b;
    public static final q0 c;

    static {
        q0.c = new q0(100);
    }

    public q0(int v) {
        EnumMap enumMap0 = new EnumMap(p0.class);
        this.a = enumMap0;
        enumMap0.put(p0.Y, s0.Y);
        enumMap0.put(p0.Z, s0.Y);
        this.b = v;
    }

    public q0(EnumMap enumMap0, int v) {
        EnumMap enumMap1 = new EnumMap(p0.class);
        this.a = enumMap1;
        enumMap1.putAll(enumMap0);
        this.b = v;
    }

    public static char a(s0 s00) {
        if(s00 != null) {
            switch(s00.ordinal()) {
                case 1: {
                    return '+';
                }
                case 2: {
                    return '0';
                }
                case 3: {
                    return '1';
                }
                default: {
                    return '-';
                }
            }
        }
        return '-';
    }

    public static q0 b(int v, Bundle bundle0) {
        if(bundle0 == null) {
            return new q0(v);
        }
        EnumMap enumMap0 = new EnumMap(p0.class);
        p0[] arr_p0 = r0.Y.X;
        for(int v1 = 0; v1 < arr_p0.length; ++v1) {
            p0 p00 = arr_p0[v1];
            enumMap0.put(p00, q0.f(bundle0.getString(p00.X)));
        }
        return new q0(enumMap0, v);
    }

    public static q0 c(int v, String s) {
        EnumMap enumMap0 = new EnumMap(p0.class);
        if(s == null) {
            s = "";
        }
        r0 r00 = r0.Y;
        for(int v1 = 0; true; ++v1) {
            p0[] arr_p0 = r00.X;
            if(v1 >= arr_p0.length) {
                break;
            }
            p0 p00 = arr_p0[v1];
            if(v1 + 2 < s.length()) {
                enumMap0.put(p00, q0.e(s.charAt(v1 + 2)));
            }
            else {
                enumMap0.put(p00, s0.Y);
            }
        }
        return new q0(enumMap0, v);
    }

    public final q0 d(q0 q00) {
        EnumMap enumMap0 = new EnumMap(p0.class);
        p0[] arr_p0 = r0.Y.X;
        for(int v = 0; v < arr_p0.length; ++v) {
            p0 p00 = arr_p0[v];
            s0 s00 = (s0)this.a.get(p00);
            s0 s01 = (s0)q00.a.get(p00);
            if(s00 == null) {
                s00 = s01;
            }
            else if(s01 != null) {
                s0 s02 = s0.Y;
                if(s00 == s02) {
                    s00 = s01;
                }
                else if(s01 != s02) {
                    s0 s03 = s0.Z;
                    if(s00 == s03) {
                        s00 = s01;
                    }
                    else if(s01 != s03) {
                        s00 = s00 == s0.b0 || s01 == s0.b0 ? s0.b0 : s0.c0;
                    }
                }
            }
            if(s00 != null) {
                enumMap0.put(p00, s00);
            }
        }
        return new q0(enumMap0, 100);
    }

    public static s0 e(char c) {
        switch(c) {
            case 43: {
                return s0.Z;
            }
            case 0x30: {
                return s0.b0;
            }
            case 49: {
                return s0.c0;
            }
            default: {
                return s0.Y;
            }
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof q0)) {
            return false;
        }
        p0[] arr_p0 = r0.Y.X;
        for(int v = 0; v < arr_p0.length; ++v) {
            p0 p00 = arr_p0[v];
            if(this.a.get(p00) != ((q0)object0).a.get(p00)) {
                return false;
            }
        }
        return this.b == ((q0)object0).b;
    }

    public static s0 f(String s) {
        s0 s00 = s0.Y;
        if(s == null) {
            return s00;
        }
        if(s.equals("granted")) {
            return s0.c0;
        }
        return s.equals("denied") ? s0.b0 : s00;
    }

    public static String g(int v) {
        switch(v) {
            case -30: {
                return "TCF";
            }
            case -20: {
                return "API";
            }
            case -10: {
                return "MANIFEST";
            }
            case 0: {
                return "1P_API";
            }
            case 30: {
                return "1P_INIT";
            }
            case 90: {
                return "REMOTE_CONFIG";
            }
            case 100: {
                return "UNKNOWN";
            }
            default: {
                return "OTHER";
            }
        }
    }

    // Deobfuscation rating: LOW(30)
    public static boolean h(int v, int v1) {
        return v == -20 && v1 == -30 || v == -30 && v1 == -20 || v == v1 || v < v1;
    }

    @Override
    public final int hashCode() {
        int v = this.b * 17;
        for(Object object0: this.a.values()) {
            v = v * 0x1F + ((s0)object0).hashCode();
        }
        return v;
    }

    public final boolean i(p0 p00) {
        return ((s0)this.a.get(p00)) != s0.b0;
    }

    public final q0 j(q0 q00) {
        EnumMap enumMap0 = new EnumMap(p0.class);
        p0[] arr_p0 = r0.Y.X;
        for(int v = 0; v < arr_p0.length; ++v) {
            p0 p00 = arr_p0[v];
            s0 s00 = (s0)this.a.get(p00);
            if(s00 == s0.Y) {
                s00 = (s0)q00.a.get(p00);
            }
            if(s00 != null) {
                enumMap0.put(p00, s00);
            }
        }
        return new q0(enumMap0, this.b);
    }

    public final boolean k(q0 q00, p0[] arr_p0) {
        for(int v = 0; v < arr_p0.length; ++v) {
            p0 p00 = arr_p0[v];
            s0 s00 = (s0)this.a.get(p00);
            s0 s01 = (s0)q00.a.get(p00);
            if(s00 == s0.b0 && s01 != s0.b0) {
                return true;
            }
        }
        return false;
    }

    public final String l() {
        StringBuilder stringBuilder0 = new StringBuilder("G1");
        p0[] arr_p0 = r0.Y.X;
        for(int v = 0; v < arr_p0.length; ++v) {
            s0 s00 = (s0)this.a.get(arr_p0[v]);
            int v1 = 45;
            if(s00 != null) {
                switch(s00.ordinal()) {
                    case 2: {
                        v1 = 0x30;
                        break;
                    }
                    case 1: 
                    case 3: {
                        v1 = 49;
                    }
                }
            }
            stringBuilder0.append(((char)v1));
        }
        return stringBuilder0.toString();
    }

    public final String m() {
        StringBuilder stringBuilder0 = new StringBuilder("G1");
        p0[] arr_p0 = r0.Y.X;
        for(int v = 0; v < arr_p0.length; ++v) {
            stringBuilder0.append(q0.a(((s0)this.a.get(arr_p0[v]))));
        }
        return stringBuilder0.toString();
    }

    public final boolean n() {
        return this.i(p0.Z);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("source=");
        stringBuilder0.append(q0.g(this.b));
        p0[] arr_p0 = r0.Y.X;
        for(int v = 0; v < arr_p0.length; ++v) {
            p0 p00 = arr_p0[v];
            stringBuilder0.append(",");
            stringBuilder0.append(p00.X);
            stringBuilder0.append("=");
            s0 s00 = (s0)this.a.get(p00);
            if(s00 == null) {
                s00 = s0.Y;
            }
            stringBuilder0.append(s00);
        }
        return stringBuilder0.toString();
    }
}

